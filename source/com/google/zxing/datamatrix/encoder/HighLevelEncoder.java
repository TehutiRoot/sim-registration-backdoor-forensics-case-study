package com.google.zxing.datamatrix.encoder;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.Dimension;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class HighLevelEncoder {
    /* renamed from: a */
    public static int m34092a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m34091b(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: c */
    public static void m34090c(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* renamed from: d */
    public static boolean m34089d(char c) {
        return c >= '0' && c <= '9';
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m34089d(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static boolean m34088e(char c) {
        return c >= 128 && c <= 255;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    /* renamed from: f */
    public static boolean m34087f(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'A' && c <= 'Z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m34086g(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: h */
    public static boolean m34085h(char c) {
        if (c != ' ') {
            if (c < '0' || c > '9') {
                return c >= 'a' && c <= 'z';
            }
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m34084i(char c) {
        if (!m34082k(c) && c != ' ') {
            if (c < '0' || c > '9') {
                if (c < 'A' || c > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m34083j(char c) {
        return false;
    }

    /* renamed from: k */
    public static boolean m34082k(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* renamed from: l */
    public static int m34081l(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        float f = 2.0f;
        int i3 = 6;
        int i4 = 4;
        int i5 = 3;
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i6 = 0;
        while (true) {
            int i7 = i + i6;
            if (i7 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int m34092a = m34092a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int m34091b = m34091b(bArr);
                if (iArr[0] == m34092a) {
                    return 0;
                }
                if (m34091b == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (m34091b == 1 && bArr[i4] > 0) {
                    return i4;
                }
                if (m34091b == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (m34091b != 1 || bArr[i5] <= 0) {
                    return 1;
                }
                return i5;
            }
            char charAt = charSequence.charAt(i7);
            i6++;
            if (m34089d(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m34088e(charAt)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (m34087f(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m34088e(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m34085h(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m34088e(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m34084i(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m34088e(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m34086g(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m34088e(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m34083j(charAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i6 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                m34092a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int m34091b2 = m34091b(bArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[5];
                if (i8 < i9 && i8 < iArr2[1] && i8 < iArr2[2] && i8 < iArr2[3] && i8 < iArr2[4]) {
                    return 0;
                }
                if (i9 < i8) {
                    break;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    break;
                } else if (m34091b2 == 1 && b4 > 0) {
                    return 4;
                } else {
                    if (m34091b2 == 1 && b2 > 0) {
                        return 2;
                    }
                    if (m34091b2 == 1 && b3 > 0) {
                        return 3;
                    }
                    int i10 = iArr2[1];
                    if (i10 + 1 < i8 && i10 + 1 < i9) {
                        if (i10 + 1 < iArr2[4] && i10 + 1 < iArr2[2]) {
                            int i11 = iArr2[3];
                            if (i10 < i11) {
                                return 1;
                            }
                            if (i10 == i11) {
                                for (int i12 = i + i6 + 1; i12 < charSequence.length(); i12++) {
                                    char charAt2 = charSequence.charAt(i12);
                                    if (m34082k(charAt2)) {
                                        return 3;
                                    }
                                    if (!m34084i(charAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                        f = 2.0f;
                        i3 = 6;
                        i4 = 4;
                        i5 = 3;
                    }
                }
            }
            f = 2.0f;
            i3 = 6;
            i4 = 4;
            i5 = 3;
        }
        return 5;
    }

    /* renamed from: m */
    public static char m34080m(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i = 0;
        InterfaceC16967wR[] interfaceC16967wRArr = {new C12256m(), new C1839Zf(), new VR1(), new G62(), new C1385TQ(), new C11664ka()};
        C17125yR c17125yR = new C17125yR(str);
        c17125yR.m263n(symbolShapeHint);
        c17125yR.m265l(dimension, dimension2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c17125yR.m259r((char) 236);
            c17125yR.m264m(2);
            c17125yR.f108750f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c17125yR.m259r((char) 237);
            c17125yR.m264m(2);
            c17125yR.f108750f += 7;
        }
        while (c17125yR.m268i()) {
            interfaceC16967wRArr[i].mo842a(c17125yR);
            if (c17125yR.m272e() >= 0) {
                i = c17125yR.m272e();
                c17125yR.m267j();
            }
        }
        int m276a = c17125yR.m276a();
        c17125yR.m261p();
        int dataCapacity = c17125yR.m270g().getDataCapacity();
        if (m276a < dataCapacity && i != 0 && i != 5) {
            c17125yR.m259r((char) 254);
        }
        StringBuilder m275b = c17125yR.m275b();
        if (m275b.length() < dataCapacity) {
            m275b.append((char) 129);
        }
        while (m275b.length() < dataCapacity) {
            m275b.append(m34080m((char) 129, m275b.length() + 1));
        }
        return c17125yR.m275b().toString();
    }
}
