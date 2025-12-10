package com.tom_roush.harmony.javax.imageio.stream;

/* loaded from: classes5.dex */
public class IIOByteBuffer {

    /* renamed from: a */
    public byte[] f59691a;

    /* renamed from: b */
    public int f59692b;

    /* renamed from: c */
    public int f59693c;

    public IIOByteBuffer(byte[] bArr, int i, int i2) {
        this.f59691a = bArr;
        this.f59692b = i;
        this.f59693c = i2;
    }

    public byte[] getData() {
        return this.f59691a;
    }

    public int getLength() {
        return this.f59693c;
    }

    public int getOffset() {
        return this.f59692b;
    }

    public void setData(byte[] bArr) {
        this.f59691a = bArr;
    }

    public void setLength(int i) {
        this.f59693c = i;
    }

    public void setOffset(int i) {
        this.f59692b = i;
    }
}
