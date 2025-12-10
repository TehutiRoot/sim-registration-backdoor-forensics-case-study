package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$Month$rangeSelectionInfo$1$1 extends Lambda implements Function0<SelectedRangeInfo> {
    final /* synthetic */ CalendarMonth $month;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$rangeSelectionInfo$1$1(boolean z, CalendarMonth calendarMonth, StateData stateData) {
        super(0);
        this.$rangeSelectionEnabled = z;
        this.$month = calendarMonth;
        this.$stateData = stateData;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final SelectedRangeInfo invoke() {
        if (this.$rangeSelectionEnabled) {
            return SelectedRangeInfo.Companion.calculateRangeInfo(this.$month, this.$stateData.getSelectedStartDate().getValue(), this.$stateData.getSelectedEndDate().getValue());
        }
        return null;
    }
}
