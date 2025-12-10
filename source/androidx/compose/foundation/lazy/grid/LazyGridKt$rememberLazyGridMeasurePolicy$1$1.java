package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,375:1\n495#2,4:376\n500#2:385\n129#3,5:380\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n322#1:376,4\n322#1:385\n322#1:380,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyGridItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, LazyGridSlots> $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/collections/ArrayList;", "line", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,375:1\n33#2,6:376\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n310#1:376,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1 */
    /* loaded from: classes.dex */
    public static final class C29181 extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> {
        final /* synthetic */ C2921xaa796ba $measuredLineProvider;
        final /* synthetic */ LazyGridSpanLayoutProvider $spanLayoutProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29181(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, C2921xaa796ba c2921xaa796ba) {
            super(1);
            this.$spanLayoutProvider = lazyGridSpanLayoutProvider;
            this.$measuredLineProvider = c2921xaa796ba;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final ArrayList<Pair<Integer, Constraints>> invoke(int i) {
            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.$spanLayoutProvider.getLineConfiguration(i);
            int firstItemIndex = lineConfiguration.getFirstItemIndex();
            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
            List<GridItemSpan> spans = lineConfiguration.getSpans();
            C2921xaa796ba c2921xaa796ba = this.$measuredLineProvider;
            int size = spans.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int m69611getCurrentLineSpanimpl = GridItemSpan.m69611getCurrentLineSpanimpl(spans.get(i3).m69614unboximpl());
                arrayList.add(TuplesKt.m28844to(Integer.valueOf(firstItemIndex), Constraints.m73615boximpl(c2921xaa796ba.m69630childConstraintsJhjzzOo$foundation_release(i2, m69611getCurrentLineSpanimpl))));
                firstItemIndex++;
                i2 += m69611getCurrentLineSpanimpl;
            }
            return arrayList;
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3 */
    /* loaded from: classes.dex */
    public static final class C29193 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29193(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
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
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, Function0<? extends LazyGridItemProvider> function0, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, LazyGridState lazyGridState, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = function0;
        this.$slots = function2;
        this.$state = lazyGridState;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m69625invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m73632unboximpl());
    }

    /* JADX WARN: Type inference failed for: r32v0, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridMeasureResult m69625invoke0kLqBqw(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        Orientation orientation;
        int mo69432roundToPx0680j_4;
        int mo69432roundToPx0680j_42;
        int i;
        int i2;
        float mo69484getSpacingD9Ej5fM;
        int m73626getMaxWidthimpl;
        long IntOffset;
        int firstVisibleItemScrollOffset;
        int i3;
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
        int i4 = mo69432roundToPx0680j_43 + mo69432roundToPx0680j_44;
        int i5 = mo69432roundToPx0680j_4 + mo69432roundToPx0680j_42;
        boolean z = this.$isVertical;
        if (z) {
            i = i4;
        } else {
            i = i5;
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
        int i6 = i - i2;
        long m73642offsetNN6EwU = ConstraintsKt.m73642offsetNN6EwU(j, -i5, -i4);
        LazyGridItemProvider invoke = this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
        final LazyGridSlots invoke2 = this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m73615boximpl(j));
        int length = invoke2.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        this.$state.setSlotsPerLine$foundation_release(length);
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
        final int mo69432roundToPx0680j_45 = lazyLayoutMeasureScope.mo69432roundToPx0680j_4(mo69484getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m73626getMaxWidthimpl = Constraints.m73625getMaxHeightimpl(j) - i4;
        } else {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j) - i5;
        }
        int i7 = m73626getMaxWidthimpl;
        if (this.$reverseLayout && i7 <= 0) {
            boolean z2 = this.$isVertical;
            if (!z2) {
                mo69432roundToPx0680j_4 += i7;
            }
            if (z2) {
                mo69432roundToPx0680j_43 += i7;
            }
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo69432roundToPx0680j_4, mo69432roundToPx0680j_43);
        }
        final ?? r32 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, mo69432roundToPx0680j_45, this.$isVertical, this.$reverseLayout, i2, i6, IntOffset) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1

            /* renamed from: d */
            public final /* synthetic */ LazyLayoutMeasureScope f13493d;

            /* renamed from: e */
            public final /* synthetic */ boolean f13494e;

            /* renamed from: f */
            public final /* synthetic */ boolean f13495f;

            /* renamed from: g */
            public final /* synthetic */ int f13496g;

            /* renamed from: h */
            public final /* synthetic */ int f13497h;

            /* renamed from: i */
            public final /* synthetic */ long f13498i;

            {
                this.f13493d = lazyLayoutMeasureScope;
                this.f13494e = r4;
                this.f13495f = r5;
                this.f13496g = i2;
                this.f13497h = i6;
                this.f13498i = IntOffset;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            @NotNull
            public LazyGridMeasuredItem createItem(int i8, @NotNull Object key, @Nullable Object obj, int i9, int i10, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyGridMeasuredItem(i8, key, this.f13494e, i9, i10, this.f13495f, this.f13493d.getLayoutDirection(), this.f13496g, this.f13497h, placeables, this.f13498i, obj, null);
            }
        };
        final boolean z3 = this.$isVertical;
        ?? r9 = new LazyGridMeasuredLineProvider(z3, invoke2, itemCount, mo69432roundToPx0680j_45, r32, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1

            /* renamed from: g */
            public final /* synthetic */ boolean f13499g;

            /* renamed from: h */
            public final /* synthetic */ LazyGridSlots f13500h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z3, invoke2, itemCount, mo69432roundToPx0680j_45, r32, spanLayoutProvider);
                this.f13499g = z3;
                this.f13500h = invoke2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            @NotNull
            public LazyGridMeasuredLine createLine(int i8, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int i9) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(spans, "spans");
                return new LazyGridMeasuredLine(i8, items, this.f13500h, spans, this.f13499g, i9);
            }
        };
        this.$state.setPrefetchInfoRetriever$foundation_release(new C29181(spanLayoutProvider, r9));
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState.getFirstVisibleItemIndex());
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                i3 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                firstVisibleItemScrollOffset = 0;
                Unit unit = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
                LazyGridMeasureResult m69627measureLazyGridZRKPzZ8 = LazyGridMeasureKt.m69627measureLazyGridZRKPzZ8(itemCount, r9, r32, i7, i2, i6, mo69432roundToPx0680j_45, i3, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m73642offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, calculateLazyLayoutPinnedIndices, new C29193(lazyLayoutMeasureScope, j, i5, i4));
                this.$state.applyMeasureResult$foundation_release(m69627measureLazyGridZRKPzZ8);
                return m69627measureLazyGridZRKPzZ8;
            }
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
            firstVisibleItemScrollOffset = lazyGridState.getFirstVisibleItemScrollOffset();
            i3 = lineIndexOfItem;
            Unit unit2 = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            List<Integer> calculateLazyLayoutPinnedIndices2 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
            LazyGridMeasureResult m69627measureLazyGridZRKPzZ82 = LazyGridMeasureKt.m69627measureLazyGridZRKPzZ8(itemCount, r9, r32, i7, i2, i6, mo69432roundToPx0680j_45, i3, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m73642offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, calculateLazyLayoutPinnedIndices2, new C29193(lazyLayoutMeasureScope, j, i5, i4));
            this.$state.applyMeasureResult$foundation_release(m69627measureLazyGridZRKPzZ82);
            return m69627measureLazyGridZRKPzZ82;
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }
}
