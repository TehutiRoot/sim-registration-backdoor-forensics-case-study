package com.shockwave.pdfium.util;

/* loaded from: classes5.dex */
public class SizeF {

    /* renamed from: a */
    public final float f59069a;

    /* renamed from: b */
    public final float f59070b;

    public SizeF(float f, float f2) {
        this.f59069a = f;
        this.f59070b = f2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeF)) {
            return false;
        }
        SizeF sizeF = (SizeF) obj;
        if (this.f59069a != sizeF.f59069a || this.f59070b != sizeF.f59070b) {
            return false;
        }
        return true;
    }

    public float getHeight() {
        return this.f59070b;
    }

    public float getWidth() {
        return this.f59069a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f59069a) ^ Float.floatToIntBits(this.f59070b);
    }

    public Size toSize() {
        return new Size((int) this.f59069a, (int) this.f59070b);
    }

    public String toString() {
        return this.f59069a + "x" + this.f59070b;
    }
}
