package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.apache.http.message.TokenParser;

/* renamed from: xt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C23038xt0 implements Comparable {

    /* renamed from: D */
    public static String[] f108531D = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: c */
    public int f108537c;

    /* renamed from: p */
    public Easing f108550p;

    /* renamed from: r */
    public float f108552r;

    /* renamed from: s */
    public float f108553s;

    /* renamed from: t */
    public float f108554t;

    /* renamed from: u */
    public float f108555u;

    /* renamed from: v */
    public float f108556v;

    /* renamed from: a */
    public float f108535a = 1.0f;

    /* renamed from: b */
    public int f108536b = 0;

    /* renamed from: d */
    public boolean f108538d = false;

    /* renamed from: e */
    public float f108539e = 0.0f;

    /* renamed from: f */
    public float f108540f = 0.0f;

    /* renamed from: g */
    public float f108541g = 0.0f;

    /* renamed from: h */
    public float f108542h = 0.0f;

    /* renamed from: i */
    public float f108543i = 1.0f;

    /* renamed from: j */
    public float f108544j = 1.0f;

    /* renamed from: k */
    public float f108545k = Float.NaN;

    /* renamed from: l */
    public float f108546l = Float.NaN;

    /* renamed from: m */
    public float f108547m = 0.0f;

    /* renamed from: n */
    public float f108548n = 0.0f;

    /* renamed from: o */
    public float f108549o = 0.0f;

    /* renamed from: q */
    public int f108551q = 0;

    /* renamed from: w */
    public float f108557w = Float.NaN;

    /* renamed from: x */
    public float f108558x = Float.NaN;

    /* renamed from: y */
    public int f108559y = -1;

    /* renamed from: z */
    public LinkedHashMap f108560z = new LinkedHashMap();

    /* renamed from: A */
    public int f108532A = 0;

    /* renamed from: B */
    public double[] f108533B = new double[18];

    /* renamed from: C */
    public double[] f108534C = new double[18];

    /* renamed from: a */
    public void m380a(HashMap hashMap, int i) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = (ViewSpline) hashMap.get(str);
            str.hashCode();
            float f = 1.0f;
            float f2 = 0.0f;
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
                case -760884510:
                    if (str.equals(Key.PIVOT_X)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(Key.PIVOT_Y)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(Key.ROTATION)) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = TokenParser.f74557CR;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f108541g)) {
                        f2 = this.f108541g;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f108542h)) {
                        f2 = this.f108542h;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f108547m)) {
                        f2 = this.f108547m;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f108548n)) {
                        f2 = this.f108548n;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f108549o)) {
                        f2 = this.f108549o;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f108558x)) {
                        f2 = this.f108558x;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f108543i)) {
                        f = this.f108543i;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f108544j)) {
                        f = this.f108544j;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f108545k)) {
                        f2 = this.f108545k;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f108546l)) {
                        f2 = this.f108546l;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f108540f)) {
                        f2 = this.f108540f;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f108539e)) {
                        f2 = this.f108539e;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f108557w)) {
                        f2 = this.f108557w;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f108535a)) {
                        f = this.f108535a;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f108560z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f108560z.get(str2);
                            if (viewSpline instanceof ViewSpline.CustomSet) {
                                ((ViewSpline.CustomSet) viewSpline).setPoint(i, constraintAttribute);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(" ViewSpline not a CustomSet frame = ");
                                sb.append(i);
                                sb.append(", value");
                                sb.append(constraintAttribute.getValueToInterpolate());
                                sb.append(viewSpline);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("UNKNOWN spline ");
                        sb2.append(str);
                        break;
                    }
            }
        }
    }

    /* renamed from: b */
    public void m379b(View view) {
        float alpha;
        this.f108537c = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f108535a = alpha;
        this.f108538d = false;
        this.f108539e = view.getElevation();
        this.f108540f = view.getRotation();
        this.f108541g = view.getRotationX();
        this.f108542h = view.getRotationY();
        this.f108543i = view.getScaleX();
        this.f108544j = view.getScaleY();
        this.f108545k = view.getPivotX();
        this.f108546l = view.getPivotY();
        this.f108547m = view.getTranslationX();
        this.f108548n = view.getTranslationY();
        this.f108549o = view.getTranslationZ();
    }

    /* renamed from: c */
    public void m378c(ConstraintSet.Constraint constraint) {
        float f;
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i = propertySet.mVisibilityMode;
        this.f108536b = i;
        int i2 = propertySet.visibility;
        this.f108537c = i2;
        if (i2 != 0 && i == 0) {
            f = 0.0f;
        } else {
            f = propertySet.alpha;
        }
        this.f108535a = f;
        ConstraintSet.Transform transform = constraint.transform;
        this.f108538d = transform.applyElevation;
        this.f108539e = transform.elevation;
        this.f108540f = transform.rotation;
        this.f108541g = transform.rotationX;
        this.f108542h = transform.rotationY;
        this.f108543i = transform.scaleX;
        this.f108544j = transform.scaleY;
        this.f108545k = transform.transformPivotX;
        this.f108546l = transform.transformPivotY;
        this.f108547m = transform.translationX;
        this.f108548n = transform.translationY;
        this.f108549o = transform.translationZ;
        this.f108550p = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.f108557w = motion.mPathRotate;
        this.f108551q = motion.mDrawPath;
        this.f108559y = motion.mAnimateRelativeTo;
        this.f108558x = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.f108560z.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(C23038xt0 c23038xt0) {
        return Float.compare(this.f108552r, c23038xt0.f108552r);
    }

    /* renamed from: e */
    public final boolean m376e(float f, float f2) {
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

    /* renamed from: f */
    public void m375f(C23038xt0 c23038xt0, HashSet hashSet) {
        if (m376e(this.f108535a, c23038xt0.f108535a)) {
            hashSet.add("alpha");
        }
        if (m376e(this.f108539e, c23038xt0.f108539e)) {
            hashSet.add("elevation");
        }
        int i = this.f108537c;
        int i2 = c23038xt0.f108537c;
        if (i != i2 && this.f108536b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m376e(this.f108540f, c23038xt0.f108540f)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f108557w) || !Float.isNaN(c23038xt0.f108557w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f108558x) || !Float.isNaN(c23038xt0.f108558x)) {
            hashSet.add("progress");
        }
        if (m376e(this.f108541g, c23038xt0.f108541g)) {
            hashSet.add("rotationX");
        }
        if (m376e(this.f108542h, c23038xt0.f108542h)) {
            hashSet.add("rotationY");
        }
        if (m376e(this.f108545k, c23038xt0.f108545k)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (m376e(this.f108546l, c23038xt0.f108546l)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (m376e(this.f108543i, c23038xt0.f108543i)) {
            hashSet.add("scaleX");
        }
        if (m376e(this.f108544j, c23038xt0.f108544j)) {
            hashSet.add("scaleY");
        }
        if (m376e(this.f108547m, c23038xt0.f108547m)) {
            hashSet.add("translationX");
        }
        if (m376e(this.f108548n, c23038xt0.f108548n)) {
            hashSet.add("translationY");
        }
        if (m376e(this.f108549o, c23038xt0.f108549o)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: g */
    public void m374g(float f, float f2, float f3, float f4) {
        this.f108553s = f;
        this.f108554t = f2;
        this.f108555u = f3;
        this.f108556v = f4;
    }

    /* renamed from: h */
    public void m373h(Rect rect, View view, int i, float f) {
        m374g(rect.left, rect.top, rect.width(), rect.height());
        m379b(view);
        this.f108545k = Float.NaN;
        this.f108546l = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f108540f = f + 90.0f;
                return;
            }
            return;
        }
        this.f108540f = f - 90.0f;
    }

    /* renamed from: i */
    public void m372i(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        m374g(rect.left, rect.top, rect.width(), rect.height());
        m378c(constraintSet.getParameters(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f108540f + 90.0f;
            this.f108540f = f;
            if (f > 180.0f) {
                this.f108540f = f - 360.0f;
                return;
            }
            return;
        }
        this.f108540f -= 90.0f;
    }

    /* renamed from: j */
    public void m371j(View view) {
        m374g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m379b(view);
    }
}
