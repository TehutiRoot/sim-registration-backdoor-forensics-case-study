package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p003ui.node.LayoutAwareModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNodeKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements FocusEventModifierNode, LayoutAwareModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode {

    /* renamed from: p */
    public FocusState f12845p;

    /* renamed from: r */
    public final FocusableInteractionNode f12847r;

    /* renamed from: u */
    public final BringIntoViewRequester f12850u;

    /* renamed from: v */
    public final BringIntoViewRequesterNode f12851v;

    /* renamed from: q */
    public final FocusableSemanticsNode f12846q = (FocusableSemanticsNode) delegate(new FocusableSemanticsNode());

    /* renamed from: s */
    public final FocusablePinnableContainerNode f12848s = (FocusablePinnableContainerNode) delegate(new FocusablePinnableContainerNode());

    /* renamed from: t */
    public final FocusedBoundsNode f12849t = (FocusedBoundsNode) delegate(new FocusedBoundsNode());

    public FocusableNode(MutableInteractionSource mutableInteractionSource) {
        this.f12847r = (FocusableInteractionNode) delegate(new FocusableInteractionNode(mutableInteractionSource));
        BringIntoViewRequester BringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
        this.f12850u = BringIntoViewRequester;
        this.f12851v = (BringIntoViewRequesterNode) delegate(new BringIntoViewRequesterNode(BringIntoViewRequester));
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        this.f12846q.applySemantics(semanticsPropertyReceiver);
    }

    /* renamed from: d */
    public final void m61583d(MutableInteractionSource mutableInteractionSource) {
        this.f12847r.m61585c(mutableInteractionSource);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return FF1.m68408a(this);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return FF1.m68407b(this);
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (!Intrinsics.areEqual(this.f12845p, focusState)) {
            boolean isFocused = focusState.isFocused();
            if (isFocused) {
                AbstractC1552Vc.m65753e(getCoroutineScope(), null, null, new FocusableNode$onFocusEvent$1(this, null), 3, null);
            }
            if (isAttached()) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            this.f12847r.setFocus(isFocused);
            this.f12849t.setFocus(isFocused);
            this.f12848s.setFocus(isFocused);
            this.f12846q.setFocus(isFocused);
            this.f12845p = focusState;
        }
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f12849t.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f12851v.onPlaced(coordinates);
    }

    @Override // androidx.compose.p003ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public /* synthetic */ void mo69362onRemeasuredozmzZPI(long j) {
        AbstractC19737ei0.m31500b(this, j);
    }
}
