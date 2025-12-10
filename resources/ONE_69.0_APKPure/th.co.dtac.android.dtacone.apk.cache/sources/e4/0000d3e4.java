package io.reactivex.processors;

import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: e */
    public static final Object[] f66280e = new Object[0];

    /* renamed from: f */
    public static final ReplaySubscription[] f66281f = new ReplaySubscription[0];

    /* renamed from: g */
    public static final ReplaySubscription[] f66282g = new ReplaySubscription[0];

    /* renamed from: b */
    public final InterfaceC11151a f66283b;

    /* renamed from: c */
    public boolean f66284c;

    /* renamed from: d */
    public final AtomicReference f66285d = new AtomicReference(f66281f);

    /* loaded from: classes5.dex */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final Subscriber<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        public ReplaySubscription(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.downstream = subscriber;
            this.state = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.m30197f(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                this.state.f66283b.mo30191a(this);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        public TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11151a {
        /* renamed from: a */
        void mo30191a(ReplaySubscription replaySubscription);

        void complete();

        void error(Throwable th2);

        Throwable getError();

        Object getValue();

        Object[] getValues(Object[] objArr);

        boolean isDone();

        void next(Object obj);

        int size();

        void trimHead();
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$b */
    /* loaded from: classes5.dex */
    public static final class C11152b implements InterfaceC11151a {

        /* renamed from: a */
        public final int f66286a;

        /* renamed from: b */
        public final long f66287b;

        /* renamed from: c */
        public final TimeUnit f66288c;

        /* renamed from: d */
        public final Scheduler f66289d;

        /* renamed from: e */
        public int f66290e;

        /* renamed from: f */
        public volatile TimedNode f66291f;

        /* renamed from: g */
        public TimedNode f66292g;

        /* renamed from: h */
        public Throwable f66293h;

        /* renamed from: i */
        public volatile boolean f66294i;

        public C11152b(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f66286a = ObjectHelper.verifyPositive(i, "maxSize");
            this.f66287b = ObjectHelper.verifyPositive(j, "maxAge");
            this.f66288c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.f66289d = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            TimedNode timedNode = new TimedNode(null, 0L);
            this.f66292g = timedNode;
            this.f66291f = timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        /* renamed from: a */
        public void mo30191a(ReplaySubscription replaySubscription) {
            int i;
            boolean z;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.downstream;
            TimedNode<T> timedNode = (TimedNode) replaySubscription.index;
            if (timedNode == null) {
                timedNode = m30196b();
            }
            long j = replaySubscription.emitted;
            int i2 = 1;
            do {
                long j2 = replaySubscription.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else {
                        boolean z2 = this.f66294i;
                        TimedNode<T> timedNode2 = timedNode.get();
                        if (timedNode2 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.f66293h;
                            if (th2 == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th2);
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            subscriber.onNext((T) timedNode2.value);
                            j++;
                            timedNode = timedNode2;
                        }
                    }
                }
                if (i == 0) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else if (this.f66294i && timedNode.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        Throwable th3 = this.f66293h;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                replaySubscription.index = timedNode;
                replaySubscription.emitted = j;
                i2 = replaySubscription.addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: b */
        public TimedNode m30196b() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.f66291f;
            long now = this.f66289d.now(this.f66288c) - this.f66287b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > now) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        /* renamed from: c */
        public int m30195c(TimedNode timedNode) {
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void complete() {
            m30193e();
            this.f66294i = true;
        }

        /* renamed from: d */
        public void m30194d() {
            int i = this.f66290e;
            if (i > this.f66286a) {
                this.f66290e = i - 1;
                this.f66291f = this.f66291f.get();
            }
            long now = this.f66289d.now(this.f66288c) - this.f66287b;
            TimedNode<T> timedNode = this.f66291f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.f66291f = timedNode;
                    return;
                } else if (timedNode2.time > now) {
                    this.f66291f = timedNode;
                    return;
                } else {
                    timedNode = timedNode2;
                }
            }
        }

        /* renamed from: e */
        public void m30193e() {
            long now = this.f66289d.now(this.f66288c) - this.f66287b;
            TimedNode<T> timedNode = this.f66291f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.f66291f = new TimedNode(null, 0L);
                        return;
                    } else {
                        this.f66291f = timedNode;
                        return;
                    }
                } else if (timedNode2.time > now) {
                    if (timedNode.value != null) {
                        TimedNode timedNode3 = new TimedNode(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.f66291f = timedNode3;
                        return;
                    }
                    this.f66291f = timedNode;
                    return;
                } else {
                    timedNode = timedNode2;
                }
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void error(Throwable th2) {
            m30193e();
            this.f66293h = th2;
            this.f66294i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Throwable getError() {
            return this.f66293h;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object getValue() {
            TimedNode<T> timedNode = this.f66291f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.time < this.f66289d.now(this.f66288c) - this.f66287b) {
                return null;
            }
            return timedNode.value;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object[] getValues(Object[] objArr) {
            TimedNode<T> m30196b = m30196b();
            int m30195c = m30195c(m30196b);
            if (m30195c == 0) {
                if (objArr.length != 0) {
                    objArr[0] = null;
                }
            } else {
                if (objArr.length < m30195c) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m30195c);
                }
                for (int i = 0; i != m30195c; i++) {
                    m30196b = m30196b.get();
                    objArr[i] = m30196b.value;
                }
                if (objArr.length > m30195c) {
                    objArr[m30195c] = null;
                }
            }
            return objArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public boolean isDone() {
            return this.f66294i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void next(Object obj) {
            TimedNode timedNode = new TimedNode(obj, this.f66289d.now(this.f66288c));
            TimedNode timedNode2 = this.f66292g;
            this.f66292g = timedNode;
            this.f66290e++;
            timedNode2.set(timedNode);
            m30194d();
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public int size() {
            return m30195c(m30196b());
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void trimHead() {
            if (this.f66291f.value != null) {
                TimedNode timedNode = new TimedNode(null, 0L);
                timedNode.lazySet(this.f66291f.get());
                this.f66291f = timedNode;
            }
        }
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$c */
    /* loaded from: classes5.dex */
    public static final class C11153c implements InterfaceC11151a {

        /* renamed from: a */
        public final int f66295a;

        /* renamed from: b */
        public int f66296b;

        /* renamed from: c */
        public volatile Node f66297c;

        /* renamed from: d */
        public Node f66298d;

        /* renamed from: e */
        public Throwable f66299e;

        /* renamed from: f */
        public volatile boolean f66300f;

        public C11153c(int i) {
            this.f66295a = ObjectHelper.verifyPositive(i, "maxSize");
            Node node = new Node(null);
            this.f66298d = node;
            this.f66297c = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        /* renamed from: a */
        public void mo30191a(ReplaySubscription replaySubscription) {
            int i;
            boolean z;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.downstream;
            Node<T> node = (Node) replaySubscription.index;
            if (node == null) {
                node = this.f66297c;
            }
            long j = replaySubscription.emitted;
            int i2 = 1;
            do {
                long j2 = replaySubscription.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else {
                        boolean z2 = this.f66300f;
                        Node<T> node2 = node.get();
                        if (node2 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th2 = this.f66299e;
                            if (th2 == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th2);
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            subscriber.onNext((T) node2.value);
                            j++;
                            node = node2;
                        }
                    }
                }
                if (i == 0) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else if (this.f66300f && node.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        Throwable th3 = this.f66299e;
                        if (th3 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                replaySubscription.index = node;
                replaySubscription.emitted = j;
                i2 = replaySubscription.addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: b */
        public void m30192b() {
            int i = this.f66296b;
            if (i > this.f66295a) {
                this.f66296b = i - 1;
                this.f66297c = this.f66297c.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void complete() {
            trimHead();
            this.f66300f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void error(Throwable th2) {
            this.f66299e = th2;
            trimHead();
            this.f66300f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Throwable getError() {
            return this.f66299e;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object getValue() {
            Node<T> node = this.f66297c;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object[] getValues(Object[] objArr) {
            Node<T> node = this.f66297c;
            Node<T> node2 = node;
            int i = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i++;
            }
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                node = node.get();
                objArr[i2] = node.value;
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public boolean isDone() {
            return this.f66300f;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void next(Object obj) {
            Node node = new Node(obj);
            Node node2 = this.f66298d;
            this.f66298d = node;
            this.f66296b++;
            node2.set(node);
            m30192b();
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public int size() {
            Node<T> node = this.f66297c;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = node.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void trimHead() {
            if (this.f66297c.value != null) {
                Node node = new Node(null);
                node.lazySet(this.f66297c.get());
                this.f66297c = node;
            }
        }
    }

    /* renamed from: io.reactivex.processors.ReplayProcessor$d */
    /* loaded from: classes5.dex */
    public static final class C11154d implements InterfaceC11151a {

        /* renamed from: a */
        public final List f66301a;

        /* renamed from: b */
        public Throwable f66302b;

        /* renamed from: c */
        public volatile boolean f66303c;

        /* renamed from: d */
        public volatile int f66304d;

        public C11154d(int i) {
            this.f66301a = new ArrayList(ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
            if (r10 != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
            if (r14.cancelled == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
            r14.index = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
            r7 = r13.f66303c;
            r8 = r13.f66304d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
            if (r7 == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
            if (r2 != r8) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
            r14.index = null;
            r14.cancelled = true;
            r14 = r13.f66302b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
            if (r14 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
            r1.onError(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
            r14.index = java.lang.Integer.valueOf(r2);
            r14.emitted = r3;
            r6 = r14.addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo30191a(io.reactivex.processors.ReplayProcessor.ReplaySubscription r14) {
            /*
                r13 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.List r0 = r13.f66301a
                org.reactivestreams.Subscriber<? super T> r1 = r14.downstream
                java.lang.Object r2 = r14.index
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L16
                int r2 = r2.intValue()
                goto L1d
            L16:
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r14.index = r3
            L1d:
                long r3 = r14.emitted
                r5 = 1
                r6 = 1
            L21:
                java.util.concurrent.atomic.AtomicLong r7 = r14.requested
                long r7 = r7.get()
            L27:
                r9 = 0
                int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r10 == 0) goto L5b
                boolean r11 = r14.cancelled
                if (r11 == 0) goto L33
                r14.index = r9
                return
            L33:
                boolean r11 = r13.f66303c
                int r12 = r13.f66304d
                if (r11 == 0) goto L4b
                if (r2 != r12) goto L4b
                r14.index = r9
                r14.cancelled = r5
                java.lang.Throwable r14 = r13.f66302b
                if (r14 != 0) goto L47
                r1.onComplete()
                goto L4a
            L47:
                r1.onError(r14)
            L4a:
                return
            L4b:
                if (r2 != r12) goto L4e
                goto L5b
            L4e:
                java.lang.Object r9 = r0.get(r2)
                r1.onNext(r9)
                int r2 = r2 + 1
                r9 = 1
                long r3 = r3 + r9
                goto L27
            L5b:
                if (r10 != 0) goto L7c
                boolean r7 = r14.cancelled
                if (r7 == 0) goto L64
                r14.index = r9
                return
            L64:
                boolean r7 = r13.f66303c
                int r8 = r13.f66304d
                if (r7 == 0) goto L7c
                if (r2 != r8) goto L7c
                r14.index = r9
                r14.cancelled = r5
                java.lang.Throwable r14 = r13.f66302b
                if (r14 != 0) goto L78
                r1.onComplete()
                goto L7b
            L78:
                r1.onError(r14)
            L7b:
                return
            L7c:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                r14.index = r7
                r14.emitted = r3
                int r6 = -r6
                int r6 = r14.addAndGet(r6)
                if (r6 != 0) goto L21
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.ReplayProcessor.C11154d.mo30191a(io.reactivex.processors.ReplayProcessor$ReplaySubscription):void");
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void complete() {
            this.f66303c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void error(Throwable th2) {
            this.f66302b = th2;
            this.f66303c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Throwable getError() {
            return this.f66302b;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object getValue() {
            int i = this.f66304d;
            if (i == 0) {
                return null;
            }
            return this.f66301a.get(i - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public Object[] getValues(Object[] objArr) {
            int i = this.f66304d;
            if (i == 0) {
                if (objArr.length != 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            List list = this.f66301a;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = list.get(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public boolean isDone() {
            return this.f66303c;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void next(Object obj) {
            this.f66301a.add(obj);
            this.f66304d++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public int size() {
            return this.f66304d;
        }

        @Override // io.reactivex.processors.ReplayProcessor.InterfaceC11151a
        public void trimHead() {
        }
    }

    public ReplayProcessor(InterfaceC11151a interfaceC11151a) {
        this.f66283b = interfaceC11151a;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new C11154d(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i) {
        return new ReplayProcessor<>(new C11153c(i));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new C11152b(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return new ReplayProcessor<>(new C11152b(i, j, timeUnit, scheduler));
    }

    public void cleanupBuffer() {
        this.f66283b.trimHead();
    }

    /* renamed from: e */
    public boolean m30198e(ReplaySubscription replaySubscription) {
        ReplaySubscription[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = (ReplaySubscription[]) this.f66285d.get();
            if (replaySubscriptionArr == f66282g) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!AbstractC23094xo1.m479a(this.f66285d, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    /* renamed from: f */
    public void m30197f(ReplaySubscription replaySubscription) {
        ReplaySubscription[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = (ReplaySubscription[]) this.f66285d.get();
            if (replaySubscriptionArr != f66282g && replaySubscriptionArr != f66281f) {
                int length = replaySubscriptionArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (replaySubscriptionArr[i] == replaySubscription) {
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
                    replaySubscriptionArr2 = f66281f;
                } else {
                    ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                    System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                    System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                    replaySubscriptionArr2 = replaySubscriptionArr3;
                }
            } else {
                return;
            }
        } while (!AbstractC23094xo1.m479a(this.f66285d, replaySubscriptionArr, replaySubscriptionArr2));
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        InterfaceC11151a interfaceC11151a = this.f66283b;
        if (interfaceC11151a.isDone()) {
            return interfaceC11151a.getError();
        }
        return null;
    }

    public T getValue() {
        return (T) this.f66283b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f66280e;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        InterfaceC11151a interfaceC11151a = this.f66283b;
        if (interfaceC11151a.isDone() && interfaceC11151a.getError() == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (((ReplaySubscription[]) this.f66285d.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        InterfaceC11151a interfaceC11151a = this.f66283b;
        if (interfaceC11151a.isDone() && interfaceC11151a.getError() != null) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f66283b.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f66284c) {
            return;
        }
        this.f66284c = true;
        InterfaceC11151a interfaceC11151a = this.f66283b;
        interfaceC11151a.complete();
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f66285d.getAndSet(f66282g)) {
            interfaceC11151a.mo30191a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66284c) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f66284c = true;
        InterfaceC11151a interfaceC11151a = this.f66283b;
        interfaceC11151a.error(th2);
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f66285d.getAndSet(f66282g)) {
            interfaceC11151a.mo30191a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66284c) {
            return;
        }
        InterfaceC11151a interfaceC11151a = this.f66283b;
        interfaceC11151a.next(t);
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f66285d.get()) {
            interfaceC11151a.mo30191a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber, io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f66284c) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        ReplaySubscription replaySubscription = new ReplaySubscription(subscriber, this);
        subscriber.onSubscribe(replaySubscription);
        if (m30198e(replaySubscription) && replaySubscription.cancelled) {
            m30197f(replaySubscription);
        } else {
            this.f66283b.mo30191a(replaySubscription);
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i) {
        return new ReplayProcessor<>(new C11154d(i));
    }

    public T[] getValues(T[] tArr) {
        return (T[]) this.f66283b.getValues(tArr);
    }
}