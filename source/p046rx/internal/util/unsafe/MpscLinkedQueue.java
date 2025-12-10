package p046rx.internal.util.unsafe;

import p046rx.internal.util.SuppressAnimalSniffer;
import p046rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.MpscLinkedQueue */
/* loaded from: classes7.dex */
public final class MpscLinkedQueue<E> extends AbstractC0954Na {
    public MpscLinkedQueue() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        this.consumerNode = linkedQueueNode;
        xchgProducerNode(linkedQueueNode);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
            xchgProducerNode(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<Object> lvNext;
        LinkedQueueNode<Object> linkedQueueNode = this.consumerNode;
        LinkedQueueNode<Object> lvNext2 = linkedQueueNode.lvNext();
        if (lvNext2 != null) {
            return (E) lvNext2.lpValue();
        }
        if (linkedQueueNode != lvProducerNode()) {
            do {
                lvNext = linkedQueueNode.lvNext();
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
            this.consumerNode = lvNext;
            return e2;
        } else {
            return null;
        }
    }

    public LinkedQueueNode<E> xchgProducerNode(LinkedQueueNode<E> linkedQueueNode) {
        LinkedQueueNode<E> linkedQueueNode2;
        do {
            linkedQueueNode2 = (LinkedQueueNode<E>) this.producerNode;
        } while (!AbstractC18317Qk2.m66527a(UnsafeAccess.UNSAFE, this, AbstractC1255Ra.P_NODE_OFFSET, linkedQueueNode2, linkedQueueNode));
        return linkedQueueNode2;
    }
}
