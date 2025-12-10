package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionController {
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

    /* renamed from: B */
    public HashMap f32789B;

    /* renamed from: C */
    public HashMap f32790C;

    /* renamed from: D */
    public HashMap f32791D;

    /* renamed from: E */
    public KeyTrigger[] f32792E;

    /* renamed from: F */
    public int f32793F;

    /* renamed from: G */
    public int f32794G;

    /* renamed from: H */
    public View f32795H;

    /* renamed from: I */
    public int f32796I;

    /* renamed from: J */
    public float f32797J;

    /* renamed from: K */
    public Interpolator f32798K;

    /* renamed from: L */
    public boolean f32799L;

    /* renamed from: b */
    public View f32801b;

    /* renamed from: c */
    public int f32802c;

    /* renamed from: e */
    public String f32804e;

    /* renamed from: k */
    public CurveFit[] f32810k;

    /* renamed from: l */
    public CurveFit f32811l;

    /* renamed from: p */
    public float f32815p;

    /* renamed from: q */
    public float f32816q;

    /* renamed from: r */
    public int[] f32817r;

    /* renamed from: s */
    public double[] f32818s;

    /* renamed from: t */
    public double[] f32819t;

    /* renamed from: u */
    public String[] f32820u;

    /* renamed from: v */
    public int[] f32821v;

    /* renamed from: a */
    public Rect f32800a = new Rect();

    /* renamed from: d */
    public boolean f32803d = false;

    /* renamed from: f */
    public int f32805f = -1;

    /* renamed from: g */
    public C17631Ft0 f32806g = new C17631Ft0();

    /* renamed from: h */
    public C17631Ft0 f32807h = new C17631Ft0();

    /* renamed from: i */
    public C23038xt0 f32808i = new C23038xt0();

    /* renamed from: j */
    public C23038xt0 f32809j = new C23038xt0();

    /* renamed from: m */
    public float f32812m = Float.NaN;

    /* renamed from: n */
    public float f32813n = 0.0f;

    /* renamed from: o */
    public float f32814o = 1.0f;

    /* renamed from: w */
    public int f32822w = 4;

    /* renamed from: x */
    public float[] f32823x = new float[4];

    /* renamed from: y */
    public ArrayList f32824y = new ArrayList();

    /* renamed from: z */
    public float[] f32825z = new float[1];

    /* renamed from: A */
    public ArrayList f32788A = new ArrayList();

    /* renamed from: androidx.constraintlayout.motion.widget.MotionController$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC3749a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f32826a;

        public animationInterpolatorC3749a(Easing easing) {
            this.f32826a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f32826a.get(f);
        }
    }

    public MotionController(View view) {
        int i = Key.UNSET;
        this.f32793F = i;
        this.f32794G = i;
        this.f32795H = null;
        this.f32796I = i;
        this.f32797J = Float.NaN;
        this.f32798K = null;
        this.f32799L = false;
        setView(view);
    }

    /* renamed from: j */
    public static Interpolator m58391j(Context context, int i, String str, int i2) {
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC3749a(Easing.getInterpolator(str));
        }
        return AnimationUtils.loadInterpolator(context, i2);
    }

    /* renamed from: a */
    public void m58400a(ArrayList arrayList) {
        this.f32788A.addAll(arrayList);
    }

    public void addKey(Key key) {
        this.f32788A.add(key);
    }

    /* renamed from: b */
    public int m58399b(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f32810k[0].getTimePoints();
        if (iArr != null) {
            Iterator it = this.f32824y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((C17631Ft0) it.next()).f1733p;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.f32810k[0].getPos(timePoints[i3], this.f32818s);
            this.f32806g.m68338f(timePoints[i3], this.f32817r, this.f32818s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: c */
    public void m58398c(float[] fArr, int i) {
        SplineSet splineSet;
        SplineSet splineSet2;
        ViewOscillator viewOscillator;
        double d;
        float f;
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap hashMap = this.f32790C;
        ViewOscillator viewOscillator2 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = (SplineSet) hashMap.get("translationX");
        }
        HashMap hashMap2 = this.f32790C;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = (SplineSet) hashMap2.get("translationY");
        }
        HashMap hashMap3 = this.f32791D;
        if (hashMap3 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = (ViewOscillator) hashMap3.get("translationX");
        }
        HashMap hashMap4 = this.f32791D;
        if (hashMap4 != null) {
            viewOscillator2 = (ViewOscillator) hashMap4.get("translationY");
        }
        ViewOscillator viewOscillator3 = viewOscillator2;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.f32814o;
            float f6 = 0.0f;
            if (f5 != f2) {
                float f7 = this.f32813n;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, f2);
                }
            }
            float f8 = f4;
            double d2 = f8;
            Easing easing = this.f32806g.f1718a;
            Iterator it = this.f32824y.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                C17631Ft0 c17631Ft0 = (C17631Ft0) it.next();
                Easing easing2 = c17631Ft0.f1718a;
                double d3 = d2;
                if (easing2 != null) {
                    float f10 = c17631Ft0.f1720c;
                    if (f10 < f8) {
                        f6 = f10;
                        easing = easing2;
                    } else if (Float.isNaN(f9)) {
                        f9 = c17631Ft0.f1720c;
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
            this.f32810k[0].getPos(d, this.f32818s);
            CurveFit curveFit = this.f32811l;
            if (curveFit != null) {
                double[] dArr = this.f32818s;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.f32806g.m68338f(d, this.f32817r, this.f32818s, fArr, i3);
            if (viewOscillator != null) {
                fArr[i3] = fArr[i3] + viewOscillator.get(f8);
            } else if (splineSet != null) {
                fArr[i3] = fArr[i3] + splineSet.get(f8);
            }
            if (viewOscillator3 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + viewOscillator3.get(f8);
            } else if (splineSet2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + splineSet2.get(f8);
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    /* renamed from: d */
    public void m58397d(float f, float[] fArr, int i) {
        this.f32810k[0].getPos(m58394g(f, null), this.f32818s);
        this.f32806g.m68334j(this.f32817r, this.f32818s, fArr, i);
    }

    /* renamed from: e */
    public void m58396e(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.f32810k[0].getPos(m58394g(i2 * f, null), this.f32818s);
            this.f32806g.m68334j(this.f32817r, this.f32818s, fArr, i2 * 8);
        }
    }

    /* renamed from: f */
    public void m58395f(boolean z) {
        float f;
        if ("button".equals(Debug.getName(this.f32801b)) && this.f32792E != null) {
            int i = 0;
            while (true) {
                KeyTrigger[] keyTriggerArr = this.f32792E;
                if (i < keyTriggerArr.length) {
                    KeyTrigger keyTrigger = keyTriggerArr[i];
                    if (z) {
                        f = -100.0f;
                    } else {
                        f = 100.0f;
                    }
                    keyTrigger.conditionallyFire(f, this.f32801b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final float m58394g(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f32814o;
            if (f4 != 1.0d) {
                float f5 = this.f32813n;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        Easing easing = this.f32806g.f1718a;
        Iterator it = this.f32824y.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C17631Ft0 c17631Ft0 = (C17631Ft0) it.next();
            Easing easing2 = c17631Ft0.f1718a;
            if (easing2 != null) {
                float f7 = c17631Ft0.f1720c;
                if (f7 < f) {
                    easing = easing2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = c17631Ft0.f1720c;
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

    public int getAnimateRelativeTo() {
        return this.f32806g.f1729l;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f32810k[0].getPos(d, dArr);
        this.f32810k[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f32806g.m68337g(d, this.f32817r, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.f32815p;
    }

    public float getCenterY() {
        return this.f32816q;
    }

    public int getDrawPath() {
        int i = this.f32806g.f1719b;
        Iterator it = this.f32824y.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((C17631Ft0) it.next()).f1719b);
        }
        return Math.max(i, this.f32807h.f1719b);
    }

    public float getFinalHeight() {
        return this.f32807h.f1725h;
    }

    public float getFinalWidth() {
        return this.f32807h.f1724g;
    }

    public float getFinalX() {
        return this.f32807h.f1722e;
    }

    public float getFinalY() {
        return this.f32807h.f1723f;
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        Iterator it = this.f32788A.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Key key = (Key) it.next();
            int i4 = key.mType;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = key.f32689a;
                iArr[i3 + 2] = i5;
                double d = i5 / 100.0f;
                this.f32810k[0].getPos(d, this.f32818s);
                this.f32806g.m68338f(d, this.f32817r, this.f32818s, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i3 + 5] = keyPosition.f32743o;
                    iArr[i3 + 6] = Float.floatToIntBits(keyPosition.f32739k);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(keyPosition.f32740l);
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
        Iterator it = this.f32788A.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Key key = (Key) it.next();
            int i3 = key.f32689a;
            iArr[i] = (key.mType * 1000) + i3;
            double d = i3 / 100.0f;
            this.f32810k[0].getPos(d, this.f32818s);
            this.f32806g.m68338f(d, this.f32817r, this.f32818s, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public float getStartHeight() {
        return this.f32806g.f1725h;
    }

    public float getStartWidth() {
        return this.f32806g.f1724g;
    }

    public float getStartX() {
        return this.f32806g.f1722e;
    }

    public float getStartY() {
        return this.f32806g.f1723f;
    }

    public int getTransformPivotTarget() {
        return this.f32794G;
    }

    public View getView() {
        return this.f32801b;
    }

    /* renamed from: h */
    public int m58393h(String str, float[] fArr, int i) {
        SplineSet splineSet = (SplineSet) this.f32790C.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = splineSet.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    /* renamed from: i */
    public void m58392i(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float m58394g = m58394g(f, this.f32825z);
        CurveFit[] curveFitArr = this.f32810k;
        int i = 0;
        if (curveFitArr != null) {
            double d = m58394g;
            curveFitArr[0].getSlope(d, this.f32819t);
            this.f32810k[0].getPos(d, this.f32818s);
            float f4 = this.f32825z[0];
            while (true) {
                dArr = this.f32819t;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            CurveFit curveFit = this.f32811l;
            if (curveFit != null) {
                double[] dArr2 = this.f32818s;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.f32811l.getSlope(d, this.f32819t);
                    this.f32806g.m68327q(f2, f3, fArr, this.f32817r, this.f32819t, this.f32818s);
                    return;
                }
                return;
            }
            this.f32806g.m68327q(f2, f3, fArr, this.f32817r, dArr, this.f32818s);
            return;
        }
        C17631Ft0 c17631Ft0 = this.f32807h;
        float f5 = c17631Ft0.f1722e;
        C17631Ft0 c17631Ft02 = this.f32806g;
        float f6 = f5 - c17631Ft02.f1722e;
        float f7 = c17631Ft0.f1723f - c17631Ft02.f1723f;
        float f8 = (c17631Ft0.f1724g - c17631Ft02.f1724g) + f6;
        float f9 = (c17631Ft0.f1725h - c17631Ft02.f1725h) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: k */
    public C17631Ft0 m58390k(int i) {
        return (C17631Ft0) this.f32824y.get(i);
    }

    /* renamed from: l */
    public float m58389l(int i, float f, float f2) {
        C17631Ft0 c17631Ft0 = this.f32807h;
        float f3 = c17631Ft0.f1722e;
        C17631Ft0 c17631Ft02 = this.f32806g;
        float f4 = c17631Ft02.f1722e;
        float f5 = f3 - f4;
        float f6 = c17631Ft0.f1723f;
        float f7 = c17631Ft02.f1723f;
        float f8 = f6 - f7;
        float f9 = f4 + (c17631Ft02.f1724g / 2.0f);
        float f10 = f7 + (c17631Ft02.f1725h / 2.0f);
        float hypot = (float) Math.hypot(f5, f8);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0.0f;
                            }
                            return f12 / f8;
                        }
                        return f11 / f8;
                    }
                    return f12 / f5;
                }
                return f11 / f5;
            }
            return (float) Math.sqrt((hypot * hypot) - (f13 * f13));
        }
        return f13 / hypot;
    }

    /* renamed from: m */
    public AbstractC17794Ih0 m58388m(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        C17631Ft0 c17631Ft0 = this.f32806g;
        float f3 = c17631Ft0.f1722e;
        rectF.left = f3;
        float f4 = c17631Ft0.f1723f;
        rectF.top = f4;
        rectF.right = f3 + c17631Ft0.f1724g;
        rectF.bottom = f4 + c17631Ft0.f1725h;
        RectF rectF2 = new RectF();
        C17631Ft0 c17631Ft02 = this.f32807h;
        float f5 = c17631Ft02.f1722e;
        rectF2.left = f5;
        float f6 = c17631Ft02.f1723f;
        rectF2.top = f6;
        rectF2.right = f5 + c17631Ft02.f1724g;
        rectF2.bottom = f6 + c17631Ft02.f1725h;
        Iterator it = this.f32788A.iterator();
        while (it.hasNext()) {
            Key key = (Key) it.next();
            if (key instanceof AbstractC17794Ih0) {
                AbstractC17794Ih0 abstractC17794Ih0 = (AbstractC17794Ih0) key;
                if (abstractC17794Ih0.intersects(i, i2, rectF, rectF2, f, f2)) {
                    return abstractC17794Ih0;
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m58387n(float f, int i, int i2, float f2, float f3, float[] fArr) {
        SplineSet splineSet;
        SplineSet splineSet2;
        SplineSet splineSet3;
        SplineSet splineSet4;
        SplineSet splineSet5;
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        ViewOscillator viewOscillator3;
        ViewOscillator viewOscillator4;
        float m58394g = m58394g(f, this.f32825z);
        HashMap hashMap = this.f32790C;
        ViewOscillator viewOscillator5 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = (SplineSet) hashMap.get("translationX");
        }
        HashMap hashMap2 = this.f32790C;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = (SplineSet) hashMap2.get("translationY");
        }
        HashMap hashMap3 = this.f32790C;
        if (hashMap3 == null) {
            splineSet3 = null;
        } else {
            splineSet3 = (SplineSet) hashMap3.get(Key.ROTATION);
        }
        HashMap hashMap4 = this.f32790C;
        if (hashMap4 == null) {
            splineSet4 = null;
        } else {
            splineSet4 = (SplineSet) hashMap4.get("scaleX");
        }
        HashMap hashMap5 = this.f32790C;
        if (hashMap5 == null) {
            splineSet5 = null;
        } else {
            splineSet5 = (SplineSet) hashMap5.get("scaleY");
        }
        HashMap hashMap6 = this.f32791D;
        if (hashMap6 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = (ViewOscillator) hashMap6.get("translationX");
        }
        HashMap hashMap7 = this.f32791D;
        if (hashMap7 == null) {
            viewOscillator2 = null;
        } else {
            viewOscillator2 = (ViewOscillator) hashMap7.get("translationY");
        }
        HashMap hashMap8 = this.f32791D;
        if (hashMap8 == null) {
            viewOscillator3 = null;
        } else {
            viewOscillator3 = (ViewOscillator) hashMap8.get(Key.ROTATION);
        }
        HashMap hashMap9 = this.f32791D;
        if (hashMap9 == null) {
            viewOscillator4 = null;
        } else {
            viewOscillator4 = (ViewOscillator) hashMap9.get("scaleX");
        }
        HashMap hashMap10 = this.f32791D;
        if (hashMap10 != null) {
            viewOscillator5 = (ViewOscillator) hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, m58394g);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, m58394g);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, m58394g);
        velocityMatrix.setRotationVelocity(viewOscillator3, m58394g);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, m58394g);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, m58394g);
        CurveFit curveFit = this.f32811l;
        if (curveFit != null) {
            double[] dArr = this.f32818s;
            if (dArr.length > 0) {
                double d = m58394g;
                curveFit.getPos(d, dArr);
                this.f32811l.getSlope(d, this.f32819t);
                this.f32806g.m68327q(f2, f3, fArr, this.f32817r, this.f32819t, this.f32818s);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f32810k != null) {
            double m58394g2 = m58394g(m58394g, this.f32825z);
            this.f32810k[0].getSlope(m58394g2, this.f32819t);
            this.f32810k[0].getPos(m58394g2, this.f32818s);
            float f4 = this.f32825z[0];
            while (true) {
                double[] dArr2 = this.f32819t;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * f4;
                    i3++;
                } else {
                    this.f32806g.m68327q(f2, f3, fArr, this.f32817r, dArr2, this.f32818s);
                    velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C17631Ft0 c17631Ft0 = this.f32807h;
            float f5 = c17631Ft0.f1722e;
            C17631Ft0 c17631Ft02 = this.f32806g;
            float f6 = f5 - c17631Ft02.f1722e;
            float f7 = c17631Ft0.f1723f - c17631Ft02.f1723f;
            ViewOscillator viewOscillator6 = viewOscillator4;
            float f8 = (c17631Ft0.f1725h - c17631Ft02.f1725h) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (((c17631Ft0.f1724g - c17631Ft02.f1724g) + f6) * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f8 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, m58394g);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, m58394g);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, m58394g);
            velocityMatrix.setRotationVelocity(viewOscillator3, m58394g);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, m58394g);
            velocityMatrix.setScaleVelocity(viewOscillator6, viewOscillator5, m58394g);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: o */
    public final float m58386o() {
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
            Easing easing = this.f32806g.f1718a;
            Iterator it = this.f32824y.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it.hasNext()) {
                C17631Ft0 c17631Ft0 = (C17631Ft0) it.next();
                Easing easing2 = c17631Ft0.f1718a;
                if (easing2 != null) {
                    float f8 = c17631Ft0.f1720c;
                    if (f8 < f5) {
                        easing = easing2;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = c17631Ft0.f1720c;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d3 = (((float) easing.get((f5 - f7) / f2)) * (f6 - f7)) + f7;
            }
            this.f32810k[0].getPos(d3, this.f32818s);
            float f9 = f4;
            int i2 = i;
            this.f32806g.m68338f(d3, this.f32817r, this.f32818s, fArr, 0);
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

    /* renamed from: p */
    public final void m58385p(C17631Ft0 c17631Ft0) {
        int binarySearch = Collections.binarySearch(this.f32824y, c17631Ft0);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(c17631Ft0.f1721d);
            sb.append("\" outside of range");
        }
        this.f32824y.add((-binarySearch) - 1, c17631Ft0);
    }

    /* renamed from: q */
    public boolean m58384q(View view, float f, long j, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z;
        char c;
        double d;
        View view2;
        float f2;
        float m58394g = m58394g(f, null);
        int i = this.f32796I;
        if (i != Key.UNSET) {
            float f3 = 1.0f / i;
            float floor = ((float) Math.floor(m58394g / f3)) * f3;
            float f4 = (m58394g % f3) / f3;
            if (!Float.isNaN(this.f32797J)) {
                f4 = (f4 + this.f32797J) % 1.0f;
            }
            Interpolator interpolator = this.f32798K;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else if (f4 > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            m58394g = (f2 * f3) + floor;
        }
        float f5 = m58394g;
        HashMap hashMap = this.f32790C;
        if (hashMap != null) {
            for (ViewSpline viewSpline : hashMap.values()) {
                viewSpline.setProperty(view, f5);
            }
        }
        HashMap hashMap2 = this.f32789B;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z2 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z2 |= viewTimeCycle.setProperty(view, f5, j, keyCache);
                }
            }
            z = z2;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z = false;
        }
        CurveFit[] curveFitArr = this.f32810k;
        if (curveFitArr != null) {
            double d2 = f5;
            curveFitArr[0].getPos(d2, this.f32818s);
            this.f32810k[0].getSlope(d2, this.f32819t);
            CurveFit curveFit = this.f32811l;
            if (curveFit != null) {
                double[] dArr = this.f32818s;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                    this.f32811l.getSlope(d2, this.f32819t);
                }
            }
            if (!this.f32799L) {
                d = d2;
                this.f32806g.m68326r(f5, view, this.f32817r, this.f32818s, this.f32819t, null, this.f32803d);
                this.f32803d = false;
            } else {
                d = d2;
            }
            if (this.f32794G != Key.UNSET) {
                if (this.f32795H == null) {
                    this.f32795H = ((View) view.getParent()).findViewById(this.f32794G);
                }
                if (this.f32795H != null) {
                    float top = (view2.getTop() + this.f32795H.getBottom()) / 2.0f;
                    float left = (this.f32795H.getLeft() + this.f32795H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.f32790C;
            if (hashMap3 != null) {
                for (SplineSet splineSet : hashMap3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.f32819t;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) splineSet).setPathRotate(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.f32819t;
                c = 1;
                z |= pathRotate.setPathRotate(view, keyCache, f5, j, dArr3[0], dArr3[1]);
            } else {
                c = 1;
            }
            int i2 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.f32810k;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d, this.f32823x);
                CustomSupport.setInterpolatedValue((ConstraintAttribute) this.f32806g.f1732o.get(this.f32820u[i2 - 1]), view, this.f32823x);
                i2++;
            }
            C23038xt0 c23038xt0 = this.f32808i;
            if (c23038xt0.f108536b == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(c23038xt0.f108537c);
                } else if (f5 >= 1.0f) {
                    view.setVisibility(this.f32809j.f108537c);
                } else if (this.f32809j.f108537c != c23038xt0.f108537c) {
                    view.setVisibility(0);
                }
            }
            if (this.f32792E != null) {
                int i3 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.f32792E;
                    if (i3 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i3].conditionallyFire(f5, view);
                    i3++;
                }
            }
        } else {
            c = 1;
            C17631Ft0 c17631Ft0 = this.f32806g;
            float f6 = c17631Ft0.f1722e;
            C17631Ft0 c17631Ft02 = this.f32807h;
            float f7 = f6 + ((c17631Ft02.f1722e - f6) * f5);
            float f8 = c17631Ft0.f1723f;
            float f9 = f8 + ((c17631Ft02.f1723f - f8) * f5);
            float f10 = c17631Ft0.f1724g;
            float f11 = c17631Ft02.f1724g;
            float f12 = c17631Ft0.f1725h;
            float f13 = c17631Ft02.f1725h;
            float f14 = f7 + 0.5f;
            int i4 = (int) f14;
            float f15 = f9 + 0.5f;
            int i5 = (int) f15;
            int i6 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i7 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f11 != f10 || f13 != f12 || this.f32803d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.f32803d = false;
            }
            view.layout(i4, i5, i6, i7);
        }
        HashMap hashMap4 = this.f32791D;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.f32819t;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f5, dArr4[0], dArr4[c]);
                } else {
                    viewOscillator.setProperty(view, f5);
                }
            }
        }
        return z;
    }

    /* renamed from: r */
    public void m58383r(View view, AbstractC17794Ih0 abstractC17794Ih0, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        C17631Ft0 c17631Ft0 = this.f32806g;
        float f3 = c17631Ft0.f1722e;
        rectF.left = f3;
        float f4 = c17631Ft0.f1723f;
        rectF.top = f4;
        rectF.right = f3 + c17631Ft0.f1724g;
        rectF.bottom = f4 + c17631Ft0.f1725h;
        RectF rectF2 = new RectF();
        C17631Ft0 c17631Ft02 = this.f32807h;
        float f5 = c17631Ft02.f1722e;
        rectF2.left = f5;
        float f6 = c17631Ft02.f1723f;
        rectF2.top = f6;
        rectF2.right = f5 + c17631Ft02.f1724g;
        rectF2.bottom = f6 + c17631Ft02.f1725h;
        abstractC17794Ih0.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public void remeasure() {
        this.f32803d = true;
    }

    /* renamed from: s */
    public final void m58382s(C17631Ft0 c17631Ft0) {
        c17631Ft0.m68328p((int) this.f32801b.getX(), (int) this.f32801b.getY(), this.f32801b.getWidth(), this.f32801b.getHeight());
    }

    public void setDrawPath(int i) {
        this.f32806g.f1719b = i;
    }

    public void setPathMotionArc(int i) {
        this.f32793F = i;
    }

    public void setStartState(ViewState viewState, View view, int i, int i2, int i3) {
        C17631Ft0 c17631Ft0 = this.f32806g;
        c17631Ft0.f1720c = 0.0f;
        c17631Ft0.f1721d = 0.0f;
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
        this.f32806g.m68328p(rect.left, rect.top, rect.width(), rect.height());
        this.f32808i.m373h(rect, view, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.f32794G = i;
        this.f32795H = null;
    }

    public void setView(View view) {
        this.f32801b = view;
        this.f32802c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f32804e = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        boolean z;
        C17631Ft0 c17631Ft0;
        double[][] dArr;
        ConstraintAttribute constraintAttribute;
        int i3;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        int i4;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i5 = this.f32793F;
        if (i5 != Key.UNSET) {
            this.f32806g.f1728k = i5;
        }
        this.f32808i.m375f(this.f32809j, hashSet2);
        ArrayList arrayList2 = this.f32788A;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key key = (Key) it.next();
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    m58385p(new C17631Ft0(i, i2, keyPosition, this.f32806g, this.f32807h));
                    int i6 = keyPosition.f2578e;
                    if (i6 != Key.UNSET) {
                        this.f32805f = i6;
                    }
                } else if (key instanceof KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key);
                } else {
                    key.setInterpolation(hashMap);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f32792E = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.f32790C = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it3 = this.f32788A.iterator();
                    while (it3.hasNext()) {
                        Key key2 = (Key) it3.next();
                        HashMap hashMap2 = key2.f32692d;
                        if (hashMap2 != null && (constraintAttribute3 = (ConstraintAttribute) hashMap2.get(str2)) != null) {
                            sparseArray.append(key2.f32689a, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(str, sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(str);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(str);
                    this.f32790C.put(str, makeSpline2);
                }
            }
            ArrayList arrayList3 = this.f32788A;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key key3 = (Key) it4.next();
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(this.f32790C);
                    }
                }
            }
            this.f32808i.m380a(this.f32790C, 0);
            this.f32809j.m380a(this.f32790C, 100);
            for (String str3 : this.f32790C.keySet()) {
                if (hashMap.containsKey(str3) && (num = hashMap.get(str3)) != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                SplineSet splineSet = (SplineSet) this.f32790C.get(str3);
                if (splineSet != null) {
                    splineSet.setup(i4);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f32789B == null) {
                this.f32789B = new HashMap();
            }
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String str4 = (String) it5.next();
                if (!this.f32789B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it6 = this.f32788A.iterator();
                        while (it6.hasNext()) {
                            Key key4 = (Key) it6.next();
                            HashMap hashMap3 = key4.f32692d;
                            if (hashMap3 != null && (constraintAttribute2 = (ConstraintAttribute) hashMap3.get(str5)) != null) {
                                sparseArray2.append(key4.f32689a, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(str4, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(str4, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(str4);
                        this.f32789B.put(str4, makeSpline);
                    }
                }
            }
            ArrayList arrayList4 = this.f32788A;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key key5 = (Key) it7.next();
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(this.f32789B);
                    }
                }
            }
            for (String str6 : this.f32789B.keySet()) {
                if (hashMap.containsKey(str6)) {
                    i3 = hashMap.get(str6).intValue();
                } else {
                    i3 = 0;
                }
                ((ViewTimeCycle) this.f32789B.get(str6)).setup(i3);
            }
        }
        int size = this.f32824y.size();
        int i7 = size + 2;
        C17631Ft0[] c17631Ft0Arr = new C17631Ft0[i7];
        c17631Ft0Arr[0] = this.f32806g;
        c17631Ft0Arr[size + 1] = this.f32807h;
        if (this.f32824y.size() > 0 && this.f32805f == -1) {
            this.f32805f = 0;
        }
        Iterator it8 = this.f32824y.iterator();
        int i8 = 1;
        while (it8.hasNext()) {
            c17631Ft0Arr[i8] = (C17631Ft0) it8.next();
            i8++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f32807h.f1732o.keySet()) {
            if (this.f32806g.f1732o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f32820u = strArr2;
        this.f32821v = new int[strArr2.length];
        int i9 = 0;
        while (true) {
            strArr = this.f32820u;
            if (i9 >= strArr.length) {
                break;
            }
            String str8 = strArr[i9];
            this.f32821v[i9] = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    break;
                }
                if (c17631Ft0Arr[i10].f1732o.containsKey(str8) && (constraintAttribute = (ConstraintAttribute) c17631Ft0Arr[i10].f1732o.get(str8)) != null) {
                    int[] iArr = this.f32821v;
                    iArr[i9] = iArr[i9] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i10++;
            }
            i9++;
        }
        if (c17631Ft0Arr[0].f1728k != Key.UNSET) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 1; i11 < i7; i11++) {
            c17631Ft0Arr[i11].m68340d(c17631Ft0Arr[i11 - 1], zArr, this.f32820u, z);
        }
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                i12++;
            }
        }
        this.f32817r = new int[i12];
        int i14 = 2;
        int max = Math.max(2, i12);
        this.f32818s = new double[max];
        this.f32819t = new double[max];
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                this.f32817r[i15] = i16;
                i15++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i7, this.f32817r.length);
        double[] dArr3 = new double[i7];
        for (int i17 = 0; i17 < i7; i17++) {
            c17631Ft0Arr[i17].m68339e(dArr2[i17], this.f32817r);
            dArr3[i17] = c17631Ft0Arr[i17].f1720c;
        }
        int i18 = 0;
        while (true) {
            int[] iArr2 = this.f32817r;
            if (i18 >= iArr2.length) {
                break;
            }
            if (iArr2[i18] < C17631Ft0.f1717t.length) {
                String str9 = C17631Ft0.f1717t[this.f32817r[i18]] + " [";
                for (int i19 = 0; i19 < i7; i19++) {
                    str9 = str9 + dArr2[i19][i18];
                }
            }
            i18++;
        }
        this.f32810k = new CurveFit[this.f32820u.length + 1];
        int i20 = 0;
        while (true) {
            String[] strArr3 = this.f32820u;
            if (i20 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i20];
            int i21 = 0;
            double[] dArr4 = null;
            int i22 = 0;
            double[][] dArr5 = null;
            while (i21 < i7) {
                if (c17631Ft0Arr[i21].m68333k(str10)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i7];
                        int[] iArr3 = new int[i14];
                        iArr3[c] = c17631Ft0Arr[i21].m68335i(str10);
                        iArr3[0] = i7;
                        dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr3);
                    }
                    C17631Ft0 c17631Ft02 = c17631Ft0Arr[i21];
                    dArr = dArr2;
                    dArr4[i22] = c17631Ft02.f1720c;
                    c17631Ft02.m68336h(str10, dArr5[i22], 0);
                    i22++;
                } else {
                    dArr = dArr2;
                }
                i21++;
                dArr2 = dArr;
                i14 = 2;
                c = 1;
            }
            i20++;
            this.f32810k[i20] = CurveFit.get(this.f32805f, Arrays.copyOf(dArr4, i22), (double[][]) Arrays.copyOf(dArr5, i22));
            dArr2 = dArr2;
            i14 = 2;
            c = 1;
        }
        this.f32810k[0] = CurveFit.get(this.f32805f, dArr3, dArr2);
        if (c17631Ft0Arr[0].f1728k != Key.UNSET) {
            int[] iArr4 = new int[i7];
            double[] dArr6 = new double[i7];
            double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, i7, 2);
            for (int i23 = 0; i23 < i7; i23++) {
                iArr4[i23] = c17631Ft0Arr[i23].f1728k;
                dArr6[i23] = c17631Ft0.f1720c;
                double[] dArr8 = dArr7[i23];
                dArr8[0] = c17631Ft0.f1722e;
                dArr8[1] = c17631Ft0.f1723f;
            }
            this.f32811l = CurveFit.getArc(iArr4, dArr6, dArr7);
        }
        this.f32791D = new HashMap();
        if (this.f32788A != null) {
            Iterator it9 = hashSet3.iterator();
            float f2 = Float.NaN;
            while (it9.hasNext()) {
                String str11 = (String) it9.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(str11);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f2)) {
                        f2 = m58386o();
                    }
                    makeSpline3.setType(str11);
                    this.f32791D.put(str11, makeSpline3);
                }
            }
            Iterator it10 = this.f32788A.iterator();
            while (it10.hasNext()) {
                Key key6 = (Key) it10.next();
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).addCycleValues(this.f32791D);
                }
            }
            for (ViewOscillator viewOscillator : this.f32791D.values()) {
                viewOscillator.setup(f2);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.f32806g.m68325s(motionController, motionController.f32806g);
        this.f32807h.m68325s(motionController, motionController.f32807h);
    }

    /* renamed from: t */
    public void m58381t(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        int i4 = rect.left + rect.right;
                        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i4 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i5 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
                rect2.top = i3 - ((i5 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i3 - ((i7 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public String toString() {
        return " start: x: " + this.f32806g.f1722e + " y: " + this.f32806g.f1723f + " end: x: " + this.f32807h.f1722e + " y: " + this.f32807h.f1723f;
    }

    /* renamed from: u */
    public void m58380u(View view) {
        C17631Ft0 c17631Ft0 = this.f32806g;
        c17631Ft0.f1720c = 0.0f;
        c17631Ft0.f1721d = 0.0f;
        this.f32799L = true;
        c17631Ft0.m68328p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f32807h.m68328p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f32808i.m371j(view);
        this.f32809j.m371j(view);
    }

    /* renamed from: v */
    public void m58379v(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            m58381t(rect, this.f32800a, i3, i, i2);
            rect = this.f32800a;
        }
        C17631Ft0 c17631Ft0 = this.f32807h;
        c17631Ft0.f1720c = 1.0f;
        c17631Ft0.f1721d = 1.0f;
        m58382s(c17631Ft0);
        this.f32807h.m68328p(rect.left, rect.top, rect.width(), rect.height());
        this.f32807h.m68343a(constraintSet.getParameters(this.f32802c));
        this.f32809j.m372i(rect, constraintSet, i3, this.f32802c);
    }

    /* renamed from: w */
    public void m58378w(View view) {
        C17631Ft0 c17631Ft0 = this.f32806g;
        c17631Ft0.f1720c = 0.0f;
        c17631Ft0.f1721d = 0.0f;
        c17631Ft0.m68328p(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f32808i.m371j(view);
    }

    /* renamed from: x */
    public void m58377x(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            m58381t(rect, this.f32800a, i3, i, i2);
        }
        C17631Ft0 c17631Ft0 = this.f32806g;
        c17631Ft0.f1720c = 0.0f;
        c17631Ft0.f1721d = 0.0f;
        m58382s(c17631Ft0);
        this.f32806g.m68328p(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.f32802c);
        this.f32806g.m68343a(parameters);
        this.f32812m = parameters.motion.mMotionStagger;
        this.f32808i.m372i(rect, constraintSet, i3, this.f32802c);
        this.f32794G = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.f32796I = motion.mQuantizeMotionSteps;
        this.f32797J = motion.mQuantizeMotionPhase;
        Context context = this.f32801b.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.f32798K = m58391j(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
