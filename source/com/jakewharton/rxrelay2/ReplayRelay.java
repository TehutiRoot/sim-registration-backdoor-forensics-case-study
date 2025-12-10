package com.jakewharton.rxrelay2;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ReplayRelay<T> extends Relay<T> {

    /* renamed from: c */
    public static final ReplayDisposable[] f58356c = new ReplayDisposable[0];

    /* renamed from: d */
    public static final Object[] f58357d = new Object[0];

    /* renamed from: a */
    public final InterfaceC9116a f58358a;

    /* renamed from: b */
    public final AtomicReference f58359b = new AtomicReference(f58356c);

    /* loaded from: classes5.dex */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        public Node(T t) {
            this.value = t;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        final Observer<? super T> actual;
        volatile boolean cancelled;
        Object index;
        final ReplayRelay<T> state;

        public ReplayDisposable(Observer<? super T> observer, ReplayRelay<T> replayRelay) {
            this.actual = observer;
            this.state = replayRelay;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.m33717e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* loaded from: classes5.dex */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements InterfaceC9116a {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile TimedNode<T> head;
        final long maxAge;
        final int maxSize;
        final Scheduler scheduler;
        int size;
        TimedNode<T> tail;
        final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            if (i > 0) {
                if (j > 0) {
                    if (timeUnit != null) {
                        if (scheduler != null) {
                            this.maxSize = i;
                            this.maxAge = j;
                            this.unit = timeUnit;
                            this.scheduler = scheduler;
                            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                            this.tail = timedNode;
                            this.head = timedNode;
                            return;
                        }
                        throw new NullPointerException("scheduler == null");
                    }
                    throw new NullPointerException("unit == null");
                }
                throw new IllegalArgumentException("maxAge > 0 required but it was " + j);
            }
            throw new IllegalArgumentException("maxSize > 0 required but it was " + i);
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void add(T t) {
            TimedNode<T> timedNode = new TimedNode<>(t, this.scheduler.now(this.unit));
            TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T getValue() {
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    return timedNode.value;
                }
                timedNode = timedNode2;
            }
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T[] getValues(T[] tArr) {
            TimedNode<T> timedNode = this.head;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    timedNode = timedNode.get();
                    tArr[i] = timedNode.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = replayDisposable.actual;
            TimedNode<T> timedNode = (TimedNode) replayDisposable.index;
            int i = 1;
            if (timedNode == null) {
                timedNode = this.head;
                long now = this.scheduler.now(this.unit) - this.maxAge;
                TimedNode<T> timedNode2 = timedNode.get();
                while (timedNode2 != null && timedNode2.time <= now) {
                    TimedNode<T> timedNode3 = timedNode2;
                    timedNode2 = timedNode2.get();
                    timedNode = timedNode3;
                }
            }
            while (!replayDisposable.cancelled) {
                while (!replayDisposable.cancelled) {
                    TimedNode<T> timedNode4 = timedNode.get();
                    if (timedNode4 == null) {
                        if (timedNode.get() == null) {
                            replayDisposable.index = timedNode;
                            i = replayDisposable.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        observer.onNext((T) timedNode4.value);
                        timedNode = timedNode4;
                    }
                }
                replayDisposable.index = null;
                return;
            }
            replayDisposable.index = null;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public int size() {
            TimedNode<T> timedNode = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i++;
            }
            return i;
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
            }
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > now) {
                    this.head = timedNode;
                    return;
                } else {
                    timedNode = timedNode2;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements InterfaceC9116a {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile Node<T> head;
        final int maxSize;
        int size;
        Node<T> tail;

        public SizeBoundReplayBuffer(int i) {
            if (i > 0) {
                this.maxSize = i;
                Node<T> node = new Node<>(null);
                this.tail = node;
                this.head = node;
                return;
            }
            throw new IllegalArgumentException("maxSize > 0 required but it was " + i);
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void add(T t) {
            Node<T> node = new Node<>(t);
            Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T getValue() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i = 0; i != size; i++) {
                    node = node.get();
                    tArr[i] = node.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void replay(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = replayDisposable.actual;
            Node<T> node = (Node) replayDisposable.index;
            int i = 1;
            if (node == null) {
                node = this.head;
            }
            while (!replayDisposable.cancelled) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    if (node.get() != null) {
                        continue;
                    } else {
                        replayDisposable.index = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    observer.onNext((T) node2.value);
                    node = node2;
                }
            }
            replayDisposable.index = null;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public int size() {
            Node<T> node = this.head;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = node.get()) != null) {
                i++;
            }
            return i;
        }

        public void trim() {
            int i = this.size;
            if (i > this.maxSize) {
                this.size = i - 1;
                this.head = this.head.get();
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

    /* loaded from: classes5.dex */
    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements InterfaceC9116a {
        private static final long serialVersionUID = -733876083048047795L;
        final List<T> buffer;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            if (i > 0) {
                this.buffer = new ArrayList(i);
                return;
            }
            throw new IllegalArgumentException("capacityHint <= 0");
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void add(T t) {
            this.buffer.add(t);
            this.size++;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T getValue() {
            int i = this.size;
            if (i != 0) {
                return this.buffer.get(i - 1);
            }
            return null;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public T[] getValues(T[] tArr) {
            int i = this.size;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            List<T> list = this.buffer;
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public void replay(ReplayDisposable<T> replayDisposable) {
            int i;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.buffer;
            Observer<? super T> observer = replayDisposable.actual;
            Integer num = (Integer) replayDisposable.index;
            int i2 = 1;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
                replayDisposable.index = 0;
            }
            while (!replayDisposable.cancelled) {
                int i3 = this.size;
                while (i3 != i) {
                    if (replayDisposable.cancelled) {
                        replayDisposable.index = null;
                        return;
                    } else {
                        observer.onNext(list.get(i));
                        i++;
                    }
                }
                if (i == this.size) {
                    replayDisposable.index = Integer.valueOf(i);
                    i2 = replayDisposable.addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
            replayDisposable.index = null;
        }

        @Override // com.jakewharton.rxrelay2.ReplayRelay.InterfaceC9116a
        public int size() {
            int i = this.size;
            if (i == 0) {
                return 0;
            }
            return i;
        }
    }

    /* renamed from: com.jakewharton.rxrelay2.ReplayRelay$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9116a {
        void add(Object obj);

        Object getValue();

        Object[] getValues(Object[] objArr);

        void replay(ReplayDisposable replayDisposable);

        int size();
    }

    public ReplayRelay(InterfaceC9116a interfaceC9116a) {
        this.f58358a = interfaceC9116a;
    }

    public static <T> ReplayRelay<T> create() {
        return new ReplayRelay<>(new UnboundedReplayBuffer(16));
    }

    public static <T> ReplayRelay<T> createWithSize(int i) {
        return new ReplayRelay<>(new SizeBoundReplayBuffer(i));
    }

    public static <T> ReplayRelay<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayRelay<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    public static <T> ReplayRelay<T> createWithTimeAndSize(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return new ReplayRelay<>(new SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        if (t != null) {
            InterfaceC9116a interfaceC9116a = this.f58358a;
            interfaceC9116a.add(t);
            for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.f58359b.get()) {
                interfaceC9116a.replay(replayDisposable);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: d */
    public boolean m33718d(ReplayDisposable replayDisposable) {
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = (ReplayDisposable[]) this.f58359b.get();
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!AbstractC17300An1.m69050a(this.f58359b, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    /* renamed from: e */
    public void m33717e(ReplayDisposable replayDisposable) {
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = (ReplayDisposable[]) this.f58359b.get();
            if (replayDisposableArr == f58356c) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (replayDisposableArr[i] == replayDisposable) {
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
                replayDisposableArr2 = f58356c;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f58359b, replayDisposableArr, replayDisposableArr2));
    }

    public T getValue() {
        return (T) this.f58358a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f58357d;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        if (((ReplayDisposable[]) this.f58359b.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f58358a.size() != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        if (!replayDisposable.cancelled) {
            if (m33718d(replayDisposable) && replayDisposable.cancelled) {
                m33717e(replayDisposable);
            } else {
                this.f58358a.replay(replayDisposable);
            }
        }
    }

    public static <T> ReplayRelay<T> create(int i) {
        return new ReplayRelay<>(new UnboundedReplayBuffer(i));
    }

    public T[] getValues(T[] tArr) {
        return (T[]) this.f58358a.getValues(tArr);
    }
}
