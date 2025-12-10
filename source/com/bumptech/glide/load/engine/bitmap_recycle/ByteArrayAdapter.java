package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes3.dex */
public final class ByteArrayAdapter implements InterfaceC0920N6 {
    @Override // p000.InterfaceC0920N6
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // p000.InterfaceC0920N6
    public String getTag() {
        return "ByteArrayPool";
    }

    @Override // p000.InterfaceC0920N6
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // p000.InterfaceC0920N6
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
