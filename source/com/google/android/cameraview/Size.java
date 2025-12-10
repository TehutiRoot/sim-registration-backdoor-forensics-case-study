package com.google.android.cameraview;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Size implements Comparable<Size> {

    /* renamed from: a */
    public final int f43813a;

    /* renamed from: b */
    public final int f43814b;

    public Size(int i, int i2) {
        this.f43813a = i;
        this.f43814b = i2;
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
        if (this.f43813a != size.f43813a || this.f43814b != size.f43814b) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.f43814b;
    }

    public int getWidth() {
        return this.f43813a;
    }

    public int hashCode() {
        int i = this.f43814b;
        int i2 = this.f43813a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f43813a + "x" + this.f43814b;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Size size) {
        return (this.f43813a * this.f43814b) - (size.f43813a * size.f43814b);
    }
}
