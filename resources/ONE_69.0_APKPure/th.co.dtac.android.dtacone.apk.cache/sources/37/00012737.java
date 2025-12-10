package th.p047co.dtac.android.dtacone.util.format;

import com.google.firebase.crashlytics.internal.common.IdManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* renamed from: th.co.dtac.android.dtacone.util.format.MoneyFormat */
/* loaded from: classes8.dex */
public class MoneyFormat {

    /* renamed from: a */
    public static final DecimalFormat f87156a = new DecimalFormat("#,##0.##");

    /* renamed from: b */
    public static DecimalFormat f87157b = new DecimalFormat("#,###,##0.00;- #");

    /* renamed from: c */
    public static DecimalFormat f87158c = new DecimalFormat("#,###;- #");

    /* renamed from: d */
    public static DecimalFormat f87159d = new DecimalFormat("#,###");

    /* renamed from: a */
    public static String m16761a(double d, DecimalFormat decimalFormat) {
        if (d == 0.0d) {
            return decimalFormat.format(0L);
        }
        return decimalFormat.format(d);
    }

    /* renamed from: b */
    public static String m16760b(BigDecimal bigDecimal, DecimalFormat decimalFormat) {
        if (bigDecimal.equals(new BigDecimal("0"))) {
            return decimalFormat.format(0L);
        }
        return decimalFormat.format(bigDecimal);
    }

    public static String convertToFormatMoneyWithoutTrailingZeroes(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                return f87156a.format(AbstractC21688ph0.m23780a(new BigDecimal(str.replace(",", "").trim())));
            } catch (NumberFormatException unused) {
                return "NaN";
            }
        }
        return "0";
    }

    public static String convertToMoneyFormat(double d) {
        return m16761a(d, f87157b);
    }

    public static String convertToMoneyFormatNoFloating(double d) {
        return m16761a(d, f87158c);
    }

    public static String convertToMoneyFormatNoFloatingPureNumber(double d) {
        return m16761a(d, f87159d);
    }

    public static String convertToMoneyFormatWithBigDecimal(String str) {
        if (str != null) {
            if (!str.contains(",")) {
                try {
                    return m16760b(new BigDecimal(str), f87157b);
                } catch (NumberFormatException unused) {
                    return "NaN";
                }
            }
            return str;
        }
        return "0.00";
    }

    public static String covertToMoney(float f) {
        String str = "" + f;
        if (str.endsWith(".0")) {
            if (str.equals(IdManager.DEFAULT_VERSION_NAME)) {
                return "0";
            }
            return str.substring(0, str.length() - 2);
        }
        return str;
    }

    public static String convertToMoneyFormat(String str) {
        if (str != null) {
            if (str.contains(",")) {
                return str;
            }
            try {
                return m16761a(Float.parseFloat(str), f87157b);
            } catch (NumberFormatException unused) {
                return "NaN";
            }
        }
        return "0.00";
    }
}