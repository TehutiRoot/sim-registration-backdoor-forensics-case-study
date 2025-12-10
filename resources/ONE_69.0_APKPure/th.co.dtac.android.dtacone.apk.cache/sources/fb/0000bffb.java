package com.shockwave.pdfium.util;

/* loaded from: classes5.dex */
public class Size {

    /* renamed from: a */
    public final int f59079a;

    /* renamed from: b */
    public final int f59080b;

    public Size(int i, int i2) {
        this.f59079a = i;
        this.f59080b = i2;
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
        if (this.f59079a != size.f59079a || this.f59080b != size.f59080b) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.f59080b;
    }

    public int getWidth() {
        return this.f59079a;
    }

    public int hashCode() {
        int i = this.f59080b;
        int i2 = this.f59079a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f59079a + "x" + this.f59080b;
    }
}