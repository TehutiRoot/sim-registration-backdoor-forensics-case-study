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

/* renamed from: Dt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C17530Dt0 implements Comparable {

    /* renamed from: D */
    public static String[] f1140D = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: c */
    public int f1146c;

    /* renamed from: p */
    public Easing f1159p;

    /* renamed from: r */
    public float f1161r;

    /* renamed from: s */
    public float f1162s;

    /* renamed from: t */
    public float f1163t;

    /* renamed from: u */
    public float f1164u;

    /* renamed from: v */
    public float f1165v;

    /* renamed from: a */
    public float f1144a = 1.0f;

    /* renamed from: b */
    public int f1145b = 0;

    /* renamed from: d */
    public boolean f1147d = false;

    /* renamed from: e */
    public float f1148e = 0.0f;

    /* renamed from: f */
    public float f1149f = 0.0f;

    /* renamed from: g */
    public float f1150g = 0.0f;

    /* renamed from: h */
    public float f1151h = 0.0f;

    /* renamed from: i */
    public float f1152i = 1.0f;

    /* renamed from: j */
    public float f1153j = 1.0f;

    /* renamed from: k */
    public float f1154k = Float.NaN;

    /* renamed from: l */
    public float f1155l = Float.NaN;

    /* renamed from: m */
    public float f1156m = 0.0f;

    /* renamed from: n */
    public float f1157n = 0.0f;

    /* renamed from: o */
    public float f1158o = 0.0f;

    /* renamed from: q */
    public int f1160q = 0;

    /* renamed from: w */
    public float f1166w = Float.NaN;

    /* renamed from: x */
    public float f1167x = Float.NaN;

    /* renamed from: y */
    public int f1168y = -1;

    /* renamed from: z */
    public LinkedHashMap f1169z = new LinkedHashMap();

    /* renamed from: A */
    public int f1141A = 0;

    /* renamed from: B */
    public double[] f1142B = new double[18];

    /* renamed from: C */
    public double[] f1143C = new double[18];

    /* renamed from: a */
    public void m68751a(HashMap hashMap, int i) {
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
                        c = TokenParser.f74641CR;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f1150g)) {
                        f2 = this.f1150g;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1151h)) {
                        f2 = this.f1151h;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1156m)) {
                        f2 = this.f1156m;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1157n)) {
                        f2 = this.f1157n;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1158o)) {
                        f2 = this.f1158o;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1167x)) {
                        f2 = this.f1167x;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f1152i)) {
                        f = this.f1152i;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1153j)) {
                        f = this.f1153j;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f1154k)) {
                        f2 = this.f1154k;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f1155l)) {
                        f2 = this.f1155l;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f1149f)) {
                        f2 = this.f1149f;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1148e)) {
                        f2 = this.f1148e;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f1166w)) {
                        f2 = this.f1166w;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f1144a)) {
                        f = this.f1144a;
                    }
                    viewSpline.setPoint(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f1169z.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f1169z.get(str2);
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
    public void m68750b(View view) {
        float alpha;
        this.f1146c = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f1144a = alpha;
        this.f1147d = false;
        this.f1148e = view.getElevation();
        this.f1149f = view.getRotation();
        this.f1150g = view.getRotationX();
        this.f1151h = view.getRotationY();
        this.f1152i = view.getScaleX();
        this.f1153j = view.getScaleY();
        this.f1154k = view.getPivotX();
        this.f1155l = view.getPivotY();
        this.f1156m = view.getTranslationX();
        this.f1157n = view.getTranslationY();
        this.f1158o = view.getTranslationZ();
    }

    /* renamed from: c */
    public void m68749c(ConstraintSet.Constraint constraint) {
        float f;
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i = propertySet.mVisibilityMode;
        this.f1145b = i;
        int i2 = propertySet.visibility;
        this.f1146c = i2;
        if (i2 != 0 && i == 0) {
            f = 0.0f;
        } else {
            f = propertySet.alpha;
        }
        this.f1144a = f;
        ConstraintSet.Transform transform = constraint.transform;
        this.f1147d = transform.applyElevation;
        this.f1148e = transform.elevation;
        this.f1149f = transform.rotation;
        this.f1150g = transform.rotationX;
        this.f1151h = transform.rotationY;
        this.f1152i = transform.scaleX;
        this.f1153j = transform.scaleY;
        this.f1154k = transform.transformPivotX;
        this.f1155l = transform.transformPivotY;
        this.f1156m = transform.translationX;
        this.f1157n = transform.translationY;
        this.f1158o = transform.translationZ;
        this.f1159p = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.f1166w = motion.mPathRotate;
        this.f1160q = motion.mDrawPath;
        this.f1168y = motion.mAnimateRelativeTo;
        this.f1167x = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.f1169z.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(C17530Dt0 c17530Dt0) {
        return Float.compare(this.f1161r, c17530Dt0.f1161r);
    }

    /* renamed from: e */
    public final boolean m68747e(float f, float f2) {
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
    public void m68746f(C17530Dt0 c17530Dt0, HashSet hashSet) {
        if (m68747e(this.f1144a, c17530Dt0.f1144a)) {
            hashSet.add("alpha");
        }
        if (m68747e(this.f1148e, c17530Dt0.f1148e)) {
            hashSet.add("elevation");
        }
        int i = this.f1146c;
        int i2 = c17530Dt0.f1146c;
        if (i != i2 && this.f1145b == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m68747e(this.f1149f, c17530Dt0.f1149f)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f1166w) || !Float.isNaN(c17530Dt0.f1166w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1167x) || !Float.isNaN(c17530Dt0.f1167x)) {
            hashSet.add("progress");
        }
        if (m68747e(this.f1150g, c17530Dt0.f1150g)) {
            hashSet.add("rotationX");
        }
        if (m68747e(this.f1151h, c17530Dt0.f1151h)) {
            hashSet.add("rotationY");
        }
        if (m68747e(this.f1154k, c17530Dt0.f1154k)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (m68747e(this.f1155l, c17530Dt0.f1155l)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (m68747e(this.f1152i, c17530Dt0.f1152i)) {
            hashSet.add("scaleX");
        }
        if (m68747e(this.f1153j, c17530Dt0.f1153j)) {
            hashSet.add("scaleY");
        }
        if (m68747e(this.f1156m, c17530Dt0.f1156m)) {
            hashSet.add("translationX");
        }
        if (m68747e(this.f1157n, c17530Dt0.f1157n)) {
            hashSet.add("translationY");
        }
        if (m68747e(this.f1158o, c17530Dt0.f1158o)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: g */
    public void m68745g(float f, float f2, float f3, float f4) {
        this.f1162s = f;
        this.f1163t = f2;
        this.f1164u = f3;
        this.f1165v = f4;
    }

    /* renamed from: h */
    public void m68744h(Rect rect, View view, int i, float f) {
        m68745g(rect.left, rect.top, rect.width(), rect.height());
        m68750b(view);
        this.f1154k = Float.NaN;
        this.f1155l = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f1149f = f + 90.0f;
                return;
            }
            return;
        }
        this.f1149f = f - 90.0f;
    }

    /* renamed from: i */
    public void m68743i(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        m68745g(rect.left, rect.top, rect.width(), rect.height());
        m68749c(constraintSet.getParameters(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f1149f + 90.0f;
            this.f1149f = f;
            if (f > 180.0f) {
                this.f1149f = f - 360.0f;
                return;
            }
            return;
        }
        this.f1149f -= 90.0f;
    }

    /* renamed from: j */
    public void m68742j(View view) {
        m68745g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m68750b(view);
    }
}