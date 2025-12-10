package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class AztecCode {

    /* renamed from: a */
    public boolean f57621a;

    /* renamed from: b */
    public int f57622b;

    /* renamed from: c */
    public int f57623c;

    /* renamed from: d */
    public int f57624d;

    /* renamed from: e */
    public BitMatrix f57625e;

    public int getCodeWords() {
        return this.f57624d;
    }

    public int getLayers() {
        return this.f57623c;
    }

    public BitMatrix getMatrix() {
        return this.f57625e;
    }

    public int getSize() {
        return this.f57622b;
    }

    public boolean isCompact() {
        return this.f57621a;
    }

    public void setCodeWords(int i) {
        this.f57624d = i;
    }

    public void setCompact(boolean z) {
        this.f57621a = z;
    }

    public void setLayers(int i) {
        this.f57623c = i;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.f57625e = bitMatrix;
    }

    public void setSize(int i) {
        this.f57622b = i;
    }
}
