package p000;

import java.io.OutputStream;

/* renamed from: cg */
/* loaded from: classes5.dex */
public final class C5459cg extends OutputStream {

    /* renamed from: o */
    public static final C5461b[] f39480o = new C5461b[64];

    /* renamed from: p */
    public static final C5461b[] f39481p = new C5461b[40];

    /* renamed from: q */
    public static final C5461b[] f39482q;

    /* renamed from: r */
    public static final C5461b[] f39483r;

    /* renamed from: b */
    public final byte[] f39485b;

    /* renamed from: c */
    public final int f39486c;

    /* renamed from: d */
    public final int f39487d;

    /* renamed from: e */
    public final int f39488e;

    /* renamed from: f */
    public int[] f39489f;

    /* renamed from: g */
    public int[] f39490g;

    /* renamed from: m */
    public final int f39496m;

    /* renamed from: n */
    public final OutputStream f39497n;

    /* renamed from: a */
    public int f39484a = 0;

    /* renamed from: h */
    public int f39491h = 0;

    /* renamed from: i */
    public int f39492i = 0;

    /* renamed from: j */
    public int f39493j = 0;

    /* renamed from: k */
    public byte f39494k = 0;

    /* renamed from: l */
    public byte f39495l = 0;

    /* renamed from: cg$b */
    /* loaded from: classes5.dex */
    public static class C5461b {

        /* renamed from: a */
        public final int f39498a;

        /* renamed from: b */
        public final int f39499b;

        public C5461b(int i, int i2) {
            this.f39498a = i;
            this.f39499b = i2;
        }
    }

    static {
        for (int i = 0; i < C5386bg.f39115s.length; i++) {
            int i2 = i + 4;
            int i3 = 0;
            while (true) {
                short[] sArr = C5386bg.f39115s[i];
                if (i3 < sArr.length) {
                    short s = C5386bg.f39116t[i][i3];
                    short s2 = sArr[i3];
                    if (s < 64) {
                        f39480o[s] = new C5461b(s2, i2);
                    } else {
                        f39481p[(s / 64) - 1] = new C5461b(s2, i2);
                    }
                    i3++;
                }
            }
        }
        f39482q = new C5461b[64];
        f39483r = new C5461b[40];
        for (int i4 = 0; i4 < C5386bg.f39113q.length; i4++) {
            int i5 = i4 + 2;
            int i6 = 0;
            while (true) {
                short[] sArr2 = C5386bg.f39113q[i4];
                if (i6 < sArr2.length) {
                    short s3 = C5386bg.f39114r[i4][i6];
                    short s4 = sArr2[i6];
                    if (s3 < 64) {
                        f39482q[s3] = new C5461b(s4, i5);
                    } else {
                        f39483r[(s3 / 64) - 1] = new C5461b(s4, i5);
                    }
                    i6++;
                }
            }
        }
    }

    public C5459cg(OutputStream outputStream, int i, int i2, int i3) {
        this.f39497n = outputStream;
        this.f39487d = i;
        this.f39488e = i2;
        this.f39496m = i3;
        this.f39490g = new int[i];
        this.f39489f = new int[i];
        int i4 = (i + 7) / 8;
        this.f39486c = i4;
        this.f39485b = new byte[i4];
    }

    /* renamed from: b */
    public final void m51672b() {
        this.f39494k = (byte) 0;
        this.f39495l = (byte) 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39497n.close();
    }

