package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* loaded from: classes4.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* renamed from: a */
    public float f49201a;

    /* renamed from: b */
    public float f49202b;

    /* renamed from: c */
    public float f49203c;

    /* renamed from: d */
    public float f49204d;

    /* renamed from: e */
    public float f49205e;

    /* renamed from: f */
    public float f49206f = -1.0f;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.f49202b = f;
        this.f49201a = f2;
        m45652e(f3);
        this.f49205e = 0.0f;
    }

    /* renamed from: b */
    public float m45655b() {
        return this.f49204d;
    }

    /* renamed from: c */
    public float m45654c() {
        return this.f49202b;
    }

    /* renamed from: d */
    public float m45653d() {
        return this.f49201a;
    }

    /* renamed from: e */
    public void m45652e(float f) {
        if (f >= 0.0f) {
            this.f49204d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: f */
    public void m45651f(float f) {
        this.f49202b = f;
    }

    /* renamed from: g */
    public void m45650g(float f) {
        this.f49201a = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.f49203c;
        if (f6 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f7 = ((this.f49202b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f49201a;
        float f9 = f2 + this.f49205e;
        float f10 = (this.f49204d * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f11 = this.f49206f;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        shapePath.lineTo(f15, 0.0f);
        float f18 = f8 * 2.0f;
        shapePath.addArc(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f49202b;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            shapePath.addArc(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f49202b;
            shapePath.lineTo(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f49202b;
            shapePath.addArc(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        shapePath.addArc(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f49206f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.f49203c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.f49205e;
    }

    /* renamed from: h */
    public void m45649h(float f) {
        this.f49205e = f;
    }

    public void setFabCornerSize(float f) {
        this.f49206f = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f) {
        this.f49203c = f;
    }
}