package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "it", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1 */
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1 extends Lambda implements Function2<SubcomposeIntermediateMeasureScope, Constraints, MeasureResult> {
    public static final LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1 INSTANCE = new LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1();

    public LayoutNodeSubcompositionsState$intermediateMeasurePolicy$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, Constraints constraints) {
        return m72827invoke0kLqBqw(subcomposeIntermediateMeasureScope, constraints.m73632unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m72827invoke0kLqBqw(@NotNull SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, long j) {
        Intrinsics.checkNotNullParameter(subcomposeIntermediateMeasureScope, "$this$null");
        return subcomposeIntermediateMeasureScope.getLookaheadMeasurePolicy().invoke(subcomposeIntermediateMeasureScope, Constraints.m73615boximpl(j));
    }
}
