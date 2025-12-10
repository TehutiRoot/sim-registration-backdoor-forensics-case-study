package p000;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionPaths;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: yt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C23210yt0 implements Comparable {

    /* renamed from: C */
    public static String[] f108895C = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: c */
    public int f108900c;

    /* renamed from: q */
    public float f108914q;

    /* renamed from: r */
    public float f108915r;

    /* renamed from: s */
    public float f108916s;

    /* renamed from: t */
    public float f108917t;

    /* renamed from: u */
    public float f108918u;

    /* renamed from: a */
    public float f108898a = 1.0f;

    /* renamed from: b */
    public int f108899b = 0;

    /* renamed from: d */
    public boolean f108901d = false;

    /* renamed from: e */
    public float f108902e = 0.0f;

    /* renamed from: f */
    public float f108903f = 0.0f;

    /* renamed from: g */
    public float f108904g = 0.0f;

    /* renamed from: h */
    public float f108905h = 0.0f;

    /* renamed from: i */
    public float f108906i = 1.0f;

    /* renamed from: j */
    public float f108907j = 1.0f;

    /* renamed from: k */
    public float f108908k = Float.NaN;

    /* renamed from: l */
    public float f108909l = Float.NaN;

    /* renamed from: m */
    public float f108910m = 0.0f;

    /* renamed from: n */
    public float f108911n = 0.0f;

    /* renamed from: o */
    public float f108912o = 0.0f;

    /* renamed from: p */
    public int f108913p = 0;

    /* renamed from: v */
    public float f108919v = Float.NaN;

    /* renamed from: w */
    public float f108920w = Float.NaN;

    /* renamed from: x */
    public int f108921x = -1;

    /* renamed from: y */
    public LinkedHashMap f108922y = new LinkedHashMap();

    /* renamed from: z */
    public int f108923z = 0;

    /* renamed from: A */
    public double[] f108896A = new double[18];

    /* renamed from: B */
    public double[] f108897B = new double[18];

    /* renamed from: a */
    public void m175a(HashMap hashMap, int i) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = (SplineSet) hashMap.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f108904g)) {
                        f2 = this.f108904g;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f108905h)) {
                        f2 = this.f108905h;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f108903f)) {
                        f2 = this.f108903f;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f108910m)) {
                        f2 = this.f108910m;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f108911n)) {
                        f2 = this.f108911n;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f108912o)) {
                        f2 = this.f108912o;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f108920w)) {
                        f2 = this.f108920w;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f108908k)) {
                        f2 = this.f108908k;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f108909l)) {
                        f2 = this.f108909l;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f108906i)) {
                        f = this.f108906i;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f108907j)) {
                        f = this.f108907j;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.f108898a)) {
                        f = this.f108898a;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f108919v)) {
                        f2 = this.f108919v;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f108922y.containsKey(str2)) {
                            CustomVariable customVariable = (CustomVariable) this.f108922y.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i, customVariable);
                                break;
                            } else {
                                Utils.loge(MotionPaths.TAG, str + " ViewSpline not a CustomSet frame = " + i + ", value" + customVariable.getValueToInterpolate() + splineSet);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Utils.loge(MotionPaths.TAG, "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    /* renamed from: b */
    public void m174b(MotionWidget motionWidget) {
        float alpha;
        this.f108900c = motionWidget.getVisibility();
        if (motionWidget.getVisibility() != 4) {
            alpha = 0.0f;
        } else {
            alpha = motionWidget.getAlpha();
        }
        this.f108898a = alpha;
        this.f108901d = false;
        this.f108903f = motionWidget.getRotationZ();
        this.f108904g = motionWidget.getRotationX();
        this.f108905h = motionWidget.getRotationY();
        this.f108906i = motionWidget.getScaleX();
        this.f108907j = motionWidget.getScaleY();
        this.f108908k = motionWidget.getPivotX();
        this.f108909l = motionWidget.getPivotY();
        this.f108910m = motionWidget.getTranslationX();
        this.f108911n = motionWidget.getTranslationY();
        this.f108912o = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f108922y.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C23210yt0 c23210yt0) {
        return Float.compare(this.f108914q, c23210yt0.f108914q);
    }

    /* renamed from: d */
    public final boolean m172d(float f, float f2) {
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

    /* renamed from: e */
    public void m171e(C23210yt0 c23210yt0, HashSet hashSet) {
        if (m172d(this.f108898a, c23210yt0.f108898a)) {
            hashSet.add("alpha");
        }
        if (m172d(this.f108902e, c23210yt0.f108902e)) {
            hashSet.add("translationZ");
        }
        int i = this.f108900c;
        int i2 = c23210yt0.f108900c;
        if (i != i2 && this.f108899b == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (m172d(this.f108903f, c23210yt0.f108903f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f108919v) || !Float.isNaN(c23210yt0.f108919v)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f108920w) || !Float.isNaN(c23210yt0.f108920w)) {
            hashSet.add("progress");
        }
        if (m172d(this.f108904g, c23210yt0.f108904g)) {
            hashSet.add("rotationX");
        }
        if (m172d(this.f108905h, c23210yt0.f108905h)) {
            hashSet.add("rotationY");
        }
        if (m172d(this.f108908k, c23210yt0.f108908k)) {
            hashSet.add("pivotX");
        }
        if (m172d(this.f108909l, c23210yt0.f108909l)) {
            hashSet.add("pivotY");
        }
        if (m172d(this.f108906i, c23210yt0.f108906i)) {
            hashSet.add("scaleX");
        }
        if (m172d(this.f108907j, c23210yt0.f108907j)) {
            hashSet.add("scaleY");
        }
        if (m172d(this.f108910m, c23210yt0.f108910m)) {
            hashSet.add("translationX");
        }
        if (m172d(this.f108911n, c23210yt0.f108911n)) {
            hashSet.add("translationY");
        }
        if (m172d(this.f108912o, c23210yt0.f108912o)) {
            hashSet.add("translationZ");
        }
        if (m172d(this.f108902e, c23210yt0.f108902e)) {
            hashSet.add("elevation");
        }
    }

    /* renamed from: f */
    public void m170f(float f, float f2, float f3, float f4) {
        this.f108915r = f;
        this.f108916s = f2;
        this.f108917t = f3;
        this.f108918u = f4;
    }

    /* renamed from: g */
    public void m169g(MotionWidget motionWidget) {
        m170f(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        m174b(motionWidget);
    }

    /* renamed from: h */
    public void m168h(Rect rect, MotionWidget motionWidget, int i, float f) {
        m170f(rect.left, rect.top, rect.width(), rect.height());
        m174b(motionWidget);
        this.f108908k = Float.NaN;
        this.f108909l = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f108903f = f + 90.0f;
                return;
            }
            return;
        }
        this.f108903f = f - 90.0f;
    }
}
