package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0015\u0010\u0012J'\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010$\u001a\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\u0003J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0001H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R \u00104\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0003\u001a\u0004\b1\u00102R$\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, m28850d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/DelegatableNode;", "T", "delegatableNode", "delegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "delegateUnprotected", "instance", "undelegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)V", "undelegateUnprotected", "delegate", "undelegate", "Lkotlin/Function1;", "block", "forEachImmediateDelegate$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "forEachImmediateDelegate", "markAsAttached$ui_release", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "", "delegateKindSet", "delegateNode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILandroidx/compose/ui/Modifier$Node;)V", "newKindSet", "", "recalculateOwner", PDPageLabelRange.STYLE_LETTERS_LOWER, "(IZ)V", OperatorName.ENDPATH, "I", "getSelfKindSet$ui_release", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "o", "Landroidx/compose/ui/Modifier$Node;", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,277:1\n234#1,6:278\n234#1,6:290\n234#1,6:296\n234#1,6:302\n234#1,6:308\n234#1,6:314\n72#2:284\n72#2:286\n72#2:288\n55#3:285\n55#3:287\n55#3:289\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n45#1:278,6\n243#1:290,6\n254#1:296,6\n262#1:302,6\n268#1:308,6\n274#1:314,6\n106#1:284\n162#1:286\n176#1:288\n106#1:285\n162#1:287\n176#1:289\n*E\n"})
/* renamed from: androidx.compose.ui.node.DelegatingNode */
/* loaded from: classes2.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;

    /* renamed from: n */
    public final int f30212n = NodeKindKt.calculateNodeKindSetFrom(this);

    /* renamed from: o */
    public Modifier.Node f30213o;

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }

    /* renamed from: a */
    public final void m59508a(int i, boolean z) {
        int i2;
        Modifier.Node child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i);
        if (kindSet$ui_release != i) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node node2 = this;
                while (node2 != null) {
                    i |= node2.getKindSet$ui_release();
                    node2.setKindSet$ui_release(i);
                    if (node2 == node) {
                        break;
                    }
                    node2 = node2.getParent$ui_release();
                }
                if (z && node2 == node) {
                    i = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i);
                }
                if (node2 != null && (child$ui_release = node2.getChild$ui_release()) != null) {
                    i2 = child$ui_release.getAggregateChildKindSet$ui_release();
                } else {
                    i2 = 0;
                }
                int i3 = i | i2;
                while (node2 != null) {
                    i3 |= node2.getKindSet$ui_release();
                    node2.setAggregateChildKindSet$ui_release(i3);
                    node2 = node2.getParent$ui_release();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m59507b(int i, Modifier.Node node) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i & NodeKind.m72961constructorimpl(2)) != 0 && (NodeKind.m72961constructorimpl(2) & kindSet$ui_release) != 0 && !(this instanceof LayoutModifierNode)) {
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node).toString());
        }
    }

    @NotNull
    public final <T extends DelegatableNode> T delegate(@NotNull T delegatableNode) {
        Modifier.Node node;
        Intrinsics.checkNotNullParameter(delegatableNode, "delegatableNode");
        Modifier.Node node2 = delegatableNode.getNode();
        Modifier.Node node3 = null;
        if (node2 != delegatableNode) {
            if (delegatableNode instanceof Modifier.Node) {
                node = (Modifier.Node) delegatableNode;
            } else {
                node = null;
            }
            if (node != null) {
                node3 = node.getParent$ui_release();
            }
            if (node2 == getNode() && Intrinsics.areEqual(node3, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        } else if (!node2.isAttached()) {
            node2.setAsDelegateTo$ui_release(getNode());
            int kindSet$ui_release = getKindSet$ui_release();
            int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node2);
            node2.setKindSet$ui_release(calculateNodeKindSetFromIncludingDelegates);
            m59507b(calculateNodeKindSetFromIncludingDelegates, node2);
            node2.setChild$ui_release(this.f30213o);
            this.f30213o = node2;
            node2.setParent$ui_release(this);
            m59508a(getKindSet$ui_release() | calculateNodeKindSetFromIncludingDelegates, false);
            if (isAttached()) {
                if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m72961constructorimpl(2)) != 0 && (kindSet$ui_release & NodeKind.m72961constructorimpl(2)) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                } else {
                    updateCoordinator$ui_release(getCoordinator$ui_release());
                }
                node2.markAsAttached$ui_release();
                node2.runAttachLifecycle$ui_release();
                NodeKindKt.autoInvalidateInsertedNode(node2);
            }
            return delegatableNode;
        } else {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
    }

    @NotNull
    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(@NotNull T delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "delegatableNode");
        return (T) delegate(delegatableNode);
    }

    public final void forEachImmediateDelegate$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            block.invoke(delegate$ui_release);
        }
    }

    @Nullable
    public final Modifier.Node getDelegate$ui_release() {
        return this.f30213o;
    }

    public final int getSelfKindSet$ui_release() {
        return this.f30212n;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    public final void setDelegate$ui_release(@Nullable Modifier.Node node) {
        this.f30213o = node;
    }

    public final void undelegate(@NotNull DelegatableNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.f30213o; node2 != null; node2 = node2.getChild$ui_release()) {
            if (node2 == instance) {
                if (node2.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node2);
                    node2.runDetachLifecycle$ui_release();
                    node2.markAsDetached$ui_release();
                }
                node2.setAsDelegateTo$ui_release(node2);
                node2.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.f30213o = node2.getChild$ui_release();
                } else {
                    node.setChild$ui_release(node2.getChild$ui_release());
                }
                node2.setChild$ui_release(null);
                node2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                m59508a(calculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui_release & NodeKind.m72961constructorimpl(2)) != 0 && (NodeKind.m72961constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    public final void undelegateUnprotected$ui_release(@NotNull DelegatableNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        undelegate(instance);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void updateCoordinator$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(nodeCoordinator);
        }
    }
}
