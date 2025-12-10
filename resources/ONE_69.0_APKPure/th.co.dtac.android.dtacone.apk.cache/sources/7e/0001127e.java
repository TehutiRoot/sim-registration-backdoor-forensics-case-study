package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aK\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"", "value", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "icon", "iconModifier", "placeholder", "", "isEnable", "", "OneOutlineTextBox", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneOutlineTextBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n154#2:148\n154#2:156\n154#2:164\n154#2:165\n154#2:207\n154#2:243\n154#2:244\n154#2:245\n25#3:149\n36#3:157\n36#3:166\n456#3,8:189\n464#3,3:203\n456#3,8:225\n464#3,3:239\n456#3,8:262\n464#3,3:276\n467#3,3:280\n467#3,3:285\n467#3,3:290\n1097#4,6:150\n1097#4,6:158\n1097#4,6:167\n67#5,5:173\n72#5:206\n67#5,5:246\n72#5:279\n76#5:284\n76#5:294\n78#6,11:178\n78#6,11:214\n78#6,11:251\n91#6:283\n91#6:288\n91#6:293\n4144#7,6:197\n4144#7,6:233\n4144#7,6:270\n73#8,6:208\n79#8:242\n83#8:289\n81#9:295\n107#9,2:296\n*S KotlinDebug\n*F\n+ 1 OneOutlineTextBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextBoxKt\n*L\n46#1:148\n63#1:156\n73#1:164\n74#1:165\n80#1:207\n82#1:243\n90#1:244\n96#1:245\n51#1:149\n65#1:157\n75#1:166\n60#1:189,8\n60#1:203,3\n78#1:225,8\n78#1:239,3\n92#1:262,8\n92#1:276,3\n92#1:280,3\n78#1:285,3\n60#1:290,3\n51#1:150,6\n65#1:158,6\n75#1:167,6\n60#1:173,5\n60#1:206\n92#1:246,5\n92#1:279\n92#1:284\n60#1:294\n60#1:178,11\n78#1:214,11\n92#1:251,11\n92#1:283\n78#1:288\n60#1:293\n60#1:197,6\n78#1:233,6\n92#1:270,6\n78#1:208,6\n78#1:242\n78#1:289\n51#1:295\n51#1:296,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBoxKt */
/* loaded from: classes7.dex */
public final class OneOutlineTextBoxKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneOutlineTextBox(@org.jetbrains.annotations.NotNull java.lang.String r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r42, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.painter.Painter r43, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r44, @org.jetbrains.annotations.Nullable java.lang.String r45, boolean r46, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBoxKt.OneOutlineTextBox(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Modifier, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m20001a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-727607246);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727607246, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextBox (OneOutlineTextBox.kt:125)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneOutlineTextBoxKt.INSTANCE.m75124getLambda1$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneOutlineTextBoxKt$OneOutlineTextBox$5(i));
        }
    }

    /* renamed from: b */
    public static final FocusState m20000b(MutableState mutableState) {
        return (FocusState) mutableState.getValue();
    }

    /* renamed from: c */
    public static final void m19999c(MutableState mutableState, FocusState focusState) {
        mutableState.setValue(focusState);
    }
}