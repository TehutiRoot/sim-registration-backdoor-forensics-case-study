package p000;

import p046rx.internal.util.atomic.LinkedQueueNode;
import p046rx.internal.util.unsafe.UnsafeAccess;

/* renamed from: Oa */
/* loaded from: classes7.dex */
public abstract class AbstractC1011Oa extends AbstractC1167Qa {
    protected static final long C_NODE_OFFSET = UnsafeAccess.addressOf(AbstractC1011Oa.class, "consumerNode");
    protected LinkedQueueNode<Object> consumerNode;

    public final LinkedQueueNode<Object> lpConsumerNode() {
        return this.consumerNode;
    }

    public final LinkedQueueNode<Object> lvConsumerNode() {
        return (LinkedQueueNode) UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    public final void spConsumerNode(LinkedQueueNode<Object> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }
}