package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.c */
/* loaded from: classes.dex */
public final class C2905c implements FloatDecayAnimationSpec {

    /* renamed from: a */
    public final float f13347a;

    public C2905c(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f13347a = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public final float m61298a(float f) {
        float f2;
        double d;
        double d2;
        double m61297b = m61297b(f);
        f2 = WindowInsetsConnection_androidKt.f13279a;
        d = WindowInsetsConnection_androidKt.f13280b;
        d2 = WindowInsetsConnection_androidKt.f13281c;
        return ((float) (f2 * this.f13347a * Math.exp((d / d2) * m61297b))) * Math.signum(f);
    }

    /* renamed from: b */
    public final double m61297b(float f) {
        float f2;
        AndroidFlingSpline androidFlingSpline = AndroidFlingSpline.f13072a;
        f2 = WindowInsetsConnection_androidKt.f13279a;
        return androidFlingSpline.m61429a(f, f2 * this.f13347a);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f, float f2) {
        double d;
        double m61297b = m61297b(f2);
        d = WindowInsetsConnection_androidKt.f13281c;
        return (long) (Math.exp(m61297b / d) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        return f + m61298a(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return f + (m61298a(f2) * AndroidFlingSpline.FlingResult.m69473getDistanceCoefficientimpl(AndroidFlingSpline.f13072a.m61428b(f3)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f, float f2) {
        float f3;
        long durationNanos = getDurationNanos(0.0f, f2);
        if (durationNanos > 0) {
            f3 = ((float) j) / ((float) durationNanos);
        } else {
            f3 = 1.0f;
        }
        return ((AndroidFlingSpline.FlingResult.m69474getVelocityCoefficientimpl(AndroidFlingSpline.f13072a.m61428b(f3)) * m61298a(f2)) / ((float) durationNanos)) * 1.0E9f;
    }
}
