package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.functions.Func2;
import p046rx.internal.util.atomic.SpscLinkedAtomicQueue;
import p046rx.internal.util.unsafe.SpscLinkedQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;

/* renamed from: rx.internal.operators.OperatorScan */
/* loaded from: classes7.dex */
public final class OperatorScan<R, T> implements Observable.Operator<R, T> {

    /* renamed from: c */
    public static final Object f78631c = new Object();

    /* renamed from: a */
    public final Func0 f78632a;

    /* renamed from: b */
    public final Func2 f78633b;

    /* renamed from: rx.internal.operators.OperatorScan$a */
    /* loaded from: classes7.dex */
    public class C13631a implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Object f78634a;

        public C13631a(Object obj) {
            this.f78634a = obj;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return this.f78634a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$b */
    /* loaded from: classes7.dex */
    public class C13632b extends Subscriber {

        /* renamed from: a */
        public boolean f78635a;

        /* renamed from: b */
        public Object f78636b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78637c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13632b(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78637c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78637c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78637c.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78635a) {
                this.f78635a = true;
            } else {
                try {
                    obj = OperatorScan.this.f78633b.call(this.f78636b, obj);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this.f78637c, obj);
                    return;
                }
            }
            this.f78636b = obj;
            this.f78637c.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$c */
    /* loaded from: classes7.dex */
    public class C13633c extends Subscriber {

        /* renamed from: a */
        public Object f78639a;

        /* renamed from: b */
        public final /* synthetic */ Object f78640b;

        /* renamed from: c */
        public final /* synthetic */ C13634d f78641c;

        public C13633c(Object obj, C13634d c13634d) {
            this.f78640b = obj;
            this.f78641c = c13634d;
            this.f78639a = obj;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78641c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78641c.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Object call = OperatorScan.this.f78633b.call(this.f78639a, obj);
                this.f78639a = call;
                this.f78641c.onNext(call);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78641c.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$d */
    /* loaded from: classes7.dex */
    public static final class C13634d implements Producer, Observer {

        /* renamed from: a */
        public final Subscriber f78643a;

        /* renamed from: b */
        public final Queue f78644b;

        /* renamed from: c */
        public boolean f78645c;

        /* renamed from: d */
        public boolean f78646d;

        /* renamed from: e */
        public long f78647e;

        /* renamed from: f */
        public final AtomicLong f78648f;

        /* renamed from: g */
        public volatile Producer f78649g;

        /* renamed from: h */
        public volatile boolean f78650h;

        /* renamed from: i */
        public Throwable f78651i;

        public C13634d(Object obj, Subscriber subscriber) {
            Queue spscLinkedAtomicQueue;
            this.f78643a = subscriber;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscLinkedAtomicQueue = new SpscLinkedQueue();
            } else {
                spscLinkedAtomicQueue = new SpscLinkedAtomicQueue();
            }
            this.f78644b = spscLinkedAtomicQueue;
            spscLinkedAtomicQueue.offer(NotificationLite.next(obj));
            this.f78648f = new AtomicLong();
        }

        /* renamed from: a */
        public boolean m22995a(boolean z, boolean z2, Subscriber subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (z) {
                Throwable th2 = this.f78651i;
                if (th2 != null) {
                    subscriber.onError(th2);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void m22994b() {
            synchronized (this) {
                try {
                    if (this.f78645c) {
                        this.f78646d = true;
                        return;
                    }
                    this.f78645c = true;
                    m22993c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m22993c() {
            boolean z;
            Subscriber subscriber = this.f78643a;
            Queue queue = this.f78644b;
            AtomicLong atomicLong = this.f78648f;
            long j = atomicLong.get();
            while (!m22995a(this.f78650h, queue.isEmpty(), subscriber)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.f78650h;
                    Object poll = queue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m22995a(z2, z, subscriber)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    Object value = NotificationLite.getValue(poll);
                    try {
                        subscriber.onNext(value);
                        j2++;
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, subscriber, value);
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    j = BackpressureUtils.produced(atomicLong, j2);
                }
                synchronized (this) {
                    try {
                        if (!this.f78646d) {
                            this.f78645c = false;
                            return;
                        }
                        this.f78646d = false;
                    } finally {
                    }
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78650h = true;
            m22994b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78651i = th2;
            this.f78650h = true;
            m22994b();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78644b.offer(NotificationLite.next(obj));
            m22994b();
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    BackpressureUtils.getAndAddRequest(this.f78648f, j);
                    Producer producer = this.f78649g;
                    if (producer == null) {
                        synchronized (this.f78648f) {
                            try {
                                producer = this.f78649g;
                                if (producer == null) {
                                    this.f78647e = BackpressureUtils.addCap(this.f78647e, j);
                                }
                            } finally {
                            }
                        }
                    }
                    if (producer != null) {
                        producer.request(j);
                    }
                    m22994b();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= required but it was " + j);
        }

        public void setProducer(Producer producer) {
            long j;
            producer.getClass();
            synchronized (this.f78648f) {
                if (this.f78649g == null) {
                    j = this.f78647e;
                    if (j != Long.MAX_VALUE) {
                        j--;
                    }
                    this.f78647e = 0L;
                    this.f78649g = producer;
                } else {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
            }
            if (j > 0) {
                producer.request(j);
            }
            m22994b();
        }
    }

    public OperatorScan(R r, Func2<R, ? super T, R> func2) {
        this((Func0) new C13631a(r), (Func2) func2);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.f78632a = func0;
        this.f78633b = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        Object call = this.f78632a.call();
        if (call == f78631c) {
            return new C13632b(subscriber, subscriber);
        }
        C13634d c13634d = new C13634d(call, subscriber);
        C13633c c13633c = new C13633c(call, c13634d);
        subscriber.add(c13633c);
        subscriber.setProducer(c13634d);
        return c13633c;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(f78631c, func2);
    }
}
