package p000;

import java.util.Iterator;
import p046rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: Na */
/* loaded from: classes7.dex */
public abstract class AbstractC0942Na extends AbstractC1011Oa {
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
}