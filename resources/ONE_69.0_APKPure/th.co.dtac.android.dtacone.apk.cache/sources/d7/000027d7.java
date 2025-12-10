package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,164:1\n51#2:165\n51#2:166\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n92#1:165\n95#1:166\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 */
/* loaded from: classes.dex */
public final class C2936x5d1e95ce extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function0<LazyStaggeredGridItemProvider> $itemProviderLambda;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, LazyStaggeredGridSlots> $slots;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2936x5d1e95ce(Orientation orientation, Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> function2, Function0<? extends LazyStaggeredGridItemProvider> function0, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f) {
        super(2);
        this.$orientation = orientation;
        this.$slots = function2;
        this.$itemProviderLambda = function0;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$mainAxisSpacing = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m69844invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m69844invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        boolean z;
        float m61097b;
        float m61098a;
        float m61096c;
        int m73810getMaxWidthimpl;
        long IntOffset;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        CheckScrollableContainerConstraintsKt.m69526checkScrollableContainerConstraintsK40F9xA(j, this.$orientation);
        LazyStaggeredGridSlots invoke = this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m73799boximpl(j));
        if (this.$orientation == Orientation.Vertical) {
            z = true;
        } else {
            z = false;
        }
        LazyStaggeredGridItemProvider invoke2 = this.$itemProviderLambda.invoke();
        this.$state.setSlots$foundation_release(invoke);
        this.$state.setVertical$foundation_release(z);
        this.$state.setSpanProvider$foundation_release(invoke2.getSpanProvider());
        m61097b = LazyStaggeredGridMeasurePolicyKt.m61097b(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo69616roundToPx0680j_4 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(m61097b);
        m61098a = LazyStaggeredGridMeasurePolicyKt.m61098a(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo69616roundToPx0680j_42 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(m61098a);
        m61096c = LazyStaggeredGridMeasurePolicyKt.m61096c(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection());
        int mo69616roundToPx0680j_43 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(m61096c);
        if (z) {
            m73810getMaxWidthimpl = Constraints.m73809getMaxHeightimpl(j);
        } else {
            m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        }
        int i = (m73810getMaxWidthimpl - mo69616roundToPx0680j_4) - mo69616roundToPx0680j_42;
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(mo69616roundToPx0680j_43, mo69616roundToPx0680j_4);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo69616roundToPx0680j_4, mo69616roundToPx0680j_43);
        }
        long j2 = IntOffset;
        PaddingValues paddingValues = this.$contentPadding;
        int mo69616roundToPx0680j_44 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(C3623Dp.m73842constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        int mo69616roundToPx0680j_45 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(C3623Dp.m73842constructorimpl(paddingValues2.mo69345calculateTopPaddingD9Ej5fM() + paddingValues2.mo69342calculateBottomPaddingD9Ej5fM()));
        boolean z2 = z;
        LazyStaggeredGridMeasureResult m69842measureStaggeredGriddSVRQoE = LazyStaggeredGridMeasureKt.m69842measureStaggeredGriddSVRQoE(lazyLayoutMeasureScope, this.$state, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke2, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), invoke2, invoke, Constraints.m73802copyZbe2FdA$default(j, ConstraintsKt.m73824constrainWidthK40F9xA(j, mo69616roundToPx0680j_44), 0, ConstraintsKt.m73823constrainHeightK40F9xA(j, mo69616roundToPx0680j_45), 0, 10, null), z2, this.$reverseLayout, j2, i, lazyLayoutMeasureScope.mo69616roundToPx0680j_4(this.$mainAxisSpacing), mo69616roundToPx0680j_4, mo69616roundToPx0680j_42);
        this.$state.applyMeasureResult$foundation_release(m69842measureStaggeredGriddSVRQoE);
        return m69842measureStaggeredGriddSVRQoE;
    }
}