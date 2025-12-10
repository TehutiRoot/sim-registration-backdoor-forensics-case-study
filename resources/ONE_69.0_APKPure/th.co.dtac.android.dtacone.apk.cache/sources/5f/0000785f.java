package p000;

import androidx.core.app.NotificationManagerCompat;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: bg */
/* loaded from: classes5.dex */
public final class C5368bg extends FilterInputStream {

    /* renamed from: q */
    public static final short[][] f39157q = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, 213, 214, 215, 218, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, 119}};

    /* renamed from: r */
    public static final short[][] f39158r = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, 320, 384, 448, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, 192, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{640, 704, 768, 832, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY, 576, 896, 960, 1024, 1088, 1152, 1216}};

    /* renamed from: s */
    public static final short[][] f39159s = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};

    /* renamed from: t */
    public static final short[][] f39160t = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{192, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, 320, 384, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, 448, OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY, 640, 576, 47, 48}, new short[]{1472, 1536, 1600, 1728, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* renamed from: u */
    public static final C5370b f39161u;

    /* renamed from: v */
    public static final C5370b f39162v;

    /* renamed from: w */
    public static final C5371c f39163w;

    /* renamed from: x */
    public static final C5371c f39164x;

    /* renamed from: y */
    public static final C5371c f39165y;

    /* renamed from: z */
    public static final C5371c f39166z;

    /* renamed from: a */
    public final int f39167a;

    /* renamed from: b */
    public final byte[] f39168b;

    /* renamed from: c */
    public final boolean f39169c;

    /* renamed from: d */
    public final boolean f39170d;

    /* renamed from: e */
    public final boolean f39171e;

    /* renamed from: f */
    public final boolean f39172f;

    /* renamed from: g */
    public final int f39173g;

    /* renamed from: h */
    public int f39174h;

    /* renamed from: i */
    public int f39175i;

    /* renamed from: j */
    public int[] f39176j;

    /* renamed from: k */
    public int[] f39177k;

    /* renamed from: l */
    public int f39178l;

    /* renamed from: m */
    public int f39179m;

    /* renamed from: n */
    public int f39180n;

    /* renamed from: o */
    public int f39181o;

    /* renamed from: p */
    public int f39182p;

    /* renamed from: bg$b */
    /* loaded from: classes5.dex */
    public static final class C5370b {

        /* renamed from: a */
        public C5370b f39183a;

        /* renamed from: b */
        public C5370b f39184b;

        /* renamed from: c */
        public int f39185c;

        /* renamed from: d */
        public boolean f39186d;

        /* renamed from: e */
        public boolean f39187e;

        public C5370b() {
            this.f39186d = false;
            this.f39187e = false;
        }

        /* renamed from: a */
        public void m51902a(boolean z, C5370b c5370b) {
            if (!z) {
                this.f39183a = c5370b;
            } else {
                this.f39184b = c5370b;
            }
        }

        /* renamed from: b */
        public C5370b m51901b(boolean z) {
            if (z) {
                return this.f39184b;
            }
            return this.f39183a;
        }

        public String toString() {
            return "[leaf=" + this.f39187e + ", value=" + this.f39185c + ", canBeFill=" + this.f39186d + "]";
        }
    }

    /* renamed from: bg$c */
    /* loaded from: classes5.dex */
    public static final class C5371c {

        /* renamed from: a */
        public final C5370b f39188a;

        public C5371c() {
            this.f39188a = new C5370b();
        }

        /* renamed from: a */
        public void m51900a(int i, int i2, int i3) {
            boolean z;
            C5370b c5370b = this.f39188a;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i - 1;
                if (((i2 >> (i5 - i4)) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C5370b m51901b = c5370b.m51901b(z);
                if (m51901b == null) {
                    m51901b = new C5370b();
                    if (i4 == i5) {
                        m51901b.f39185c = i3;
                        m51901b.f39187e = true;
                    }
                    if (i2 == 0) {
                        m51901b.f39186d = true;
                    }
                    c5370b.m51902a(z, m51901b);
                } else if (m51901b.f39187e) {
                    throw new IOException("node is leaf, no other following");
                }
                c5370b = m51901b;
            }
        }

        /* renamed from: b */
        public void m51899b(int i, int i2, C5370b c5370b) {
            boolean z;
            C5370b c5370b2;
            C5370b c5370b3 = this.f39188a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i - 1;
                if (((i2 >> (i4 - i3)) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C5370b m51901b = c5370b3.m51901b(z);
                if (m51901b == null) {
                    if (i3 == i4) {
                        c5370b2 = c5370b;
                    } else {
                        c5370b2 = new C5370b();
                    }
                    if (i2 == 0) {
                        c5370b2.f39186d = true;
                    }
                    c5370b3.m51902a(z, c5370b2);
                    c5370b3 = c5370b2;
                } else if (!m51901b.f39187e) {
                    c5370b3 = m51901b;
                } else {
                    throw new IOException("node is leaf, no other following");
                }
            }
        }
    }

    static {
        C5370b c5370b = new C5370b();
        f39161u = c5370b;
        c5370b.f39187e = true;
        c5370b.f39185c = -2000;
        C5370b c5370b2 = new C5370b();
        f39162v = c5370b2;
        c5370b2.f39185c = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        c5370b2.f39183a = c5370b2;
        c5370b2.f39184b = c5370b;
        C5371c c5371c = new C5371c();
        f39165y = c5371c;
        try {
            c5371c.m51899b(12, 0, c5370b2);
            c5371c.m51899b(12, 1, c5370b);
            f39163w = new C5371c();
            for (int i = 0; i < f39157q.length; i++) {
                try {
                    int i2 = 0;
                    while (true) {
                        short[] sArr = f39157q[i];
                        if (i2 < sArr.length) {
                            f39163w.m51900a(i + 2, sArr[i2], f39158r[i][i2]);
                            i2++;
                        }
                    }
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            C5371c c5371c2 = f39163w;
            c5371c2.m51899b(12, 0, f39162v);
            c5371c2.m51899b(12, 1, f39161u);
            f39164x = new C5371c();
            for (int i3 = 0; i3 < f39159s.length; i3++) {
                try {
                    int i4 = 0;
                    while (true) {
                        short[] sArr2 = f39159s[i3];
                        if (i4 < sArr2.length) {
                            f39164x.m51900a(i3 + 4, sArr2[i4], f39160t[i3][i4]);
                            i4++;
                        }
                    }
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
            C5371c c5371c3 = f39164x;
            c5371c3.m51899b(12, 0, f39162v);
            c5371c3.m51899b(12, 1, f39161u);
            C5371c c5371c4 = new C5371c();
            f39166z = c5371c4;
            try {
                c5371c4.m51900a(4, 1, -3000);
                c5371c4.m51900a(3, 1, -4000);
                c5371c4.m51900a(1, 1, 0);
                c5371c4.m51900a(3, 3, 1);
                c5371c4.m51900a(6, 3, 2);
                c5371c4.m51900a(7, 3, 3);
                c5371c4.m51900a(3, 2, -1);
                c5371c4.m51900a(6, 2, -2);
                c5371c4.m51900a(7, 2, -3);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public C5368bg(InputStream inputStream, int i, int i2, long j, boolean z) {
        super(inputStream);
        boolean z2;
        boolean z3;
        this.f39180n = 0;
        this.f39181o = -1;
        this.f39182p = -1;
        this.f39167a = i;
        this.f39173g = i2;
        this.f39168b = new byte[(i + 7) / 8];
        int i3 = i + 2;
        this.f39176j = new int[i3];
        this.f39177k = new int[i3];
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    this.f39172f = z;
                    this.f39169c = false;
                    this.f39170d = false;
                    this.f39171e = (j & 2) != 0;
                    return;
                }
                throw new IllegalArgumentException("Illegal parameter: " + i2);
            }
            this.f39172f = z;
            if ((1 & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f39169c = z2;
            if ((4 & j) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f39170d = z3;
            this.f39171e = (j & 2) != 0;
            return;
        }
        this.f39172f = z;
        this.f39169c = false;
        this.f39170d = false;
        this.f39171e = false;
    }

    /* renamed from: b */
    public final void m51913b() {
        int m51907l;
        int i = 0;
        this.f39179m = 0;
        boolean z = true;
        do {
            if (z) {
                m51907l = m51907l(f39164x);
            } else {
                m51907l = m51907l(f39163w);
            }
            i += m51907l;
            int[] iArr = this.f39177k;
            int i2 = this.f39179m;
            this.f39179m = i2 + 1;
            iArr[i2] = i;
            z = !z;
        } while (i < this.f39167a);
    }

    /* renamed from: d */
    public final void m51912d() {
        int i;
        int i2;
        C5371c c5371c;
        C5371c c5371c2;
        this.f39178l = this.f39179m;
        int[] iArr = this.f39177k;
        this.f39177k = this.f39176j;
        this.f39176j = iArr;
        int i3 = 0;
        this.f39179m = 0;
        boolean z = true;
        while (i3 < this.f39167a) {
            C5370b c5370b = f39166z.f39188a;
            while (true) {
                c5370b = c5370b.m51901b(m51904o());
                if (c5370b != null) {
                    if (c5370b.f39187e) {
                        int i4 = c5370b.f39185c;
                        if (i4 != -4000) {
                            if (i4 != -3000) {
                                int m51905n = m51905n(i3, z);
                                if (m51905n < this.f39178l && m51905n != -1) {
                                    i = this.f39176j[m51905n];
                                    i2 = c5370b.f39185c;
                                } else {
                                    i = this.f39167a;
                                    i2 = c5370b.f39185c;
                                }
                                i3 = i + i2;
                                int[] iArr2 = this.f39177k;
                                int i5 = this.f39179m;
                                iArr2[i5] = i3;
                                this.f39179m = i5 + 1;
                                z = !z;
                            } else {
                                int m51905n2 = m51905n(i3, z) + 1;
                                if (m51905n2 >= this.f39178l) {
                                    i3 = this.f39167a;
                                } else {
                                    i3 = this.f39176j[m51905n2];
                                }
                            }
                        } else {
                            if (z) {
                                c5371c = f39164x;
                            } else {
                                c5371c = f39163w;
                            }
                            int m51907l = i3 + m51907l(c5371c);
                            int[] iArr3 = this.f39177k;
                            int i6 = this.f39179m;
                            this.f39179m = i6 + 1;
                            iArr3[i6] = m51907l;
                            if (z) {
                                c5371c2 = f39163w;
                            } else {
                                c5371c2 = f39164x;
                            }
                            i3 = m51907l + m51907l(c5371c2);
                            int[] iArr4 = this.f39177k;
                            int i7 = this.f39179m;
                            this.f39179m = i7 + 1;
                            iArr4[i7] = i3;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void m51911g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f39173g;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4) {
                    m51908k();
                } else {
                    throw new IllegalArgumentException("Illegal parameter: " + this.f39173g);
                }
            } else {
                m51909j();
            }
        } else {
            m51910i();
        }
        this.f39180n = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z = true;
        while (true) {
            int i9 = this.f39179m;
            if (i7 > i9) {
                break;
            }
            int i10 = this.f39167a;
            if (i7 != i9) {
                i = this.f39177k[i7];
            } else {
                i = i10;
            }
            if (i <= i10) {
                i10 = i;
            }
            int i11 = i8 / 8;
            while (true) {
                i2 = i8 % 8;
                if (i2 == 0 || i10 - i8 <= 0) {
                    break;
                }
                byte[] bArr = this.f39168b;
                byte b = bArr[i11];
                if (z) {
                    i5 = 0;
                } else {
                    i5 = 1 << (7 - i2);
                }
                bArr[i11] = (byte) (i5 | b);
                i8++;
            }
            if (i2 == 0) {
                i11 = i8 / 8;
                if (z) {
                    i4 = 0;
                } else {
                    i4 = 255;
                }
                byte b2 = (byte) i4;
                while (i10 - i8 > 7) {
                    this.f39168b[i11] = b2;
                    i8 += 8;
                    i11++;
                }
            }
            while (i10 - i8 > 0) {
                int i12 = i8 % 8;
                if (i12 == 0) {
                    this.f39168b[i11] = 0;
                }
                byte[] bArr2 = this.f39168b;
                byte b3 = bArr2[i11];
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 1 << (7 - i12);
                }
                bArr2[i11] = (byte) (i3 | b3);
                i8++;
            }
            z = !z;
            i7++;
        }
        if (i8 == this.f39167a) {
            this.f39174h = (i8 + 7) / 8;
            return;
        }
        throw new IOException("Sum of run-lengths does not equal scan line width: " + i8 + " > " + this.f39167a);
    }

    /* renamed from: i */
    public final void m51910i() {
        if (this.f39172f) {
            m51903p();
        }
        m51913b();
    }

    /* renamed from: j */
    public final void m51909j() {
        if (this.f39172f) {
            m51903p();
        }
        loop0: while (true) {
            C5370b c5370b = f39165y.f39188a;
            while (true) {
                c5370b = c5370b.m51901b(m51904o());
                if (c5370b != null) {
                    if (c5370b.f39187e) {
                        break loop0;
                    }
                } else {
                    break;
                }
            }
        }
        if (this.f39169c && !m51904o()) {
            m51912d();
        } else {
            m51913b();
        }
    }

    /* renamed from: k */
    public final void m51908k() {
        if (this.f39172f) {
            m51903p();
        }
        m51912d();
    }

    /* renamed from: l */
    public final int m51907l(C5371c c5371c) {
        C5370b c5370b = c5371c.f39188a;
        int i = 0;
        while (true) {
            c5370b = c5370b.m51901b(m51904o());
            if (c5370b != null) {
                if (c5370b.f39187e) {
                    int i2 = c5370b.f39185c;
                    i += i2;
                    if (i2 >= 64) {
                        c5370b = c5371c.f39188a;
                    } else if (i2 >= 0) {
                        return i;
                    } else {
                        return this.f39167a;
                    }
                }
            } else {
                throw new IOException("Unknown code in Huffman RLE stream");
            }
        }
    }

    /* renamed from: m */
    public final void m51906m() {
        if (this.f39175i >= this.f39174h) {
            this.f39174h = 0;
            try {
                m51911g();
            } catch (EOFException e) {
                if (this.f39174h == 0) {
                    this.f39174h = -1;
                } else {
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException("Malformed CCITT stream", e2);
            }
            this.f39175i = 0;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* renamed from: n */
    public final int m51905n(int i, boolean z) {
        int i2 = (this.f39180n & (-2)) + (!z ? 1 : 0);
        if (i2 > 2) {
            i2 -= 2;
        }
        if (i == 0) {
            return i2;
        }
        while (i2 < this.f39178l) {
            if (i < this.f39176j[i2]) {
                this.f39180n = i2;
                return i2;
            }
            i2 += 2;
        }
        return -1;
    }

    /* renamed from: o */
    public final boolean m51904o() {
        int i = this.f39182p;
        boolean z = false;
        if (i < 0 || i > 7) {
            int read = ((FilterInputStream) this).in.read();
            this.f39181o = read;
            if (read != -1) {
                this.f39182p = 0;
            } else {
                throw new EOFException("Unexpected end of Huffman RLE stream");
            }
        }
        int i2 = this.f39181o;
        if ((i2 & 128) != 0) {
            z = true;
        }
        this.f39181o = i2 << 1;
        this.f39182p++;
        return z;
    }

    /* renamed from: p */
    public final void m51903p() {
        this.f39182p = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i = this.f39174h;
        if (i < 0) {
            return 0;
        }
        if (this.f39175i >= i) {
            m51906m();
            if (this.f39174h < 0) {
                return 0;
            }
        }
        byte[] bArr = this.f39168b;
        int i2 = this.f39175i;
        this.f39175i = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        int i = this.f39174h;
        if (i < 0) {
            return -1L;
        }
        if (this.f39175i >= i) {
            m51906m();
            if (this.f39174h < 0) {
                return -1L;
            }
        }
        int min = (int) Math.min(this.f39174h - this.f39175i, j);
        this.f39175i += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f39174h;
        if (i3 < 0) {
            Arrays.fill(bArr, i, i + i2, (byte) 0);
            return i2;
        }
        if (this.f39175i >= i3) {
            m51906m();
            if (this.f39174h < 0) {
                Arrays.fill(bArr, i, i + i2, (byte) 0);
                return i2;
            }
        }
        int min = Math.min(this.f39174h - this.f39175i, i2);
        System.arraycopy(this.f39168b, this.f39175i, bArr, i, min);
        this.f39175i += min;
        return min;
    }
}