package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class StopLogicEngine implements StopEngine {

    /* renamed from: a */
    public float f32248a;

    /* renamed from: b */
    public float f32249b;

    /* renamed from: c */
    public float f32250c;

    /* renamed from: d */
    public float f32251d;

    /* renamed from: e */
    public float f32252e;

    /* renamed from: f */
    public float f32253f;

    /* renamed from: g */
    public float f32254g;

    /* renamed from: h */
    public float f32255h;

    /* renamed from: i */
    public float f32256i;

    /* renamed from: j */
    public int f32257j;

    /* renamed from: k */
    public String f32258k;

    /* renamed from: m */
    public float f32260m;

    /* renamed from: n */
    public float f32261n;

    /* renamed from: l */
    public boolean f32259l = false;

    /* renamed from: o */
    public boolean f32262o = false;

    /* renamed from: a */
    public final float m58703a(float f) {
        this.f32262o = false;
        float f2 = this.f32251d;
        if (f <= f2) {
            float f3 = this.f32248a;
            return (f3 * f) + ((((this.f32249b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f32257j;
        if (i == 1) {
            return this.f32254g;
        }
        float f4 = f - f2;
        float f5 = this.f32252e;
        if (f4 < f5) {
            float f6 = this.f32254g;
            float f7 = this.f32249b;
            return f6 + (f7 * f4) + ((((this.f32250c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f32255h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f32253f;
            if (f8 <= f9) {
                float f10 = this.f32255h;
                float f11 = this.f32250c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f32262o = true;
            return this.f32256i;
        }
    }

    /* renamed from: b */
    public final void m58702b(float f, float f2, float f3, float f4, float f5) {
        this.f32262o = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f32248a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.f32258k = "backward accelerate, decelerate";
                this.f32257j = 2;
                this.f32248a = f;
                this.f32249b = sqrt;
                this.f32250c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f32251d = f8;
                this.f32252e = sqrt / f3;
                this.f32254g = ((f + sqrt) * f8) / 2.0f;
                this.f32255h = f2;
                this.f32256i = f2;
                return;
            }
            this.f32258k = "backward accelerate cruse decelerate";
            this.f32257j = 3;
            this.f32248a = f;
            this.f32249b = f4;
            this.f32250c = f4;
            float f9 = (f4 - f) / f3;
            this.f32251d = f9;
            float f10 = f4 / f3;
            this.f32253f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f32252e = ((f2 - f11) - f12) / f4;
            this.f32254g = f11;
            this.f32255h = f2 - f12;
            this.f32256i = f2;
        } else if (f7 >= f2) {
            this.f32258k = "hard stop";
            this.f32257j = 1;
            this.f32248a = f;
            this.f32249b = 0.0f;
            this.f32254g = f2;
            this.f32251d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f32258k = "cruse decelerate";
                this.f32257j = 2;
                this.f32248a = f;
                this.f32249b = f;
                this.f32250c = 0.0f;
                this.f32254g = f13;
                this.f32255h = f2;
                this.f32251d = f14;
                this.f32252e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
            float f15 = (sqrt2 - f) / f3;
            this.f32251d = f15;
            float f16 = sqrt2 / f3;
            this.f32252e = f16;
            if (sqrt2 < f4) {
                this.f32258k = "accelerate decelerate";
                this.f32257j = 2;
                this.f32248a = f;
                this.f32249b = sqrt2;
                this.f32250c = 0.0f;
                this.f32251d = f15;
                this.f32252e = f16;
                this.f32254g = ((f + sqrt2) * f15) / 2.0f;
                this.f32255h = f2;
                return;
            }
            this.f32258k = "accelerate cruse decelerate";
            this.f32257j = 3;
            this.f32248a = f;
            this.f32249b = f4;
            this.f32250c = f4;
            float f17 = (f4 - f) / f3;
            this.f32251d = f17;
            float f18 = f4 / f3;
            this.f32253f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f32252e = ((f2 - f19) - f20) / f4;
            this.f32254g = f19;
            this.f32255h = f2 - f20;
            this.f32256i = f2;
        }
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z = false;
        this.f32262o = false;
        this.f32260m = f;
        if (f > f2) {
            z = true;
        }
        this.f32259l = z;
        if (z) {
            m58702b(-f3, f - f2, f5, f6, f4);
        } else {
            m58702b(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str + " ===== " + this.f32258k + "\n");
        sb.append(str);
        if (this.f32259l) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        sb.append(str2);
        sb.append(" time = ");
        sb.append(f);
        sb.append("  stages ");
        sb.append(this.f32257j);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.f32251d + " vel " + this.f32248a + " pos " + this.f32254g + "\n";
        if (this.f32257j > 1) {
            str3 = str3 + str + " dur " + this.f32252e + " vel " + this.f32249b + " pos " + this.f32255h + "\n";
        }
        if (this.f32257j > 2) {
            str3 = str3 + str + " dur " + this.f32253f + " vel " + this.f32250c + " pos " + this.f32256i + "\n";
        }
        float f2 = this.f32251d;
        if (f <= f2) {
            return str3 + str + "stage 0\n";
        }
        int i = this.f32257j;
        if (i == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f3 = f - f2;
        float f4 = this.f32252e;
        if (f3 < f4) {
            return str3 + str + " stage 1\n";
        } else if (i == 2) {
            return str3 + str + "end stage 1\n";
        } else if (f3 - f4 < this.f32253f) {
            return str3 + str + " stage 2\n";
        } else {
            return str3 + str + " end stage 2\n";
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float m58703a = m58703a(f);
        this.f32261n = f;
        if (this.f32259l) {
            return this.f32260m - m58703a;
        }
        return this.f32260m + m58703a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f2 = this.f32251d;
        if (f <= f2) {
            float f3 = this.f32248a;
            return f3 + (((this.f32249b - f3) * f) / f2);
        }
        int i = this.f32257j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f32252e;
        if (f4 < f5) {
            float f6 = this.f32249b;
            return f6 + (((this.f32250c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f32255h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f32253f;
            if (f7 < f8) {
                float f9 = this.f32250c;
                return f9 - ((f7 * f9) / f8);
            }
            return this.f32256i;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        if (getVelocity() < 1.0E-5f && Math.abs(this.f32256i - this.f32261n) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.f32259l ? -getVelocity(this.f32261n) : getVelocity(this.f32261n);
    }
}
