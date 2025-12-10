package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern extends ResultPoint {

    /* renamed from: c */
    public final float f58007c;

    /* renamed from: d */
    public final int f58008d;

    public FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: b */
    public boolean m33895b(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f58007c);
        if (abs > 1.0f && abs > this.f58007c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public FinderPattern m33894c(float f, float f2, float f3) {
        int i = this.f58008d;
        int i2 = i + 1;
        float x = (i * getX()) + f2;
        float f4 = i2;
        return new FinderPattern(x / f4, ((this.f58008d * getY()) + f) / f4, ((this.f58008d * this.f58007c) + f3) / f4, i2);
    }

    /* renamed from: d */
    public int m33893d() {
        return this.f58008d;
    }

    public float getEstimatedModuleSize() {
        return this.f58007c;
    }

    public FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f58007c = f3;
        this.f58008d = i;
    }
}