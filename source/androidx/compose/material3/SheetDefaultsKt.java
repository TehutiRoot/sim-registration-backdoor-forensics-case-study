package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001aB\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u001d\u001a\u00020\u00168\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "DragHandleVerticalPadding", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBottomSheetMaxWidth", "()F", "BottomSheetMaxWidth", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n83#2,3:430\n1114#3,6:433\n154#4:439\n154#4:440\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n423#1:430,3\n423#1:433,6\n428#1:439\n429#1:440\n*E\n"})
/* loaded from: classes2.dex */
public final class SheetDefaultsKt {

    /* renamed from: a */
    public static final float f26052a = C3641Dp.m73658constructorimpl(22);

    /* renamed from: b */
    public static final float f26053b = C3641Dp.m73658constructorimpl(640);

    @NotNull
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(@NotNull final SheetState sheetState, @NotNull final Orientation orientation, @NotNull final Function1<? super Float, Unit> onFling) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onFling, "onFling");
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            /* renamed from: a */
            private final float m60569a(long j) {
                if (orientation == Orientation.Horizontal) {
                    return Offset.m71502getXimpl(j);
                }
                return Offset.m71503getYimpl(j);
            }

            /* renamed from: b */
            private final long m60568b(float f) {
                float f2;
                Orientation orientation2 = orientation;
                if (orientation2 == Orientation.Horizontal) {
                    f2 = f;
                } else {
                    f2 = 0.0f;
                }
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return OffsetKt.Offset(f2, f);
            }

            /* renamed from: c */
            private final float m60567c(long j) {
                if (orientation == Orientation.Horizontal) {
                    return Velocity.m73883getXimpl(j);
                }
                return Velocity.m73884getYimpl(j);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo69445onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
                onFling.invoke(Boxing.boxFloat(m60567c(j2)));
                return Velocity.m73874boximpl(j2);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
                if (NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72628getDragWNlRxjI())) {
                    return m60568b(SheetState.this.getSwipeableState$material3_release().dispatchRawDelta(m60569a(j2)));
                }
                return Offset.Companion.m71518getZeroF1C5BW0();
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo69447onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
                float m60567c = m60567c(j);
                float requireOffset = SheetState.this.requireOffset();
                if (m60567c < 0.0f && requireOffset > SheetState.this.getSwipeableState$material3_release().getMinOffset()) {
                    onFling.invoke(Boxing.boxFloat(m60567c));
                } else {
                    j = Velocity.Companion.m73894getZero9UxMQ8M();
                }
                return Velocity.m73874boximpl(j);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo69448onPreScrollOzD1aCk(long j, int i) {
                float m60569a = m60569a(j);
                if (m60569a < 0.0f && NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72628getDragWNlRxjI())) {
                    return m60568b(SheetState.this.getSwipeableState$material3_release().dispatchRawDelta(m60569a));
                }
                return Offset.Companion.m71518getZeroF1C5BW0();
            }
        };
    }

    public static final float getBottomSheetMaxWidth() {
        return f26053b;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberSheetState(boolean z, @Nullable Function1<? super SheetValue, Boolean> function1, @Nullable SheetValue sheetValue, boolean z2, @Nullable Composer composer, int i, int i2) {
        boolean z3;
        Function1<? super SheetValue, Boolean> function12;
        SheetValue sheetValue2;
        boolean z4;
        composer.startReplaceableGroup(1032784200);
        if ((i2 & 1) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 2) != 0) {
            function12 = SheetDefaultsKt$rememberSheetState$1.INSTANCE;
        } else {
            function12 = function1;
        }
        if ((i2 & 4) != 0) {
            sheetValue2 = SheetValue.Hidden;
        } else {
            sheetValue2 = sheetValue;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:410)");
        }
        Object[] objArr = {Boolean.valueOf(z3), function12};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z3, function12);
        Object[] objArr2 = {Boolean.valueOf(z3), sheetValue2, function12, Boolean.valueOf(z4)};
        composer.startReplaceableGroup(-568225417);
        boolean z5 = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z5 |= composer.changed(objArr2[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SheetDefaultsKt$rememberSheetState$2$1(z3, sheetValue2, function12, z4);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.m71406rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetState;
    }
}
