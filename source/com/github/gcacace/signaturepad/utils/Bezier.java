package com.github.gcacace.signaturepad.utils;

/* loaded from: classes3.dex */
public class Bezier {
    public TimedPoint control1;
    public TimedPoint control2;
    public TimedPoint endPoint;
    public TimedPoint startPoint;

    public float length() {
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        int i = 0;
        while (i <= 10) {
            float f2 = i / 10;
            double point = point(f2, this.startPoint.f43756x, this.control1.f43756x, this.control2.f43756x, this.endPoint.f43756x);
            double point2 = point(f2, this.startPoint.f43757y, this.control1.f43757y, this.control2.f43757y, this.endPoint.f43757y);
            if (i > 0) {
                double d3 = point - d;
                double d4 = point2 - d2;
                f = (float) (f + Math.sqrt((d3 * d3) + (d4 * d4)));
            }
            i++;
            d2 = point2;
            d = point;
        }
        return f;
    }

    public double point(float f, float f2, float f3, float f4, float f5) {
        double d = f;
        double d2 = 1.0d - d;
        return (f2 * d2 * d2 * d2) + (f3 * 3.0d * d2 * d2 * d) + (f4 * 3.0d * d2 * d * d) + (f5 * f * f * f);
    }

    public Bezier set(TimedPoint timedPoint, TimedPoint timedPoint2, TimedPoint timedPoint3, TimedPoint timedPoint4) {
        this.startPoint = timedPoint;
        this.control1 = timedPoint2;
        this.control2 = timedPoint3;
        this.endPoint = timedPoint4;
        return this;
    }
}
