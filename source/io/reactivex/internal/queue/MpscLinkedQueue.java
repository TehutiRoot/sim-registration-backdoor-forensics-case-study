package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* renamed from: a */
    public final AtomicReference f66003a = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f66004b = new AtomicReference();

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
        m29922d(linkedQueueNode);
        m29921e(linkedQueueNode);
    }

    /* renamed from: a */
    public LinkedQueueNode m29925a() {
        return (LinkedQueueNode) this.f66004b.get();
    }

    /* renamed from: b */
    public LinkedQueueNode m29924b() {
        return (LinkedQueueNode) this.f66004b.get();
    }

    /* renamed from: c */
    public LinkedQueueNode m29923c() {
        return (LinkedQueueNode) this.f66003a.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    /* renamed from: d */
    public void m29922d(LinkedQueueNode linkedQueueNode) {
        this.f66004b.lazySet(linkedQueueNode);
    }

    /* renamed from: e */
    public LinkedQueueNode m29921e(LinkedQueueNode linkedQueueNode) {
        return (LinkedQueueNode) this.f66003a.getAndSet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (m29924b() == m29923c()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            m29921e(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        LinkedQueueNode lvNext;
        LinkedQueueNode m29925a = m29925a();
        LinkedQueueNode lvNext2 = m29925a.lvNext();
        if (lvNext2 != null) {
            T t = (T) lvNext2.getAndNullValue();
            m29922d(lvNext2);
            return t;
        } else if (m29925a != m29923c()) {
            do {
                lvNext = m29925a.lvNext();
            } while (lvNext == null);
            T t2 = (T) lvNext.getAndNullValue();
            m29922d(lvNext);
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
