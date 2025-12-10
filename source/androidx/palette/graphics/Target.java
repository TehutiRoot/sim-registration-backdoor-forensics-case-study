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
    public final float[] f36448a;

    /* renamed from: b */
    public final float[] f36449b;

    /* renamed from: c */
    public final float[] f36450c;

    /* renamed from: d */
    public boolean f36451d;

    static {
        Target target = new Target();
        LIGHT_VIBRANT = target;
        m53800c(target);
        m53797f(target);
        Target target2 = new Target();
        VIBRANT = target2;
        m53798e(target2);
        m53797f(target2);
        Target target3 = new Target();
        DARK_VIBRANT = target3;
        m53801b(target3);
        m53797f(target3);
        Target target4 = new Target();
        LIGHT_MUTED = target4;
        m53800c(target4);
        m53799d(target4);
        Target target5 = new Target();
        MUTED = target5;
        m53798e(target5);
        m53799d(target5);
        Target target6 = new Target();
        DARK_MUTED = target6;
        m53801b(target6);
        m53799d(target6);
    }

    public Target() {
        float[] fArr = new float[3];
        this.f36448a = fArr;
        float[] fArr2 = new float[3];
        this.f36449b = fArr2;
        this.f36450c = new float[3];
        this.f36451d = true;
        m53795h(fArr);
        m53795h(fArr2);
        m53796g();
    }

    /* renamed from: b */
    public static void m53801b(Target target) {
        float[] fArr = target.f36449b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: c */
    public static void m53800c(Target target) {
        float[] fArr = target.f36449b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: d */
    public static void m53799d(Target target) {
        float[] fArr = target.f36448a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: e */
    public static void m53798e(Target target) {
        float[] fArr = target.f36449b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: f */
    public static void m53797f(Target target) {
        float[] fArr = target.f36448a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: h */
    public static void m53795h(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public void m53802a() {
        int length = this.f36450c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f36450c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f36450c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f36450c;
                float f3 = fArr[i2];
                if (f3 > 0.0f) {
                    fArr[i2] = f3 / f;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m53796g() {
        float[] fArr = this.f36450c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public float getLightnessWeight() {
        return this.f36450c[1];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getMaximumLightness() {
        return this.f36449b[2];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getMaximumSaturation() {
        return this.f36448a[2];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getMinimumLightness() {
        return this.f36449b[0];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getMinimumSaturation() {
        return this.f36448a[0];
    }

    public float getPopulationWeight() {
        return this.f36450c[2];
    }

    public float getSaturationWeight() {
        return this.f36450c[0];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getTargetLightness() {
        return this.f36449b[1];
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getTargetSaturation() {
        return this.f36448a[1];
    }

    public boolean isExclusive() {
        return this.f36451d;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Target f36452a;

        public Builder() {
            this.f36452a = new Target();
        }

        @NonNull
        public Target build() {
            return this.f36452a;
        }

        @NonNull
        public Builder setExclusive(boolean z) {
            this.f36452a.f36451d = z;
            return this;
        }

        @NonNull
        public Builder setLightnessWeight(@FloatRange(from = 0.0d) float f) {
            this.f36452a.f36450c[1] = f;
            return this;
        }

        @NonNull
        public Builder setMaximumLightness(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36449b[2] = f;
            return this;
        }

        @NonNull
        public Builder setMaximumSaturation(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36448a[2] = f;
            return this;
        }

        @NonNull
        public Builder setMinimumLightness(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36449b[0] = f;
            return this;
        }

        @NonNull
        public Builder setMinimumSaturation(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36448a[0] = f;
            return this;
        }

        @NonNull
        public Builder setPopulationWeight(@FloatRange(from = 0.0d) float f) {
            this.f36452a.f36450c[2] = f;
            return this;
        }

        @NonNull
        public Builder setSaturationWeight(@FloatRange(from = 0.0d) float f) {
            this.f36452a.f36450c[0] = f;
            return this;
        }

        @NonNull
        public Builder setTargetLightness(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36449b[1] = f;
            return this;
        }

        @NonNull
        public Builder setTargetSaturation(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
            this.f36452a.f36448a[1] = f;
            return this;
        }

        public Builder(@NonNull Target target) {
            this.f36452a = new Target(target);
        }
    }

    public Target(Target target) {
        float[] fArr = new float[3];
        this.f36448a = fArr;
        float[] fArr2 = new float[3];
        this.f36449b = fArr2;
        float[] fArr3 = new float[3];
        this.f36450c = fArr3;
        this.f36451d = true;
        System.arraycopy(target.f36448a, 0, fArr, 0, fArr.length);
        System.arraycopy(target.f36449b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(target.f36450c, 0, fArr3, 0, fArr3.length);
    }
}
