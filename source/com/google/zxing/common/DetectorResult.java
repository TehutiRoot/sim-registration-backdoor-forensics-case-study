package com.google.zxing.common;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public class DetectorResult {

    /* renamed from: a */
    public final BitMatrix f57756a;

    /* renamed from: b */
    public final ResultPoint[] f57757b;

    public DetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr) {
        this.f57756a = bitMatrix;
        this.f57757b = resultPointArr;
    }

    public final BitMatrix getBits() {
        return this.f57756a;
    }

    public final ResultPoint[] getPoints() {
        return this.f57757b;
    }
}
