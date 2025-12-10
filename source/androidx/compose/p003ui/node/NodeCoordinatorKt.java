package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeKind;", "type", "stopType", "Landroidx/compose/ui/Modifier$Node;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/DelegatableNode;II)Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.NodeCoordinatorKt */
/* loaded from: classes2.dex */
public final class NodeCoordinatorKt {
    /* renamed from: a */
    public static final Modifier.Node m59394a(DelegatableNode delegatableNode, int i, int i2) {
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & i2) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }

    /* renamed from: access$nextUntil-hw7D004  reason: not valid java name */
    public static final /* synthetic */ Modifier.Node m72959access$nextUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        return m59394a(delegatableNode, i, i2);
    }
}
