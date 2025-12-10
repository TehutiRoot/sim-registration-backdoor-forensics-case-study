package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class CubicCurveData {

    /* renamed from: a */
    public final PointF f41288a;

    /* renamed from: b */
    public final PointF f41289b;

    /* renamed from: c */
    public final PointF f41290c;

    public CubicCurveData() {
        this.f41288a = new PointF();
        this.f41289b = new PointF();
        this.f41290c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.f41288a;
    }

    public PointF getControlPoint2() {
        return this.f41289b;
    }

    public PointF getVertex() {
        return this.f41290c;
    }

    public void setControlPoint1(float f, float f2) {
        this.f41288a.set(f, f2);
    }

    public void setControlPoint2(float f, float f2) {
        this.f41289b.set(f, f2);
    }

    public void setFrom(CubicCurveData cubicCurveData) {
        PointF pointF = cubicCurveData.f41290c;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = cubicCurveData.f41288a;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = cubicCurveData.f41289b;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f, float f2) {
        this.f41290c.set(f, f2);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f41290c.x), Float.valueOf(this.f41290c.y), Float.valueOf(this.f41288a.x), Float.valueOf(this.f41288a.y), Float.valueOf(this.f41289b.x), Float.valueOf(this.f41289b.y));
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f41288a = pointF;
        this.f41289b = pointF2;
        this.f41290c = pointF3;
    }
}
