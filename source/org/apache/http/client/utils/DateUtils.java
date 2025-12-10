package org.apache.http.client.utils;

import com.google.firebase.perf.util.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class DateUtils {
    public static final TimeZone GMT;
    public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
    public static final String PATTERN_RFC1036 = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: a */
    public static final String[] f73731a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: b */
    public static final Date f73732b;

    /* renamed from: org.apache.http.client.utils.DateUtils$a */
    /* loaded from: classes6.dex */
    public static final class C12566a {

        /* renamed from: a */
        public static final ThreadLocal f73733a = new ThreadLocal();

        /* renamed from: a */
        public static void m24822a() {
            f73733a.remove();
        }

        /* renamed from: b */
        public static SimpleDateFormat m24821b(String str) {
            Map map;
            ThreadLocal threadLocal = f73733a;
            SoftReference softReference = (SoftReference) threadLocal.get();
            if (softReference == null) {
                map = null;
            } else {
                map = (Map) softReference.get();
            }
            if (map == null) {
                map = new HashMap();
                threadLocal.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
                map.put(str, simpleDateFormat2);
                return simpleDateFormat2;
            }
            return simpleDateFormat;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        GMT = timeZone;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(Constants.MAX_URL_LENGTH, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f73732b = calendar.getTime();
    }

    public static void clearThreadLocal() {
        C12566a.m24822a();
    }

    public static String formatDate(Date date) {
        return formatDate(date, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    public static Date parseDate(String str) {
        return parseDate(str, null, null);
    }

    public static String formatDate(Date date, String str) {
        Args.notNull(date, "Date");
        Args.notNull(str, "Pattern");
        return C12566a.m24821b(str).format(date);
    }

    public static Date parseDate(String str, String[] strArr) {
        return parseDate(str, strArr, null);
    }

    public static Date parseDate(String str, String[] strArr, Date date) {
        Args.notNull(str, "Date value");
        if (strArr == null) {
            strArr = f73731a;
        }
        if (date == null) {
            date = f73732b;
        }
        if (str.length() > 1 && str.startsWith(OperatorName.SHOW_TEXT_LINE) && str.endsWith(OperatorName.SHOW_TEXT_LINE)) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat m24821b = C12566a.m24821b(str2);
            m24821b.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = m24821b.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }
}
