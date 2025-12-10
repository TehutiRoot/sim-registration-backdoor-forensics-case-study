package com.airbnb.lottie.value;

/* loaded from: classes3.dex */
public class ScaleXY {

    /* renamed from: a */
    public float f41648a;

    /* renamed from: b */
    public float f41649b;

    public ScaleXY(float f, float f2) {
        this.f41648a = f;
        this.f41649b = f2;
    }

    public boolean equals(float f, float f2) {
        if (this.f41648a == f && this.f41649b == f2) {
            return true;
        }
        return false;
    }

    public float getScaleX() {
        return this.f41648a;
    }

    public float getScaleY() {
        return this.f41649b;
    }

    public void set(float f, float f2) {
        this.f41648a = f;
        this.f41649b = f2;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}