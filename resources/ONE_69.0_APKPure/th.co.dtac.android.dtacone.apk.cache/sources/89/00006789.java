package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class VelocityMatrix {

    /* renamed from: a */
    public float f32374a;

    /* renamed from: b */
    public float f32375b;

    /* renamed from: c */
    public float f32376c;

    /* renamed from: d */
    public float f32377d;

    /* renamed from: e */
    public float f32378e;

    /* renamed from: f */
    public float f32379f;

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.f32376c;
        float f8 = f5 + this.f32377d;
        float f9 = f7 + (this.f32374a * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.f32375b * f6);
        float radians = (float) Math.toRadians(this.f32378e);
        double radians2 = (float) Math.toRadians(this.f32379f);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    public void clear() {
        this.f32378e = 0.0f;
        this.f32377d = 0.0f;
        this.f32376c = 0.0f;
        this.f32375b = 0.0f;
        this.f32374a = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f) {
        if (splineSet != null) {
            this.f32378e = splineSet.getSlope(f);
            this.f32379f = splineSet.get(f);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.f32374a = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.f32375b = splineSet2.getSlope(f);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.f32376c = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.f32377d = splineSet2.getSlope(f);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f) {
        if (keyCycleOscillator != null) {
            this.f32378e = keyCycleOscillator.getSlope(f);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.f32374a = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.f32375b = keyCycleOscillator2.getSlope(f);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.f32376c = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.f32377d = keyCycleOscillator2.getSlope(f);
        }
    }
}