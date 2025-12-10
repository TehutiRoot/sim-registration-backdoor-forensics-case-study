package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorEagerConcatMap */
/* loaded from: classes7.dex */
public final class OperatorEagerConcatMap<T, R> implements Observable.Operator<R, T> {

    /* renamed from: a */
    public final Func1 f78347a;

    /* renamed from: b */
    public final int f78348b;

    /* renamed from: c */
    public final int f78349c;

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$EagerOuterProducer */
    /* loaded from: classes7.dex */
    public static final class EagerOuterProducer extends AtomicLong implements Producer {
        private static final long serialVersionUID = -657299606803478389L;
        final C13567b parent;

        public EagerOuterProducer(C13567b c13567b) {
            this.parent = c13567b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i > 0) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    this.parent.m23064c();
                    return;
                }
                return;
            }
            throw new IllegalStateException("n >= 0 required but it was " + j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$a */
    /* loaded from: classes7.dex */
    public static final class C13566a extends Subscriber {

        /* renamed from: a */
        public final C13567b f78350a;

        /* renamed from: b */
        public final Queue f78351b;

        /* renamed from: c */
        public volatile boolean f78352c;

        /* renamed from: d */
        public Throwable f78353d;

        public C13566a(C13567b c13567b, int i) {
            Queue spscAtomicArrayQueue;
            this.f78350a = c13567b;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue(i);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue(i);
            }
            this.f78351b = spscAtomicArrayQueue;
            request(i);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78352c = true;
            this.f78350a.m23064c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78353d = th2;
            this.f78352c = true;
            this.f78350a.m23064c();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78351b.offer(NotificationLite.next(obj));
            this.f78350a.m23064c();
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$b */
    /* loaded from: classes7.dex */
    public static final class C13567b extends Subscriber {

        /* renamed from: a */
        public final Func1 f78354a;

        /* renamed from: b */
        public final int f78355b;

        /* renamed from: c */
        public final Subscriber f78356c;

        /* renamed from: e */
        public volatile boolean f78358e;

        /* renamed from: f */
        public Throwable f78359f;

        /* renamed from: g */
        public volatile boolean f78360g;

        /* renamed from: i */
        public EagerOuterProducer f78362i;

        /* renamed from: d */
        public final Queue f78357d = new LinkedList();

        /* renamed from: h */
        public final AtomicInteger f78361h = new AtomicInteger();

        /* renamed from: rx.internal.operators.OperatorEagerConcatMap$b$a */
        /* loaded from: classes7.dex */
        public class C13568a implements Action0 {
            public C13568a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13567b.this.f78360g = true;
                if (C13567b.this.f78361h.getAndIncrement() == 0) {
                    C13567b.this.m23065b();
                }
            }
        }

        public C13567b(Func1 func1, int i, int i2, Subscriber subscriber) {
            long j;
            this.f78354a = func1;
            this.f78355b = i;
            this.f78356c = subscriber;
            if (i2 == Integer.MAX_VALUE) {
                j = Long.MAX_VALUE;
            } else {
                j = i2;
            }
            request(j);
        }

        /* renamed from: b */
        public void m23065b() {
            ArrayList<Subscription> arrayList;
            synchronized (this.f78357d) {
                arrayList = new ArrayList(this.f78357d);
                this.f78357d.clear();
            }
            for (Subscription subscription : arrayList) {
                subscription.unsubscribe();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0087, code lost:
            if (r12 == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
            if (r8 == Long.MAX_VALUE) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
            p046rx.internal.operators.BackpressureUtils.produced(r0, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
            if (r6 != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
            r7.requestMore(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
            if (r6 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x009c, code lost:
            r4 = r17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m23064c() {
            /*
                r18 = this;
                r1 = r18
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f78361h
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto Lb
                return
            Lb:
                rx.internal.operators.OperatorEagerConcatMap$EagerOuterProducer r0 = r1.f78362i
                rx.Subscriber r2 = r1.f78356c
                r4 = 1
            L10:
                boolean r5 = r1.f78360g
                if (r5 == 0) goto L18
                r18.m23065b()
                return
            L18:
                boolean r5 = r1.f78358e
                java.util.Queue r6 = r1.f78357d
                monitor-enter(r6)
                java.util.Queue r7 = r1.f78357d     // Catch: java.lang.Throwable -> Lc1
                java.lang.Object r7 = r7.peek()     // Catch: java.lang.Throwable -> Lc1
                rx.internal.operators.OperatorEagerConcatMap$a r7 = (p046rx.internal.operators.OperatorEagerConcatMap.C13566a) r7     // Catch: java.lang.Throwable -> Lc1
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc1
                r6 = 0
                if (r7 != 0) goto L2b
                r8 = 1
                goto L2c
            L2b:
                r8 = 0
            L2c:
                if (r5 == 0) goto L3f
                java.lang.Throwable r5 = r1.f78359f
                if (r5 == 0) goto L39
                r18.m23065b()
                r2.onError(r5)
                return
            L39:
                if (r8 == 0) goto L3f
                r2.onCompleted()
                return
            L3f:
                if (r8 != 0) goto Lb3
                long r8 = r0.get()
                java.util.Queue r5 = r7.f78351b
                r10 = 0
                r12 = r10
            L4a:
                boolean r14 = r7.f78352c
                java.lang.Object r15 = r5.peek()
                r17 = r4
                if (r15 != 0) goto L57
                r16 = 1
                goto L59
            L57:
                r16 = 0
            L59:
                r3 = 1
                if (r14 == 0) goto L7e
                java.lang.Throwable r14 = r7.f78353d
                if (r14 == 0) goto L68
                r18.m23065b()
                r2.onError(r14)
                return
            L68:
                if (r16 == 0) goto L7e
                java.util.Queue r14 = r1.f78357d
                monitor-enter(r14)
                java.util.Queue r5 = r1.f78357d     // Catch: java.lang.Throwable -> L7b
                r5.poll()     // Catch: java.lang.Throwable -> L7b
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L7b
                r7.unsubscribe()
                r1.request(r3)
                r6 = 1
                goto L85
            L7b:
                r0 = move-exception
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L7b
                throw r0
            L7e:
                if (r16 == 0) goto L81
                goto L85
            L81:
                int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r14 != 0) goto La0
            L85:
                int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r3 == 0) goto L9a
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 == 0) goto L95
                p046rx.internal.operators.BackpressureUtils.produced(r0, r12)
            L95:
                if (r6 != 0) goto L9a
                r7.requestMore(r12)
            L9a:
                if (r6 == 0) goto Lb5
                r4 = r17
                goto L10
            La0:
                r5.poll()
                java.lang.Object r14 = p046rx.internal.operators.NotificationLite.getValue(r15)     // Catch: java.lang.Throwable -> Lae
                r2.onNext(r14)     // Catch: java.lang.Throwable -> Lae
                long r12 = r12 + r3
                r4 = r17
                goto L4a
            Lae:
                r0 = move-exception
                p046rx.exceptions.Exceptions.throwOrReport(r0, r2, r15)
                return
            Lb3:
                r17 = r4
            Lb5:
                java.util.concurrent.atomic.AtomicInteger r3 = r1.f78361h
                r4 = r17
                int r4 = -r4
                int r4 = r3.addAndGet(r4)
                if (r4 != 0) goto L10
                return
            Lc1:
                r0 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc1
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorEagerConcatMap.C13567b.m23064c():void");
        }

        /* renamed from: d */
        public void m23063d() {
            this.f78362i = new EagerOuterProducer(this);
            add(Subscriptions.create(new C13568a()));
            this.f78356c.add(this);
            this.f78356c.setProducer(this.f78362i);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78358e = true;
            m23064c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78359f = th2;
            this.f78358e = true;
            m23064c();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Observable observable = (Observable) this.f78354a.call(obj);
                if (this.f78360g) {
                    return;
                }
                C13566a c13566a = new C13566a(this, this.f78355b);
                synchronized (this.f78357d) {
                    try {
                        if (this.f78360g) {
                            return;
                        }
                        this.f78357d.add(c13566a);
                        if (this.f78360g) {
                            return;
                        }
                        observable.unsafeSubscribe(c13566a);
                        m23064c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78356c, obj);
            }
        }
    }

    public OperatorEagerConcatMap(Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.f78347a = func1;
        this.f78348b = i;
        this.f78349c = i2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        C13567b c13567b = new C13567b(this.f78347a, this.f78348b, this.f78349c, subscriber);
        c13567b.m23063d();
        return c13567b;
    }
}
