package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class CubicCurveData {

    /* renamed from: a */
    public final PointF f41300a;

    /* renamed from: b */
    public final PointF f41301b;

    /* renamed from: c */
    public final PointF f41302c;

    public CubicCurveData() {
        this.f41300a = new PointF();
        this.f41301b = new PointF();
        this.f41302c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f41300a;
    }

    public PointF getControlPoint2() {
        return this.f41301b;
    }

    public PointF getVertex() {
        return this.f41302c;
    }

    public void setControlPoint1(float f, float f2) {
        this.f41300a.set(f, f2);
    }

    public void setControlPoint2(float f, float f2) {
        this.f41301b.set(f, f2);
    }

    public void setFrom(CubicCurveData cubicCurveData) {
        PointF pointF = cubicCurveData.f41302c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = cubicCurveData.f41300a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = cubicCurveData.f41301b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f, float f2) {
        this.f41302c.set(f, f2);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f41302c.x), Float.valueOf(this.f41302c.y), Float.valueOf(this.f41300a.x), Float.valueOf(this.f41300a.y), Float.valueOf(this.f41301b.x), Float.valueOf(this.f41301b.y));
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f41300a = pointF;
        this.f41301b = pointF2;
        this.f41302c = pointF3;
    }
}