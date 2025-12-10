package androidx.compose.material3;

import androidx.compose.material3.DisplayMode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DateRangePickerKt$SwitchableDateEntryContent$2 extends Lambda implements Function3<DisplayMode, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$SwitchableDateEntryContent$2(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i) {
        super(3);
        this.$state = dateRangePickerState;
        this.$dateFormatter = datePickerFormatter;
        this.$dateValidator = function1;
        this.$colors = datePickerColors;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer, Integer num) {
        m70357invokeQujVXRc(displayMode.m70366unboximpl(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-QujVXRc  reason: not valid java name */
    public final void m70357invokeQujVXRc(int i, @Nullable Composer composer, int i2) {
        int i3;
        int i4;
        if ((i2 & 14) == 0) {
            if (composer.changed(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1354418636, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:458)");
        }
        DisplayMode.Companion companion = DisplayMode.Companion;
        if (DisplayMode.m70363equalsimpl0(i, companion.m70368getPickerjFl4v0())) {
            composer.startReplaceableGroup(-1168754929);
            DateRangePickerKt.m60660a(this.$state.getStateData$material3_release(), this.$dateFormatter, this.$dateValidator, this.$colors, composer, this.$$dirty & 8176);
            composer.endReplaceableGroup();
        } else if (DisplayMode.m70363equalsimpl0(i, companion.m70367getInputjFl4v0())) {
            composer.startReplaceableGroup(-1168754686);
            DateRangeInputKt.DateRangeInputContent(this.$state.getStateData$material3_release(), this.$dateFormatter, this.$dateValidator, composer, this.$$dirty & 1008);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1168754501);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
