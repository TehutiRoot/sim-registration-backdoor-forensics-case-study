package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000N\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u0012\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0017\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m28850d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuDescription", "expandedDescription", "collapsedDescription", "e", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "verticalMarginInPx", "onHeightUpdate", OperatorName.FILL_NON_ZERO, "(Landroid/view/View;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "ExposedDropdownMenuItemHorizontalPadding", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n76#2:1059\n76#2:1060\n76#2:1106\n25#3:1061\n25#3:1068\n25#3:1076\n25#3:1083\n83#3,3:1090\n460#3,13:1118\n473#3,3:1132\n50#3:1137\n49#3:1138\n36#3:1145\n83#3,3:1152\n1114#4,6:1062\n1114#4,6:1069\n1114#4,6:1077\n1114#4,6:1084\n1114#4,6:1093\n1114#4,6:1139\n1114#4,6:1146\n1114#4,6:1155\n1#5:1075\n67#6,6:1099\n73#6:1131\n77#6:1136\n75#7:1105\n76#7,11:1107\n89#7:1135\n76#8:1161\n102#8,2:1162\n76#8:1164\n102#8,2:1165\n154#9:1167\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material3/ExposedDropdownMenuKt\n*L\n107#1:1059\n108#1:1060\n150#1:1106\n109#1:1061\n110#1:1068\n112#1:1076\n114#1:1083\n116#1:1090,3\n150#1:1118,13\n150#1:1132,3\n154#1:1137\n154#1:1138\n1021#1:1145\n1031#1:1152,3\n109#1:1062,6\n110#1:1069,6\n112#1:1077,6\n114#1:1084,6\n116#1:1093,6\n154#1:1139,6\n1021#1:1146,6\n1031#1:1155,6\n150#1:1099,6\n150#1:1131\n150#1:1136\n150#1:1105\n150#1:1107,11\n150#1:1135\n109#1:1161\n109#1:1162,2\n110#1:1164\n110#1:1165,2\n1057#1:1167\n*E\n"})
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuKt {

    /* renamed from: a */
    public static final float f25780a = C3641Dp.m73658constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174 A[LOOP:0: B:70:0x0172->B:71:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ca  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ExposedDropdownMenuBox(final boolean r20, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final int m60647a(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* renamed from: b */
    public static final void m60646b(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static final int m60645c(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* renamed from: d */
    public static final void m60644d(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L31;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.p003ui.Modifier m60643e(androidx.compose.p003ui.Modifier r14, boolean r15, kotlin.jvm.functions.Function0 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r5 = r16
            r6 = r20
            r7 = 0
            r0 = 5
            r8 = 1
            r1 = 1006563320(0x3bfeeff8, float:0.0077800713)
            r6.startReplaceableGroup(r1)
            r2 = 4
            r3 = r22 & 4
            r4 = 6
            if (r3 == 0) goto L1f
            androidx.compose.material3.Strings$Companion r3 = androidx.compose.material3.Strings.Companion
            int r3 = r3.m70596getExposedDropdownMenuadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m70619getStringNWtq28(r3, r6, r4)
            r9 = r3
            goto L21
        L1f:
            r9 = r17
        L21:
            r3 = r22 & 8
            if (r3 == 0) goto L30
            androidx.compose.material3.Strings$Companion r3 = androidx.compose.material3.Strings.Companion
            int r3 = r3.m70598getMenuExpandedadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m70619getStringNWtq28(r3, r6, r4)
            goto L32
        L30:
            r3 = r18
        L32:
            r10 = r22 & 16
            if (r10 == 0) goto L41
            androidx.compose.material3.Strings$Companion r10 = androidx.compose.material3.Strings.Companion
            int r10 = r10.m70597getMenuCollapsedadMyvUU()
            java.lang.String r4 = androidx.compose.material3.Strings_androidKt.m70619getStringNWtq28(r10, r6, r4)
            goto L43
        L41:
            r4 = r19
        L43:
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L51
            r10 = -1
            java.lang.String r11 = "androidx.compose.material3.expandable (ExposedDropdownMenu.kt:1014)"
            r12 = r21
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r12, r10, r11)
        L51:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r10 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r10)
            boolean r10 = r6.changed(r5)
            java.lang.Object r11 = r20.rememberedValue()
            r12 = 0
            if (r10 != 0) goto L6c
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r11 != r10) goto L74
        L6c:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1 r11 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1
            r11.<init>(r5, r12)
            r6.updateRememberedValue(r11)
        L74:
            r20.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10 = r14
            androidx.compose.ui.Modifier r10 = androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(r14, r1, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r7] = r1
            r11[r8] = r3
            r1 = 2
            r11[r1] = r4
            r1 = 3
            r11[r1] = r9
            r11[r2] = r5
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r6.startReplaceableGroup(r1)
            r1 = 0
            r2 = 0
        L98:
            if (r1 >= r0) goto La3
            r13 = r11[r1]
            boolean r13 = r6.changed(r13)
            r2 = r2 | r13
            int r1 = r1 + r8
            goto L98
        La3:
            java.lang.Object r0 = r20.rememberedValue()
            if (r2 != 0) goto Lb1
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto Lc0
        Lb1:
            androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1 r11 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1
            r0 = r11
            r1 = r15
            r2 = r3
            r3 = r4
            r4 = r9
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateRememberedValue(r11)
        Lc0:
            r20.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.p003ui.semantics.SemanticsModifierKt.semantics$default(r10, r7, r0, r8, r12)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Ld2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Ld2:
            r20.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.m60643e(androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.Modifier");
    }

    /* renamed from: f */
    public static final void m60642f(View view, LayoutCoordinates layoutCoordinates, int i, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float top = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop();
        int i2 = rect.top;
        function1.invoke(Integer.valueOf(((int) Math.max(top - i2, (rect.bottom - i2) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
    }
}
