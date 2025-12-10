package androidx.palette.graphics;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class Target {
    public static final Target DARK_MUTED;
    public static final Target DARK_VIBRANT;
    public static final Target LIGHT_MUTED;
    public static final Target LIGHT_VIBRANT;
    public static final Target MUTED;
    public static final Target VIBRANT;

    /* renamed from: a */
    public final float[] f36536a;

    /* renamed from: b */
    public final float[] f36537b;

    /* renamed from: c */
    public final float[] f36538c;

    /* renamed from: d */
    public boolean f36539d;

    static {
        Target target = new Target();
        LIGHT_VIBRANT = target;
        m53751c(target);
        m53748f(target);
        Target target2 = new Target();
        VIBRANT = target2;
        m53749e(target2);
        m53748f(target2);
        Target target3 = new Target();
        DARK_VIBRANT = target3;
        m53752b(target3);
        m53748f(target3);
        Target target4 = new Target();
        LIGHT_MUTED = target4;
        m53751c(target4);
        m53750d(target4);
        Target target5 = new Target();
        MUTED = target5;
        m53749e(target5);
        m53750d(target5);
        Target target6 = new Target();
        DARK_MUTED = target6;
        m53752b(target6);
        m53750d(target6);
    }

    public Target() {
        float[] fArr = new float[3];
        this.f36536a = fArr;
        float[] fArr2 = new float[3];
        this.f36537b = fArr2;
        this.f36538c = new float[3];
        this.f36539d = true;
        m53746h(fArr);
        m53746h(fArr2);
        m53747g();
    }

    /* renamed from: b */
    public static void m53752b(Target target) {
        float[] fArr = target.f36537b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: c */
    public static void m53751c(Target target) {
        float[] fArr = target.f36537b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: d */
    public static void m53750d(Target target) {
        float[] fArr = target.f36536a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: e */
    public static void m53749e(Target target) {
        float[] fArr = target.f36537b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: f */
    public static void m53748f(Target target) {
        float[] fArr = target.f36536a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: h */
    public static void m53746h(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public void m53753a() {
        int length = this.f36538c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f36538c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f36538c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f36538c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m53747g() {
        float[] fArr = this.f36538c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public float getLightnessWeight() {
        return this.f36538c[1];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getMaximumLightness() {
        return this.f36537b[2];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getMaximumSaturation() {
        return this.f36536a[2];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getMinimumLightness() {
        return this.f36537b[0];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getMinimumSaturation() {
        return this.f36536a[0];
    }

    public float getPopulationWeight() {
        return this.f36538c[2];
    }

    public float getSaturationWeight() {
        return this.f36538c[0];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getTargetLightness() {
        return this.f36537b[1];
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getTargetSaturation() {
        return this.f36536a[1];
    }

    public boolean isExclusive() {
        return this.f36539d;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Target f36540a;

        public Builder() {
            this.f36540a = new Target();
        }

        @NonNull
        public Target build() {
            return this.f36540a;
        }

        @NonNull
        public Builder setExclusive(boolean z) {
            this.f36540a.f36539d = z;
            return this;
        }

        @NonNull
        public Builder setLightnessWeight(@FloatRange(from = 0.0d) float f) {
            this.f36540a.f36538c[1] = f;
            return this;
        }

        @NonNull
        public Builder setMaximumLightness(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36537b[2] = f;
            return this;
        }

        @NonNull
        public Builder setMaximumSaturation(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36536a[2] = f;
            return this;
        }

        @NonNull
        public Builder setMinimumLightness(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36537b[0] = f;
            return this;
        }

        @NonNull
        public Builder setMinimumSaturation(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36536a[0] = f;
            return this;
        }

        @NonNull
        public Builder setPopulationWeight(@FloatRange(from = 0.0d) float f) {
            this.f36540a.f36538c[2] = f;
            return this;
        }

        @NonNull
        public Builder setSaturationWeight(@FloatRange(from = 0.0d) float f) {
            this.f36540a.f36538c[0] = f;
            return this;
        }

        @NonNull
        public Builder setTargetLightness(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36537b[1] = f;
            return this;
        }

        @NonNull
        public Builder setTargetSaturation(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
            this.f36540a.f36536a[1] = f;
            return this;
        }

        public Builder(@NonNull Target target) {
            this.f36540a = new Target(target);
        }
    }

    public Target(Target target) {
        float[] fArr = new float[3];
        this.f36536a = fArr;
        float[] fArr2 = new float[3];
        this.f36537b = fArr2;
        float[] fArr3 = new float[3];
        this.f36538c = fArr3;
        this.f36539d = true;
        System.arraycopy(target.f36536a, 0, fArr, 0, fArr.length);
        System.arraycopy(target.f36537b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(target.f36538c, 0, fArr3, 0, fArr3.length);
    }
}