package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* loaded from: classes5.dex */
public final class AztecDetectorResult extends DetectorResult {

    /* renamed from: c */
    public final boolean f57613c;

    /* renamed from: d */
    public final int f57614d;

    /* renamed from: e */
    public final int f57615e;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z, int i, int i2) {
        super(bitMatrix, resultPointArr);
        this.f57613c = z;
        this.f57614d = i;
        this.f57615e = i2;
    }

    public int getNbDatablocks() {
        return this.f57614d;
    }

    public int getNbLayers() {
        return this.f57615e;
    }

    public boolean isCompact() {
        return this.f57613c;
    }
}