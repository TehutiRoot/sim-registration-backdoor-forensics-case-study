package com.google.zxing.pdf417.decoder.p017ec;

import com.google.zxing.pdf417.PDF417Common;

/* renamed from: com.google.zxing.pdf417.decoder.ec.ModulusGF */
/* loaded from: classes5.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);

    /* renamed from: a */
    public final int[] f57952a;

    /* renamed from: b */
    public final int[] f57953b;

    /* renamed from: c */
    public final C22416tt0 f57954c;

    /* renamed from: d */
    public final C22416tt0 f57955d;

    /* renamed from: e */
    public final int f57956e;

    public ModulusGF(int i, int i2) {
        this.f57956e = i;
        this.f57952a = new int[i];
        this.f57953b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f57952a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f57953b[this.f57952a[i5]] = i5;
        }
        this.f57954c = new C22416tt0(this, new int[]{0});
        this.f57955d = new C22416tt0(this, new int[]{1});
    }

    /* renamed from: a */
    public int m33944a(int i, int i2) {
        return (i + i2) % this.f57956e;
    }

    /* renamed from: b */
    public C22416tt0 m33943b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f57954c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C22416tt0(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m33942c(int i) {
        return this.f57952a[i];
    }

    /* renamed from: d */
    public C22416tt0 m33941d() {
        return this.f57955d;
    }

    /* renamed from: e */
    public int m33940e() {
        return this.f57956e;
    }

    /* renamed from: f */
    public C22416tt0 m33939f() {
        return this.f57954c;
    }

    /* renamed from: g */
    public int m33938g(int i) {
        if (i != 0) {
            return this.f57952a[(this.f57956e - this.f57953b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int m33937h(int i) {
        if (i != 0) {
            return this.f57953b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int m33936i(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f57952a;
            int[] iArr2 = this.f57953b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f57956e - 1)];
        }
        return 0;
    }

    /* renamed from: j */
    public int m33935j(int i, int i2) {
        int i3 = this.f57956e;
        return ((i + i3) - i2) % i3;
    }
}