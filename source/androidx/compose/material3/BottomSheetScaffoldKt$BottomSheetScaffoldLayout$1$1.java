package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $body;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1 */
    /* loaded from: classes2.dex */
    public static final class C32321 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ Placeable $bodyPlaceable;
        final /* synthetic */ int $sheetOffsetX;
        final /* synthetic */ int $sheetOffsetY;
        final /* synthetic */ Placeable $sheetPlaceable;
        final /* synthetic */ int $snackbarOffsetX;
        final /* synthetic */ int $snackbarOffsetY;
        final /* synthetic */ Placeable $snackbarPlaceable;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ Placeable $topBarPlaceable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32321(Placeable placeable, int i, Placeable placeable2, Placeable placeable3, int i2, int i3, Placeable placeable4, int i4, int i5) {
            super(1);
            this.$bodyPlaceable = placeable;
            this.$topBarHeight = i;
            this.$topBarPlaceable = placeable2;
            this.$sheetPlaceable = placeable3;
            this.$sheetOffsetX = i2;
            this.$sheetOffsetY = i3;
            this.$snackbarPlaceable = placeable4;
            this.$snackbarOffsetX = i4;
            this.$snackbarOffsetY = i5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$bodyPlaceable, 0, this.$topBarHeight, 0.0f, 4, null);
            Placeable placeable = this.$topBarPlaceable;
            if (placeable != null) {
                Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, 0, 0.0f, 4, null);
            }
            Placeable.PlacementScope.placeRelative$default(layout, this.$sheetPlaceable, this.$sheetOffsetX, this.$sheetOffsetY, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(layout, this.$snackbarPlaceable, this.$snackbarOffsetX, this.$snackbarOffsetY, 0.0f, 4, null);
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0<Float> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, SheetState sheetState, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function3, int i, Modifier modifier, long j, long j2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, float f) {
        super(2);
        this.$sheetOffset = function0;
        this.$topBar = function2;
        this.$snackbarHost = function22;
        this.$sheetState = sheetState;
        this.$bottomSheet = function3;
        this.$$dirty = i;
        this.$modifier = modifier;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$body = function32;
        this.$sheetPeekHeight = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m70208invoke0kLqBqw(subcomposeMeasureScope, constraints.m73632unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m70208invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
        Placeable placeable;
        int i;
        int height;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        long m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        Placeable mo72811measureBRTryo0 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new C3235xb0851876(this.$bottomSheet, m73625getMaxHeightimpl, this.$$dirty))).get(0).mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        int roundToInt = AbstractC21140mr0.roundToInt(this.$sheetOffset.invoke().floatValue());
        int max = Math.max(0, (m73626getMaxWidthimpl - mo72811measureBRTryo0.getWidth()) / 2);
        Function2<Composer, Integer, Unit> function2 = this.$topBar;
        if (function2 != null) {
            placeable = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new C3236x64c48d6(function2, this.$$dirty))).get(0).mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        Placeable placeable2 = placeable;
        if (placeable2 != null) {
            i = placeable2.getHeight();
        } else {
            i = 0;
        }
        Placeable mo72811measureBRTryo02 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new C3233xcc9d0b25(this.$modifier, this.$containerColor, this.$contentColor, this.$$dirty, this.$body, this.$sheetPeekHeight))).get(0).mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(m73618copyZbe2FdA$default, 0, 0, 0, m73625getMaxHeightimpl - i, 7, null));
        Placeable mo72811measureBRTryo03 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        int width = (m73626getMaxWidthimpl - mo72811measureBRTryo03.getWidth()) / 2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            height = m73625getMaxHeightimpl - mo72811measureBRTryo03.getHeight();
        } else {
            height = roundToInt - mo72811measureBRTryo03.getHeight();
        }
        return MeasureScope.CC.m59532q(SubcomposeLayout, m73626getMaxWidthimpl, m73625getMaxHeightimpl, null, new C32321(mo72811measureBRTryo02, i, placeable2, mo72811measureBRTryo0, max, roundToInt, mo72811measureBRTryo03, width, height), 4, null);
    }
}
