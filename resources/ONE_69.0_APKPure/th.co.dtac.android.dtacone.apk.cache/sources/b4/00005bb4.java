package androidx.compose.material3;

import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1673:1\n1864#2,3:1674\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$measure$1\n*L\n1523#1:1674,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt$CircularLayout$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ Placeable $innerCirclePlaceable;
    final /* synthetic */ List<Placeable> $placeables;
    final /* synthetic */ float $radiusPx;
    final /* synthetic */ Placeable $selectorPlaceable;
    final /* synthetic */ float $theta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerKt$CircularLayout$1$measure$1(Placeable placeable, List<? extends Placeable> list, Placeable placeable2, long j, float f, float f2) {
        super(1);
        this.$selectorPlaceable = placeable;
        this.$placeables = list;
        this.$innerCirclePlaceable = placeable2;
        this.$constraints = j;
        this.$radiusPx = f;
        this.$theta = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Placeable placeable;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable2 = this.$selectorPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(layout, placeable2, 0, 0, 0.0f, 4, null);
        }
        long j = this.$constraints;
        float f = this.$radiusPx;
        float f2 = this.$theta;
        Iterator it = this.$placeables.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            double d = f;
            Iterator it2 = it;
            double d2 = (i * f2) - 1.5707963267948966d;
            Placeable.PlacementScope.place$default(layout, (Placeable) next, AbstractC22237sr0.roundToInt((Math.cos(d2) * d) + ((Constraints.m73810getMaxWidthimpl(j) / 2) - (placeable.getWidth() / 2))), AbstractC22237sr0.roundToInt((d * Math.sin(d2)) + ((Constraints.m73809getMaxHeightimpl(j) / 2) - (placeable.getHeight() / 2))), 0.0f, 4, null);
            i = i2;
            it = it2;
        }
        Placeable placeable3 = this.$innerCirclePlaceable;
        if (placeable3 != null) {
            Placeable.PlacementScope.place$default(layout, placeable3, (Constraints.m73812getMinWidthimpl(this.$constraints) - this.$innerCirclePlaceable.getWidth()) / 2, (Constraints.m73811getMinHeightimpl(this.$constraints) - this.$innerCirclePlaceable.getHeight()) / 2, 0.0f, 4, null);
        }
    }
}