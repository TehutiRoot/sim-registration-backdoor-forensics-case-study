package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Action0;
import p046rx.internal.schedulers.ImmediateScheduler;
import p046rx.internal.schedulers.TrampolineScheduler;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.plugins.RxJavaHooks;
import p046rx.schedulers.Schedulers;

/* renamed from: rx.internal.operators.OperatorObserveOn */
/* loaded from: classes7.dex */
public final class OperatorObserveOn<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Scheduler f78707a;

    /* renamed from: b */
    public final boolean f78708b;

    /* renamed from: c */
    public final int f78709c;

    /* renamed from: rx.internal.operators.OperatorObserveOn$a */
    /* loaded from: classes7.dex */
    public static class C13594a implements Observable.Operator {

        /* renamed from: a */
        public final /* synthetic */ int f78710a;

        public C13594a(int i) {
            this.f78710a = i;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscriber call(Subscriber subscriber) {
            C13595b c13595b = new C13595b(Schedulers.immediate(), subscriber, false, this.f78710a);
            c13595b.m23213c();
            return c13595b;
        }
    }

    /* renamed from: rx.internal.operators.OperatorObserveOn$b */
    /* loaded from: classes7.dex */
    public static final class C13595b extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78711a;

        /* renamed from: b */
        public final Scheduler.Worker f78712b;

        /* renamed from: c */
        public final boolean f78713c;

        /* renamed from: d */
        public final Queue f78714d;

        /* renamed from: e */
        public final int f78715e;

        /* renamed from: f */
        public volatile boolean f78716f;

        /* renamed from: g */
        public final AtomicLong f78717g = new AtomicLong();

        /* renamed from: h */
        public final AtomicLong f78718h = new AtomicLong();

        /* renamed from: i */
        public Throwable f78719i;

        /* renamed from: j */
        public long f78720j;

        /* renamed from: rx.internal.operators.OperatorObserveOn$b$a */
        /* loaded from: classes7.dex */
        public class C13596a implements Producer {
            public C13596a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(C13595b.this.f78717g, j);
                    C13595b.this.m23212d();
                }
            }
        }

        public C13595b(Scheduler scheduler, Subscriber subscriber, boolean z, int i) {
            this.f78711a = subscriber;
            this.f78712b = scheduler.createWorker();
            this.f78713c = z;
            i = i <= 0 ? RxRingBuffer.SIZE : i;
            this.f78715e = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f78714d = new SpscArrayQueue(i);
            } else {
                this.f78714d = new SpscAtomicArrayQueue(i);
            }
            request(i);
        }

        /* renamed from: b */
        public boolean m23214b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (z) {
                if (this.f78713c) {
                    if (z2) {
                        Throwable th2 = this.f78719i;
                        try {
                            if (th2 != null) {
                                subscriber.onError(th2);
                            } else {
                                subscriber.onCompleted();
                            }
                            return false;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return false;
                }
                Throwable th4 = this.f78719i;
                if (th4 != null) {
                    queue.clear();
                    try {
                        subscriber.onError(th4);
                        return true;
                    } finally {
                    }
                } else if (z2) {
                    try {
                        subscriber.onCompleted();
                        return true;
                    } finally {
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: c */
        public void m23213c() {
            Subscriber subscriber = this.f78711a;
            subscriber.setProducer(new C13596a());
            subscriber.add(this.f78712b);
            subscriber.add(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            int i;
            boolean z;
            long j = this.f78720j;
            Queue queue = this.f78714d;
            Subscriber subscriber = this.f78711a;
            long j2 = 1;
            do {
                long j3 = this.f78717g.get();
                while (true) {
                    i = (j3 > j ? 1 : (j3 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f78716f;
                    Object poll = queue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m23214b(z2, z, subscriber, queue)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    subscriber.onNext(NotificationLite.getValue(poll));
                    j++;
                    if (j == this.f78715e) {
                        j3 = BackpressureUtils.produced(this.f78717g, j);
                        request(j);
                        j = 0;
                    }
                }
                if (i == 0 && m23214b(this.f78716f, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.f78720j = j;
                j2 = this.f78718h.addAndGet(-j2);
            } while (j2 != 0);
        }

        /* renamed from: d */
        public void m23212d() {
            if (this.f78718h.getAndIncrement() == 0) {
                this.f78712b.schedule(this);
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!isUnsubscribed() && !this.f78716f) {
                this.f78716f = true;
                m23212d();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!isUnsubscribed() && !this.f78716f) {
                this.f78719i = th2;
                this.f78716f = true;
                m23212d();
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!isUnsubscribed() && !this.f78716f) {
                if (!this.f78714d.offer(NotificationLite.next(obj))) {
                    onError(new MissingBackpressureException());
                } else {
                    m23212d();
                }
            }
        }
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z) {
        this(scheduler, z, RxRingBuffer.SIZE);
    }

    public static <T> Observable.Operator<T, T> rebatch(int i) {
        return new C13594a(i);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z, int i) {
        this.f78707a = scheduler;
        this.f78708b = z;
        this.f78709c = i <= 0 ? RxRingBuffer.SIZE : i;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler scheduler = this.f78707a;
        if ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) {
            return subscriber;
        }
        C13595b c13595b = new C13595b(scheduler, subscriber, this.f78708b, this.f78709c);
        c13595b.m23213c();
        return c13595b;
    }
}