package p046rx.internal.util.atomic;

/* renamed from: rx.internal.util.atomic.SpscLinkedAtomicQueue */
/* loaded from: classes7.dex */
public final class SpscLinkedAtomicQueue<E> extends AbstractC0879Ma {
    public SpscLinkedAtomicQueue() {
        LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>();
        spProducerNode(linkedQueueNode);
        spConsumerNode(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>(e);
            lpProducerNode().soNext(linkedQueueNode);
            spProducerNode(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<Object> lvNext = lpConsumerNode().lvNext();
        if (lvNext != null) {
            return (E) lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<Object> lvNext = lpConsumerNode().lvNext();
        if (lvNext != null) {
            E e = (E) lvNext.getAndNullValue();
            spConsumerNode(lvNext);
            return e;
        }
        return null;
    }
}
