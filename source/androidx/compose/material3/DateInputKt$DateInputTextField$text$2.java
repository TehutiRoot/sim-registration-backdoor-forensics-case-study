package androidx.compose.material3;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DateInputKt$DateInputTextField$text$2 extends Lambda implements Function0<MutableState<TextFieldValue>> {
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ CalendarDate $initialDate;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ StateData $stateData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$text$2(StateData stateData, CalendarDate calendarDate, DateInputFormat dateInputFormat, Locale locale) {
        super(0);
        this.$stateData = stateData;
        this.$initialDate = calendarDate;
        this.$dateInputFormat = dateInputFormat;
        this.$locale = locale;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MutableState<TextFieldValue> invoke() {
        MutableState<TextFieldValue> m31891g;
        StateData stateData = this.$stateData;
        CalendarDate calendarDate = this.$initialDate;
        m31891g = AbstractC19508dK1.m31891g(new TextFieldValue((calendarDate == null || (r0 = stateData.getCalendarModel().formatWithPattern(calendarDate.getUtcTimeMillis(), this.$dateInputFormat.getPatternWithoutDelimiters(), this.$locale)) == null) ? "" : "", TextRangeKt.TextRange(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
        return m31891g;
    }
}
