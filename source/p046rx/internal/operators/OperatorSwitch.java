package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.CompositeException;
import p046rx.functions.Action0;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.atomic.SpscLinkedArrayQueue;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorSwitch */
/* loaded from: classes7.dex */
public final class OperatorSwitch<T> implements Observable.Operator<T, Observable<? extends T>> {

    /* renamed from: a */
    public final boolean f78704a;

    /* renamed from: rx.internal.operators.OperatorSwitch$a */
    /* loaded from: classes7.dex */
    public static final class C13650a {

        /* renamed from: a */
        public static final OperatorSwitch f78705a = new OperatorSwitch(false);
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$b */
    /* loaded from: classes7.dex */
    public static final class C13651b {

        /* renamed from: a */
        public static final OperatorSwitch f78706a = new OperatorSwitch(true);
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$c */
    /* loaded from: classes7.dex */
    public static final class C13652c extends Subscriber {

        /* renamed from: a */
        public final long f78707a;

        /* renamed from: b */
        public final C13653d f78708b;

        public C13652c(long j, C13653d c13653d) {
            this.f78707a = j;
            this.f78708b = c13653d;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78708b.m22984e(this.f78707a);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78708b.m22981h(th2, this.f78707a);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78708b.m22982g(obj, this);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78708b.m22979j(producer, this.f78707a);
        }
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$d */
    /* loaded from: classes7.dex */
    public static final class C13653d extends Subscriber {

        /* renamed from: m */
        public static final Throwable f78709m = new Throwable("Terminal error");

        /* renamed from: a */
        public final Subscriber f78710a;

        /* renamed from: c */
        public final boolean f78712c;

        /* renamed from: f */
        public boolean f78715f;

        /* renamed from: g */
        public boolean f78716g;

        /* renamed from: h */
        public long f78717h;

        /* renamed from: i */
        public Producer f78718i;

        /* renamed from: j */
        public volatile boolean f78719j;

        /* renamed from: k */
        public Throwable f78720k;

        /* renamed from: l */
        public boolean f78721l;

        /* renamed from: b */
        public final SerialSubscription f78711b = new SerialSubscription();

        /* renamed from: d */
        public final AtomicLong f78713d = new AtomicLong();

        /* renamed from: e */
        public final SpscLinkedArrayQueue f78714e = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);

        /* renamed from: rx.internal.operators.OperatorSwitch$d$a */
        /* loaded from: classes7.dex */
        public class C13654a implements Action0 {
            public C13654a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13653d.this.m22985d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorSwitch$d$b */
        /* loaded from: classes7.dex */
        public class C13655b implements Producer {
            public C13655b() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    C13653d.this.m22986c(j);
                } else if (i >= 0) {
                } else {
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        }

        public C13653d(Subscriber subscriber, boolean z) {
            this.f78710a = subscriber;
            this.f78712c = z;
        }

        /* renamed from: b */
        public boolean m22987b(boolean z, boolean z2, Throwable th2, SpscLinkedArrayQueue spscLinkedArrayQueue, Subscriber subscriber, boolean z3) {
            if (this.f78712c) {
                if (z && !z2 && z3) {
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onCompleted();
                    }
                    return true;
                }
                return false;
            } else if (th2 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th2);
                return true;
            } else if (z && !z2 && z3) {
                subscriber.onCompleted();
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: c */
        public void m22986c(long j) {
            Producer producer;
            synchronized (this) {
                producer = this.f78718i;
                this.f78717h = BackpressureUtils.addCap(this.f78717h, j);
            }
            if (producer != null) {
                producer.request(j);
            }
            m22983f();
        }

        /* renamed from: d */
        public void m22985d() {
            synchronized (this) {
                this.f78718i = null;
            }
        }

        /* renamed from: e */
        public void m22984e(long j) {
            synchronized (this) {
                try {
                    if (this.f78713d.get() != j) {
                        return;
                    }
                    this.f78721l = false;
                    this.f78718i = null;
                    m22983f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
            if (r18 != 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
            if (r11.isUnsubscribed() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
            if (m22987b(r20.f78719j, r0, r14, r9, r11, r9.isEmpty()) == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
            monitor-enter(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
            r0 = r20.f78717h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
            if (r0 == Long.MAX_VALUE) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r0 = r0 - r16;
            r20.f78717h = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
            if (r20.f78716g != false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
            r20.f78715f = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
            monitor-exit(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
            r20.f78716g = false;
            r15 = r20.f78719j;
            r0 = r20.f78721l;
            r14 = r20.f78720k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
            if (r14 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
            r1 = p046rx.internal.operators.OperatorSwitch.C13653d.f78709m;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
            if (r14 == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
            if (r20.f78712c != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c2, code lost:
            r20.f78720k = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
            monitor-exit(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:
            throw r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m22983f() {
            /*
                Method dump skipped, instructions count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorSwitch.C13653d.m22983f():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m22982g(Object obj, C13652c c13652c) {
            synchronized (this) {
                try {
                    if (this.f78713d.get() != c13652c.f78707a) {
                        return;
                    }
                    this.f78714e.offer(c13652c, NotificationLite.next(obj));
                    m22983f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public void m22981h(Throwable th2, long j) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78713d.get() == j) {
                        z = m22976m(th2);
                        this.f78721l = false;
                        this.f78718i = null;
                    } else {
                        z = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z) {
                m22983f();
            } else {
                m22977l(th2);
            }
        }

        /* renamed from: i */
        public void m22980i() {
            this.f78710a.add(this.f78711b);
            this.f78710a.add(Subscriptions.create(new C13654a()));
            this.f78710a.setProducer(new C13655b());
        }

        /* renamed from: j */
        public void m22979j(Producer producer, long j) {
            synchronized (this) {
                try {
                    if (this.f78713d.get() != j) {
                        return;
                    }
                    long j2 = this.f78717h;
                    this.f78718i = producer;
                    producer.request(j2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        /* renamed from: k */
        public void onNext(Observable observable) {
            C13652c c13652c;
            long incrementAndGet = this.f78713d.incrementAndGet();
            Subscription subscription = this.f78711b.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                c13652c = new C13652c(incrementAndGet, this);
                this.f78721l = true;
                this.f78718i = null;
            }
            this.f78711b.set(c13652c);
            observable.unsafeSubscribe(c13652c);
        }

        /* renamed from: l */
        public void m22977l(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        /* renamed from: m */
        public boolean m22976m(Throwable th2) {
            Throwable th3 = this.f78720k;
            if (th3 == f78709m) {
                return false;
            }
            if (th3 == null) {
                this.f78720k = th2;
            } else if (th3 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                arrayList.add(th2);
                this.f78720k = new CompositeException(arrayList);
            } else {
                this.f78720k = new CompositeException(th3, th2);
            }
            return true;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78719j = true;
            m22983f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            boolean m22976m;
            synchronized (this) {
                m22976m = m22976m(th2);
            }
            if (m22976m) {
                this.f78719j = true;
                m22983f();
                return;
            }
            m22977l(th2);
        }
    }

    public OperatorSwitch(boolean z) {
        this.f78704a = z;
    }

    public static <T> OperatorSwitch<T> instance(boolean z) {
        if (z) {
            return C13651b.f78706a;
        }
        return C13650a.f78705a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        C13653d c13653d = new C13653d(subscriber, this.f78704a);
        subscriber.add(c13653d);
        c13653d.m22980i();
        return c13653d;
    }
}
