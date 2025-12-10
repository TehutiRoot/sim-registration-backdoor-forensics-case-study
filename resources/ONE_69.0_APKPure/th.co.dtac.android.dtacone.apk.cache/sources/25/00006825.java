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
    public String f32799e = null;

    /* renamed from: f */
    public int f32800f = 0;

    /* renamed from: g */
    public int f32801g = -1;

    /* renamed from: h */
    public String f32802h = null;

    /* renamed from: i */
    public float f32803i = Float.NaN;

    /* renamed from: j */
    public float f32804j = 0.0f;

    /* renamed from: k */
    public float f32805k = 0.0f;

    /* renamed from: l */
    public float f32806l = Float.NaN;

    /* renamed from: m */
    public int f32807m = -1;

    /* renamed from: n */
    public float f32808n = Float.NaN;

    /* renamed from: o */
    public float f32809o = Float.NaN;

    /* renamed from: p */
    public float f32810p = Float.NaN;

    /* renamed from: q */
    public float f32811q = Float.NaN;

    /* renamed from: r */
    public float f32812r = Float.NaN;

    /* renamed from: s */
    public float f32813s = Float.NaN;

    /* renamed from: t */
    public float f32814t = Float.NaN;

    /* renamed from: u */
    public float f32815u = Float.NaN;

    /* renamed from: v */
    public float f32816v = Float.NaN;

    /* renamed from: w */
    public float f32817w = Float.NaN;

    /* renamed from: x */
    public float f32818x = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyCycle$a */
    /* loaded from: classes2.dex */
    public static class C3727a {

        /* renamed from: a */
        public static SparseIntArray f32819a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32819a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f32819a.append(R.styleable.KeyCycle_framePosition, 2);
            f32819a.append(R.styleable.KeyCycle_transitionEasing, 3);
            f32819a.append(R.styleable.KeyCycle_curveFit, 4);
            f32819a.append(R.styleable.KeyCycle_waveShape, 5);
            f32819a.append(R.styleable.KeyCycle_wavePeriod, 6);
            f32819a.append(R.styleable.KeyCycle_waveOffset, 7);
            f32819a.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f32819a.append(R.styleable.KeyCycle_android_alpha, 9);
            f32819a.append(R.styleable.KeyCycle_android_elevation, 10);
            f32819a.append(R.styleable.KeyCycle_android_rotation, 11);
            f32819a.append(R.styleable.KeyCycle_android_rotationX, 12);
            f32819a.append(R.styleable.KeyCycle_android_rotationY, 13);
            f32819a.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f32819a.append(R.styleable.KeyCycle_android_scaleX, 15);
            f32819a.append(R.styleable.KeyCycle_android_scaleY, 16);
            f32819a.append(R.styleable.KeyCycle_android_translationX, 17);
            f32819a.append(R.styleable.KeyCycle_android_translationY, 18);
            f32819a.append(R.styleable.KeyCycle_android_translationZ, 19);
            f32819a.append(R.styleable.KeyCycle_motionProgress, 20);
            f32819a.append(R.styleable.KeyCycle_wavePhase, 21);
        }

        /* renamed from: b */
        public static void m58411b(KeyCycle keyCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32819a.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyCycle.f32778b);
                            keyCycle.f32778b = resourceId;
                            if (resourceId == -1) {
                                keyCycle.f32779c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyCycle.f32779c = typedArray.getString(index);
                            break;
                        } else {
                            keyCycle.f32778b = typedArray.getResourceId(index, keyCycle.f32778b);
                            break;
                        }
                    case 2:
                        keyCycle.f32777a = typedArray.getInt(index, keyCycle.f32777a);
                        break;
                    case 3:
                        keyCycle.f32799e = typedArray.getString(index);
                        break;
                    case 4:
                        keyCycle.f32800f = typedArray.getInteger(index, keyCycle.f32800f);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            keyCycle.f32802h = typedArray.getString(index);
                            keyCycle.f32801g = 7;
                            break;
                        } else {
                            keyCycle.f32801g = typedArray.getInt(index, keyCycle.f32801g);
                            break;
                        }
                    case 6:
                        keyCycle.f32803i = typedArray.getFloat(index, keyCycle.f32803i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            keyCycle.f32804j = typedArray.getDimension(index, keyCycle.f32804j);
                            break;
                        } else {
                            keyCycle.f32804j = typedArray.getFloat(index, keyCycle.f32804j);
                            break;
                        }
                    case 8:
                        keyCycle.f32807m = typedArray.getInt(index, keyCycle.f32807m);
                        break;
                    case 9:
                        keyCycle.f32808n = typedArray.getFloat(index, keyCycle.f32808n);
                        break;
                    case 10:
                        keyCycle.f32809o = typedArray.getDimension(index, keyCycle.f32809o);
                        break;
                    case 11:
                        keyCycle.f32810p = typedArray.getFloat(index, keyCycle.f32810p);
                        break;
                    case 12:
                        keyCycle.f32812r = typedArray.getFloat(index, keyCycle.f32812r);
                        break;
                    case 13:
                        keyCycle.f32813s = typedArray.getFloat(index, keyCycle.f32813s);
                        break;
                    case 14:
                        keyCycle.f32811q = typedArray.getFloat(index, keyCycle.f32811q);
                        break;
                    case 15:
                        keyCycle.f32814t = typedArray.getFloat(index, keyCycle.f32814t);
                        break;
                    case 16:
                        keyCycle.f32815u = typedArray.getFloat(index, keyCycle.f32815u);
                        break;
                    case 17:
                        keyCycle.f32816v = typedArray.getDimension(index, keyCycle.f32816v);
                        break;
                    case 18:
                        keyCycle.f32817w = typedArray.getDimension(index, keyCycle.f32817w);
                        break;
                    case 19:
                        keyCycle.f32818x = typedArray.getDimension(index, keyCycle.f32818x);
                        break;
                    case 20:
                        keyCycle.f32806l = typedArray.getFloat(index, keyCycle.f32806l);
                        break;
                    case 21:
                        keyCycle.f32805k = typedArray.getFloat(index, keyCycle.f32805k) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32819a.get(index));
                        break;
                }
            }
        }
    }

    public KeyCycle() {
        this.mType = 4;
        this.f32780d = new HashMap();
    }

    public void addCycleValues(HashMap<String, ViewOscillator> hashMap) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f32780d.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (viewOscillator = hashMap.get(str)) != null) {
                    viewOscillator.setPoint(this.f32777a, this.f32801g, this.f32802h, this.f32807m, this.f32803i, this.f32804j, this.f32805k, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (viewOscillator2 = hashMap.get(str)) != null) {
                    viewOscillator2.setPoint(this.f32777a, this.f32801g, this.f32802h, this.f32807m, this.f32803i, this.f32804j, this.f32805k, value);
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
                            c = TokenParser.f74641CR;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        viewSpline.setPoint(this.f32777a, this.f32812r);
                        continue;
                    case 1:
                        viewSpline.setPoint(this.f32777a, this.f32813s);
                        continue;
                    case 2:
                        viewSpline.setPoint(this.f32777a, this.f32816v);
                        continue;
                    case 3:
                        viewSpline.setPoint(this.f32777a, this.f32817w);
                        continue;
                    case 4:
                        viewSpline.setPoint(this.f32777a, this.f32818x);
                        continue;
                    case 5:
                        viewSpline.setPoint(this.f32777a, this.f32806l);
                        continue;
                    case 6:
                        viewSpline.setPoint(this.f32777a, this.f32814t);
                        continue;
                    case 7:
                        viewSpline.setPoint(this.f32777a, this.f32815u);
                        continue;
                    case '\b':
                        viewSpline.setPoint(this.f32777a, this.f32810p);
                        continue;
                    case '\t':
                        viewSpline.setPoint(this.f32777a, this.f32809o);
                        continue;
                    case '\n':
                        viewSpline.setPoint(this.f32777a, this.f32811q);
                        continue;
                    case 11:
                        viewSpline.setPoint(this.f32777a, this.f32808n);
                        continue;
                    case '\f':
                        viewSpline.setPoint(this.f32777a, this.f32804j);
                        continue;
                    case '\r':
                        viewSpline.setPoint(this.f32777a, this.f32805k);
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
        this.f32799e = keyCycle.f32799e;
        this.f32800f = keyCycle.f32800f;
        this.f32801g = keyCycle.f32801g;
        this.f32802h = keyCycle.f32802h;
        this.f32803i = keyCycle.f32803i;
        this.f32804j = keyCycle.f32804j;
        this.f32805k = keyCycle.f32805k;
        this.f32806l = keyCycle.f32806l;
        this.f32807m = keyCycle.f32807m;
        this.f32808n = keyCycle.f32808n;
        this.f32809o = keyCycle.f32809o;
        this.f32810p = keyCycle.f32810p;
        this.f32811q = keyCycle.f32811q;
        this.f32812r = keyCycle.f32812r;
        this.f32813s = keyCycle.f32813s;
        this.f32814t = keyCycle.f32814t;
        this.f32815u = keyCycle.f32815u;
        this.f32816v = keyCycle.f32816v;
        this.f32817w = keyCycle.f32817w;
        this.f32818x = keyCycle.f32818x;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32808n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32809o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32810p)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f32812r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32813s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32814t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32815u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32811q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f32816v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32817w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32818x)) {
            hashSet.add("translationZ");
        }
        if (this.f32780d.size() > 0) {
            Iterator it = this.f32780d.keySet().iterator();
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
                    c = TokenParser.f74641CR;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f32812r;
            case 1:
                return this.f32813s;
            case 2:
                return this.f32816v;
            case 3:
                return this.f32817w;
            case 4:
                return this.f32818x;
            case 5:
                return this.f32806l;
            case 6:
                return this.f32814t;
            case 7:
                return this.f32815u;
            case '\b':
                return this.f32810p;
            case '\t':
                return this.f32809o;
            case '\n':
                return this.f32811q;
            case 11:
                return this.f32808n;
            case '\f':
                return this.f32804j;
            case '\r':
                return this.f32805k;
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
        C3727a.m58411b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
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
                    c = TokenParser.f74641CR;
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
                this.f32806l = m58484c(obj);
                return;
            case 1:
                this.f32799e = obj.toString();
                return;
            case 2:
                this.f32812r = m58484c(obj);
                return;
            case 3:
                this.f32813s = m58484c(obj);
                return;
            case 4:
                this.f32816v = m58484c(obj);
                return;
            case 5:
                this.f32817w = m58484c(obj);
                return;
            case 6:
                this.f32818x = m58484c(obj);
                return;
            case 7:
                this.f32814t = m58484c(obj);
                return;
            case '\b':
                this.f32815u = m58484c(obj);
                return;
            case '\t':
                this.f32810p = m58484c(obj);
                return;
            case '\n':
                this.f32809o = m58484c(obj);
                return;
            case 11:
                this.f32811q = m58484c(obj);
                return;
            case '\f':
                this.f32808n = m58484c(obj);
                return;
            case '\r':
                this.f32804j = m58484c(obj);
                return;
            case 14:
                this.f32803i = m58484c(obj);
                return;
            case 15:
                this.f32800f = m58483d(obj);
                return;
            case 16:
                this.f32805k = m58484c(obj);
                return;
            case 17:
                if (obj instanceof Integer) {
                    this.f32801g = m58483d(obj);
                    return;
                }
                this.f32801g = 7;
                this.f32802h = obj.toString();
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