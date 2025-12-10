package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: zT */
/* loaded from: classes.dex */
public final class C17216zT {

    /* renamed from: e */
    public static final Charset f109384e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    public static final String[] f109385f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    public static final int[] f109386g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    public static final byte[] f109387h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f109388a;

    /* renamed from: b */
    public final int f109389b;

    /* renamed from: c */
    public final long f109390c;

    /* renamed from: d */
    public final byte[] f109391d;

    public C17216zT(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* renamed from: a */
    public static C17216zT m135a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C17216zT(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f109384e);
        return new C17216zT(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C17216zT m134b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C17216zT(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C17216zT m133c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new C17216zT(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C17216zT m132d(C18230Om0[] c18230Om0Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[10] * c18230Om0Arr.length]);
        wrap.order(byteOrder);
        for (C18230Om0 c18230Om0 : c18230Om0Arr) {
            wrap.putInt((int) c18230Om0.m67084b());
            wrap.putInt((int) c18230Om0.m67085a());
        }
        return new C17216zT(10, c18230Om0Arr.length, wrap.array());
    }

    /* renamed from: e */
    public static C17216zT m131e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f109384e);
        return new C17216zT(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C17216zT m130f(long j, ByteOrder byteOrder) {
        return m129g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static C17216zT m129g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C17216zT(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C17216zT m128h(C18230Om0[] c18230Om0Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[5] * c18230Om0Arr.length]);
        wrap.order(byteOrder);
        for (C18230Om0 c18230Om0 : c18230Om0Arr) {
            wrap.putInt((int) c18230Om0.m67084b());
            wrap.putInt((int) c18230Om0.m67085a());
        }
        return new C17216zT(5, c18230Om0Arr.length, wrap.array());
    }

    /* renamed from: i */
    public static C17216zT m127i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f109386g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C17216zT(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public double m126j(ByteOrder byteOrder) {
        Object m124l = m124l(byteOrder);
        if (m124l != null) {
            if (m124l instanceof String) {
                return Double.parseDouble((String) m124l);
            }
            if (m124l instanceof long[]) {
                long[] jArr = (long[]) m124l;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m124l instanceof int[]) {
                int[] iArr = (int[]) m124l;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m124l instanceof double[]) {
                double[] dArr = (double[]) m124l;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (m124l instanceof C18230Om0[]) {
                C18230Om0[] c18230Om0Arr = (C18230Om0[]) m124l;
                if (c18230Om0Arr.length == 1) {
                    return c18230Om0Arr[0].m67083c();
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    /* renamed from: k */
    public String m125k(ByteOrder byteOrder) {
        Object m124l = m124l(byteOrder);
        if (m124l == null) {
            return null;
        }
        if (m124l instanceof String) {
            return (String) m124l;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (m124l instanceof long[]) {
            long[] jArr = (long[]) m124l;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (m124l instanceof int[]) {
            int[] iArr = (int[]) m124l;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (m124l instanceof double[]) {
            double[] dArr = (double[]) m124l;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(m124l instanceof C18230Om0[])) {
            return null;
        } else {
            C18230Om0[] c18230Om0Arr = (C18230Om0[]) m124l;
            while (i < c18230Om0Arr.length) {
                sb.append(c18230Om0Arr[i].m67084b());
                sb.append('/');
                sb.append(c18230Om0Arr[i].m67085a());
                i++;
                if (i != c18230Om0Arr.length) {
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
    public java.lang.Object m124l(java.nio.ByteOrder r12) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C17216zT.m124l(java.nio.ByteOrder):java.lang.Object");
    }

    /* renamed from: m */
    public int m123m() {
        return f109386g[this.f109388a] * this.f109389b;
    }

    public String toString() {
        return "(" + f109385f[this.f109388a] + ", data length:" + this.f109391d.length + ")";
    }

    public C17216zT(int i, int i2, long j, byte[] bArr) {
        this.f109388a = i;
        this.f109389b = i2;
        this.f109390c = j;
        this.f109391d = bArr;
    }
}