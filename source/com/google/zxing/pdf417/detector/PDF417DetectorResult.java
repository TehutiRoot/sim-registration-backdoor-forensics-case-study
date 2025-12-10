package com.google.zxing.pdf417.detector;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDF417DetectorResult {

    /* renamed from: a */
    public final BitMatrix f57949a;

    /* renamed from: b */
    public final List f57950b;

    public PDF417DetectorResult(BitMatrix bitMatrix, List<ResultPoint[]> list) {
        this.f57949a = bitMatrix;
        this.f57950b = list;
    }

    public BitMatrix getBits() {
        return this.f57949a;
    }

    public List<ResultPoint[]> getPoints() {
        return this.f57950b;
    }
}
