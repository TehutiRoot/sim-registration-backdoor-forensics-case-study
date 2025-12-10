package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class KeyCycleOscillator {

    /* renamed from: a */
    public CurveFit f32165a;

    /* renamed from: b */
    public C3680c f32166b;

    /* renamed from: c */
    public String f32167c;

    /* renamed from: d */
    public int f32168d = 0;

    /* renamed from: e */
    public String f32169e = null;
    public int mVariesBy = 0;

    /* renamed from: f */
    public ArrayList f32170f = new ArrayList();

    /* loaded from: classes2.dex */
    public static class PathRotateSet extends KeyCycleOscillator {

        /* renamed from: g */
        public String f32171g;

        /* renamed from: h */
        public int f32172h;

        public PathRotateSet(String str) {
            this.f32171g = str;
            this.f32172h = AbstractC20910lW1.m26466a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f, double d, double d2) {
            motionWidget.setRotationZ(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.f32172h, get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$a */
    /* loaded from: classes2.dex */
    public class C3678a implements Comparator {
        public C3678a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C3681d c3681d, C3681d c3681d2) {
            return Integer.compare(c3681d.f32192a, c3681d2.f32192a);
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$b */
    /* loaded from: classes2.dex */
    public static class C3679b extends KeyCycleOscillator {

        /* renamed from: g */
        public String f32174g;

        /* renamed from: h */
        public int f32175h;

        public C3679b(String str) {
            this.f32174g = str;
            this.f32175h = AbstractC20910lW1.m26466a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f) {
            motionWidget.setValue(this.f32175h, get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$c */
    /* loaded from: classes2.dex */
    public static class C3680c {

        /* renamed from: a */
        public final int f32176a;

        /* renamed from: b */
        public Oscillator f32177b;

        /* renamed from: c */
        public final int f32178c;

        /* renamed from: d */
        public final int f32179d;

        /* renamed from: e */
        public final int f32180e;

        /* renamed from: f */
        public float[] f32181f;

        /* renamed from: g */
        public double[] f32182g;

        /* renamed from: h */
        public float[] f32183h;

        /* renamed from: i */
        public float[] f32184i;

        /* renamed from: j */
        public float[] f32185j;

        /* renamed from: k */
        public float[] f32186k;

        /* renamed from: l */
        public int f32187l;

        /* renamed from: m */
        public CurveFit f32188m;

        /* renamed from: n */
        public double[] f32189n;

        /* renamed from: o */
        public double[] f32190o;

        /* renamed from: p */
        public float f32191p;

        public C3680c(int i, String str, int i2, int i3) {
            Oscillator oscillator = new Oscillator();
            this.f32177b = oscillator;
            this.f32178c = 0;
            this.f32179d = 1;
            this.f32180e = 2;
            this.f32187l = i;
            this.f32176a = i2;
            oscillator.setType(i, str);
            this.f32181f = new float[i3];
            this.f32182g = new double[i3];
            this.f32183h = new float[i3];
            this.f32184i = new float[i3];
            this.f32185j = new float[i3];
            this.f32186k = new float[i3];
        }

        /* renamed from: a */
        public double m58723a(float f) {
            CurveFit curveFit = this.f32188m;
            if (curveFit != null) {
                double d = f;
                curveFit.getSlope(d, this.f32190o);
                this.f32188m.getPos(d, this.f32189n);
            } else {
                double[] dArr = this.f32190o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double value = this.f32177b.getValue(d2, this.f32189n[1]);
            double slope = this.f32177b.getSlope(d2, this.f32189n[1], this.f32190o[1]);
            double[] dArr2 = this.f32190o;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.f32189n[2]);
        }

        /* renamed from: b */
        public double m58722b(float f) {
            CurveFit curveFit = this.f32188m;
            if (curveFit != null) {
                curveFit.getPos(f, this.f32189n);
            } else {
                double[] dArr = this.f32189n;
                dArr[0] = this.f32184i[0];
                dArr[1] = this.f32185j[0];
                dArr[2] = this.f32181f[0];
            }
            double[] dArr2 = this.f32189n;
            return dArr2[0] + (this.f32177b.getValue(f, dArr2[1]) * this.f32189n[2]);
        }

        /* renamed from: c */
        public void m58721c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f32182g[i] = i2 / 100.0d;
            this.f32183h[i] = f;
            this.f32184i[i] = f2;
            this.f32185j[i] = f3;
            this.f32181f[i] = f4;
        }

        /* renamed from: d */
        public void m58720d(float f) {
            this.f32191p = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.f32182g.length, 3);
            float[] fArr = this.f32181f;
            this.f32189n = new double[fArr.length + 2];
            this.f32190o = new double[fArr.length + 2];
            if (this.f32182g[0] > 0.0d) {
                this.f32177b.addPoint(0.0d, this.f32183h[0]);
            }
            double[] dArr2 = this.f32182g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f32177b.addPoint(1.0d, this.f32183h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.f32184i[i];
                dArr3[1] = this.f32185j[i];
                dArr3[2] = this.f32181f[i];
                this.f32177b.addPoint(this.f32182g[i], this.f32183h[i]);
            }
            this.f32177b.normalize();
            double[] dArr4 = this.f32182g;
            if (dArr4.length > 1) {
                this.f32188m = CurveFit.get(0, dArr4, dArr);
            } else {
                this.f32188m = null;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$d */
    /* loaded from: classes2.dex */
    public static class C3681d {

        /* renamed from: a */
        public int f32192a;

        /* renamed from: b */
        public float f32193b;

        /* renamed from: c */
        public float f32194c;

        /* renamed from: d */
        public float f32195d;

        /* renamed from: e */
        public float f32196e;

        public C3681d(int i, float f, float f2, float f3, float f4) {
            this.f32192a = i;
            this.f32193b = f4;
            this.f32194c = f2;
            this.f32195d = f;
            this.f32196e = f3;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        if (str.equals("pathRotate")) {
            return new PathRotateSet(str);
        }
        return new C3679b(str);
    }

    public float get(float f) {
        return (float) this.f32166b.m58722b(f);
    }

    public CurveFit getCurveFit() {
        return this.f32165a;
    }

    public float getSlope(float f) {
        return (float) this.f32166b.m58723a(f);
    }

    public void setCustom(Object obj) {
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f32170f.add(new C3681d(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.f32168d = i2;
        setCustom(obj);
        this.f32169e = str;
    }

    public void setProperty(MotionWidget motionWidget, float f) {
    }

    public void setType(String str) {
        this.f32167c = str;
    }

    public void setup(float f) {
        int size = this.f32170f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f32170f, new C3678a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.f32166b = new C3680c(this.f32168d, this.f32169e, this.mVariesBy, size);
        Iterator it = this.f32170f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C3681d c3681d = (C3681d) it.next();
            float f2 = c3681d.f32195d;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = c3681d.f32193b;
            dArr3[0] = f3;
            float f4 = c3681d.f32194c;
            dArr3[1] = f4;
            float f5 = c3681d.f32196e;
            dArr3[2] = f5;
            this.f32166b.m58721c(i, c3681d.f32192a, f2, f4, f5, f3);
            i++;
            dArr2 = dArr2;
        }
        this.f32166b.m58720d(f);
        this.f32165a = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.f32167c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f32170f.iterator();
        while (it.hasNext()) {
            C3681d c3681d = (C3681d) it.next();
            str = str + "[" + c3681d.f32192a + " , " + decimalFormat.format(c3681d.f32193b) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        if (this.mVariesBy == 1) {
            return true;
        }
        return false;
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f32170f.add(new C3681d(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.mVariesBy = i3;
        }
        this.f32168d = i2;
        this.f32169e = str;
    }
}
