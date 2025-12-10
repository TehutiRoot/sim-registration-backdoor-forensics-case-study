package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.operators.OperatorBufferWithSize */
/* loaded from: classes7.dex */
public final class OperatorBufferWithSize<T> implements Observable.Operator<List<T>, T> {

    /* renamed from: a */
    public final int f78432a;

    /* renamed from: b */
    public final int f78433b;

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap */
    /* loaded from: classes7.dex */
    public static final class BufferOverlap extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78434a;

        /* renamed from: b */
        public final int f78435b;

        /* renamed from: c */
        public final int f78436c;

        /* renamed from: d */
        public long f78437d;

        /* renamed from: e */
        public final ArrayDeque f78438e = new ArrayDeque();

        /* renamed from: f */
        public final AtomicLong f78439f = new AtomicLong();

        /* renamed from: g */
        public long f78440g;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap$BufferOverlapProducer */
        /* loaded from: classes7.dex */
        public final class BufferOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (BackpressureUtils.postCompleteRequest(bufferOverlap.f78439f, j, bufferOverlap.f78438e, bufferOverlap.f78434a) && j != 0) {
                    if (get() || !compareAndSet(false, true)) {
                        bufferOverlap.request(BackpressureUtils.multiplyCap(bufferOverlap.f78436c, j));
                    } else {
                        bufferOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bufferOverlap.f78436c, j - 1), bufferOverlap.f78435b));
                    }
                }
            }
        }

        public BufferOverlap(Subscriber subscriber, int i, int i2) {
            this.f78434a = subscriber;
            this.f78435b = i;
            this.f78436c = i2;
            request(0L);
        }

        /* renamed from: d */
        public Producer m23272d() {
            return new BufferOverlapProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            long j = this.f78440g;
            if (j != 0) {
                if (j > this.f78439f.get()) {
                    Subscriber subscriber = this.f78434a;
                    subscriber.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f78439f.addAndGet(-j);
            }
            BackpressureUtils.postCompleteDone(this.f78439f, this.f78438e, this.f78434a);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78438e.clear();
            this.f78434a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78437d;
            if (j == 0) {
                this.f78438e.offer(new ArrayList(this.f78435b));
            }
            long j2 = j + 1;
            if (j2 == this.f78436c) {
                this.f78437d = 0L;
            } else {
                this.f78437d = j2;
            }
            Iterator it = this.f78438e.iterator();
            while (it.hasNext()) {
                ((List) it.next()).add(obj);
            }
            List list = (List) this.f78438e.peek();
            if (list != null && list.size() == this.f78435b) {
                this.f78438e.poll();
                this.f78440g++;
                this.f78434a.onNext(list);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferSkip */
    /* loaded from: classes7.dex */
    public static final class BufferSkip extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78441a;

        /* renamed from: b */
        public final int f78442b;

        /* renamed from: c */
        public final int f78443c;

        /* renamed from: d */
        public long f78444d;

        /* renamed from: e */
        public List f78445e;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferSkip$BufferSkipProducer */
        /* loaded from: classes7.dex */
        public final class BufferSkipProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            public BufferSkipProducer() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        BufferSkip bufferSkip = BufferSkip.this;
                        if (get() || !compareAndSet(false, true)) {
                            bufferSkip.request(BackpressureUtils.multiplyCap(j, bufferSkip.f78443c));
                            return;
                        } else {
                            bufferSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, bufferSkip.f78442b), BackpressureUtils.multiplyCap(bufferSkip.f78443c - bufferSkip.f78442b, j - 1)));
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public BufferSkip(Subscriber subscriber, int i, int i2) {
            this.f78441a = subscriber;
            this.f78442b = i;
            this.f78443c = i2;
            request(0L);
        }

        /* renamed from: d */
        public Producer m23269d() {
            return new BufferSkipProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            List list = this.f78445e;
            if (list != null) {
                this.f78445e = null;
                this.f78441a.onNext(list);
            }
            this.f78441a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78445e = null;
            this.f78441a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78444d;
            List list = this.f78445e;
            if (j == 0) {
                list = new ArrayList(this.f78442b);
                this.f78445e = list;
            }
            long j2 = j + 1;
            if (j2 == this.f78443c) {
                this.f78444d = 0L;
            } else {
                this.f78444d = j2;
            }
            if (list != null) {
                list.add(obj);
                if (list.size() == this.f78442b) {
                    this.f78445e = null;
                    this.f78441a.onNext(list);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$a */
    /* loaded from: classes7.dex */
    public static final class C13535a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78446a;

        /* renamed from: b */
        public final int f78447b;

        /* renamed from: c */
        public List f78448c;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$a$a */
        /* loaded from: classes7.dex */
        public class C13536a implements Producer {
            public C13536a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        C13535a.this.request(BackpressureUtils.multiplyCap(j, C13535a.this.f78447b));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }

        public C13535a(Subscriber subscriber, int i) {
            this.f78446a = subscriber;
            this.f78447b = i;
            request(0L);
        }

        /* renamed from: c */
        public Producer m23267c() {
            return new C13536a();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            List list = this.f78448c;
            if (list != null) {
                this.f78446a.onNext(list);
            }
            this.f78446a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78448c = null;
            this.f78446a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            List list = this.f78448c;
            if (list == null) {
                list = new ArrayList(this.f78447b);
                this.f78448c = list;
            }
            list.add(obj);
            if (list.size() == this.f78447b) {
                this.f78448c = null;
                this.f78446a.onNext(list);
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.f78432a = i;
                this.f78433b = i2;
                return;
            }
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        throw new IllegalArgumentException("count must be greater than 0");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        int i = this.f78433b;
        int i2 = this.f78432a;
        if (i == i2) {
            C13535a c13535a = new C13535a(subscriber, i2);
            subscriber.add(c13535a);
            subscriber.setProducer(c13535a.m23267c());
            return c13535a;
        } else if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(subscriber, i2, i);
            subscriber.add(bufferSkip);
            subscriber.setProducer(bufferSkip.m23269d());
            return bufferSkip;
        } else {
            BufferOverlap bufferOverlap = new BufferOverlap(subscriber, i2, i);
            subscriber.add(bufferOverlap);
            subscriber.setProducer(bufferOverlap.m23272d());
            return bufferOverlap;
        }
    }
}