package com.tom_roush.fontbox.util;

import java.util.List;

/* loaded from: classes5.dex */
public class BoundingBox {

    /* renamed from: a */
    public float f59698a;

    /* renamed from: b */
    public float f59699b;

    /* renamed from: c */
    public float f59700c;

    /* renamed from: d */
    public float f59701d;

    public BoundingBox() {
    }

    public boolean contains(float f, float f2) {
        if (f >= this.f59698a && f <= this.f59700c && f2 >= this.f59699b && f2 <= this.f59701d) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return getUpperRightY() - getLowerLeftY();
    }

    public float getLowerLeftX() {
        return this.f59698a;
    }

    public float getLowerLeftY() {
        return this.f59699b;
    }

    public float getUpperRightX() {
        return this.f59700c;
    }

    public float getUpperRightY() {
        return this.f59701d;
    }

    public float getWidth() {
        return getUpperRightX() - getLowerLeftX();
    }

    public void setLowerLeftX(float f) {
        this.f59698a = f;
    }

    public void setLowerLeftY(float f) {
        this.f59699b = f;
    }

    public void setUpperRightX(float f) {
        this.f59700c = f;
    }

    public void setUpperRightY(float f) {
        this.f59701d = f;
    }

    public String toString() {
        return "[" + getLowerLeftX() + "," + getLowerLeftY() + "," + getUpperRightX() + "," + getUpperRightY() + "]";
    }

    public BoundingBox(float f, float f2, float f3, float f4) {
        this.f59698a = f;
        this.f59699b = f2;
        this.f59700c = f3;
        this.f59701d = f4;
    }

    public BoundingBox(List<Number> list) {
        this.f59698a = list.get(0).floatValue();
        this.f59699b = list.get(1).floatValue();
        this.f59700c = list.get(2).floatValue();
        this.f59701d = list.get(3).floatValue();
    }
}