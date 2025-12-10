package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$3 */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$3 extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {
    public static final SubcomposeLayoutKt$SubcomposeLayout$3 INSTANCE = new SubcomposeLayoutKt$SubcomposeLayout$3();

    public SubcomposeLayoutKt$SubcomposeLayout$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
        return m73070invoke0kLqBqw(subcomposeIntermediateMeasureScope, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m73070invoke0kLqBqw(@NotNull SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, long j) {
        Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope, "$this$null");
        return subcomposeIntermediateMeasureScope.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope, Constraints.m73799boximpl(j));
    }
}