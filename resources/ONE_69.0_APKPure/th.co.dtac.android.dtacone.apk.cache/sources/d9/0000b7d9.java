package com.google.zxing.client.result;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.HashMap;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class ExpandedProductResultParser extends ResultParser {
    /* renamed from: g */
    public static String m34186g(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static String m34185h(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (m34186g(i2, substring) != null) {
                    break;
                }
                sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap hashMap = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        int i = 0;
        while (i < massagedText.length()) {
            String m34186g = m34186g(i, massagedText);
            if (m34186g == null) {
                return null;
            }
            int length = i + m34186g.length() + 2;
            String m34185h = m34185h(length, massagedText);
            i = length + m34185h.length();
            char c = 65535;
            switch (m34186g.hashCode()) {
                case 1536:
                    if (m34186g.equals("00")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1537:
                    if (m34186g.equals("01")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1567:
                    if (m34186g.equals("10")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1568:
                    if (m34186g.equals("11")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1570:
                    if (m34186g.equals("13")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1572:
                    if (m34186g.equals("15")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1574:
                    if (m34186g.equals("17")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1567966:
                    if (m34186g.equals("3100")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1567967:
                    if (m34186g.equals("3101")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1567968:
                    if (m34186g.equals("3102")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1567969:
                    if (m34186g.equals("3103")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1567970:
                    if (m34186g.equals("3104")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1567971:
                    if (m34186g.equals("3105")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1567972:
                    if (m34186g.equals("3106")) {
                        c = TokenParser.f74641CR;
                        break;
                    }
                    break;
                case 1567973:
                    if (m34186g.equals("3107")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1567974:
                    if (m34186g.equals("3108")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1567975:
                    if (m34186g.equals("3109")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1568927:
                    if (m34186g.equals("3200")) {
                        c = 17;
                        break;
                    }
                    break;
                case 1568928:
                    if (m34186g.equals("3201")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1568929:
                    if (m34186g.equals("3202")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1568930:
                    if (m34186g.equals("3203")) {
                        c = 20;
                        break;
                    }
                    break;
                case 1568931:
                    if (m34186g.equals("3204")) {
                        c = 21;
                        break;
                    }
                    break;
                case 1568932:
                    if (m34186g.equals("3205")) {
                        c = 22;
                        break;
                    }
                    break;
                case 1568933:
                    if (m34186g.equals("3206")) {
                        c = 23;
                        break;
                    }
                    break;
                case 1568934:
                    if (m34186g.equals("3207")) {
                        c = 24;
                        break;
                    }
                    break;
                case 1568935:
                    if (m34186g.equals("3208")) {
                        c = 25;
                        break;
                    }
                    break;
                case 1568936:
                    if (m34186g.equals("3209")) {
                        c = 26;
                        break;
                    }
                    break;
                case 1575716:
                    if (m34186g.equals("3920")) {
                        c = 27;
                        break;
                    }
                    break;
                case 1575717:
                    if (m34186g.equals("3921")) {
                        c = 28;
                        break;
                    }
                    break;
                case 1575718:
                    if (m34186g.equals("3922")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1575719:
                    if (m34186g.equals("3923")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1575747:
                    if (m34186g.equals("3930")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1575748:
                    if (m34186g.equals("3931")) {
                        c = TokenParser.f74644SP;
                        break;
                    }
                    break;
                case 1575749:
                    if (m34186g.equals("3932")) {
                        c = '!';
                        break;
                    }
                    break;
                case 1575750:
                    if (m34186g.equals("3933")) {
                        c = '\"';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str2 = m34185h;
                    continue;
                case 1:
                    str = m34185h;
                    continue;
                case 2:
                    str3 = m34185h;
                    continue;
                case 3:
                    str4 = m34185h;
                    continue;
                case 4:
                    str5 = m34185h;
                    continue;
                case 5:
                    str6 = m34185h;
                    continue;
                case 6:
                    str7 = m34185h;
                    continue;
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    str10 = m34186g.substring(3);
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str10 = m34186g.substring(3);
                    str9 = ExpandedProductParsedResult.POUND;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    str12 = m34186g.substring(3);
                    str11 = m34185h;
                    continue;
                case 31:
                case ' ':
                case '!':
                case '\"':
                    if (m34185h.length() < 4) {
                        return null;
                    }
                    str11 = m34185h.substring(3);
                    str13 = m34185h.substring(0, 3);
                    str12 = m34186g.substring(3);
                    continue;
                default:
                    hashMap.put(m34186g, m34185h);
                    continue;
            }
            str8 = m34185h;
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap);
    }
}