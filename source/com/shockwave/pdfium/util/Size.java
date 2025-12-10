package com.shockwave.pdfium.util;

/* loaded from: classes5.dex */
public class Size {

    /* renamed from: a */
    public final int f59067a;

    /* renamed from: b */
    public final int f59068b;

    public Size(int i, int i2) {
        this.f59067a = i;
        this.f59068b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.f59067a != size.f59067a || this.f59068b != size.f59068b) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.f59068b;
    }

    public int getWidth() {
        return this.f59067a;
    }

    public int hashCode() {
        int i = this.f59068b;
        int i2 = this.f59067a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f59067a + "x" + this.f59068b;
    }
}
