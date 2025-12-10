package androidx.compose.material;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Density $density;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1(DrawerState drawerState, Density density, float f, float f2) {
        super(0);
        this.$drawerState = drawerState;
        this.$density = density;
        this.$minValue = f;
        this.$maxValue = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$drawerState.setDensity$material_release(this.$density);
        AnchoredDraggableState.updateAnchors$material_release$default(this.$drawerState.getAnchoredDraggableState$material_release(), AbstractC11687a.mapOf(TuplesKt.m28844to(DrawerValue.Closed, Float.valueOf(this.$minValue)), TuplesKt.m28844to(DrawerValue.Open, Float.valueOf(this.$maxValue))), null, 2, null);
    }
}
