package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, m28850d2 = {"Landroidx/compose/material3/DatePickerFormatter;", "", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/compose/material3/CalendarMonth;", "month", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Ljava/util/Locale;", "locale", "formatMonthYear$material3_release", "(Landroidx/compose/material3/CalendarMonth;Landroidx/compose/material3/CalendarModel;Ljava/util/Locale;)Ljava/lang/String;", "formatMonthYear", "Landroidx/compose/material3/CalendarDate;", "date", "", "forContentDescription", "formatDate$material3_release", "(Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/CalendarModel;Ljava/util/Locale;Z)Ljava/lang/String;", "formatDate", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getYearSelectionSkeleton$material3_release", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSelectedDateSkeleton$material3_release", OperatorName.CURVE_TO, "getSelectedDateDescriptionSkeleton$material3_release", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DatePickerFormatter {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f25717a;

    /* renamed from: b */
    public final String f25718b;

    /* renamed from: c */
    public final String f25719c;

    public DatePickerFormatter() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ String formatDate$material3_release$default(DatePickerFormatter datePickerFormatter, CalendarDate calendarDate, CalendarModel calendarModel, Locale locale, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return datePickerFormatter.formatDate$material3_release(calendarDate, calendarModel, locale, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DatePickerFormatter)) {
            return false;
        }
        DatePickerFormatter datePickerFormatter = (DatePickerFormatter) obj;
        if (!Intrinsics.areEqual(this.f25717a, datePickerFormatter.f25717a) || !Intrinsics.areEqual(this.f25718b, datePickerFormatter.f25718b) || !Intrinsics.areEqual(this.f25719c, datePickerFormatter.f25719c)) {
            return false;
        }
        return true;
    }

    @Nullable
    public final String formatDate$material3_release(@Nullable CalendarDate calendarDate, @NotNull CalendarModel calendarModel, @NotNull Locale locale, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (calendarDate == null) {
            return null;
        }
        if (z) {
            str = this.f25719c;
        } else {
            str = this.f25718b;
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }

    @Nullable
    public final String formatMonthYear$material3_release(@Nullable CalendarMonth calendarMonth, @NotNull CalendarModel calendarModel, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (calendarMonth == null) {
            return null;
        }
        return calendarModel.formatWithSkeleton(calendarMonth, this.f25717a, locale);
    }

    @NotNull
    public final String getSelectedDateDescriptionSkeleton$material3_release() {
        return this.f25719c;
    }

    @NotNull
    public final String getSelectedDateSkeleton$material3_release() {
        return this.f25718b;
    }

    @NotNull
    public final String getYearSelectionSkeleton$material3_release() {
        return this.f25717a;
    }

    public int hashCode() {
        return (((this.f25717a.hashCode() * 31) + this.f25718b.hashCode()) * 31) + this.f25719c.hashCode();
    }

    public DatePickerFormatter(@NotNull String yearSelectionSkeleton, @NotNull String selectedDateSkeleton, @NotNull String selectedDateDescriptionSkeleton) {
        Intrinsics.checkNotNullParameter(yearSelectionSkeleton, "yearSelectionSkeleton");
        Intrinsics.checkNotNullParameter(selectedDateSkeleton, "selectedDateSkeleton");
        Intrinsics.checkNotNullParameter(selectedDateDescriptionSkeleton, "selectedDateDescriptionSkeleton");
        this.f25717a = yearSelectionSkeleton;
        this.f25718b = selectedDateSkeleton;
        this.f25719c = selectedDateDescriptionSkeleton;
    }

    public /* synthetic */ DatePickerFormatter(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DatePickerDefaults.YearMonthSkeleton : str, (i & 2) != 0 ? DatePickerDefaults.YearAbbrMonthDaySkeleton : str2, (i & 4) != 0 ? DatePickerDefaults.YearMonthWeekdayDaySkeleton : str3);
    }
}
