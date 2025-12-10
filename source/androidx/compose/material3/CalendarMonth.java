package androidx.compose.material3;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u00105\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u001d¨\u00066"}, m28850d2 = {"Landroidx/compose/material3/CalendarMonth;", "", "", "year", "month", "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "", "startUtcTimeMillis", "<init>", "(IIIIJ)V", "Lkotlin/ranges/IntRange;", "years", "indexIn", "(Lkotlin/ranges/IntRange;)I", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "Ljava/util/Locale;", "locale", "format", "(Landroidx/compose/material3/CalendarModel;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "component5", "()J", "copy", "(IIIIJ)Landroidx/compose/material3/CalendarMonth;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getYear", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMonth", OperatorName.CURVE_TO, "getNumberOfDays", "d", "getDaysFromStartOfWeekToFirstOfMonth", "e", OperatorName.SET_LINE_CAPSTYLE, "getStartUtcTimeMillis", OperatorName.FILL_NON_ZERO, "getEndUtcTimeMillis", "endUtcTimeMillis", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CalendarMonth {

    /* renamed from: a */
    public final int f25595a;

    /* renamed from: b */
    public final int f25596b;

    /* renamed from: c */
    public final int f25597c;

    /* renamed from: d */
    public final int f25598d;

    /* renamed from: e */
    public final long f25599e;

    /* renamed from: f */
    public final long f25600f;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.f25595a = i;
        this.f25596b = i2;
        this.f25597c = i3;
        this.f25598d = i4;
        this.f25599e = j;
        this.f25600f = (j + (i3 * 86400000)) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i, int i2, int i3, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = calendarMonth.f25595a;
        }
        if ((i5 & 2) != 0) {
            i2 = calendarMonth.f25596b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = calendarMonth.f25597c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = calendarMonth.f25598d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            j = calendarMonth.f25599e;
        }
        return calendarMonth.copy(i, i6, i7, i8, j);
    }

    public static /* synthetic */ String format$default(CalendarMonth calendarMonth, CalendarModel calendarModel, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarMonth.format(calendarModel, str, locale);
    }

    public final int component1() {
        return this.f25595a;
    }

    public final int component2() {
        return this.f25596b;
    }

    public final int component3() {
        return this.f25597c;
    }

    public final int component4() {
        return this.f25598d;
    }

    public final long component5() {
        return this.f25599e;
    }

    @NotNull
    public final CalendarMonth copy(int i, int i2, int i3, int i4, long j) {
        return new CalendarMonth(i, i2, i3, i4, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarMonth) {
            CalendarMonth calendarMonth = (CalendarMonth) obj;
            return this.f25595a == calendarMonth.f25595a && this.f25596b == calendarMonth.f25596b && this.f25597c == calendarMonth.f25597c && this.f25598d == calendarMonth.f25598d && this.f25599e == calendarMonth.f25599e;
        }
        return false;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return calendarModel.formatWithSkeleton(this, skeleton, locale);
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.f25598d;
    }

    public final long getEndUtcTimeMillis() {
        return this.f25600f;
    }

    public final int getMonth() {
        return this.f25596b;
    }

    public final int getNumberOfDays() {
        return this.f25597c;
    }

    public final long getStartUtcTimeMillis() {
        return this.f25599e;
    }

    public final int getYear() {
        return this.f25595a;
    }

    public int hashCode() {
        return (((((((this.f25595a * 31) + this.f25596b) * 31) + this.f25597c) * 31) + this.f25598d) * 31) + AbstractC17792Ig1.m67882a(this.f25599e);
    }

    public final int indexIn(@NotNull IntRange years) {
        Intrinsics.checkNotNullParameter(years, "years");
        return (((this.f25595a - years.getFirst()) * 12) + this.f25596b) - 1;
    }

    @NotNull
    public String toString() {
        return "CalendarMonth(year=" + this.f25595a + ", month=" + this.f25596b + ", numberOfDays=" + this.f25597c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f25598d + ", startUtcTimeMillis=" + this.f25599e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
