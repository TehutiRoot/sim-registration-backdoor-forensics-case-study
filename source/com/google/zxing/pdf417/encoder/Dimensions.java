package com.google.zxing.pdf417.encoder;

/* loaded from: classes5.dex */
public final class Dimensions {

    /* renamed from: a */
    public final int f57955a;

    /* renamed from: b */
    public final int f57956b;

    /* renamed from: c */
    public final int f57957c;

    /* renamed from: d */
    public final int f57958d;

    public Dimensions(int i, int i2, int i3, int i4) {
        this.f57955a = i;
        this.f57956b = i2;
        this.f57957c = i3;
        this.f57958d = i4;
    }

    public int getMaxCols() {
        return this.f57956b;
    }

    public int getMaxRows() {
        return this.f57958d;
    }

    public int getMinCols() {
        return this.f57955a;
    }

    public int getMinRows() {
        return this.f57957c;
    }
}
