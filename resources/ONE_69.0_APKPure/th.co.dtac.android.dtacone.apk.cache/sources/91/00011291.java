package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0093\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m29142d2 = {"", "label", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "checkedSize", "checkedBorderSize", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "checkedRoundedCornerSize", "uncheckedColor", "uncheckedBorderColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "labelSpacer", "OneRoundedCornerCheckBox-7gqYH70", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FFJFJJLandroidx/compose/ui/text/TextStyle;FLandroidx/compose/runtime/Composer;III)V", "OneRoundedCornerCheckBox", OperatorName.CURVE_TO, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneRoundedCornerCheckBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRoundedCornerCheckBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRoundedCornerCheckBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n154#2:110\n154#2:111\n154#2:112\n154#2:113\n154#2:115\n76#3:114\n73#4,6:116\n79#4:150\n83#4:202\n78#5,11:122\n78#5,11:156\n91#5:196\n91#5:201\n456#6,8:133\n464#6,3:147\n456#6,8:167\n464#6,3:181\n50#6:185\n49#6:186\n467#6,3:193\n467#6,3:198\n25#6:203\n36#6:210\n4144#7,6:141\n4144#7,6:175\n67#8,5:151\n72#8:184\n76#8:197\n1097#9,6:187\n1097#9,6:204\n1097#9,6:211\n81#10:217\n81#10:218\n*S KotlinDebug\n*F\n+ 1 OneRoundedCornerCheckBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRoundedCornerCheckBoxKt\n*L\n41#1:110\n42#1:111\n44#1:112\n48#1:113\n59#1:115\n52#1:114\n56#1:116,6\n56#1:150\n56#1:202\n56#1:122,11\n66#1:156,11\n66#1:196\n56#1:201\n56#1:133,8\n56#1:147,3\n66#1:167,8\n66#1:181,3\n75#1:185\n75#1:186\n66#1:193,3\n56#1:198,3\n101#1:203\n107#1:210\n56#1:141,6\n66#1:175,6\n66#1:151,5\n66#1:184\n66#1:197\n75#1:187,6\n101#1:204,6\n107#1:211,6\n50#1:217\n51#1:218\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt */
/* loaded from: classes7.dex */
public final class OneRoundedCornerCheckBoxKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: OneRoundedCornerCheckBox-7gqYH70  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m75132OneRoundedCornerCheckBox7gqYH70(@org.jetbrains.annotations.NotNull java.lang.String r38, boolean r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r41, float r42, float r43, long r44, float r46, long r47, long r49, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r51, float r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt.m75132OneRoundedCornerCheckBox7gqYH70(java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, float, float, long, float, long, long, androidx.compose.ui.text.TextStyle, float, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final long m19990a(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* renamed from: b */
    public static final long m19989b(State state) {
        return ((Color) state.getValue()).m71929unboximpl();
    }

    /* renamed from: c */
    public static final void m19988c(Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(2007142200);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007142200, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.RoundedCornerCheckboxPreview (OneRoundedCornerCheckBox.kt:99)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = AbstractC19036aL1.m65148g(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            long Color = ColorKt.Color(4290052366L);
            long Color2 = ColorKt.Color(4288387995L);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new OneRoundedCornerCheckBoxKt$RoundedCornerCheckboxPreview$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            m75132OneRoundedCornerCheckBox7gqYH70("Checkbox", booleanValue, (Function1) rememberedValue2, null, 0.0f, 0.0f, Color, 0.0f, 0L, Color2, null, 0.0f, composer2, 806879238, 0, 3512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneRoundedCornerCheckBoxKt$RoundedCornerCheckboxPreview$2(i));
        }
    }
}