package com.google.zxing.client.result;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class CalendarParsedResult extends ParsedResult {

    /* renamed from: m */
    public static final Pattern f57649m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n */
    public static final long[] f57650n = {CoreConstants.MILLIS_IN_ONE_WEEK, 86400000, CoreConstants.MILLIS_IN_ONE_HOUR, 60000, 1000};

    /* renamed from: o */
    public static final Pattern f57651o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    public final String f57652b;

    /* renamed from: c */
    public final Date f57653c;

    /* renamed from: d */
    public final boolean f57654d;

    /* renamed from: e */
    public final Date f57655e;

    /* renamed from: f */
    public final boolean f57656f;

    /* renamed from: g */
    public final String f57657g;

    /* renamed from: h */
    public final String f57658h;

    /* renamed from: i */
    public final String[] f57659i;

    /* renamed from: j */
    public final String f57660j;

    /* renamed from: k */
    public final double f57661k;

    /* renamed from: l */
    public final double f57662l;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        this.f57652b = str;
        try {
            Date m34199d = m34199d(str2);
            this.f57653c = m34199d;
            if (str3 == null) {
                long m34198e = m34198e(str4);
                this.f57655e = m34198e < 0 ? null : new Date(m34199d.getTime() + m34198e);
            } else {
                try {
                    this.f57655e = m34199d(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z = false;
            this.f57654d = str2.length() == 8;
            if (str3 != null && str3.length() == 8) {
                z = true;
            }
            this.f57656f = z;
            this.f57657g = str5;
            this.f57658h = str6;
            this.f57659i = strArr;
            this.f57660j = str7;
            this.f57661k = d;
            this.f57662l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: a */
    public static DateFormat m34202a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: b */
    public static DateFormat m34201b() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    /* renamed from: c */
    public static String m34200c(boolean z, Date date) {
        DateFormat dateTimeInstance;
        if (date == null) {
            return null;
        }
        if (z) {
            dateTimeInstance = DateFormat.getDateInstance(2);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateTimeInstance.format(date);
    }

    /* renamed from: d */
    public static Date m34199d(String str) {
        if (f57651o.matcher(str).matches()) {
            if (str.length() == 8) {
                return m34202a().parse(str);
            }
            if (str.length() == 16 && str.charAt(15) == 'Z') {
                Date parse = m34201b().parse(str.substring(0, 15));
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                long time = parse.getTime() + gregorianCalendar.get(15);
                gregorianCalendar.setTime(new Date(time));
                return new Date(time + gregorianCalendar.get(16));
            }
            return m34201b().parse(str);
        }
        throw new ParseException(str, 0);
    }

    /* renamed from: e */
    public static long m34198e(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f57649m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f57650n;
            if (i < jArr.length) {
                int i2 = i + 1;
                String group = matcher.group(i2);
                if (group != null) {
                    j += jArr[i] * Integer.parseInt(group);
                }
                i = i2;
            } else {
                return j;
            }
        }
    }

    public String[] getAttendees() {
        return this.f57659i;
    }

    public String getDescription() {
        return this.f57660j;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57652b, sb);
        ParsedResult.maybeAppend(m34200c(this.f57654d, this.f57653c), sb);
        ParsedResult.maybeAppend(m34200c(this.f57656f, this.f57655e), sb);
        ParsedResult.maybeAppend(this.f57657g, sb);
        ParsedResult.maybeAppend(this.f57658h, sb);
        ParsedResult.maybeAppend(this.f57659i, sb);
        ParsedResult.maybeAppend(this.f57660j, sb);
        return sb.toString();
    }

    public Date getEnd() {
        return this.f57655e;
    }

    public double getLatitude() {
        return this.f57661k;
    }

    public String getLocation() {
        return this.f57657g;
    }

    public double getLongitude() {
        return this.f57662l;
    }

    public String getOrganizer() {
        return this.f57658h;
    }

    public Date getStart() {
        return this.f57653c;
    }

    public String getSummary() {
        return this.f57652b;
    }

    public boolean isEndAllDay() {
        return this.f57656f;
    }

    public boolean isStartAllDay() {
        return this.f57654d;
    }
}
