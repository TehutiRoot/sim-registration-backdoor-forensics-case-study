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
    public final int f78226a;

    /* renamed from: b */
    public final int f78227b;

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap */
    /* loaded from: classes7.dex */
    public static final class BufferOverlap extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78228a;

        /* renamed from: b */
        public final int f78229b;

        /* renamed from: c */
        public final int f78230c;

        /* renamed from: d */
        public long f78231d;

        /* renamed from: e */
        public final ArrayDeque f78232e = new ArrayDeque();

        /* renamed from: f */
        public final AtomicLong f78233f = new AtomicLong();

        /* renamed from: g */
        public long f78234g;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap$BufferOverlapProducer */
        /* loaded from: classes7.dex */
        public final class BufferOverlapProducer extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (BackpressureUtils.postCompleteRequest(bufferOverlap.f78233f, j, bufferOverlap.f78232e, bufferOverlap.f78228a) && j != 0) {
                    if (get() || !compareAndSet(false, true)) {
                        bufferOverlap.request(BackpressureUtils.multiplyCap(bufferOverlap.f78230c, j));
                    } else {
                        bufferOverlap.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bufferOverlap.f78230c, j - 1), bufferOverlap.f78229b));
                    }
                }
            }
        }

        public BufferOverlap(Subscriber subscriber, int i, int i2) {
            this.f78228a = subscriber;
            this.f78229b = i;
            this.f78230c = i2;
            request(0L);
        }

        /* renamed from: d */
        public Producer m23084d() {
            return new BufferOverlapProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            long j = this.f78234g;
            if (j != 0) {
                if (j > this.f78233f.get()) {
                    Subscriber subscriber = this.f78228a;
                    subscriber.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f78233f.addAndGet(-j);
            }
            BackpressureUtils.postCompleteDone(this.f78233f, this.f78232e, this.f78228a);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78232e.clear();
            this.f78228a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78231d;
            if (j == 0) {
                this.f78232e.offer(new ArrayList(this.f78229b));
            }
            long j2 = j + 1;
            if (j2 == this.f78230c) {
                this.f78231d = 0L;
            } else {
                this.f78231d = j2;
            }
            Iterator it = this.f78232e.iterator();
            while (it.hasNext()) {
                ((List) it.next()).add(obj);
            }
            List list = (List) this.f78232e.peek();
            if (list != null && list.size() == this.f78229b) {
                this.f78232e.poll();
                this.f78234g++;
                this.f78228a.onNext(list);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferSkip */
    /* loaded from: classes7.dex */
    public static final class BufferSkip extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78235a;

        /* renamed from: b */
        public final int f78236b;

        /* renamed from: c */
        public final int f78237c;

        /* renamed from: d */
        public long f78238d;

        /* renamed from: e */
        public List f78239e;

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
                            bufferSkip.request(BackpressureUtils.multiplyCap(j, bufferSkip.f78237c));
                            return;
                        } else {
                            bufferSkip.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, bufferSkip.f78236b), BackpressureUtils.multiplyCap(bufferSkip.f78237c - bufferSkip.f78236b, j - 1)));
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public BufferSkip(Subscriber subscriber, int i, int i2) {
            this.f78235a = subscriber;
            this.f78236b = i;
            this.f78237c = i2;
            request(0L);
        }

        /* renamed from: d */
        public Producer m23081d() {
            return new BufferSkipProducer();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            List list = this.f78239e;
            if (list != null) {
                this.f78239e = null;
                this.f78235a.onNext(list);
            }
            this.f78235a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78239e = null;
            this.f78235a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            long j = this.f78238d;
            List list = this.f78239e;
            if (j == 0) {
                list = new ArrayList(this.f78236b);
                this.f78239e = list;
            }
            long j2 = j + 1;
            if (j2 == this.f78237c) {
                this.f78238d = 0L;
            } else {
                this.f78238d = j2;
            }
            if (list != null) {
                list.add(obj);
                if (list.size() == this.f78236b) {
                    this.f78239e = null;
                    this.f78235a.onNext(list);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$a */
    /* loaded from: classes7.dex */
    public static final class C13534a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78240a;

        /* renamed from: b */
        public final int f78241b;

        /* renamed from: c */
        public List f78242c;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$a$a */
        /* loaded from: classes7.dex */
        public class C13535a implements Producer {
            public C13535a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i >= 0) {
                    if (i != 0) {
                        C13534a.this.request(BackpressureUtils.multiplyCap(j, C13534a.this.f78241b));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }

        public C13534a(Subscriber subscriber, int i) {
            this.f78240a = subscriber;
            this.f78241b = i;
            request(0L);
        }

        /* renamed from: c */
        public Producer m23079c() {
            return new C13535a();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            List list = this.f78242c;
            if (list != null) {
                this.f78240a.onNext(list);
            }
            this.f78240a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78242c = null;
            this.f78240a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            List list = this.f78242c;
            if (list == null) {
                list = new ArrayList(this.f78241b);
                this.f78242c = list;
            }
            list.add(obj);
            if (list.size() == this.f78241b) {
                this.f78242c = null;
                this.f78240a.onNext(list);
            }
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.f78226a = i;
                this.f78227b = i2;
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
        int i = this.f78227b;
        int i2 = this.f78226a;
        if (i == i2) {
            C13534a c13534a = new C13534a(subscriber, i2);
            subscriber.add(c13534a);
            subscriber.setProducer(c13534a.m23079c());
            return c13534a;
        } else if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(subscriber, i2, i);
            subscriber.add(bufferSkip);
            subscriber.setProducer(bufferSkip.m23081d());
            return bufferSkip;
        } else {
            BufferOverlap bufferOverlap = new BufferOverlap(subscriber, i2, i);
            subscriber.add(bufferOverlap);
            subscriber.setProducer(bufferOverlap.m23084d());
            return bufferOverlap;
        }
    }
}
