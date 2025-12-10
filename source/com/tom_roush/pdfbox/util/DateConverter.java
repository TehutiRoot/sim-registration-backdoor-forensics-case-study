package com.tom_roush.pdfbox.util;

import androidx.core.p005os.EnvironmentCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSString;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;
import org.joda.time.DateTimeConstants;

/* loaded from: classes5.dex */
public final class DateConverter {

    /* renamed from: a */
    public static final String[] f60851a = {"EEEE, dd MMM yy hh:mm:ss a", "EEEE, MMM dd, yy hh:mm:ss a", "EEEE, MMM dd, yy 'at' hh:mma", "EEEE, MMM dd, yy", "EEEE MMM dd, yy HH:mm:ss", "EEEE MMM dd HH:mm:ss z yy", "EEEE MMM dd HH:mm:ss yy"};

    /* renamed from: b */
    public static final String[] f60852b = {"dd MMM yy HH:mm:ss", "dd MMM yy HH:mm", "yyyy MMM d", "yyyymmddhh:mm:ss", "H:m M/d/yy", "M/d/yy HH:mm:ss", "M/d/yy HH:mm", "M/d/yy"};

    /* renamed from: a */
    public static void m32096a(GregorianCalendar gregorianCalendar, TimeZone timeZone) {
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.add(12, -((gregorianCalendar.get(15) + gregorianCalendar.get(16)) / 60000));
    }

    /* renamed from: b */
    public static String m32095b(long j, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Z");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(m32088i(j), EnvironmentCompat.MEDIA_UNKNOWN));
        String format = simpleDateFormat.format(new Date());
        return format.substring(0, 3) + str + format.substring(3);
    }

