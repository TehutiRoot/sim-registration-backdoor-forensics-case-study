package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DateRangePickerKt$DateRangePicker$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ DateRangePickerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$DateRangePicker$4(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, int i) {
        super(2);
        this.$state = dateRangePickerState;
        this.$dateFormatter = datePickerFormatter;
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
        PaddingValues paddingValues;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-204181785, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
        }
        DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
        DateRangePickerState dateRangePickerState = this.$state;
        DatePickerFormatter datePickerFormatter = this.$dateFormatter;
        Modifier.Companion companion = Modifier.Companion;
        paddingValues = DateRangePickerKt.f25734c;
        Modifier padding = PaddingKt.padding(companion, paddingValues);
        int i2 = this.$$dirty;
        dateRangePickerDefaults.DateRangePickerHeadline(dateRangePickerState, datePickerFormatter, padding, composer, (i2 & 14) | 3456 | ((i2 >> 3) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
