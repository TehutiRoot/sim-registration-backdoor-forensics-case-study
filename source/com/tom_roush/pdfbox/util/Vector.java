package com.tom_roush.pdfbox.util;

/* loaded from: classes5.dex */
public final class Vector {

    /* renamed from: a */
    public final float f60861a;

    /* renamed from: b */
    public final float f60862b;

    public Vector(float f, float f2) {
        this.f60861a = f;
        this.f60862b = f2;
    }

    public float getX() {
        return this.f60861a;
    }

    public float getY() {
        return this.f60862b;
    }

    public Vector scale(float f) {
        return new Vector(this.f60861a * f, this.f60862b * f);
    }

    public String toString() {
        return "(" + this.f60861a + ", " + this.f60862b + ")";
    }
}
