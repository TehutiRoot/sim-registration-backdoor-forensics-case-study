package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeUiApi
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u00020\u000e8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R.\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u00158&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u00020\u00138&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010\u0082\u0001\u0001\u001bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "", "slotId", "", "Landroidx/compose/ui/layout/Measurable;", "measurablesForSlot", "(Ljava/lang/Object;)Ljava/util/List;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "()J", "lookaheadSize", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "getLookaheadMeasurePolicy", "()Lkotlin/jvm/functions/Function2;", "lookaheadMeasurePolicy", "getLookaheadConstraints-msEJaDk", "lookaheadConstraints", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$a;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope */
/* loaded from: classes2.dex */
public interface SubcomposeIntermediateMeasureScope extends SubcomposeMeasureScope {
    /* renamed from: getLookaheadConstraints-msEJaDk */
    long mo72825getLookaheadConstraintsmsEJaDk();

    @NotNull
    Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getLookaheadMeasurePolicy();

    /* renamed from: getLookaheadSize-YbymL2g */
    long mo72826getLookaheadSizeYbymL2g();

    @NotNull
    List<Measurable> measurablesForSlot(@Nullable Object obj);

    @Override // androidx.compose.p003ui.layout.SubcomposeMeasureScope
    @NotNull
    List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}
