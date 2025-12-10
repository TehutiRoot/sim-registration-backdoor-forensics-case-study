package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: vT */
/* loaded from: classes.dex */
public final class C16897vT {

    /* renamed from: e */
    public static final Charset f107688e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    public static final String[] f107689f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    public static final int[] f107690g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    public static final byte[] f107691h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f107692a;

    /* renamed from: b */
    public final int f107693b;

    /* renamed from: c */
    public final long f107694c;

    /* renamed from: d */
    public final byte[] f107695d;

    public C16897vT(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* renamed from: a */
    public static C16897vT m1042a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C16897vT(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f107688e);
        return new C16897vT(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C16897vT m1041b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C16897vT(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C16897vT m1040c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new C16897vT(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C16897vT m1039d(C17809Im0[] c17809Im0Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[10] * c17809Im0Arr.length]);
        wrap.order(byteOrder);
        for (C17809Im0 c17809Im0 : c17809Im0Arr) {
            wrap.putInt((int) c17809Im0.m67872b());
            wrap.putInt((int) c17809Im0.m67873a());
        }
        return new C16897vT(10, c17809Im0Arr.length, wrap.array());
    }

    /* renamed from: e */
    public static C16897vT m1038e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f107688e);
        return new C16897vT(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C16897vT m1037f(long j, ByteOrder byteOrder) {
        return m1036g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static C16897vT m1036g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C16897vT(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C16897vT m1035h(C17809Im0[] c17809Im0Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[5] * c17809Im0Arr.length]);
        wrap.order(byteOrder);
        for (C17809Im0 c17809Im0 : c17809Im0Arr) {
            wrap.putInt((int) c17809Im0.m67872b());
            wrap.putInt((int) c17809Im0.m67873a());
        }
        return new C16897vT(5, c17809Im0Arr.length, wrap.array());
    }

    /* renamed from: i */
    public static C16897vT m1034i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f107690g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C16897vT(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public double m1033j(ByteOrder byteOrder) {
        Object m1031l = m1031l(byteOrder);
        if (m1031l != null) {
            if (m1031l instanceof String) {
                return Double.parseDouble((String) m1031l);
            }
            if (m1031l instanceof long[]) {
                long[] jArr = (long[]) m1031l;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m1031l instanceof int[]) {
                int[] iArr = (int[]) m1031l;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m1031l instanceof double[]) {
                double[] dArr = (double[]) m1031l;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m1031l instanceof C17809Im0[]) {
                C17809Im0[] c17809Im0Arr = (C17809Im0[]) m1031l;
                if (c17809Im0Arr.length == 1) {
                    return c17809Im0Arr[0].m67871c();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    /* renamed from: k */
    public String m1032k(ByteOrder byteOrder) {
        Object m1031l = m1031l(byteOrder);
        if (m1031l == null) {
            return null;
        }
        if (m1031l instanceof String) {
            return (String) m1031l;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (m1031l instanceof long[]) {
            long[] jArr = (long[]) m1031l;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (m1031l instanceof int[]) {
            int[] iArr = (int[]) m1031l;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (m1031l instanceof double[]) {
            double[] dArr = (double[]) m1031l;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(m1031l instanceof C17809Im0[])) {
            return null;
        } else {
            C17809Im0[] c17809Im0Arr = (C17809Im0[]) m1031l;
            while (i < c17809Im0Arr.length) {
                sb.append(c17809Im0Arr[i].m67872b());
                sb.append('/');
                sb.append(c17809Im0Arr[i].m67873a());
                i++;
                if (i != c17809Im0Arr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1031l(java.nio.ByteOrder r12) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C16897vT.m1031l(java.nio.ByteOrder):java.lang.Object");
    }

    /* renamed from: m */
    public int m1030m() {
        return f107690g[this.f107692a] * this.f107693b;
    }

    public String toString() {
        return "(" + f107689f[this.f107692a] + ", data length:" + this.f107695d.length + ")";
    }

    public C16897vT(int i, int i2, long j, byte[] bArr) {
        this.f107692a = i;
        this.f107693b = i2;
        this.f107694c = j;
        this.f107695d = bArr;
    }
}
