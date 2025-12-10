package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import android.graphics.Bitmap;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.window.AndroidDialog_androidKt;
import androidx.compose.p003ui.window.DialogProperties;
import androidx.compose.p003ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a:\u0010\u001a\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aI\u0010\u001e\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001e\u0010%\u001a\u000f\u0010&\u001a\u00020\u0004H\u0003¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0004H\u0003¢\u0006\u0004\b(\u0010'\u001a\u000f\u0010)\u001a\u00020\u0004H\u0003¢\u0006\u0004\b)\u0010'\u001a\u000f\u0010*\u001a\u00020\u0004H\u0003¢\u0006\u0004\b*\u0010'\u001a\u000f\u0010+\u001a\u00020\u0004H\u0003¢\u0006\u0004\b+\u0010'\u001a\u000f\u0010,\u001a\u00020\u0004H\u0003¢\u0006\u0004\b,\u0010'\u001a\u000f\u0010-\u001a\u00020\u0004H\u0003¢\u0006\u0004\b-\u0010'\u001a\u000f\u0010.\u001a\u00020\u0004H\u0003¢\u0006\u0004\b.\u0010'¨\u0006/"}, m28850d2 = {"", TextBundle.TEXT_ENTRY, "Lth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogLoadingAlignment;", "alignment", "", "OneDialogLoading", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogLoadingAlignment;Landroidx/compose/runtime/Composer;II)V", MessageBundle.TITLE_ENTRY, "confirmText", "cancelText", "Lkotlin/Function0;", "onConfirm", "onDismiss", "OneDialogConfirm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OneDialogChooser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "OneDialogMessage", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Landroid/graphics/Bitmap;", "bitmap", "OneDialogImagePreview", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "content", "OneDialogFullScreen", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "OneDialogError", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "desc", "userId", "errorCode", "systemMessage", "dateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", OperatorName.CLOSE_PATH, "(Landroidx/compose/runtime/Composer;I)V", "e", OperatorName.FILL_NON_ZERO, OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.NON_STROKING_GRAY, "d", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,645:1\n25#2:646\n25#2:653\n25#2:660\n25#2:667\n25#2:674\n83#2,3:681\n1097#3,6:647\n1097#3,6:654\n1097#3,6:661\n1097#3,6:668\n1097#3,6:675\n1097#3,6:684\n81#4:690\n107#4,2:691\n81#4:699\n107#4,2:700\n75#5:693\n108#5,2:694\n75#5:696\n108#5,2:697\n75#5:702\n108#5,2:703\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt\n*L\n329#1:646\n330#1:653\n331#1:660\n332#1:667\n333#1:674\n334#1:681,3\n329#1:647,6\n330#1:654,6\n331#1:661,6\n332#1:668,6\n333#1:675,6\n334#1:684,6\n329#1:690\n329#1:691,2\n332#1:699\n332#1:700,2\n330#1:693\n330#1:694,2\n331#1:696\n331#1:697,2\n333#1:702\n333#1:703,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt */
/* loaded from: classes7.dex */
public final class OneDialogKt {
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
        if ((r29 & 4) != 0) goto L46;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneDialogChooser(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt.OneDialogChooser(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneDialogConfirm(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt.OneDialogConfirm(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OneDialogError(@NotNull CommonErrorResponse error, @NotNull Function0<Unit> onDismiss, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(973957596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(973957596, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogError (OneDialog.kt:447)");
        }
        OneDialogError(error.getDesc(), error.getUserId(), error.getCode(), error.getSystemMessage(), onDismiss, error.getResponseDateTime(), startRestartGroup, (i << 9) & 57344, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OneDialogKt$OneDialogError$1(error, onDismiss, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneDialogFullScreen(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt.OneDialogFullScreen(kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OneDialogImagePreview(@NotNull Bitmap bitmap, @NotNull Function0<Unit> onDismiss, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1353188152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353188152, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogImagePreview (OneDialog.kt:322)");
        }
        ImageBitmap asImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
        long IntSize = IntSizeKt.IntSize(asImageBitmap.getWidth(), asImageBitmap.getHeight());
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(IntSize.m73810boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = AbstractC19508dK1.m31891g(Offset.m71491boximpl(OffsetKt.Offset(0.0f, 0.0f)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = PrimitiveSnapshotStateKt.mutableFloatStateOf(4.0f);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue5;
        Object[] objArr = {mutableFloatState, mutableFloatState2, mutableState2, mutableFloatState3, mutableState};
        startRestartGroup.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z |= startRestartGroup.changed(objArr[i2]);
        }
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (z || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new OneDialogKt$OneDialogImagePreview$state$1$1(mutableFloatState, mutableFloatState2, mutableState2, mutableFloatState3, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        OneDialogFullScreen(onDismiss, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1312548972, true, new OneDialogKt$OneDialogImagePreview$1(TransformableStateKt.rememberTransformableState((Function3) rememberedValue6, startRestartGroup, 0), bitmap, mutableState, mutableFloatState3, IntSize, onDismiss, i, mutableFloatState, mutableState2)), startRestartGroup, ((i >> 3) & 14) | 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$OneDialogImagePreview$2(bitmap, onDismiss, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OneDialogLoading(@Nullable String str, @Nullable OneDialogLoadingAlignment oneDialogLoadingAlignment, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1969720104);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed(oneDialogLoadingAlignment)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                str = "";
            }
            if (i7 != 0) {
                oneDialogLoadingAlignment = OneDialogLoadingAlignment.Column;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969720104, i3, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogLoading (OneDialog.kt:60)");
            }
            AndroidDialog_androidKt.Dialog(OneDialogKt$OneDialogLoading$1.INSTANCE, new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(startRestartGroup, 108233839, true, new OneDialogKt$OneDialogLoading$2(oneDialogLoadingAlignment, str, i3)), startRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$OneDialogLoading$3(str, oneDialogLoadingAlignment, i, i2));
        }
    }

    @Composable
    public static final void OneDialogMessage(@NotNull Object text, @NotNull Function0<Unit> onDismiss, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(200640600);
        if ((i2 & 4) != 0) {
            str = StringResources_androidKt.stringResource(R.string.ok, startRestartGroup, 0);
            i3 = i & (-897);
        } else {
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(200640600, i3, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogMessage (OneDialog.kt:242)");
        }
        AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, (SecureFlagPolicy) null, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.composableLambda(startRestartGroup, 1123156591, true, new OneDialogKt$OneDialogMessage$1(text, onDismiss, str, i3)), startRestartGroup, ((i3 >> 3) & 14) | 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$OneDialogMessage$2(text, onDismiss, str, i, i2));
        }
    }

    /* renamed from: a */
    public static final void m19844a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1889218049);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1889218049, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogChoosePreview (OneDialog.kt:610)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74938getLambda8$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogChoosePreview$1(i));
        }
    }

    /* renamed from: b */
    public static final void m19843b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1733932063);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733932063, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogConfirmNoTitlePreview (OneDialog.kt:598)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74937getLambda7$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogConfirmNoTitlePreview$1(i));
        }
    }

    /* renamed from: c */
    public static final void m19842c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1569983548);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1569983548, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogConfirmPreview (OneDialog.kt:585)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74936getLambda6$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogConfirmPreview$1(i));
        }
    }

    /* renamed from: d */
    public static final void m19841d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(293749252);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(293749252, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogErrorPreview (OneDialog.kt:633)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74931getLambda10$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogErrorPreview$1(i));
        }
    }

    /* renamed from: e */
    public static final void m19840e(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1967047762);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1967047762, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogLoadingColumnPreview (OneDialog.kt:569)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74934getLambda4$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogLoadingColumnPreview$1(i));
        }
    }

    /* renamed from: f */
    public static final void m19839f(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1228756250);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1228756250, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogLoadingRowPreview (OneDialog.kt:577)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74935getLambda5$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogLoadingRowPreview$1(i));
        }
    }

    /* renamed from: g */
    public static final void m19838g(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1543116852);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1543116852, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogOneButtonPreview (OneDialog.kt:622)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74939getLambda9$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogOneButtonPreview$1(i));
        }
    }

    /* renamed from: h */
    public static final void m19837h(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1369792875);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1369792875, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.DialogProgressPreview (OneDialog.kt:561)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$OneDialogKt.INSTANCE.m74933getLambda3$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OneDialogKt$DialogProgressPreview$1(i));
        }
    }

    /* renamed from: i */
    public static final long m19836i(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).m73822unboximpl();
    }

    /* renamed from: j */
    public static final long m19835j(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).m71512unboximpl();
    }

    /* renamed from: k */
    public static final void m19834k(MutableState mutableState, long j) {
        mutableState.setValue(Offset.m71491boximpl(j));
    }

    /* renamed from: l */
    public static final float m19833l(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* renamed from: m */
    public static final void m19832m(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }

    /* renamed from: n */
    public static final void m19831n(MutableState mutableState, long j) {
        mutableState.setValue(IntSize.m73810boximpl(j));
    }

    /* renamed from: o */
    public static final float m19830o(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* renamed from: p */
    public static final void m19829p(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }

    /* renamed from: q */
    public static final float m19828q(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* renamed from: r */
    public static final void m19827r(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneDialogError(@org.jetbrains.annotations.NotNull java.lang.String r49, @org.jetbrains.annotations.NotNull java.lang.String r50, @org.jetbrains.annotations.NotNull java.lang.String r51, @org.jetbrains.annotations.NotNull java.lang.String r52, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r53, @org.jetbrains.annotations.Nullable java.lang.String r54, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt.OneDialogError(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }
}
