package com.fasterxml.jackson.core.p011io;

import com.facebook.stetho.dumpapp.Framer;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

/* renamed from: com.fasterxml.jackson.core.io.NumberOutput */
/* loaded from: classes3.dex */
public final class NumberOutput {

    /* renamed from: a */
    public static int f43135a = 1000000;

    /* renamed from: b */
    public static int f43136b = 1000000000;

    /* renamed from: c */
    public static long f43137c = 1000000000;

    /* renamed from: d */
    public static long f43138d = -2147483648L;

    /* renamed from: e */
    public static long f43139e = 2147483647L;

    /* renamed from: f */
    public static final String f43140f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g */
    public static final String f43141g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h */
    public static final int[] f43142h = new int[1000];

    /* renamed from: i */
    public static final String[] f43143i;

    /* renamed from: j */
    public static final String[] f43144j;

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    f43142h[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
        f43143i = new String[]{"0", "1", "2", "3", OneNadOutboundSearchFragment.BILL_REMAINING_3_PLUS, "5", "6", "7", "8", "9", "10"};
        f43144j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    /* renamed from: a */
    public static int m49759a(int i, byte[] bArr, int i2) {
        int i3 = f43142h[i];
        bArr[i2] = (byte) (i3 >> 16);
        int i4 = i2 + 2;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        int i5 = i2 + 3;
        bArr[i4] = (byte) i3;
        return i5;
    }

    /* renamed from: b */
    public static int m49758b(int i, char[] cArr, int i2) {
        int i3 = f43142h[i];
        cArr[i2] = (char) (i3 >> 16);
        int i4 = i2 + 2;
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i5 = i2 + 3;
        cArr[i4] = (char) (i3 & 127);
        return i5;
    }

    /* renamed from: c */
    public static int m49757c(int i, byte[] bArr, int i2) {
        int i3 = f43142h[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    /* renamed from: d */
    public static int m49756d(int i, char[] cArr, int i2) {
        int i3 = f43142h[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    /* renamed from: e */
    public static int m49755e(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = f43142h;
        int i7 = iArr[i5];
        bArr[i2] = (byte) (i7 >> 16);
        bArr[i2 + 1] = (byte) (i7 >> 8);
        bArr[i2 + 2] = (byte) i7;
        int i8 = iArr[i6];
        bArr[i2 + 3] = (byte) (i8 >> 16);
        bArr[i2 + 4] = (byte) (i8 >> 8);
        bArr[i2 + 5] = (byte) i8;
        int i9 = iArr[i4];
        bArr[i2 + 6] = (byte) (i9 >> 16);
        int i10 = i2 + 8;
        bArr[i2 + 7] = (byte) (i9 >> 8);
        int i11 = i2 + 9;
        bArr[i10] = (byte) i9;
        return i11;
    }

    /* renamed from: f */
    public static int m49754f(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = f43142h;
        int i6 = iArr[i5];
        cArr[i2] = (char) (i6 >> 16);
        cArr[i2 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i2 + 2] = (char) (i6 & 127);
        int i7 = iArr[i3 - (i5 * 1000)];
        cArr[i2 + 3] = (char) (i7 >> 16);
        cArr[i2 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i2 + 5] = (char) (i7 & 127);
        int i8 = iArr[i4];
        cArr[i2 + 6] = (char) (i8 >> 16);
        int i9 = i2 + 8;
        cArr[i2 + 7] = (char) ((i8 >> 8) & 127);
        int i10 = i2 + 9;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    /* renamed from: g */
    public static int m49753g(byte[] bArr, int i) {
        int length = f43140f.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f43140f.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: h */
    public static int m49752h(char[] cArr, int i) {
        String str = f43140f;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: i */
    public static int m49751i(byte[] bArr, int i) {
        int length = f43141g.length();
        int i2 = 0;
        while (i2 < length) {
            bArr[i] = (byte) f43141g.charAt(i2);
            i2++;
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static int m49750j(char[] cArr, int i) {
        String str = f43141g;
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return i + length;
    }

    /* renamed from: k */
    public static int m49749k(int i, byte[] bArr, int i2) {
        if (i < f43135a) {
            if (i < 1000) {
                return m49757c(i, bArr, i2);
            }
            int i3 = i / 1000;
            return m49747m(bArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i - (i4 * 1000);
        int i6 = i4 / 1000;
        int m49757c = m49757c(i6, bArr, i2);
        int[] iArr = f43142h;
        int i7 = iArr[i4 - (i6 * 1000)];
        bArr[m49757c] = (byte) (i7 >> 16);
        bArr[m49757c + 1] = (byte) (i7 >> 8);
        bArr[m49757c + 2] = (byte) i7;
        int i8 = iArr[i5];
        bArr[m49757c + 3] = (byte) (i8 >> 16);
        int i9 = m49757c + 5;
        bArr[m49757c + 4] = (byte) (i8 >> 8);
        int i10 = m49757c + 6;
        bArr[i9] = (byte) i8;
        return i10;
    }

    /* renamed from: l */
    public static int m49748l(int i, char[] cArr, int i2) {
        if (i < f43135a) {
            if (i < 1000) {
                return m49756d(i, cArr, i2);
            }
            int i3 = i / 1000;
            return m49746n(cArr, i2, i3, i - (i3 * 1000));
        }
        int i4 = i / 1000;
        int i5 = i - (i4 * 1000);
        int i6 = i4 / 1000;
        int m49756d = m49756d(i6, cArr, i2);
        int[] iArr = f43142h;
        int i7 = iArr[i4 - (i6 * 1000)];
        cArr[m49756d] = (char) (i7 >> 16);
        cArr[m49756d + 1] = (char) ((i7 >> 8) & 127);
        cArr[m49756d + 2] = (char) (i7 & 127);
        int i8 = iArr[i5];
        cArr[m49756d + 3] = (char) (i8 >> 16);
        int i9 = m49756d + 5;
        cArr[m49756d + 4] = (char) ((i8 >> 8) & 127);
        int i10 = m49756d + 6;
        cArr[i9] = (char) (i8 & 127);
        return i10;
    }

    /* renamed from: m */
    public static int m49747m(byte[] bArr, int i, int i2, int i3) {
        int[] iArr = f43142h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i] = (byte) (i4 >> 16);
                i++;
            }
            bArr[i] = (byte) (i4 >> 8);
            i++;
        }
        bArr[i] = (byte) i4;
        int i5 = iArr[i3];
        bArr[i + 1] = (byte) (i5 >> 16);
        int i6 = i + 3;
        bArr[i + 2] = (byte) (i5 >> 8);
        int i7 = i + 4;
        bArr[i6] = (byte) i5;
        return i7;
    }

    /* renamed from: n */
    public static int m49746n(char[] cArr, int i, int i2, int i3) {
        int[] iArr = f43142h;
        int i4 = iArr[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i] = (char) (i4 >> 16);
                i++;
            }
            cArr[i] = (char) ((i4 >> 8) & 127);
            i++;
        }
        cArr[i] = (char) (i4 & 127);
        int i5 = iArr[i3];
        cArr[i + 1] = (char) (i5 >> 16);
        int i6 = i + 3;
        cArr[i + 2] = (char) ((i5 >> 8) & 127);
        int i7 = i + 4;
        cArr[i6] = (char) (i5 & 127);
        return i7;
    }

    public static boolean notFinite(double d) {
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m49752h(cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < f43135a) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return m49758b(i - (i4 * 1000), cArr, m49756d(i4, cArr, i2));
            } else if (i < 10) {
                cArr[i2] = (char) (i + 48);
                return i2 + 1;
            } else {
                return m49756d(i, cArr, i2);
            }
        }
        int i5 = f43136b;
        if (i >= i5) {
            int i6 = i - i5;
            if (i6 >= i5) {
                i6 -= i5;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
            return m49754f(i6, cArr, i3);
        }
        int i7 = i / 1000;
        int i8 = i7 / 1000;
        return m49758b(i - (i7 * 1000), cArr, m49758b(i7 - (i8 * 1000), cArr, m49756d(i8, cArr, i2)));
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int m49754f;
        if (j < 0) {
            if (j > f43138d) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m49750j(cArr, i);
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= f43139e) {
            return outputInt((int) j, cArr, i);
        }
        long j2 = f43137c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            m49754f = m49748l((int) j3, cArr, i);
        } else {
            long j5 = j3 / j2;
            int m49756d = m49756d((int) j5, cArr, i);
            m49754f = m49754f((int) (j3 - (j2 * j5)), cArr, m49756d);
        }
        return m49754f((int) j4, cArr, m49754f);
    }

    public static String toString(int i) {
        String[] strArr = f43143i;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = f43144j;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    public static boolean notFinite(float f) {
        return Float.isNaN(f) || Float.isInfinite(f);
    }

    public static String toString(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return toString((int) j);
        }
        return Long.toString(j);
    }

    public static String toString(double d) {
        return Double.toString(d);
    }

    public static String toString(float f) {
        return Float.toString(f);
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        int m49755e;
        if (j < 0) {
            if (j > f43138d) {
                return outputInt((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return m49751i(bArr, i);
            }
            bArr[i] = Framer.STDIN_FRAME_PREFIX;
            j = -j;
            i++;
        } else if (j <= f43139e) {
            return outputInt((int) j, bArr, i);
        }
        long j2 = f43137c;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            m49755e = m49749k((int) j3, bArr, i);
        } else {
            long j5 = j3 / j2;
            int m49757c = m49757c((int) j5, bArr, i);
            m49755e = m49755e((int) (j3 - (j2 * j5)), bArr, m49757c);
        }
        return m49755e((int) j4, bArr, m49755e);
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m49753g(bArr, i2);
            }
            bArr[i2] = Framer.STDIN_FRAME_PREFIX;
            i = -i;
            i2++;
        }
        if (i < f43135a) {
            if (i >= 1000) {
                int i4 = i / 1000;
                return m49759a(i - (i4 * 1000), bArr, m49757c(i4, bArr, i2));
            } else if (i < 10) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
                return i5;
            } else {
                return m49757c(i, bArr, i2);
            }
        }
        int i6 = f43136b;
        if (i >= i6) {
            int i7 = i - i6;
            if (i7 >= i6) {
                i7 -= i6;
                i3 = i2 + 1;
                bArr[i2] = Framer.STDERR_FRAME_PREFIX;
            } else {
                i3 = i2 + 1;
                bArr[i2] = Framer.STDOUT_FRAME_PREFIX;
            }
            return m49755e(i7, bArr, i3);
        }
        int i8 = i / 1000;
        int i9 = i8 / 1000;
        return m49759a(i - (i8 * 1000), bArr, m49759a(i8 - (i9 * 1000), bArr, m49757c(i9, bArr, i2)));
    }
}