package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class ViewSpline extends SplineSet {

    /* loaded from: classes2.dex */
    public static class CustomSet extends ViewSpline {

        /* renamed from: c */
        public String f32671c;

        /* renamed from: d */
        public SparseArray f32672d;

        /* renamed from: e */
        public float[] f32673e;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f32671c = str.split(",")[1];
            this.f32672d = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            this.mCurveFit.getPos(f, this.f32673e);
            CustomSupport.setInterpolatedValue((ConstraintAttribute) this.f32672d.valueAt(0), view, this.f32673e);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i) {
            int size = this.f32672d.size();
            int numberOfInterpolatedValues = ((ConstraintAttribute) this.f32672d.valueAt(0)).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f32673e = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, numberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.f32672d.keyAt(i2) * 0.01d;
                ((ConstraintAttribute) this.f32672d.valueAt(i2)).getValuesToInterpolate(this.f32673e);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f32673e;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, ConstraintAttribute constraintAttribute) {
            this.f32672d.append(i, constraintAttribute);
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$a */
    /* loaded from: classes2.dex */
    public static class C3720a extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setAlpha(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$b */
    /* loaded from: classes2.dex */
    public static class C3721b extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setElevation(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$c */
    /* loaded from: classes2.dex */
    public static class C3722c extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setPivotX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$d */
    /* loaded from: classes2.dex */
    public static class C3723d extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setPivotY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$e */
    /* loaded from: classes2.dex */
    public static class C3724e extends ViewSpline {

        /* renamed from: c */
        public boolean f32674c = false;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f));
            } else if (this.f32674c) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f32674c = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(f)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$f */
    /* loaded from: classes2.dex */
    public static class C3725f extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setRotation(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$g */
    /* loaded from: classes2.dex */
    public static class C3726g extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setRotationX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$h */
    /* loaded from: classes2.dex */
    public static class C3727h extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setRotationY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$i */
    /* loaded from: classes2.dex */
    public static class C3728i extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setScaleX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$j */
    /* loaded from: classes2.dex */
    public static class C3729j extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setScaleY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$k */
    /* loaded from: classes2.dex */
    public static class C3730k extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$l */
    /* loaded from: classes2.dex */
    public static class C3731l extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewSpline$m */
    /* loaded from: classes2.dex */
    public static class C3732m extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline makeSpline(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = TokenParser.f74557CR;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3726g();
            case 1:
                return new C3727h();
            case 2:
                return new C3730k();
            case 3:
                return new C3731l();
            case 4:
                return new C3732m();
            case 5:
                return new C3724e();
            case 6:
                return new C3728i();
            case 7:
                return new C3729j();
            case '\b':
                return new C3720a();
            case '\t':
                return new C3722c();
            case '\n':
                return new C3723d();
            case 11:
                return new C3725f();
            case '\f':
                return new C3721b();
            case '\r':
                return new PathRotate();
            case 14:
                return new C3720a();
            case 15:
                return new C3720a();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f);
}