    /* renamed from: c */
    public static GregorianCalendar m32094c() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Locale.ENGLISH);
        gregorianCalendar.setTimeZone(new SimpleTimeZone(0, "UTC"));
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar;
    }

    /* renamed from: d */
    public static GregorianCalendar m32093d(String str, ParsePosition parsePosition) {
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        int m32089h = m32089h(str, parsePosition2, 4, 0);
        if (parsePosition2.getIndex() != parsePosition.getIndex() + 4) {
            return null;
        }
        m32087j(str, parsePosition2, "/- ");
        int m32089h2 = m32089h(str, parsePosition2, 2, 1) - 1;
        m32087j(str, parsePosition2, "/- ");
        int m32089h3 = m32089h(str, parsePosition2, 2, 1);
        m32087j(str, parsePosition2, " T");
        int m32089h4 = m32089h(str, parsePosition2, 2, 0);
        m32087j(str, parsePosition2, ": ");
        int m32089h5 = m32089h(str, parsePosition2, 2, 0);
        m32087j(str, parsePosition2, ": ");
        int m32089h6 = m32089h(str, parsePosition2, 2, 0);
        if (m32087j(str, parsePosition2, ".") == '.') {
            m32089h(str, parsePosition2, 19, 0);
        }
        GregorianCalendar m32094c = m32094c();
        try {
            m32094c.set(m32089h, m32089h2, m32089h3, m32089h4, m32089h5, m32089h6);
            m32094c.getTimeInMillis();
            parsePosition.setIndex(parsePosition2.getIndex());
            m32087j(str, parsePosition, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            return m32094c;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Calendar m32092e(String str, ParsePosition parsePosition) {
        int i;
        String[] strArr;
        if (str == null || str.isEmpty() || "D:".equals(str.trim())) {
            return null;
        }
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        m32087j(str, parsePosition2, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        int index = parsePosition2.getIndex();
        GregorianCalendar m32093d = m32093d(str, parsePosition2);
        if (m32093d != null && (parsePosition2.getIndex() == str.length() || m32090g(str, m32093d, parsePosition2))) {
            i = parsePosition2.getIndex();
            if (i == str.length()) {
                parsePosition.setIndex(i);
                return m32093d;
            }
        } else {
            m32093d = null;
            i = -999999;
        }
        parsePosition2.setIndex(index);
        if (Character.isDigit(str.charAt(index))) {
            strArr = f60852b;
        } else {
            strArr = f60851a;
        }
        GregorianCalendar m32091f = m32091f(str, strArr, parsePosition2);
        if (m32091f != null && (parsePosition2.getIndex() == str.length() || m32090g(str, m32091f, parsePosition2))) {
            int index2 = parsePosition2.getIndex();
            if (index2 == str.length()) {
                parsePosition.setIndex(index2);
                return m32091f;
            } else if (index2 > i) {
                i = index2;
                m32093d = m32091f;
            }
        }
        if (m32093d != null) {
            parsePosition.setIndex(i);
            return m32093d;
        }
        return m32091f;
    }

    /* renamed from: f */
    public static GregorianCalendar m32091f(String str, String[] strArr, ParsePosition parsePosition) {
        for (String str2 : strArr) {
            ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
            GregorianCalendar m32094c = m32094c();
            simpleDateFormat.setCalendar(m32094c);
            if (simpleDateFormat.parse(str, parsePosition2) != null) {
                parsePosition.setIndex(parsePosition2.getIndex());
                m32087j(str, parsePosition, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                return m32094c;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m32090g(String str, GregorianCalendar gregorianCalendar, ParsePosition parsePosition) {
        boolean z;
        int i;
        ParsePosition parsePosition2 = new ParsePosition(parsePosition.getIndex());
        TimeZone simpleTimeZone = new SimpleTimeZone(0, "GMT");
        char m32087j = m32087j(str, parsePosition2, "Z+- ");
        if (m32087j != 'Z' && !m32086k(str, "GMT", parsePosition2) && !m32086k(str, "UTC", parsePosition2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m32087j = m32087j(str, parsePosition2, "+- ");
        }
        int m32089h = m32089h(str, parsePosition2, 2, -999);
        m32087j(str, parsePosition2, "': ");
        int m32089h2 = m32089h(str, parsePosition2, 2, 0);
        m32087j(str, parsePosition2, "' ");
        if (m32089h != -999) {
            if (m32087j == '-') {
                i = -1;
            } else {
                i = 1;
            }
            simpleTimeZone.setRawOffset(m32088i(i * ((m32089h * DateTimeConstants.MILLIS_PER_HOUR) + (m32089h2 * 60000))));
            m32085l(simpleTimeZone);
        } else if (!z) {
            simpleTimeZone = TimeZone.getTimeZone(str.substring(parsePosition.getIndex()).trim());
            if ("GMT".equals(simpleTimeZone.getID())) {
                return false;
            }
            parsePosition2.setIndex(str.length());
        }
        m32096a(gregorianCalendar, simpleTimeZone);
        parsePosition.setIndex(parsePosition2.getIndex());
        return true;
    }

    /* renamed from: h */
    public static int m32089h(String str, ParsePosition parsePosition, int i, int i2) {
        if (str == null) {
            return i2;
        }
        int index = parsePosition.getIndex();
        int min = Math.min(i, str.length() - index) + index;
        int i3 = 0;
        while (index < min) {
            int charAt = str.charAt(index) - '0';
            if (charAt < 0 || charAt > 9) {
                break;
            }
            i3 = (i3 * 10) + charAt;
            index++;
        }
        if (index == parsePosition.getIndex()) {
            return i2;
        }
        parsePosition.setIndex(index);
        return i3;
    }

    /* renamed from: i */
    public static int m32088i(long j) {
        if (j <= 50400000 && j >= -50400000) {
            return (int) j;
        }
        long j2 = (((j + 43200000) % 86400000) + 86400000) % 86400000;
        if (j2 == 0) {
            return 43200000;
        }
        return (int) ((j2 - 43200000) % 43200000);
    }

    /* renamed from: j */
    public static char m32087j(String str, ParsePosition parsePosition, String str2) {
        char c = TokenParser.f74560SP;
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (str2.indexOf(charAt) < 0) {
                break;
            }
            if (charAt != ' ') {
                c = charAt;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
        }
        return c;
    }

    /* renamed from: k */
    public static boolean m32086k(String str, String str2, ParsePosition parsePosition) {
        if (str.startsWith(str2, parsePosition.getIndex())) {
            parsePosition.setIndex(parsePosition.getIndex() + str2.length());
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static void m32085l(TimeZone timeZone) {
        char c;
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            c = '-';
        } else {
            c = '+';
        }
        int i = rawOffset / DateTimeConstants.MILLIS_PER_HOUR;
        int i2 = (rawOffset % DateTimeConstants.MILLIS_PER_HOUR) / 60000;
        if (rawOffset == 0) {
            timeZone.setID("GMT");
        } else if (c == '+' && i <= 12) {
            timeZone.setID(String.format(Locale.US, "GMT+%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (c == '-' && i <= 14) {
            timeZone.setID(String.format(Locale.US, "GMT-%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2)));
        } else {
            timeZone.setID(EnvironmentCompat.MEDIA_UNKNOWN);
        }
    }

    public static Calendar toCalendar(COSString cOSString) {
        if (cOSString == null) {
            return null;
        }
        return toCalendar(cOSString.getString());
    }

    public static String toISO8601(Calendar calendar) {
        return String.format(Locale.US, "%1$4tY-%1$2tm-%1$2tdT%1$2tH:%1$2tM:%1$2tS%2$s", calendar, m32095b(calendar.get(15) + calendar.get(16), ":"));
    }

    public static String toString(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return String.format(Locale.US, "D:%1$4tY%1$2tm%1$2td%1$2tH%1$2tM%1$2tS%2$s'", calendar, m32095b(calendar.get(15) + calendar.get(16), OperatorName.SHOW_TEXT_LINE));
    }

    public static Calendar toCalendar(String str) {
        if (str != null && !str.trim().isEmpty()) {
            ParsePosition parsePosition = new ParsePosition(0);
            m32087j(str, parsePosition, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            m32086k(str, "D:", parsePosition);
            Calendar m32092e = m32092e(str, parsePosition);
            if (m32092e != null && parsePosition.getIndex() == str.length()) {
                return m32092e;
            }
        }
        return null;
    }
}
