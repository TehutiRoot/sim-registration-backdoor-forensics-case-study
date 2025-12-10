package p000;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.compose.material3.DatePickerDefaults;
import com.google.android.material.R;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: v02 */
/* loaded from: classes4.dex */
public abstract class AbstractC22545v02 {

    /* renamed from: a */
    public static AtomicReference f107548a = new AtomicReference();

    /* renamed from: a */
    public static long m1149a(long j) {
        Calendar m1133q = m1133q();
        m1133q.setTimeInMillis(j);
        return m1144f(m1133q).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m1148b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: c */
    public static DateFormat m1147c(Locale locale) {
        return m1145e("MMMd", locale);
    }

    /* renamed from: d */
    public static DateFormat m1146d(Locale locale) {
        return m1145e("MMMEd", locale);
    }

    /* renamed from: e */
    public static DateFormat m1145e(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m1134p());
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    /* renamed from: f */
    public static Calendar m1144f(Calendar calendar) {
        Calendar m1132r = m1132r(calendar);
        Calendar m1133q = m1133q();
        m1133q.set(m1132r.get(1), m1132r.get(2), m1132r.get(5));
        return m1133q;
    }

    /* renamed from: g */
    public static SimpleDateFormat m1143g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m1136n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: h */
    public static String m1142h(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, string);
    }

    /* renamed from: i */
    public static java.text.DateFormat m1141i(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m1136n());
        return dateInstance;
    }

    /* renamed from: j */
    public static java.text.DateFormat m1140j(Locale locale) {
        return m1141i(0, locale);
    }

    /* renamed from: k */
    public static java.text.DateFormat m1139k(Locale locale) {
        return m1141i(2, locale);
    }

    /* renamed from: l */
    public static java.text.DateFormat m1138l(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m1139k(locale);
        simpleDateFormat.applyPattern(m1128v(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: m */
    public static C21248nT1 m1137m() {
        C21248nT1 c21248nT1 = (C21248nT1) f107548a.get();
        if (c21248nT1 == null) {
            return C21248nT1.m26125c();
        }
        return c21248nT1;
    }

    /* renamed from: n */
    public static TimeZone m1136n() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: o */
    public static Calendar m1135o() {
        Calendar m26127a = m1137m().m26127a();
        m26127a.set(11, 0);
        m26127a.set(12, 0);
        m26127a.set(13, 0);
        m26127a.set(14, 0);
        m26127a.setTimeZone(m1136n());
        return m26127a;
    }

    /* renamed from: p */
    public static android.icu.util.TimeZone m1134p() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* renamed from: q */
    public static Calendar m1133q() {
        return m1132r(null);
    }

    /* renamed from: r */
    public static Calendar m1132r(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m1136n());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* renamed from: s */
    public static DateFormat m1131s(Locale locale) {
        return m1145e(DatePickerDefaults.YearAbbrMonthDaySkeleton, locale);
    }

    /* renamed from: t */
    public static DateFormat m1130t(Locale locale) {
        return m1145e("yMMMEd", locale);
    }

    /* renamed from: u */
    public static DateFormat m1129u(Locale locale) {
        return m1145e(DatePickerDefaults.YearMonthSkeleton, locale);
    }

    /* renamed from: v */
    public static String m1128v(String str) {
        int m1148b = m1148b(str, "yY", 1, 0);
        if (m1148b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int m1148b2 = m1148b(str, "EMd", 1, m1148b);
        if (m1148b2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(m1148b(str, str2, -1, m1148b) + 1, m1148b2), HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).trim();
    }
}
