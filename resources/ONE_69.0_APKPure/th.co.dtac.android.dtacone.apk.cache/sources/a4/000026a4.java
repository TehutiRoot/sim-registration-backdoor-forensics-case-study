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
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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

    @Metadata(m29143d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2 */
    /* loaded from: classes.dex */
    public static final class C28922 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28922(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
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
            return this.$this_null.layout(ConstraintsKt.m73824constrainWidthK40F9xA(this.$containerConstraints, i + this.$totalHorizontalPadding), ConstraintsKt.m73823constrainHeightK40F9xA(this.$containerConstraints, i2 + this.$totalVerticalPadding), AbstractC11663a.emptyMap(), placement);
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
        return m69783invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyListMeasureResult m69783invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        Orientation orientation;
        int mo69616roundToPx0680j_4;
        int mo69616roundToPx0680j_42;
        int i;
        int i2;
        float mo69668getSpacingD9Ej5fM;
        int m73810getMaxWidthimpl;
        long IntOffset;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m69526checkScrollableContainerConstraintsK40F9xA(j, orientation);
        if (this.$isVertical) {
            mo69616roundToPx0680j_4 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(this.$contentPadding.mo69343calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69616roundToPx0680j_4 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            mo69616roundToPx0680j_42 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(this.$contentPadding.mo69344calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo69616roundToPx0680j_42 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo69616roundToPx0680j_43 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(this.$contentPadding.mo69345calculateTopPaddingD9Ej5fM());
        int mo69616roundToPx0680j_44 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(this.$contentPadding.mo69342calculateBottomPaddingD9Ej5fM());
        int i3 = mo69616roundToPx0680j_43 + mo69616roundToPx0680j_44;
        int i4 = mo69616roundToPx0680j_4 + mo69616roundToPx0680j_42;
        boolean z = this.$isVertical;
        if (z) {
            i = i3;
        } else {
            i = i4;
        }
        if (z && !this.$reverseLayout) {
            i2 = mo69616roundToPx0680j_43;
        } else if (z && this.$reverseLayout) {
            i2 = mo69616roundToPx0680j_44;
        } else if (!z && !this.$reverseLayout) {
            i2 = mo69616roundToPx0680j_4;
        } else {
            i2 = mo69616roundToPx0680j_42;
        }
        final int i5 = i - i2;
        final long m73826offsetNN6EwU = ConstraintsKt.m73826offsetNN6EwU(j, -i4, -i3);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        final LazyListItemProvider invoke = this.$itemProviderLambda.invoke();
        invoke.getItemScope().setMaxSize(Constraints.m73810getMaxWidthimpl(m73826offsetNN6EwU), Constraints.m73809getMaxHeightimpl(m73826offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                mo69668getSpacingD9Ej5fM = vertical.mo69668getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                mo69668getSpacingD9Ej5fM = horizontal.mo69668getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        final int mo69616roundToPx0680j_45 = lazyLayoutMeasureScope.mo69616roundToPx0680j_4(mo69668getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m73810getMaxWidthimpl = Constraints.m73809getMaxHeightimpl(j) - i3;
        } else {
            m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j) - i4;
        }
        int i6 = m73810getMaxWidthimpl;
        if (this.$reverseLayout && i6 <= 0) {
            boolean z2 = this.$isVertical;
            if (!z2) {
                mo69616roundToPx0680j_4 += i6;
            }
            if (z2) {
                mo69616roundToPx0680j_43 += i6;
            }
            IntOffset = IntOffsetKt.IntOffset(mo69616roundToPx0680j_4, mo69616roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo69616roundToPx0680j_4, mo69616roundToPx0680j_43);
        }
        final long j2 = IntOffset;
        final boolean z3 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z4 = this.$reverseLayout;
        final int i7 = i2;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m73826offsetNN6EwU, z3, invoke, lazyLayoutMeasureScope, itemCount, mo69616roundToPx0680j_45, horizontal2, vertical2, z4, i7, i5, j2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1

            /* renamed from: d */
            public final /* synthetic */ boolean f13466d;

            /* renamed from: e */
            public final /* synthetic */ LazyLayoutMeasureScope f13467e;

            /* renamed from: f */
            public final /* synthetic */ int f13468f;

            /* renamed from: g */
            public final /* synthetic */ int f13469g;

            /* renamed from: h */
            public final /* synthetic */ Alignment.Horizontal f13470h;

            /* renamed from: i */
            public final /* synthetic */ Alignment.Vertical f13471i;

            /* renamed from: j */
            public final /* synthetic */ boolean f13472j;

            /* renamed from: k */
            public final /* synthetic */ int f13473k;

            /* renamed from: l */
            public final /* synthetic */ int f13474l;

            /* renamed from: m */
            public final /* synthetic */ long f13475m;

            {
                this.f13466d = z3;
                this.f13467e = lazyLayoutMeasureScope;
                this.f13468f = itemCount;
                this.f13469g = mo69616roundToPx0680j_45;
                this.f13470h = horizontal2;
                this.f13471i = vertical2;
                this.f13472j = z4;
                this.f13473k = i7;
                this.f13474l = i5;
                this.f13475m = j2;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            @NotNull
            public LazyListMeasuredItem createItem(int i8, @NotNull Object key, @Nullable Object obj, @NotNull List<? extends Placeable> placeables) {
                int i9;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                if (i8 == this.f13468f - 1) {
                    i9 = 0;
                } else {
                    i9 = this.f13469g;
                }
                return new LazyListMeasuredItem(i8, placeables, this.f13466d, this.f13470h, this.f13471i, this.f13467e.getLayoutDirection(), this.f13472j, this.f13473k, this.f13474l, i9, this.f13475m, key, obj, null);
            }
        };
        this.$state.m69790setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m69788getChildConstraintsmsEJaDk());
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
            LazyListMeasureResult m69786measureLazyListCD5nmq0 = LazyListMeasureKt.m69786measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, i6, i2, i5, mo69616roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m73826offsetNN6EwU, this.$isVertical, invoke.getHeaderIndexes(), this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), this.$beyondBoundsItemCount, calculateLazyLayoutPinnedIndices, new C28922(lazyLayoutMeasureScope, j, i4, i3));
            this.$state.applyMeasureResult$foundation_release(m69786measureLazyListCD5nmq0);
            return m69786measureLazyListCD5nmq0;
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }
}