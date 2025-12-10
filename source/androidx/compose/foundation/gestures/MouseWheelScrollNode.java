package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MouseWheelScrollNode extends DelegatingNode implements PointerInputModifierNode {

    /* renamed from: p */
    public State f12996p;

    /* renamed from: q */
    public ScrollConfig f12997q;

    /* renamed from: r */
    public final SuspendingPointerInputModifierNode f12998r;

    public MouseWheelScrollNode(State scrollingLogicState, ScrollConfig mouseWheelScrollConfig) {
        Intrinsics.checkNotNullParameter(scrollingLogicState, "scrollingLogicState");
        Intrinsics.checkNotNullParameter(mouseWheelScrollConfig, "mouseWheelScrollConfig");
        this.f12996p = scrollingLogicState;
        this.f12997q = mouseWheelScrollConfig;
        this.f12998r = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new MouseWheelScrollNode$pointerInputNode$1(this, null)));
    }

    /* renamed from: c */
    public final ScrollConfig m61489c() {
        return this.f12997q;
    }

    /* renamed from: d */
    public final State m61488d() {
        return this.f12996p;
    }

    /* renamed from: e */
    public final void m61487e(ScrollConfig scrollConfig) {
        Intrinsics.checkNotNullParameter(scrollConfig, "<set-?>");
        this.f12997q = scrollConfig;
    }

    /* renamed from: f */
    public final void m61486f(State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.f12996p = state;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return AbstractC18188Ok1.m66987a(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.f12998r.onCancelPointerInput();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        AbstractC18188Ok1.m66986b(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo69310onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f12998r.mo69310onPointerEventH0pRuoY(pointerEvent, pass, j);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        AbstractC18188Ok1.m66985c(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return AbstractC18188Ok1.m66984d(this);
    }
}
