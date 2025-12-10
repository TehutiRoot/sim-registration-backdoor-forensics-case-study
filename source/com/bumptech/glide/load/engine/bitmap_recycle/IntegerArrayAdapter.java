package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes3.dex */
public final class IntegerArrayAdapter implements InterfaceC0920N6 {
    @Override // p000.InterfaceC0920N6
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // p000.InterfaceC0920N6
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // p000.InterfaceC0920N6
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // p000.InterfaceC0920N6
    public int[] newArray(int i) {
        return new int[i];
    }
}