    /* renamed from: d */
    public final void m51671d() {
        int i = 0;
        boolean z = true;
        while (i < this.f39487d) {
            int[] m51667k = m51667k(i, z);
            int[] m51666l = m51666l(i, z);
            int i2 = m51667k[0];
            int i3 = i2 - m51666l[0];
            if (i2 > m51666l[1]) {
                m51665m(1, 4);
                i = m51666l[1];
            } else if (i3 <= 3 && i3 >= -3) {
                switch (i3) {
                    case -3:
                        m51665m(2, 7);
                        break;
                    case -2:
                        m51665m(2, 6);
                        break;
                    case -1:
                        m51665m(2, 3);
                        break;
                    case 0:
                        m51665m(1, 1);
                        break;
                    case 1:
                        m51665m(3, 3);
                        break;
                    case 2:
                        m51665m(3, 6);
                        break;
                    case 3:
                        m51665m(3, 7);
                        break;
                }
                z = !z;
                i = m51666l[0] + i3;
            } else {
                m51665m(1, 3);
                m51663o(m51667k[0] - i, z);
                m51663o(m51667k[1] - m51667k[0], !z);
                i = m51667k[1];
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f39497n.flush();
    }

    /* renamed from: g */
    public final void m51670g() {
        boolean z;
        this.f39491h++;
        int[] iArr = this.f39490g;
        this.f39490g = this.f39489f;
        this.f39489f = iArr;
        this.f39493j = this.f39492i;
        this.f39492i = 0;
        boolean z2 = true;
        for (int i = 0; i < this.f39487d; i++) {
            if (((this.f39485b[i / 8] >> (7 - (i % 8))) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z == z2) {
                int[] iArr2 = this.f39489f;
                int i2 = this.f39492i;
                iArr2[i2] = i;
                this.f39492i = i2 + 1;
                z2 = !z2;
            }
        }
        m51669i();
        if (this.f39491h == this.f39488e) {
            m51664n();
            m51664n();
            m51668j();
        }
    }

    /* renamed from: i */
    public final void m51669i() {
        m51671d();
    }

    /* renamed from: j */
    public final void m51668j() {
        if (this.f39495l != 0) {
            this.f39497n.write(this.f39494k);
        }
        m51672b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        r0[0] = r6;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1 >= r4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0[1] = r5[r1];
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] m51667k(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = r7.f39487d
            r2 = 0
            r0[r2] = r1
            r3 = 1
            r0[r3] = r1
            r1 = 0
        Lc:
            int r4 = r7.f39492i
            if (r1 >= r4) goto L27
            int[] r5 = r7.f39489f
            r6 = r5[r1]
            if (r8 < r6) goto L1e
            if (r8 != 0) goto L1b
            if (r9 == 0) goto L1b
            goto L1e
        L1b:
            int r1 = r1 + 1
            goto Lc
        L1e:
            r0[r2] = r6
            int r1 = r1 + r3
            if (r1 >= r4) goto L27
            r8 = r5[r1]
            r0[r3] = r8
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5459cg.m51667k(int, boolean):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        r0[0] = r5;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r8 >= r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0[1] = r4[r8];
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] m51666l(int r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = r6.f39487d
            r2 = 0
            r0[r2] = r1
            r3 = 1
            r0[r3] = r1
            r8 = r8 ^ r3
        Lc:
            int r1 = r6.f39493j
            if (r8 >= r1) goto L27
            int[] r4 = r6.f39490g
            r5 = r4[r8]
            if (r5 > r7) goto L1e
            if (r7 != 0) goto L1b
            if (r8 != 0) goto L1b
            goto L1e
        L1b:
            int r8 = r8 + 2
            goto Lc
        L1e:
            r0[r2] = r5
            int r8 = r8 + r3
            if (r8 >= r1) goto L27
            r7 = r4[r8]
            r0[r3] = r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5459cg.m51666l(int, boolean):int[]");
    }

    /* renamed from: m */
    public final void m51665m(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((i >> ((i2 - i5) - 1)) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f39496m == 1) {
                byte b = this.f39494k;
                if (z) {
                    i4 = 1 << (7 - (this.f39495l % 8));
                } else {
                    i4 = 0;
                }
                this.f39494k = (byte) (i4 | b);
            } else {
                byte b2 = this.f39494k;
                if (z) {
                    i3 = 1 << (this.f39495l % 8);
                } else {
                    i3 = 0;
                }
                this.f39494k = (byte) (i3 | b2);
            }
            byte b3 = (byte) (this.f39495l + 1);
            this.f39495l = b3;
            if (b3 == 8) {
                this.f39497n.write(this.f39494k);
                m51672b();
            }
        }
    }

    /* renamed from: n */
    public final void m51664n() {
        m51665m(1, 12);
    }

    /* renamed from: o */
    public final void m51663o(int i, boolean z) {
        C5461b[] c5461bArr;
        C5461b c5461b;
        int i2 = i / 64;
        if (z) {
            c5461bArr = f39481p;
        } else {
            c5461bArr = f39483r;
        }
        while (i2 > 0) {
            if (i2 >= c5461bArr.length) {
                m51665m(c5461bArr[c5461bArr.length - 1].f39498a, c5461bArr[c5461bArr.length - 1].f39499b);
                i2 -= c5461bArr.length;
            } else {
                C5461b c5461b2 = c5461bArr[i2 - 1];
                m51665m(c5461b2.f39498a, c5461b2.f39499b);
                i2 = 0;
            }
        }
        if (z) {
            c5461b = f39480o[i % 64];
        } else {
            c5461b = f39482q[i % 64];
        }
        m51665m(c5461b.f39498a, c5461b.f39499b);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.f39485b;
        int i2 = this.f39484a;
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        this.f39484a = i3;
        if (i3 == this.f39486c) {
            m51670g();
            this.f39484a = 0;
        }
    }
}
