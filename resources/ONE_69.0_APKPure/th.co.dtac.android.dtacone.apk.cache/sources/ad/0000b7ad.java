package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class BinaryBitmap {

    /* renamed from: a */
    public final Binarizer f57584a;

    /* renamed from: b */
    public BitMatrix f57585b;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer != null) {
            this.f57584a = binarizer;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public BinaryBitmap crop(int i, int i2, int i3, int i4) {
        return new BinaryBitmap(this.f57584a.createBinarizer(this.f57584a.getLuminanceSource().crop(i, i2, i3, i4)));
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.f57585b == null) {
            this.f57585b = this.f57584a.getBlackMatrix();
        }
        return this.f57585b;
    }

    public BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException {
        return this.f57584a.getBlackRow(i, bitArray);
    }

    public int getHeight() {
        return this.f57584a.getHeight();
    }

    public int getWidth() {
        return this.f57584a.getWidth();
    }

    public boolean isCropSupported() {
        return this.f57584a.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.f57584a.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        return new BinaryBitmap(this.f57584a.createBinarizer(this.f57584a.getLuminanceSource().rotateCounterClockwise()));
    }

    public BinaryBitmap rotateCounterClockwise45() {
        return new BinaryBitmap(this.f57584a.createBinarizer(this.f57584a.getLuminanceSource().rotateCounterClockwise45()));
    }

    public String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}