package com.google.zxing;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes5.dex */
public class ResultPoint {

    /* renamed from: a */
    public final float f57599a;

    /* renamed from: b */
    public final float f57600b;

    public ResultPoint(float f, float f2) {
        this.f57599a = f;
        this.f57600b = f2;
    }

    /* renamed from: a */
    public static float m34252a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f57599a;
        float f2 = resultPoint2.f57600b;
        return ((resultPoint3.f57599a - f) * (resultPoint.f57600b - f2)) - ((resultPoint3.f57600b - f2) * (resultPoint.f57599a - f));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f57599a, resultPoint.f57600b, resultPoint2.f57599a, resultPoint2.f57600b);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float distance = distance(resultPointArr[0], resultPointArr[1]);
        float distance2 = distance(resultPointArr[1], resultPointArr[2]);
        float distance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (distance2 >= distance && distance2 >= distance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (distance3 >= distance2 && distance3 >= distance) {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        } else {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        }
        if (m34252a(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f57599a == resultPoint.f57599a && this.f57600b == resultPoint.f57600b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f57599a;
    }

    public final float getY() {
        return this.f57600b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f57599a) * 31) + Float.floatToIntBits(this.f57600b);
    }

    public final String toString() {
        return "(" + this.f57599a + ',' + this.f57600b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
