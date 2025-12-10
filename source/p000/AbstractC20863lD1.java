package p000;

import java.nio.CharBuffer;
import java.text.Normalizer;
import org.apache.http.message.TokenParser;

/* renamed from: lD1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20863lD1 {
    /* renamed from: a */
    public static boolean m26552a(char c) {
        if ((c >= 0 && c <= 31) || c == 127) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26551b(int i) {
        if (i != 832 && i != 833 && i != 8206 && i != 8207 && i != 8234 && i != 8235 && i != 8236 && i != 8237 && i != 8238 && i != 8298 && i != 8299 && i != 8300 && i != 8301 && i != 8302 && i != 8303) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m26550c(int i) {
        if (12272 <= i && i <= 12283) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m26549d(int i) {
        if (i != 65529 && i != 65530 && i != 65531 && i != 65532 && i != 65533) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m26548e(char c) {
        if (c != 173 && c != 847 && c != 6150 && c != 6155 && c != 6156 && c != 6157 && c != 8203 && c != 8204 && c != 8205 && c != 8288 && ((65024 > c || c > 65039) && c != 65279)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m26547f(int i) {
        if ((128 > i || i > 159) && i != 1757 && i != 1807 && i != 6158 && i != 8204 && i != 8205 && i != 8232 && i != 8233 && i != 8288 && i != 8289 && i != 8290 && i != 8291 && ((8298 > i || i > 8303) && i != 65279 && ((65529 > i || i > 65532) && (119155 > i || i > 119162)))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m26546g(char c) {
        if (c != 160 && c != 5760 && ((8192 > c || c > 8203) && c != 8239 && c != 8287 && c != 12288)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m26545h(int i) {
        if ((64976 <= i && i <= 65007) || ((65534 <= i && i <= 65535) || ((131070 <= i && i <= 131071) || ((196606 <= i && i <= 196607) || ((262142 <= i && i <= 262143) || ((327678 <= i && i <= 327679) || ((393214 <= i && i <= 393215) || ((458750 <= i && i <= 458751) || ((524286 <= i && i <= 524287) || ((589822 <= i && i <= 589823) || ((655358 <= i && i <= 655359) || ((720894 <= i && i <= 720895) || ((786430 <= i && i <= 786431) || ((851966 <= i && i <= 851967) || ((917502 <= i && i <= 917503) || ((983038 <= i && i <= 983039) || ((1048574 <= i && i <= 1048575) || (1114110 <= i && i <= 1114111)))))))))))))))))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m26544i(int i) {
        if ((57344 <= i && i <= 63743) || ((983040 <= i && i <= 1048573) || (1048576 <= i && i <= 1114109))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m26543j(int i) {
        char c = (char) i;
        if (!m26546g(c) && !m26552a(c) && !m26547f(i) && !m26544i(i) && !m26545h(i) && !m26539n(i) && !m26549d(i) && !m26550c(i) && !m26551b(i) && !m26538o(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static String m26542k(String str, boolean z) {
        boolean z2;
        boolean z3;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (m26546g(str.charAt(i))) {
                charArray[i] = TokenParser.f74560SP;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char c = charArray[i3];
            if (!m26548e(c)) {
                charArray[i2] = c;
                i2++;
            }
        }
        String normalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i2), Normalizer.Form.NFKC);
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (i4 < normalize.length()) {
            int codePointAt = normalize.codePointAt(i4);
            if (!m26543j(codePointAt)) {
                byte directionality = Character.getDirectionality(codePointAt);
                boolean z7 = true;
                if (directionality != 1 && directionality != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z4 |= z2;
                if (directionality == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z5 |= z3;
                z6 |= (i4 == 0 && z2) ? false : false;
                if (!z && !Character.isDefined(codePointAt)) {
                    throw new IllegalArgumentException("Character at position " + i4 + " is unassigned");
                }
                i4 += Character.charCount(codePointAt);
                if (z6 && i4 >= normalize.length() && !z2) {
                    throw new IllegalArgumentException("First character is RandALCat, but last character is not");
                }
            } else {
                throw new IllegalArgumentException("Prohibited character " + codePointAt + " at position " + i4);
            }
        }
        if (z4 && z5) {
            throw new IllegalArgumentException("Contains both RandALCat characters and LCat characters");
        }
        return normalize;
    }

    /* renamed from: l */
    public static String m26541l(String str) {
        return m26542k(str, true);
    }

    /* renamed from: m */
    public static String m26540m(String str) {
        return m26542k(str, false);
    }

    /* renamed from: n */
    public static boolean m26539n(int i) {
        if (55296 <= i && i <= 57343) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m26538o(int i) {
        if (i != 917505 && (917536 > i || i > 917631)) {
            return false;
        }
        return true;
    }
}
