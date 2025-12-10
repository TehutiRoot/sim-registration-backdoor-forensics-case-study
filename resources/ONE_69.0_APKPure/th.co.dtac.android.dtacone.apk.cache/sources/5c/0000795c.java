package p000;

import java.io.OutputStream;

/* renamed from: cg */
/* loaded from: classes5.dex */
public final class C5448cg extends OutputStream {

    /* renamed from: o */
    public static final C5450b[] f39479o = new C5450b[64];

    /* renamed from: p */
    public static final C5450b[] f39480p = new C5450b[40];

    /* renamed from: q */
    public static final C5450b[] f39481q;

    /* renamed from: r */
    public static final C5450b[] f39482r;

    /* renamed from: b */
    public final byte[] f39484b;

    /* renamed from: c */
    public final int f39485c;

    /* renamed from: d */
    public final int f39486d;

    /* renamed from: e */
    public final int f39487e;

    /* renamed from: f */
    public int[] f39488f;

    /* renamed from: g */
    public int[] f39489g;

    /* renamed from: m */
    public final int f39495m;

    /* renamed from: n */
    public final OutputStream f39496n;

    /* renamed from: a */
    public int f39483a = 0;

    /* renamed from: h */
    public int f39490h = 0;

    /* renamed from: i */
    public int f39491i = 0;

    /* renamed from: j */
    public int f39492j = 0;

    /* renamed from: k */
    public byte f39493k = 0;

    /* renamed from: l */
    public byte f39494l = 0;

    /* renamed from: cg$b */
    /* loaded from: classes5.dex */
    public static class C5450b {

        /* renamed from: a */
        public final int f39497a;

        /* renamed from: b */
        public final int f39498b;

        public C5450b(int i, int i2) {
            this.f39497a = i;
            this.f39498b = i2;
        }
    }

    static {
        for (int i = 0; i < C5368bg.f39159s.length; i++) {
            int i2 = i + 4;
            int i3 = 0;
            while (true) {
                short[] sArr = C5368bg.f39159s[i];
                if (i3 < sArr.length) {
                    short s = C5368bg.f39160t[i][i3];
                    short s2 = sArr[i3];
                    if (s < 64) {
                        f39479o[s] = new C5450b(s2, i2);
                    } else {
                        f39480p[(s / 64) - 1] = new C5450b(s2, i2);
                    }
                    i3++;
                }
            }
        }
        f39481q = new C5450b[64];
        f39482r = new C5450b[40];
        for (int i4 = 0; i4 < C5368bg.f39157q.length; i4++) {
            int i5 = i4 + 2;
            int i6 = 0;
            while (true) {
                short[] sArr2 = C5368bg.f39157q[i4];
                if (i6 < sArr2.length) {
                    short s3 = C5368bg.f39158r[i4][i6];
                    short s4 = sArr2[i6];
                    if (s3 < 64) {
                        f39481q[s3] = new C5450b(s4, i5);
                    } else {
                        f39482r[(s3 / 64) - 1] = new C5450b(s4, i5);
                    }
                    i6++;
                }
            }
        }
    }

    public C5448cg(OutputStream outputStream, int i, int i2, int i3) {
        this.f39496n = outputStream;
        this.f39486d = i;
        this.f39487e = i2;
        this.f39495m = i3;
        this.f39489g = new int[i];
        this.f39488f = new int[i];
        int i4 = (i + 7) / 8;
        this.f39485c = i4;
        this.f39484b = new byte[i4];
    }

    /* renamed from: b */
    public final void m51671b() {
        this.f39493k = (byte) 0;
        this.f39494l = (byte) 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39496n.close();
    }

