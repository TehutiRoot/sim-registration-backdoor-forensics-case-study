package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "setKeyBoardNumber", "shouldFocus", "useButtonSearch", "", "placeHolder", "textState", "Lkotlin/Function0;", "", "onSearchClick", "Lkotlin/Function1;", "onTextChange", "OneSearchBox", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSearchBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSearchBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSearchBoxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,191:1\n25#2:192\n67#2,3:199\n66#2:202\n456#2,8:227\n464#2,3:241\n36#2:255\n467#2,3:263\n1097#3,6:193\n1097#3,6:203\n1097#3,6:256\n72#4,7:209\n79#4:244\n83#4:267\n78#5,11:216\n91#5:266\n4144#6,6:235\n154#7:245\n154#7:246\n154#7:247\n154#7:248\n154#7:249\n154#7:250\n154#7:251\n154#7:252\n164#7:253\n154#7:254\n154#7:262\n*S KotlinDebug\n*F\n+ 1 OneSearchBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSearchBoxKt\n*L\n60#1:192\n63#1:199,3\n63#1:202\n70#1:227,8\n70#1:241,3\n157#1:255\n70#1:263,3\n60#1:193,6\n63#1:203,6\n157#1:256,6\n70#1:209,7\n70#1:244\n70#1:267\n70#1:216,11\n70#1:266\n70#1:235,6\n76#1:245\n78#1:246\n79#1:247\n80#1:248\n85#1:249\n161#1:250\n162#1:251\n163#1:252\n168#1:253\n168#1:254\n181#1:262\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt */
/* loaded from: classes7.dex */
public final class OneSearchBoxKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneSearchBox(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r35, boolean r36, boolean r37, boolean r38, @org.jetbrains.annotations.Nullable java.lang.String r39, @org.jetbrains.annotations.NotNull java.lang.String r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt.OneSearchBox(androidx.compose.ui.Modifier, boolean, boolean, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m19812a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1637080966);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1637080966, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxPreview (OneSearchBox.kt:187)");
            }
            OneSearchBox(null, false, false, true, null, "", null, OneSearchBoxKt$OneSearchBoxPreview$1.INSTANCE, startRestartGroup, 12782592, 87);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneSearchBoxKt$OneSearchBoxPreview$2(i));
        }
    }
}
