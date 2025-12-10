package com.tom_roush.pdfbox.util;

/* loaded from: classes5.dex */
public final class Vector {

    /* renamed from: a */
    public final float f60873a;

    /* renamed from: b */
    public final float f60874b;

    public Vector(float f, float f2) {
        this.f60873a = f;
        this.f60874b = f2;
    }

    public float getX() {
        return this.f60873a;
    }

    public float getY() {
        return this.f60874b;
    }

    public Vector scale(float f) {
        return new Vector(this.f60873a * f, this.f60874b * f);
    }

    public String toString() {
        return "(" + this.f60873a + ", " + this.f60874b + ")";
    }
}