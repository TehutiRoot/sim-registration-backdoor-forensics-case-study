package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1673:1\n74#2,7:1674\n81#2:1707\n85#2:1712\n75#3:1681\n76#3,11:1683\n89#3:1711\n76#4:1682\n460#5,13:1694\n473#5,3:1708\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n847#1:1674,7\n847#1:1707\n847#1:1712\n847#1:1681\n847#1:1683,11\n847#1:1711\n847#1:1682\n847#1:1694,13\n847#1:1708,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt$ClockDisplayNumbers$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockDisplayNumbers$1(TimePickerState timePickerState, TimePickerColors timePickerColors, int i) {
        super(2);
        this.$state = timePickerState;
        this.$colors = timePickerColors;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        float f;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-477913269, i, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:845)");
        }
        TimePickerState timePickerState = this.$state;
        TimePickerColors timePickerColors = this.$colors;
        int i2 = this.$$dirty;
        composer.startReplaceableGroup(693286680);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, density, companion2.getSetDensity());
        Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
        Modifier m69750sizeVpY3zN4 = SizeKt.m69750sizeVpY3zN4(companion, timePickerTokens.m71496getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m71495getTimeSelectorContainerHeightD9Ej5fM());
        int hourForDisplay$material3_release = timePickerState.getHourForDisplay$material3_release();
        Selection.Companion companion3 = Selection.Companion;
        int i3 = ((i2 << 9) & 57344) | ((i2 << 6) & 896) | 3078;
        TimePickerKt.m60378q(m69750sizeVpY3zN4, hourForDisplay$material3_release, timePickerState, companion3.m70722getHourJiIwxys(), timePickerColors, composer, i3);
        f = TimePickerKt.f26474e;
        TimePickerKt.m60389f(SizeKt.m69750sizeVpY3zN4(companion, f, timePickerTokens.m71492getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer, 6);
        TimePickerKt.m60378q(SizeKt.m69750sizeVpY3zN4(companion, timePickerTokens.m71496getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m71495getTimeSelectorContainerHeightD9Ej5fM()), timePickerState.getMinute(), timePickerState, companion3.m70723getMinuteJiIwxys(), timePickerColors, composer, i3);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}