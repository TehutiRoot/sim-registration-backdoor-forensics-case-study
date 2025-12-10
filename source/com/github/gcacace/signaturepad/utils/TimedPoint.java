package com.github.gcacace.signaturepad.utils;

/* loaded from: classes3.dex */
public class TimedPoint {
    public long timestamp;

    /* renamed from: x */
    public float f43756x;

    /* renamed from: y */
    public float f43757y;

    public float distanceTo(TimedPoint timedPoint) {
        return (float) Math.sqrt(Math.pow(timedPoint.f43756x - this.f43756x, 2.0d) + Math.pow(timedPoint.f43757y - this.f43757y, 2.0d));
    }

    public TimedPoint set(float f, float f2) {
        this.f43756x = f;
        this.f43757y = f2;
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    public float velocityFrom(TimedPoint timedPoint) {
        long j = this.timestamp - timedPoint.timestamp;
        if (j <= 0) {
            j = 1;
        }
        float distanceTo = distanceTo(timedPoint) / ((float) j);
        if (Float.isInfinite(distanceTo) || Float.isNaN(distanceTo)) {
            return 0.0f;
        }
        return distanceTo;
    }
}
