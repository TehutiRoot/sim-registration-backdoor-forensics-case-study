package p046rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.BackpressureOverflow;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.internal.util.BackpressureDrainManager;

/* renamed from: rx.internal.operators.OperatorOnBackpressureBuffer */
/* loaded from: classes7.dex */
public class OperatorOnBackpressureBuffer<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Long f78516a;

    /* renamed from: b */
    public final Action0 f78517b;

    /* renamed from: c */
    public final BackpressureOverflow.Strategy f78518c;

    /* renamed from: rx.internal.operators.OperatorOnBackpressureBuffer$a */
    /* loaded from: classes7.dex */
    public static final class C13596a extends Subscriber implements BackpressureDrainManager.BackpressureQueueCallback {

        /* renamed from: b */
        public final AtomicLong f78520b;

        /* renamed from: c */
        public final Subscriber f78521c;

        /* renamed from: e */
        public final BackpressureDrainManager f78523e;

        /* renamed from: f */
        public final Action0 f78524f;

        /* renamed from: g */
        public final BackpressureOverflow.Strategy f78525g;

        /* renamed from: a */
        public final ConcurrentLinkedQueue f78519a = new ConcurrentLinkedQueue();

        /* renamed from: d */
        public final AtomicBoolean f78522d = new AtomicBoolean(false);

        public C13596a(Subscriber subscriber, Long l, Action0 action0, BackpressureOverflow.Strategy strategy) {
            AtomicLong atomicLong;
            this.f78521c = subscriber;
            if (l != null) {
                atomicLong = new AtomicLong(l.longValue());
            } else {
                atomicLong = null;
            }
            this.f78520b = atomicLong;
            this.f78524f = action0;
            this.f78523e = new BackpressureDrainManager(this);
            this.f78525g = strategy;
        }

        @Override // p046rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public boolean accept(Object obj) {
            return NotificationLite.accept(this.f78521c, obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0049 A[SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m23023b() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f78520b
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f78520b
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4a
                r0 = 0
                rx.BackpressureOverflow$Strategy r4 = r6.f78525g     // Catch: p046rx.exceptions.MissingBackpressureException -> L23
                boolean r4 = r4.mayAttemptDrop()     // Catch: p046rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.poll()     // Catch: p046rx.exceptions.MissingBackpressureException -> L23
                if (r4 == 0) goto L34
                r4 = 1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f78522d
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                rx.Subscriber r5 = r6.f78521c
                r5.onError(r4)
            L34:
                r4 = 0
            L35:
                rx.functions.Action0 r5 = r6.f78524f
                if (r5 == 0) goto L47
                r5.call()     // Catch: java.lang.Throwable -> L3d
                goto L47
            L3d:
                r1 = move-exception
                p046rx.exceptions.Exceptions.throwIfFatal(r1)
                rx.internal.util.BackpressureDrainManager r2 = r6.f78523e
                r2.terminateAndDrain(r1)
                return r0
            L47:
                if (r4 != 0) goto L4a
                return r0
            L4a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f78520b
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorOnBackpressureBuffer.C13596a.m23023b():boolean");
        }

        /* renamed from: c */
        public Producer m23022c() {
            return this.f78523e;
        }

        @Override // p046rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public void complete(Throwable th2) {
            if (th2 != null) {
                this.f78521c.onError(th2);
            } else {
                this.f78521c.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78522d.get()) {
                this.f78523e.terminateAndDrain();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78522d.get()) {
                this.f78523e.terminateAndDrain(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!m23023b()) {
                return;
            }
            this.f78519a.offer(NotificationLite.next(obj));
            this.f78523e.drain();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // p046rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object peek() {
            return this.f78519a.peek();
        }

        @Override // p046rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object poll() {
            Object poll = this.f78519a.poll();
            AtomicLong atomicLong = this.f78520b;
            if (atomicLong != null && poll != null) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureBuffer$b */
    /* loaded from: classes7.dex */
    public static final class C13597b {

        /* renamed from: a */
        public static final OperatorOnBackpressureBuffer f78526a = new OperatorOnBackpressureBuffer();
    }

    public OperatorOnBackpressureBuffer() {
        this.f78516a = null;
        this.f78517b = null;
        this.f78518c = BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public static <T> OperatorOnBackpressureBuffer<T> instance() {
        return C13597b.f78526a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13596a c13596a = new C13596a(subscriber, this.f78516a, this.f78517b, this.f78518c);
        subscriber.add(c13596a);
        subscriber.setProducer(c13596a.m23022c());
        return c13596a;
    }

    public OperatorOnBackpressureBuffer(long j) {
        this(j, null, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0) {
        this(j, action0, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0, BackpressureOverflow.Strategy strategy) {
        if (j <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (strategy != null) {
            this.f78516a = Long.valueOf(j);
            this.f78517b = action0;
            this.f78518c = strategy;
            return;
        }
        throw new NullPointerException("The BackpressureOverflow strategy must not be null");
    }
}
