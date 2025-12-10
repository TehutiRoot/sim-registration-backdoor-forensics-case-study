package p000;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: Lt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18050Lt0 implements Comparable {

    /* renamed from: t */
    public static String[] f3738t = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: a */
    public Easing f3739a;

    /* renamed from: c */
    public float f3741c;

    /* renamed from: d */
    public float f3742d;

    /* renamed from: e */
    public float f3743e;

    /* renamed from: f */
    public float f3744f;

    /* renamed from: g */
    public float f3745g;

    /* renamed from: h */
    public float f3746h;

    /* renamed from: k */
    public int f3749k;

    /* renamed from: l */
    public int f3750l;

    /* renamed from: m */
    public float f3751m;

    /* renamed from: n */
    public MotionController f3752n;

    /* renamed from: o */
    public LinkedHashMap f3753o;

    /* renamed from: p */
    public int f3754p;

    /* renamed from: q */
    public int f3755q;

    /* renamed from: r */
    public double[] f3756r;

    /* renamed from: s */
    public double[] f3757s;

    /* renamed from: b */
    public int f3740b = 0;

    /* renamed from: i */
    public float f3747i = Float.NaN;

    /* renamed from: j */
    public float f3748j = Float.NaN;

    public C18050Lt0() {
        int i = Key.UNSET;
        this.f3749k = i;
        this.f3750l = i;
        this.f3751m = Float.NaN;
        this.f3752n = null;
        this.f3753o = new LinkedHashMap();
        this.f3754p = 0;
        this.f3756r = new double[18];
        this.f3757s = new double[18];
    }

    /* renamed from: a */
    public void m67486a(ConstraintSet.Constraint constraint) {
        this.f3739a = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.f3749k = motion.mPathMotionArc;
        this.f3750l = motion.mAnimateRelativeTo;
        this.f3747i = motion.mPathRotate;
        this.f3740b = motion.mDrawPath;
        this.f3755q = motion.mAnimateCircleAngleTo;
        this.f3748j = constraint.propertySet.mProgress;
        this.f3751m = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.f3753o.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C18050Lt0 c18050Lt0) {
        return Float.compare(this.f3742d, c18050Lt0.f3742d);
    }

    /* renamed from: c */
    public final boolean m67484c(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) <= 1.0E-6f) {
                return false;
            }
            return true;
        } else if (Float.isNaN(f) == Float.isNaN(f2)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public void m67483d(C18050Lt0 c18050Lt0, boolean[] zArr, String[] strArr, boolean z) {
        boolean m67484c = m67484c(this.f3743e, c18050Lt0.f3743e);
        boolean m67484c2 = m67484c(this.f3744f, c18050Lt0.f3744f);
        zArr[0] = zArr[0] | m67484c(this.f3742d, c18050Lt0.f3742d);
        boolean z2 = m67484c | m67484c2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m67484c(this.f3745g, c18050Lt0.f3745g);
        zArr[4] = m67484c(this.f3746h, c18050Lt0.f3746h) | zArr[4];
    }

    /* renamed from: e */
    public void m67482e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f3742d, this.f3743e, this.f3744f, this.f3745g, this.f3746h, this.f3747i};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: f */
    public void m67481f(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f3743e;
        float f2 = this.f3744f;
        float f3 = this.f3745g;
        float f4 = this.f3746h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        MotionController motionController = this.f3752n;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: g */
    public void m67480g(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f3743e;
        float f3 = this.f3744f;
        float f4 = this.f3745g;
        float f5 = this.f3746h;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f10;
                            f9 = f11;
                        }
                    } else {
                        f4 = f10;
                        f7 = f11;
                    }
                } else {
                    f3 = f10;
                    f8 = f11;
                }
            } else {
                f2 = f10;
                f6 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        MotionController motionController = this.f3752n;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            double d4 = f6;
            double d5 = f8;
            float sin = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((f18 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((f15 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f16 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: h */
    public int m67479h(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f3753o.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    /* renamed from: i */
    public int m67478i(String str) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f3753o.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    /* renamed from: j */
    public void m67477j(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f3743e;
        float f2 = this.f3744f;
        float f3 = this.f3745g;
        float f4 = this.f3746h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        MotionController motionController = this.f3752n;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.f3752n.getCenterY() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((centerX + (Math.sin(d2) * d)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[i + 2] = f6 + 0.0f;
        fArr[i + 3] = f2 + 0.0f;
        fArr[i + 4] = f6 + 0.0f;
        fArr[i + 5] = f7 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    /* renamed from: k */
    public boolean m67476k(String str) {
        return this.f3753o.containsKey(str);
    }

    /* renamed from: l */
    public void m67475l(KeyPosition keyPosition, C18050Lt0 c18050Lt0, C18050Lt0 c18050Lt02) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = keyPosition.f32777a / 100.0f;
        this.f3741c = f5;
        this.f3740b = keyPosition.f32824h;
        if (Float.isNaN(keyPosition.f32825i)) {
            f = f5;
        } else {
            f = keyPosition.f32825i;
        }
        if (Float.isNaN(keyPosition.f32826j)) {
            f2 = f5;
        } else {
            f2 = keyPosition.f32826j;
        }
        float f6 = c18050Lt02.f3745g;
        float f7 = c18050Lt0.f3745g;
        float f8 = c18050Lt02.f3746h;
        float f9 = c18050Lt0.f3746h;
        this.f3742d = this.f3741c;
        float f10 = c18050Lt0.f3743e;
        float f11 = c18050Lt0.f3744f;
        float f12 = c18050Lt02.f3743e + (f6 / 2.0f);
        float f13 = f12 - ((f7 / 2.0f) + f10);
        float f14 = (c18050Lt02.f3744f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = (f6 - f7) * f;
        float f16 = f15 / 2.0f;
        this.f3743e = (int) ((f10 + (f13 * f5)) - f16);
        float f17 = (f8 - f9) * f2;
        float f18 = f17 / 2.0f;
        this.f3744f = (int) ((f11 + (f14 * f5)) - f18);
        this.f3745g = (int) (f7 + f15);
        this.f3746h = (int) (f9 + f17);
        if (Float.isNaN(keyPosition.f32827k)) {
            f3 = f5;
        } else {
            f3 = keyPosition.f32827k;
        }
        float f19 = 0.0f;
        if (Float.isNaN(keyPosition.f32830n)) {
            f4 = 0.0f;
        } else {
            f4 = keyPosition.f32830n;
        }
        if (!Float.isNaN(keyPosition.f32828l)) {
            f5 = keyPosition.f32828l;
        }
        if (!Float.isNaN(keyPosition.f32829m)) {
            f19 = keyPosition.f32829m;
        }
        this.f3754p = 0;
        this.f3743e = (int) (((c18050Lt0.f3743e + (f3 * f13)) + (f19 * f14)) - f16);
        this.f3744f = (int) (((c18050Lt0.f3744f + (f13 * f4)) + (f14 * f5)) - f18);
        this.f3739a = Easing.getInterpolator(keyPosition.f32822f);
        this.f3749k = keyPosition.f32823g;
    }

    /* renamed from: m */
    public void m67474m(KeyPosition keyPosition, C18050Lt0 c18050Lt0, C18050Lt0 c18050Lt02) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = keyPosition.f32777a / 100.0f;
        this.f3741c = f6;
        this.f3740b = keyPosition.f32824h;
        if (Float.isNaN(keyPosition.f32825i)) {
            f = f6;
        } else {
            f = keyPosition.f32825i;
        }
        if (Float.isNaN(keyPosition.f32826j)) {
            f2 = f6;
        } else {
            f2 = keyPosition.f32826j;
        }
        float f7 = c18050Lt02.f3745g - c18050Lt0.f3745g;
        float f8 = c18050Lt02.f3746h - c18050Lt0.f3746h;
        this.f3742d = this.f3741c;
        if (!Float.isNaN(keyPosition.f32827k)) {
            f6 = keyPosition.f32827k;
        }
        float f9 = c18050Lt0.f3743e;
        float f10 = c18050Lt0.f3745g;
        float f11 = c18050Lt0.f3744f;
        float f12 = c18050Lt0.f3746h;
        float f13 = (c18050Lt02.f3743e + (c18050Lt02.f3745g / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (c18050Lt02.f3744f + (c18050Lt02.f3746h / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.f3743e = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f3744f = (int) ((f11 + f17) - f18);
        this.f3745g = (int) (f10 + f3);
        this.f3746h = (int) (f12 + f4);
        if (Float.isNaN(keyPosition.f32828l)) {
            f5 = 0.0f;
        } else {
            f5 = keyPosition.f32828l;
        }
        this.f3754p = 1;
        float f19 = (int) ((c18050Lt0.f3743e + f15) - f16);
        float f20 = (int) ((c18050Lt0.f3744f + f17) - f18);
        this.f3743e = f19 + ((-f14) * f5);
        this.f3744f = f20 + (f13 * f5);
        this.f3750l = this.f3750l;
        this.f3739a = Easing.getInterpolator(keyPosition.f32822f);
        this.f3749k = keyPosition.f32823g;
    }

    /* renamed from: n */
    public void m67473n(int i, int i2, KeyPosition keyPosition, C18050Lt0 c18050Lt0, C18050Lt0 c18050Lt02) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = keyPosition.f32777a / 100.0f;
        this.f3741c = f6;
        this.f3740b = keyPosition.f32824h;
        this.f3754p = keyPosition.f32831o;
        if (Float.isNaN(keyPosition.f32825i)) {
            f = f6;
        } else {
            f = keyPosition.f32825i;
        }
        if (Float.isNaN(keyPosition.f32826j)) {
            f2 = f6;
        } else {
            f2 = keyPosition.f32826j;
        }
        float f7 = c18050Lt02.f3745g;
        float f8 = c18050Lt0.f3745g;
        float f9 = c18050Lt02.f3746h;
        float f10 = c18050Lt0.f3746h;
        this.f3742d = this.f3741c;
        this.f3745g = (int) (f8 + ((f7 - f8) * f));
        this.f3746h = (int) (f10 + ((f9 - f10) * f2));
        int i3 = keyPosition.f32831o;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(keyPosition.f32827k)) {
                    f5 = f6;
                } else {
                    f5 = keyPosition.f32827k;
                }
                float f11 = c18050Lt02.f3743e;
                float f12 = c18050Lt0.f3743e;
                this.f3743e = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(keyPosition.f32828l)) {
                    f6 = keyPosition.f32828l;
                }
                float f13 = c18050Lt02.f3744f;
                float f14 = c18050Lt0.f3744f;
                this.f3744f = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(keyPosition.f32827k)) {
                    float f15 = c18050Lt02.f3743e;
                    float f16 = c18050Lt0.f3743e;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * keyPosition.f32827k;
                }
                this.f3743e = min;
                if (Float.isNaN(keyPosition.f32828l)) {
                    float f17 = c18050Lt02.f3744f;
                    float f18 = c18050Lt0.f3744f;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = keyPosition.f32828l;
                }
                this.f3744f = f4;
            }
        } else {
            if (Float.isNaN(keyPosition.f32827k)) {
                f3 = f6;
            } else {
                f3 = keyPosition.f32827k;
            }
            float f19 = c18050Lt02.f3743e;
            float f20 = c18050Lt0.f3743e;
            this.f3743e = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(keyPosition.f32828l)) {
                f6 = keyPosition.f32828l;
            }
            float f21 = c18050Lt02.f3744f;
            float f22 = c18050Lt0.f3744f;
            this.f3744f = (f6 * (f21 - f22)) + f22;
        }
        this.f3750l = c18050Lt0.f3750l;
        this.f3739a = Easing.getInterpolator(keyPosition.f32822f);
        this.f3749k = keyPosition.f32823g;
    }

    /* renamed from: o */
    public void m67472o(int i, int i2, KeyPosition keyPosition, C18050Lt0 c18050Lt0, C18050Lt0 c18050Lt02) {
        float f;
        float f2;
        float f3 = keyPosition.f32777a / 100.0f;
        this.f3741c = f3;
        this.f3740b = keyPosition.f32824h;
        if (Float.isNaN(keyPosition.f32825i)) {
            f = f3;
        } else {
            f = keyPosition.f32825i;
        }
        if (Float.isNaN(keyPosition.f32826j)) {
            f2 = f3;
        } else {
            f2 = keyPosition.f32826j;
        }
        float f4 = c18050Lt02.f3745g;
        float f5 = c18050Lt0.f3745g;
        float f6 = c18050Lt02.f3746h;
        float f7 = c18050Lt0.f3746h;
        this.f3742d = this.f3741c;
        float f8 = c18050Lt0.f3743e;
        float f9 = c18050Lt0.f3744f;
        float f10 = c18050Lt02.f3743e + (f4 / 2.0f);
        float f11 = c18050Lt02.f3744f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f3743e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f3744f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.f3745g = (int) (f5 + f12);
        this.f3746h = (int) (f7 + f13);
        this.f3754p = 2;
        if (!Float.isNaN(keyPosition.f32827k)) {
            this.f3743e = (int) (keyPosition.f32827k * ((int) (i - this.f3745g)));
        }
        if (!Float.isNaN(keyPosition.f32828l)) {
            this.f3744f = (int) (keyPosition.f32828l * ((int) (i2 - this.f3746h)));
        }
        this.f3750l = this.f3750l;
        this.f3739a = Easing.getInterpolator(keyPosition.f32822f);
        this.f3749k = keyPosition.f32823g;
    }

    /* renamed from: p */
    public void m67471p(float f, float f2, float f3, float f4) {
        this.f3743e = f;
        this.f3744f = f2;
        this.f3745g = f3;
        this.f3746h = f4;
    }

    /* renamed from: q */
    public void m67470q(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* renamed from: r */
    public void m67469r(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3;
        float f4 = this.f3743e;
        float f5 = this.f3744f;
        float f6 = this.f3745g;
        float f7 = this.f3746h;
        if (iArr.length != 0 && this.f3756r.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f3756r = new double[i];
            this.f3757s = new double[i];
        }
        Arrays.fill(this.f3756r, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f3756r;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f3757s[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f3756r;
            if (i4 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f3 = f8;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f3756r[i4])) {
                    d = this.f3756r[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f3757s[i4];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    f8 = f13;
                                }
                            } else {
                                f8 = f3;
                                f12 = f14;
                                f7 = f13;
                            }
                        } else {
                            f8 = f3;
                            f11 = f14;
                            f6 = f13;
                        }
                    } else {
                        f8 = f3;
                        f10 = f14;
                        f5 = f13;
                    }
                } else {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                }
                i4++;
            }
            f8 = f3;
            i4++;
        }
        float f15 = f8;
        MotionController motionController = this.f3752n;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) ((f16 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f2 = f7;
            float cos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float sin2 = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float cos2 = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (f15 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (0.0f + f15 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        float f21 = f5 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f6);
        int i8 = (int) (f21 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    /* renamed from: s */
    public void m67468s(MotionController motionController, C18050Lt0 c18050Lt0) {
        double d = ((this.f3743e + (this.f3745g / 2.0f)) - c18050Lt0.f3743e) - (c18050Lt0.f3745g / 2.0f);
        double d2 = ((this.f3744f + (this.f3746h / 2.0f)) - c18050Lt0.f3744f) - (c18050Lt0.f3746h / 2.0f);
        this.f3752n = motionController;
        this.f3743e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f3751m)) {
            this.f3744f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f3744f = (float) Math.toRadians(this.f3751m);
        }
    }

    public C18050Lt0(int i, int i2, KeyPosition keyPosition, C18050Lt0 c18050Lt0, C18050Lt0 c18050Lt02) {
        int i3 = Key.UNSET;
        this.f3749k = i3;
        this.f3750l = i3;
        this.f3751m = Float.NaN;
        this.f3752n = null;
        this.f3753o = new LinkedHashMap();
        this.f3754p = 0;
        this.f3756r = new double[18];
        this.f3757s = new double[18];
        if (c18050Lt0.f3750l != Key.UNSET) {
            m67473n(i, i2, keyPosition, c18050Lt0, c18050Lt02);
            return;
        }
        int i4 = keyPosition.f32831o;
        if (i4 == 1) {
            m67474m(keyPosition, c18050Lt0, c18050Lt02);
        } else if (i4 != 2) {
            m67475l(keyPosition, c18050Lt0, c18050Lt02);
        } else {
            m67472o(i, i2, keyPosition, c18050Lt0, c18050Lt02);
        }
    }
}