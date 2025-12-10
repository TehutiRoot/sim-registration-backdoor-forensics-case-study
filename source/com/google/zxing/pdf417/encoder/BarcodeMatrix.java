package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class BarcodeMatrix {

    /* renamed from: a */
    public final C10475ia[] f57951a;

    /* renamed from: b */
    public int f57952b;

    /* renamed from: c */
    public final int f57953c;

    /* renamed from: d */
    public final int f57954d;

    public BarcodeMatrix(int i, int i2) {
        C10475ia[] c10475iaArr = new C10475ia[i];
        this.f57951a = c10475iaArr;
        int length = c10475iaArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f57951a[i3] = new C10475ia(((i2 + 4) * 17) + 1);
        }
        this.f57954d = i2 * 17;
        this.f57953c = i;
        this.f57952b = -1;
    }

    /* renamed from: a */
    public C10475ia m33936a() {
        return this.f57951a[this.f57952b];
    }

    /* renamed from: b */
    public void m33935b() {
        this.f57952b++;
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f57953c * i2, this.f57954d * i);
        int i3 = this.f57953c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f57951a[i4 / i2].m30627b(i);
        }
        return bArr;
    }
}
