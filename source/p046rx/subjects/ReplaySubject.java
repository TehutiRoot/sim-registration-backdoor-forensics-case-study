package p046rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.internal.operators.BackpressureUtils;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.subjects.ReplaySubject */
/* loaded from: classes7.dex */
public final class ReplaySubject<T> extends Subject<T, T> {

    /* renamed from: c */
    public static final Object[] f79461c = new Object[0];

    /* renamed from: b */
    public final ReplayState f79462b;

    /* renamed from: rx.subjects.ReplaySubject$ReplayProducer */
    /* loaded from: classes7.dex */
    public static final class ReplayProducer<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        final Subscriber<? super T> actual;
        int index;
        Object node;
        final AtomicLong requested = new AtomicLong();
        final ReplayState<T> state;
        int tailIndex;

        public ReplayProducer(Subscriber<? super T> subscriber, ReplayState<T> replayState) {
            this.actual = subscriber;
            this.state = replayState;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j);
                this.state.buffer.mo22746a(this);
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplayState */
    /* loaded from: classes7.dex */
    public static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final InterfaceC13867a buffer;

        public ReplayState(InterfaceC13867a interfaceC13867a) {
            this.buffer = interfaceC13867a;
            lazySet(EMPTY);
        }

        public boolean add(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr == TERMINATED) {
                    return false;
                }
                int length = replayProducerArr.length;
                replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
            return true;
        }

        @Override // p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((Subscriber) ((Subscriber) obj));
        }

        public boolean isTerminated() {
            if (get() == TERMINATED) {
                return true;
            }
            return false;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            InterfaceC13867a interfaceC13867a = this.buffer;
            interfaceC13867a.complete();
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                interfaceC13867a.mo22746a(replayProducer);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            InterfaceC13867a interfaceC13867a = this.buffer;
            interfaceC13867a.error(th2);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : getAndSet(TERMINATED)) {
                try {
                    interfaceC13867a.mo22746a(replayProducer);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            InterfaceC13867a interfaceC13867a = this.buffer;
            interfaceC13867a.next(t);
            for (ReplayProducer<T> replayProducer : get()) {
                interfaceC13867a.mo22746a(replayProducer);
            }
        }

        public void remove(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = get();
                if (replayProducerArr != TERMINATED && replayProducerArr != EMPTY) {
                    int length = replayProducerArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (replayProducerArr[i] == replayProducer) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        replayProducerArr2 = EMPTY;
                    } else {
                        ReplayProducer[] replayProducerArr3 = new ReplayProducer[length - 1];
                        System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i);
                        System.arraycopy(replayProducerArr, i + 1, replayProducerArr3, i, (length - i) - 1);
                        replayProducerArr2 = replayProducerArr3;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }

        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(subscriber, this);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (add(replayProducer) && replayProducer.isUnsubscribed()) {
                remove(replayProducer);
            } else {
                this.buffer.mo22746a(replayProducer);
            }
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC13867a {
        /* renamed from: a */
        void mo22746a(ReplayProducer replayProducer);

        void complete();

        Throwable error();

        void error(Throwable th2);

        boolean isEmpty();

        Object last();

        void next(Object obj);

        int size();

        Object[] toArray(Object[] objArr);
    }

    public ReplaySubject(ReplayState replayState) {
        super(replayState);
        this.f79462b = replayState;
    }

    public static <T> ReplaySubject<T> create() {
        return create(16);
    }

    public static <T> ReplaySubject<T> createWithSize(int i) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i)));
    }

    public static <T> ReplaySubject<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return createWithTimeAndSize(j, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> ReplaySubject<T> createWithTimeAndSize(long j, TimeUnit timeUnit, int i, Scheduler scheduler) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(i, timeUnit.toMillis(j), scheduler)));
    }

    public Throwable getThrowable() {
        if (this.f79462b.isTerminated()) {
            return this.f79462b.buffer.error();
        }
        return null;
    }

    public T getValue() {
        return (T) this.f79462b.buffer.last();
    }

    public T[] getValues(T[] tArr) {
        return (T[]) this.f79462b.buffer.toArray(tArr);
    }

    public boolean hasAnyValue() {
        return !this.f79462b.buffer.isEmpty();
    }

    public boolean hasCompleted() {
        if (this.f79462b.isTerminated() && this.f79462b.buffer.error() == null) {
            return true;
        }
        return false;
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79462b.get().length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        if (this.f79462b.isTerminated() && this.f79462b.buffer.error() != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        return hasAnyValue();
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79462b.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79462b.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79462b.onNext(t);
    }

    public int size() {
        return this.f79462b.buffer.size();
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplaySizeBoundBuffer */
    /* loaded from: classes7.dex */
    public static final class ReplaySizeBoundBuffer implements InterfaceC13867a {

        /* renamed from: a */
        public final int f79471a;

        /* renamed from: b */
        public volatile Node f79472b;

        /* renamed from: c */
        public Node f79473c;

        /* renamed from: d */
        public int f79474d;

        /* renamed from: e */
        public volatile boolean f79475e;

        /* renamed from: f */
        public Throwable f79476f;

        /* renamed from: rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node */
        /* loaded from: classes7.dex */
        public static final class Node<T> extends AtomicReference<Node<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T value;

            public Node(T t) {
                this.value = t;
            }
        }

        public ReplaySizeBoundBuffer(int i) {
            this.f79471a = i;
            Node node = new Node(null);
            this.f79473c = node;
            this.f79472b = node;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
            if (r14 != 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
            if (r2.isUnsubscribed() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
            r18.node = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
            r3 = r17.f79475e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
            if (r7.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
            if (r3 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
            if (r12 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
            r18.node = null;
            r1 = r17.f79476f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
            if (r10 == 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
            if (r5 == Long.MAX_VALUE) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
            p046rx.internal.operators.BackpressureUtils.produced(r18.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
            r18.node = r7;
            r4 = r18.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo22746a(p046rx.subjects.ReplaySubject.ReplayProducer r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r18.getAndIncrement()
                if (r2 == 0) goto Lb
                return
            Lb:
                rx.Subscriber<? super T> r2 = r1.actual
                r4 = 1
            Le:
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                java.lang.Object r7 = r1.node
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node r7 = (p046rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node) r7
                r8 = 0
                if (r7 != 0) goto L1e
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node r7 = r0.f79472b
            L1e:
                r10 = r8
            L1f:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L5e
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L2e
                r1.node = r13
                return
            L2e:
                boolean r15 = r0.f79475e
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node r3 = (p046rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.Node) r3
                if (r3 != 0) goto L3d
                r16 = 1
                goto L3f
            L3d:
                r16 = 0
            L3f:
                if (r15 == 0) goto L51
                if (r16 == 0) goto L51
                r1.node = r13
                java.lang.Throwable r1 = r0.f79476f
                if (r1 == 0) goto L4d
                r2.onError(r1)
                goto L50
            L4d:
                r2.onCompleted()
            L50:
                return
            L51:
                if (r16 == 0) goto L54
                goto L5e
            L54:
                T r7 = r3.value
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L1f
            L5e:
                if (r14 != 0) goto L84
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L69
                r1.node = r13
                return
            L69:
                boolean r3 = r0.f79475e
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L72
                r12 = 1
            L72:
                if (r3 == 0) goto L84
                if (r12 == 0) goto L84
                r1.node = r13
                java.lang.Throwable r1 = r0.f79476f
                if (r1 == 0) goto L80
                r2.onError(r1)
                goto L83
            L80:
                r2.onCompleted()
            L83:
                return
            L84:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L96
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L96
                java.util.concurrent.atomic.AtomicLong r3 = r1.requested
                p046rx.internal.operators.BackpressureUtils.produced(r3, r10)
            L96:
                r1.node = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Le
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.subjects.ReplaySubject.ReplaySizeBoundBuffer.mo22746a(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void complete() {
            this.f79475e = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void error(Throwable th2) {
            this.f79476f = th2;
            this.f79475e = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public boolean isEmpty() {
            if (this.f79472b.get() == null) {
                return true;
            }
            return false;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object last() {
            Node<T> node = this.f79472b;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    node = node2;
                } else {
                    return node.value;
                }
            }
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void next(Object obj) {
            Node node = new Node(obj);
            this.f79473c.set(node);
            this.f79473c = node;
            int i = this.f79474d;
            if (i == this.f79471a) {
                this.f79472b = this.f79472b.get();
            } else {
                this.f79474d = i + 1;
            }
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public int size() {
            Node<T> node = this.f79472b.get();
            int i = 0;
            while (node != null && i != Integer.MAX_VALUE) {
                node = node.get();
                i++;
            }
            return i;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList();
            for (Node<T> node = this.f79472b.get(); node != null; node = node.get()) {
                arrayList.add(node.value);
            }
            return arrayList.toArray(objArr);
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Throwable error() {
            return this.f79476f;
        }
    }

    public static <T> ReplaySubject<T> create(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new ReplayState(new C13868b(i)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f79461c;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer */
    /* loaded from: classes7.dex */
    public static final class ReplaySizeAndTimeBoundBuffer implements InterfaceC13867a {

        /* renamed from: a */
        public final int f79463a;

        /* renamed from: b */
        public final long f79464b;

        /* renamed from: c */
        public final Scheduler f79465c;

        /* renamed from: d */
        public volatile TimedNode f79466d;

        /* renamed from: e */
        public TimedNode f79467e;

        /* renamed from: f */
        public int f79468f;

        /* renamed from: g */
        public volatile boolean f79469g;

        /* renamed from: h */
        public Throwable f79470h;

        /* renamed from: rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode */
        /* loaded from: classes7.dex */
        public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final long timestamp;
            final T value;

            public TimedNode(T t, long j) {
                this.value = t;
                this.timestamp = j;
            }
        }

        public ReplaySizeAndTimeBoundBuffer(int i, long j, Scheduler scheduler) {
            this.f79463a = i;
            TimedNode timedNode = new TimedNode(null, 0L);
            this.f79467e = timedNode;
            this.f79466d = timedNode;
            this.f79464b = j;
            this.f79465c = scheduler;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
            if (r14 != 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
            if (r2.isUnsubscribed() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            r18.node = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
            r3 = r17.f79469g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
            if (r7.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
            if (r3 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
            if (r12 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
            r18.node = null;
            r1 = r17.f79470h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
            if (r10 == 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
            if (r5 == Long.MAX_VALUE) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
            p046rx.internal.operators.BackpressureUtils.produced(r18.requested, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
            r18.node = r7;
            r4 = r18.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo22746a(p046rx.subjects.ReplaySubject.ReplayProducer r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r18.getAndIncrement()
                if (r2 == 0) goto Lb
                return
            Lb:
                rx.Subscriber<? super T> r2 = r1.actual
                r4 = 1
            Le:
                java.util.concurrent.atomic.AtomicLong r5 = r1.requested
                long r5 = r5.get()
                java.lang.Object r7 = r1.node
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r7 = (p046rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) r7
                r8 = 0
                if (r7 != 0) goto L20
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r7 = r17.m22747c()
            L20:
                r10 = r8
            L21:
                r12 = 0
                r13 = 0
                int r14 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r14 == 0) goto L60
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L30
                r1.node = r13
                return
            L30:
                boolean r15 = r0.f79469g
                java.lang.Object r16 = r7.get()
                r3 = r16
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r3 = (p046rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) r3
                if (r3 != 0) goto L3f
                r16 = 1
                goto L41
            L3f:
                r16 = 0
            L41:
                if (r15 == 0) goto L53
                if (r16 == 0) goto L53
                r1.node = r13
                java.lang.Throwable r1 = r0.f79470h
                if (r1 == 0) goto L4f
                r2.onError(r1)
                goto L52
            L4f:
                r2.onCompleted()
            L52:
                return
            L53:
                if (r16 == 0) goto L56
                goto L60
            L56:
                T r7 = r3.value
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L21
            L60:
                if (r14 != 0) goto L86
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6b
                r1.node = r13
                return
            L6b:
                boolean r3 = r0.f79469g
                java.lang.Object r14 = r7.get()
                if (r14 != 0) goto L74
                r12 = 1
            L74:
                if (r3 == 0) goto L86
                if (r12 == 0) goto L86
                r1.node = r13
                java.lang.Throwable r1 = r0.f79470h
                if (r1 == 0) goto L82
                r2.onError(r1)
                goto L85
            L82:
                r2.onCompleted()
            L85:
                return
            L86:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L98
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L98
                java.util.concurrent.atomic.AtomicLong r3 = r1.requested
                p046rx.internal.operators.BackpressureUtils.produced(r3, r10)
            L98:
                r1.node = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Le
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.mo22746a(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        /* renamed from: b */
        public void m22748b() {
            long now = this.f79465c.now() - this.f79464b;
            TimedNode<T> timedNode = this.f79466d;
            TimedNode<T> timedNode2 = timedNode;
            while (true) {
                TimedNode<T> timedNode3 = timedNode2.get();
                if (timedNode3 == null || timedNode3.timestamp > now) {
                    break;
                }
                timedNode2 = timedNode3;
            }
            if (timedNode != timedNode2) {
                this.f79466d = timedNode2;
            }
        }

        /* renamed from: c */
        public TimedNode m22747c() {
            long now = this.f79465c.now() - this.f79464b;
            TimedNode<T> timedNode = this.f79466d;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null || timedNode2.timestamp > now) {
                    break;
                }
                timedNode = timedNode2;
            }
            return timedNode;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void complete() {
            m22748b();
            this.f79469g = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void error(Throwable th2) {
            m22748b();
            this.f79470h = th2;
            this.f79469g = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public boolean isEmpty() {
            if (m22747c().get() == null) {
                return true;
            }
            return false;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object last() {
            TimedNode<T> m22747c = m22747c();
            while (true) {
                TimedNode<T> timedNode = m22747c.get();
                if (timedNode != null) {
                    m22747c = timedNode;
                } else {
                    return m22747c.value;
                }
            }
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void next(Object obj) {
            TimedNode<T> timedNode;
            long now = this.f79465c.now();
            TimedNode timedNode2 = new TimedNode(obj, now);
            this.f79467e.set(timedNode2);
            this.f79467e = timedNode2;
            long j = now - this.f79464b;
            int i = this.f79468f;
            TimedNode<T> timedNode3 = this.f79466d;
            if (i == this.f79463a) {
                timedNode = timedNode3.get();
            } else {
                i++;
                timedNode = timedNode3;
            }
            while (true) {
                TimedNode<T> timedNode4 = timedNode.get();
                if (timedNode4 == null || timedNode4.timestamp > j) {
                    break;
                }
                i--;
                timedNode = timedNode4;
            }
            this.f79468f = i;
            if (timedNode != timedNode3) {
                this.f79466d = timedNode;
            }
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public int size() {
            TimedNode<T> timedNode = m22747c().get();
            int i = 0;
            while (timedNode != null && i != Integer.MAX_VALUE) {
                timedNode = timedNode.get();
                i++;
            }
            return i;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList();
            for (TimedNode<T> timedNode = m22747c().get(); timedNode != null; timedNode = timedNode.get()) {
                arrayList.add(timedNode.value);
            }
            return arrayList.toArray(objArr);
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Throwable error() {
            return this.f79470h;
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$b */
    /* loaded from: classes7.dex */
    public static final class C13868b implements InterfaceC13867a {

        /* renamed from: a */
        public final int f79477a;

        /* renamed from: b */
        public volatile int f79478b;

        /* renamed from: c */
        public final Object[] f79479c;

        /* renamed from: d */
        public Object[] f79480d;

        /* renamed from: e */
        public int f79481e;

        /* renamed from: f */
        public volatile boolean f79482f;

        /* renamed from: g */
        public Throwable f79483g;

        public C13868b(int i) {
            this.f79477a = i;
            Object[] objArr = new Object[i + 1];
            this.f79479c = objArr;
            this.f79480d = objArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
            if (r17 != 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
            if (r2.isUnsubscribed() == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
            r20.node = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
            r11 = r19.f79482f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
            if (r10 != r19.f79478b) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
            r16 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
            r16 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
            if (r11 == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
            if (r16 == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
            r20.node = null;
            r1 = r19.f79483g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
            if (r1 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
            if (r13 == 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
            if (r6 == Long.MAX_VALUE) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
            p046rx.internal.operators.BackpressureUtils.produced(r20.requested, r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
            r20.index = r10;
            r20.tailIndex = r9;
            r20.node = r8;
            r5 = r20.addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo22746a(p046rx.subjects.ReplaySubject.ReplayProducer r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                int r2 = r20.getAndIncrement()
                if (r2 == 0) goto Lb
                return
            Lb:
                rx.Subscriber<? super T> r2 = r1.actual
                int r3 = r0.f79477a
                r4 = 1
                r5 = 1
            L11:
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                long r6 = r6.get()
                java.lang.Object r8 = r1.node
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                if (r8 != 0) goto L1f
                java.lang.Object[] r8 = r0.f79479c
            L1f:
                int r9 = r1.tailIndex
                int r10 = r1.index
                r13 = 0
            L25:
                r15 = 0
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 == 0) goto L64
                boolean r18 = r2.isUnsubscribed()
                if (r18 == 0) goto L33
                r1.node = r15
                return
            L33:
                boolean r11 = r0.f79482f
                int r12 = r0.f79478b
                if (r10 != r12) goto L3b
                r12 = 1
                goto L3c
            L3b:
                r12 = 0
            L3c:
                if (r11 == 0) goto L4e
                if (r12 == 0) goto L4e
                r1.node = r15
                java.lang.Throwable r1 = r0.f79483g
                if (r1 == 0) goto L4a
                r2.onError(r1)
                goto L4d
            L4a:
                r2.onCompleted()
            L4d:
                return
            L4e:
                if (r12 == 0) goto L51
                goto L64
            L51:
                if (r9 != r3) goto L58
                r8 = r8[r9]
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                r9 = 0
            L58:
                r11 = r8[r9]
                r2.onNext(r11)
                r11 = 1
                long r13 = r13 + r11
                int r9 = r9 + r4
                int r10 = r10 + 1
                goto L25
            L64:
                if (r17 != 0) goto L8c
                boolean r11 = r2.isUnsubscribed()
                if (r11 == 0) goto L6f
                r1.node = r15
                return
            L6f:
                boolean r11 = r0.f79482f
                int r12 = r0.f79478b
                if (r10 != r12) goto L78
                r16 = 1
                goto L7a
            L78:
                r16 = 0
            L7a:
                if (r11 == 0) goto L8c
                if (r16 == 0) goto L8c
                r1.node = r15
                java.lang.Throwable r1 = r0.f79483g
                if (r1 == 0) goto L88
                r2.onError(r1)
                goto L8b
            L88:
                r2.onCompleted()
            L8b:
                return
            L8c:
                r11 = 0
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 == 0) goto La0
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r15 == 0) goto La0
                java.util.concurrent.atomic.AtomicLong r6 = r1.requested
                p046rx.internal.operators.BackpressureUtils.produced(r6, r13)
            La0:
                r1.index = r10
                r1.tailIndex = r9
                r1.node = r8
                int r5 = -r5
                int r5 = r1.addAndGet(r5)
                if (r5 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.subjects.ReplaySubject.C13868b.mo22746a(rx.subjects.ReplaySubject$ReplayProducer):void");
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void complete() {
            this.f79482f = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void error(Throwable th2) {
            if (this.f79482f) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79483g = th2;
            this.f79482f = true;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public boolean isEmpty() {
            if (this.f79478b == 0) {
                return true;
            }
            return false;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object last() {
            int i = this.f79478b;
            if (i == 0) {
                return null;
            }
            Object[] objArr = this.f79479c;
            int i2 = this.f79477a;
            while (i >= i2) {
                objArr = objArr[i2];
                i -= i2;
            }
            return objArr[i - 1];
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public void next(Object obj) {
            if (this.f79482f) {
                return;
            }
            int i = this.f79481e;
            Object[] objArr = this.f79480d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = obj;
                this.f79481e = 1;
                objArr[i] = objArr2;
                this.f79480d = objArr2;
            } else {
                objArr[i] = obj;
                this.f79481e = i + 1;
            }
            this.f79478b++;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public int size() {
            return this.f79478b;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Object[] toArray(Object[] objArr) {
            int i = this.f79478b;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            Object[] objArr2 = this.f79479c;
            int i2 = this.f79477a;
            int i3 = 0;
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= i) {
                    break;
                }
                System.arraycopy(objArr2, 0, objArr, i3, i2);
                objArr2 = objArr2[i2];
                i3 = i4;
            }
            System.arraycopy(objArr2, 0, objArr, i3, i - i3);
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        @Override // p046rx.subjects.ReplaySubject.InterfaceC13867a
        public Throwable error() {
            return this.f79483g;
        }
    }
}
