package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: a */
    public final AtomicReference f66066a = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f66067b = new AtomicReference();

    /* loaded from: classes5.dex */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public LinkedQueueNode() {
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue(null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public LinkedQueueNode<E> lvNext() {
            return get();
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void spValue(E e) {
            this.value = e;
        }

        public LinkedQueueNode(E e) {
            spValue(e);
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        m30262d(linkedQueueNode);
        m30261e(linkedQueueNode);
    }

    /* renamed from: a */
    public LinkedQueueNode m30265a() {
        return (LinkedQueueNode) this.f66067b.get();
    }

    /* renamed from: b */
    public LinkedQueueNode m30264b() {
        return (LinkedQueueNode) this.f66067b.get();
    }

    /* renamed from: c */
    public LinkedQueueNode m30263c() {
        return (LinkedQueueNode) this.f66066a.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    public void m30262d(LinkedQueueNode linkedQueueNode) {
        this.f66067b.lazySet(linkedQueueNode);
    }

    /* renamed from: e */
    public LinkedQueueNode m30261e(LinkedQueueNode linkedQueueNode) {
        return (LinkedQueueNode) this.f66066a.getAndSet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (m30264b() == m30263c()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            m30261e(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        LinkedQueueNode lvNext;
        LinkedQueueNode m30265a = m30265a();
        LinkedQueueNode lvNext2 = m30265a.lvNext();
        if (lvNext2 != null) {
            T t = (T) lvNext2.getAndNullValue();
            m30262d(lvNext2);
            return t;
        } else if (m30265a != m30263c()) {
            do {
                lvNext = m30265a.lvNext();
            } while (lvNext == null);
            T t2 = (T) lvNext.getAndNullValue();
            m30262d(lvNext);
            return t2;
        } else {
            return null;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }
}