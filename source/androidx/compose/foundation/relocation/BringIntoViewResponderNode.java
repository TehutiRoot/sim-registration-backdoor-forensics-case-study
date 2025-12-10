package androidx.compose.foundation.relocation;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends BringIntoViewChildNode implements BringIntoViewParent {

    /* renamed from: p */
    public BringIntoViewResponder f13940p;

    /* renamed from: q */
    public final ModifierLocalMap f13941q;

    public BringIntoViewResponderNode(BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        this.f13940p = responder;
        this.f13941q = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m28844to(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    }

    /* renamed from: c */
    public static final Rect m61087c(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        Rect rect;
        Rect m61089a;
        LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null && (rect = (Rect) function0.invoke()) != null) {
            m61089a = BringIntoViewResponderKt.m61089a(layoutCoordinates2, layoutCoordinates, rect);
            return m61089a;
        }
        return null;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0 function0, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, function0, new BringIntoViewResponderNode$bringChildIntoView$parentRect$1(this, layoutCoordinates, function0), null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public final BringIntoViewResponder m61086d() {
        return this.f13940p;
    }

    /* renamed from: e */
    public final void m61085e(BringIntoViewResponder bringIntoViewResponder) {
        Intrinsics.checkNotNullParameter(bringIntoViewResponder, "<set-?>");
        this.f13940p = bringIntoViewResponder;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewChildNode, androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.f13941q;
    }
}
