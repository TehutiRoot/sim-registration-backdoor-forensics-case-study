package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Motion implements TypedValues {
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;

    /* renamed from: A */
    public HashMap f32071A;

    /* renamed from: B */
    public MotionKeyTrigger[] f32072B;

    /* renamed from: b */
    public MotionWidget f32081b;

    /* renamed from: h */
    public CurveFit[] f32087h;

    /* renamed from: i */
    public CurveFit f32088i;

    /* renamed from: m */
    public float f32092m;

    /* renamed from: n */
    public float f32093n;

    /* renamed from: o */
    public int[] f32094o;

    /* renamed from: p */
    public double[] f32095p;

    /* renamed from: q */
    public double[] f32096q;

    /* renamed from: r */
    public String[] f32097r;

    /* renamed from: s */
    public int[] f32098s;

    /* renamed from: y */
    public HashMap f32104y;

    /* renamed from: z */
    public HashMap f32105z;

    /* renamed from: a */
    public Rect f32080a = new Rect();

    /* renamed from: c */
    public int f32082c = -1;

    /* renamed from: d */
    public MotionPaths f32083d = new MotionPaths();

    /* renamed from: e */
    public MotionPaths f32084e = new MotionPaths();

    /* renamed from: f */
    public C17595Et0 f32085f = new C17595Et0();

    /* renamed from: g */
    public C17595Et0 f32086g = new C17595Et0();

    /* renamed from: j */
    public float f32089j = Float.NaN;

    /* renamed from: k */
    public float f32090k = 0.0f;

    /* renamed from: l */
    public float f32091l = 1.0f;

    /* renamed from: t */
    public int f32099t = 4;

    /* renamed from: u */
    public float[] f32100u = new float[4];

    /* renamed from: v */
    public ArrayList f32101v = new ArrayList();

    /* renamed from: w */
    public float[] f32102w = new float[1];

    /* renamed from: x */
    public ArrayList f32103x = new ArrayList();

    /* renamed from: C */
    public int f32073C = -1;

    /* renamed from: D */
    public int f32074D = -1;

    /* renamed from: E */
    public MotionWidget f32075E = null;

    /* renamed from: F */
    public int f32076F = -1;

    /* renamed from: G */
    public float f32077G = Float.NaN;

    /* renamed from: H */
    public DifferentialInterpolator f32078H = null;

    /* renamed from: I */
    public boolean f32079I = false;

    /* renamed from: androidx.constraintlayout.core.motion.Motion$a */
    /* loaded from: classes2.dex */
    public static class C3654a implements DifferentialInterpolator {

        /* renamed from: a */
        public float f32106a;

        /* renamed from: b */
        public final /* synthetic */ Easing f32107b;

        public C3654a(Easing easing) {
            this.f32107b = easing;
        }

        @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
        public float getInterpolation(float f) {
            this.f32106a = f;
            return (float) this.f32107b.get(f);
        }

        @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
        public float getVelocity() {
            return (float) this.f32107b.getDiff(this.f32106a);
        }
    }

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    /* renamed from: b */
    public static DifferentialInterpolator m58719b(int i, String str, int i2) {
        if (i != -1) {
            return null;
        }
        return new C3654a(Easing.getInterpolator(str));
    }

    /* renamed from: a */
    public final float m58720a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f32091l;
            if (f4 != 1.0d) {
                float f5 = this.f32090k;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        Easing easing = this.f32083d.f32109a;
        Iterator it = this.f32101v.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths motionPaths = (MotionPaths) it.next();
            Easing easing2 = motionPaths.f32109a;
            if (easing2 != null) {
                float f7 = motionPaths.f32111c;
                if (f7 < f) {
                    easing = easing2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = motionPaths.f32111c;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) easing.get(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    public void addKey(MotionKey motionKey) {
        this.f32103x.add(motionKey);
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f32087h[0].getTimePoints();
        if (iArr != null) {
            Iterator it = this.f32101v.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((MotionPaths) it.next()).f32124p;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator it2 = this.f32101v.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (((MotionPaths) it2.next()).f32112d * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < timePoints.length; i4++) {
            this.f32087h[0].getPos(timePoints[i4], this.f32095p);
            this.f32083d.m58711d(timePoints[i4], this.f32094o, this.f32095p, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void buildPath(float[] fArr, int i) {
        SplineSet splineSet;
        SplineSet splineSet2;
        KeyCycleOscillator keyCycleOscillator;
        double d;
        float f;
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap hashMap = this.f32105z;
        KeyCycleOscillator keyCycleOscillator2 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = (SplineSet) hashMap.get("translationX");
        }
        HashMap hashMap2 = this.f32105z;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = (SplineSet) hashMap2.get("translationY");
        }
        HashMap hashMap3 = this.f32071A;
        if (hashMap3 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = (KeyCycleOscillator) hashMap3.get("translationX");
        }
        HashMap hashMap4 = this.f32071A;
        if (hashMap4 != null) {
            keyCycleOscillator2 = (KeyCycleOscillator) hashMap4.get("translationY");
        }
        KeyCycleOscillator keyCycleOscillator3 = keyCycleOscillator2;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.f32091l;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.f32090k;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            float f8 = f4;
            double d2 = f8;
            Easing easing = this.f32083d.f32109a;
            Iterator it = this.f32101v.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.f32109a;
                double d3 = d2;
                if (easing2 != null) {
                    float f10 = motionPaths.f32111c;
                    if (f10 < f8) {
                        f6 = f10;
                        easing = easing2;
                    } else if (Float.isNaN(f9)) {
                        f9 = motionPaths.f32111c;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (easing != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d = (((float) easing.get((f8 - f6) / f)) * (f9 - f6)) + f6;
            } else {
                d = d4;
            }
            this.f32087h[0].getPos(d, this.f32095p);
            CurveFit curveFit = this.f32088i;
            if (curveFit != null) {
                double[] dArr = this.f32095p;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f32083d.m58711d(d, this.f32094o, this.f32095p, fArr, i3);
            if (keyCycleOscillator != null) {
                fArr[i3] = fArr[i3] + keyCycleOscillator.get(f8);
            } else if (splineSet != null) {
                fArr[i3] = fArr[i3] + splineSet.get(f8);
            }
            if (keyCycleOscillator3 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + keyCycleOscillator3.get(f8);
            } else if (splineSet2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + splineSet2.get(f8);
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.f32087h[0].getPos(m58720a(f, null), this.f32095p);
        this.f32083d.m58707h(this.f32094o, this.f32095p, fArr, i);
    }

    /* renamed from: c */
    public double[] m58718c(double d) {
        this.f32087h[0].getPos(d, this.f32095p);
        CurveFit curveFit = this.f32088i;
        if (curveFit != null) {
            double[] dArr = this.f32095p;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        return this.f32095p;
    }

    /* renamed from: d */
    public final float m58717d() {
        char c;
        float f;
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float f4 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f5 = i * f3;
            double d3 = f5;
            Easing easing = this.f32083d.f32109a;
            Iterator it = this.f32101v.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.f32109a;
                if (easing2 != null) {
                    float f8 = motionPaths.f32111c;
                    if (f8 < f5) {
                        easing = easing2;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = motionPaths.f32111c;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d3 = (((float) easing.get((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.f32087h[0].getPos(d3, this.f32095p);
            float f9 = f4;
            int i2 = i;
            this.f32083d.m58711d(d3, this.f32094o, this.f32095p, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (f9 + Math.hypot(d2 - fArr[1], d - fArr[0]));
            } else {
                c = 0;
                f = f9;
            }
            d = fArr[c];
            i = i2 + 1;
            f4 = f;
            d2 = fArr[1];
        }
        return f4;
    }

    /* renamed from: e */
    public final void m58716e(MotionPaths motionPaths) {
        Iterator it = this.f32101v.iterator();
        MotionPaths motionPaths2 = null;
        while (it.hasNext()) {
            MotionPaths motionPaths3 = (MotionPaths) it.next();
            if (motionPaths.f32112d == motionPaths3.f32112d) {
                motionPaths2 = motionPaths3;
            }
        }
        if (motionPaths2 != null) {
            this.f32101v.remove(motionPaths2);
        }
        int binarySearch = Collections.binarySearch(this.f32101v, motionPaths);
        if (binarySearch == 0) {
            Utils.loge("MotionController", " KeyPath position \"" + motionPaths.f32112d + "\" outside of range");
        }
        this.f32101v.add((-binarySearch) - 1, motionPaths);
    }

    /* renamed from: f */
    public final void m58715f(MotionPaths motionPaths) {
        motionPaths.m58701n(this.f32081b.getX(), this.f32081b.getY(), this.f32081b.getWidth(), this.f32081b.getHeight());
    }

    public int getAnimateRelativeTo() {
        return this.f32083d.f32120l;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f32087h[0].getPos(d, dArr);
        this.f32087h[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f32083d.m58710e(d, this.f32094o, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.f32092m;
    }

    public float getCenterY() {
        return this.f32093n;
    }

    public int getDrawPath() {
        int i = this.f32083d.f32110b;
        Iterator it = this.f32101v.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((MotionPaths) it.next()).f32110b);
        }
        return Math.max(i, this.f32084e.f32110b);
    }

    public float getFinalHeight() {
        return this.f32084e.f32116h;
    }

    public float getFinalWidth() {
        return this.f32084e.f32115g;
    }

    public float getFinalX() {
        return this.f32084e.f32113e;
    }

    public float getFinalY() {
        return this.f32084e.f32114f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i) {
        return (MotionPaths) this.f32101v.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        Iterator it = this.f32103x.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            MotionKey motionKey = (MotionKey) it.next();
            int i4 = motionKey.mType;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = motionKey.mFramePosition;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.f32087h[0].getPos(d, this.f32095p);
                this.f32083d.m58711d(d, this.f32094o, this.f32095p, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i3 + 5] = motionKeyPosition.mPositionType;
                    iArr[i3 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator it = this.f32103x.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            MotionKey motionKey = (MotionKey) it.next();
            int i3 = motionKey.mFramePosition;
            iArr[i] = (motionKey.mType * 1000) + i3;
            double d = i3 / 100.0f;
            this.f32087h[0].getPos(d, this.f32095p);
            this.f32083d.m58711d(d, this.f32094o, this.f32095p, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public float getStartHeight() {
        return this.f32083d.f32116h;
    }

    public float getStartWidth() {
        return this.f32083d.f32115g;
    }

    public float getStartX() {
        return this.f32083d.f32113e;
    }

    public float getStartY() {
        return this.f32083d.f32114f;
    }

    public int getTransformPivotTarget() {
        return this.f32074D;
    }

    public MotionWidget getView() {
        return this.f32081b;
    }

    public boolean interpolate(MotionWidget motionWidget, float f, long j, KeyCache keyCache) {
        double d;
        MotionWidget motionWidget2;
        float f2;
        float m58720a = m58720a(f, null);
        int i = this.f32076F;
        if (i != -1) {
            float f3 = 1.0f / i;
            float floor = ((float) Math.floor(m58720a / f3)) * f3;
            float f4 = (m58720a % f3) / f3;
            if (!Float.isNaN(this.f32077G)) {
                f4 = (f4 + this.f32077G) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.f32078H;
            if (differentialInterpolator != null) {
                f2 = differentialInterpolator.getInterpolation(f4);
            } else if (f4 > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            m58720a = (f2 * f3) + floor;
        }
        float f5 = m58720a;
        HashMap hashMap = this.f32105z;
        if (hashMap != null) {
            for (SplineSet splineSet : hashMap.values()) {
                splineSet.setProperty(motionWidget, f5);
            }
        }
        CurveFit[] curveFitArr = this.f32087h;
        if (curveFitArr != null) {
            double d2 = f5;
            curveFitArr[0].getPos(d2, this.f32095p);
            this.f32087h[0].getSlope(d2, this.f32096q);
            CurveFit curveFit = this.f32088i;
            if (curveFit != null) {
                double[] dArr = this.f32095p;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                    this.f32088i.getSlope(d2, this.f32096q);
                }
            }
            if (!this.f32079I) {
                d = d2;
                this.f32083d.m58700o(f5, motionWidget, this.f32094o, this.f32095p, this.f32096q, null);
            } else {
                d = d2;
            }
            if (this.f32074D != -1) {
                if (this.f32075E == null) {
                    this.f32075E = motionWidget.getParent().findViewById(this.f32074D);
                }
                if (this.f32075E != null) {
                    float top = (motionWidget2.getTop() + this.f32075E.getBottom()) / 2.0f;
                    float left = (this.f32075E.getLeft() + this.f32075E.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        motionWidget.setPivotX(left - motionWidget.getLeft());
                        motionWidget.setPivotY(top - motionWidget.getTop());
                    }
                }
            }
            int i2 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.f32087h;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d, this.f32100u);
                ((CustomVariable) this.f32083d.f32123o.get(this.f32097r[i2 - 1])).setInterpolatedValue(motionWidget, this.f32100u);
                i2++;
            }
            C17595Et0 c17595Et0 = this.f32085f;
            if (c17595Et0.f1480b == 0) {
                if (f5 <= 0.0f) {
                    motionWidget.setVisibility(c17595Et0.f1481c);
                } else if (f5 >= 1.0f) {
                    motionWidget.setVisibility(this.f32086g.f1481c);
                } else if (this.f32086g.f1481c != c17595Et0.f1481c) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.f32072B != null) {
                int i3 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.f32072B;
                    if (i3 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i3].conditionallyFire(f5, motionWidget);
                    i3++;
                }
            }
        } else {
            MotionPaths motionPaths = this.f32083d;
            float f6 = motionPaths.f32113e;
            MotionPaths motionPaths2 = this.f32084e;
            float f7 = f6 + ((motionPaths2.f32113e - f6) * f5);
            float f8 = motionPaths.f32114f;
            float f9 = f8 + ((motionPaths2.f32114f - f8) * f5);
            float f10 = motionPaths.f32115g;
            float f11 = f10 + ((motionPaths2.f32115g - f10) * f5);
            float f12 = motionPaths.f32116h;
            float f13 = f7 + 0.5f;
            float f14 = f9 + 0.5f;
            motionWidget.layout((int) f13, (int) f14, (int) (f13 + f11), (int) (f14 + f12 + ((motionPaths2.f32116h - f12) * f5)));
        }
        HashMap hashMap2 = this.f32071A;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.f32096q;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f5, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget, f5);
                }
            }
            return false;
        }
        return false;
    }

    public void setDrawPath(int i) {
        this.f32083d.f32110b = i;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f32084e;
        motionPaths.f32111c = 1.0f;
        motionPaths.f32112d = 1.0f;
        m58715f(motionPaths);
        this.f32084e.m58701n(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.f32084e.applyParameters(motionWidget);
        this.f32086g.m68569g(motionWidget);
    }

    public void setPathMotionArc(int i) {
        this.f32073C = i;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f32083d;
        motionPaths.f32111c = 0.0f;
        motionPaths.f32112d = 0.0f;
        motionPaths.m58701n(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.f32083d.applyParameters(motionWidget);
        this.f32085f.m68569g(motionWidget);
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i, int i2, int i3) {
        MotionPaths motionPaths = this.f32083d;
        motionPaths.f32111c = 0.0f;
        motionPaths.f32112d = 0.0f;
        Rect rect = new Rect();
        if (i != 1) {
            if (i == 2) {
                int i4 = viewState.left + viewState.right;
                rect.left = i3 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
                rect.top = (i4 - viewState.height()) / 2;
                rect.right = rect.left + viewState.width();
                rect.bottom = rect.top + viewState.height();
            }
        } else {
            int i5 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - ((i5 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.f32083d.m58701n(rect.left, rect.top, rect.width(), rect.height());
        this.f32085f.m68568h(rect, motionWidget, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.f32074D = i;
        this.f32075E = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.f32081b = motionWidget;
    }

    public void setup(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        MotionPaths motionPaths;
        int i3;
        int i4;
        CustomVariable customVariable;
        int i5;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        int i6;
        Integer num;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i7 = this.f32073C;
        if (i7 != -1) {
            this.f32083d.f32119k = i7;
        }
        this.f32085f.m68571e(this.f32086g, hashSet2);
        ArrayList arrayList2 = this.f32103x;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                MotionKey motionKey = (MotionKey) it.next();
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    m58716e(new MotionPaths(i, i2, motionKeyPosition, this.f32083d, this.f32084e));
                    int i8 = motionKeyPosition.mCurveFit;
                    if (i8 != -1) {
                        this.f32082c = i8;
                    }
                } else if (motionKey instanceof MotionKeyCycle) {
                    motionKey.getAttributeNames(hashSet3);
                } else if (motionKey instanceof MotionKeyTimeCycle) {
                    motionKey.getAttributeNames(hashSet);
                } else if (motionKey instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) motionKey);
                } else {
                    motionKey.setInterpolation(hashMap);
                    motionKey.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f32072B = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f32105z = new HashMap();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next.split(",")[c];
                    Iterator it3 = this.f32103x.iterator();
                    while (it3.hasNext()) {
                        MotionKey motionKey2 = (MotionKey) it3.next();
                        HashMap<String, CustomVariable> hashMap2 = motionKey2.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(motionKey2.mFramePosition, customVariable3);
                        }
                    }
                    makeSpline2 = SplineSet.makeCustomSplineSet(next, customVar);
                } else {
                    makeSpline2 = SplineSet.makeSpline(next, j);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next);
                    this.f32105z.put(next, makeSpline2);
                }
                c = 1;
            }
            ArrayList arrayList3 = this.f32103x;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    MotionKey motionKey3 = (MotionKey) it4.next();
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        motionKey3.addValues(this.f32105z);
                    }
                }
            }
            this.f32085f.m68575a(this.f32105z, 0);
            this.f32086g.m68575a(this.f32105z, 100);
            for (String str2 : this.f32105z.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 0;
                }
                SplineSet splineSet = (SplineSet) this.f32105z.get(str2);
                if (splineSet != null) {
                    splineSet.setup(i6);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f32104y == null) {
                this.f32104y = new HashMap();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next2 = it5.next();
                if (!this.f32104y.containsKey(next2)) {
                    if (next2.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next2.split(",")[1];
                        Iterator it6 = this.f32103x.iterator();
                        while (it6.hasNext()) {
                            MotionKey motionKey4 = (MotionKey) it6.next();
                            HashMap<String, CustomVariable> hashMap3 = motionKey4.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(motionKey4.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next2, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next2, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next2);
                    }
                }
            }
            ArrayList arrayList4 = this.f32103x;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    MotionKey motionKey5 = (MotionKey) it7.next();
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).addTimeValues(this.f32104y);
                    }
                }
            }
            for (String str4 : this.f32104y.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i5 = hashMap.get(str4).intValue();
                } else {
                    i5 = 0;
                }
                ((TimeCycleSplineSet) this.f32104y.get(str4)).setup(i5);
            }
        }
        int size = this.f32101v.size();
        int i9 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i9];
        motionPathsArr[0] = this.f32083d;
        motionPathsArr[size + 1] = this.f32084e;
        if (this.f32101v.size() > 0 && this.f32082c == MotionKey.UNSET) {
            this.f32082c = 0;
        }
        Iterator it8 = this.f32101v.iterator();
        int i10 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i10] = (MotionPaths) it8.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f32084e.f32123o.keySet()) {
            if (this.f32083d.f32123o.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f32097r = strArr2;
        this.f32098s = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.f32097r;
            if (i11 >= strArr.length) {
                break;
            }
            String str6 = strArr[i11];
            this.f32098s[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= i9) {
                    break;
                }
                if (motionPathsArr[i12].f32123o.containsKey(str6) && (customVariable = (CustomVariable) motionPathsArr[i12].f32123o.get(str6)) != null) {
                    int[] iArr = this.f32098s;
                    iArr[i11] = iArr[i11] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i12++;
            }
            i11++;
        }
        if (motionPathsArr[0].f32119k != -1) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < i9; i13++) {
            motionPathsArr[i13].m58713b(motionPathsArr[i13 - 1], zArr, this.f32097r, z);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.f32094o = new int[i14];
        int i16 = 2;
        int max = Math.max(2, i14);
        this.f32095p = new double[max];
        this.f32096q = new double[max];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.f32094o[i17] = i18;
                i17++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, i9, this.f32094o.length);
        double[] dArr2 = new double[i9];
        for (int i19 = 0; i19 < i9; i19++) {
            motionPathsArr[i19].m58712c(dArr[i19], this.f32094o);
            dArr2[i19] = motionPathsArr[i19].f32111c;
        }
        int i20 = 0;
        while (true) {
            int[] iArr2 = this.f32094o;
            if (i20 >= iArr2.length) {
                break;
            }
            if (iArr2[i20] < MotionPaths.f32108t.length) {
                String str7 = MotionPaths.f32108t[this.f32094o[i20]] + " [";
                for (int i21 = 0; i21 < i9; i21++) {
                    str7 = str7 + dArr[i21][i20];
                }
            }
            i20++;
        }
        this.f32087h = new CurveFit[this.f32097r.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.f32097r;
            if (i22 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i22];
            int i23 = 0;
            int i24 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i23 < i9) {
                if (motionPathsArr[i23].m58706i(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i9];
                        int[] iArr3 = new int[i16];
                        iArr3[1] = motionPathsArr[i23].m58708g(str8);
                        i4 = 0;
                        iArr3[0] = i9;
                        dArr4 = (double[][]) Array.newInstance(Double.TYPE, iArr3);
                    } else {
                        i4 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i23];
                    i3 = i9;
                    dArr3[i24] = motionPaths2.f32111c;
                    motionPaths2.m58709f(str8, dArr4[i24], i4);
                    i24++;
                } else {
                    i3 = i9;
                }
                i23++;
                i9 = i3;
                i16 = 2;
            }
            i22++;
            this.f32087h[i22] = CurveFit.get(this.f32082c, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
            i9 = i9;
            i16 = 2;
        }
        int i25 = i9;
        this.f32087h[0] = CurveFit.get(this.f32082c, dArr2, dArr);
        if (motionPathsArr[0].f32119k != -1) {
            int[] iArr4 = new int[i25];
            double[] dArr5 = new double[i25];
            double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, i25, 2);
            for (int i26 = 0; i26 < i25; i26++) {
                iArr4[i26] = motionPathsArr[i26].f32119k;
                dArr5[i26] = motionPaths.f32111c;
                double[] dArr7 = dArr6[i26];
                dArr7[0] = motionPaths.f32113e;
                dArr7[1] = motionPaths.f32114f;
            }
            this.f32088i = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.f32071A = new HashMap();
        if (this.f32103x != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String next3 = it9.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next3);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f2)) {
                        f2 = m58717d();
                    }
                    makeWidgetCycle.setType(next3);
                    this.f32071A.put(next3, makeWidgetCycle);
                }
            }
            Iterator it10 = this.f32103x.iterator();
            while (it10.hasNext()) {
                MotionKey motionKey6 = (MotionKey) it10.next();
                if (motionKey6 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey6).addCycleValues(this.f32071A);
                }
            }
            for (KeyCycleOscillator keyCycleOscillator : this.f32071A.values()) {
                keyCycleOscillator.setup(f2);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.f32083d.setupRelative(motion, motion.f32083d);
        this.f32084e.setupRelative(motion, motion.f32084e);
    }

    public String toString() {
        return " start: x: " + this.f32083d.f32113e + " y: " + this.f32083d.f32114f + " end: x: " + this.f32084e.f32113e + " y: " + this.f32084e.f32114f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i != 509) {
            return i == 704;
        }
        setPathMotionArc(i2);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (705 == i) {
            PrintStream printStream = System.out;
            printStream.println("TYPE_INTERPOLATOR  " + str);
            this.f32078H = m58719b(-1, str, 0);
        }
        return false;
    }
}