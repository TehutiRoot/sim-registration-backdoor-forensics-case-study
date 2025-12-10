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
    public static final Object f78837c = new Object();

    /* renamed from: a */
    public final Func0 f78838a;

    /* renamed from: b */
    public final Func2 f78839b;

    /* renamed from: rx.internal.operators.OperatorScan$a */
    /* loaded from: classes7.dex */
    public class C13632a implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Object f78840a;

        public C13632a(Object obj) {
            this.f78840a = obj;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return this.f78840a;
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$b */
    /* loaded from: classes7.dex */
    public class C13633b extends Subscriber {

        /* renamed from: a */
        public boolean f78841a;

        /* renamed from: b */
        public Object f78842b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13633b(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78843c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78843c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78843c.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78841a) {
                this.f78841a = true;
            } else {
                try {
                    obj = OperatorScan.this.f78839b.call(this.f78842b, obj);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this.f78843c, obj);
                    return;
                }
            }
            this.f78842b = obj;
            this.f78843c.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$c */
    /* loaded from: classes7.dex */
    public class C13634c extends Subscriber {

        /* renamed from: a */
        public Object f78845a;

        /* renamed from: b */
        public final /* synthetic */ Object f78846b;

        /* renamed from: c */
        public final /* synthetic */ C13635d f78847c;

        public C13634c(Object obj, C13635d c13635d) {
            this.f78846b = obj;
            this.f78847c = c13635d;
            this.f78845a = obj;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78847c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78847c.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Object call = OperatorScan.this.f78839b.call(this.f78845a, obj);
                this.f78845a = call;
                this.f78847c.onNext(call);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78847c.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorScan$d */
    /* loaded from: classes7.dex */
    public static final class C13635d implements Producer, Observer {

        /* renamed from: a */
        public final Subscriber f78849a;

        /* renamed from: b */
        public final Queue f78850b;

        /* renamed from: c */
        public boolean f78851c;

        /* renamed from: d */
        public boolean f78852d;

        /* renamed from: e */
        public long f78853e;

        /* renamed from: f */
        public final AtomicLong f78854f;

        /* renamed from: g */
        public volatile Producer f78855g;

        /* renamed from: h */
        public volatile boolean f78856h;

        /* renamed from: i */
        public Throwable f78857i;

        public C13635d(Object obj, Subscriber subscriber) {
            Queue spscLinkedAtomicQueue;
            this.f78849a = subscriber;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscLinkedAtomicQueue = new SpscLinkedQueue();
            } else {
                spscLinkedAtomicQueue = new SpscLinkedAtomicQueue();
            }
            this.f78850b = spscLinkedAtomicQueue;
            spscLinkedAtomicQueue.offer(NotificationLite.next(obj));
            this.f78854f = new AtomicLong();
        }

        /* renamed from: a */
        public boolean m23183a(boolean z, boolean z2, Subscriber subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (z) {
                Throwable th2 = this.f78857i;
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
        public void m23182b() {
            synchronized (this) {
                try {
                    if (this.f78851c) {
                        this.f78852d = true;
                        return;
                    }
                    this.f78851c = true;
                    m23181c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m23181c() {
            boolean z;
            Subscriber subscriber = this.f78849a;
            Queue queue = this.f78850b;
            AtomicLong atomicLong = this.f78854f;
            long j = atomicLong.get();
            while (!m23183a(this.f78856h, queue.isEmpty(), subscriber)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.f78856h;
                    Object poll = queue.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m23183a(z2, z, subscriber)) {
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
                        if (!this.f78852d) {
                            this.f78851c = false;
                            return;
                        }
                        this.f78852d = false;
                    } finally {
                    }
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78856h = true;
            m23182b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78857i = th2;
            this.f78856h = true;
            m23182b();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78850b.offer(NotificationLite.next(obj));
            m23182b();
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    BackpressureUtils.getAndAddRequest(this.f78854f, j);
                    Producer producer = this.f78855g;
                    if (producer == null) {
                        synchronized (this.f78854f) {
                            try {
                                producer = this.f78855g;
                                if (producer == null) {
                                    this.f78853e = BackpressureUtils.addCap(this.f78853e, j);
                                }
                            } finally {
                            }
                        }
                    }
                    if (producer != null) {
                        producer.request(j);
                    }
                    m23182b();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= required but it was " + j);
        }

        public void setProducer(Producer producer) {
            long j;
            producer.getClass();
            synchronized (this.f78854f) {
                if (this.f78855g == null) {
                    j = this.f78853e;
                    if (j != Long.MAX_VALUE) {
                        j--;
                    }
                    this.f78853e = 0L;
                    this.f78855g = producer;
                } else {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
            }
            if (j > 0) {
                producer.request(j);
            }
            m23182b();
        }
    }

    public OperatorScan(R r, Func2<R, ? super T, R> func2) {
        this((Func0) new C13632a(r), (Func2) func2);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.f78838a = func0;
        this.f78839b = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        Object call = this.f78838a.call();
        if (call == f78837c) {
            return new C13633b(subscriber, subscriber);
        }
        C13635d c13635d = new C13635d(call, subscriber);
        C13634c c13634c = new C13634c(call, c13635d);
        subscriber.add(c13634c);
        subscriber.setProducer(c13635d);
        return c13634c;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(f78837c, func2);
    }
}