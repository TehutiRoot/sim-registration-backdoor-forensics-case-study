package com.google.zxing;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes5.dex */
public class ResultPoint {

    /* renamed from: a */
    public final float f57611a;

    /* renamed from: b */
    public final float f57612b;

    public ResultPoint(float f, float f2) {
        this.f57611a = f;
        this.f57612b = f2;
    }

    /* renamed from: a */
    public static float m34244a(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f57611a;
        float f2 = resultPoint2.f57612b;
        return ((resultPoint3.f57611a - f) * (resultPoint.f57612b - f2)) - ((resultPoint3.f57612b - f2) * (resultPoint.f57611a - f));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f57611a, resultPoint.f57612b, resultPoint2.f57611a, resultPoint2.f57612b);
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
        if (m34244a(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
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
            if (this.f57611a == resultPoint.f57611a && this.f57612b == resultPoint.f57612b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f57611a;
    }

    public final float getY() {
        return this.f57612b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f57611a) * 31) + Float.floatToIntBits(this.f57612b);
    }

    public final String toString() {
        return "(" + this.f57611a + ',' + this.f57612b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}