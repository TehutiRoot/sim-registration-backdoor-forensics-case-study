package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public abstract class Binarizer {

    /* renamed from: a */
    public final LuminanceSource f57583a;

    public Binarizer(LuminanceSource luminanceSource) {
        this.f57583a = luminanceSource;
    }

    public abstract Binarizer createBinarizer(LuminanceSource luminanceSource);

    public abstract BitMatrix getBlackMatrix() throws NotFoundException;

    public abstract BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException;

    public final int getHeight() {
        return this.f57583a.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.f57583a;
    }

    public final int getWidth() {
        return this.f57583a.getWidth();
    }
}