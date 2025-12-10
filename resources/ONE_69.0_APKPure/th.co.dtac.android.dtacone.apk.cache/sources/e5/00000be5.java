package p000;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: Ma */
/* loaded from: classes7.dex */
public abstract class AbstractC0874Ma extends AbstractQueue {

    /* renamed from: a */
    public final AtomicReference f3917a = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f3918b = new AtomicReference();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        if (lvConsumerNode() == lvProducerNode()) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        throw new UnsupportedOperationException();
    }

    public final LinkedQueueNode<Object> lpConsumerNode() {
        return (LinkedQueueNode) this.f3918b.get();
    }

    public final LinkedQueueNode<Object> lpProducerNode() {
        return (LinkedQueueNode) this.f3917a.get();
    }

    public final LinkedQueueNode<Object> lvConsumerNode() {
        return (LinkedQueueNode) this.f3918b.get();
    }

    public final LinkedQueueNode<Object> lvProducerNode() {
        return (LinkedQueueNode) this.f3917a.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<Object> lvNext;
        LinkedQueueNode<Object> lvConsumerNode = lvConsumerNode();
        LinkedQueueNode<Object> lvProducerNode = lvProducerNode();
        int i = 0;
        while (lvConsumerNode != lvProducerNode && i < Integer.MAX_VALUE) {
            do {
                lvNext = lvConsumerNode.lvNext();
            } while (lvNext == null);
            i++;
            lvConsumerNode = lvNext;
        }
        return i;
    }

    public final void spConsumerNode(LinkedQueueNode<Object> linkedQueueNode) {
        this.f3918b.lazySet(linkedQueueNode);
    }

    public final void spProducerNode(LinkedQueueNode<Object> linkedQueueNode) {
        this.f3917a.lazySet(linkedQueueNode);
    }

    public final LinkedQueueNode<Object> xchgProducerNode(LinkedQueueNode<Object> linkedQueueNode) {
        return (LinkedQueueNode) this.f3917a.getAndSet(linkedQueueNode);
    }
}