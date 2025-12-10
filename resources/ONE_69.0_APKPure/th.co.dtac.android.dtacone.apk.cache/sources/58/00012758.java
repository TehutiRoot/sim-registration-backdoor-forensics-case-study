package th.p047co.dtac.android.dtacone.util.string;

/* renamed from: th.co.dtac.android.dtacone.util.string.StringUtil */
/* loaded from: classes8.dex */
public class StringUtil {
    public static boolean hasLength(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public static boolean hasText(CharSequence charSequence) {
        if (hasLength(charSequence)) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isEmpty(Object obj) {
        if (obj != null && !"".equals(obj)) {
            return false;
        }
        return true;
    }

    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }
}