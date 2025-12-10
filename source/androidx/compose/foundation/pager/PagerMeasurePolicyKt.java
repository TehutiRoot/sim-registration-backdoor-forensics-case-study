package androidx.compose.foundation.pager;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0094\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, m28850d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "pageCount", "rememberPagerMeasurePolicy-BxUkNYg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,190:1\n83#2,3:191\n1097#3,6:194\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n54#1:191,3\n54#1:194,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L18;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /* renamed from: rememberPagerMeasurePolicy-BxUkNYg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Constraints, androidx.compose.p003ui.layout.MeasureResult> m69682rememberPagerMeasurePolicyBxUkNYg(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> r14, @org.jetbrains.annotations.NotNull androidx.compose.foundation.pager.PagerState r15, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.PaddingValues r16, boolean r17, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.Orientation r18, int r19, float r20, @org.jetbrains.annotations.NotNull androidx.compose.foundation.pager.PageSize r21, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Alignment.Horizontal r22, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Alignment.Vertical r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Integer> r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            r4 = r15
            r2 = r16
            r1 = r18
            r6 = r21
            r8 = r24
            r12 = r25
            r0 = 1
            r3 = 0
            r5 = 10
            java.lang.String r7 = "itemProviderLambda"
            r9 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r7)
            java.lang.String r7 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r7)
            java.lang.String r7 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.lang.String r7 = "pageSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r7 = "pageCount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            r7 = -241579856(0xfffffffff199c8b0, float:-1.5230023E30)
            r12.startReplaceableGroup(r7)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L48
            java.lang.String r10 = "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:41)"
            r11 = r26
            r13 = r27
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r11, r13, r10)
        L48:
            androidx.compose.ui.unit.Dp r7 = androidx.compose.p003ui.unit.C3641Dp.m73656boximpl(r20)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r3] = r2
            r11[r0] = r7
            r7 = 2
            r11[r7] = r6
            r7 = 3
            r11[r7] = r4
            r7 = 4
            r11[r7] = r2
            r7 = 5
            r11[r7] = r10
            r7 = 6
            r11[r7] = r1
            r7 = 7
            r11[r7] = r22
            r7 = 8
            r11[r7] = r23
            r7 = 9
            r11[r7] = r8
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.startReplaceableGroup(r7)
            r7 = 0
        L77:
            if (r3 >= r5) goto L82
            r10 = r11[r3]
            boolean r10 = r12.changed(r10)
            r7 = r7 | r10
            int r3 = r3 + r0
            goto L77
        L82:
            java.lang.Object r0 = r25.rememberedValue()
            if (r7 != 0) goto L90
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r0 != r3) goto Lad
        L90:
            androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 r13 = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
            r0 = r13
            r1 = r18
            r2 = r16
            r3 = r17
            r4 = r15
            r5 = r20
            r6 = r21
            r7 = r14
            r8 = r24
            r9 = r23
            r10 = r22
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.updateRememberedValue(r13)
        Lad:
            r25.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Lbb
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lbb:
            r25.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasurePolicyKt.m69682rememberPagerMeasurePolicyBxUkNYg(kotlin.jvm.functions.Function0, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
