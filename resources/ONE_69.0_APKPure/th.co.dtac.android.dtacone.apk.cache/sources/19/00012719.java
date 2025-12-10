package th.p047co.dtac.android.dtacone.util.date;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.format.DateUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* renamed from: th.co.dtac.android.dtacone.util.date.DateUtil */
/* loaded from: classes8.dex */
public class DateUtil {
    public static final String FORMAT_BIRTH_DAY_DISPLAY_DATE = "dd MMMM yyyy";
    public static final String FORMAT_BIRTH_DAY_NUMBER = "yyyy MM dd";
    public static final String FORMAT_BIRTH_DAY_VALIDATE = "yyyyMMdd";
    public static final String FORMAT_DATE_NEXT_DAY = "dd/MM/yyyy";
    public static final String FORMAT_DATE_VALIDATE_CONSENT = "yyMMddHHss";
    public static final String FORMAT_DISPLAY_DATE = "d MMMM yyyy";
    public static final String FORMAT_ERROR_FULL_DATE_TIME = "dd-MM-yyyy HH:mm";
    public static final String FORMAT_ID_CARD_READ_DATE = "yyyyMMdd";
    public static final String FORMAT_NEW_DATE = "EEE MMM dd HH:mm:ss zzz yyyy";
    public static final String FORMAT_SERVER_BALANCER_FULL_DATE_TIME = "dd MMM yyyy HH:mm";
    public static final String FORMAT_SERVER_CURRENT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_SERVER_DATE = "yyyy-MM-dd";
    public static final String FORMAT_SERVER_FULL_DATE_TIME = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_SERVER_DATE_TIME = "yyyy-MM-dd " + m16762a();

    /* renamed from: a */
    public static final Map f87151a = new HashMap<String, Integer>() { // from class: th.co.dtac.android.dtacone.util.date.DateUtil.1
        {
            put("jan", 31);
            put("feb", 28);
            put("mar", 31);
            put("apr", 30);
            put("may", 31);
            put("jun", 30);
            put("jul", 31);
            put("aug", 31);
            put("sep", 30);
            put("oct", 31);
            put("nov", 30);
            put("dec", 31);
        }
    };

    /* renamed from: a */
    public static String m16762a() {
        return "HH:mm:ss";
    }

