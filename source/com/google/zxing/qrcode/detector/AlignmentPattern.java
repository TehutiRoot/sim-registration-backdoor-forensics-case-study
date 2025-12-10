package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class AlignmentPattern extends ResultPoint {

    /* renamed from: c */
    public final float f57992c;

    public AlignmentPattern(float f, float f2, float f3) {
        super(f, f2);
        this.f57992c = f3;
    }

    /* renamed from: b */
    public boolean m33911b(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f57992c);
        if (abs > 1.0f && abs > this.f57992c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public AlignmentPattern m33910c(float f, float f2, float f3) {
        return new AlignmentPattern((getX() + f2) / 2.0f, (getY() + f) / 2.0f, (this.f57992c + f3) / 2.0f);
    }
}
