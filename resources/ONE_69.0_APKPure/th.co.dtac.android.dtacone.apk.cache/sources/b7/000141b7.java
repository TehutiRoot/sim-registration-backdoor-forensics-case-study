package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m29142d2 = {"ProcessErrorSharedFlow", "", "onProcessError", "Lkotlinx/coroutines/flow/SharedFlow;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", "(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nProcessErrorSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessErrorSharedFlow.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/ProcessErrorSharedFlowKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n25#2:41\n25#2:48\n36#2:56\n1097#3,6:42\n1097#3,6:49\n1097#3,6:57\n76#4:55\n81#5:63\n107#5,2:64\n81#5:66\n107#5,2:67\n*S KotlinDebug\n*F\n+ 1 ProcessErrorSharedFlow.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/ProcessErrorSharedFlowKt\n*L\n19#1:41\n20#1:48\n37#1:56\n19#1:42,6\n20#1:49,6\n37#1:57,6\n21#1:55\n19#1:63\n19#1:64,2\n20#1:66\n20#1:67,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt */
/* loaded from: classes10.dex */
public final class ProcessErrorSharedFlowKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ProcessErrorSharedFlow(@NotNull SharedFlow<CommonErrorResponse> onProcessError, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(onProcessError, "onProcessError");
        Composer startRestartGroup = composer.startRestartGroup(-826661065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-826661065, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlow (ProcessErrorSharedFlow.kt:17)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(new CommonErrorResponse(null, null, null, null, null, null, null, null, 255, null), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$1(((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), onProcessError, mutableState, mutableState2, null), startRestartGroup, 70);
        if (m9591c(mutableState2)) {
            String desc = m9593a(mutableState).getDesc();
            String userId = m9593a(mutableState).getUserId();
            String code = m9593a(mutableState).getCode();
            String responseDateTime = m9593a(mutableState).getResponseDateTime();
            String systemMessage = m9593a(mutableState).getSystemMessage();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(mutableState2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$2$1(mutableState2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            OneDialogKt.OneDialogError(desc, userId, code, systemMessage, (Function0) rememberedValue3, responseDateTime, startRestartGroup, 0, 0);
        } else {
            composer2 = startRestartGroup;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$3(onProcessError, i));
        }
    }

    /* renamed from: a */
    public static final CommonErrorResponse m9593a(MutableState mutableState) {
        return (CommonErrorResponse) mutableState.getValue();
    }

    /* renamed from: b */
    public static final void m9592b(MutableState mutableState, CommonErrorResponse commonErrorResponse) {
        mutableState.setValue(commonErrorResponse);
    }

    /* renamed from: c */
    public static final boolean m9591c(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: d */
    public static final void m9590d(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}