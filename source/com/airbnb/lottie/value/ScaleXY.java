package com.airbnb.lottie.value;

/* loaded from: classes3.dex */
public class ScaleXY {

    /* renamed from: a */
    public float f41636a;

    /* renamed from: b */
    public float f41637b;

    public ScaleXY(float f, float f2) {
        this.f41636a = f;
        this.f41637b = f2;
    }

    public boolean equals(float f, float f2) {
        if (this.f41636a == f && this.f41637b == f2) {
            return true;
        }
        return false;
    }

    public float getScaleX() {
        return this.f41636a;
    }

    public float getScaleY() {
        return this.f41637b;
    }

    public void set(float f, float f2) {
        this.f41636a = f;
        this.f41637b = f2;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
