package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\u0002\b\u00122\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001d\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\b\u0012H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a&\u0010\u001b\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a.\u0010\u001f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m29142d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Lkotlin/ExtensionFunctionType;", "slots", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "rememberStaggeredGridMeasurePolicy-nbWgWpA", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberStaggeredGridMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", PDPageLabelRange.STYLE_LETTERS_LOWER, "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,164:1\n83#2,3:165\n1097#3,6:168\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n48#1:165,3\n48#1:168,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final float m61098a(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            }
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            return paddingValues.mo69345calculateTopPaddingD9Ej5fM();
        } else {
            return paddingValues.mo69342calculateBottomPaddingD9Ej5fM();
        }
    }

    /* renamed from: b */
    public static final float m61097b(PaddingValues paddingValues, Orientation orientation, boolean z, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (z) {
                    return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            }
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            return paddingValues.mo69342calculateBottomPaddingD9Ej5fM();
        } else {
            return paddingValues.mo69345calculateTopPaddingD9Ej5fM();
        }
    }

    /* renamed from: c */
    public static final float m61096c(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return paddingValues.mo69345calculateTopPaddingD9Ej5fM();
            }
            throw new NoWhenBranchMatchedException();
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L18;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: rememberStaggeredGridMeasurePolicy-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult> m69843rememberStaggeredGridMeasurePolicynbWgWpA(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r14, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider> r15, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.PaddingValues r16, boolean r17, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.Orientation r18, float r19, float r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.p003ui.unit.Density, ? super androidx.compose.p003ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, int r23) {
        /*
            r4 = r14
            r3 = r15
            r5 = r16
            r1 = r18
            r2 = r21
            r8 = r22
            r0 = 1
            r6 = 0
            r7 = 8
            java.lang.String r9 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r9)
            java.lang.String r9 = "itemProviderLambda"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r9)
            java.lang.String r9 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r9)
            java.lang.String r9 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            java.lang.String r9 = "slots"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r9)
            r9 = -2134671531(0xffffffff80c37f55, float:-1.79536E-38)
            r8.startReplaceableGroup(r9)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L3f
            r10 = -1
            java.lang.String r11 = "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:38)"
            r12 = r23
            androidx.compose.runtime.ComposerKt.traceEventStart(r9, r12, r10, r11)
        L3f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r17)
            androidx.compose.ui.unit.Dp r10 = androidx.compose.p003ui.unit.C3623Dp.m73840boximpl(r19)
            androidx.compose.ui.unit.Dp r11 = androidx.compose.p003ui.unit.C3623Dp.m73840boximpl(r20)
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r6] = r4
            r12[r0] = r3
            r13 = 2
            r12[r13] = r5
            r13 = 3
            r12[r13] = r9
            r9 = 4
            r12[r9] = r1
            r9 = 5
            r12[r9] = r10
            r9 = 6
            r12[r9] = r11
            r9 = 7
            r12[r9] = r2
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r8.startReplaceableGroup(r9)
            r9 = 0
        L6a:
            if (r6 >= r7) goto L75
            r10 = r12[r6]
            boolean r10 = r8.changed(r10)
            r9 = r9 | r10
            int r6 = r6 + r0
            goto L6a
        L75:
            java.lang.Object r0 = r22.rememberedValue()
            if (r9 != 0) goto L83
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L98
        L83:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 r9 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
            r0 = r9
            r1 = r18
            r2 = r21
            r3 = r15
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateRememberedValue(r9)
        L98:
            r22.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto La6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La6:
            r22.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.m69843rememberStaggeredGridMeasurePolicynbWgWpA(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, float, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function2");
    }
}