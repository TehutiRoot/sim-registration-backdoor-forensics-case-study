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
    public final Scheduler f78501a;

    /* renamed from: b */
    public final boolean f78502b;

    /* renamed from: c */
    public final int f78503c;

    /* renamed from: rx.internal.operators.OperatorObserveOn$a */
    /* loaded from: classes7.dex */
    public static class C13593a implements Observable.Operator {

        /* renamed from: a */
        public final /* synthetic */ int f78504a;

        public C13593a(int i) {
            this.f78504a = i;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscriber call(Subscriber subscriber) {
            C13594b c13594b = new C13594b(Schedulers.immediate(), subscriber, false, this.f78504a);
            c13594b.m23025c();
            return c13594b;
        }
    }

    /* renamed from: rx.internal.operators.OperatorObserveOn$b */
    /* loaded from: classes7.dex */
    public static final class C13594b extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78505a;

        /* renamed from: b */
        public final Scheduler.Worker f78506b;

        /* renamed from: c */
        public final boolean f78507c;

        /* renamed from: d */
        public final Queue f78508d;

        /* renamed from: e */
        public final int f78509e;

        /* renamed from: f */
        public volatile boolean f78510f;

        /* renamed from: g */
        public final AtomicLong f78511g = new AtomicLong();

        /* renamed from: h */
        public final AtomicLong f78512h = new AtomicLong();

        /* renamed from: i */
        public Throwable f78513i;

        /* renamed from: j */
        public long f78514j;

        /* renamed from: rx.internal.operators.OperatorObserveOn$b$a */
        /* loaded from: classes7.dex */
        public class C13595a implements Producer {
            public C13595a() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(C13594b.this.f78511g, j);
                    C13594b.this.m23024d();
                }
            }
        }

        public C13594b(Scheduler scheduler, Subscriber subscriber, boolean z, int i) {
            this.f78505a = subscriber;
            this.f78506b = scheduler.createWorker();
            this.f78507c = z;
            i = i <= 0 ? RxRingBuffer.SIZE : i;
            this.f78509e = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f78508d = new SpscArrayQueue(i);
            } else {
                this.f78508d = new SpscAtomicArrayQueue(i);
            }
            request(i);
        }

        /* renamed from: b */
        public boolean m23026b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (z) {
                if (this.f78507c) {
                    if (z2) {
                        Throwable th2 = this.f78513i;
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
                Throwable th4 = this.f78513i;
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
        public void m23025c() {
            Subscriber subscriber = this.f78505a;
            subscriber.setProducer(new C13595a());
            subscriber.add(this.f78506b);
            subscriber.add(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action0
        public void call() {
            int i;
            boolean z;
            long j = this.f78514j;
            Queue queue = this.f78508d;
            Subscriber subscriber = this.f78505a;
            long j2 = 1;
            do {
                long j3 = this.f78511g.get();
                while (true) {
                    i = (j3 > j ? 1 : (j3 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f78510f;
                    Object poll = queue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m23026b(z2, z, subscriber, queue)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    subscriber.onNext(NotificationLite.getValue(poll));
                    j++;
                    if (j == this.f78509e) {
                        j3 = BackpressureUtils.produced(this.f78511g, j);
                        request(j);
                        j = 0;
                    }
                }
                if (i == 0 && m23026b(this.f78510f, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.f78514j = j;
                j2 = this.f78512h.addAndGet(-j2);
            } while (j2 != 0);
        }

        /* renamed from: d */
        public void m23024d() {
            if (this.f78512h.getAndIncrement() == 0) {
                this.f78506b.schedule(this);
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!isUnsubscribed() && !this.f78510f) {
                this.f78510f = true;
                m23024d();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!isUnsubscribed() && !this.f78510f) {
                this.f78513i = th2;
                this.f78510f = true;
                m23024d();
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!isUnsubscribed() && !this.f78510f) {
                if (!this.f78508d.offer(NotificationLite.next(obj))) {
                    onError(new MissingBackpressureException());
                } else {
                    m23024d();
                }
            }
        }
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z) {
        this(scheduler, z, RxRingBuffer.SIZE);
    }

    public static <T> Observable.Operator<T, T> rebatch(int i) {
        return new C13593a(i);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z, int i) {
        this.f78501a = scheduler;
        this.f78502b = z;
        this.f78503c = i <= 0 ? RxRingBuffer.SIZE : i;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler scheduler = this.f78501a;
        if ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) {
            return subscriber;
        }
        C13594b c13594b = new C13594b(scheduler, subscriber, this.f78502b, this.f78503c);
        c13594b.m23025c();
        return c13594b;
    }
}
