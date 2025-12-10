package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g */
    public static final float f37619g = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    public float f37620a;

    /* renamed from: b */
    public float f37621b;

    /* renamed from: c */
    public float f37622c;

    /* renamed from: d */
    public float f37623d;

    /* renamed from: e */
    public float f37624e;

    /* renamed from: f */
    public float f37625f;

    public ArcMotion() {
        this.f37620a = 0.0f;
        this.f37621b = 0.0f;
        this.f37622c = 70.0f;
        this.f37623d = 0.0f;
        this.f37624e = 0.0f;
        this.f37625f = f37619g;
    }

    /* renamed from: a */
    public static float m52716a(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public float getMaximumAngle() {
        return this.f37622c;
    }

    public float getMinimumHorizontalAngle() {
        return this.f37620a;
    }

    public float getMinimumVerticalAngle() {
        return this.f37621b;
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.f37624e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f37623d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f37625f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            if (f18 > f20) {
                f15 = f20;
            } else {
                f15 = 0.0f;
            }
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * sqrt) + f11;
            f6 = f12 + (sqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    public void setMaximumAngle(float f) {
        this.f37622c = f;
        this.f37625f = m52716a(f);
    }

    public void setMinimumHorizontalAngle(float f) {
        this.f37620a = f;
        this.f37623d = m52716a(f);
    }

    public void setMinimumVerticalAngle(float f) {
        this.f37621b = f;
        this.f37624e = m52716a(f);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37620a = 0.0f;
        this.f37621b = 0.0f;
        this.f37622c = 70.0f;
        this.f37623d = 0.0f;
        this.f37624e = 0.0f;
        this.f37625f = f37619g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67274j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
