package p000;

import java.util.Locale;
import org.apache.commons.codec.StringEncoder;

/* renamed from: tK1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC22260tK1 {
    /* renamed from: a */
    public static String m22459a(String str) {
        if (m22456d(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isLetter(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        if (i == length) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        return new String(cArr, 0, i).toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: b */
    public static int m22458b(StringEncoder stringEncoder, String str, String str2) {
        return m22457c(stringEncoder.encode(str), stringEncoder.encode(str2));
    }

    /* renamed from: c */
    public static int m22457c(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (str.charAt(i2) == str2.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static boolean m22456d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }
}
