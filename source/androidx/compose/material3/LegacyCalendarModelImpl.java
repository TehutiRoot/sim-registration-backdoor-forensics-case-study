package androidx.compose.material3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\"\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020+*\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u00020+*\u00020\u000b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b6\u00107R,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m28850d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/CalendarDate;", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/CalendarMonth;", "date", "(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;", "", "year", "month", "(II)Landroidx/compose/material3/CalendarMonth;", "getDayOfWeek", "(Landroidx/compose/material3/CalendarDate;)I", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;", "toString", "()Ljava/lang/String;", "day", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "Ljava/util/Calendar;", "firstDayCalendar", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/Calendar;)Landroidx/compose/material3/CalendarMonth;", "d", "(Landroidx/compose/material3/CalendarMonth;)Ljava/util/Calendar;", "Ljava/util/TimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, OperatorName.CURVE_TO, "(Landroidx/compose/material3/CalendarDate;Ljava/util/TimeZone;)Ljava/util/Calendar;", "I", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1864#2,3:222\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n*L\n57#1:222,3\n*E\n"})
/* loaded from: classes2.dex */
public final class LegacyCalendarModelImpl implements CalendarModel {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final TimeZone f25839c;

    /* renamed from: a */
    public final int f25840a = m60634a(Calendar.getInstance().getFirstDayOfWeek());

    /* renamed from: b */
    public final List f25841b;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl$Companion;", "", "()V", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatWithPattern(long j, @NotNull String pattern, @NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
            simpleDateFormat.setTimeZone(getUtcTimeZone$material3_release());
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(j);
            String format = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.timeInMillis)");
            return format;
        }

        @NotNull
        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.f25839c;
        }

        public Companion() {
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f25839c = timeZone;
    }

    public LegacyCalendarModelImpl() {
        List createListBuilder = AbstractC10108ds.createListBuilder();
        String[] weekdays = new DateFormatSymbols(Locale.getDefault()).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(Locale.getDefault()).getShortWeekdays();
        Intrinsics.checkNotNullExpressionValue(weekdays, "weekdays");
        int i = 0;
        for (Object obj : ArraysKt___ArraysKt.drop(weekdays, 2)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            createListBuilder.add(new Pair((String) obj, shortWeekdays[i + 2]));
            i = i2;
        }
        createListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.f25841b = AbstractC10108ds.build(createListBuilder);
    }

    /* renamed from: a */
    public final int m60634a(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    /* renamed from: b */
    public final CalendarMonth m60633b(Calendar calendar) {
        int m60634a = m60634a(calendar.get(7)) - getFirstDayOfWeek();
        if (m60634a < 0) {
            m60634a += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), m60634a, calendar.getTimeInMillis());
    }

    /* renamed from: c */
    public final Calendar m60632c(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    /* renamed from: d */
    public final Calendar m60631d(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(f25839c);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
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
        Calendar calendar = Calendar.getInstance(f25839c);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "DateFormat.getDateInstan…leDateFormat).toPattern()");
        return CalendarModelKt.datePatternAsInputFormat(pattern);
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return m60634a(m60632c(date, timeZone).get(7));
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.f25840a;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long j) {
        Calendar firstDayCalendar = Calendar.getInstance(f25839c);
        firstDayCalendar.setTimeInMillis(j);
        firstDayCalendar.set(5, 1);
        firstDayCalendar.set(11, 0);
        firstDayCalendar.set(12, 0);
        firstDayCalendar.set(13, 0);
        firstDayCalendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(firstDayCalendar, "firstDayCalendar");
        return m60633b(firstDayCalendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public List<Pair<String, String>> getWeekdayNames() {
        return this.f25841b;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth from, int i) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (i <= 0) {
            return from;
        }
        Calendar m60631d = m60631d(from);
        m60631d.add(2, -i);
        return m60633b(m60631d);
    }

    @Override // androidx.compose.material3.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        TimeZone timeZone = f25839c;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(date);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(parse);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth from, int i) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (i <= 0) {
            return from;
        }
        Calendar m60631d = m60631d(from);
        m60631d.add(2, i);
        return m60633b(m60631d);
    }

    @NotNull
    public String toString() {
        return "LegacyCalendarModel";
    }

    @Override // androidx.compose.material3.CalendarModel
    public /* synthetic */ String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return AbstractC16838ug.m1240b(this, calendarMonth, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return getMonth(date.getYear(), date.getMonth());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int i, int i2) {
        Calendar firstDayCalendar = Calendar.getInstance(f25839c);
        firstDayCalendar.clear();
        firstDayCalendar.set(1, i);
        firstDayCalendar.set(2, i2 - 1);
        firstDayCalendar.set(5, 1);
        Intrinsics.checkNotNullExpressionValue(firstDayCalendar, "firstDayCalendar");
        return m60633b(firstDayCalendar);
    }
}
