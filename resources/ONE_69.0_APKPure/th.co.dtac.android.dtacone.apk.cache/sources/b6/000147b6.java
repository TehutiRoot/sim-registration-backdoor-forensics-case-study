package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormOwnerType;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState;

@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\u001aù\u0001\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u000f2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000f2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0085\u0001\u0010$\u001a\u00020\u0007*\u00020\u001d2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00070\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0007H\u0003¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\u0007H\u0003¢\u0006\u0004\b*\u0010'\u001a7\u00100\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020+2\b\b\u0001\u0010-\u001a\u00020+2\b\b\u0001\u0010.\u001a\u00020+2\b\b\u0001\u0010/\u001a\u00020+H\u0003¢\u0006\u0004\b0\u00101\u001a\u000f\u00102\u001a\u00020\u0007H\u0003¢\u0006\u0004\b2\u0010'\u001a\u000f\u00103\u001a\u00020\u0007H\u0003¢\u0006\u0004\b3\u0010'\u001a\u000f\u00104\u001a\u00020\u0007H\u0003¢\u0006\u0004\b4\u0010'\u001a\u000f\u00105\u001a\u00020\u0007H\u0003¢\u0006\u0004\b5\u0010'\u001a\u000f\u00106\u001a\u00020\u0007H\u0003¢\u0006\u0004\b6\u0010'\u001a\u000f\u00107\u001a\u00020\u0007H\u0003¢\u0006\u0004\b7\u0010'\u001a\u000f\u00108\u001a\u00020\u0007H\u0003¢\u0006\u0004\b8\u0010'\u001a\u000f\u00109\u001a\u00020\u0007H\u0003¢\u0006\u0004\b9\u0010'\u001a\u000f\u0010:\u001a\u00020\u0007H\u0003¢\u0006\u0004\b:\u0010'\u001a\u000f\u0010;\u001a\u00020\u0007H\u0003¢\u0006\u0004\b;\u0010'\u001a\u000f\u0010<\u001a\u00020\u0007H\u0003¢\u0006\u0004\b<\u0010'\u001a\u000f\u0010=\u001a\u00020\u0007H\u0003¢\u0006\u0004\b=\u0010'¨\u0006>"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;", "formType", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/UpPassFormState;", "formState", "Lth/co/dtac/android/dtacone/view/compose/upPass/widget/WebViewController;", "webCtrl", "Lkotlin/Function0;", "", "onWebViewSuccess", "onWebViewFailed", "", "isCardReaderConnected", "cardReaderMode", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/IdCardReaderState;", "cardReaderState", "Lkotlin/Function1;", "onSwitchCardReaderMode", "onStartFetchingCardDataLoop", "onStopFetchingCardDataLoop", "Lkotlinx/coroutines/flow/SharedFlow;", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "onSuccessReadFinish", "onSaveIdCardInfo", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/ExitCallbackState;", "onExit", "onSuccess", "onReCreateForm", "UpPassFormScreen", "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Lth/co/dtac/android/dtacone/viewmodel/upPass/state/UpPassFormState;Lth/co/dtac/android/dtacone/view/compose/upPass/widget/WebViewController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLth/co/dtac/android/dtacone/viewmodel/upPass/state/IdCardReaderState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "onErrorUrl", "onErrorResult", "onResultSuccess", "Landroidx/compose/ui/Modifier;", "modifier", "D", "(Landroidx/compose/foundation/layout/ColumnScope;Lth/co/dtac/android/dtacone/view/compose/upPass/widget/WebViewController;Lth/co/dtac/android/dtacone/viewmodel/upPass/state/UpPassFormState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", OperatorName.FILL_NON_ZERO, "(Lth/co/dtac/android/dtacone/model/upPass/UpPassFormType;Landroidx/compose/runtime/Composer;I)V", "e", "", TextBundle.TEXT_ENTRY, "icon", "textColor", "backgroundColor", OperatorName.NON_STROKING_GRAY, "(IIIILandroidx/compose/runtime/Composer;I)V", OperatorName.STROKING_COLOR_GRAY, "d", "F", OperatorName.CURVE_TO, ExifInterface.LONGITUDE_EAST, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.MOVE_TO, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.SET_LINE_JOINSTYLE, OperatorName.CLOSE_PATH, "i", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUpPassFormScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassFormScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/UpPassFormScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,605:1\n25#2:606\n25#2:613\n25#2:620\n25#2:627\n25#2:634\n25#2:641\n25#2:648\n25#2:655\n36#2:662\n456#2,8:686\n464#2,3:700\n456#2,8:722\n464#2,3:736\n67#2,3:740\n66#2:743\n67#2,3:750\n66#2:753\n467#2,3:760\n456#2,8:782\n464#2,3:796\n50#2:800\n49#2:801\n50#2:808\n49#2:809\n36#2:816\n467#2,3:823\n467#2,3:828\n50#2:833\n49#2:834\n36#2:841\n50#2:848\n49#2:849\n36#2:856\n50#2:863\n49#2:864\n36#2:871\n50#2:878\n49#2:879\n50#2:886\n49#2:887\n36#2:894\n456#2,8:917\n464#2,3:931\n467#2,3:936\n1097#3,6:607\n1097#3,6:614\n1097#3,6:621\n1097#3,6:628\n1097#3,6:635\n1097#3,6:642\n1097#3,6:649\n1097#3,6:656\n1097#3,6:663\n1097#3,6:744\n1097#3,6:754\n1097#3,6:802\n1097#3,6:810\n1097#3,6:817\n1097#3,6:835\n1097#3,6:842\n1097#3,6:850\n1097#3,6:857\n1097#3,6:865\n1097#3,6:872\n1097#3,6:880\n1097#3,6:888\n1097#3,6:895\n72#4,6:669\n78#4:703\n71#4,7:704\n78#4:739\n82#4:764\n72#4,6:765\n78#4:799\n82#4:827\n82#4:832\n78#5,11:675\n78#5,11:711\n91#5:763\n78#5,11:771\n91#5:826\n91#5:831\n78#5,11:906\n91#5:939\n4144#6,6:694\n4144#6,6:730\n4144#6,6:790\n4144#6,6:925\n154#7:901\n154#7:902\n154#7:903\n154#7:935\n77#8,2:904\n79#8:934\n83#8:940\n81#9:941\n107#9,2:942\n81#9:944\n107#9,2:945\n81#9:947\n107#9,2:948\n81#9:950\n107#9,2:951\n81#9:953\n107#9,2:954\n81#9:956\n107#9,2:957\n81#9:959\n107#9,2:960\n81#9:962\n81#9:963\n*S KotlinDebug\n*F\n+ 1 UpPassFormScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/UpPassFormScreenKt\n*L\n76#1:606\n77#1:613\n78#1:620\n79#1:627\n80#1:634\n81#1:641\n82#1:648\n83#1:655\n89#1:662\n95#1:686,8\n95#1:700,3\n98#1:722,8\n98#1:736,3\n100#1:740,3\n100#1:743\n108#1:750,3\n108#1:753\n98#1:760,3\n121#1:782,8\n121#1:796,3\n182#1:800\n182#1:801\n188#1:808\n188#1:809\n194#1:816\n121#1:823,3\n95#1:828,3\n209#1:833\n209#1:834\n213#1:841\n221#1:848\n221#1:849\n225#1:856\n233#1:863\n233#1:864\n237#1:871\n256#1:878\n256#1:879\n269#1:886\n269#1:887\n311#1:894\n360#1:917,8\n360#1:931,3\n360#1:936,3\n76#1:607,6\n77#1:614,6\n78#1:621,6\n79#1:628,6\n80#1:635,6\n81#1:642,6\n82#1:649,6\n83#1:656,6\n89#1:663,6\n100#1:744,6\n108#1:754,6\n182#1:802,6\n188#1:810,6\n194#1:817,6\n209#1:835,6\n213#1:842,6\n221#1:850,6\n225#1:857,6\n233#1:865,6\n237#1:872,6\n256#1:880,6\n269#1:888,6\n311#1:895,6\n95#1:669,6\n95#1:703\n98#1:704,7\n98#1:739\n98#1:764\n121#1:765,6\n121#1:799\n121#1:827\n95#1:832\n95#1:675,11\n98#1:711,11\n98#1:763\n121#1:771,11\n121#1:826\n95#1:831\n360#1:906,11\n360#1:939\n95#1:694,6\n98#1:730,6\n121#1:790,6\n360#1:925,6\n361#1:901\n365#1:902\n367#1:903\n374#1:935\n360#1:904,2\n360#1:934\n360#1:940\n76#1:941\n76#1:942,2\n77#1:944\n77#1:945,2\n78#1:947\n78#1:948,2\n79#1:950\n79#1:951,2\n80#1:953\n80#1:954,2\n81#1:956\n81#1:957,2\n82#1:959\n82#1:960,2\n83#1:962\n89#1:963\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpPassFormOwnerType.values().length];
            try {
                iArr[UpPassFormOwnerType.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpPassFormOwnerType.Attorney.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: A */
    public static final void m9158A(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: B */
    public static final boolean m9157B(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: C */
    public static final void m9156C(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m9155D(androidx.compose.foundation.layout.ColumnScope r21, th.p047co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController r22, th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, androidx.compose.p003ui.Modifier r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt.m9155D(androidx.compose.foundation.layout.ColumnScope, th.co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController, th.co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: E */
    public static final void m9154E(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-963347863);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963347863, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassIdCardAttorneyPreview (UpPassFormScreen.kt:457)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -2081107049, true, new UpPassFormScreenKt$UpPassIdCardAttorneyPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassIdCardAttorneyPreview$2(i));
        }
    }

    /* renamed from: F */
    public static final void m9153F(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1214822316);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214822316, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassIdCardOwnerPreview (UpPassFormScreen.kt:421)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 145960422, true, new UpPassFormScreenKt$UpPassIdCardOwnerPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassIdCardOwnerPreview$2(i));
        }
    }

    /* renamed from: G */
    public static final void m9152G(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1486652523);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1486652523, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassIdCardPreview (UpPassFormScreen.kt:385)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -2079855719, true, new UpPassFormScreenKt$UpPassIdCardPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassIdCardPreview$2(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void UpPassFormScreen(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType r48, @org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState r49, @org.jetbrains.annotations.Nullable th.p047co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController r50, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r51, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r52, boolean r53, boolean r54, @org.jetbrains.annotations.Nullable th.p047co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r58, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.SharedFlow<? extends th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection> r59, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection, kotlin.Unit> r60, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState, kotlin.Unit> r61, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r62, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r63, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 2943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt.UpPassFormScreen(th.co.dtac.android.dtacone.model.upPass.UpPassFormType, th.co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState, th.co.dtac.android.dtacone.view.compose.upPass.widget.WebViewController, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, th.co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlinx.coroutines.flow.SharedFlow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final void m9151a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-87147275);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87147275, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.AttorneyInfoBar (UpPassFormScreen.kt:318)");
            }
            m9145g(R.string.up_pass_attorney_info, R.drawable.ic_up_pass_ocr_attorney, R.color.darkBlueSeven, R.color.dtacYellow, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$AttorneyInfoBar$1(i));
        }
    }

    /* renamed from: b */
    public static final void m9150b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(2065587104);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2065587104, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.IdCardReaderAttorneyPreview (UpPassFormScreen.kt:474)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 947827918, true, new UpPassFormScreenKt$IdCardReaderAttorneyPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$IdCardReaderAttorneyPreview$2(i));
        }
    }

    /* renamed from: c */
    public static final void m9149c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-761738627);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761738627, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.IdCardReaderOwnerPreview (UpPassFormScreen.kt:438)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 599044111, true, new UpPassFormScreenKt$IdCardReaderOwnerPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$IdCardReaderOwnerPreview$2(i));
        }
    }

    /* renamed from: d */
    public static final void m9148d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1291488418);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1291488418, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.IdCardReaderPreview (UpPassFormScreen.kt:402)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 2019947472, true, new UpPassFormScreenKt$IdCardReaderPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$IdCardReaderPreview$2(i));
        }
    }

    /* renamed from: e */
    public static final void m9147e(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1201426990);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201426990, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.OwnerInfoBar (UpPassFormScreen.kt:343)");
            }
            m9145g(R.string.up_pass_owner_info, R.drawable.ic_up_pass_ocr_owner, R.color.white, R.color.niceBlueFive, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$OwnerInfoBar$1(i));
        }
    }

    /* renamed from: f */
    public static final void m9146f(UpPassFormType upPassFormType, Composer composer, int i) {
        int i2;
        UpPassFormOwnerType ownerType;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(202763620);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(upPassFormType)) {
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
            int i4 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(202763620, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.OwnerTypeBar (UpPassFormScreen.kt:328)");
            }
            if (upPassFormType instanceof UpPassFormType.Ocr) {
                ownerType = ((UpPassFormType.Ocr) upPassFormType).getOwnerType();
            } else if (upPassFormType instanceof UpPassFormType.FaceCompare) {
                ownerType = ((UpPassFormType.FaceCompare) upPassFormType).getOwnerType();
            } else if (upPassFormType instanceof UpPassFormType.FaceCompareLiveness) {
                ownerType = ((UpPassFormType.FaceCompareLiveness) upPassFormType).getOwnerType();
            } else if (upPassFormType instanceof UpPassFormType.OcrFaceCompareLiveness) {
                ownerType = ((UpPassFormType.OcrFaceCompareLiveness) upPassFormType).getOwnerType();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (ownerType != null) {
                i4 = WhenMappings.$EnumSwitchMapping$0[ownerType.ordinal()];
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    startRestartGroup.startReplaceableGroup(94093762);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(94093728);
                    m9151a(startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.startReplaceableGroup(94093673);
                m9147e(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$OwnerTypeBar$1(upPassFormType, i));
        }
    }

    /* renamed from: g */
    public static final void m9145g(int i, int i2, int i3, int i4, Composer composer, int i5) {
        int i6;
        TextStyle m73418copyv2rsoow;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1676289540);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(i2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i6 |= i9;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(i3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i6 |= i8;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(i4)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i6 |= i7;
        }
        int i11 = i6;
        if ((i11 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1676289540, i11, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.OwnerTypeInfoBar (UpPassFormScreen.kt:353)");
            }
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(4));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            Modifier m69714paddingVpY3zN4 = PaddingKt.m69714paddingVpY3zN4(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(48)), ColorResources_androidKt.colorResource(i4, startRestartGroup, (i11 >> 9) & 14), null, 2, null), C3623Dp.m73842constructorimpl(12), C3623Dp.m73842constructorimpl(6));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69714paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = (i11 >> 6) & 14;
            IconKt.m70610Iconww6aTOc(PainterResources_androidKt.painterResource(i2, startRestartGroup, (i11 >> 3) & 14), (String) null, SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(36)), ColorResources_androidKt.colorResource(i3, startRestartGroup, i12), startRestartGroup, 440, 0);
            String stringResource = StringResources_androidKt.stringResource(i, startRestartGroup, i11 & 14);
            m73418copyv2rsoow = r16.m73418copyv2rsoow((r48 & 1) != 0 ? r16.f31200a.m73360getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r16.f31200a.getFontWeight() : FontWeight.Companion.getMedium(), (r48 & 8) != 0 ? r16.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r16.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r16.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r16.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r16.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r16.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r16.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r16.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r16.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r16.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r16.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r16.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r16.f31202c : null, (r48 & 1048576) != 0 ? r16.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r16.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r16.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium().f31201b.getTextMotion() : null);
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g(stringResource, (Modifier) null, ColorResources_androidKt.colorResource(i3, startRestartGroup, i12), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow, composer2, 0, 0, 65530);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$OwnerTypeInfoBar$2(i, i2, i3, i4, i5));
        }
    }

    /* renamed from: h */
    public static final void m9144h(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-930046350);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-930046350, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceCompareAttorneyPreview (UpPassFormScreen.kt:569)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1795239420, true, new UpPassFormScreenKt$UpPassFaceCompareAttorneyPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceCompareAttorneyPreview$2(i));
        }
    }

    /* renamed from: i */
    public static final void m9143i(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(20325077);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(20325077, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceCompareLivenessAttorneyPreview (UpPassFormScreen.kt:588)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1329027993, true, new UpPassFormScreenKt$UpPassFaceCompareLivenessAttorneyPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceCompareLivenessAttorneyPreview$2(i));
        }
    }

    /* renamed from: j */
    public static final void m9142j(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1898993512);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1898993512, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceCompareLivenessOwnerPreview (UpPassFormScreen.kt:550)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 969772822, true, new UpPassFormScreenKt$UpPassFaceCompareLivenessOwnerPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceCompareLivenessOwnerPreview$2(i));
        }
    }

    /* renamed from: k */
    public static final void m9141k(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1871488809);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1871488809, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceCompareLivenessPreview (UpPassFormScreen.kt:512)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1558285417, true, new UpPassFormScreenKt$UpPassFaceCompareLivenessPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceCompareLivenessPreview$2(i));
        }
    }

    /* renamed from: l */
    public static final void m9140l(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1561315563);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1561315563, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceCompareOwnerPreview (UpPassFormScreen.kt:531)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1136561817, true, new UpPassFormScreenKt$UpPassFaceCompareOwnerPreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceCompareOwnerPreview$2(i));
        }
    }

    /* renamed from: m */
    public static final void m9139m(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2034384524);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2034384524, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFaceComparePreview (UpPassFormScreen.kt:493)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableLambdaKt.composableLambda(startRestartGroup, -673601786, true, new UpPassFormScreenKt$UpPassFaceComparePreview$1(UpPassFormState.Initial.INSTANCE)), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new UpPassFormScreenKt$UpPassFaceComparePreview$2(i));
        }
    }

    /* renamed from: n */
    public static final boolean m9138n(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: o */
    public static final boolean m9137o(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: p */
    public static final void m9136p(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: q */
    public static final boolean m9135q(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: r */
    public static final void m9134r(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: s */
    public static final boolean m9133s(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: t */
    public static final void m9132t(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: u */
    public static final CommonErrorResponse m9131u(MutableState mutableState) {
        return (CommonErrorResponse) mutableState.getValue();
    }

    /* renamed from: v */
    public static final void m9130v(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: w */
    public static final void m9129w(MutableState mutableState, CommonErrorResponse commonErrorResponse) {
        mutableState.setValue(commonErrorResponse);
    }

    /* renamed from: x */
    public static final boolean m9128x(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: y */
    public static final boolean m9127y(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: z */
    public static final boolean m9126z(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}