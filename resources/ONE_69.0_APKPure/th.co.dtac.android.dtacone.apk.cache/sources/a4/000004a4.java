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

/* renamed from: Et0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C17595Et0 implements Comparable {

    /* renamed from: C */
    public static String[] f1476C = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "width", "height", "pathRotate"};

    /* renamed from: c */
    public int f1481c;

    /* renamed from: q */
    public float f1495q;

    /* renamed from: r */
    public float f1496r;

    /* renamed from: s */
    public float f1497s;

    /* renamed from: t */
    public float f1498t;

    /* renamed from: u */
    public float f1499u;

    /* renamed from: a */
    public float f1479a = 1.0f;

    /* renamed from: b */
    public int f1480b = 0;

    /* renamed from: d */
    public boolean f1482d = false;

    /* renamed from: e */
    public float f1483e = 0.0f;

    /* renamed from: f */
    public float f1484f = 0.0f;

    /* renamed from: g */
    public float f1485g = 0.0f;

    /* renamed from: h */
    public float f1486h = 0.0f;

    /* renamed from: i */
    public float f1487i = 1.0f;

    /* renamed from: j */
    public float f1488j = 1.0f;

    /* renamed from: k */
    public float f1489k = Float.NaN;

    /* renamed from: l */
    public float f1490l = Float.NaN;

    /* renamed from: m */
    public float f1491m = 0.0f;

    /* renamed from: n */
    public float f1492n = 0.0f;

    /* renamed from: o */
    public float f1493o = 0.0f;

    /* renamed from: p */
    public int f1494p = 0;

    /* renamed from: v */
    public float f1500v = Float.NaN;

    /* renamed from: w */
    public float f1501w = Float.NaN;

    /* renamed from: x */
    public int f1502x = -1;

    /* renamed from: y */
    public LinkedHashMap f1503y = new LinkedHashMap();

    /* renamed from: z */
    public int f1504z = 0;

    /* renamed from: A */
    public double[] f1477A = new double[18];

    /* renamed from: B */
    public double[] f1478B = new double[18];

    /* renamed from: a */
    public void m68575a(HashMap hashMap, int i) {
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
                    if (!Float.isNaN(this.f1485g)) {
                        f2 = this.f1485g;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1486h)) {
                        f2 = this.f1486h;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1484f)) {
                        f2 = this.f1484f;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1491m)) {
                        f2 = this.f1491m;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1492n)) {
                        f2 = this.f1492n;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1493o)) {
                        f2 = this.f1493o;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f1501w)) {
                        f2 = this.f1501w;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1489k)) {
                        f2 = this.f1489k;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f1490l)) {
                        f2 = this.f1490l;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f1487i)) {
                        f = this.f1487i;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f1488j)) {
                        f = this.f1488j;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1479a)) {
                        f = this.f1479a;
                    }
                    splineSet.setPoint(i, f);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f1500v)) {
                        f2 = this.f1500v;
                    }
                    splineSet.setPoint(i, f2);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f1503y.containsKey(str2)) {
                            CustomVariable customVariable = (CustomVariable) this.f1503y.get(str2);
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
    public void m68574b(MotionWidget motionWidget) {
        float alpha;
        this.f1481c = motionWidget.getVisibility();
        if (motionWidget.getVisibility() != 4) {
            alpha = 0.0f;
        } else {
            alpha = motionWidget.getAlpha();
        }
        this.f1479a = alpha;
        this.f1482d = false;
        this.f1484f = motionWidget.getRotationZ();
        this.f1485g = motionWidget.getRotationX();
        this.f1486h = motionWidget.getRotationY();
        this.f1487i = motionWidget.getScaleX();
        this.f1488j = motionWidget.getScaleY();
        this.f1489k = motionWidget.getPivotX();
        this.f1490l = motionWidget.getPivotY();
        this.f1491m = motionWidget.getTranslationX();
        this.f1492n = motionWidget.getTranslationY();
        this.f1493o = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f1503y.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C17595Et0 c17595Et0) {
        return Float.compare(this.f1495q, c17595Et0.f1495q);
    }

    /* renamed from: d */
    public final boolean m68572d(float f, float f2) {
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
    public void m68571e(C17595Et0 c17595Et0, HashSet hashSet) {
        if (m68572d(this.f1479a, c17595Et0.f1479a)) {
            hashSet.add("alpha");
        }
        if (m68572d(this.f1483e, c17595Et0.f1483e)) {
            hashSet.add("translationZ");
        }
        int i = this.f1481c;
        int i2 = c17595Et0.f1481c;
        if (i != i2 && this.f1480b == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (m68572d(this.f1484f, c17595Et0.f1484f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f1500v) || !Float.isNaN(c17595Et0.f1500v)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f1501w) || !Float.isNaN(c17595Et0.f1501w)) {
            hashSet.add("progress");
        }
        if (m68572d(this.f1485g, c17595Et0.f1485g)) {
            hashSet.add("rotationX");
        }
        if (m68572d(this.f1486h, c17595Et0.f1486h)) {
            hashSet.add("rotationY");
        }
        if (m68572d(this.f1489k, c17595Et0.f1489k)) {
            hashSet.add("pivotX");
        }
        if (m68572d(this.f1490l, c17595Et0.f1490l)) {
            hashSet.add("pivotY");
        }
        if (m68572d(this.f1487i, c17595Et0.f1487i)) {
            hashSet.add("scaleX");
        }
        if (m68572d(this.f1488j, c17595Et0.f1488j)) {
            hashSet.add("scaleY");
        }
        if (m68572d(this.f1491m, c17595Et0.f1491m)) {
            hashSet.add("translationX");
        }
        if (m68572d(this.f1492n, c17595Et0.f1492n)) {
            hashSet.add("translationY");
        }
        if (m68572d(this.f1493o, c17595Et0.f1493o)) {
            hashSet.add("translationZ");
        }
        if (m68572d(this.f1483e, c17595Et0.f1483e)) {
            hashSet.add("elevation");
        }
    }

    /* renamed from: f */
    public void m68570f(float f, float f2, float f3, float f4) {
        this.f1496r = f;
        this.f1497s = f2;
        this.f1498t = f3;
        this.f1499u = f4;
    }

    /* renamed from: g */
    public void m68569g(MotionWidget motionWidget) {
        m68570f(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        m68574b(motionWidget);
    }

    /* renamed from: h */
    public void m68568h(Rect rect, MotionWidget motionWidget, int i, float f) {
        m68570f(rect.left, rect.top, rect.width(), rect.height());
        m68574b(motionWidget);
        this.f1489k = Float.NaN;
        this.f1490l = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f1484f = f + 90.0f;
                return;
            }
            return;
        }
        this.f1484f = f - 90.0f;
    }
}