package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";

    /* renamed from: t */
    public static String[] f32020t = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: a */
    public Easing f32021a;

    /* renamed from: b */
    public int f32022b;

    /* renamed from: c */
    public float f32023c;

    /* renamed from: d */
    public float f32024d;

    /* renamed from: e */
    public float f32025e;

    /* renamed from: f */
    public float f32026f;

    /* renamed from: g */
    public float f32027g;

    /* renamed from: h */
    public float f32028h;

    /* renamed from: i */
    public float f32029i;

    /* renamed from: j */
    public float f32030j;

    /* renamed from: k */
    public int f32031k;

    /* renamed from: l */
    public int f32032l;

    /* renamed from: m */
    public float f32033m;

    /* renamed from: n */
    public Motion f32034n;

    /* renamed from: o */
    public HashMap f32035o;

    /* renamed from: p */
    public int f32036p;

    /* renamed from: q */
    public int f32037q;

    /* renamed from: r */
    public double[] f32038r;

    /* renamed from: s */
    public double[] f32039s;

    public MotionPaths() {
        this.f32022b = 0;
        this.f32029i = Float.NaN;
        this.f32030j = Float.NaN;
        this.f32031k = -1;
        this.f32032l = -1;
        this.f32033m = Float.NaN;
        this.f32034n = null;
        this.f32035o = new HashMap();
        this.f32036p = 0;
        this.f32038r = new double[18];
        this.f32039s = new double[18];
    }

    /* renamed from: a */
    public final boolean m58764a(float f, float f2) {
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

    public void applyParameters(MotionWidget motionWidget) {
        this.f32021a = Easing.getInterpolator(motionWidget.f32041b.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.f32041b;
        this.f32031k = motion.mPathMotionArc;
        this.f32032l = motion.mAnimateRelativeTo;
        this.f32029i = motion.mPathRotate;
        this.f32022b = motion.mDrawPath;
        this.f32037q = motion.mAnimateCircleAngleTo;
        this.f32030j = motionWidget.f32042c.mProgress;
        this.f32033m = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f32035o.put(str, customAttribute);
            }
        }
    }

    /* renamed from: b */
    public void m58763b(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean m58764a = m58764a(this.f32025e, motionPaths.f32025e);
        boolean m58764a2 = m58764a(this.f32026f, motionPaths.f32026f);
        zArr[0] = zArr[0] | m58764a(this.f32024d, motionPaths.f32024d);
        boolean z2 = m58764a | m58764a2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m58764a(this.f32027g, motionPaths.f32027g);
        zArr[4] = m58764a(this.f32028h, motionPaths.f32028h) | zArr[4];
    }

    /* renamed from: c */
    public void m58762c(double[] dArr, int[] iArr) {
        float[] fArr = {this.f32024d, this.f32025e, this.f32026f, this.f32027g, this.f32028h, this.f32029i};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.m58768c(this.f32030j);
    }

    /* renamed from: d */
    public void m58761d(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f32025e;
        float f2 = this.f32026f;
        float f3 = this.f32027g;
        float f4 = this.f32028h;
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
        Motion motion = this.f32034n;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d, fArr2, new float[2]);
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

    /* renamed from: e */
    public void m58760e(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f32025e;
        float f3 = this.f32026f;
        float f4 = this.f32027g;
        float f5 = this.f32028h;
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
        Motion motion = this.f32034n;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d, fArr3, fArr4);
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

    /* renamed from: f */
    public int m58759f(String str, double[] dArr, int i) {
        CustomVariable customVariable = (CustomVariable) this.f32035o.get(str);
        int i2 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        customVariable.getValuesToInterpolate(fArr);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    /* renamed from: g */
    public int m58758g(String str) {
        CustomVariable customVariable = (CustomVariable) this.f32035o.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    /* renamed from: h */
    public void m58757h(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f32025e;
        float f2 = this.f32026f;
        float f3 = this.f32027g;
        float f4 = this.f32028h;
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
        Motion motion = this.f32034n;
        if (motion != null) {
            float centerX = motion.getCenterX();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.f32034n.getCenterY() - (d * Math.cos(d2))) - (f4 / 2.0f));
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

    /* renamed from: i */
    public boolean m58756i(String str) {
        return this.f32035o.containsKey(str);
    }

    /* renamed from: j */
    public void m58755j(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.f32023c = f5;
        this.f32022b = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f5;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f5;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f6 = motionPaths2.f32027g;
        float f7 = motionPaths.f32027g;
        float f8 = motionPaths2.f32028h;
        float f9 = motionPaths.f32028h;
        this.f32024d = this.f32023c;
        float f10 = motionPaths.f32025e;
        float f11 = motionPaths.f32026f;
        float f12 = motionPaths2.f32025e + (f6 / 2.0f);
        float f13 = f12 - ((f7 / 2.0f) + f10);
        float f14 = (motionPaths2.f32026f + (f8 / 2.0f)) - (f11 + (f9 / 2.0f));
        float f15 = (f6 - f7) * f;
        float f16 = f15 / 2.0f;
        this.f32025e = (int) ((f10 + (f13 * f5)) - f16);
        float f17 = (f8 - f9) * f2;
        float f18 = f17 / 2.0f;
        this.f32026f = (int) ((f11 + (f14 * f5)) - f18);
        this.f32027g = (int) (f7 + f15);
        this.f32028h = (int) (f9 + f17);
        if (Float.isNaN(motionKeyPosition.mPercentX)) {
            f3 = f5;
        } else {
            f3 = motionKeyPosition.mPercentX;
        }
        float f19 = 0.0f;
        if (Float.isNaN(motionKeyPosition.mAltPercentY)) {
            f4 = 0.0f;
        } else {
            f4 = motionKeyPosition.mAltPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = motionKeyPosition.mPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mAltPercentX)) {
            f19 = motionKeyPosition.mAltPercentX;
        }
        this.f32036p = 0;
        this.f32025e = (int) (((motionPaths.f32025e + (f3 * f13)) + (f19 * f14)) - f16);
        this.f32026f = (int) (((motionPaths.f32026f + (f13 * f4)) + (f14 * f5)) - f18);
        this.f32021a = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.f32031k = motionKeyPosition.mPathMotionArc;
    }

    /* renamed from: k */
    public void m58754k(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = motionKeyPosition.mFramePosition / 100.0f;
        this.f32023c = f6;
        this.f32022b = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f6;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f6;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f7 = motionPaths2.f32027g - motionPaths.f32027g;
        float f8 = motionPaths2.f32028h - motionPaths.f32028h;
        this.f32024d = this.f32023c;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f6 = motionKeyPosition.mPercentX;
        }
        float f9 = motionPaths.f32025e;
        float f10 = motionPaths.f32027g;
        float f11 = motionPaths.f32026f;
        float f12 = motionPaths.f32028h;
        float f13 = (motionPaths2.f32025e + (motionPaths2.f32027g / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (motionPaths2.f32026f + (motionPaths2.f32028h / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.f32025e = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f32026f = (int) ((f11 + f17) - f18);
        this.f32027g = (int) (f10 + f3);
        this.f32028h = (int) (f12 + f4);
        if (Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = 0.0f;
        } else {
            f5 = motionKeyPosition.mPercentY;
        }
        this.f32036p = 1;
        float f19 = (int) ((motionPaths.f32025e + f15) - f16);
        float f20 = (int) ((motionPaths.f32026f + f17) - f18);
        this.f32025e = f19 + ((-f14) * f5);
        this.f32026f = f20 + (f13 * f5);
        this.f32032l = this.f32032l;
        this.f32021a = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.f32031k = motionKeyPosition.mPathMotionArc;
    }

    /* renamed from: l */
    public void m58753l(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = motionKeyPosition.mFramePosition / 100.0f;
        this.f32023c = f6;
        this.f32022b = motionKeyPosition.mDrawPath;
        this.f32036p = motionKeyPosition.mPositionType;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f6;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f6;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f7 = motionPaths2.f32027g;
        float f8 = motionPaths.f32027g;
        float f9 = motionPaths2.f32028h;
        float f10 = motionPaths.f32028h;
        this.f32024d = this.f32023c;
        this.f32027g = (int) (f8 + ((f7 - f8) * f));
        this.f32028h = (int) (f10 + ((f9 - f10) * f2));
        int i3 = motionKeyPosition.mPositionType;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    f5 = f6;
                } else {
                    f5 = motionKeyPosition.mPercentX;
                }
                float f11 = motionPaths2.f32025e;
                float f12 = motionPaths.f32025e;
                this.f32025e = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                    f6 = motionKeyPosition.mPercentY;
                }
                float f13 = motionPaths2.f32026f;
                float f14 = motionPaths.f32026f;
                this.f32026f = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    float f15 = motionPaths2.f32025e;
                    float f16 = motionPaths.f32025e;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * motionKeyPosition.mPercentX;
                }
                this.f32025e = min;
                if (Float.isNaN(motionKeyPosition.mPercentY)) {
                    float f17 = motionPaths2.f32026f;
                    float f18 = motionPaths.f32026f;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = motionKeyPosition.mPercentY;
                }
                this.f32026f = f4;
            }
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                f3 = f6;
            } else {
                f3 = motionKeyPosition.mPercentX;
            }
            float f19 = motionPaths2.f32025e;
            float f20 = motionPaths.f32025e;
            this.f32025e = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f6 = motionKeyPosition.mPercentY;
            }
            float f21 = motionPaths2.f32026f;
            float f22 = motionPaths.f32026f;
            this.f32026f = (f6 * (f21 - f22)) + f22;
        }
        this.f32032l = motionPaths.f32032l;
        this.f32021a = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.f32031k = motionKeyPosition.mPathMotionArc;
    }

    /* renamed from: m */
    public void m58752m(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3 = motionKeyPosition.mFramePosition / 100.0f;
        this.f32023c = f3;
        this.f32022b = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f = f3;
        } else {
            f = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f2 = f3;
        } else {
            f2 = motionKeyPosition.mPercentHeight;
        }
        float f4 = motionPaths2.f32027g;
        float f5 = motionPaths.f32027g;
        float f6 = motionPaths2.f32028h;
        float f7 = motionPaths.f32028h;
        this.f32024d = this.f32023c;
        float f8 = motionPaths.f32025e;
        float f9 = motionPaths.f32026f;
        float f10 = motionPaths2.f32025e + (f4 / 2.0f);
        float f11 = motionPaths2.f32026f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f32025e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f32026f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.f32027g = (int) (f5 + f12);
        this.f32028h = (int) (f7 + f13);
        this.f32036p = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f32025e = (int) (motionKeyPosition.mPercentX * ((int) (i - this.f32027g)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f32026f = (int) (motionKeyPosition.mPercentY * ((int) (i2 - this.f32028h)));
        }
        this.f32032l = this.f32032l;
        this.f32021a = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.f32031k = motionKeyPosition.mPathMotionArc;
    }

    /* renamed from: n */
    public void m58751n(float f, float f2, float f3, float f4) {
        this.f32025e = f;
        this.f32026f = f2;
        this.f32027g = f3;
        this.f32028h = f4;
    }

    /* renamed from: o */
    public void m58750o(float f, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        float f4 = this.f32025e;
        float f5 = this.f32026f;
        float f6 = this.f32027g;
        float f7 = this.f32028h;
        if (iArr.length != 0 && this.f32038r.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f32038r = new double[i];
            this.f32039s = new double[i];
        }
        Arrays.fill(this.f32038r, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f32038r;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f32039s[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f32038r;
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
                if (!Double.isNaN(this.f32038r[i4])) {
                    d = this.f32038r[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f32039s[i4];
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
        Motion motion = this.f32034n;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f, fArr, fArr2);
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
                motionWidget.setRotationZ((float) (f15 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            if (!Float.isNaN(f15)) {
                motionWidget.setRotationZ((float) (0.0f + f15 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        float f20 = f4 + 0.5f;
        float f21 = f5 + 0.5f;
        motionWidget.layout((int) f20, (int) f21, (int) (f20 + f6), (int) (f21 + f2));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d = ((this.f32025e + (this.f32027g / 2.0f)) - motionPaths.f32025e) - (motionPaths.f32027g / 2.0f);
        double d2 = ((this.f32026f + (this.f32028h / 2.0f)) - motionPaths.f32026f) - (motionPaths.f32028h / 2.0f);
        this.f32034n = motion;
        this.f32025e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f32033m)) {
            this.f32026f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f32026f = (float) Math.toRadians(this.f32033m);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.f32024d, motionPaths.f32024d);
    }

    public MotionPaths(int i, int i2, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.f32022b = 0;
        this.f32029i = Float.NaN;
        this.f32030j = Float.NaN;
        this.f32031k = -1;
        this.f32032l = -1;
        this.f32033m = Float.NaN;
        this.f32034n = null;
        this.f32035o = new HashMap();
        this.f32036p = 0;
        this.f32038r = new double[18];
        this.f32039s = new double[18];
        if (motionPaths.f32032l != -1) {
            m58753l(i, i2, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i3 = motionKeyPosition.mPositionType;
        if (i3 == 1) {
            m58754k(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            m58755j(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            m58752m(i, i2, motionKeyPosition, motionPaths, motionPaths2);
        }
    }
}
