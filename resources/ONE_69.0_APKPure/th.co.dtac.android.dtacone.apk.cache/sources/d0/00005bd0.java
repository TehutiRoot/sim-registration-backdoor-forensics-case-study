package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1673:1\n50#2:1674\n49#2:1675\n50#2:1682\n49#2:1683\n36#2:1690\n50#2:1697\n49#2:1698\n50#2:1705\n49#2:1706\n36#2:1713\n1114#3,6:1676\n1114#3,6:1684\n1114#3,6:1691\n1114#3,6:1699\n1114#3,6:1707\n1114#3,6:1714\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n*L\n720#1:1674\n720#1:1675\n732#1:1682\n732#1:1683\n747#1:1690\n753#1:1697\n753#1:1698\n766#1:1705\n766#1:1706\n781#1:1713\n720#1:1676,6\n732#1:1684,6\n747#1:1691,6\n753#1:1699,6\n766#1:1707,6\n781#1:1714,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt$TimeInputImpl$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, int i, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
        super(2);
        this.$hourValue$delegate = mutableState;
        this.$state = timePickerState;
        this.$$dirty = i;
        this.$colors = timePickerColors;
        this.$minuteValue$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        TextFieldValue m60384k;
        float f;
        TextFieldValue m60382m;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306700887, i, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:715)");
        }
        Modifier.Companion companion = Modifier.Companion;
        MutableState<TextFieldValue> mutableState = this.$hourValue$delegate;
        TimePickerState timePickerState = this.$state;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(mutableState) | composer.changed(timePickerState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TimePickerKt$TimeInputImpl$1$1$1$1(timePickerState, mutableState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) rememberedValue);
        m60384k = TimePickerKt.m60384k(this.$hourValue$delegate);
        TimePickerState timePickerState2 = this.$state;
        MutableState<TextFieldValue> mutableState2 = this.$hourValue$delegate;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(timePickerState2) | composer.changed(mutableState2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TimePickerKt$TimeInputImpl$1$1$2$1(timePickerState2, mutableState2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Function1 function1 = rememberedValue2;
        TimePickerState timePickerState3 = this.$state;
        Selection.Companion companion2 = Selection.Companion;
        int m70722getHourJiIwxys = companion2.m70722getHourJiIwxys();
        ImeAction.Companion companion3 = ImeAction.Companion;
        int m73552getNexteUduSuo = companion3.m73552getNexteUduSuo();
        KeyboardType.Companion companion4 = KeyboardType.Companion;
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, companion4.m73598getNumberPjHm6EE(), m73552getNexteUduSuo, 3, null);
        TimePickerState timePickerState4 = this.$state;
        composer.startReplaceableGroup(1157296644);
        boolean changed3 = composer.changed(timePickerState4);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new TimePickerKt$TimeInputImpl$1$1$3$1(timePickerState4);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        KeyboardActions keyboardActions = new KeyboardActions(null, null, rememberedValue3, null, null, null, 59, null);
        TimePickerColors timePickerColors = this.$colors;
        int i2 = this.$$dirty;
        TimePickerKt.m60380o(onKeyEvent, m60384k, function1, timePickerState3, m70722getHourJiIwxys, keyboardOptions, keyboardActions, timePickerColors, composer, ((i2 << 3) & 7168) | 24576 | ((i2 << 18) & 29360128), 0);
        f = TimePickerKt.f26474e;
        TimePickerKt.m60389f(SizeKt.m69750sizeVpY3zN4(companion, f, TimeInputTokens.INSTANCE.m71478getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
        MutableState<TextFieldValue> mutableState3 = this.$minuteValue$delegate;
        TimePickerState timePickerState5 = this.$state;
        composer.startReplaceableGroup(511388516);
        boolean changed4 = composer.changed(mutableState3) | composer.changed(timePickerState5);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new TimePickerKt$TimeInputImpl$1$1$4$1(timePickerState5, mutableState3);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion, (Function1) rememberedValue4);
        m60382m = TimePickerKt.m60382m(this.$minuteValue$delegate);
        TimePickerState timePickerState6 = this.$state;
        MutableState<TextFieldValue> mutableState4 = this.$minuteValue$delegate;
        composer.startReplaceableGroup(511388516);
        boolean changed5 = composer.changed(timePickerState6) | composer.changed(mutableState4);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed5 || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new TimePickerKt$TimeInputImpl$1$1$5$1(timePickerState6, mutableState4);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Function1 function12 = rememberedValue5;
        TimePickerState timePickerState7 = this.$state;
        int m70723getMinuteJiIwxys = companion2.m70723getMinuteJiIwxys();
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion4.m73598getNumberPjHm6EE(), companion3.m73550getDoneeUduSuo(), 3, null);
        TimePickerState timePickerState8 = this.$state;
        composer.startReplaceableGroup(1157296644);
        boolean changed6 = composer.changed(timePickerState8);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed6 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new TimePickerKt$TimeInputImpl$1$1$6$1(timePickerState8);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        KeyboardActions keyboardActions2 = new KeyboardActions(null, null, rememberedValue6, null, null, null, 59, null);
        TimePickerColors timePickerColors2 = this.$colors;
        int i3 = this.$$dirty;
        TimePickerKt.m60380o(onPreviewKeyEvent, m60382m, function12, timePickerState7, m70723getMinuteJiIwxys, keyboardOptions2, keyboardActions2, timePickerColors2, composer, ((i3 << 3) & 7168) | 24576 | ((i3 << 18) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}