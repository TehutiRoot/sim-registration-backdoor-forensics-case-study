package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout.smartCard.IdCardReaderSwitchBarKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u001a\u008f\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0087\u0001\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u000f\u0010\u001a\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, m29142d2 = {"", "isCardReaderConnected", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/IdCardReaderState;", "uiState", "Lkotlin/Function0;", "", Constant.ServiceAPIName.onStart, "onStop", "Lkotlinx/coroutines/flow/SharedFlow;", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "onSuccessReadFinish", "Lkotlin/Function1;", "", "onIdTypeChanged", "onSaveIdCard", "gotoTolPackage", "gotoTakeMorePhoto", "IdCardReaderScreen", "(ZLth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/IdCardReaderState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "cardReaderState", "SmartCardReaderInfo", "(Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/IdCardReaderState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "d", "(Landroidx/compose/runtime/Composer;I)V", OperatorName.CURVE_TO, "e", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdCardReaderScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdCardReaderScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputIdCard/IdCardReaderScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,245:1\n72#2,6:246\n78#2:280\n82#2:285\n72#2,6:329\n78#2:363\n82#2:369\n78#3,11:252\n91#3:284\n78#3,11:300\n78#3,11:335\n91#3:368\n91#3:404\n456#4,8:263\n464#4,3:277\n467#4,3:281\n50#4:287\n49#4:288\n456#4,8:311\n464#4,3:325\n456#4,8:346\n464#4,3:360\n467#4,3:365\n25#4:370\n50#4:377\n49#4:378\n25#4:385\n50#4:392\n49#4:393\n467#4,3:401\n4144#5,6:271\n4144#5,6:319\n4144#5,6:354\n76#6:286\n76#6:400\n1097#7,6:289\n1097#7,6:371\n1097#7,6:379\n1097#7,6:386\n1097#7,6:394\n67#8,5:295\n72#8:328\n76#8:405\n154#9:364\n81#10:406\n107#10,2:407\n81#10:409\n107#10,2:410\n*S KotlinDebug\n*F\n+ 1 IdCardReaderScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputIdCard/IdCardReaderScreenKt\n*L\n66#1:246,6\n66#1:280\n66#1:285\n109#1:329,6\n109#1:363\n109#1:369\n66#1:252,11\n66#1:284\n105#1:300,11\n109#1:335,11\n109#1:368\n105#1:404\n66#1:263,8\n66#1:277,3\n66#1:281,3\n98#1:287\n98#1:288\n105#1:311,8\n105#1:325,3\n109#1:346,8\n109#1:360,3\n109#1:365,3\n158#1:370\n162#1:377\n162#1:378\n170#1:385\n174#1:392\n174#1:393\n105#1:401,3\n66#1:271,6\n105#1:319,6\n109#1:354,6\n85#1:286\n180#1:400\n98#1:289,6\n158#1:371,6\n162#1:379,6\n170#1:386,6\n174#1:394,6\n105#1:295,5\n105#1:328\n105#1:405\n119#1:364\n158#1:406\n158#1:407,2\n170#1:409\n170#1:410,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderScreenKt */
/* loaded from: classes10.dex */
public final class IdCardReaderScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void IdCardReaderScreen(boolean z, @NotNull IdCardReaderState uiState, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onStop, @NotNull SharedFlow<? extends IdCardInformationCollection> onSuccessReadFinish, @NotNull Function1<? super String, Unit> onIdTypeChanged, @NotNull Function1<? super IdCardInformationCollection, Unit> onSaveIdCard, @NotNull Function0<Unit> gotoTolPackage, @NotNull Function0<Unit> gotoTakeMorePhoto, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Intrinsics.checkNotNullParameter(onSuccessReadFinish, "onSuccessReadFinish");
        Intrinsics.checkNotNullParameter(onIdTypeChanged, "onIdTypeChanged");
        Intrinsics.checkNotNullParameter(onSaveIdCard, "onSaveIdCard");
        Intrinsics.checkNotNullParameter(gotoTolPackage, "gotoTolPackage");
        Intrinsics.checkNotNullParameter(gotoTakeMorePhoto, "gotoTakeMorePhoto");
        Composer startRestartGroup = composer.startRestartGroup(-938604325);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-938604325, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderScreen (IdCardReaderScreen.kt:54)");
        }
        Modifier m69505backgroundbw27NRU$default = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m71956getWhite0d7_KjU(), null, 2, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default);
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
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        IdCardReaderSwitchBarKt.IdCardReaderSwitchBar(z, IdCardReaderScreenKt$IdCardReaderScreen$1$1.INSTANCE, startRestartGroup, (i & 14) | 48);
        int i2 = i >> 3;
        SmartCardReaderInfo(uiState, onStart, onStop, onSuccessReadFinish, onIdTypeChanged, onSaveIdCard, gotoTolPackage, gotoTakeMorePhoto, startRestartGroup, (i2 & 14) | 4096 | (i2 & 112) | (i2 & 896) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderScreen$2(z, uiState, onStart, onStop, onSuccessReadFinish, onIdTypeChanged, onSaveIdCard, gotoTolPackage, gotoTakeMorePhoto, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.SnapshotMutationPolicy, kotlin.coroutines.Continuation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v40 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SmartCardReaderInfo(@org.jetbrains.annotations.NotNull th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState r59, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r60, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r61, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow<? extends th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection> r62, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r63, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection, kotlin.Unit> r64, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r65, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r66, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderScreenKt.SmartCardReaderInfo(th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlinx.coroutines.flow.SharedFlow, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: a */
    public static final void m9544a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2012001247);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2012001247, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderErrorResScreenPreview (IdCardReaderScreen.kt:238)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$IdCardReaderScreenKt.INSTANCE.m75201getLambda5$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderErrorResScreenPreview$1(i));
        }
    }

    /* renamed from: b */
    public static final void m9543b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(2137080761);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137080761, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderErrorScreenPreview (IdCardReaderScreen.kt:229)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$IdCardReaderScreenKt.INSTANCE.m75200getLambda4$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderErrorScreenPreview$1(i));
        }
    }

    /* renamed from: c */
    public static final void m9542c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-960759315);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-960759315, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderLoadingScreenPreview (IdCardReaderScreen.kt:211)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$IdCardReaderScreenKt.INSTANCE.m75198getLambda2$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderLoadingScreenPreview$1(i));
        }
    }

    /* renamed from: d */
    public static final void m9541d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1925561719);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1925561719, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderScreenPreview (IdCardReaderScreen.kt:202)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$IdCardReaderScreenKt.INSTANCE.m75197getLambda1$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderScreenPreview$1(i));
        }
    }

    /* renamed from: e */
    public static final void m9540e(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1021749580);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1021749580, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.IdCardReaderSuccessScreenPreview (IdCardReaderScreen.kt:220)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$IdCardReaderScreenKt.INSTANCE.m75199getLambda3$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new IdCardReaderScreenKt$IdCardReaderSuccessScreenPreview$1(i));
        }
    }

    /* renamed from: f */
    public static final boolean m9539f(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: g */
    public static final void m9538g(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: h */
    public static final boolean m9537h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: i */
    public static final void m9536i(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}