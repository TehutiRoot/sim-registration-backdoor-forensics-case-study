package th.p047co.dtac.android.dtacone.extension.format;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.mobsandgeeks.saripaar.DateFormats;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC12026a;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.format.BankAccountFormat;
import th.p047co.dtac.android.dtacone.util.p052enum.PackageType;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m28851d1 = {"\u0000j\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0001\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0001\u001a*\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0005\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\u001a$\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u001a\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0001\u001a\u001a\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u001e\u001a\u00020\u0001*\u00020\u0001\u001a\u001a\u0010\u001e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\n\u0010\u001f\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010 \u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010!\u001a\u00020\u0001*\u00020\u0001\u001a\u0015\u0010\"\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0086\u0004\u001a\u0014\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020%\u001a\f\u0010&\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u001a\u0010'\u001a\u00020(*\u00020)2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001\u001a9\u0010,\u001a\u00020(*\u00020)2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u000103¢\u0006\u0002\u00104\u001a\n\u00105\u001a\u00020\u0001*\u00020\u0001\u001a\n\u00106\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000108\u001a\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000108\u001a\f\u0010;\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u0012\u0010<\u001a\u00020\u0005*\u00020\u00012\u0006\u00109\u001a\u00020\u0005\u001a\f\u0010=\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010>\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010?\u001a\u00020\u0001*\u00020@\u001a\u000e\u0010A\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010B\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010C\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u0016\u0010D\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010E\u001a\u00020F\u001a\u0016\u0010G\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010H\u001a\u00020F\u001a\u0016\u0010I\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010H\u001a\u00020F\u001a\f\u0010J\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\n\u0010K\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010L\u001a\u000203*\u00020\u00012\u0006\u00109\u001a\u000203\u001a\n\u0010M\u001a\u00020\u0001*\u000203\u001a\n\u0010M\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010N\u001a\u00020O*\u00020\u0001\u001a\n\u0010P\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010Q\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010R\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010S\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010T\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010U\u001a\u00020\u0001*\u00020\u0001¨\u0006V"}, m28850d2 = {"convertDateTime", "", "date", "srcFormat", "srcBuddhist", "", "desFormat", "desBuddhist", ImagesContract.LOCAL, "Ljava/util/Locale;", "byteArrayFromHexString", "", "checkExpiryDate", "checkExpiryDateFormat", "convertDateTH", "convertToGregorianDateFromThai", "convertToStandardDate", "formatMessageWithSubscriber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "formatMessageWithSubscriberAndPackage", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "formatMoney", "formatMoneyNoDecimal", "formatMoneyWithDecimal", "formatServerDate", "format", "formatServerDateWithDefault", "defaultDate", "formatServerDateWithDefaultTime", "formatServerDateWithDefaultTimeWithOutZ", "formatServerDateWithDefaultTimeWithZ", "isNotEmpty", "maskStarTextAndTakeLastFour", "maskSubscriberNumberSixDigit", "maskText", "numberOnly", "regex", "Lkotlin/text/Regex;", "oneToBankAccountNumber", "setFontSize", "", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "valueString", "unitString", "setSpanText", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "fullText", "keywordList", "Ljava/util/ArrayList;", TypedValues.Custom.S_COLOR, "", "(Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;)V", "subscriberToPrefix0", "subscriberToPrefix66", "toArrayByGsonOrDefault", "", "default", "toArrayOrDefault", "toBankAccountNumber", "toBooleanOrDefault", "toCheckEmptyAndDisplayDash", "toCheckEmptyToDisplayKhun", "toClassName", "Landroidx/fragment/app/Fragment;", "toDefaultNull", "toDisplayDash", "toDisplayEmpty", "toIdCardFormat", "mark", "", "toIdCardFormatX", "separator", "toIdCardXFormat", "toIdCardXNotWhiteSpaceFormat", "toIdPictureFormat", "toIntOrDefault", "toJpg", "toPackageType", "Lth/co/dtac/android/dtacone/util/enum/PackageType;", "toRemoveAllSpecialCharacter", "toRemoveComma", "toRemoveDash", "toRemoveJpg", "toRemoveWhiteSpace", "toReplaceSpace", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nStringExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExt.kt\nth/co/dtac/android/dtacone/extension/format/StringExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,461:1\n1#2:462\n980#3:463\n1011#3,4:464\n980#3:468\n1011#3,4:469\n980#3:473\n1011#3,4:474\n1549#4:478\n1620#4,3:479\n1864#4,3:482\n*S KotlinDebug\n*F\n+ 1 StringExt.kt\nth/co/dtac/android/dtacone/extension/format/StringExtKt\n*L\n71#1:463\n71#1:464,4\n81#1:468\n81#1:469,4\n91#1:473\n91#1:474,4\n145#1:478\n145#1:479,3\n446#1:482,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.format.StringExtKt */
/* loaded from: classes7.dex */
public final class StringExtKt {
    @NotNull
    public static final byte[] byteArrayFromHexString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List<String> chunked = StringsKt___StringsKt.chunked(str, 2);
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(chunked, 10));
        for (String str2 : chunked) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, AbstractC12026a.checkRadix(16))));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    @NotNull
    public static final String checkExpiryDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, Constant.SMART_CARD_EXPIRE_DATE)) {
            return Constant.DEFAULT_EXPIRE_DATE;
        }
        return str;
    }

    @NotNull
    public static final String checkExpiryDateFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, Constant.SMART_CARD_EXPIRE_DATE)) {
            return "9999-01-01";
        }
        return formatServerDate$default(str, null, 1, null);
    }

    @NotNull
    public static final String convertDateTH(@NotNull String str, @NotNull String srcFormat, boolean z, @NotNull String desFormat, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(srcFormat, "srcFormat");
        Intrinsics.checkNotNullParameter(desFormat, "desFormat");
        return convertDateTime(str, srcFormat, z, desFormat, z2, new Locale(LanguageSupport.LANG_TH));
    }

    @NotNull
    public static final String convertDateTime(@NotNull String date, @NotNull String srcFormat, boolean z, @NotNull String desFormat, boolean z2, @NotNull Locale local) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(srcFormat, "srcFormat");
        Intrinsics.checkNotNullParameter(desFormat, "desFormat");
        Intrinsics.checkNotNullParameter(local, "local");
        if (isNotEmpty(date)) {
            Date parse = new SimpleDateFormat(srcFormat, local).parse(date);
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
            String format = new SimpleDateFormat(desFormat, local).format(parse);
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(desFormat, local).format(srcDate)");
            return format;
        }
        return "";
    }

    @NotNull
    public static final String convertToGregorianDateFromThai(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return convertDateTime(str, DateUtil.FORMAT_DISPLAY_DATE, true, "yyyyMMdd", false, new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60295TH));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Nullable
    public static final String convertToStandardDate(@NotNull String str, boolean z, @NotNull String desFormat, boolean z2) {
        SimpleDateFormat simpleDateFormat;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(desFormat, "desFormat");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"yyyy-MM-dd", "dd/MM/yyyy", DateFormats.MDY, DateStringFormat.FORMAT_IDCARD_DISPLAY_DATE_TH, "yyyyMMdd", "dd.MM.yyyy", "MMM dd, yyyy", DateFormats.DMY})) {
            try {
                simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
                simpleDateFormat.setLenient(false);
            } catch (ParseException unused) {
            }
            if (simpleDateFormat.parse(str) != null) {
                return convertDateTime(str, str2, z, desFormat, z2, new Locale(LanguageSupport.LANG_TH));
            }
            continue;
        }
        return null;
    }

    @NotNull
    public static final String formatMessageWithSubscriber(@NotNull String str, @NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        return AbstractC20204hN1.replace$default(str, "{{subr}}", "<font color=#00ACE8>" + subscriberNumber + "</font>", false, 4, (Object) null);
    }

    @NotNull
    public static final String formatMessageWithSubscriberAndPackage(@NotNull String str, @NotNull String subscriberNumber, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String replace$default = AbstractC20204hN1.replace$default(str, "{{subr}}", "<font color=#00ACE7>" + subscriberNumber + "</font>", false, 4, (Object) null);
        return AbstractC20204hN1.replace$default(replace$default, "{{package}}", "<font color=#00ACE7>" + packageName + "</font>", false, 4, (Object) null);
    }

    @NotNull
    public static final String formatMoney(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        BigDecimal bigDecimalOrNull = AbstractC19860fN1.toBigDecimalOrNull(str);
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalOrNull, "valueOf(...)");
        }
        String format = decimalFormat.format(bigDecimalOrNull);
        Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"#,##0.##\"…ll() ?: 0.toBigDecimal())");
        return format;
    }

    @NotNull
    public static final String formatMoneyNoDecimal(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Long longOrNull = AbstractC20032gN1.toLongOrNull(str);
        if (longOrNull != null) {
            str2 = new DecimalFormat("#,###").format(longOrNull.longValue());
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @NotNull
    public static final String formatMoneyWithDecimal(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        BigDecimal bigDecimalOrNull = AbstractC19860fN1.toBigDecimalOrNull(AbstractC20204hN1.replace$default(str, ",", "", false, 4, (Object) null));
        if (bigDecimalOrNull != null) {
            str2 = new DecimalFormat("#,##0.00;(#)").format(bigDecimalOrNull);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @NotNull
    public static final String formatServerDate(@NotNull String str, @NotNull String format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return convertDateTH(str, "yyyyMMdd", true, format, false);
    }

    public static /* synthetic */ String formatServerDate$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        return formatServerDate(str, str2);
    }

    @NotNull
    public static final String formatServerDateWithDefault(@Nullable String str, @NotNull String defaultDate) {
        Intrinsics.checkNotNullParameter(defaultDate, "defaultDate");
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, Constant.SMART_CARD_EXPIRE_DATE)) {
            return convertDateTH(str, "yyyyMMdd", true, "yyyy-MM-dd", false);
        }
        return convertDateTH(defaultDate, "yyyyMMdd", false, "yyyy-MM-dd", false);
    }

    @NotNull
    public static final String formatServerDateWithDefaultTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertDateTH = convertDateTH(str, "yyyyMMdd", true, "yyyy-MM-dd", false);
        return convertDateTH + "T00:00:00+0700";
    }

    @NotNull
    public static final String formatServerDateWithDefaultTimeWithOutZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertDateTH = convertDateTH(str, "yyyyMMdd", true, "yyyy-MM-dd", false);
        return convertDateTH + "T00:00:00";
    }

    @NotNull
    public static final String formatServerDateWithDefaultTimeWithZ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertDateTH = convertDateTH(str, "yyyyMMdd", true, "yyyy-MM-dd", false);
        return convertDateTH + "T00:00:00Z";
    }

    public static final boolean isNotEmpty(@NotNull String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @NotNull
    public static final String maskStarTextAndTakeLastFour(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() >= 4) {
            String repeat = AbstractC20204hN1.repeat(Marker.ANY_MARKER, str.length() - 4);
            String takeLast = StringsKt___StringsKt.takeLast(str, 4);
            return repeat + takeLast;
        }
        return str;
    }

    @NotNull
    public static final String maskSubscriberNumberSixDigit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 12 && AbstractC20204hN1.startsWith$default(str, "0", false, 2, null)) {
            String repeat = AbstractC20204hN1.repeat("X", 3);
            String repeat2 = AbstractC20204hN1.repeat("X", 3);
            String takeLast = StringsKt___StringsKt.takeLast(str, 4);
            return repeat + HelpFormatter.DEFAULT_OPT_PREFIX + repeat2 + HelpFormatter.DEFAULT_OPT_PREFIX + takeLast;
        }
        return str;
    }

    @NotNull
    public static final String maskText(@NotNull String str, @NotNull String format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TextFormatter(format).maskText(str);
    }

    @NotNull
    public static final String numberOnly(@NotNull String str, @NotNull Regex regex) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.replace(StringsKt__StringsKt.trim(str).toString(), "");
    }

    public static /* synthetic */ String numberOnly$default(String str, Regex regex, int i, Object obj) {
        if ((i & 1) != 0) {
            regex = new Regex("[^0-9 ]");
        }
        return numberOnly(str, regex);
    }

    @NotNull
    public static final String oneToBankAccountNumber(@Nullable String str) {
        if (str != null) {
            return new BankAccountFormat().oneConvertToBankAccount(str);
        }
        return "";
    }

    public static final void setFontSize(@NotNull DtacFontTextView dtacFontTextView, @NotNull String valueString, @NotNull String unitString) {
        Intrinsics.checkNotNullParameter(dtacFontTextView, "<this>");
        Intrinsics.checkNotNullParameter(valueString, "valueString");
        Intrinsics.checkNotNullParameter(unitString, "unitString");
        SpannableString spannableString = new SpannableString(valueString + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + unitString);
        spannableString.setSpan(new RelativeSizeSpan(1.4f), 0, valueString.length(), 33);
        dtacFontTextView.setText(spannableString);
    }

    public static final void setSpanText(@NotNull DtacFontTextView dtacFontTextView, @NotNull Context context, @NotNull String fullText, @NotNull ArrayList<String> keywordList, @Nullable Integer num) {
        int i;
        Intrinsics.checkNotNullParameter(dtacFontTextView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(keywordList, "keywordList");
        SpannableString spannableString = new SpannableString(fullText);
        int i2 = 0;
        for (Object obj : keywordList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            int i4 = -1;
            while (true) {
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) fullText, str, i4 + 1, false, 4, (Object) null);
                if (indexOf$default != -1) {
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = R.color.colorBlue;
                    }
                    spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i)), indexOf$default, str.length() + indexOf$default, 33);
                    i4 = indexOf$default + 1;
                }
            }
            i2 = i3;
        }
        dtacFontTextView.setText(spannableString);
    }

    public static /* synthetic */ void setSpanText$default(DtacFontTextView dtacFontTextView, Context context, String str, ArrayList arrayList, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = Integer.valueOf(R.color.colorBlue);
        }
        setSpanText(dtacFontTextView, context, str, arrayList, num);
    }

    @NotNull
    public static final String subscriberToPrefix0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 11 && AbstractC20204hN1.startsWith$default(str, "66", false, 2, null)) {
            return AbstractC20204hN1.replaceFirst$default(str, "66", "0", false, 4, (Object) null);
        }
        return str;
    }

    @NotNull
    public static final String subscriberToPrefix66(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 10 && AbstractC20204hN1.startsWith$default(str, "0", false, 2, null)) {
            return AbstractC20204hN1.replaceFirst$default(str, "0", "66", false, 4, (Object) null);
        }
        return str;
    }

    @NotNull
    public static final List<String> toArrayByGsonOrDefault(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(list, "default");
        if (isNotEmpty(str)) {
            try {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) String[].class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(this, Array<String>::class.java)");
                return ArraysKt___ArraysKt.toList((Object[]) fromJson);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @NotNull
    public static final List<String> toArrayOrDefault(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(list, "default");
        if (isNotEmpty(str)) {
            try {
                return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @NotNull
    public static final String toBankAccountNumber(@Nullable String str) {
        if (str != null) {
            return new BankAccountFormat().convertToBankAccount(str);
        }
        return "";
    }

    public static final boolean toBooleanOrDefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (isNotEmpty(str)) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    @NotNull
    public static final String toCheckEmptyAndDisplayDash(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        return str;
    }

    @NotNull
    public static final String toCheckEmptyToDisplayKhun(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "คุณ";
        }
        return str;
    }

    @NotNull
    public static final String toClassName(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    @Nullable
    public static final String toDefaultNull(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    @NotNull
    public static final String toDisplayDash(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return str.toString();
        }
        return HelpFormatter.DEFAULT_OPT_PREFIX;
    }

    @NotNull
    public static final String toDisplayEmpty(@Nullable String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public static final String toIdCardFormat(@Nullable String str, char c) {
        StringBuilder sb;
        int i;
        if (str != null) {
            sb = new StringBuilder(str);
        } else {
            sb = null;
        }
        if (sb != null) {
            i = sb.length();
        } else {
            i = 0;
        }
        if (i == 13) {
            if (sb != null) {
                sb.insert(12, c);
            }
            if (sb != null) {
                sb.insert(10, c);
            }
            if (sb != null) {
                sb.insert(5, c);
            }
            if (sb != null) {
                sb.insert(1, c);
            }
        }
        return String.valueOf(sb);
    }

    public static /* synthetic */ String toIdCardFormat$default(String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = TokenParser.f74560SP;
        }
        return toIdCardFormat(str, c);
    }

    @NotNull
    public static final String toIdCardFormatX(@Nullable String str, char c) {
        String str2;
        String removeSpecialChar;
        if (str != null && (removeSpecialChar = PhoneNumberExtKt.toRemoveSpecialChar(str)) != null) {
            ArrayList arrayList = new ArrayList(removeSpecialChar.length());
            int i = 0;
            int i2 = 0;
            while (i < removeSpecialChar.length()) {
                char charAt = removeSpecialChar.charAt(i);
                int i3 = i2 + 1;
                if (i2 <= 8) {
                    charAt = 'X';
                }
                arrayList.add(Character.valueOf(charAt));
                i++;
                i2 = i3;
            }
            str2 = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        } else {
            str2 = null;
        }
        return toIdCardFormat(str2, c);
    }

    public static /* synthetic */ String toIdCardFormatX$default(String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = TokenParser.f74560SP;
        }
        return toIdCardFormatX(str, c);
    }

    @NotNull
    public static final String toIdCardXFormat(@Nullable String str, char c) {
        String str2;
        String removeSpecialChar;
        if (str != null && (removeSpecialChar = PhoneNumberExtKt.toRemoveSpecialChar(str)) != null) {
            ArrayList arrayList = new ArrayList(removeSpecialChar.length());
            int i = 0;
            int i2 = 0;
            while (i < removeSpecialChar.length()) {
                char charAt = removeSpecialChar.charAt(i);
                int i3 = i2 + 1;
                if (i2 <= 7) {
                    charAt = 'X';
                }
                arrayList.add(Character.valueOf(charAt));
                i++;
                i2 = i3;
            }
            str2 = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        } else {
            str2 = null;
        }
        return toIdCardFormat(str2, c);
    }

    public static /* synthetic */ String toIdCardXFormat$default(String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = TokenParser.f74560SP;
        }
        return toIdCardXFormat(str, c);
    }

    @NotNull
    public static final String toIdCardXNotWhiteSpaceFormat(@Nullable String str) {
        String str2;
        String removeSpecialChar;
        if (str != null && (removeSpecialChar = PhoneNumberExtKt.toRemoveSpecialChar(str)) != null) {
            ArrayList arrayList = new ArrayList(removeSpecialChar.length());
            int i = 0;
            int i2 = 0;
            while (i < removeSpecialChar.length()) {
                char charAt = removeSpecialChar.charAt(i);
                int i3 = i2 + 1;
                if (i2 <= 7) {
                    charAt = 'X';
                }
                arrayList.add(Character.valueOf(charAt));
                i++;
                i2 = i3;
            }
            str2 = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        } else {
            str2 = null;
        }
        return String.valueOf(str2);
    }

    @NotNull
    public static final String toIdPictureFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() == 14) {
            sb.insert(6, '-');
            sb.insert(4, '-');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "text.toString()");
        return sb2;
    }

    public static final int toIntOrDefault(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (isNotEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @NotNull
    public static final String toJpg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (AbstractC20204hN1.endsWith$default(str, BitmapUtil.IMAGE_JPG_EXTENSION, false, 2, null)) {
            return str;
        }
        return str + BitmapUtil.IMAGE_JPG_EXTENSION;
    }

    @NotNull
    public static final PackageType toPackageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "10")) {
            return PackageType.MainPackage;
        }
        return PackageType.AddtionalPackage;
    }

    @NotNull
    public static final String toRemoveAllSpecialCharacter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("[^A-Za-z0-9ก-๙]").replace(str, "");
    }

    @NotNull
    public static final String toRemoveComma(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AbstractC20204hN1.replace$default(str, ",", "", false, 4, (Object) null);
    }

    @NotNull
    public static final String toRemoveDash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("[-]").replace(str, "");
    }

    @NotNull
    public static final String toRemoveJpg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (AbstractC20204hN1.endsWith$default(str, BitmapUtil.IMAGE_JPG_EXTENSION, false, 2, null)) {
            return (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{BitmapUtil.IMAGE_JPG_EXTENSION}, false, 0, 6, (Object) null).get(0);
        }
        return str;
    }

    @NotNull
    public static final String toRemoveWhiteSpace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("\\s+").replace(str, "");
    }

    @NotNull
    public static final String toReplaceSpace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AbstractC20204hN1.replace$default(str, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "", false, 4, (Object) null);
    }

    @NotNull
    public static final String formatServerDateWithDefaultTime(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertDateTH = convertDateTH(str, "yyyyMMdd", z, "yyyy-MM-dd", z2);
        return convertDateTH + "T00:00:00+0700";
    }

    @NotNull
    public static final String formatServerDateWithDefaultTimeWithZ(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String convertDateTH = convertDateTH(str, "yyyyMMdd", z, "yyyy-MM-dd", z2);
        return convertDateTH + "T00:00:00Z";
    }

    @NotNull
    public static final String toJpg(int i) {
        return toJpg(String.valueOf(i));
    }
}
