package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bouncycastle.asn1.eac.EACTags;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* loaded from: classes5.dex */
public class DateTimeFormat {

    /* renamed from: a */
    public static final ConcurrentHashMap f76158a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final AtomicReferenceArray f76159b = new AtomicReferenceArray(25);

    /* renamed from: org.joda.time.format.DateTimeFormat$b */
    /* loaded from: classes5.dex */
    public static class C12994b {

        /* renamed from: a */
        public final int f76164a;

        /* renamed from: b */
        public final Locale f76165b;

        public C12994b(int i, int i2, int i3, Locale locale) {
            this.f76165b = locale;
            this.f76164a = i + (i2 << 4) + (i3 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C12994b)) {
                return false;
            }
            C12994b c12994b = (C12994b) obj;
            if (this.f76164a != c12994b.f76164a) {
                return false;
            }
            Locale locale = this.f76165b;
            if (locale == null) {
                if (c12994b.f76165b != null) {
                    return false;
                }
            } else if (!locale.equals(c12994b.f76165b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int i = (this.f76164a + 31) * 31;
            Locale locale = this.f76165b;
            if (locale == null) {
                hashCode = 0;
            } else {
                hashCode = locale.hashCode();
            }
            return i + hashCode;
        }
    }

    /* renamed from: a */
    public static void m24040a(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        m24034g(dateTimeFormatterBuilder, str);
    }

    /* renamed from: b */
    public static DateTimeFormatter m24039b(int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = 1;
        } else if (i2 == 4) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        C12993a c12993a = new C12993a(i, i2, i3);
        return new DateTimeFormatter(c12993a, c12993a);
    }

