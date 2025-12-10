package com.google.zxing.oned;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* renamed from: a */
    public static final char[] f57851a;

    /* renamed from: b */
    public static final char[] f57852b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    public static final char[] f57853c = {'/', ':', '+', '.'};

    /* renamed from: d */
    public static final char f57854d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f57851a = cArr;
        f57854d = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f57854d;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f57851a;
            boolean m34068b = CodaBarReader.m34068b(cArr, upperCase);
            boolean m34068b2 = CodaBarReader.m34068b(cArr, upperCase2);
            char[] cArr2 = f57852b;
            boolean m34068b3 = CodaBarReader.m34068b(cArr2, upperCase);
            boolean m34068b4 = CodaBarReader.m34068b(cArr2, upperCase2);
            if (m34068b) {
                if (!m34068b2) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (m34068b3) {
                if (!m34068b4) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (!m34068b2 && !m34068b4) {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f57854d;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (!Character.isDigit(str.charAt(i3)) && str.charAt(i3) != '-' && str.charAt(i3) != '$') {
                if (CodaBarReader.m34068b(f57853c, str.charAt(i3))) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + CoreConstants.SINGLE_QUOTE_CHAR);
                }
            } else {
                i2 += 9;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f57845d;
                if (i6 < cArr3.length) {
                    if (upperCase3 == cArr3[i6]) {
                        i = CodaBarReader.f57846e[i6];
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) != 0 && i8 != 1) {
                        i8++;
                    } else {
                        z = !z;
                        i7++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
