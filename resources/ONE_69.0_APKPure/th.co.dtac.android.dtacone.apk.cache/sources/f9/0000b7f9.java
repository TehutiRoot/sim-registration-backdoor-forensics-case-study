package com.google.zxing.common;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public class DetectorResult {

    /* renamed from: a */
    public final BitMatrix f57768a;

    /* renamed from: b */
    public final ResultPoint[] f57769b;

    public DetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr) {
        this.f57768a = bitMatrix;
        this.f57769b = resultPointArr;
    }

    public final BitMatrix getBits() {
        return this.f57768a;
    }

    public final ResultPoint[] getPoints() {
        return this.f57769b;
    }
}