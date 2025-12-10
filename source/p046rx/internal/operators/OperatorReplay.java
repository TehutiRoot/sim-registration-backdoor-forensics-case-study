package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.internal.util.OpenHashSet;
import p046rx.observables.ConnectableObservable;
import p046rx.schedulers.Timestamped;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorReplay */
/* loaded from: classes7.dex */
public final class OperatorReplay<T> extends ConnectableObservable<T> implements Subscription {

    /* renamed from: e */
    public static final Func0 f78567e = new C13613a();

    /* renamed from: b */
    public final Observable f78568b;

    /* renamed from: c */
    public final AtomicReference f78569c;

    /* renamed from: d */
    public final Func0 f78570d;

    /* renamed from: rx.internal.operators.OperatorReplay$BoundedReplayBuffer */
    /* loaded from: classes7.dex */
    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements InterfaceC13622h {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node initialHead = getInitialHead();
            while (true) {
                initialHead = initialHead.get();
                if (initialHead != null) {
                    Object leaveTransform = leaveTransform(initialHead.value);
                    if (!NotificationLite.isCompleted(leaveTransform) && !NotificationLite.isError(leaveTransform)) {
                        collection.add((Object) NotificationLite.getValue(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public final void complete() {
            Object enterTransform = enterTransform(NotificationLite.completed());
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public final void error(Throwable th2) {
            Object enterTransform = enterTransform(NotificationLite.error(th2));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncateFinal();
        }

        public Node getInitialHead() {
            return get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            if (obj != null && NotificationLite.isCompleted(leaveTransform(obj))) {
                return true;
            }
            return false;
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            if (obj != null && NotificationLite.isError(leaveTransform(obj))) {
                return true;
            }
            return false;
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public final void next(T t) {
            Object enterTransform = enterTransform(NotificationLite.next(t));
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(enterTransform, j));
            truncate();
        }

        public final void removeFirst() {
            Node node = get().get();
            if (node != null) {
                this.size--;
                setFirst(node);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        public final void removeSome(int i) {
            Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public final void replay(InnerProducer<T> innerProducer) {
            Subscriber<? super T> subscriber;
            Node node;
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        Node node2 = (Node) innerProducer.index();
                        if (node2 == null) {
                            node2 = getInitialHead();
                            innerProducer.index = node2;
                            innerProducer.addTotalRequested(node2.index);
                        }
                        if (innerProducer.isUnsubscribed() || (subscriber = innerProducer.child) == null) {
                            return;
                        }
                        long j = innerProducer.get();
                        long j2 = 0;
                        while (j2 != j && (node = node2.get()) != null) {
                            Object leaveTransform = leaveTransform(node.value);
                            try {
                                if (NotificationLite.accept(subscriber, leaveTransform)) {
                                    innerProducer.index = null;
                                    return;
                                }
                                j2++;
                                if (innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                node2 = node;
                            } catch (Throwable th2) {
                                innerProducer.index = null;
                                Exceptions.throwIfFatal(th2);
                                innerProducer.unsubscribe();
                                if (!NotificationLite.isError(leaveTransform) && !NotificationLite.isCompleted(leaveTransform)) {
                                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, NotificationLite.getValue(leaveTransform)));
                                    return;
                                }
                                return;
                            }
                        }
                        if (j2 != 0) {
                            innerProducer.index = node2;
                            if (j != Long.MAX_VALUE) {
                                innerProducer.produced(j2);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public void truncate() {
        }

        public void truncateFinal() {
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$InnerProducer */
    /* loaded from: classes7.dex */
    public static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        Subscriber<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final C13623i parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(C13623i c13623i, Subscriber<? super T> subscriber) {
            this.parent = c13623i;
            this.child = subscriber;
        }

        public void addTotalRequested(long j) {
            long j2;
            long j3;
            do {
                j2 = this.totalRequested.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.totalRequested.compareAndSet(j2, j3));
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j3 = j2 - j;
                    if (j3 < 0) {
                        throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 >= 0 && i == 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            addTotalRequested(j);
            this.parent.m23000f(this);
            this.parent.f78587a.replay(this);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m22999g(this);
                this.parent.m23000f(this);
                this.child = null;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$Node */
    /* loaded from: classes7.dex */
    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$SizeAndTimeBoundReplayBuffer */
    /* loaded from: classes7.dex */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAgeInMillis;
        final Scheduler scheduler;

        public SizeAndTimeBoundReplayBuffer(int i, long j, Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i;
            this.maxAgeInMillis = j;
        }

        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new Timestamped(this.scheduler.now(), obj);
        }

        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Node getInitialHead() {
            Node node;
            long now = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                Object obj = node2.value;
                Object leaveTransform = leaveTransform(obj);
                if (NotificationLite.isCompleted(leaveTransform) || NotificationLite.isError(leaveTransform) || ((Timestamped) obj).getTimestampMillis() > now) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((Timestamped) obj).getValue();
        }

        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long now = this.scheduler.now() - this.maxAgeInMillis;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i2 = this.size;
                    if (i2 > this.limit) {
                        i++;
                        this.size = i2 - 1;
                        node3 = node2.get();
                    } else if (((Timestamped) node2.value).getTimestampMillis() > now) {
                        break;
                    } else {
                        i++;
                        this.size--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
            setFirst(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
            return;
         */
        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void truncateFinal() {
            /*
                r10 = this;
                rx.Scheduler r0 = r10.scheduler
                long r0 = r0.now()
                long r2 = r10.maxAgeInMillis
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                rx.internal.operators.OperatorReplay$Node r2 = (p046rx.internal.operators.OperatorReplay.Node) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.OperatorReplay$Node r3 = (p046rx.internal.operators.OperatorReplay.Node) r3
                r4 = 0
            L16:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3a
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L3a
                java.lang.Object r5 = r2.value
                rx.schedulers.Timestamped r5 = (p046rx.schedulers.Timestamped) r5
                long r7 = r5.getTimestampMillis()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3a
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                rx.internal.operators.OperatorReplay$Node r3 = (p046rx.internal.operators.OperatorReplay.Node) r3
                goto L16
            L3a:
                if (r4 == 0) goto L3f
                r10.setFirst(r3)
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorReplay.SizeAndTimeBoundReplayBuffer.truncateFinal():void");
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$SizeBoundReplayBuffer */
    /* loaded from: classes7.dex */
    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // p046rx.internal.operators.OperatorReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$UnboundedReplayBuffer */
    /* loaded from: classes7.dex */
    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements InterfaceC13622h {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public void complete() {
            add(NotificationLite.completed());
            this.size++;
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.size++;
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        @Override // p046rx.internal.operators.OperatorReplay.InterfaceC13622h
        public void replay(InnerProducer<T> innerProducer) {
            int i;
            synchronized (innerProducer) {
                try {
                    if (innerProducer.emitting) {
                        innerProducer.missed = true;
                        return;
                    }
                    innerProducer.emitting = true;
                    while (!innerProducer.isUnsubscribed()) {
                        int i2 = this.size;
                        Integer num = (Integer) innerProducer.index();
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        Subscriber<? super T> subscriber = innerProducer.child;
                        if (subscriber == null) {
                            return;
                        }
                        long j = innerProducer.get();
                        long j2 = 0;
                        while (j2 != j && i < i2) {
                            Object obj = get(i);
                            try {
                                if (NotificationLite.accept(subscriber, obj) || innerProducer.isUnsubscribed()) {
                                    return;
                                }
                                i++;
                                j2++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                innerProducer.unsubscribe();
                                if (!NotificationLite.isError(obj) && !NotificationLite.isCompleted(obj)) {
                                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(th2, NotificationLite.getValue(obj)));
                                    return;
                                }
                                return;
                            }
                        }
                        if (j2 != 0) {
                            innerProducer.index = Integer.valueOf(i);
                            if (j != Long.MAX_VALUE) {
                                innerProducer.produced(j2);
                            }
                        }
                        synchronized (innerProducer) {
                            try {
                                if (!innerProducer.missed) {
                                    innerProducer.emitting = false;
                                    return;
                                }
                                innerProducer.missed = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$a */
    /* loaded from: classes7.dex */
    public static class C13613a implements Func0 {
        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$b */
    /* loaded from: classes7.dex */
    public static class C13614b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func0 f78571a;

        /* renamed from: b */
        public final /* synthetic */ Func1 f78572b;

        /* renamed from: rx.internal.operators.OperatorReplay$b$a */
        /* loaded from: classes7.dex */
        public class C13615a implements Action1 {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78573a;

            public C13615a(Subscriber subscriber) {
                this.f78573a = subscriber;
            }

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(Subscription subscription) {
                this.f78573a.add(subscription);
            }
        }

        public C13614b(Func0 func0, Func1 func1) {
            this.f78571a = func0;
            this.f78572b = func1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            try {
                ConnectableObservable connectableObservable = (ConnectableObservable) this.f78571a.call();
                ((Observable) this.f78572b.call(connectableObservable)).subscribe(subscriber);
                connectableObservable.connect(new C13615a(subscriber));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$c */
    /* loaded from: classes7.dex */
    public static class C13616c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f78575a;

        /* renamed from: rx.internal.operators.OperatorReplay$c$a */
        /* loaded from: classes7.dex */
        public class C13617a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78576a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13617a(Subscriber subscriber, Subscriber subscriber2) {
                super(subscriber);
                this.f78576a = subscriber2;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78576a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78576a.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f78576a.onNext(obj);
            }
        }

        public C13616c(Observable observable) {
            this.f78575a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f78575a.unsafeSubscribe(new C13617a(subscriber, subscriber));
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$d */
    /* loaded from: classes7.dex */
    public static class C13618d extends ConnectableObservable {

        /* renamed from: b */
        public final /* synthetic */ ConnectableObservable f78578b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13618d(Observable.OnSubscribe onSubscribe, ConnectableObservable connectableObservable) {
            super(onSubscribe);
            this.f78578b = connectableObservable;
        }

        @Override // p046rx.observables.ConnectableObservable
        public void connect(Action1 action1) {
            this.f78578b.connect(action1);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$e */
    /* loaded from: classes7.dex */
    public static class C13619e implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ int f78579a;

        public C13619e(int i) {
            this.f78579a = i;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public InterfaceC13622h call() {
            return new SizeBoundReplayBuffer(this.f78579a);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$f */
    /* loaded from: classes7.dex */
    public static class C13620f implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ int f78580a;

        /* renamed from: b */
        public final /* synthetic */ long f78581b;

        /* renamed from: c */
        public final /* synthetic */ Scheduler f78582c;

        public C13620f(int i, long j, Scheduler scheduler) {
            this.f78580a = i;
            this.f78581b = j;
            this.f78582c = scheduler;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public InterfaceC13622h call() {
            return new SizeAndTimeBoundReplayBuffer(this.f78580a, this.f78581b, this.f78582c);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$g */
    /* loaded from: classes7.dex */
    public static class C13621g implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78583a;

        /* renamed from: b */
        public final /* synthetic */ Func0 f78584b;

        public C13621g(AtomicReference atomicReference, Func0 func0) {
            this.f78583a = atomicReference;
            this.f78584b = func0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            C13623i c13623i;
            while (true) {
                c13623i = (C13623i) this.f78583a.get();
                if (c13623i != null) {
                    break;
                }
                C13623i c13623i2 = new C13623i((InterfaceC13622h) this.f78584b.call());
                c13623i2.m23002d();
                if (AbstractC17300An1.m69050a(this.f78583a, c13623i, c13623i2)) {
                    c13623i = c13623i2;
                    break;
                }
            }
            InnerProducer innerProducer = new InnerProducer(c13623i, subscriber);
            c13623i.m23004b(innerProducer);
            subscriber.add(innerProducer);
            c13623i.f78587a.replay(innerProducer);
            subscriber.setProducer(innerProducer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorReplay$h */
    /* loaded from: classes7.dex */
    public interface InterfaceC13622h {
        void complete();

        void error(Throwable th2);

        void next(Object obj);

        void replay(InnerProducer innerProducer);
    }

    /* renamed from: rx.internal.operators.OperatorReplay$i */
    /* loaded from: classes7.dex */
    public static final class C13623i extends Subscriber implements Subscription {

        /* renamed from: p */
        public static final InnerProducer[] f78585p = new InnerProducer[0];

        /* renamed from: q */
        public static final InnerProducer[] f78586q = new InnerProducer[0];

        /* renamed from: a */
        public final InterfaceC13622h f78587a;

        /* renamed from: b */
        public boolean f78588b;

        /* renamed from: c */
        public volatile boolean f78589c;

        /* renamed from: f */
        public volatile long f78592f;

        /* renamed from: g */
        public long f78593g;

        /* renamed from: i */
        public boolean f78595i;

        /* renamed from: j */
        public boolean f78596j;

        /* renamed from: k */
        public long f78597k;

        /* renamed from: l */
        public long f78598l;

        /* renamed from: m */
        public volatile Producer f78599m;

        /* renamed from: n */
        public List f78600n;

        /* renamed from: o */
        public boolean f78601o;

        /* renamed from: d */
        public final OpenHashSet f78590d = new OpenHashSet();

        /* renamed from: e */
        public InnerProducer[] f78591e = f78585p;

        /* renamed from: h */
        public final AtomicBoolean f78594h = new AtomicBoolean();

        /* renamed from: rx.internal.operators.OperatorReplay$i$a */
        /* loaded from: classes7.dex */
        public class C13624a implements Action0 {
            public C13624a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (!C13623i.this.f78589c) {
                    synchronized (C13623i.this.f78590d) {
                        try {
                            if (!C13623i.this.f78589c) {
                                C13623i.this.f78590d.terminate();
                                C13623i.this.f78592f++;
                                C13623i.this.f78589c = true;
                            }
                        } finally {
                        }
                    }
                }
            }
        }

        public C13623i(InterfaceC13622h interfaceC13622h) {
            this.f78587a = interfaceC13622h;
            request(0L);
        }

        /* renamed from: b */
        public boolean m23004b(InnerProducer innerProducer) {
            innerProducer.getClass();
            if (this.f78589c) {
                return false;
            }
            synchronized (this.f78590d) {
                try {
                    if (this.f78589c) {
                        return false;
                    }
                    this.f78590d.add(innerProducer);
                    this.f78592f++;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: c */
        public InnerProducer[] m23003c() {
            InnerProducer[] innerProducerArr;
            synchronized (this.f78590d) {
                Object[] values = this.f78590d.values();
                int length = values.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(values, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        /* renamed from: d */
        public void m23002d() {
            add(Subscriptions.create(new C13624a()));
        }

        /* renamed from: e */
        public void m23001e(long j, long j2) {
            long j3 = this.f78598l;
            Producer producer = this.f78599m;
            long j4 = j - j2;
            if (j4 != 0) {
                this.f78597k = j;
                if (producer != null) {
                    if (j3 != 0) {
                        this.f78598l = 0L;
                        producer.request(j3 + j4);
                        return;
                    }
                    producer.request(j4);
                    return;
                }
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.f78598l = j5;
            } else if (j3 != 0 && producer != null) {
                this.f78598l = 0L;
                producer.request(j3);
            }
        }

        /* renamed from: f */
        public void m23000f(InnerProducer innerProducer) {
            InnerProducer[] m23003c;
            long j;
            List<InnerProducer> list;
            boolean z;
            long j2;
            InnerProducer[] m23003c2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f78595i) {
                        if (innerProducer != null) {
                            List list2 = this.f78600n;
                            if (list2 == null) {
                                list2 = new ArrayList();
                                this.f78600n = list2;
                            }
                            list2.add(innerProducer);
                        } else {
                            this.f78601o = true;
                        }
                        this.f78596j = true;
                        return;
                    }
                    this.f78595i = true;
                    long j3 = this.f78597k;
                    if (innerProducer != null) {
                        j = Math.max(j3, innerProducer.totalRequested.get());
                    } else {
                        long j4 = j3;
                        for (InnerProducer innerProducer2 : m23003c()) {
                            if (innerProducer2 != null) {
                                j4 = Math.max(j4, innerProducer2.totalRequested.get());
                            }
                        }
                        j = j4;
                    }
                    m23001e(j, j3);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.f78596j) {
                                    this.f78595i = false;
                                    return;
                                }
                                this.f78596j = false;
                                list = this.f78600n;
                                this.f78600n = null;
                                z = this.f78601o;
                                this.f78601o = false;
                            } finally {
                            }
                        }
                        long j5 = this.f78597k;
                        if (list != null) {
                            j2 = j5;
                            for (InnerProducer innerProducer3 : list) {
                                j2 = Math.max(j2, innerProducer3.totalRequested.get());
                            }
                        } else {
                            j2 = j5;
                        }
                        if (z) {
                            for (InnerProducer innerProducer4 : m23003c()) {
                                if (innerProducer4 != null) {
                                    j2 = Math.max(j2, innerProducer4.totalRequested.get());
                                }
                            }
                        }
                        m23001e(j2, j5);
                    }
                } finally {
                }
            }
        }

        /* renamed from: g */
        public void m22999g(InnerProducer innerProducer) {
            if (this.f78589c) {
                return;
            }
            synchronized (this.f78590d) {
                try {
                    if (this.f78589c) {
                        return;
                    }
                    this.f78590d.remove(innerProducer);
                    if (this.f78590d.isEmpty()) {
                        this.f78591e = f78585p;
                    }
                    this.f78592f++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public void m22998h() {
            InnerProducer[] innerProducerArr = this.f78591e;
            if (this.f78593g != this.f78592f) {
                synchronized (this.f78590d) {
                    try {
                        innerProducerArr = this.f78591e;
                        Object[] values = this.f78590d.values();
                        int length = values.length;
                        if (innerProducerArr.length != length) {
                            innerProducerArr = new InnerProducer[length];
                            this.f78591e = innerProducerArr;
                        }
                        System.arraycopy(values, 0, innerProducerArr, 0, length);
                        this.f78593g = this.f78592f;
                    } finally {
                    }
                }
            }
            InterfaceC13622h interfaceC13622h = this.f78587a;
            for (InnerProducer innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    interfaceC13622h.replay(innerProducer);
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78588b) {
                this.f78588b = true;
                try {
                    this.f78587a.complete();
                    m22998h();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78588b) {
                this.f78588b = true;
                try {
                    this.f78587a.error(th2);
                    m22998h();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78588b) {
                this.f78587a.next(obj);
                m22998h();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (this.f78599m == null) {
                this.f78599m = producer;
                m23000f(null);
                m22998h();
                return;
            }
            throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
        }
    }

    public OperatorReplay(Observable.OnSubscribe onSubscribe, Observable observable, AtomicReference atomicReference, Func0 func0) {
        super(onSubscribe);
        this.f78568b = observable;
        this.f78569c = atomicReference;
        this.f78570d = func0;
    }

    /* renamed from: c */
    public static ConnectableObservable m23011c(Observable observable, Func0 func0) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new C13621g(atomicReference, func0), observable, atomicReference, func0);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        return m23011c(observable, f78567e);
    }

    public static <T, U, R> Observable<R> multicastSelector(Func0<? extends ConnectableObservable<U>> func0, Func1<? super Observable<U>, ? extends Observable<R>> func1) {
        return Observable.unsafeCreate(new C13614b(func0, func1));
    }

    public static <T> ConnectableObservable<T> observeOn(ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        return new C13618d(new C13616c(connectableObservable.observeOn(scheduler)), connectableObservable);
    }

    @Override // p046rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        C13623i c13623i;
        while (true) {
            c13623i = (C13623i) this.f78569c.get();
            if (c13623i != null && !c13623i.isUnsubscribed()) {
                break;
            }
            C13623i c13623i2 = new C13623i((InterfaceC13622h) this.f78570d.call());
            c13623i2.m23002d();
            if (AbstractC17300An1.m69050a(this.f78569c, c13623i, c13623i2)) {
                c13623i = c13623i2;
                break;
            }
        }
        boolean z = false;
        if (!c13623i.f78594h.get() && c13623i.f78594h.compareAndSet(false, true)) {
            z = true;
        }
        action1.call(c13623i);
        if (z) {
            this.f78568b.unsafeSubscribe(c13623i);
        }
    }

    @Override // p046rx.Subscription
    public boolean isUnsubscribed() {
        C13623i c13623i = (C13623i) this.f78569c.get();
        if (c13623i != null && !c13623i.isUnsubscribed()) {
            return false;
        }
        return true;
    }

    @Override // p046rx.Subscription
    public void unsubscribe() {
        this.f78569c.lazySet(null);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, int i) {
        if (i == Integer.MAX_VALUE) {
            return create(observable);
        }
        return m23011c(observable, new C13619e(i));
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observable, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return m23011c(observable, new C13620f(i, timeUnit.toMillis(j), scheduler));
    }
}
