package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
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
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,339:1\n495#2,4:340\n500#2:349\n129#3,5:344\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:340,4\n294#1:349\n294#1:344,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyListItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    @Metadata(m28851d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2 */
    /* loaded from: classes.dex */
    public static final class C29102 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29102(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyListState lazyListState, Function0<? extends LazyListItemProvider> function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProviderLambda = function0;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m69599invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m73632unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyListMeasureResult m69599invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        Orientation orientation;
        int mo69432roundToPx0680j_4;
        int mo69432roundToPx0680j_42;
        int i;
        int i2;
        float mo69484getSpacingD9Ej5fM;
        int m73626getMaxWidthimpl;
        long IntOffset;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m69340checkScrollableContainerConstraintsK40F9xA(j, orientation);
        if (this.$isVertical) {
            mo69432roundToPx0680j_4 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69157calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69432roundToPx0680j_4 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            mo69432roundToPx0680j_42 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69158calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69432roundToPx0680j_42 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo69432roundToPx0680j_43 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69159calculateTopPaddingD9Ej5fM());
        int mo69432roundToPx0680j_44 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(this.$contentPadding.mo69156calculateBottomPaddingD9Ej5fM());
        int i3 = mo69432roundToPx0680j_43 + mo69432roundToPx0680j_44;
        int i4 = mo69432roundToPx0680j_4 + mo69432roundToPx0680j_42;
        boolean z = this.$isVertical;
        if (z) {
            i = i3;
        } else {
            i = i4;
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
        int i5 = i - i2;
        long m73642offsetNN6EwU = ConstraintsKt.m73642offsetNN6EwU(j, -i4, -i3);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        LazyListItemProvider invoke = this.$itemProviderLambda.invoke();
        invoke.getItemScope().setMaxSize(Constraints.m73626getMaxWidthimpl(m73642offsetNN6EwU), Constraints.m73625getMaxHeightimpl(m73642offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                mo69484getSpacingD9Ej5fM = vertical.mo69484getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                mo69484getSpacingD9Ej5fM = horizontal.mo69484getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        int mo69432roundToPx0680j_45 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(mo69484getSpacingD9Ej5fM);
        int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m73626getMaxWidthimpl = Constraints.m73625getMaxHeightimpl(j) - i3;
        } else {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j) - i4;
        }
        int i6 = m73626getMaxWidthimpl;
        if (this.$reverseLayout && i6 <= 0) {
            boolean z2 = this.$isVertical;
            if (!z2) {
                mo69432roundToPx0680j_4 += i6;
            }
            if (z2) {
                mo69432roundToPx0680j_43 += i6;
            }
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        }
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m73642offsetNN6EwU, this.$isVertical, invoke, lazyLayoutMeasureScope, itemCount, mo69432roundToPx0680j_45, this.$horizontalAlignment, this.$verticalAlignment, this.$reverseLayout, i2, i5, IntOffset) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1

            /* renamed from: d */
            public final /* synthetic */ boolean f13378d;

            /* renamed from: e */
            public final /* synthetic */ LazyLayoutMeasureScope f13379e;

            /* renamed from: f */
            public final /* synthetic */ int f13380f;

            /* renamed from: g */
            public final /* synthetic */ int f13381g;

            /* renamed from: h */
            public final /* synthetic */ Alignment.Horizontal f13382h;

            /* renamed from: i */
            public final /* synthetic */ Alignment.Vertical f13383i;

            /* renamed from: j */
            public final /* synthetic */ boolean f13384j;

            /* renamed from: k */
            public final /* synthetic */ int f13385k;

            /* renamed from: l */
            public final /* synthetic */ int f13386l;

            /* renamed from: m */
            public final /* synthetic */ long f13387m;

            {
                this.f13378d = r3;
                this.f13379e = lazyLayoutMeasureScope;
                this.f13380f = itemCount;
                this.f13381g = mo69432roundToPx0680j_45;
                this.f13382h = r8;
                this.f13383i = r9;
                this.f13384j = r10;
                this.f13385k = i2;
                this.f13386l = i5;
                this.f13387m = IntOffset;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            @NotNull
            public LazyListMeasuredItem createItem(int i7, @NotNull Object key, @Nullable Object obj, @NotNull List<? extends Placeable> placeables) {
                int i8;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                if (i7 == this.f13380f - 1) {
                    i8 = 0;
                } else {
                    i8 = this.f13381g;
                }
                return new LazyListMeasuredItem(i7, placeables, this.f13378d, this.f13382h, this.f13383i, this.f13379e.getLayoutDirection(), this.f13384j, this.f13385k, this.f13386l, i8, this.f13387m, key, obj, null);
            }
        };
        this.$state.m69606setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m69604getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
            LazyListMeasureResult m69602measureLazyListCD5nmq0 = LazyListMeasureKt.m69602measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, i6, i2, i5, mo69432roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m73642offsetNN6EwU, this.$isVertical, invoke.getHeaderIndexes(), this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), this.$beyondBoundsItemCount, calculateLazyLayoutPinnedIndices, new C29102(lazyLayoutMeasureScope, j, i4, i3));
            this.$state.applyMeasureResult$foundation_release(m69602measureLazyListCD5nmq0);
            return m69602measureLazyListCD5nmq0;
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }
}
