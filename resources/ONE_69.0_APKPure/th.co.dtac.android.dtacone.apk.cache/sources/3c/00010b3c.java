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
    public final boolean f78910a;

    /* renamed from: rx.internal.operators.OperatorSwitch$a */
    /* loaded from: classes7.dex */
    public static final class C13651a {

        /* renamed from: a */
        public static final OperatorSwitch f78911a = new OperatorSwitch(false);
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$b */
    /* loaded from: classes7.dex */
    public static final class C13652b {

        /* renamed from: a */
        public static final OperatorSwitch f78912a = new OperatorSwitch(true);
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$c */
    /* loaded from: classes7.dex */
    public static final class C13653c extends Subscriber {

        /* renamed from: a */
        public final long f78913a;

        /* renamed from: b */
        public final C13654d f78914b;

        public C13653c(long j, C13654d c13654d) {
            this.f78913a = j;
            this.f78914b = c13654d;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78914b.m23172e(this.f78913a);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78914b.m23169h(th2, this.f78913a);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78914b.m23170g(obj, this);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78914b.m23167j(producer, this.f78913a);
        }
    }

    /* renamed from: rx.internal.operators.OperatorSwitch$d */
    /* loaded from: classes7.dex */
    public static final class C13654d extends Subscriber {

        /* renamed from: m */
        public static final Throwable f78915m = new Throwable("Terminal error");

        /* renamed from: a */
        public final Subscriber f78916a;

        /* renamed from: c */
        public final boolean f78918c;

        /* renamed from: f */
        public boolean f78921f;

        /* renamed from: g */
        public boolean f78922g;

        /* renamed from: h */
        public long f78923h;

        /* renamed from: i */
        public Producer f78924i;

        /* renamed from: j */
        public volatile boolean f78925j;

        /* renamed from: k */
        public Throwable f78926k;

        /* renamed from: l */
        public boolean f78927l;

        /* renamed from: b */
        public final SerialSubscription f78917b = new SerialSubscription();

        /* renamed from: d */
        public final AtomicLong f78919d = new AtomicLong();

        /* renamed from: e */
        public final SpscLinkedArrayQueue f78920e = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);

        /* renamed from: rx.internal.operators.OperatorSwitch$d$a */
        /* loaded from: classes7.dex */
        public class C13655a implements Action0 {
            public C13655a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13654d.this.m23173d();
            }
        }

        /* renamed from: rx.internal.operators.OperatorSwitch$d$b */
        /* loaded from: classes7.dex */
        public class C13656b implements Producer {
            public C13656b() {
            }

            @Override // p046rx.Producer
            public void request(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    C13654d.this.m23174c(j);
                } else if (i >= 0) {
                } else {
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        }

        public C13654d(Subscriber subscriber, boolean z) {
            this.f78916a = subscriber;
            this.f78918c = z;
        }

        /* renamed from: b */
        public boolean m23175b(boolean z, boolean z2, Throwable th2, SpscLinkedArrayQueue spscLinkedArrayQueue, Subscriber subscriber, boolean z3) {
            if (this.f78918c) {
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
        public void m23174c(long j) {
            Producer producer;
            synchronized (this) {
                producer = this.f78924i;
                this.f78923h = BackpressureUtils.addCap(this.f78923h, j);
            }
            if (producer != null) {
                producer.request(j);
            }
            m23171f();
        }

        /* renamed from: d */
        public void m23173d() {
            synchronized (this) {
                this.f78924i = null;
            }
        }

        /* renamed from: e */
        public void m23172e(long j) {
            synchronized (this) {
                try {
                    if (this.f78919d.get() != j) {
                        return;
                    }
                    this.f78927l = false;
                    this.f78924i = null;
                    m23171f();
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
            if (m23175b(r20.f78925j, r0, r14, r9, r11, r9.isEmpty()) == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
            monitor-enter(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
            r0 = r20.f78923h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
            if (r0 == Long.MAX_VALUE) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r0 = r0 - r16;
            r20.f78923h = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
            if (r20.f78922g != false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
            r20.f78921f = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
            monitor-exit(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
            r20.f78922g = false;
            r15 = r20.f78925j;
            r0 = r20.f78927l;
            r14 = r20.f78926k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b8, code lost:
            if (r14 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
            r1 = p046rx.internal.operators.OperatorSwitch.C13654d.f78915m;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
            if (r14 == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
            if (r20.f78918c != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c2, code lost:
            r20.f78926k = r1;
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
        public void m23171f() {
            /*
                Method dump skipped, instructions count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorSwitch.C13654d.m23171f():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m23170g(Object obj, C13653c c13653c) {
            synchronized (this) {
                try {
                    if (this.f78919d.get() != c13653c.f78913a) {
                        return;
                    }
                    this.f78920e.offer(c13653c, NotificationLite.next(obj));
                    m23171f();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public void m23169h(Throwable th2, long j) {
            boolean z;
            synchronized (this) {
                try {
                    if (this.f78919d.get() == j) {
                        z = m23164m(th2);
                        this.f78927l = false;
                        this.f78924i = null;
                    } else {
                        z = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z) {
                m23171f();
            } else {
                m23165l(th2);
            }
        }

        /* renamed from: i */
        public void m23168i() {
            this.f78916a.add(this.f78917b);
            this.f78916a.add(Subscriptions.create(new C13655a()));
            this.f78916a.setProducer(new C13656b());
        }

        /* renamed from: j */
        public void m23167j(Producer producer, long j) {
            synchronized (this) {
                try {
                    if (this.f78919d.get() != j) {
                        return;
                    }
                    long j2 = this.f78923h;
                    this.f78924i = producer;
                    producer.request(j2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p046rx.Observer
        /* renamed from: k */
        public void onNext(Observable observable) {
            C13653c c13653c;
            long incrementAndGet = this.f78919d.incrementAndGet();
            Subscription subscription = this.f78917b.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                c13653c = new C13653c(incrementAndGet, this);
                this.f78927l = true;
                this.f78924i = null;
            }
            this.f78917b.set(c13653c);
            observable.unsafeSubscribe(c13653c);
        }

        /* renamed from: l */
        public void m23165l(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        /* renamed from: m */
        public boolean m23164m(Throwable th2) {
            Throwable th3 = this.f78926k;
            if (th3 == f78915m) {
                return false;
            }
            if (th3 == null) {
                this.f78926k = th2;
            } else if (th3 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                arrayList.add(th2);
                this.f78926k = new CompositeException(arrayList);
            } else {
                this.f78926k = new CompositeException(th3, th2);
            }
            return true;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78925j = true;
            m23171f();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            boolean m23164m;
            synchronized (this) {
                m23164m = m23164m(th2);
            }
            if (m23164m) {
                this.f78925j = true;
                m23171f();
                return;
            }
            m23165l(th2);
        }
    }

    public OperatorSwitch(boolean z) {
        this.f78910a = z;
    }

    public static <T> OperatorSwitch<T> instance(boolean z) {
        if (z) {
            return C13652b.f78912a;
        }
        return C13651a.f78911a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        C13654d c13654d = new C13654d(subscriber, this.f78910a);
        subscriber.add(c13654d);
        c13654d.m23168i();
        return c13654d;
    }
}