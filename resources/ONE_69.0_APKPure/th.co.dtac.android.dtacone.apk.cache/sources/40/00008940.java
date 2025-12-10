package com.google.android.cameraview;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Size implements Comparable<Size> {

    /* renamed from: a */
    public final int f43825a;

    /* renamed from: b */
    public final int f43826b;

    public Size(int i, int i2) {
        this.f43825a = i;
        this.f43826b = i2;
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
        if (this.f43825a != size.f43825a || this.f43826b != size.f43826b) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.f43826b;
    }

    public int getWidth() {
        return this.f43825a;
    }

    public int hashCode() {
        int i = this.f43826b;
        int i2 = this.f43825a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f43825a + "x" + this.f43826b;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Size size) {
        return (this.f43825a * this.f43826b) - (size.f43825a * size.f43826b);
    }
}