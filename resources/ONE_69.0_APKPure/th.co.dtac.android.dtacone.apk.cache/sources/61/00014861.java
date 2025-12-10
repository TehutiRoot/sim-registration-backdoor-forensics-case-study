package th.p047co.dtac.android.dtacone.view.compose.upPass.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u001a³\u0001\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m29142d2 = {"", "dismiss", "", "attemptCount", "maxAttempt", "allowManualKyc", "allowManualKyc2ndLine", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineServiceTimeState;", "kyc2ServiceTimeState", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineSubmitState;", "kyc2SubmitState", "isKyc2Done", "Lkotlin/Function0;", "", "onKyc2CheckServiceTime", "onKyc2Submit", "onKyc2Waiting", "onDismiss", "onSuccess", "onFailed", "onRetryIdDoc", "ReviewFaceCompareErrorDialog", "(ZIIZZLth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineServiceTimeState;Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineSubmitState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "i", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "d", "(Landroidx/compose/runtime/Composer;I)V", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReviewFaceCompareDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewFaceCompareDialogs.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/ReviewFaceCompareDialogsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,217:1\n36#2:218\n25#2:225\n25#2:232\n67#2,3:239\n66#2:242\n36#2:249\n50#2:256\n49#2:257\n36#2:264\n1097#3,6:219\n1097#3,6:226\n1097#3,6:233\n1097#3,6:243\n1097#3,6:250\n1097#3,6:258\n1097#3,6:265\n81#4:271\n107#4,2:272\n81#4:274\n107#4,2:275\n*S KotlinDebug\n*F\n+ 1 ReviewFaceCompareDialogs.kt\nth/co/dtac/android/dtacone/view/compose/upPass/widget/ReviewFaceCompareDialogsKt\n*L\n52#1:218\n59#1:225\n60#1:232\n64#1:239,3\n64#1:242\n69#1:249\n81#1:256\n81#1:257\n95#1:264\n52#1:219,6\n59#1:226,6\n60#1:233,6\n64#1:243,6\n69#1:250,6\n81#1:258,6\n95#1:265,6\n59#1:271\n59#1:272,2\n60#1:274\n60#1:275,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.widget.ReviewFaceCompareDialogsKt */
/* loaded from: classes10.dex */
public final class ReviewFaceCompareDialogsKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ReviewFaceCompareErrorDialog(boolean r29, int r30, int r31, boolean r32, boolean r33, @org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineServiceTimeState r34, @org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineSubmitState r35, boolean r36, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r37, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r38, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r40, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r43, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.compose.upPass.widget.ReviewFaceCompareDialogsKt.ReviewFaceCompareErrorDialog(boolean, int, int, boolean, boolean, th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineServiceTimeState, th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineSubmitState, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final void m9117a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(349739287);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(349739287, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.DialogManualKyc2NotServiceTimePreview (ReviewFaceCompareDialogs.kt:194)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$ReviewFaceCompareDialogsKt.INSTANCE.m75292getLambda4$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C15872x9893f4bb(i));
        }
    }

    /* renamed from: b */
    public static final void m9116b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1753057640);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1753057640, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.DialogManualKyc2Preview (ReviewFaceCompareDialogs.kt:169)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$ReviewFaceCompareDialogsKt.INSTANCE.m75291getLambda3$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareDialogsKt$DialogManualKyc2Preview$1(i));
        }
    }

    /* renamed from: c */
    public static final void m9115c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(144367240);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144367240, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.DialogManualKycPreview (ReviewFaceCompareDialogs.kt:146)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$ReviewFaceCompareDialogsKt.INSTANCE.m75290getLambda2$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareDialogsKt$DialogManualKycPreview$1(i));
        }
    }

    /* renamed from: d */
    public static final void m9114d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1006422318);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1006422318, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.DialogMaxAttemptPreview (ReviewFaceCompareDialogs.kt:123)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$ReviewFaceCompareDialogsKt.INSTANCE.m75289getLambda1$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareDialogsKt$DialogMaxAttemptPreview$1(i));
        }
    }

    /* renamed from: e */
    public static final boolean m9113e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: f */
    public static final void m9112f(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public static final boolean m9111g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: h */
    public static final void m9110h(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: i */
    public static final void m9109i(Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1012184343);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1012184343, i2, -1, "th.co.dtac.android.dtacone.view.compose.upPass.widget.ShowErrorTryAgainDialog (ReviewFaceCompareDialogs.kt:114)");
            }
            OneDialogKt.OneDialogMessageRed(Integer.valueOf(R.string.up_pass_face_compare_error_no_manual_kyc_message), function0, null, startRestartGroup, (i2 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareDialogsKt$ShowErrorTryAgainDialog$1(function0, i));
        }
    }
}