package p046rx.internal.util.unsafe;

import p046rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: rx.internal.util.unsafe.SpscLinkedQueue */
/* loaded from: classes7.dex */
public final class SpscLinkedQueue<E> extends AbstractC0954Na {
    public SpscLinkedQueue() {
        spProducerNode(new LinkedQueueNode<>());
        spConsumerNode(this.producerNode);
        this.consumerNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>(e);
            this.producerNode.soNext(linkedQueueNode);
            this.producerNode = linkedQueueNode;
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<Object> lvNext = this.consumerNode.lvNext();
        if (lvNext != null) {
            return (E) lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<Object> lvNext = this.consumerNode.lvNext();
        if (lvNext != null) {
            E e = (E) lvNext.getAndNullValue();
            this.consumerNode = lvNext;
            return e;
        }
        return null;
    }
}
