package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public final class ByteMatrix {

    /* renamed from: a */
    public final byte[][] f58005a;

    /* renamed from: b */
    public final int f58006b;

    /* renamed from: c */
    public final int f58007c;

    public ByteMatrix(int i, int i2) {
        this.f58005a = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.f58006b = i;
        this.f58007c = i2;
    }

    public void clear(byte b) {
        for (int i = 0; i < this.f58007c; i++) {
            for (int i2 = 0; i2 < this.f58006b; i2++) {
                this.f58005a[i][i2] = b;
            }
        }
    }

    public byte get(int i, int i2) {
        return this.f58005a[i2][i];
    }

    public byte[][] getArray() {
        return this.f58005a;
    }

    public int getHeight() {
        return this.f58007c;
    }

    public int getWidth() {
        return this.f58006b;
    }

    public void set(int i, int i2, byte b) {
        this.f58005a[i2][i] = b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f58006b * 2 * this.f58007c) + 2);
        for (int i = 0; i < this.f58007c; i++) {
            for (int i2 = 0; i2 < this.f58006b; i2++) {
                byte b = this.f58005a[i][i2];
                if (b != 0) {
                    if (b != 1) {
                        sb.append("  ");
                    } else {
                        sb.append(" 1");
                    }
                } else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void set(int i, int i2, int i3) {
        this.f58005a[i2][i] = (byte) i3;
    }

    public void set(int i, int i2, boolean z) {
        this.f58005a[i2][i] = z ? (byte) 1 : (byte) 0;
    }
}
