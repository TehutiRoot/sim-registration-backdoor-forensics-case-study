package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class AbstractClickablePointerInputNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, PointerInputModifierNode {

    /* renamed from: p */
    public boolean f12763p;

    /* renamed from: q */
    public MutableInteractionSource f12764q;

    /* renamed from: r */
    public Function0 f12765r;

    /* renamed from: s */
    public final AbstractClickableNode.InteractionData f12766s;

    /* renamed from: t */
    public final Function0 f12767t;

    /* renamed from: u */
    public final SuspendingPointerInputModifierNode f12768u;

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z, MutableInteractionSource mutableInteractionSource, Function0 function0, AbstractClickableNode.InteractionData interactionData, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mutableInteractionSource, function0, interactionData);
    }

    /* renamed from: c */
    public final boolean m61639c() {
        return this.f12763p;
    }

    /* renamed from: d */
    public final AbstractClickableNode.InteractionData m61638d() {
        return this.f12766s;
    }

    /* renamed from: e */
    public final Function0 m61637e() {
        return this.f12765r;
    }

    /* renamed from: f */
    public final Object m61636f(PressGestureScope pressGestureScope, long j, Continuation continuation) {
        Object m69341access$handlePressInteractionEPk0efs;
        MutableInteractionSource mutableInteractionSource = this.f12764q;
        if (mutableInteractionSource != null && (m69341access$handlePressInteractionEPk0efs = ClickableKt.m69341access$handlePressInteractionEPk0efs(pressGestureScope, j, mutableInteractionSource, this.f12766s, this.f12767t, continuation)) == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m69341access$handlePressInteractionEPk0efs;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public abstract Object mo61595g(PointerInputScope pointerInputScope, Continuation continuation);

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode, androidx.compose.p003ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC20630jt0.m29033a(this, modifierLocal);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return AbstractC20630jt0.m29032b(this);
    }

    /* renamed from: h */
    public final void m61635h(boolean z) {
        this.f12763p = z;
    }

    /* renamed from: i */
    public final void m61634i(MutableInteractionSource mutableInteractionSource) {
        this.f12764q = mutableInteractionSource;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return AbstractC18188Ok1.m66987a(this);
    }

    /* renamed from: j */
    public final void m61633j(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12765r = function0;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.f12768u.onCancelPointerInput();
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
        this.f12768u.mo69310onPointerEventH0pRuoY(pointerEvent, pass, j);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        AbstractC18188Ok1.m66985c(this);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC20630jt0.m29031c(this, modifierLocal, obj);
    }

    public final void resetPointerInputHandler() {
        this.f12768u.resetPointerInputHandler();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return AbstractC18188Ok1.m66984d(this);
    }

    public AbstractClickablePointerInputNode(boolean z, MutableInteractionSource mutableInteractionSource, Function0 function0, AbstractClickableNode.InteractionData interactionData) {
        this.f12763p = z;
        this.f12764q = mutableInteractionSource;
        this.f12765r = function0;
        this.f12766s = interactionData;
        this.f12767t = new AbstractClickablePointerInputNode$delayPressInteraction$1(this);
        this.f12768u = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }
}
