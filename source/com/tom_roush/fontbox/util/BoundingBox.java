package com.tom_roush.fontbox.util;

import java.util.List;

/* loaded from: classes5.dex */
public class BoundingBox {

    /* renamed from: a */
    public float f59686a;

    /* renamed from: b */
    public float f59687b;

    /* renamed from: c */
    public float f59688c;

    /* renamed from: d */
    public float f59689d;

    public BoundingBox() {
    }

    public boolean contains(float f, float f2) {
        if (f >= this.f59686a && f <= this.f59688c && f2 >= this.f59687b && f2 <= this.f59689d) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return getUpperRightY() - getLowerLeftY();
    }

    public float getLowerLeftX() {
        return this.f59686a;
    }

    public float getLowerLeftY() {
        return this.f59687b;
    }

    public float getUpperRightX() {
        return this.f59688c;
    }

    public float getUpperRightY() {
        return this.f59689d;
    }

    public float getWidth() {
        return getUpperRightX() - getLowerLeftX();
    }

    public void setLowerLeftX(float f) {
        this.f59686a = f;
    }

    public void setLowerLeftY(float f) {
        this.f59687b = f;
    }

    public void setUpperRightX(float f) {
        this.f59688c = f;
    }

    public void setUpperRightY(float f) {
        this.f59689d = f;
    }

    public String toString() {
        return "[" + getLowerLeftX() + "," + getLowerLeftY() + "," + getUpperRightX() + "," + getUpperRightY() + "]";
    }

    public BoundingBox(float f, float f2, float f3, float f4) {
        this.f59686a = f;
        this.f59687b = f2;
        this.f59688c = f3;
        this.f59689d = f4;
    }

    public BoundingBox(List<Number> list) {
        this.f59686a = list.get(0).floatValue();
        this.f59687b = list.get(1).floatValue();
        this.f59688c = list.get(2).floatValue();
        this.f59689d = list.get(3).floatValue();
    }
}
