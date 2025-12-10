package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
public final class AztecCode {

    /* renamed from: a */
    public boolean f57633a;

    /* renamed from: b */
    public int f57634b;

    /* renamed from: c */
    public int f57635c;

    /* renamed from: d */
    public int f57636d;

    /* renamed from: e */
    public BitMatrix f57637e;

    public int getCodeWords() {
        return this.f57636d;
    }

    public int getLayers() {
        return this.f57635c;
    }

    public BitMatrix getMatrix() {
        return this.f57637e;
    }

    public int getSize() {
        return this.f57634b;
    }

    public boolean isCompact() {
        return this.f57633a;
    }

    public void setCodeWords(int i) {
        this.f57636d = i;
    }

    public void setCompact(boolean z) {
        this.f57633a = z;
    }

    public void setLayers(int i) {
        this.f57635c = i;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.f57637e = bitMatrix;
    }

    public void setSize(int i) {
        this.f57634b = i;
    }
}