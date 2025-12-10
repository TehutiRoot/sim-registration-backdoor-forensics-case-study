package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,190:1\n1#2:191\n495#3,4:192\n500#3:201\n129#4,5:196\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n144#1:192,4\n144#1:201\n144#1:196,5\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> {
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function0<PagerLazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ Function0<Integer> $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    @Metadata(m28851d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2 */
    /* loaded from: classes.dex */
    public static final class C29642 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29642(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j;
            this.$totalHorizontalPadding = i;
            this.$totalVerticalPadding = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
        }

        @NotNull
        public final MeasureResult invoke(int i, int i2, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
            Intrinsics.checkNotNullParameter(placement, "placement");
            return this.$this_null.layout(ConstraintsKt.m73640constrainWidthK40F9xA(this.$containerConstraints, i + this.$totalHorizontalPadding), ConstraintsKt.m73639constrainHeightK40F9xA(this.$containerConstraints, i2 + this.$totalVerticalPadding), AbstractC11687a.emptyMap(), placement);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(Orientation orientation, PaddingValues paddingValues, boolean z, PagerState pagerState, float f, PageSize pageSize, Function0<PagerLazyLayoutItemProvider> function0, Function0<Integer> function02, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i) {
        super(2);
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$state = pagerState;
        this.$pageSpacing = f;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = function0;
        this.$pageCount = function02;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondBoundsPageCount = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m69683invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m73632unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final PagerMeasureResult m69683invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        boolean z;
        Orientation orientation;
        int mo69432roundToPx0680j_4;
        int mo69432roundToPx0680j_42;
        int i;
        int i2;
        int m73626getMaxWidthimpl;
        long IntOffset;
        int i3;
        int i4;
        int firstVisiblePageOffset$foundation_release;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        Orientation orientation2 = this.$orientation;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 == orientation3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            orientation = orientation3;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m69340checkScrollableContainerConstraintsK40F9xA(j, orientation);
        if (z) {
            mo69432roundToPx0680j_4 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69157calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69432roundToPx0680j_4 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (z) {
            mo69432roundToPx0680j_42 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69158calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69432roundToPx0680j_42 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo69432roundToPx0680j_43 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69159calculateTopPaddingD9Ej5fM());
        int mo69432roundToPx0680j_44 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69156calculateBottomPaddingD9Ej5fM());
        int i5 = mo69432roundToPx0680j_43 + mo69432roundToPx0680j_44;
        int i6 = mo69432roundToPx0680j_4 + mo69432roundToPx0680j_42;
        if (z) {
            i = i5;
        } else {
            i = i6;
        }
        if (z && !this.$reverseLayout) {
            i2 = mo69432roundToPx0680j_43;
        } else if (z && this.$reverseLayout) {
            i2 = mo69432roundToPx0680j_44;
        } else if (!z && !this.$reverseLayout) {
            i2 = mo69432roundToPx0680j_4;
        } else {
            i2 = mo69432roundToPx0680j_42;
        }
        int i7 = i - i2;
        long m73642offsetNN6EwU = ConstraintsKt.m73642offsetNN6EwU(j, -i6, -i5);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        int mo69432roundToPx0680j_45 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$pageSpacing);
        if (z) {
            m73626getMaxWidthimpl = Constraints.m73625getMaxHeightimpl(j) - i5;
        } else {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j) - i6;
        }
        if (this.$reverseLayout && m73626getMaxWidthimpl <= 0) {
            if (!z) {
                mo69432roundToPx0680j_4 += m73626getMaxWidthimpl;
            }
            if (z) {
                mo69432roundToPx0680j_43 += m73626getMaxWidthimpl;
            }
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        }
        long j2 = IntOffset;
        int calculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, m73626getMaxWidthimpl, mo69432roundToPx0680j_45);
        PagerState pagerState = this.$state;
        if (this.$orientation == orientation3) {
            i3 = Constraints.m73626getMaxWidthimpl(m73642offsetNN6EwU);
        } else {
            i3 = calculateMainAxisPageSize;
        }
        if (this.$orientation != orientation3) {
            i4 = Constraints.m73625getMaxHeightimpl(m73642offsetNN6EwU);
        } else {
            i4 = calculateMainAxisPageSize;
        }
        pagerState.m69686setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, i3, 0, i4, 5, null));
        Snapshot.Companion companion = Snapshot.Companion;
        PagerState pagerState2 = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int firstVisiblePage$foundation_release = pagerState2.getFirstVisiblePage$foundation_release();
            if (Intrinsics.areEqual(pagerState2.getLayoutInfo$foundation_release(), PagerStateKt.getEmptyLayoutInfo())) {
                firstVisiblePageOffset$foundation_release = AbstractC21140mr0.roundToInt(pagerState2.getInitialPageOffsetFraction() * calculateMainAxisPageSize);
            } else {
                firstVisiblePageOffset$foundation_release = pagerState2.getFirstVisiblePageOffset$foundation_release();
            }
            int i8 = firstVisiblePageOffset$foundation_release;
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            PagerLazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
            List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedPages$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
            PagerMeasureResult m69681measurePagerntgEbfI = PagerMeasureKt.m69681measurePagerntgEbfI(lazyLayoutMeasureScope, this.$pageCount.invoke().intValue(), invoke, m73626getMaxWidthimpl, i2, i7, mo69432roundToPx0680j_45, firstVisiblePage$foundation_release, i8, this.$state.getScrollToBeConsumed$foundation_release(), m73642offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, j2, calculateMainAxisPageSize, this.$beyondBoundsPageCount, calculateLazyLayoutPinnedIndices, new C29642(lazyLayoutMeasureScope, j, i6, i5));
            this.$state.applyMeasureResult$foundation_release(m69681measurePagerntgEbfI);
            return m69681measurePagerntgEbfI;
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }
}
