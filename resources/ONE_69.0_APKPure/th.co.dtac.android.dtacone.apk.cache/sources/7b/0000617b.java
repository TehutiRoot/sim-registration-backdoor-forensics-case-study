package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.IntermediateLayoutModifierNode$onAttach$1 */
/* loaded from: classes2.dex */
public final class IntermediateLayoutModifierNode$onAttach$1 extends Lambda implements Function0<LayoutCoordinates> {
    final /* synthetic */ LayoutNode $closestLookaheadRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntermediateLayoutModifierNode$onAttach$1(LayoutNode layoutNode) {
        super(0);
        this.$closestLookaheadRoot = layoutNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LayoutCoordinates invoke() {
        LayoutNode parent$ui_release = this.$closestLookaheadRoot.getParent$ui_release();
        Intrinsics.checkNotNull(parent$ui_release);
        return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
    }
}