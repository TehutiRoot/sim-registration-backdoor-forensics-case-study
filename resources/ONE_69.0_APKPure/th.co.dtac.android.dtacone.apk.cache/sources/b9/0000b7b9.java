package com.google.zxing;

/* loaded from: classes5.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {

    /* renamed from: c */
    public final byte[] f57594c;

    /* renamed from: d */
    public final int f57595d;

    /* renamed from: e */
    public final int f57596e;

    /* renamed from: f */
    public final int f57597f;

    /* renamed from: g */
    public final int f57598g;

    public PlanarYUVLuminanceSource(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.f57594c = bArr;
            this.f57595d = i;
            this.f57596e = i2;
            this.f57597f = i3;
            this.f57598g = i4;
            if (z) {
                m34245a(i5, i6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    /* renamed from: a */
    public final void m34245a(int i, int i2) {
        byte[] bArr = this.f57594c;
        int i3 = (this.f57598g * this.f57595d) + this.f57597f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f57595d;
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new PlanarYUVLuminanceSource(this.f57594c, this.f57595d, this.f57596e, this.f57597f + i, this.f57598g + i2, i3, i4, false);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i = this.f57595d;
        if (width == i && height == this.f57596e) {
            return this.f57594c;
        }
        int i2 = width * height;
        byte[] bArr = new byte[i2];
        int i3 = (this.f57598g * i) + this.f57597f;
        if (width == i) {
            System.arraycopy(this.f57594c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < height; i4++) {
            System.arraycopy(this.f57594c, i3, bArr, i4 * width, width);
            i3 += this.f57595d;
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
            System.arraycopy(this.f57594c, ((i + this.f57598g) * this.f57595d) + this.f57597f, bArr, 0, width);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: " + i);
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        byte[] bArr = this.f57594c;
        int i = (this.f57598g * this.f57595d) + this.f57597f;
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | (-16777216);
            }
            i += this.f57595d << 1;
        }
        return iArr;
    }
}