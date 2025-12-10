package com.google.zxing;

/* loaded from: classes5.dex */
public final class Dimension {

    /* renamed from: a */
    public final int f57574a;

    /* renamed from: b */
    public final int f57575b;

    public Dimension(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            this.f57574a = i;
            this.f57575b = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.f57574a == dimension.f57574a && this.f57575b == dimension.f57575b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f57575b;
    }

    public int getWidth() {
        return this.f57574a;
    }

    public int hashCode() {
        return (this.f57574a * 32713) + this.f57575b;
    }

    public String toString() {
        return this.f57574a + "x" + this.f57575b;
    }
}
