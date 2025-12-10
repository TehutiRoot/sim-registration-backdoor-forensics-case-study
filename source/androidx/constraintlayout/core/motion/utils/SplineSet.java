package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class SplineSet {

    /* renamed from: a */
    public int f32226a;

    /* renamed from: b */
    public String f32227b;
    protected CurveFit mCurveFit;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    /* loaded from: classes2.dex */
    public static class CustomSet extends SplineSet {

        /* renamed from: c */
        public String f32228c;

        /* renamed from: d */
        public KeyFrameArray.CustomArray f32229d;

        /* renamed from: e */
        public float[] f32230e;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.f32228c = str.split(",")[1];
            this.f32229d = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(WidgetFrame widgetFrame, float f) {
            this.mCurveFit.getPos(f, this.f32230e);
            widgetFrame.setCustomValue(this.f32229d.valueAt(0), this.f32230e);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.f32229d.size();
            int numberOfInterpolatedValues = this.f32229d.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f32230e = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f32229d.keyAt(i2);
                CustomAttribute valueAt = this.f32229d.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.f32230e);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f32230e;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, CustomAttribute customAttribute) {
            this.f32229d.append(i, customAttribute);
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomSpline extends SplineSet {

        /* renamed from: c */
        public String f32231c;

        /* renamed from: d */
        public KeyFrameArray.CustomVar f32232d;

        /* renamed from: e */
        public float[] f32233e;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.f32231c = str.split(",")[1];
            this.f32232d = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f) {
            setProperty((MotionWidget) typedValues, f);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.f32232d.size();
            int numberOfInterpolatedValues = this.f32232d.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f32233e = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f32232d.keyAt(i2);
                CustomVariable valueAt = this.f32232d.valueAt(i2);
                dArr[i2] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.f32233e);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f32233e;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, CustomVariable customVariable) {
            this.f32232d.append(i, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f) {
            this.mCurveFit.getPos(f, this.f32233e);
            this.f32232d.valueAt(0).setInterpolatedValue(motionWidget, this.f32233e);
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.SplineSet$a */
    /* loaded from: classes2.dex */
    public static class C3683a extends SplineSet {

        /* renamed from: c */
        public String f32234c;

        /* renamed from: d */
        public long f32235d;

        public C3683a(String str, long j) {
            this.f32234c = str;
            this.f32235d = j;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f) {
            typedValues.setValue(typedValues.getId(this.f32234c), get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.SplineSet$b */
    /* loaded from: classes2.dex */
    public static class C3684b {
        /* renamed from: a */
        public static void m58708a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int m58707b = m58707b(iArr, fArr, i4, i6);
                    iArr2[i5] = m58707b - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = m58707b + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        /* renamed from: b */
        public static int m58707b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m58706c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m58706c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m58706c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j) {
        return new C3683a(str, j);
    }

    public float get(float f) {
        return (float) this.mCurveFit.getPos(f, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        return (float) this.mCurveFit.getSlope(f, 0);
    }

    public void setPoint(int i, float f) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.f32226a + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i2 = this.f32226a;
        iArr2[i2] = i;
        this.mValues[i2] = f;
        this.f32226a = i2 + 1;
    }

    public void setProperty(TypedValues typedValues, float f) {
        typedValues.setValue(AbstractC20566jW1.m29207a(this.f32227b), get(f));
    }

    public void setType(String str) {
        this.f32227b = str;
    }

    public void setup(int i) {
        int i2 = this.f32226a;
        if (i2 == 0) {
            return;
        }
        C3684b.m58708a(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.f32226a; i4++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f32226a; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = this.mTimePoints[i6] * 0.01d;
            dArr2[i5][0] = this.mValues[i6];
            i5++;
        }
        this.mCurveFit = CurveFit.get(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f32227b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f32226a; i++) {
            str = str + "[" + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }
}
