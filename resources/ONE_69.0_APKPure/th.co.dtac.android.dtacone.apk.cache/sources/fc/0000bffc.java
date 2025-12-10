package com.shockwave.pdfium.util;

/* loaded from: classes5.dex */
public class SizeF {

    /* renamed from: a */
    public final float f59081a;

    /* renamed from: b */
    public final float f59082b;

    public SizeF(float f, float f2) {
        this.f59081a = f;
        this.f59082b = f2;
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
        if (this.f59081a != sizeF.f59081a || this.f59082b != sizeF.f59082b) {
            return false;
        }
        return true;
    }

    public float getHeight() {
        return this.f59082b;
    }

    public float getWidth() {
        return this.f59081a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f59081a) ^ Float.floatToIntBits(this.f59082b);
    }

    public Size toSize() {
        return new Size((int) this.f59081a, (int) this.f59082b);
    }

    public String toString() {
        return this.f59081a + "x" + this.f59082b;
    }
}