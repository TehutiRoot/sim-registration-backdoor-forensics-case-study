package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class StopLogicEngine implements StopEngine {

    /* renamed from: a */
    public float f32336a;

    /* renamed from: b */
    public float f32337b;

    /* renamed from: c */
    public float f32338c;

    /* renamed from: d */
    public float f32339d;

    /* renamed from: e */
    public float f32340e;

    /* renamed from: f */
    public float f32341f;

    /* renamed from: g */
    public float f32342g;

    /* renamed from: h */
    public float f32343h;

    /* renamed from: i */
    public float f32344i;

    /* renamed from: j */
    public int f32345j;

    /* renamed from: k */
    public String f32346k;

    /* renamed from: m */
    public float f32348m;

    /* renamed from: n */
    public float f32349n;

    /* renamed from: l */
    public boolean f32347l = false;

    /* renamed from: o */
    public boolean f32350o = false;

    /* renamed from: a */
    public final float m58653a(float f) {
        this.f32350o = false;
        float f2 = this.f32339d;
        if (f <= f2) {
            float f3 = this.f32336a;
            return (f3 * f) + ((((this.f32337b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f32345j;
        if (i == 1) {
            return this.f32342g;
        }
        float f4 = f - f2;
        float f5 = this.f32340e;
        if (f4 < f5) {
            float f6 = this.f32342g;
            float f7 = this.f32337b;
            return f6 + (f7 * f4) + ((((this.f32338c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f32343h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f32341f;
            if (f8 <= f9) {
                float f10 = this.f32343h;
                float f11 = this.f32338c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f32350o = true;
            return this.f32344i;
        }
    }

    /* renamed from: b */
    public final void m58652b(float f, float f2, float f3, float f4, float f5) {
        this.f32350o = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f32336a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.f32346k = "backward accelerate, decelerate";
                this.f32345j = 2;
                this.f32336a = f;
                this.f32337b = sqrt;
                this.f32338c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f32339d = f8;
                this.f32340e = sqrt / f3;
                this.f32342g = ((f + sqrt) * f8) / 2.0f;
                this.f32343h = f2;
                this.f32344i = f2;
                return;
            }
            this.f32346k = "backward accelerate cruse decelerate";
            this.f32345j = 3;
            this.f32336a = f;
            this.f32337b = f4;
            this.f32338c = f4;
            float f9 = (f4 - f) / f3;
            this.f32339d = f9;
            float f10 = f4 / f3;
            this.f32341f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f32340e = ((f2 - f11) - f12) / f4;
            this.f32342g = f11;
            this.f32343h = f2 - f12;
            this.f32344i = f2;
        } else if (f7 >= f2) {
            this.f32346k = "hard stop";
            this.f32345j = 1;
            this.f32336a = f;
            this.f32337b = 0.0f;
            this.f32342g = f2;
            this.f32339d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f32346k = "cruse decelerate";
                this.f32345j = 2;
                this.f32336a = f;
                this.f32337b = f;
                this.f32338c = 0.0f;
                this.f32342g = f13;
                this.f32343h = f2;
                this.f32339d = f14;
                this.f32340e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
            float f15 = (sqrt2 - f) / f3;
            this.f32339d = f15;
            float f16 = sqrt2 / f3;
            this.f32340e = f16;
            if (sqrt2 < f4) {
                this.f32346k = "accelerate decelerate";
                this.f32345j = 2;
                this.f32336a = f;
                this.f32337b = sqrt2;
                this.f32338c = 0.0f;
                this.f32339d = f15;
                this.f32340e = f16;
                this.f32342g = ((f + sqrt2) * f15) / 2.0f;
                this.f32343h = f2;
                return;
            }
            this.f32346k = "accelerate cruse decelerate";
            this.f32345j = 3;
            this.f32336a = f;
            this.f32337b = f4;
            this.f32338c = f4;
            float f17 = (f4 - f) / f3;
            this.f32339d = f17;
            float f18 = f4 / f3;
            this.f32341f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f32340e = ((f2 - f19) - f20) / f4;
            this.f32342g = f19;
            this.f32343h = f2 - f20;
            this.f32344i = f2;
        }
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z = false;
        this.f32350o = false;
        this.f32348m = f;
        if (f > f2) {
            z = true;
        }
        this.f32347l = z;
        if (z) {
            m58652b(-f3, f - f2, f5, f6, f4);
        } else {
            m58652b(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ===== " + this.f32346k + "\n");
        sb.append(str);
        if (this.f32347l) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        sb.append(str2);
        sb.append(" time = ");
        sb.append(f);
        sb.append("  stages ");
        sb.append(this.f32345j);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f32339d + " vel " + this.f32336a + " pos " + this.f32342g + "\n";
        if (this.f32345j > 1) {
            str3 = str3 + str + " dur " + this.f32340e + " vel " + this.f32337b + " pos " + this.f32343h + "\n";
        }
        if (this.f32345j > 2) {
            str3 = str3 + str + " dur " + this.f32341f + " vel " + this.f32338c + " pos " + this.f32344i + "\n";
        }
        float f2 = this.f32339d;
        if (f <= f2) {
            return str3 + str + "stage 0\n";
        }
        int i = this.f32345j;
        if (i == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f3 = f - f2;
        float f4 = this.f32340e;
        if (f3 < f4) {
            return str3 + str + " stage 1\n";
        } else if (i == 2) {
            return str3 + str + "end stage 1\n";
        } else if (f3 - f4 < this.f32341f) {
            return str3 + str + " stage 2\n";
        } else {
            return str3 + str + " end stage 2\n";
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float m58653a = m58653a(f);
        this.f32349n = f;
        if (this.f32347l) {
            return this.f32348m - m58653a;
        }
        return this.f32348m + m58653a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f2 = this.f32339d;
        if (f <= f2) {
            float f3 = this.f32336a;
            return f3 + (((this.f32337b - f3) * f) / f2);
        }
        int i = this.f32345j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f32340e;
        if (f4 < f5) {
            float f6 = this.f32337b;
            return f6 + (((this.f32338c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f32343h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f32341f;
            if (f7 < f8) {
                float f9 = this.f32338c;
                return f9 - ((f7 * f9) / f8);
            }
            return this.f32344i;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        if (getVelocity() < 1.0E-5f && Math.abs(this.f32344i - this.f32349n) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.f32347l ? -getVelocity(this.f32349n) : getVelocity(this.f32349n);
    }
}