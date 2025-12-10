package th.p047co.dtac.android.dtacone.util.format;

import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.util.format.PhoneNumberFormat */
/* loaded from: classes8.dex */
public class PhoneNumberFormat {

    /* renamed from: th.co.dtac.android.dtacone.util.format.PhoneNumberFormat$COUNTRY_CALLING_CODE */
    /* loaded from: classes8.dex */
    public enum COUNTRY_CALLING_CODE {
        THAILAND("66", 11, 14, "0", 10, 13);
        
        public final String INTERNATIONAL_CALLING_CODE;
        public final int INTERNATIONAL_CALLING_CODE_MAXIMUM_LENGTH;
        public final int INTERNATIONAL_CALLING_CODE_MINIMUM_LENGTH;
        public final String LOCAL_CALLING_CODE;
        public final int LOCAL_CALLING_CODE_MAXIMUM_LENGTH;
        public final int LOCAL_CALLING_CODE_MINIMUM_LENGTH;

        COUNTRY_CALLING_CODE(String str, int i, int i2, String str2, int i3, int i4) {
            this.INTERNATIONAL_CALLING_CODE = str;
            this.INTERNATIONAL_CALLING_CODE_MINIMUM_LENGTH = i;
            this.INTERNATIONAL_CALLING_CODE_MAXIMUM_LENGTH = i2;
            this.LOCAL_CALLING_CODE = str2;
            this.LOCAL_CALLING_CODE_MINIMUM_LENGTH = i3;
            this.LOCAL_CALLING_CODE_MAXIMUM_LENGTH = i4;
        }
    }

    public static boolean isBeginWithCountryCode(String str) {
        for (COUNTRY_CALLING_CODE country_calling_code : COUNTRY_CALLING_CODE.values()) {
            if (str.startsWith(String.valueOf(country_calling_code.INTERNATIONAL_CALLING_CODE))) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence removeAllSpecialCharacter(CharSequence charSequence) {
        return removeAllSpecialCharacter(charSequence.toString());
    }

    public static String removeDashCharacter(String str) {
        if (!StringUtil.hasText(str)) {
            return "";
        }
        if (str.contains(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            return str.replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "");
        }
        return str;
    }

    public static String toInternationalNumberFormat(String str, COUNTRY_CALLING_CODE country_calling_code) {
        if (str.contains(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            str = removeAllSpecialCharacter(str);
        }
        if (!str.startsWith(country_calling_code.LOCAL_CALLING_CODE)) {
            return str;
        }
        String substring = str.substring(1, str.length());
        return country_calling_code.INTERNATIONAL_CALLING_CODE + substring;
    }

    public static String toLocalNumberFormat(String str, COUNTRY_CALLING_CODE country_calling_code) {
        if (str == null) {
            return "";
        }
        if (str.startsWith(COUNTRY_CALLING_CODE.THAILAND.INTERNATIONAL_CALLING_CODE)) {
            return country_calling_code.LOCAL_CALLING_CODE + str.substring(2, str.length());
        }
        return str;
    }

    public static String toLocalNumberWithPrettyFormat(String str, COUNTRY_CALLING_CODE country_calling_code) {
        if (str.equalsIgnoreCase(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            return str;
        }
        String localNumberFormat = toLocalNumberFormat(removeAllSpecialCharacter(str), country_calling_code);
        int length = localNumberFormat.length();
        if (length > 2) {
            String substring = localNumberFormat.substring(0, 3);
            if (length > 3) {
                String str2 = substring + HelpFormatter.DEFAULT_OPT_PREFIX;
                if (length > 6) {
                    return ((str2 + localNumberFormat.substring(3, 6)) + HelpFormatter.DEFAULT_OPT_PREFIX) + localNumberFormat.substring(6, length);
                }
                return str2 + localNumberFormat.substring(3, length);
            }
            return substring;
        }
        return localNumberFormat;
    }

    public static String removeAllSpecialCharacter(String str) {
        return StringUtil.hasText(str) ? str.replaceAll("[^\\d]", "") : "";
    }
}