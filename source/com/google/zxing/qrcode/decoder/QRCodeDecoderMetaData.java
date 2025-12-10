package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class QRCodeDecoderMetaData {

    /* renamed from: a */
    public final boolean f57975a;

    public QRCodeDecoderMetaData(boolean z) {
        this.f57975a = z;
    }

    public void applyMirroredCorrection(ResultPoint[] resultPointArr) {
        if (this.f57975a && resultPointArr != null && resultPointArr.length >= 3) {
            ResultPoint resultPoint = resultPointArr[0];
            resultPointArr[0] = resultPointArr[2];
            resultPointArr[2] = resultPoint;
        }
    }

    public boolean isMirrored() {
        return this.f57975a;
    }
}
