package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0089\u0001\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"", "label", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "radioSize", "radioBorderSize", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "checkedBorderColor", "uncheckedBorderColor", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "labelSpacer", "OneRadioButton-7dS3OtE", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FFJJJLandroidx/compose/ui/text/TextStyle;FLandroidx/compose/runtime/Composer;III)V", "OneRadioButton", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneRadioBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRadioBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRadioBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,98:1\n154#2:99\n154#2:100\n154#2:101\n76#3:102\n1#4:103\n73#5,6:104\n79#5:138\n83#5:151\n78#6,11:110\n91#6:150\n456#7,8:121\n464#7,3:135\n50#7:139\n49#7:140\n467#7,3:147\n4144#8,6:129\n1097#9,6:141\n81#10:152\n81#10:153\n*S KotlinDebug\n*F\n+ 1 OneRadioBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneRadioBoxKt\n*L\n38#1:99\n39#1:100\n44#1:101\n47#1:102\n58#1:104,6\n58#1:138\n58#1:151\n58#1:110,11\n58#1:150\n58#1:121,8\n58#1:135,3\n71#1:139\n71#1:140\n58#1:147,3\n58#1:129,6\n71#1:141,6\n46#1:152\n52#1:153\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneRadioBoxKt */
/* loaded from: classes7.dex */
public final class OneRadioBoxKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: OneRadioButton-7dS3OtE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m74947OneRadioButton7dS3OtE(@org.jetbrains.annotations.NotNull java.lang.String r60, boolean r61, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r62, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r63, float r64, float r65, long r66, long r68, long r70, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r72, float r73, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneRadioBoxKt.m74947OneRadioButton7dS3OtE(java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, float, float, long, long, long, androidx.compose.ui.text.TextStyle, float, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final void m19818a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-477945793);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477945793, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneRadioButtonPreview (OneRadioBox.kt:88)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneRadioBoxKt.INSTANCE.m74941getLambda1$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneRadioBoxKt$OneRadioButtonPreview$1(i));
        }
    }

    /* renamed from: b */
    public static final long m19817b(State state) {
        return ((Color) state.getValue()).m71745unboximpl();
    }

    /* renamed from: c */
    public static final float m19816c(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
