package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Landroidx/compose/runtime/State;", "", "touchExplorationState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "", "handleEvent", "Lkotlin/Function0;", "onDispose", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,107:1\n76#2:108\n76#2:123\n25#3:109\n25#3:116\n25#3:124\n1114#4,6:110\n1114#4,6:117\n1114#4,6:125\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n*L\n42#1:108\n49#1:123\n43#1:109\n47#1:116\n60#1:124\n43#1:110,6\n47#1:117,6\n60#1:125,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TouchExplorationStateProvider_androidKt {
    /* renamed from: a */
    public static final void m60405a(Lifecycle lifecycle, Function1 function1, Function0 function0, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1703772404);
        if ((i2 & 1) != 0) {
            function1 = TouchExplorationStateProvider_androidKt$ObserveState$1.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i2 & 2) != 0) {
            function0 = TouchExplorationStateProvider_androidKt$ObserveState$2.INSTANCE;
        }
        Function0 function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703772404, i, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:63)");
        }
        EffectsKt.DisposableEffect(lifecycle, new TouchExplorationStateProvider_androidKt$ObserveState$3(lifecycle, function12, function02), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TouchExplorationStateProvider_androidKt$ObserveState$4(lifecycle, function12, function02, i, i2));
        }
    }

    @Composable
    @NotNull
    public static final State<Boolean> touchExplorationState(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-906157724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-906157724, i, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:40)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object systemService = context.getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            rememberedValue = (AccessibilityManager) systemService;
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AccessibilityManager accessibilityManager = (AccessibilityManager) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0 = (accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0) rememberedValue2;
        m60405a(((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), new TouchExplorationStateProvider_androidKt$touchExplorationState$1(accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0, accessibilityManager), new TouchExplorationStateProvider_androidKt$touchExplorationState$2(accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0, accessibilityManager), composer, 8, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new C3427x188f61bc(accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State<Boolean> state = (State) rememberedValue3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }
}
