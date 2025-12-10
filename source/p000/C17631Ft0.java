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

/* renamed from: Ft0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C17631Ft0 implements Comparable {

    /* renamed from: t */
    public static String[] f1717t = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: a */
    public Easing f1718a;

    /* renamed from: c */
    public float f1720c;

    /* renamed from: d */
    public float f1721d;

    /* renamed from: e */
    public float f1722e;

    /* renamed from: f */
    public float f1723f;

    /* renamed from: g */
    public float f1724g;

    /* renamed from: h */
    public float f1725h;

    /* renamed from: k */
    public int f1728k;

    /* renamed from: l */
    public int f1729l;

    /* renamed from: m */
    public float f1730m;

    /* renamed from: n */
    public MotionController f1731n;

    /* renamed from: o */
    public LinkedHashMap f1732o;

    /* renamed from: p */
    public int f1733p;

    /* renamed from: q */
    public int f1734q;

    /* renamed from: r */
    public double[] f1735r;

    /* renamed from: s */
    public double[] f1736s;

    /* renamed from: b */
    public int f1719b = 0;

    /* renamed from: i */
    public float f1726i = Float.NaN;

    /* renamed from: j */
    public float f1727j = Float.NaN;

    public C17631Ft0() {
        int i = Key.UNSET;
        this.f1728k = i;
        this.f1729l = i;
        this.f1730m = Float.NaN;
        this.f1731n = null;
        this.f1732o = new LinkedHashMap();
        this.f1733p = 0;
        this.f1735r = new double[18];
        this.f1736s = new double[18];
    }

    /* renamed from: a */
    public void m68343a(ConstraintSet.Constraint constraint) {
        this.f1718a = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.f1728k = motion.mPathMotionArc;
        this.f1729l = motion.mAnimateRelativeTo;
        this.f1726i = motion.mPathRotate;
        this.f1719b = motion.mDrawPath;
        this.f1734q = motion.mAnimateCircleAngleTo;
        this.f1727j = constraint.propertySet.mProgress;
        this.f1730m = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.f1732o.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C17631Ft0 c17631Ft0) {
        return Float.compare(this.f1721d, c17631Ft0.f1721d);
    }

    /* renamed from: c */
    public final boolean m68341c(float f, float f2) {
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
    public void m68340d(C17631Ft0 c17631Ft0, boolean[] zArr, String[] strArr, boolean z) {
        boolean m68341c = m68341c(this.f1722e, c17631Ft0.f1722e);
        boolean m68341c2 = m68341c(this.f1723f, c17631Ft0.f1723f);
        zArr[0] = zArr[0] | m68341c(this.f1721d, c17631Ft0.f1721d);
        boolean z2 = m68341c | m68341c2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m68341c(this.f1724g, c17631Ft0.f1724g);
        zArr[4] = m68341c(this.f1725h, c17631Ft0.f1725h) | zArr[4];
    }

    /* renamed from: e */
    public void m68339e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1721d, this.f1722e, this.f1723f, this.f1724g, this.f1725h, this.f1726i};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: f */
    public void m68338f(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1722e;
        float f2 = this.f1723f;
        float f3 = this.f1724g;
        float f4 = this.f1725h;
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
        MotionController motionController = this.f1731n;
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
    public void m68337g(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f1722e;
        float f3 = this.f1723f;
        float f4 = this.f1724g;
        float f5 = this.f1725h;
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
        MotionController motionController = this.f1731n;
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
    public int m68336h(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f1732o.get(str);
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
    public int m68335i(String str) {
        ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f1732o.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    /* renamed from: j */
    public void m68334j(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1722e;
        float f2 = this.f1723f;
        float f3 = this.f1724g;
        float f4 = this.f1725h;
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
        MotionController motionController = this.f1731n;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.f1731n.getCenterY() - (d * Math.cos(d2))) - (f4 / 2.0f));
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
    public boolean m68333k(String str) {
        return this.f1732o.containsKey(str);
    }

    /* renamed from: l */
    public void m68332l(KeyPosition keyPosition, C17631Ft0 c17631Ft0, C17631Ft0 c17631Ft02) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = keyPosition.f32689a / 100.0f;
        this.f1720c = f5;
        this.f1719b = keyPosition.f32736h;
        if (Float.isNaN(keyPosition.f32737i)) {
            f = f5;
        } else {
            f = keyPosition.f32737i;
        }
        if (Float.isNaN(keyPosition.f32738j)) {
            f2 = f5;
        } else {
            f2 = keyPosition.f32738j;
        }
        float f6 = c17631Ft02.f1724g;
        float f7 = c17631Ft0.f1724g;
        float f8 = c17631Ft02.f1725h;
        float f9 = c17631Ft0.f1725h;
        this.f1721d = this.f1720c;
        float f10 = c17631Ft0.f1722e;
        float f11 = c17631Ft0.f1723f;
        float f12 = c17631Ft02.f1722e + (f6 / 2.0f);
        float f13 = f12 - ((f7 / 2.0f) + f10);
        float f14 = (c17631Ft02.f1723f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = (f6 - f7) * f;
        float f16 = f15 / 2.0f;
        this.f1722e = (int) ((f10 + (f13 * f5)) - f16);
        float f17 = (f8 - f9) * f2;
        float f18 = f17 / 2.0f;
        this.f1723f = (int) ((f11 + (f14 * f5)) - f18);
        this.f1724g = (int) (f7 + f15);
        this.f1725h = (int) (f9 + f17);
        if (Float.isNaN(keyPosition.f32739k)) {
            f3 = f5;
        } else {
            f3 = keyPosition.f32739k;
        }
        float f19 = 0.0f;
        if (Float.isNaN(keyPosition.f32742n)) {
            f4 = 0.0f;
        } else {
            f4 = keyPosition.f32742n;
        }
        if (!Float.isNaN(keyPosition.f32740l)) {
            f5 = keyPosition.f32740l;
        }
        if (!Float.isNaN(keyPosition.f32741m)) {
            f19 = keyPosition.f32741m;
        }
        this.f1733p = 0;
        this.f1722e = (int) (((c17631Ft0.f1722e + (f3 * f13)) + (f19 * f14)) - f16);
        this.f1723f = (int) (((c17631Ft0.f1723f + (f13 * f4)) + (f14 * f5)) - f18);
        this.f1718a = Easing.getInterpolator(keyPosition.f32734f);
        this.f1728k = keyPosition.f32735g;
    }

    /* renamed from: m */
    public void m68331m(KeyPosition keyPosition, C17631Ft0 c17631Ft0, C17631Ft0 c17631Ft02) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = keyPosition.f32689a / 100.0f;
        this.f1720c = f6;
        this.f1719b = keyPosition.f32736h;
        if (Float.isNaN(keyPosition.f32737i)) {
            f = f6;
        } else {
            f = keyPosition.f32737i;
        }
        if (Float.isNaN(keyPosition.f32738j)) {
            f2 = f6;
        } else {
            f2 = keyPosition.f32738j;
        }
        float f7 = c17631Ft02.f1724g - c17631Ft0.f1724g;
        float f8 = c17631Ft02.f1725h - c17631Ft0.f1725h;
        this.f1721d = this.f1720c;
        if (!Float.isNaN(keyPosition.f32739k)) {
            f6 = keyPosition.f32739k;
        }
        float f9 = c17631Ft0.f1722e;
        float f10 = c17631Ft0.f1724g;
        float f11 = c17631Ft0.f1723f;
        float f12 = c17631Ft0.f1725h;
        float f13 = (c17631Ft02.f1722e + (c17631Ft02.f1724g / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (c17631Ft02.f1723f + (c17631Ft02.f1725h / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.f1722e = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f1723f = (int) ((f11 + f17) - f18);
        this.f1724g = (int) (f10 + f3);
        this.f1725h = (int) (f12 + f4);
        if (Float.isNaN(keyPosition.f32740l)) {
            f5 = 0.0f;
        } else {
            f5 = keyPosition.f32740l;
        }
        this.f1733p = 1;
        float f19 = (int) ((c17631Ft0.f1722e + f15) - f16);
        float f20 = (int) ((c17631Ft0.f1723f + f17) - f18);
        this.f1722e = f19 + ((-f14) * f5);
        this.f1723f = f20 + (f13 * f5);
        this.f1729l = this.f1729l;
        this.f1718a = Easing.getInterpolator(keyPosition.f32734f);
        this.f1728k = keyPosition.f32735g;
    }

    /* renamed from: n */
    public void m68330n(int i, int i2, KeyPosition keyPosition, C17631Ft0 c17631Ft0, C17631Ft0 c17631Ft02) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = keyPosition.f32689a / 100.0f;
        this.f1720c = f6;
        this.f1719b = keyPosition.f32736h;
        this.f1733p = keyPosition.f32743o;
        if (Float.isNaN(keyPosition.f32737i)) {
            f = f6;
        } else {
            f = keyPosition.f32737i;
        }
        if (Float.isNaN(keyPosition.f32738j)) {
            f2 = f6;
        } else {
            f2 = keyPosition.f32738j;
        }
        float f7 = c17631Ft02.f1724g;
        float f8 = c17631Ft0.f1724g;
        float f9 = c17631Ft02.f1725h;
        float f10 = c17631Ft0.f1725h;
        this.f1721d = this.f1720c;
        this.f1724g = (int) (f8 + ((f7 - f8) * f));
        this.f1725h = (int) (f10 + ((f9 - f10) * f2));
        int i3 = keyPosition.f32743o;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(keyPosition.f32739k)) {
                    f5 = f6;
                } else {
                    f5 = keyPosition.f32739k;
                }
                float f11 = c17631Ft02.f1722e;
                float f12 = c17631Ft0.f1722e;
                this.f1722e = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(keyPosition.f32740l)) {
                    f6 = keyPosition.f32740l;
                }
                float f13 = c17631Ft02.f1723f;
                float f14 = c17631Ft0.f1723f;
                this.f1723f = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(keyPosition.f32739k)) {
                    float f15 = c17631Ft02.f1722e;
                    float f16 = c17631Ft0.f1722e;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * keyPosition.f32739k;
                }
                this.f1722e = min;
                if (Float.isNaN(keyPosition.f32740l)) {
                    float f17 = c17631Ft02.f1723f;
                    float f18 = c17631Ft0.f1723f;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = keyPosition.f32740l;
                }
                this.f1723f = f4;
            }
        } else {
            if (Float.isNaN(keyPosition.f32739k)) {
                f3 = f6;
            } else {
                f3 = keyPosition.f32739k;
            }
            float f19 = c17631Ft02.f1722e;
            float f20 = c17631Ft0.f1722e;
            this.f1722e = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(keyPosition.f32740l)) {
                f6 = keyPosition.f32740l;
            }
            float f21 = c17631Ft02.f1723f;
            float f22 = c17631Ft0.f1723f;
            this.f1723f = (f6 * (f21 - f22)) + f22;
        }
        this.f1729l = c17631Ft0.f1729l;
        this.f1718a = Easing.getInterpolator(keyPosition.f32734f);
        this.f1728k = keyPosition.f32735g;
    }

    /* renamed from: o */
    public void m68329o(int i, int i2, KeyPosition keyPosition, C17631Ft0 c17631Ft0, C17631Ft0 c17631Ft02) {
        float f;
        float f2;
        float f3 = keyPosition.f32689a / 100.0f;
        this.f1720c = f3;
        this.f1719b = keyPosition.f32736h;
        if (Float.isNaN(keyPosition.f32737i)) {
            f = f3;
        } else {
            f = keyPosition.f32737i;
        }
        if (Float.isNaN(keyPosition.f32738j)) {
            f2 = f3;
        } else {
            f2 = keyPosition.f32738j;
        }
        float f4 = c17631Ft02.f1724g;
        float f5 = c17631Ft0.f1724g;
        float f6 = c17631Ft02.f1725h;
        float f7 = c17631Ft0.f1725h;
        this.f1721d = this.f1720c;
        float f8 = c17631Ft0.f1722e;
        float f9 = c17631Ft0.f1723f;
        float f10 = c17631Ft02.f1722e + (f4 / 2.0f);
        float f11 = c17631Ft02.f1723f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f1722e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f1723f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.f1724g = (int) (f5 + f12);
        this.f1725h = (int) (f7 + f13);
        this.f1733p = 2;
        if (!Float.isNaN(keyPosition.f32739k)) {
            this.f1722e = (int) (keyPosition.f32739k * ((int) (i - this.f1724g)));
        }
        if (!Float.isNaN(keyPosition.f32740l)) {
            this.f1723f = (int) (keyPosition.f32740l * ((int) (i2 - this.f1725h)));
        }
        this.f1729l = this.f1729l;
        this.f1718a = Easing.getInterpolator(keyPosition.f32734f);
        this.f1728k = keyPosition.f32735g;
    }

    /* renamed from: p */
    public void m68328p(float f, float f2, float f3, float f4) {
        this.f1722e = f;
        this.f1723f = f2;
        this.f1724g = f3;
        this.f1725h = f4;
    }

    /* renamed from: q */
    public void m68327q(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
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
    public void m68326r(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3;
        float f4 = this.f1722e;
        float f5 = this.f1723f;
        float f6 = this.f1724g;
        float f7 = this.f1725h;
        if (iArr.length != 0 && this.f1735r.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f1735r = new double[i];
            this.f1736s = new double[i];
        }
        Arrays.fill(this.f1735r, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f1735r;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f1736s[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f1735r;
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
                if (!Double.isNaN(this.f1735r[i4])) {
                    d = this.f1735r[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f1736s[i4];
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
        MotionController motionController = this.f1731n;
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
    public void m68325s(MotionController motionController, C17631Ft0 c17631Ft0) {
        double d = ((this.f1722e + (this.f1724g / 2.0f)) - c17631Ft0.f1722e) - (c17631Ft0.f1724g / 2.0f);
        double d2 = ((this.f1723f + (this.f1725h / 2.0f)) - c17631Ft0.f1723f) - (c17631Ft0.f1725h / 2.0f);
        this.f1731n = motionController;
        this.f1722e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f1730m)) {
            this.f1723f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f1723f = (float) Math.toRadians(this.f1730m);
        }
    }

    public C17631Ft0(int i, int i2, KeyPosition keyPosition, C17631Ft0 c17631Ft0, C17631Ft0 c17631Ft02) {
        int i3 = Key.UNSET;
        this.f1728k = i3;
        this.f1729l = i3;
        this.f1730m = Float.NaN;
        this.f1731n = null;
        this.f1732o = new LinkedHashMap();
        this.f1733p = 0;
        this.f1735r = new double[18];
        this.f1736s = new double[18];
        if (c17631Ft0.f1729l != Key.UNSET) {
            m68330n(i, i2, keyPosition, c17631Ft0, c17631Ft02);
            return;
        }
        int i4 = keyPosition.f32743o;
        if (i4 == 1) {
            m68331m(keyPosition, c17631Ft0, c17631Ft02);
        } else if (i4 != 2) {
            m68332l(keyPosition, c17631Ft0, c17631Ft02);
        } else {
            m68329o(i, i2, keyPosition, c17631Ft0, c17631Ft02);
        }
    }
}
