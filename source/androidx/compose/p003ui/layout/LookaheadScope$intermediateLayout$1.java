package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/IntermediateMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.LookaheadScope$intermediateLayout$1 */
/* loaded from: classes2.dex */
public final class LookaheadScope$intermediateLayout$1 extends Lambda implements Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ Function4<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> $measure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScope$intermediateLayout$1(Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4) {
        super(3);
        this.$measure = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(IntermediateMeasureScope intermediateMeasureScope, Measurable measurable, Constraints constraints) {
        return m72829invoke3p2s80s(intermediateMeasureScope, measurable, constraints.m73632unboximpl());
    }

    @NotNull
    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m72829invoke3p2s80s(@NotNull IntermediateMeasureScope intermediateLayout, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(intermediateLayout, "$this$intermediateLayout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.$measure.invoke(intermediateLayout, measurable, Constraints.m73615boximpl(j), IntSize.m73810boximpl(intermediateLayout.mo72813getLookaheadSizeYbymL2g()));
    }
}
