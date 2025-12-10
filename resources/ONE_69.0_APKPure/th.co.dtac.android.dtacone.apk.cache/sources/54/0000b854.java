package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class BarcodeMatrix {

    /* renamed from: a */
    public final C10462ia[] f57963a;

    /* renamed from: b */
    public int f57964b;

    /* renamed from: c */
    public final int f57965c;

    /* renamed from: d */
    public final int f57966d;

    public BarcodeMatrix(int i, int i2) {
        C10462ia[] c10462iaArr = new C10462ia[i];
        this.f57963a = c10462iaArr;
        int length = c10462iaArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f57963a[i3] = new C10462ia(((i2 + 4) * 17) + 1);
        }
        this.f57966d = i2 * 17;
        this.f57965c = i;
        this.f57964b = -1;
    }

    /* renamed from: a */
    public C10462ia m33928a() {
        return this.f57963a[this.f57964b];
    }

    /* renamed from: b */
    public void m33927b() {
        this.f57964b++;
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f57965c * i2, this.f57966d * i);
        int i3 = this.f57965c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f57963a[i4 / i2].m30957b(i);
        }
        return bArr;
    }
}