package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    /* renamed from: e */
    public static final InterfaceC11040a f65453e = new C11048i();

    /* renamed from: a */
    public final ObservableSource f65454a;

    /* renamed from: b */
    public final AtomicReference f65455b;

    /* renamed from: c */
    public final InterfaceC11040a f65456c;

    /* renamed from: d */
    public final ObservableSource f65457d;

    /* loaded from: classes5.dex */
    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements InterfaceC11044e {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head != null) {
                    Object leaveTransform = leaveTransform(head.value);
                    if (!NotificationLite.isComplete(leaveTransform) && !NotificationLite.isError(leaveTransform)) {
                        collection.add((Object) NotificationLite.getValue(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public final void complete() {
            addLast(new Node(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public final void error(Throwable th2) {
            addLast(new Node(enterTransform(NotificationLite.error(th2))));
            truncateFinal();
        }

        public Node getHead() {
            return get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            if (obj != null && NotificationLite.isComplete(leaveTransform(obj))) {
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

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public final void next(T t) {
            addLast(new Node(enterTransform(NotificationLite.next(t))));
            truncate();
        }

        public final void removeFirst() {
            this.size--;
            setFirst(get().get());
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

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public final void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            do {
                Node node = (Node) innerDisposable.index();
                if (node == null) {
                    node = getHead();
                    innerDisposable.index = node;
                }
                while (!innerDisposable.isDisposed()) {
                    Node node2 = node.get();
                    if (node2 != null) {
                        if (NotificationLite.accept(leaveTransform(node2.value), innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        }
                        node = node2;
                    } else {
                        innerDisposable.index = node;
                        i = innerDisposable.addAndGet(-i);
                    }
                }
                innerDisposable.index = null;
                return;
            } while (i != 0);
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public abstract void truncate();

        public void truncateFinal() {
            trimHead();
        }
    }

    /* loaded from: classes5.dex */
    public static final class InnerDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final Observer<? super T> child;
        Object index;
        final ReplayObserver<T> parent;

        public InnerDisposable(ReplayObserver<T> replayObserver, Observer<? super T> observer) {
            this.parent = replayObserver;
            this.child = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.remove(this);
                this.index = null;
            }
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        public Node(Object obj) {
            this.value = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final InterfaceC11044e buffer;
        boolean done;
        final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public ReplayObserver(InterfaceC11044e interfaceC11044e) {
            this.buffer = interfaceC11044e;
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!AbstractC17300An1.m69050a(this.observers, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.observers.set(TERMINATED);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.observers.get() == TERMINATED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                replayFinal();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th2);
                replayFinal();
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (!this.done) {
                this.buffer.next(t);
                replay();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                replay();
            }
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (innerDisposableArr[i].equals(innerDisposable)) {
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
                    innerDisposableArr2 = EMPTY;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!AbstractC17300An1.m69050a(this.observers, innerDisposableArr, innerDisposableArr2));
        }

        public void replay() {
            for (InnerDisposable innerDisposable : this.observers.get()) {
                this.buffer.replay(innerDisposable);
            }
        }

        public void replayFinal() {
            for (InnerDisposable innerDisposable : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerDisposable);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final Scheduler scheduler;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.scheduler = scheduler;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new Timed(obj, this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    Timed timed = (Timed) node2.value;
                    if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > now) {
                        break;
                    }
                    node3 = node2.get();
                } else {
                    break;
                }
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long now = this.scheduler.now(this.unit) - this.maxAge;
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
                    } else if (((Timed) node2.value).time() > now) {
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

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
            setFirst(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
            return;
         */
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void truncateFinal() {
            /*
                r10 = this;
                io.reactivex.Scheduler r0 = r10.scheduler
                java.util.concurrent.TimeUnit r1 = r10.unit
                long r0 = r0.now(r1)
                long r2 = r10.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                r4 = 0
            L18:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3c
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L3c
                java.lang.Object r5 = r2.value
                io.reactivex.schedulers.Timed r5 = (io.reactivex.schedulers.Timed) r5
                long r7 = r5.time()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3c
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                goto L18
            L3c:
                if (r4 == 0) goto L41
                r10.setFirst(r3)
            L41:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.SizeAndTimeBoundReplayBuffer.truncateFinal():void");
        }
    }

    /* loaded from: classes5.dex */
    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements InterfaceC11044e {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11044e
        public void replay(InnerDisposable<T> innerDisposable) {
            int i;
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = innerDisposable.child;
            int i2 = 1;
            while (!innerDisposable.isDisposed()) {
                int i3 = this.size;
                Integer num = (Integer) innerDisposable.index();
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                while (i < i3) {
                    if (NotificationLite.accept(get(i), observer) || innerDisposable.isDisposed()) {
                        return;
                    }
                    i++;
                }
                innerDisposable.index = Integer.valueOf(i);
                i2 = innerDisposable.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11040a {
        InterfaceC11044e call();
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$b */
    /* loaded from: classes5.dex */
    public static final class C11041b implements Consumer {

        /* renamed from: a */
        public final ObserverResourceWrapper f65458a;

        public C11041b(ObserverResourceWrapper observerResourceWrapper) {
            this.f65458a = observerResourceWrapper;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Disposable disposable) {
            this.f65458a.setResource(disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$c */
    /* loaded from: classes5.dex */
    public static final class C11042c extends Observable {

        /* renamed from: a */
        public final Callable f65459a;

        /* renamed from: b */
        public final Function f65460b;

        public C11042c(Callable callable, Function function) {
            this.f65459a = callable;
            this.f65460b = function;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer observer) {
            try {
                ConnectableObservable connectableObservable = (ConnectableObservable) ObjectHelper.requireNonNull(this.f65459a.call(), "The connectableFactory returned a null ConnectableObservable");
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f65460b.apply(connectableObservable), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable.connect(new C11041b(observerResourceWrapper));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$d */
    /* loaded from: classes5.dex */
    public static final class C11043d extends ConnectableObservable {

        /* renamed from: a */
        public final ConnectableObservable f65461a;

        /* renamed from: b */
        public final Observable f65462b;

        public C11043d(ConnectableObservable connectableObservable, Observable observable) {
            this.f65461a = connectableObservable;
            this.f65462b = observable;
        }

        @Override // io.reactivex.observables.ConnectableObservable
        public void connect(Consumer consumer) {
            this.f65461a.connect(consumer);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer observer) {
            this.f65462b.subscribe(observer);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC11044e {
        void complete();

        void error(Throwable th2);

        void next(Object obj);

        void replay(InnerDisposable innerDisposable);
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$f */
    /* loaded from: classes5.dex */
    public static final class C11045f implements InterfaceC11040a {

        /* renamed from: a */
        public final int f65463a;

        public C11045f(int i) {
            this.f65463a = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11040a
        public InterfaceC11044e call() {
            return new SizeBoundReplayBuffer(this.f65463a);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$g */
    /* loaded from: classes5.dex */
    public static final class C11046g implements ObservableSource {

        /* renamed from: a */
        public final AtomicReference f65464a;

        /* renamed from: b */
        public final InterfaceC11040a f65465b;

        public C11046g(AtomicReference atomicReference, InterfaceC11040a interfaceC11040a) {
            this.f65464a = atomicReference;
            this.f65465b = interfaceC11040a;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(Observer observer) {
            ReplayObserver replayObserver;
            while (true) {
                replayObserver = (ReplayObserver) this.f65464a.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver replayObserver2 = new ReplayObserver(this.f65465b.call());
                if (AbstractC17300An1.m69050a(this.f65464a, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, observer);
            observer.onSubscribe(innerDisposable);
            replayObserver.add(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.remove(innerDisposable);
            } else {
                replayObserver.buffer.replay(innerDisposable);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$h */
    /* loaded from: classes5.dex */
    public static final class C11047h implements InterfaceC11040a {

        /* renamed from: a */
        public final int f65466a;

        /* renamed from: b */
        public final long f65467b;

        /* renamed from: c */
        public final TimeUnit f65468c;

        /* renamed from: d */
        public final Scheduler f65469d;

        public C11047h(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65466a = i;
            this.f65467b = j;
            this.f65468c = timeUnit;
            this.f65469d = scheduler;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11040a
        public InterfaceC11044e call() {
            return new SizeAndTimeBoundReplayBuffer(this.f65466a, this.f65467b, this.f65468c, this.f65469d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$i */
    /* loaded from: classes5.dex */
    public static final class C11048i implements InterfaceC11040a {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.InterfaceC11040a
        public InterfaceC11044e call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public ObservableReplay(ObservableSource observableSource, ObservableSource observableSource2, AtomicReference atomicReference, InterfaceC11040a interfaceC11040a) {
        this.f65457d = observableSource;
        this.f65454a = observableSource2;
        this.f65455b = atomicReference;
        this.f65456c = interfaceC11040a;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(observableSource);
        }
        return m29951e(observableSource, new C11045f(i));
    }

    public static <T> ConnectableObservable<T> createFrom(ObservableSource<? extends T> observableSource) {
        return m29951e(observableSource, f65453e);
    }

    /* renamed from: e */
    public static ConnectableObservable m29951e(ObservableSource observableSource, InterfaceC11040a interfaceC11040a) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservableReplay(new C11046g(atomicReference, interfaceC11040a), observableSource, atomicReference, interfaceC11040a));
    }

    public static <U, R> Observable<R> multicastSelector(Callable<? extends ConnectableObservable<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
        return RxJavaPlugins.onAssembly(new C11042c(callable, function));
    }

    public static <T> ConnectableObservable<T> observeOn(ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableObservable) new C11043d(connectableObservable, connectableObservable.observeOn(scheduler)));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        ReplayObserver replayObserver;
        boolean z;
        while (true) {
            replayObserver = (ReplayObserver) this.f65455b.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver replayObserver2 = new ReplayObserver(this.f65456c.call());
            if (AbstractC17300An1.m69050a(this.f65455b, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        if (!replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true)) {
            z = true;
        } else {
            z = false;
        }
        try {
            consumer.accept(replayObserver);
            if (z) {
                this.f65454a.subscribe(replayObserver);
            }
        } catch (Throwable th2) {
            if (z) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AbstractC17300An1.m69050a(this.f65455b, (ReplayObserver) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.f65454a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65457d.subscribe(observer);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observableSource, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return m29951e(observableSource, new C11047h(i, j, timeUnit, scheduler));
    }
}