    /* renamed from: c */
    public static DateTimeFormatter m24038c(String str) {
        DateTimeFormatter dateTimeFormatter;
        if (str != null && str.length() != 0) {
            ConcurrentHashMap concurrentHashMap = f76158a;
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.get(str);
            if (dateTimeFormatter2 == null) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                m24034g(dateTimeFormatterBuilder, str);
                DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
                if (concurrentHashMap.size() < 500 && (dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, formatter)) != null) {
                    return dateTimeFormatter;
                }
                return formatter;
            }
            return dateTimeFormatter2;
        }
        throw new IllegalArgumentException("Invalid pattern specification");
    }

    /* renamed from: d */
    public static DateTimeFormatter m24037d(String str) {
        if (str != null && str.length() == 2) {
            int m24032i = m24032i(str.charAt(0));
            int m24032i2 = m24032i(str.charAt(1));
            if (m24032i == 4 && m24032i2 == 4) {
                throw new IllegalArgumentException("Style '--' is invalid");
            }
            return m24036e(m24032i, m24032i2);
        }
        throw new IllegalArgumentException("Invalid style specification: " + str);
    }

    /* renamed from: e */
    public static DateTimeFormatter m24036e(int i, int i2) {
        int i3 = (i << 2) + i + i2;
        AtomicReferenceArray atomicReferenceArray = f76159b;
        if (i3 >= atomicReferenceArray.length()) {
            return m24039b(i, i2);
        }
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) atomicReferenceArray.get(i3);
        if (dateTimeFormatter == null) {
            DateTimeFormatter m24039b = m24039b(i, i2);
            if (!AbstractC21408oN1.m25928a(atomicReferenceArray, i3, null, m24039b)) {
                return (DateTimeFormatter) atomicReferenceArray.get(i3);
            }
            return m24039b;
        }
        return dateTimeFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24035f(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L14
            char r3 = r3.charAt(r1)
            r2 = 1
            switch(r3) {
                case 67: goto L13;
                case 68: goto L13;
                case 70: goto L13;
                case 72: goto L13;
                case 75: goto L13;
                case 77: goto L10;
                case 83: goto L13;
                case 87: goto L13;
                case 89: goto L13;
                case 99: goto L13;
                case 100: goto L13;
                case 101: goto L13;
                case 104: goto L13;
                case 107: goto L13;
                case 109: goto L13;
                case 115: goto L13;
                case 119: goto L13;
                case 120: goto L13;
                case 121: goto L13;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            r3 = 2
            if (r0 > r3) goto L14
        L13:
            return r2
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormat.m24035f(java.lang.String):boolean");
    }

    public static DateTimeFormatter forPattern(String str) {
        return m24038c(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return m24037d(str);
    }

    public static DateTimeFormatter fullDate() {
        return m24036e(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return m24036e(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return m24036e(4, 0);
    }

    /* renamed from: g */
    public static void m24034g(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i = 0;
        while (i < length) {
            iArr[0] = i;
            String m24033h = m24033h(str, iArr);
            int i2 = iArr[0];
            int length2 = m24033h.length();
            if (length2 != 0) {
                char charAt = m24033h.charAt(0);
                if (charAt != '\'') {
                    if (charAt != 'K') {
                        if (charAt != 'M') {
                            if (charAt != 'S') {
                                if (charAt != 'a') {
                                    if (charAt != 'h') {
                                        if (charAt != 'k') {
                                            if (charAt != 'm') {
                                                if (charAt != 's') {
                                                    if (charAt != 'G') {
                                                        if (charAt != 'H') {
                                                            if (charAt != 'Y') {
                                                                if (charAt != 'Z') {
                                                                    if (charAt != 'd') {
                                                                        if (charAt != 'e') {
                                                                            switch (charAt) {
                                                                                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                                                                    dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                                                                    break;
                                                                                case EACTags.APPLICATION_IMAGE /* 68 */:
                                                                                    dateTimeFormatterBuilder.appendDayOfYear(length2);
                                                                                    break;
                                                                                case EACTags.DISPLAY_IMAGE /* 69 */:
                                                                                    if (length2 >= 4) {
                                                                                        dateTimeFormatterBuilder.appendDayOfWeekText();
                                                                                        break;
                                                                                    } else {
                                                                                        dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    switch (charAt) {
                                                                                        case 'w':
                                                                                            dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                                                                            break;
                                                                                        case 'x':
                                                                                        case 'y':
                                                                                            break;
                                                                                        case 'z':
                                                                                            if (length2 >= 4) {
                                                                                                dateTimeFormatterBuilder.appendTimeZoneName();
                                                                                                break;
                                                                                            } else {
                                                                                                dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                                                                                break;
                                                                                            }
                                                                                        default:
                                                                                            throw new IllegalArgumentException("Illegal pattern component: " + m24033h);
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            dateTimeFormatterBuilder.appendDayOfWeek(length2);
                                                                        }
                                                                    } else {
                                                                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                                                                    }
                                                                } else if (length2 == 1) {
                                                                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                                                                } else if (length2 == 2) {
                                                                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendTimeZoneId();
                                                                }
                                                            }
                                                            if (length2 == 2) {
                                                                if (i2 + 1 < length) {
                                                                    iArr[0] = iArr[0] + 1;
                                                                    z = !m24035f(m24033h(str, iArr));
                                                                    iArr[0] = iArr[0] - 1;
                                                                } else {
                                                                    z = true;
                                                                }
                                                                if (charAt != 'x') {
                                                                    dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z);
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z);
                                                                }
                                                            } else {
                                                                int i3 = 9;
                                                                if (i2 + 1 < length) {
                                                                    iArr[0] = iArr[0] + 1;
                                                                    if (m24035f(m24033h(str, iArr))) {
                                                                        i3 = length2;
                                                                    }
                                                                    iArr[0] = iArr[0] - 1;
                                                                }
                                                                if (charAt != 'Y') {
                                                                    if (charAt != 'x') {
                                                                        if (charAt == 'y') {
                                                                            dateTimeFormatterBuilder.appendYear(length2, i3);
                                                                        }
                                                                    } else {
                                                                        dateTimeFormatterBuilder.appendWeekyear(length2, i3);
                                                                    }
                                                                } else {
                                                                    dateTimeFormatterBuilder.appendYearOfEra(length2, i3);
                                                                }
                                                            }
                                                        } else {
                                                            dateTimeFormatterBuilder.appendHourOfDay(length2);
                                                        }
                                                    } else {
                                                        dateTimeFormatterBuilder.appendEraText();
                                                    }
                                                } else {
                                                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                                                }
                                            } else {
                                                dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                                            }
                                        } else {
                                            dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                                        }
                                    } else {
                                        dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                                    }
                                } else {
                                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                                }
                            } else {
                                dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                            }
                        } else if (length2 >= 3) {
                            if (length2 >= 4) {
                                dateTimeFormatterBuilder.appendMonthOfYearText();
                            } else {
                                dateTimeFormatterBuilder.appendMonthOfYearShortText();
                            }
                        } else {
                            dateTimeFormatterBuilder.appendMonthOfYear(length2);
                        }
                    } else {
                        dateTimeFormatterBuilder.appendHourOfHalfday(length2);
                    }
                } else {
                    String substring = m24033h.substring(1);
                    if (substring.length() == 1) {
                        dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                    } else {
                        dateTimeFormatterBuilder.appendLiteral(new String(substring));
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static String m24033h(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
            boolean z = false;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 < length && str.charAt(i3) == '\'') {
                        sb.append(charAt2);
                        i = i3;
                    } else {
                        z = !z;
                    }
                } else if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                    i--;
                    break;
                } else {
                    sb.append(charAt2);
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* renamed from: i */
    public static int m24032i(char c) {
        if (c != '-') {
            if (c != 'F') {
                if (c != 'S') {
                    if (c != 'L') {
                        if (c == 'M') {
                            return 2;
                        }
                        throw new IllegalArgumentException("Invalid style character: " + c);
                    }
                    return 1;
                }
                return 3;
            }
            return 0;
        }
        return 4;
    }

    public static DateTimeFormatter longDate() {
        return m24036e(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return m24036e(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return m24036e(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return m24036e(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return m24036e(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return m24036e(4, 2);
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter m24037d = m24037d(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((C12993a) m24037d.m24028b()).m24030b(locale);
    }

    public static DateTimeFormatter shortDate() {
        return m24036e(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return m24036e(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return m24036e(4, 3);
    }

    /* renamed from: org.joda.time.format.DateTimeFormat$a */
    /* loaded from: classes5.dex */
    public static class C12993a implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: d */
        public static final ConcurrentHashMap f76160d = new ConcurrentHashMap();

        /* renamed from: a */
        public final int f76161a;

        /* renamed from: b */
        public final int f76162b;

        /* renamed from: c */
        public final int f76163c;

        public C12993a(int i, int i2, int i3) {
            this.f76161a = i;
            this.f76162b = i2;
            this.f76163c = i3;
        }

        /* renamed from: a */
        public final DateTimeFormatter m24031a(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            C12994b c12994b = new C12994b(this.f76163c, this.f76161a, this.f76162b, locale);
            ConcurrentHashMap concurrentHashMap = f76160d;
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(c12994b);
            if (dateTimeFormatter == null) {
                DateTimeFormatter forPattern = DateTimeFormat.forPattern(m24030b(locale));
                DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(c12994b, forPattern);
                if (dateTimeFormatter2 != null) {
                    return dateTimeFormatter2;
                }
                return forPattern;
            }
            return dateTimeFormatter;
        }

        /* renamed from: b */
        public String m24030b(Locale locale) {
            DateFormat dateInstance;
            int i = this.f76163c;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        dateInstance = null;
                    } else {
                        dateInstance = DateFormat.getDateTimeInstance(this.f76161a, this.f76162b, locale);
                    }
                } else {
                    dateInstance = DateFormat.getTimeInstance(this.f76162b, locale);
                }
            } else {
                dateInstance = DateFormat.getDateInstance(this.f76161a, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return 40;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return 40;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            return m24031a(dateTimeParserBucket.getLocale()).m24029a().parseInto(dateTimeParserBucket, charSequence, i);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            m24031a(locale).m24028b().printTo(appendable, j, chronology, i, dateTimeZone, locale);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            m24031a(locale).m24028b().printTo(appendable, readablePartial, locale);
        }
    }
}
