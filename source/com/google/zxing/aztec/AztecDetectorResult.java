package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* loaded from: classes5.dex */
public final class AztecDetectorResult extends DetectorResult {

    /* renamed from: c */
    public final boolean f57601c;

    /* renamed from: d */
    public final int f57602d;

    /* renamed from: e */
    public final int f57603e;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z, int i, int i2) {
        super(bitMatrix, resultPointArr);
        this.f57601c = z;
        this.f57602d = i;
        this.f57603e = i2;
    }

    public int getNbDatablocks() {
        return this.f57602d;
    }

    public int getNbLayers() {
        return this.f57603e;
    }

    public boolean isCompact() {
        return this.f57601c;
    }
}
