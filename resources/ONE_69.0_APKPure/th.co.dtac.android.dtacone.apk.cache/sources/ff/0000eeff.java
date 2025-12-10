package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class MatchRatingApproachEncoder implements StringEncoder {

    /* renamed from: a */
    public static final String[] f73233a = {"BB", AFMParser.f59178CC, "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", AFMParser.CHARMETRICS_VV, "WW", "XX", "YY", "ZZ"};

    /* renamed from: a */
    public String m25716a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {"\\-", "[&]", "\\'", "\\.", "[\\,]"};
        for (int i = 0; i < 5; i++) {
            upperCase = upperCase.replaceAll(strArr[i], "");
        }
        return m25711f(upperCase).replaceAll("\\s+", "");
    }

    /* renamed from: b */
    public String m25715b(String str) {
        int length = str.length();
        if (length > 6) {
            String substring = str.substring(0, 3);
            String substring2 = str.substring(length - 3, length);
            return substring + substring2;
        }
        return str;
    }

    /* renamed from: c */
    public int m25714c(int i) {
        if (i <= 4) {
            return 5;
        }
        if (i <= 7) {
            return 4;
        }
        if (i <= 11) {
            return 3;
        }
        return i == 12 ? 2 : 1;
    }

    /* renamed from: d */
    public boolean m25713d(String str) {
        if (!str.equalsIgnoreCase(ExifInterface.LONGITUDE_EAST) && !str.equalsIgnoreCase("A") && !str.equalsIgnoreCase(PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE) && !str.equalsIgnoreCase("I") && !str.equalsIgnoreCase(PDBorderStyleDictionary.STYLE_UNDERLINE)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int m25712e(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i = 0;
        while (i < charArray.length && i <= length2) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            int i3 = length - i;
            String substring2 = str.substring(i3, i3 + 1);
            String substring3 = str2.substring(i, i2);
            int i4 = length2 - i;
            String substring4 = str2.substring(i4, i4 + 1);
            if (substring.equals(substring3)) {
                charArray[i] = TokenParser.f74644SP;
                charArray2[i] = TokenParser.f74644SP;
            }
            if (substring2.equals(substring4)) {
                charArray[i3] = TokenParser.f74644SP;
                charArray2[i4] = TokenParser.f74644SP;
            }
            i = i2;
        }
        String replaceAll = new String(charArray).replaceAll("\\s+", "");
        String replaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        if (replaceAll.length() > replaceAll2.length()) {
            return Math.abs(6 - replaceAll.length());
        }
        return Math.abs(6 - replaceAll2.length());
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }

    /* renamed from: f */
    public String m25711f(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int indexOf = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű".indexOf(charAt);
            if (indexOf > -1) {
                sb.append("AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu".charAt(indexOf));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public String m25710g(String str) {
        String[] strArr;
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : f73233a) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    /* renamed from: h */
    public String m25709h(String str) {
        String substring = str.substring(0, 1);
        String replaceAll = str.replace("A", "").replace(ExifInterface.LONGITUDE_EAST, "").replace("I", "").replace(PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "").replace(PDBorderStyleDictionary.STYLE_UNDERLINE, "").replaceAll("\\s{2,}\\b", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        if (m25713d(substring)) {
            return substring + replaceAll;
        }
        return replaceAll;
    }

    public boolean isEncodeEquals(String str, String str2) {
        if (str == null || "".equalsIgnoreCase(str) || HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equalsIgnoreCase(str) || str2 == null || "".equalsIgnoreCase(str2) || HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equalsIgnoreCase(str2) || str.length() == 1 || str2.length() == 1) {
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String m25716a = m25716a(str);
        String m25716a2 = m25716a(str2);
        String m25709h = m25709h(m25716a);
        String m25709h2 = m25709h(m25716a2);
        String m25710g = m25710g(m25709h);
        String m25710g2 = m25710g(m25709h2);
        String m25715b = m25715b(m25710g);
        String m25715b2 = m25715b(m25710g2);
        if (Math.abs(m25715b.length() - m25715b2.length()) >= 3) {
            return false;
        }
        if (m25712e(m25715b, m25715b2) < m25714c(Math.abs(m25715b.length() + m25715b2.length()))) {
            return false;
        }
        return true;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        if (str != null && !"".equalsIgnoreCase(str) && !HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equalsIgnoreCase(str) && str.length() != 1) {
            String m25716a = m25716a(str);
            if (!HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equals(m25716a) && !m25716a.isEmpty()) {
                String m25709h = m25709h(m25716a);
                if (!HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equals(m25709h) && !m25709h.isEmpty()) {
                    return m25715b(m25710g(m25709h));
                }
            }
        }
        return "";
    }
}