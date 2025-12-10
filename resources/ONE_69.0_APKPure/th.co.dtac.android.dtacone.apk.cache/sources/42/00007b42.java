package co.omise.android;

import co.omise.android.models.CardBrand;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public final class CardNumber {
    public static CardBrand brand(String str) {
        CardBrand[] cardBrandArr;
        String normalize = normalize(str);
        for (CardBrand cardBrand : CardBrand.ALL) {
            if (cardBrand.match(normalize)) {
                return cardBrand;
            }
        }
        return null;
    }

    public static String format(String str) {
        char[] charArray;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ('0' <= c && c <= '9') {
                if ((sb.length() - 4) % 5 == 0) {
                    sb.append(TokenParser.f74644SP);
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean luhn(String str) {
        char[] charArray = normalize(str).toCharArray();
        int length = charArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < charArray.length; i++) {
            iArr[i] = charArray[i] - '0';
        }
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            i2 += iArr[i3];
        }
        int i4 = 0;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int i6 = iArr[i5];
            i4 += i6 * 2;
            if (i6 > 4) {
                i4 -= 9;
            }
        }
        if ((i2 + i4) % 10 != 0) {
            return false;
        }
        return true;
    }

    public static String normalize(String str) {
        if (str == null) {
            return "";
        }
        return str.replaceAll("[^0-9]", "");
    }
}