    /* renamed from: d */
    public final void m51670d() {
        int i = 0;
        boolean z = true;
        while (i < this.f39486d) {
            int[] m51666k = m51666k(i, z);
            int[] m51665l = m51665l(i, z);
            int i2 = m51666k[0];
            int i3 = i2 - m51665l[0];
            if (i2 > m51665l[1]) {
                m51664m(1, 4);
                i = m51665l[1];
            } else if (i3 <= 3 && i3 >= -3) {
                switch (i3) {
                    case -3:
                        m51664m(2, 7);
                        break;
                    case -2:
                        m51664m(2, 6);
                        break;
                    case -1:
                        m51664m(2, 3);
                        break;
                    case 0:
                        m51664m(1, 1);
                        break;
                    case 1:
                        m51664m(3, 3);
                        break;
                    case 2:
                        m51664m(3, 6);
                        break;
                    case 3:
                        m51664m(3, 7);
                        break;
                }
                z = !z;
                i = m51665l[0] + i3;
            } else {
                m51664m(1, 3);
                m51662o(m51666k[0] - i, z);
                m51662o(m51666k[1] - m51666k[0], !z);
                i = m51666k[1];
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f39496n.flush();
    }

    /* renamed from: g */
    public final void m51669g() {
        boolean z;
        this.f39490h++;
        int[] iArr = this.f39489g;
        this.f39489g = this.f39488f;
        this.f39488f = iArr;
        this.f39492j = this.f39491i;
        this.f39491i = 0;
        boolean z2 = true;
        for (int i = 0; i < this.f39486d; i++) {
            if (((this.f39484b[i / 8] >> (7 - (i % 8))) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z == z2) {
                int[] iArr2 = this.f39488f;
                int i2 = this.f39491i;
                iArr2[i2] = i;
                this.f39491i = i2 + 1;
                z2 = !z2;
            }
        }
        m51668i();
        if (this.f39490h == this.f39487e) {
            m51663n();
            m51663n();
            m51667j();
        }
    }

    /* renamed from: i */
    public final void m51668i() {
        m51670d();
    }

    /* renamed from: j */
    public final void m51667j() {
        if (this.f39494l != 0) {
            this.f39496n.write(this.f39493k);
        }
        m51671b();
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
    public final int[] m51666k(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = r7.f39486d
            r2 = 0
            r0[r2] = r1
            r3 = 1
            r0[r3] = r1
            r1 = 0
        Lc:
            int r4 = r7.f39491i
            if (r1 >= r4) goto L27
            int[] r5 = r7.f39488f
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C5448cg.m51666k(int, boolean):int[]");
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
    public final int[] m51665l(int r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            int[] r0 = new int[r0]
            int r1 = r6.f39486d
            r2 = 0
            r0[r2] = r1
            r3 = 1
            r0[r3] = r1
            r8 = r8 ^ r3
        Lc:
            int r1 = r6.f39492j
            if (r8 >= r1) goto L27
            int[] r4 = r6.f39489g
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C5448cg.m51665l(int, boolean):int[]");
    }

    /* renamed from: m */
    public final void m51664m(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((i >> ((i2 - i5) - 1)) & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f39495m == 1) {
                byte b = this.f39493k;
                if (z) {
                    i4 = 1 << (7 - (this.f39494l % 8));
                } else {
                    i4 = 0;
                }
                this.f39493k = (byte) (i4 | b);
            } else {
                byte b2 = this.f39493k;
                if (z) {
                    i3 = 1 << (this.f39494l % 8);
                } else {
                    i3 = 0;
                }
                this.f39493k = (byte) (i3 | b2);
            }
            byte b3 = (byte) (this.f39494l + 1);
            this.f39494l = b3;
            if (b3 == 8) {
                this.f39496n.write(this.f39493k);
                m51671b();
            }
        }
    }

    /* renamed from: n */
    public final void m51663n() {
        m51664m(1, 12);
    }

    /* renamed from: o */
    public final void m51662o(int i, boolean z) {
        C5450b[] c5450bArr;
        C5450b c5450b;
        int i2 = i / 64;
        if (z) {
            c5450bArr = f39480p;
        } else {
            c5450bArr = f39482r;
        }
        while (i2 > 0) {
            if (i2 >= c5450bArr.length) {
                m51664m(c5450bArr[c5450bArr.length - 1].f39497a, c5450bArr[c5450bArr.length - 1].f39498b);
                i2 -= c5450bArr.length;
            } else {
                C5450b c5450b2 = c5450bArr[i2 - 1];
                m51664m(c5450b2.f39497a, c5450b2.f39498b);
                i2 = 0;
            }
        }
        if (z) {
            c5450b = f39479o[i % 64];
        } else {
            c5450b = f39481q[i % 64];
        }
        m51664m(c5450b.f39497a, c5450b.f39498b);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.f39484b;
        int i2 = this.f39483a;
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        this.f39483a = i3;
        if (i3 == this.f39485c) {
            m51669g();
            this.f39483a = 0;
        }
    }
}