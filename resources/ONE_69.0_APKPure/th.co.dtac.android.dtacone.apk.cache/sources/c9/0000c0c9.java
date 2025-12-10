package com.tom_roush.harmony.javax.imageio.stream;

/* loaded from: classes5.dex */
public class IIOByteBuffer {

    /* renamed from: a */
    public byte[] f59703a;

    /* renamed from: b */
    public int f59704b;

    /* renamed from: c */
    public int f59705c;

    public IIOByteBuffer(byte[] bArr, int i, int i2) {
        this.f59703a = bArr;
        this.f59704b = i;
        this.f59705c = i2;
    }

    public byte[] getData() {
        return this.f59703a;
    }

    public int getLength() {
        return this.f59705c;
    }

    public int getOffset() {
        return this.f59704b;
    }

    public void setData(byte[] bArr) {
        this.f59703a = bArr;
    }

    public void setLength(int i) {
        this.f59705c = i;
    }

    public void setOffset(int i) {
        this.f59704b = i;
    }
}