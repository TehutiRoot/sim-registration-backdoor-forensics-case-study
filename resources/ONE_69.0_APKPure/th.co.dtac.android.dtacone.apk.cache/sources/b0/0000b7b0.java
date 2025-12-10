package com.google.zxing;

/* loaded from: classes5.dex */
public final class Dimension {

    /* renamed from: a */
    public final int f57586a;

    /* renamed from: b */
    public final int f57587b;

    public Dimension(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            this.f57586a = i;
            this.f57587b = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.f57586a == dimension.f57586a && this.f57587b == dimension.f57587b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f57587b;
    }

    public int getWidth() {
        return this.f57586a;
    }

    public int hashCode() {
        return (this.f57586a * 32713) + this.f57587b;
    }

    public String toString() {
        return this.f57586a + "x" + this.f57587b;
    }
}