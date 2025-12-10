package androidx.compose.material3;

import androidx.annotation.RequiresApi;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(26)
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\"\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020(*\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020(*\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R,\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 05048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, m28850d2 = {"Landroidx/compose/material3/CalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/CalendarDate;", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/CalendarMonth;", "date", "(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;", "", "year", "month", "(II)Landroidx/compose/material3/CalendarMonth;", "getDayOfWeek", "(Landroidx/compose/material3/CalendarDate;)I", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "firstDayLocalDate", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/time/LocalDate;)Landroidx/compose/material3/CalendarMonth;", OperatorName.CURVE_TO, "(Landroidx/compose/material3/CalendarMonth;)Ljava/time/LocalDate;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/material3/CalendarDate;)Ljava/time/LocalDate;", "I", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,213:1\n11335#2:214\n11670#2,3:215\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n61#1:214\n61#1:215,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CalendarModelImpl implements CalendarModel {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final ZoneId f25592c;

    /* renamed from: a */
    public final int f25593a;

    /* renamed from: b */
    public final List f25594b;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/material3/CalendarModelImpl$Companion;", "", "()V", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatWithPattern(long j, @NotNull String pattern, @NotNull Locale locale) {
            DateTimeFormatter ofPattern;
            DecimalStyle of;
            DateTimeFormatter withDecimalStyle;
            Instant ofEpochMilli;
            ZonedDateTime atZone;
            LocalDate localDate;
            String format;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            ofPattern = DateTimeFormatter.ofPattern(pattern, locale);
            of = DecimalStyle.of(locale);
            withDecimalStyle = ofPattern.withDecimalStyle(of);
            Intrinsics.checkNotNullExpressionValue(withDecimalStyle, "ofPattern(pattern, local…(DecimalStyle.of(locale))");
            ofEpochMilli = Instant.ofEpochMilli(j);
            atZone = ofEpochMilli.atZone(getUtcTimeZoneId$material3_release());
            localDate = atZone.toLocalDate();
            format = localDate.format(withDecimalStyle);
            Intrinsics.checkNotNullExpressionValue(format, "ofEpochMilli(utcTimeMill…       .format(formatter)");
            return format;
        }

        @NotNull
        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.f25592c;
        }

        public Companion() {
        }
    }

    static {
        ZoneId of;
        of = ZoneId.of("UTC");
        Intrinsics.checkNotNullExpressionValue(of, "of(\"UTC\")");
        f25592c = of;
    }

    public CalendarModelImpl() {
        WeekFields of;
        DayOfWeek firstDayOfWeek;
        int value;
        DayOfWeek[] values;
        TextStyle textStyle;
        String displayName;
        TextStyle textStyle2;
        String displayName2;
        of = WeekFields.of(Locale.getDefault());
        firstDayOfWeek = of.getFirstDayOfWeek();
        value = firstDayOfWeek.getValue();
        this.f25593a = value;
        Locale locale = Locale.getDefault();
        values = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (DayOfWeek dayOfWeek : values) {
            textStyle = TextStyle.FULL;
            displayName = dayOfWeek.getDisplayName(textStyle, locale);
            textStyle2 = TextStyle.NARROW;
            displayName2 = dayOfWeek.getDisplayName(textStyle2, locale);
            arrayList.add(TuplesKt.m28844to(displayName, displayName2));
        }
        this.f25594b = arrayList;
    }

    /* renamed from: a */
    public final CalendarMonth m60690a(LocalDate localDate) {
        DayOfWeek dayOfWeek;
        int value;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        int year;
        int monthValue;
        int lengthOfMonth;
        dayOfWeek = localDate.getDayOfWeek();
        value = dayOfWeek.getValue();
        int firstDayOfWeek = value - getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += 7;
        }
        int i = firstDayOfWeek;
        localTime = LocalTime.MIDNIGHT;
        atTime = localDate.atTime(localTime);
        atZone = atTime.atZone(f25592c);
        epochMilli = atZone.toInstant().toEpochMilli();
        year = localDate.getYear();
        monthValue = localDate.getMonthValue();
        lengthOfMonth = localDate.lengthOfMonth();
        return new CalendarMonth(year, monthValue, lengthOfMonth, i, epochMilli);
    }

    /* renamed from: b */
    public final LocalDate m60689b(CalendarDate calendarDate) {
        LocalDate of;
        of = LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(of, "of(\n            this.yea…this.dayOfMonth\n        )");
        return of;
    }

    /* renamed from: c */
    public final LocalDate m60688c(CalendarMonth calendarMonth) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis());
        atZone = ofEpochMilli.atZone(f25592c);
        localDate = atZone.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(startUtcTim…TimeZoneId).toLocalDate()");
        return localDate;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public String formatWithPattern(long j, @NotNull String pattern, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return Companion.formatWithPattern(j, pattern, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    public /* synthetic */ String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale) {
        return AbstractC16838ug.m1241a(this, calendarDate, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getCanonicalDate(long j) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        LocalDate localDate;
        int year;
        int monthValue;
        int dayOfMonth;
        LocalDateTime atStartOfDay;
        ZoneOffset zoneOffset;
        ofEpochMilli = Instant.ofEpochMilli(j);
        atZone = ofEpochMilli.atZone(f25592c);
        localDate = atZone.toLocalDate();
        year = localDate.getYear();
        monthValue = localDate.getMonthValue();
        dayOfMonth = localDate.getDayOfMonth();
        atStartOfDay = localDate.atStartOfDay();
        zoneOffset = ZoneOffset.UTC;
        return new CalendarDate(year, monthValue, dayOfMonth, atStartOfDay.toEpochSecond(zoneOffset) * 1000);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale) {
        FormatStyle formatStyle;
        Chronology ofLocale;
        String localizedDateTimePattern;
        Intrinsics.checkNotNullParameter(locale, "locale");
        formatStyle = FormatStyle.SHORT;
        ofLocale = Chronology.ofLocale(locale);
        localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, null, ofLocale, locale);
        Intrinsics.checkNotNullExpressionValue(localizedDateTimePattern, "getLocalizedDateTimePatt…= */ locale\n            )");
        return CalendarModelKt.datePatternAsInputFormat(localizedDateTimePattern);
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate date) {
        DayOfWeek dayOfWeek;
        int value;
        Intrinsics.checkNotNullParameter(date, "date");
        dayOfWeek = m60689b(date).getDayOfWeek();
        value = dayOfWeek.getValue();
        return value;
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.f25593a;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long j) {
        Instant ofEpochMilli;
        ZonedDateTime atZone;
        ZonedDateTime withDayOfMonth;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(j);
        atZone = ofEpochMilli.atZone(f25592c);
        withDayOfMonth = atZone.withDayOfMonth(1);
        localDate = withDayOfMonth.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(timeInMilli…           .toLocalDate()");
        return m60690a(localDate);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        LocalDate now;
        int year;
        int monthValue;
        int dayOfMonth;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        now = LocalDate.now();
        year = now.getYear();
        monthValue = now.getMonthValue();
        dayOfMonth = now.getDayOfMonth();
        localTime = LocalTime.MIDNIGHT;
        atTime = now.atTime(localTime);
        atZone = atTime.atZone(f25592c);
        epochMilli = atZone.toInstant().toEpochMilli();
        return new CalendarDate(year, monthValue, dayOfMonth, epochMilli);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public List<Pair<String, String>> getWeekdayNames() {
        return this.f25594b;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth from, int i) {
        LocalDate earlierMonth;
        Intrinsics.checkNotNullParameter(from, "from");
        if (i > 0) {
            earlierMonth = m60688c(from).minusMonths(i);
            Intrinsics.checkNotNullExpressionValue(earlierMonth, "earlierMonth");
            return m60690a(earlierMonth);
        }
        return from;
    }

    @Override // androidx.compose.material3.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String date, @NotNull String pattern) {
        DateTimeFormatter ofPattern;
        LocalDate parse;
        int year;
        Month month;
        int value;
        int dayOfMonth;
        LocalTime localTime;
        LocalDateTime atTime;
        ZonedDateTime atZone;
        long epochMilli;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        ofPattern = DateTimeFormatter.ofPattern(pattern);
        try {
            parse = LocalDate.parse(date, ofPattern);
            year = parse.getYear();
            month = parse.getMonth();
            value = month.getValue();
            dayOfMonth = parse.getDayOfMonth();
            localTime = LocalTime.MIDNIGHT;
            atTime = parse.atTime(localTime);
            atZone = atTime.atZone(f25592c);
            epochMilli = atZone.toInstant().toEpochMilli();
            return new CalendarDate(year, value, dayOfMonth, epochMilli);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth from, int i) {
        LocalDate laterMonth;
        Intrinsics.checkNotNullParameter(from, "from");
        if (i > 0) {
            laterMonth = m60688c(from).plusMonths(i);
            Intrinsics.checkNotNullExpressionValue(laterMonth, "laterMonth");
            return m60690a(laterMonth);
        }
        return from;
    }

    @NotNull
    public String toString() {
        return "CalendarModel";
    }

    @Override // androidx.compose.material3.CalendarModel
    public /* synthetic */ String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return AbstractC16838ug.m1240b(this, calendarMonth, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate date) {
        LocalDate of;
        Intrinsics.checkNotNullParameter(date, "date");
        of = LocalDate.of(date.getYear(), date.getMonth(), 1);
        Intrinsics.checkNotNullExpressionValue(of, "of(date.year, date.month, 1)");
        return m60690a(of);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int i, int i2) {
        LocalDate of;
        of = LocalDate.of(i, i2, 1);
        Intrinsics.checkNotNullExpressionValue(of, "of(year, month, 1)");
        return m60690a(of);
    }
}
