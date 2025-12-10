package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class QRCodeDecoderMetaData {

    /* renamed from: a */
    public final boolean f57987a;

    public QRCodeDecoderMetaData(boolean z) {
        this.f57987a = z;
    }

    public void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (this.f57987a && resultPointArr != null && resultPointArr.length >= 3) {
            ResultPoint resultPoint = resultPointArr[0];
            resultPointArr[0] = resultPointArr[2];
            resultPointArr[2] = resultPoint;
        }
    }

    public boolean isMirrored() {
        return this.f57987a;
    }
}