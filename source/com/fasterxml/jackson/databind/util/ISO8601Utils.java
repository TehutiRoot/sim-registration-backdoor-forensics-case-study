package com.fasterxml.jackson.databind.util;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

@Deprecated
/* loaded from: classes3.dex */
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;

    /* renamed from: a */
    public static final TimeZone f43465a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m49385a(String str, int i, char c) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m49384b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            } else {
                return i;
            }
        }
        return str.length();
    }

    /* renamed from: c */
    public static int m49383c(String str, int i, int i2) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }

    public static String format(Date date) {
        return format(date, false, f43465a);
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int m49383c = m49383c(str, index, i5);
            if (m49385a(str, i5, '-')) {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int m49383c2 = m49383c(str, i5, i6);
            if (m49385a(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int m49383c3 = m49383c(str, i6, i7);
            boolean m49385a = m49385a(str, i7, 'T');
            if (!m49385a && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(m49383c, m49383c2 - 1, m49383c3);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (m49385a) {
                int i8 = i6 + 5;
                int m49383c4 = m49383c(str, i6 + 3, i8);
                if (m49385a(str, i8, ':')) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int m49383c5 = m49383c(str, i8, i9);
                if (m49385a(str, i9, ':')) {
                    i9 = i8 + 3;
                }
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i10 = i9 + 2;
                    i4 = m49383c(str, i9, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (m49385a(str, i10, '.')) {
                        int i11 = i9 + 3;
                        int m49384b = m49384b(str, i9 + 4);
                        int min = Math.min(m49384b, i9 + 6);
                        int m49383c6 = m49383c(str, i11, min);
                        int i12 = min - i11;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                m49383c6 *= 10;
                            }
                        } else {
                            m49383c6 *= 100;
                        }
                        i = m49383c4;
                        i7 = m49384b;
                        i2 = m49383c5;
                        i3 = m49383c6;
                    } else {
                        i = m49383c4;
                        i7 = i10;
                        i2 = m49383c5;
                        i3 = 0;
                    }
                } else {
                    i2 = m49383c5;
                    i3 = 0;
                    i4 = 0;
                    i7 = i9;
                    i = m49383c4;
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() > i7) {
                char charAt2 = str.charAt(i7);
                if (charAt2 == 'Z') {
                    timeZone = f43465a;
                    length = i7 + 1;
                } else {
                    if (charAt2 != '+' && charAt2 != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + OperatorName.SHOW_TEXT_LINE);
                    }
                    String substring = str.substring(i7);
                    length = i7 + substring.length();
                    if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                        String str3 = "GMT" + substring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                    timeZone = f43465a;
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, m49383c);
                gregorianCalendar2.set(2, m49383c2 - 1);
                gregorianCalendar2.set(5, m49383c3);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, i4);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            throw new IllegalArgumentException("No time zone indicator");
        } catch (Exception e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date " + str2 + ": " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static String format(Date date, boolean z) {
        return format(date, z, f43465a);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            sb.append(String.format("%c%02d:%02d", Character.valueOf(offset < 0 ? '-' : '+'), Integer.valueOf(Math.abs(i / 60)), Integer.valueOf(Math.abs(i % 60))));
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }
}
