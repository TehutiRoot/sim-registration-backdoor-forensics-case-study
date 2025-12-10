package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {

    /* loaded from: classes2.dex */
    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$a */
    /* loaded from: classes2.dex */
    public static class C3690a extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setAlpha(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$b */
    /* loaded from: classes2.dex */
    public static class C3691b extends ViewOscillator {

        /* renamed from: g */
        public float[] f32756g = new float[1];

        /* renamed from: h */
        public ConstraintAttribute f32757h;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setCustom(Object obj) {
            this.f32757h = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            this.f32756g[0] = get(f);
            CustomSupport.setInterpolatedValue(this.f32757h, view, this.f32756g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$c */
    /* loaded from: classes2.dex */
    public static class C3692c extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setElevation(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$d */
    /* loaded from: classes2.dex */
    public static class C3693d extends ViewOscillator {

        /* renamed from: g */
        public boolean f32758g = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f));
            } else if (this.f32758g) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f32758g = true;
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

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$e */
    /* loaded from: classes2.dex */
    public static class C3694e extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setRotation(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$f */
    /* loaded from: classes2.dex */
    public static class C3695f extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setRotationX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$g */
    /* loaded from: classes2.dex */
    public static class C3696g extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setRotationY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$h */
    /* loaded from: classes2.dex */
    public static class C3697h extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setScaleX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$i */
    /* loaded from: classes2.dex */
    public static class C3698i extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setScaleY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$j */
    /* loaded from: classes2.dex */
    public static class C3699j extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$k */
    /* loaded from: classes2.dex */
    public static class C3700k extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.ViewOscillator$l */
    /* loaded from: classes2.dex */
    public static class C3701l extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C3691b();
        }
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
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = TokenParser.f74641CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3695f();
            case 1:
                return new C3696g();
            case 2:
                return new C3699j();
            case 3:
                return new C3700k();
            case 4:
                return new C3701l();
            case 5:
                return new C3693d();
            case 6:
                return new C3697h();
            case 7:
                return new C3698i();
            case '\b':
                return new C3690a();
            case '\t':
                return new C3694e();
            case '\n':
                return new C3692c();
            case 11:
                return new PathRotateSet();
            case '\f':
                return new C3690a();
            case '\r':
                return new C3690a();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f);
}