package com.google.zxing.client.result;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes5.dex */
public final class VINResultParser extends ResultParser {

    /* renamed from: e */
    public static final Pattern f57743e = Pattern.compile("[IOQ]");

    /* renamed from: f */
    public static final Pattern f57744f = Pattern.compile("[A-Z0-9]{17}");

    /* renamed from: g */
    public static char m34161g(int i) {
        if (i < 10) {
            return (char) (i + 48);
        }
        if (i == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static boolean m34160h(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i + 1;
            i2 += m34156l(i3) * m34157k(charSequence.charAt(i));
            i = i3;
        }
        if (charSequence.charAt(8) != m34161g(i2 % 11)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static String m34159i(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt != '9') {
            if (charAt != 'S') {
                if (charAt != 'Z') {
                    switch (charAt) {
                        case '1':
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        case EACTags.SEX /* 53 */:
                            return "US";
                        case '2':
                            return "CA";
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            if (charAt2 >= 'A' && charAt2 <= 'W') {
                                return "MX";
                            }
                            return null;
                        default:
                            switch (charAt) {
                                case 'J':
                                    if (charAt2 >= 'A' && charAt2 <= 'T') {
                                        return "JP";
                                    }
                                    return null;
                                case 'K':
                                    if (charAt2 >= 'L' && charAt2 <= 'R') {
                                        return "KO";
                                    }
                                    return null;
                                case 'L':
                                    return "CN";
                                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                                    if (charAt2 >= 'A' && charAt2 <= 'E') {
                                        return "IN";
                                    }
                                    return null;
                                default:
                                    switch (charAt) {
                                        case 'V':
                                            if (charAt2 >= 'F' && charAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (charAt2 >= 'S' && charAt2 <= 'W') {
                                                return "ES";
                                            }
                                            return null;
                                        case 'W':
                                            return "DE";
                                        case SyslogConstants.LOG_FTP /* 88 */:
                                            if (charAt2 != '0') {
                                                if (charAt2 >= '3' && charAt2 <= '9') {
                                                    return "RU";
                                                }
                                                return null;
                                            }
                                            return "RU";
                                        default:
                                            return null;
                                    }
                            }
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'R') {
                    return "IT";
                } else {
                    return null;
                }
            } else if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            } else {
                if (charAt2 >= 'N' && charAt2 <= 'T') {
                    return "DE";
                }
                return null;
            }
        } else if (charAt2 < 'A' || charAt2 > 'E') {
            if (charAt2 >= '3' && charAt2 <= '9') {
                return "BR";
            }
            return null;
        } else {
            return "BR";
        }
    }

    /* renamed from: j */
    public static int m34158j(char c) {
        if (c >= 'E' && c <= 'H') {
            return c + 1915;
        }
        if (c >= 'J' && c <= 'N') {
            return c + 1914;
        }
        if (c == 'P') {
            return 1993;
        }
        if (c >= 'R' && c <= 'T') {
            return c + 1912;
        }
        if (c >= 'V' && c <= 'Y') {
            return c + 1911;
        }
        if (c >= '1' && c <= '9') {
            return c + 1952;
        }
        if (c >= 'A' && c <= 'D') {
            return c + 1945;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public static int m34157k(char c) {
        if (c >= 'A' && c <= 'I') {
            return c - '@';
        }
        if (c >= 'J' && c <= 'R') {
            return c - 'I';
        }
        if (c >= 'S' && c <= 'Z') {
            return c - 'Q';
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static int m34156l(int i) {
        if (i > 0 && i <= 7) {
            return 9 - i;
        }
        if (i == 8) {
            return 10;
        }
        if (i == 9) {
            return 0;
        }
        if (i >= 10 && i <= 17) {
            return 19 - i;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String trim = f57743e.matcher(result.getText()).replaceAll("").trim();
        if (f57744f.matcher(trim).matches()) {
            try {
                if (m34160h(trim)) {
                    String substring = trim.substring(0, 3);
                    return new VINParsedResult(trim, substring, trim.substring(3, 9), trim.substring(9, 17), m34159i(substring), trim.substring(3, 8), m34158j(trim.charAt(9)), trim.charAt(10), trim.substring(11));
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }
}