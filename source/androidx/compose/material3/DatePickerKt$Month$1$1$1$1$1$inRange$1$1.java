package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DatePickerKt$Month$1$1$1$1$1$inRange$1$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ long $dateInMillis;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ StateData $stateData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1$1$1$1$1$inRange$1$1(StateData stateData, boolean z, long j) {
        super(0);
        this.$stateData = stateData;
        this.$rangeSelectionEnabled = z;
        this.$dateInMillis = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        boolean z;
        StateData stateData = this.$stateData;
        boolean z2 = this.$rangeSelectionEnabled;
        long j = this.$dateInMillis;
        if (z2) {
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            if (j >= (value != null ? value.getUtcTimeMillis() : Long.MAX_VALUE)) {
                CalendarDate value2 = stateData.getSelectedEndDate().getValue();
                if (j <= (value2 != null ? value2.getUtcTimeMillis() : Long.MIN_VALUE)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
