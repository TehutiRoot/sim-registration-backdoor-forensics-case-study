package p046rx.internal.util.atomic;

/* renamed from: rx.internal.util.atomic.MpscLinkedAtomicQueue */
/* loaded from: classes7.dex */
public final class MpscLinkedAtomicQueue<E> extends AbstractC0879Ma {
    public MpscLinkedAtomicQueue() {
        LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>();
        spConsumerNode(linkedQueueNode);
        xchgProducerNode(linkedQueueNode);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<Object> linkedQueueNode = new LinkedQueueNode<>(e);
            xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<Object> lvNext;
        LinkedQueueNode<Object> lpConsumerNode = lpConsumerNode();
        LinkedQueueNode<Object> lvNext2 = lpConsumerNode.lvNext();
        if (lvNext2 != null) {
            return (E) lvNext2.lpValue();
        }
        if (lpConsumerNode != lvProducerNode()) {
            do {
                lvNext = lpConsumerNode.lvNext();
            } while (lvNext == null);
            return (E) lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<Object> lvNext;
        LinkedQueueNode<Object> lpConsumerNode = lpConsumerNode();
        LinkedQueueNode<Object> lvNext2 = lpConsumerNode.lvNext();
        if (lvNext2 != null) {
            E e = (E) lvNext2.getAndNullValue();
            spConsumerNode(lvNext2);
            return e;
        } else if (lpConsumerNode != lvProducerNode()) {
            do {
                lvNext = lpConsumerNode.lvNext();
            } while (lvNext == null);
            E e2 = (E) lvNext.getAndNullValue();
            spConsumerNode(lvNext);
            return e2;
        } else {
            return null;
        }
    }
}
