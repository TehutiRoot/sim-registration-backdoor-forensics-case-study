package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class VelocityMatrix {

    /* renamed from: a */
    public float f32286a;

    /* renamed from: b */
    public float f32287b;

    /* renamed from: c */
    public float f32288c;

    /* renamed from: d */
    public float f32289d;

    /* renamed from: e */
    public float f32290e;

    /* renamed from: f */
    public float f32291f;

    public void applyTransform(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.f32288c;
        float f8 = f5 + this.f32289d;
        float f9 = f7 + (this.f32286a * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.f32287b * f6);
        float radians = (float) Math.toRadians(this.f32290e);
        double radians2 = (float) Math.toRadians(this.f32291f);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    public void clear() {
        this.f32290e = 0.0f;
        this.f32289d = 0.0f;
        this.f32288c = 0.0f;
        this.f32287b = 0.0f;
        this.f32286a = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f) {
        if (splineSet != null) {
            this.f32290e = splineSet.getSlope(f);
            this.f32291f = splineSet.get(f);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.f32286a = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.f32287b = splineSet2.getSlope(f);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f) {
        if (splineSet != null) {
            this.f32288c = splineSet.getSlope(f);
        }
        if (splineSet2 != null) {
            this.f32289d = splineSet2.getSlope(f);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f) {
        if (keyCycleOscillator != null) {
            this.f32290e = keyCycleOscillator.getSlope(f);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.f32286a = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.f32287b = keyCycleOscillator2.getSlope(f);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f) {
        if (keyCycleOscillator != null) {
            this.f32288c = keyCycleOscillator.getSlope(f);
        }
        if (keyCycleOscillator2 != null) {
            this.f32289d = keyCycleOscillator2.getSlope(f);
        }
    }
}
