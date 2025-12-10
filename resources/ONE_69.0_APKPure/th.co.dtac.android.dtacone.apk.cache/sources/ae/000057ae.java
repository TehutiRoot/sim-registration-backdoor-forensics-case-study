package androidx.compose.material3;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001a¨\u0006."}, m29142d2 = {"Landroidx/compose/material3/CalendarDate;", "", "", "year", "month", "dayOfMonth", "", "utcTimeMillis", "<init>", "(IIIJ)V", "other", "compareTo", "(Landroidx/compose/material3/CalendarDate;)I", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "Ljava/util/Locale;", "locale", "format", "(Landroidx/compose/material3/CalendarModel;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "()J", "copy", "(IIIJ)Landroidx/compose/material3/CalendarDate;", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getYear", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMonth", OperatorName.CURVE_TO, "getDayOfMonth", "d", OperatorName.SET_LINE_CAPSTYLE, "getUtcTimeMillis", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CalendarDate implements Comparable<CalendarDate> {

    /* renamed from: a */
    public final int f25676a;

    /* renamed from: b */
    public final int f25677b;

    /* renamed from: c */
    public final int f25678c;

    /* renamed from: d */
    public final long f25679d;

    public CalendarDate(int i, int i2, int i3, long j) {
        this.f25676a = i;
        this.f25677b = i2;
        this.f25678c = i3;
        this.f25679d = j;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = calendarDate.f25676a;
        }
        if ((i4 & 2) != 0) {
            i2 = calendarDate.f25677b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = calendarDate.f25678c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = calendarDate.f25679d;
        }
        return calendarDate.copy(i, i5, i6, j);
    }

    public static /* synthetic */ String format$default(CalendarDate calendarDate, CalendarModel calendarModel, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarDate.format(calendarModel, str, locale);
    }

    public final int component1() {
        return this.f25676a;
    }

    public final int component2() {
        return this.f25677b;
    }

    public final int component3() {
        return this.f25678c;
    }

    public final long component4() {
        return this.f25679d;
    }

    @NotNull
    public final CalendarDate copy(int i, int i2, int i3, long j) {
        return new CalendarDate(i, i2, i3, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarDate) {
            CalendarDate calendarDate = (CalendarDate) obj;
            return this.f25676a == calendarDate.f25676a && this.f25677b == calendarDate.f25677b && this.f25678c == calendarDate.f25678c && this.f25679d == calendarDate.f25679d;
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

    public final int getDayOfMonth() {
        return this.f25678c;
    }

    public final int getMonth() {
        return this.f25677b;
    }

    public final long getUtcTimeMillis() {
        return this.f25679d;
    }

    public final int getYear() {
        return this.f25676a;
    }

    public int hashCode() {
        return (((((this.f25676a * 31) + this.f25677b) * 31) + this.f25678c) * 31) + AbstractC17631Fh1.m68395a(this.f25679d);
    }

    @NotNull
    public String toString() {
        return "CalendarDate(year=" + this.f25676a + ", month=" + this.f25677b + ", dayOfMonth=" + this.f25678c + ", utcTimeMillis=" + this.f25679d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull CalendarDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f25679d, other.f25679d);
    }
}