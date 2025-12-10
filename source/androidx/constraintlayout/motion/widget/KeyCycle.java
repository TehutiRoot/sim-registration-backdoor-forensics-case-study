package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class KeyCycle extends Key {
    public static final int KEY_TYPE = 4;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";

    /* renamed from: e */
    public String f32711e = null;

    /* renamed from: f */
    public int f32712f = 0;

    /* renamed from: g */
    public int f32713g = -1;

    /* renamed from: h */
    public String f32714h = null;

    /* renamed from: i */
    public float f32715i = Float.NaN;

    /* renamed from: j */
    public float f32716j = 0.0f;

    /* renamed from: k */
    public float f32717k = 0.0f;

    /* renamed from: l */
    public float f32718l = Float.NaN;

    /* renamed from: m */
    public int f32719m = -1;

    /* renamed from: n */
    public float f32720n = Float.NaN;

    /* renamed from: o */
    public float f32721o = Float.NaN;

    /* renamed from: p */
    public float f32722p = Float.NaN;

    /* renamed from: q */
    public float f32723q = Float.NaN;

    /* renamed from: r */
    public float f32724r = Float.NaN;

    /* renamed from: s */
    public float f32725s = Float.NaN;

    /* renamed from: t */
    public float f32726t = Float.NaN;

    /* renamed from: u */
    public float f32727u = Float.NaN;

    /* renamed from: v */
    public float f32728v = Float.NaN;

    /* renamed from: w */
    public float f32729w = Float.NaN;

    /* renamed from: x */
    public float f32730x = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyCycle$a */
    /* loaded from: classes2.dex */
    public static class C3745a {

        /* renamed from: a */
        public static SparseIntArray f32731a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32731a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f32731a.append(R.styleable.KeyCycle_framePosition, 2);
            f32731a.append(R.styleable.KeyCycle_transitionEasing, 3);
            f32731a.append(R.styleable.KeyCycle_curveFit, 4);
            f32731a.append(R.styleable.KeyCycle_waveShape, 5);
            f32731a.append(R.styleable.KeyCycle_wavePeriod, 6);
            f32731a.append(R.styleable.KeyCycle_waveOffset, 7);
            f32731a.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f32731a.append(R.styleable.KeyCycle_android_alpha, 9);
            f32731a.append(R.styleable.KeyCycle_android_elevation, 10);
            f32731a.append(R.styleable.KeyCycle_android_rotation, 11);
            f32731a.append(R.styleable.KeyCycle_android_rotationX, 12);
            f32731a.append(R.styleable.KeyCycle_android_rotationY, 13);
            f32731a.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f32731a.append(R.styleable.KeyCycle_android_scaleX, 15);
            f32731a.append(R.styleable.KeyCycle_android_scaleY, 16);
            f32731a.append(R.styleable.KeyCycle_android_translationX, 17);
            f32731a.append(R.styleable.KeyCycle_android_translationY, 18);
            f32731a.append(R.styleable.KeyCycle_android_translationZ, 19);
            f32731a.append(R.styleable.KeyCycle_motionProgress, 20);
            f32731a.append(R.styleable.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m58461b(KeyCycle keyCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32731a.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyCycle.f32690b);
                            keyCycle.f32690b = resourceId;
                            if (resourceId == -1) {
                                keyCycle.f32691c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyCycle.f32691c = typedArray.getString(index);
                            break;
                        } else {
                            keyCycle.f32690b = typedArray.getResourceId(index, keyCycle.f32690b);
                            break;
                        }
                    case 2:
                        keyCycle.f32689a = typedArray.getInt(index, keyCycle.f32689a);
                        break;
                    case 3:
                        keyCycle.f32711e = typedArray.getString(index);
                        break;
                    case 4:
                        keyCycle.f32712f = typedArray.getInteger(index, keyCycle.f32712f);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            keyCycle.f32714h = typedArray.getString(index);
                            keyCycle.f32713g = 7;
                            break;
                        } else {
                            keyCycle.f32713g = typedArray.getInt(index, keyCycle.f32713g);
                            break;
                        }
                    case 6:
                        keyCycle.f32715i = typedArray.getFloat(index, keyCycle.f32715i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            keyCycle.f32716j = typedArray.getDimension(index, keyCycle.f32716j);
                            break;
                        } else {
                            keyCycle.f32716j = typedArray.getFloat(index, keyCycle.f32716j);
                            break;
                        }
                    case 8:
                        keyCycle.f32719m = typedArray.getInt(index, keyCycle.f32719m);
                        break;
                    case 9:
                        keyCycle.f32720n = typedArray.getFloat(index, keyCycle.f32720n);
                        break;
                    case 10:
                        keyCycle.f32721o = typedArray.getDimension(index, keyCycle.f32721o);
                        break;
                    case 11:
                        keyCycle.f32722p = typedArray.getFloat(index, keyCycle.f32722p);
                        break;
                    case 12:
                        keyCycle.f32724r = typedArray.getFloat(index, keyCycle.f32724r);
                        break;
                    case 13:
                        keyCycle.f32725s = typedArray.getFloat(index, keyCycle.f32725s);
                        break;
                    case 14:
                        keyCycle.f32723q = typedArray.getFloat(index, keyCycle.f32723q);
                        break;
                    case 15:
                        keyCycle.f32726t = typedArray.getFloat(index, keyCycle.f32726t);
                        break;
                    case 16:
                        keyCycle.f32727u = typedArray.getFloat(index, keyCycle.f32727u);
                        break;
                    case 17:
                        keyCycle.f32728v = typedArray.getDimension(index, keyCycle.f32728v);
                        break;
                    case 18:
                        keyCycle.f32729w = typedArray.getDimension(index, keyCycle.f32729w);
                        break;
                    case 19:
                        keyCycle.f32730x = typedArray.getDimension(index, keyCycle.f32730x);
                        break;
                    case 20:
                        keyCycle.f32718l = typedArray.getFloat(index, keyCycle.f32718l);
                        break;
                    case 21:
                        keyCycle.f32717k = typedArray.getFloat(index, keyCycle.f32717k) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32731a.get(index));
                        break;
                }
            }
        }
    }

    public KeyCycle() {
        this.mType = 4;
        this.f32692d = new HashMap();
    }

    public void addCycleValues(HashMap<String, ViewOscillator> hashMap) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f32692d.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = hashMap.get(str)) != null) {
                    viewOscillator.setPoint(this.f32689a, this.f32713g, this.f32714h, this.f32719m, this.f32715i, this.f32716j, this.f32717k, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (viewOscillator2 = hashMap.get(str)) != null) {
                    viewOscillator2.setPoint(this.f32689a, this.f32713g, this.f32714h, this.f32719m, this.f32715i, this.f32716j, this.f32717k, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        Debug.logStack(TypedValues.CycleType.NAME, "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
            if (viewSpline != null) {
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
                    case -40300674:
                        if (str.equals(Key.ROTATION)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
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
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = TokenParser.f74557CR;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        viewSpline.setPoint(this.f32689a, this.f32724r);
                        continue;
                    case 1:
                        viewSpline.setPoint(this.f32689a, this.f32725s);
                        continue;
                    case 2:
                        viewSpline.setPoint(this.f32689a, this.f32728v);
                        continue;
                    case 3:
                        viewSpline.setPoint(this.f32689a, this.f32729w);
                        continue;
                    case 4:
                        viewSpline.setPoint(this.f32689a, this.f32730x);
                        continue;
                    case 5:
                        viewSpline.setPoint(this.f32689a, this.f32718l);
                        continue;
                    case 6:
                        viewSpline.setPoint(this.f32689a, this.f32726t);
                        continue;
                    case 7:
                        viewSpline.setPoint(this.f32689a, this.f32727u);
                        continue;
                    case '\b':
                        viewSpline.setPoint(this.f32689a, this.f32722p);
                        continue;
                    case '\t':
                        viewSpline.setPoint(this.f32689a, this.f32721o);
                        continue;
                    case '\n':
                        viewSpline.setPoint(this.f32689a, this.f32723q);
                        continue;
                    case 11:
                        viewSpline.setPoint(this.f32689a, this.f32720n);
                        continue;
                    case '\f':
                        viewSpline.setPoint(this.f32689a, this.f32716j);
                        continue;
                    case '\r':
                        viewSpline.setPoint(this.f32689a, this.f32717k);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("  UNKNOWN  ");
                            sb.append(str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyCycle keyCycle = (KeyCycle) key;
        this.f32711e = keyCycle.f32711e;
        this.f32712f = keyCycle.f32712f;
        this.f32713g = keyCycle.f32713g;
        this.f32714h = keyCycle.f32714h;
        this.f32715i = keyCycle.f32715i;
        this.f32716j = keyCycle.f32716j;
        this.f32717k = keyCycle.f32717k;
        this.f32718l = keyCycle.f32718l;
        this.f32719m = keyCycle.f32719m;
        this.f32720n = keyCycle.f32720n;
        this.f32721o = keyCycle.f32721o;
        this.f32722p = keyCycle.f32722p;
        this.f32723q = keyCycle.f32723q;
        this.f32724r = keyCycle.f32724r;
        this.f32725s = keyCycle.f32725s;
        this.f32726t = keyCycle.f32726t;
        this.f32727u = keyCycle.f32727u;
        this.f32728v = keyCycle.f32728v;
        this.f32729w = keyCycle.f32729w;
        this.f32730x = keyCycle.f32730x;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32720n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32721o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32722p)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f32724r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32725s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32726t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32727u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32723q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f32728v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32729w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32730x)) {
            hashSet.add("translationZ");
        }
        if (this.f32692d.size() > 0) {
            Iterator it = this.f32692d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public float getValue(String str) {
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
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = TokenParser.f74557CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f32724r;
            case 1:
                return this.f32725s;
            case 2:
                return this.f32728v;
            case 3:
                return this.f32729w;
            case 4:
                return this.f32730x;
            case 5:
                return this.f32718l;
            case 6:
                return this.f32726t;
            case 7:
                return this.f32727u;
            case '\b':
                return this.f32722p;
            case '\t':
                return this.f32721o;
            case '\n':
                return this.f32723q;
            case 11:
                return this.f32720n;
            case '\f':
                return this.f32716j;
            case '\r':
                return this.f32717k;
            default:
                if (!str.startsWith("CUSTOM")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  UNKNOWN  ");
                    sb.append(str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        C3745a.m58461b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals(Key.MOTIONPROGRESS)) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
                    c = TokenParser.f74557CR;
                    break;
                }
                break;
            case 184161818:
                if (str.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32718l = m58534c(obj);
                return;
            case 1:
                this.f32711e = obj.toString();
                return;
            case 2:
                this.f32724r = m58534c(obj);
                return;
            case 3:
                this.f32725s = m58534c(obj);
                return;
            case 4:
                this.f32728v = m58534c(obj);
                return;
            case 5:
                this.f32729w = m58534c(obj);
                return;
            case 6:
                this.f32730x = m58534c(obj);
                return;
            case 7:
                this.f32726t = m58534c(obj);
                return;
            case '\b':
                this.f32727u = m58534c(obj);
                return;
            case '\t':
                this.f32722p = m58534c(obj);
                return;
            case '\n':
                this.f32721o = m58534c(obj);
                return;
            case 11:
                this.f32723q = m58534c(obj);
                return;
            case '\f':
                this.f32720n = m58534c(obj);
                return;
            case '\r':
                this.f32716j = m58534c(obj);
                return;
            case 14:
                this.f32715i = m58534c(obj);
                return;
            case 15:
                this.f32712f = m58533d(obj);
                return;
            case 16:
                this.f32717k = m58534c(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.f32713g = m58533d(obj);
                    return;
                }
                this.f32713g = 7;
                this.f32714h = obj.toString();
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyCycle().copy(this);
    }
}
