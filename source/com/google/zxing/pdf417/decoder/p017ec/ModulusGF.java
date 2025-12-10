package com.google.zxing.pdf417.decoder.p017ec;

import com.google.zxing.pdf417.PDF417Common;

/* renamed from: com.google.zxing.pdf417.decoder.ec.ModulusGF */
/* loaded from: classes5.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);

    /* renamed from: a */
    public final int[] f57940a;

    /* renamed from: b */
    public final int[] f57941b;

    /* renamed from: c */
    public final C21318nt0 f57942c;

    /* renamed from: d */
    public final C21318nt0 f57943d;

    /* renamed from: e */
    public final int f57944e;

    public ModulusGF(int i, int i2) {
        this.f57944e = i;
        this.f57940a = new int[i];
        this.f57941b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f57940a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f57941b[this.f57940a[i5]] = i5;
        }
        this.f57942c = new C21318nt0(this, new int[]{0});
        this.f57943d = new C21318nt0(this, new int[]{1});
    }

    /* renamed from: a */
    public int m33952a(int i, int i2) {
        return (i + i2) % this.f57944e;
    }

    /* renamed from: b */
    public C21318nt0 m33951b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f57942c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C21318nt0(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m33950c(int i) {
        return this.f57940a[i];
    }

    /* renamed from: d */
    public C21318nt0 m33949d() {
        return this.f57943d;
    }

    /* renamed from: e */
    public int m33948e() {
        return this.f57944e;
    }

    /* renamed from: f */
    public C21318nt0 m33947f() {
        return this.f57942c;
    }

    /* renamed from: g */
    public int m33946g(int i) {
        if (i != 0) {
            return this.f57940a[(this.f57944e - this.f57941b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int m33945h(int i) {
        if (i != 0) {
            return this.f57941b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int m33944i(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f57940a;
            int[] iArr2 = this.f57941b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f57944e - 1)];
        }
        return 0;
    }

    /* renamed from: j */
    public int m33943j(int i, int i2) {
        int i3 = this.f57944e;
        return ((i + i3) - i2) % i3;
    }
}
