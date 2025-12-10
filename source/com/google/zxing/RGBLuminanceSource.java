package com.google.zxing;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes5.dex */
public final class RGBLuminanceSource extends LuminanceSource {

    /* renamed from: c */
    public final byte[] f57587c;

    /* renamed from: d */
    public final int f57588d;

    /* renamed from: e */
    public final int f57589e;

    /* renamed from: f */
    public final int f57590f;

    /* renamed from: g */
    public final int f57591g;

    public RGBLuminanceSource(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f57588d = i;
        this.f57589e = i2;
        this.f57590f = 0;
        this.f57591g = 0;
        int i3 = i * i2;
        this.f57587c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.f57587c[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & TypedValues.PositionType.TYPE_POSITION_TYPE)) + (i5 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new RGBLuminanceSource(this.f57587c, this.f57588d, this.f57589e, this.f57590f + i, this.f57591g + i2, i3, i4);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i = this.f57588d;
        if (width == i && height == this.f57589e) {
            return this.f57587c;
        }
        int i2 = width * height;
        byte[] bArr = new byte[i2];
        int i3 = (this.f57591g * i) + this.f57590f;
        if (width == i) {
            System.arraycopy(this.f57587c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < height; i4++) {
            System.arraycopy(this.f57587c, i3, bArr, i4 * width, width);
            i3 += this.f57588d;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i, byte[] bArr) {
        if (i >= 0 && i < getHeight()) {
            int width = getWidth();
            if (bArr == null || bArr.length < width) {
                bArr = new byte[width];
            }
            System.arraycopy(this.f57587c, ((i + this.f57591g) * this.f57588d) + this.f57590f, bArr, 0, width);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: " + i);
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public RGBLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i && i6 + i4 <= i2) {
            this.f57587c = bArr;
            this.f57588d = i;
            this.f57589e = i2;
            this.f57590f = i3;
            this.f57591g = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
