package com.tom_roush.fontbox.cmap;

/* loaded from: classes5.dex */
public class CodespaceRange {

    /* renamed from: a */
    public byte[] f59368a;

    /* renamed from: b */
    public byte[] f59369b;

    /* renamed from: c */
    public int[] f59370c;

    /* renamed from: d */
    public int[] f59371d;

    /* renamed from: e */
    public int f59372e;

    public CodespaceRange(byte[] bArr, byte[] bArr2) {
        this.f59372e = 0;
        if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
            bArr = new byte[bArr2.length];
        } else if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("The start and the end values must not have different lengths.");
        }
        this.f59370c = new int[bArr.length];
        this.f59371d = new int[bArr2.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f59370c[i] = bArr[i] & 255;
            this.f59371d[i] = bArr2[i] & 255;
        }
        this.f59372e = bArr2.length;
    }

    public int getCodeLength() {
        return this.f59372e;
    }

    public byte[] getEnd() {
        return this.f59369b;
    }

    public byte[] getStart() {
        return this.f59368a;
    }

    public boolean isFullMatch(byte[] bArr, int i) {
        if (this.f59372e != i) {
            return false;
        }
        for (int i2 = 0; i2 < this.f59372e; i2++) {
            int i3 = bArr[i2] & 255;
            if (i3 < this.f59370c[i2] || i3 > this.f59371d[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean matches(byte[] bArr) {
        return isFullMatch(bArr, bArr.length);
    }

    public CodespaceRange() {
        this.f59372e = 0;
    }
}