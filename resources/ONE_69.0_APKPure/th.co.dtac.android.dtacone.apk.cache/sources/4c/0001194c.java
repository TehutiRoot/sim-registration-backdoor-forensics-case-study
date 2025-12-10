package th.p047co.dtac.android.dtacone.extension.format;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;

@Metadata(m29143d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0002*\u00020\u0001\u001a\u001a\u0010\u0010\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u001a\n\u0010\u0014\u001a\u00020\u0002*\u00020\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0002*\u00020\u0002\u001a\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u001a&\u0010\u001f\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u0002\u001a\n\u0010!\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\"\u001a\u00020\u0002*\u00020\u0001\u001a\f\u0010#\u001a\u0004\u0018\u00010\u0019*\u00020\u0002\u001a\f\u0010$\u001a\u0004\u0018\u00010\u0019*\u00020\u0002\u001a\n\u0010%\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010&\u001a\u00020\u0002*\u00020\u0019\u001a\f\u0010'\u001a\u0004\u0018\u00010\u0002*\u00020\u0019\u001a\f\u0010(\u001a\u0004\u0018\u00010\u0002*\u00020\u0019\u001a\f\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0019\u001a\n\u0010*\u001a\u00020\u0002*\u00020\u001e\u001a\n\u0010+\u001a\u00020\u0002*\u00020\u001e\u001a\n\u0010,\u001a\u00020\u0002*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006-"}, m29142d2 = {"toDate", "Ljava/util/Date;", "", "getToDate", "(Ljava/lang/String;)Ljava/util/Date;", "addDayToDate", "day", "", "fromOcrToBeDateFormat", "fromOcrToThaiDateFormat", "fromOcrToThaiDateValidateFormat", "fromServerDateToThaiDateFormat", "fromSmartCardToThaiDateFormat", "getThaiDateOnlyDate", "getThaiDateShortMonth", "getThaiDateShortMonthYear", "thaiDateSmartCardToDateFormatServer", "srcBuddhist", "", "desBuddhist", "thaiDateToDateFormat", "thaiDateToDateFormatServer", "thaiDateToEngNumberDateSpaceFormat", "thaiDateToThaiDateValidateFormat", "toBirthDateCollectionFormat", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "format", "locale", "Ljava/util/Locale;", "toDateString", "Ljava/util/Calendar;", "toDateStringWithTimeZone", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "toDateWithMonth", "toJsonString", "toNumberBirthDateCollectionFormat", "toOCRBirthDateCollectionFormat", "toServerDateStringWithTimeZoneUTC", "toSmartCardFormat", "toStringFormat", "toStringFormatBuddhist", "toThaiFormat", "toThaiLongDateString", "toThaiShortMonthDateString", "validateConsentDateFormat", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.format.DateFormatExtKt */
/* loaded from: classes7.dex */
public final class DateFormatExtKt {
    @NotNull
    public static final Date addDayToDate(@NotNull Date date, int i) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "cal.time");
        return time;
    }

    @NotNull
    public static final String fromOcrToBeDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), false, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(\n           …           true\n        )");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String fromOcrToThaiDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(\n           …           true\n        )");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String fromOcrToThaiDateValidateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), false, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(\n           …           true\n        )");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String fromServerDateToThaiDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…DATE, Locale(\"th\"), true)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String fromSmartCardToThaiDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…DATE, Locale(\"th\"), true)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String getThaiDateOnlyDate(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return String.valueOf(calendar.get(5));
    }

    @NotNull
    public static final String getThaiDateShortMonth(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(2);
        int i2 = calendar.get(5);
        String str = LocalDateTimeExt.Companion.getMonthThList()[i];
        return i2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str;
    }

    @NotNull
    public static final String getThaiDateShortMonthYear(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(2);
        int i2 = calendar.get(5);
        String str = LocalDateTimeExt.Companion.getMonthThList()[i];
        String substring = String.valueOf(calendar.get(1) + 543).substring(2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return i2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + substring;
    }

    @NotNull
    public static final Date getToDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (length != 8) {
            if (length != 10) {
                if (length != 19) {
                    return new Date();
                }
                return toDate$default(str, "yyyy-MM-dd HH:mm:ss", null, 2, null);
            }
            return toDate$default(str, "yyyy-MM-dd", null, 2, null);
        }
        return toDate$default(str, "yyyyMMdd", null, 2, null);
    }

    @NotNull
    public static final String thaiDateSmartCardToDateFormatServer(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), z, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), z2);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…ocale(\"th\"), desBuddhist)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String thaiDateToDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, "dd/MM/yyyy", new Locale(LanguageSupport.LANG_TH), false);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…DAY, Locale(\"th\"), false)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String thaiDateToDateFormatServer(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), z, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), z2);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…ocale(\"th\"), desBuddhist)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String thaiDateToEngNumberDateSpaceFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, DateUtil.FORMAT_BIRTH_DAY_NUMBER, new Locale(LanguageSupport.LANG_TH), false);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…BER, Locale(\"th\"), false)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @NotNull
    public static final String thaiDateToThaiDateValidateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…DATE, Locale(\"th\"), true)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    @Nullable
    public static final BirthDayCollection toBirthDateCollectionFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String dateResult = DateUtil.convertDate(str, "yyyy-MM-dd", new Locale(LanguageSupport.LANG_TH), true, DateUtil.FORMAT_BIRTH_DAY_NUMBER, new Locale(LanguageSupport.LANG_TH), false);
            Intrinsics.checkNotNullExpressionValue(dateResult, "dateResult");
            List<String> split = new Regex(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).split(dateResult, 0);
            if (split.size() == 3) {
                return new BirthDayCollection(Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) split)), Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) CollectionsKt___CollectionsKt.take(split, 2))), Integer.parseInt((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) split)));
            }
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public static final Date toDate(@NotNull String str, @NotNull String format, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (StringExtKt.isNotEmpty(str)) {
            try {
                Date parse = new SimpleDateFormat(format, locale).parse(str);
                if (parse == null) {
                    return new Date();
                }
                return parse;
            } catch (ParseException unused) {
                return new Date();
            }
        }
        return new Date();
    }

    public static /* synthetic */ Date toDate$default(String str, String str2, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return toDate(str, str2, locale);
    }

    @NotNull
    public static final String toDateString(@NotNull Date date, @NotNull String format, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            String format2 = new SimpleDateFormat(format, locale).format(date);
            Intrinsics.checkNotNullExpressionValue(format2, "{\n        SimpleDateForm…ocale).format(this)\n    }");
            return format2;
        } catch (ParseException unused) {
            return "";
        }
    }

    public static /* synthetic */ String toDateString$default(Date date, String str, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH);
        }
        return toDateString(date, str, locale);
    }

    @NotNull
    public static final String toDateStringWithTimeZone(@NotNull Date date, @NotNull String format, @NotNull Locale locale, @NotNull String timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        String format2 = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(this)");
        return format2;
    }

    public static /* synthetic */ String toDateStringWithTimeZone$default(Date date, String str, Locale US, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
        }
        if ((i & 4) != 0) {
            str2 = "UTC";
        }
        return toDateStringWithTimeZone(date, str, US, str2);
    }

    @NotNull
    public static final String toDateWithMonth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + " เดือน";
    }

    @NotNull
    public static final String toJsonString(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return toDateString$default(date, "yyyy-MM-dd'T'HH:mm:ss'+0700'", (Locale) null, 2, (Object) null);
    }

    @Nullable
    public static final BirthDayCollection toNumberBirthDateCollectionFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String dateResult = DateUtil.convertDate(str, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, DateUtil.FORMAT_BIRTH_DAY_NUMBER, new Locale(LanguageSupport.LANG_TH), false);
            Intrinsics.checkNotNullExpressionValue(dateResult, "dateResult");
            List<String> split = new Regex(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).split(dateResult, 0);
            if (split.size() == 3) {
                return new BirthDayCollection(Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) split)), Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) CollectionsKt___CollectionsKt.take(split, 2))), Integer.parseInt((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) split)));
            }
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static final BirthDayCollection toOCRBirthDateCollectionFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String dateResult = DateUtil.convertDate(str, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true, DateUtil.FORMAT_BIRTH_DAY_NUMBER, new Locale(LanguageSupport.LANG_TH), false);
            Intrinsics.checkNotNullExpressionValue(dateResult, "dateResult");
            List<String> split = new Regex(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).split(dateResult, 0);
            if (split.size() == 3) {
                return new BirthDayCollection(Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) split)), Integer.parseInt((String) CollectionsKt___CollectionsKt.last((List<? extends Object>) CollectionsKt___CollectionsKt.take(split, 2))) - 1, Integer.parseInt((String) CollectionsKt___CollectionsKt.first((List<? extends Object>) split)));
            }
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public static final String toServerDateStringWithTimeZoneUTC(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return toDateStringWithTimeZone$default(date, "yyyy-MM-dd'T'HH:mm:ss'Z'", null, "UTC", 2, null);
    }

    @NotNull
    public static final String toSmartCardFormat(@NotNull BirthDayCollection birthDayCollection) {
        Intrinsics.checkNotNullParameter(birthDayCollection, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(birthDayCollection.getYear(), birthDayCollection.getMonth(), birthDayCollection.getDay());
        String format = new SimpleDateFormat("dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH)).format(calendar.getTime());
        try {
            String convertDate = DateUtil.convertDate(format, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), false, "yyyyMMdd", new Locale(LanguageSupport.LANG_TH), true);
            Intrinsics.checkNotNullExpressionValue(convertDate, "{\n        DateUtil.conve…Locale(\"th\"), true)\n    }");
            return convertDate;
        } catch (ParseException unused) {
            Intrinsics.checkNotNullExpressionValue(format, "{\n        acDateFormat\n    }");
            return format;
        }
    }

    @Nullable
    public static final String toStringFormat(@NotNull BirthDayCollection birthDayCollection) {
        Intrinsics.checkNotNullParameter(birthDayCollection, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(birthDayCollection.getYear(), birthDayCollection.getMonth(), birthDayCollection.getDay());
        String format = new SimpleDateFormat("dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH)).format(calendar.getTime());
        try {
            return DateUtil.convertDate(format, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), false, "dd/MM/yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException unused) {
            return format;
        }
    }

    @Nullable
    public static final String toStringFormatBuddhist(@NotNull BirthDayCollection birthDayCollection) {
        Intrinsics.checkNotNullParameter(birthDayCollection, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(birthDayCollection.getYear(), birthDayCollection.getMonth(), birthDayCollection.getDay());
        String format = new SimpleDateFormat("dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH)).format(calendar.getTime());
        try {
            return DateUtil.convertDate(format, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true, "dd/MM/yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException unused) {
            return format;
        }
    }

    @Nullable
    public static final String toThaiFormat(@NotNull BirthDayCollection birthDayCollection) {
        Intrinsics.checkNotNullParameter(birthDayCollection, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(birthDayCollection.getYear(), birthDayCollection.getMonth(), birthDayCollection.getDay());
        String format = new SimpleDateFormat("dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH)).format(calendar.getTime());
        try {
            return DateUtil.convertDate(format, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), false, "dd MMMM yyyy", new Locale(LanguageSupport.LANG_TH), true);
        } catch (ParseException unused) {
            return format;
        }
    }

    @NotNull
    public static final String toThaiLongDateString(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        int i = calendar.get(5);
        String str = LocalDateTimeExt.Companion.getFullMonthThList()[calendar.get(2)];
        return i + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + (calendar.get(1) + 543);
    }

    @NotNull
    public static final String toThaiShortMonthDateString(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        int i = calendar.get(5);
        String str = LocalDateTimeExt.Companion.getMonthThList()[calendar.get(2)];
        return i + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + (calendar.get(1) + 543);
    }

    @NotNull
    public static final String validateConsentDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            String convertDate = DateUtil.convertDate(str, DateUtil.FORMAT_NEW_DATE, new Locale(LanguageSupport.LANG_EN), false, DateUtil.FORMAT_DATE_VALIDATE_CONSENT, new Locale(LanguageSupport.LANG_EN), false);
            Intrinsics.checkNotNullExpressionValue(convertDate, "convertDate(this, DateUt…ENT, Locale(\"en\"), false)");
            return convertDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static /* synthetic */ String toDateString$default(Calendar calendar, String str, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH);
        }
        return toDateString(calendar, str, locale);
    }

    @NotNull
    public static final String toDateString(@NotNull Calendar calendar, @NotNull String format, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            String format2 = new SimpleDateFormat(format, locale).format(calendar.getTime());
            Intrinsics.checkNotNullExpressionValue(format2, "{\n        SimpleDateForm…).format(this.time)\n    }");
            return format2;
        } catch (ParseException unused) {
            return "";
        }
    }
}