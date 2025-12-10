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

/* renamed from: U30 */
/* loaded from: classes.dex */
public final class U30 extends Modifier.Node implements ModifierLocalModifierNode, Function1 {

    /* renamed from: n */
    public Function1 f6190n;

    /* renamed from: o */
    public final ModifierLocalMap f6191o;

    public U30(Function1 onPositioned) {
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        this.f6190n = onPositioned;
        this.f6191o = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m28844to(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), this));
    }

    /* renamed from: a */
    public final Function1 m66141a() {
        if (isAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    /* renamed from: b */
    public void m66140b(LayoutCoordinates layoutCoordinates) {
        if (!isAttached()) {
            return;
        }
        this.f6190n.invoke(layoutCoordinates);
        Function1 m66141a = m66141a();
        if (m66141a != null) {
            m66141a.invoke(layoutCoordinates);
        }
    }

    /* renamed from: c */
    public final void m66139c(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f6190n = function1;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode, androidx.compose.p003ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC20630jt0.m29033a(this, modifierLocal);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public ModifierLocalMap getProvidedValues() {
        return this.f6191o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m66140b((LayoutCoordinates) obj);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC20630jt0.m29031c(this, modifierLocal, obj);
    }
}
