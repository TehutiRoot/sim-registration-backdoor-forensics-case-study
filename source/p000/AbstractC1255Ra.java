package p000;

import p046rx.internal.util.atomic.LinkedQueueNode;
import p046rx.internal.util.unsafe.UnsafeAccess;

/* renamed from: Ra */
/* loaded from: classes7.dex */
public abstract class AbstractC1255Ra extends AbstractC1107Pa {
    protected static final long P_NODE_OFFSET = UnsafeAccess.addressOf(AbstractC1255Ra.class, "producerNode");
    protected LinkedQueueNode<Object> producerNode;

    public final LinkedQueueNode<Object> lpProducerNode() {
        return this.producerNode;
    }

    public final LinkedQueueNode<Object> lvProducerNode() {
        return (LinkedQueueNode) UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    public final void spProducerNode(LinkedQueueNode<Object> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }
}
