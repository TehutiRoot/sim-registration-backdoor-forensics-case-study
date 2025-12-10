package com.google.zxing.pdf417.encoder;

/* loaded from: classes5.dex */
public final class Dimensions {

    /* renamed from: a */
    public final int f57967a;

    /* renamed from: b */
    public final int f57968b;

    /* renamed from: c */
    public final int f57969c;

    /* renamed from: d */
    public final int f57970d;

    public Dimensions(int i, int i2, int i3, int i4) {
        this.f57967a = i;
        this.f57968b = i2;
        this.f57969c = i3;
        this.f57970d = i4;
    }

    public int getMaxCols() {
        return this.f57968b;
    }

    public int getMaxRows() {
        return this.f57970d;
    }

    public int getMinCols() {
        return this.f57967a;
    }

    public int getMinRows() {
        return this.f57969c;
    }
}