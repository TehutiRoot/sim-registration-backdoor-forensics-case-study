package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aO\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"", "sessionId", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "formType", "", "allowManualKYC", "", "maxAttempt", "allowManualKYC2ndLine", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "formResult", "Lkotlin/Function0;", "", "onNextClick", "FaceCompareResultScreen", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;ZIZLth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFaceCompareResultScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCompareResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/FaceCompareResultScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,108:1\n72#2,6:109\n78#2:143\n82#2:149\n78#3,11:115\n91#3:148\n456#4,8:126\n464#4,3:140\n467#4,3:145\n4144#5,6:134\n154#6:144\n*S KotlinDebug\n*F\n+ 1 FaceCompareResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/FaceCompareResultScreenKt\n*L\n58#1:109,6\n58#1:143\n58#1:149\n58#1:115,11\n58#1:148\n58#1:126,8\n58#1:140,3\n58#1:145,3\n58#1:134,6\n68#1:144\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.FaceCompareResultScreenKt */
/* loaded from: classes10.dex */
public final class FaceCompareResultScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FaceCompareResultScreen(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType r24, boolean r25, int r26, boolean r27, @org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult r28, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen.FaceCompareResultScreenKt.FaceCompareResultScreen(java.lang.String, th.co.dtac.android.dtacone.model.upPass.UpPassFormType, boolean, int, boolean, th.co.dtac.android.dtacone.model.upPass.UpPassFormResult, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m9084a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(752924225);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(752924225, i, -1, "th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.FaceCompareResultPreview (FaceCompareResultScreen.kt:74)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -115080849, true, new FaceCompareResultScreenKt$FaceCompareResultPreview$1(new UpPassFormType.FaceCompareLiveness(null, false, 0, null, null, false, null, null, 255, null))), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new FaceCompareResultScreenKt$FaceCompareResultPreview$2(i));
        }
    }
}