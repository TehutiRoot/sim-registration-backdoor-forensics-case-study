package p000;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Y30 */
/* loaded from: classes.dex */
public final class Y30 extends Modifier.Node implements ModifierLocalModifierNode, Function1 {

    /* renamed from: n */
    public Function1 f7765n;

    /* renamed from: o */
    public final ModifierLocalMap f7766o;

    public Y30(Function1 onPositioned) {
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        this.f7765n = onPositioned;
        this.f7766o = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m29136to(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), this));
    }

    /* renamed from: a */
    public final Function1 m65502a() {
        if (isAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    /* renamed from: b */
    public void m65501b(LayoutCoordinates layoutCoordinates) {
        if (!isAttached()) {
            return;
        }
        this.f7765n.invoke(layoutCoordinates);
        Function1 m65502a = m65502a();
        if (m65502a != null) {
            m65502a.invoke(layoutCoordinates);
        }
    }

    /* renamed from: c */
    public final void m65500c(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f7765n = function1;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode, androidx.compose.p003ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC21724pt0.m23731a(this, modifierLocal);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.f7766o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m65501b((LayoutCoordinates) obj);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC21724pt0.m23729c(this, modifierLocal, obj);
    }
}