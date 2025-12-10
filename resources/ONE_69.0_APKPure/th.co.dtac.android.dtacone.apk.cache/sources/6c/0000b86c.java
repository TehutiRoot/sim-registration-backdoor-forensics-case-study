package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class AlignmentPattern extends ResultPoint {

    /* renamed from: c */
    public final float f58004c;

    public AlignmentPattern(float f, float f2, float f3) {
        super(f, f2);
        this.f58004c = f3;
    }

    /* renamed from: b */
    public boolean m33903b(float f, float f2, float f3) {
        if (Math.abs(f2 - getY()) > f || Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f58004c);
        if (abs > 1.0f && abs > this.f58004c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public AlignmentPattern m33902c(float f, float f2, float f3) {
        return new AlignmentPattern((getX() + f2) / 2.0f, (getY() + f) / 2.0f, (this.f58004c + f3) / 2.0f);
    }
}