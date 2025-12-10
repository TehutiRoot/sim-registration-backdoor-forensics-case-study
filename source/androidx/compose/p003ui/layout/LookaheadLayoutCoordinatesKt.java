package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28850d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt */
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinatesKt {
    @NotNull
    public static final LookaheadDelegate getRootLookaheadDelegate(@NotNull LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "<this>");
        LayoutNode layoutNode2 = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
            LayoutNode layoutNode3 = null;
            if (parent$ui_release != null) {
                layoutNode = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode = null;
            }
            if (layoutNode != null) {
                LayoutNode parent$ui_release2 = layoutNode2.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutNode3 = parent$ui_release2.getLookaheadRoot$ui_release();
                }
                Intrinsics.checkNotNull(layoutNode3);
                if (layoutNode3.isVirtualLookaheadRoot$ui_release()) {
                    layoutNode2 = layoutNode2.getParent$ui_release();
                    Intrinsics.checkNotNull(layoutNode2);
                } else {
                    LayoutNode parent$ui_release3 = layoutNode2.getParent$ui_release();
                    Intrinsics.checkNotNull(parent$ui_release3);
                    layoutNode2 = parent$ui_release3.getLookaheadRoot$ui_release();
                    Intrinsics.checkNotNull(layoutNode2);
                }
            } else {
                LookaheadDelegate lookaheadDelegate2 = layoutNode2.getOuterCoordinator$ui_release().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}