    public static String convertCardReaderToDisplayEng(String str) {
        try {
            Locale locale = Locale.US;
            return convertDate(str, "yyyyMMdd", locale, true, "d MMM yyyy", locale, false);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + str, e);
            return "";
        }
    }

    public static String convertCardReaderToDisplayThai(String str) {
        try {
            return convertDate(str, "yyyyMMdd", Locale.US, false, "d MMM yyyy", new Locale(LanguageSupport.LANG_TH), false);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + str, e);
            return "";
        }
    }

    public static String convertCardReaderToDisplayThaiBuddhist(String str) {
        try {
            return convertDate(str, "yyyyMMdd", Locale.US, true, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + str, e);
            return "";
        }
    }

    public static String convertCardReaderToDisplayThaiFullMonth(String str) {
        try {
            return convertDate(str, "yyyyMMdd", Locale.US, false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), false);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + str, e);
            return "";
        }
    }

    public static String convertDate(String str, String str2, Locale locale, boolean z, String str3, Context context, boolean z2) throws ParseException {
        return convertDate(str, str2, locale, z, str3, getDefaultLocale(context), z2);
    }

    public static String convertDateDisplayThaiToServer(String str, Locale locale) {
        return convertServerDate(str, "dd MMMM yyyy", Locale.US, "yyyy-MM-dd", locale);
    }

    public static String convertDateToDisplayThai(Date date) {
        try {
            return convertDate(date, false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + date, e);
            return "";
        }
    }

    public static String convertDateToSubmitDate(Date date) {
        try {
            return convertDate(date, false, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot card date " + date, e);
            return "";
        }
    }

    public static String convertServerDate(String str, String str2, Locale locale, String str3, Locale locale2) {
        try {
            return convertDate(str, str2, locale, false, str3, locale2, locale2.getLanguage().equals(LanguageSupport.LANG_TH));
        } catch (ParseException e) {
            Log.w("DateUtil", "Cannot parse " + str + " with format " + str2 + " and convert to " + str3, e);
            return "";
        }
    }

    public static String convertServerDateTimeToUserDate(String str, Locale locale) {
        return convertServerDate(str, FORMAT_SERVER_DATE_TIME, Locale.US, "d MMM yyyy", locale);
    }

    public static String convertServerDateTimeToUserShortDate(String str, Locale locale) {
        return convertServerDate(str, FORMAT_SERVER_DATE_TIME, Locale.US, "d MMM yyyy", locale);
    }

    public static String convertServerDateTimeToUserTime(String str, Locale locale) {
        String str2;
        if (locale.getLanguage().equals(LanguageSupport.LANG_TH)) {
            str2 = "HH:mm น.";
        } else {
            str2 = "HH:mm";
        }
        return convertServerDate(str, FORMAT_SERVER_DATE_TIME, Locale.US, str2, locale);
    }

    public static String convertServerDateToDisplayDate(String str, Locale locale) {
        return convertServerDate(str, "yyyy-MM-dd", Locale.US, FORMAT_DISPLAY_DATE, locale);
    }

    public static String convertServerDateToNormalDateFormat(String str, Locale locale) {
        return convertServerDate(str, "yyyyMMdd", Locale.US, "dd/MM/yyyy", locale);
    }

    public static String convertServerDateToUserDate(String str, Locale locale) {
        return convertServerDate(str, "yyyy-MM-dd", Locale.US, "d MMM yyyy", locale);
    }

    public static Date convertStringServerDateToDate(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date convertStringToDate(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String convertUserDateToServerDate(String str, Locale locale) {
        return convertServerDate(str, "yyyyMMdd", Locale.US, "yyyy-MM-dd", locale);
    }

    public static String covertToStringFormat(String str, String str2, String str3, Locale locale) {
        try {
            return new SimpleDateFormat(str3, locale).format(new SimpleDateFormat(str2, locale).parse(str));
        } catch (ParseException unused) {
            return null;
        }
    }

    public static String displayDateTimeOnErrorDialog() {
        return new SimpleDateFormat(FORMAT_ERROR_FULL_DATE_TIME, new Locale(LanguageSupport.LANG_TH, LanguageSupport.LANG_TH)).format(new Date());
    }

    public static String getCurrentDateFormatted() {
        return new SimpleDateFormat(FORMAT_DATE_VALIDATE_CONSENT, Locale.getDefault()).format(new Date());
    }

    public static String getCurrentDateServerFormatted() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }

    public static int getCurrentDay() {
        return Calendar.getInstance().get(5);
    }

    public static int getCurrentMonth() {
        return Calendar.getInstance().get(2);
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(1);
    }

    public static Date getDateNextDay() {
        Date date = new Date();
        date.setDate(date.getDate() + 1);
        return date;
    }

    public static long getDayDifference(Date date, Date date2) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        return timeUnit.convert(getDifference(date, date2), timeUnit);
    }

    public static Locale getDefaultLocale(Context context) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    public static long getDifference(Date date, Date date2) {
        return date2.getTime() - date.getTime();
    }

    public static String getMonthByNumber(int i) {
        return new DateFormatSymbols().getMonths()[i];
    }

    public static int getNextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, 1);
        return calendar.get(5);
    }

    public static String getRelativeDateTime(String str, String str2, Locale locale) {
        try {
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            long time = parse.getTime();
            long currentTimeMillis = System.currentTimeMillis();
            long j = (currentTimeMillis - time) / 1000;
            if (j < 0) {
                String convertServerDateToUserDate = convertServerDateToUserDate(str, locale);
                return convertServerDateToUserDate.concat(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + convertServerDateTimeToUserTime(str, locale));
            } else if (j < 60) {
                return DateUtils.getRelativeTimeSpanString(parse.getTime(), currentTimeMillis, 1000L).toString();
            } else {
                if (j < 3600) {
                    return DateUtils.getRelativeTimeSpanString(parse.getTime(), currentTimeMillis, 60000L).toString();
                }
                if (j < 86400) {
                    return DateUtils.getRelativeTimeSpanString(parse.getTime(), currentTimeMillis, (long) CoreConstants.MILLIS_IN_ONE_HOUR).toString();
                }
                String convertServerDateToUserDate2 = convertServerDateToUserDate(str, locale);
                return convertServerDateToUserDate2.concat(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + convertServerDateTimeToUserTime(str, locale));
            }
        } catch (ParseException unused) {
            return str;
        }
    }

    public static String getRenderDateAsOf(String str) {
        String convertServerDateTimeToUserDate = convertServerDateTimeToUserDate(str, new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH));
        if (!convertServerDateTimeToUserDate.startsWith("1 ")) {
            return "1 - " + convertServerDateTimeToUserDate;
        }
        return convertServerDateTimeToUserDate;
    }

    public static String getTimeStampISO8601() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.UK).format(new Date());
    }

    public static String getTimeStampISO8601WithOutZ() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.UK).format(new Date());
    }

    public static Integer getdDaysofMonth(String str, boolean z) {
        Integer num = (Integer) f87151a.get(str.toLowerCase(Locale.US));
        if (num != null && str.equalsIgnoreCase("Feb") && z) {
            return Integer.valueOf(num.intValue() + 1);
        }
        return num;
    }

    public static Boolean isShortEngMonth(String str) {
        return Boolean.valueOf(f87151a.containsKey(str.toLowerCase(Locale.US)));
    }

    public static String convertDate(String str, String str2, Locale locale, boolean z, String str3, Locale locale2, boolean z2) throws ParseException {
        Date parse = new SimpleDateFormat(str2, locale).parse(str);
        if (z != z2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            if (z) {
                calendar.add(1, -543);
            }
            if (z2) {
                calendar.add(1, 543);
            }
            parse = calendar.getTime();
        }
        return new SimpleDateFormat(str3, locale2).format(parse);
    }

    public static int getCurrentDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public static int getCurrentMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(2);
    }

    public static int getCurrentYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1);
    }

    public static String convertDate(Date date, boolean z, String str, Locale locale, boolean z2) throws ParseException {
        if (z != z2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (z) {
                calendar.add(1, -543);
            }
            if (z2) {
                calendar.add(1, 543);
            }
            date = calendar.getTime();
        }
        return new SimpleDateFormat(str, locale).format(date);
    }
}