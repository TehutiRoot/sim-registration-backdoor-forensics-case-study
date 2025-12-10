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
    public static final Pattern f57661m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n */
    public static final long[] f57662n = {CoreConstants.MILLIS_IN_ONE_WEEK, 86400000, CoreConstants.MILLIS_IN_ONE_HOUR, 60000, 1000};

    /* renamed from: o */
    public static final Pattern f57663o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    public final String f57664b;

    /* renamed from: c */
    public final Date f57665c;

    /* renamed from: d */
    public final boolean f57666d;

    /* renamed from: e */
    public final Date f57667e;

    /* renamed from: f */
    public final boolean f57668f;

    /* renamed from: g */
    public final String f57669g;

    /* renamed from: h */
    public final String f57670h;

    /* renamed from: i */
    public final String[] f57671i;

    /* renamed from: j */
    public final String f57672j;

    /* renamed from: k */
    public final double f57673k;

    /* renamed from: l */
    public final double f57674l;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        this.f57664b = str;
        try {
            Date m34191d = m34191d(str2);
            this.f57665c = m34191d;
            if (str3 == null) {
                long m34190e = m34190e(str4);
                this.f57667e = m34190e < 0 ? null : new Date(m34191d.getTime() + m34190e);
            } else {
                try {
                    this.f57667e = m34191d(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z = false;
            this.f57666d = str2.length() == 8;
            if (str3 != null && str3.length() == 8) {
                z = true;
            }
            this.f57668f = z;
            this.f57669g = str5;
            this.f57670h = str6;
            this.f57671i = strArr;
            this.f57672j = str7;
            this.f57673k = d;
            this.f57674l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: a */
    public static DateFormat m34194a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: b */
    public static DateFormat m34193b() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    /* renamed from: c */
    public static String m34192c(boolean z, Date date) {
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
    public static Date m34191d(String str) {
        if (f57663o.matcher(str).matches()) {
            if (str.length() == 8) {
                return m34194a().parse(str);
            }
            if (str.length() == 16 && str.charAt(15) == 'Z') {
                Date parse = m34193b().parse(str.substring(0, 15));
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                long time = parse.getTime() + gregorianCalendar.get(15);
                gregorianCalendar.setTime(new Date(time));
                return new Date(time + gregorianCalendar.get(16));
            }
            return m34193b().parse(str);
        }
        throw new ParseException(str, 0);
    }

    /* renamed from: e */
    public static long m34190e(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f57661m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f57662n;
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
        return this.f57671i;
    }

    public String getDescription() {
        return this.f57672j;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f57664b, sb);
        ParsedResult.maybeAppend(m34192c(this.f57666d, this.f57665c), sb);
        ParsedResult.maybeAppend(m34192c(this.f57668f, this.f57667e), sb);
        ParsedResult.maybeAppend(this.f57669g, sb);
        ParsedResult.maybeAppend(this.f57670h, sb);
        ParsedResult.maybeAppend(this.f57671i, sb);
        ParsedResult.maybeAppend(this.f57672j, sb);
        return sb.toString();
    }

    public Date getEnd() {
        return this.f57667e;
    }

    public double getLatitude() {
        return this.f57673k;
    }

    public String getLocation() {
        return this.f57669g;
    }

    public double getLongitude() {
        return this.f57674l;
    }

    public String getOrganizer() {
        return this.f57670h;
    }

    public Date getStart() {
        return this.f57665c;
    }

    public String getSummary() {
        return this.f57664b;
    }

    public boolean isEndAllDay() {
        return this.f57668f;
    }

    public boolean isStartAllDay() {
        return this.f57666d;
    }
}