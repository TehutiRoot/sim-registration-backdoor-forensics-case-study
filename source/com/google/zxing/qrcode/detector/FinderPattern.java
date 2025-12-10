package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern extends ResultPoint {

    /* renamed from: c */
    public final float f57995c;

    /* renamed from: d */
    public final int f57996d;

    public FinderPattern(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    /* renamed from: b */
    public boolean m33903b(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f57995c);
        if (abs > 1.0f && abs > this.f57995c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public FinderPattern m33902c(float f, float f2, float f3) {
        int i = this.f57996d;
        int i2 = i + 1;
        float x = (i * getX()) + f2;
        float f4 = i2;
        return new FinderPattern(x / f4, ((this.f57996d * getY()) + f) / f4, ((this.f57996d * this.f57995c) + f3) / f4, i2);
    }

    /* renamed from: d */
    public int m33901d() {
        return this.f57996d;
    }

    public float getEstimatedModuleSize() {
        return this.f57995c;
    }

    public FinderPattern(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f57995c = f3;
        this.f57996d = i;
    }
}
