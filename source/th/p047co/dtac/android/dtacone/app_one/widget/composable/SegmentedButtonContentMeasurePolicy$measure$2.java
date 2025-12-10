package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneSegmentedButtonRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonContentMeasurePolicy$measure$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,643:1\n1855#2,2:644\n1855#2,2:646\n*S KotlinDebug\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonContentMeasurePolicy$measure$2\n*L\n272#1:644,2\n279#1:646,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonContentMeasurePolicy$measure$2 */
/* loaded from: classes7.dex */
public final class SegmentedButtonContentMeasurePolicy$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $contentPlaceables;
    final /* synthetic */ int $height;
    final /* synthetic */ List<Placeable> $iconPlaceables;
    final /* synthetic */ int $offsetX;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SegmentedButtonContentMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonContentMeasurePolicy$measure$2(List<? extends Placeable> list, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, List<? extends Placeable> list2, int i2) {
        super(1);
        this.$iconPlaceables = list;
        this.$this_measure = measureScope;
        this.this$0 = segmentedButtonContentMeasurePolicy;
        this.$offsetX = i;
        this.$contentPlaceables = list2;
        this.$height = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i = this.$height;
        for (Placeable placeable : this.$iconPlaceables) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        int mo69432roundToPx0680j_4 = this.$this_measure.mo69432roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m74971getIconSizeD9Ej5fM()) + this.$this_measure.mo69432roundToPx0680j_4(ButtonDefaults.INSTANCE.m69941getIconSpacingD9Ej5fM());
        Animatable<Integer, AnimationVector1D> animatable = this.this$0.getAnimatable();
        int intValue = mo69432roundToPx0680j_4 + (animatable != null ? animatable.getValue().intValue() : this.$offsetX);
        int i2 = this.$height;
        for (Placeable placeable2 : this.$contentPlaceables) {
            Placeable.PlacementScope.place$default(layout, placeable2, intValue, (i2 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
    }
}
