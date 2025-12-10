package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class KeyAttributes extends Key {
    public static final int KEY_TYPE = 1;

    /* renamed from: e */
    public String f32693e;

    /* renamed from: f */
    public int f32694f = -1;

    /* renamed from: g */
    public boolean f32695g = false;

    /* renamed from: h */
    public float f32696h = Float.NaN;

    /* renamed from: i */
    public float f32697i = Float.NaN;

    /* renamed from: j */
    public float f32698j = Float.NaN;

    /* renamed from: k */
    public float f32699k = Float.NaN;

    /* renamed from: l */
    public float f32700l = Float.NaN;

    /* renamed from: m */
    public float f32701m = Float.NaN;

    /* renamed from: n */
    public float f32702n = Float.NaN;

    /* renamed from: o */
    public float f32703o = Float.NaN;

    /* renamed from: p */
    public float f32704p = Float.NaN;

    /* renamed from: q */
    public float f32705q = Float.NaN;

    /* renamed from: r */
    public float f32706r = Float.NaN;

    /* renamed from: s */
    public float f32707s = Float.NaN;

    /* renamed from: t */
    public float f32708t = Float.NaN;

    /* renamed from: u */
    public float f32709u = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyAttributes$a */
    /* loaded from: classes2.dex */
    public static class C3744a {

        /* renamed from: a */
        public static SparseIntArray f32710a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32710a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            f32710a.append(R.styleable.KeyAttribute_android_elevation, 2);
            f32710a.append(R.styleable.KeyAttribute_android_rotation, 4);
            f32710a.append(R.styleable.KeyAttribute_android_rotationX, 5);
            f32710a.append(R.styleable.KeyAttribute_android_rotationY, 6);
            f32710a.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            f32710a.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            f32710a.append(R.styleable.KeyAttribute_android_scaleX, 7);
            f32710a.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            f32710a.append(R.styleable.KeyAttribute_transitionEasing, 9);
            f32710a.append(R.styleable.KeyAttribute_motionTarget, 10);
            f32710a.append(R.styleable.KeyAttribute_framePosition, 12);
            f32710a.append(R.styleable.KeyAttribute_curveFit, 13);
            f32710a.append(R.styleable.KeyAttribute_android_scaleY, 14);
            f32710a.append(R.styleable.KeyAttribute_android_translationX, 15);
            f32710a.append(R.styleable.KeyAttribute_android_translationY, 16);
            f32710a.append(R.styleable.KeyAttribute_android_translationZ, 17);
            f32710a.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        /* renamed from: a */
        public static void m58501a(KeyAttributes keyAttributes, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32710a.get(index)) {
                    case 1:
                        keyAttributes.f32696h = typedArray.getFloat(index, keyAttributes.f32696h);
                        break;
                    case 2:
                        keyAttributes.f32697i = typedArray.getDimension(index, keyAttributes.f32697i);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32710a.get(index));
                        break;
                    case 4:
                        keyAttributes.f32698j = typedArray.getFloat(index, keyAttributes.f32698j);
                        break;
                    case 5:
                        keyAttributes.f32699k = typedArray.getFloat(index, keyAttributes.f32699k);
                        break;
                    case 6:
                        keyAttributes.f32700l = typedArray.getFloat(index, keyAttributes.f32700l);
                        break;
                    case 7:
                        keyAttributes.f32704p = typedArray.getFloat(index, keyAttributes.f32704p);
                        break;
                    case 8:
                        keyAttributes.f32703o = typedArray.getFloat(index, keyAttributes.f32703o);
                        break;
                    case 9:
                        keyAttributes.f32693e = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyAttributes.f32690b);
                            keyAttributes.f32690b = resourceId;
                            if (resourceId == -1) {
                                keyAttributes.f32691c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyAttributes.f32691c = typedArray.getString(index);
                            break;
                        } else {
                            keyAttributes.f32690b = typedArray.getResourceId(index, keyAttributes.f32690b);
                            break;
                        }
                    case 12:
                        keyAttributes.f32689a = typedArray.getInt(index, keyAttributes.f32689a);
                        break;
                    case 13:
                        keyAttributes.f32694f = typedArray.getInteger(index, keyAttributes.f32694f);
                        break;
                    case 14:
                        keyAttributes.f32705q = typedArray.getFloat(index, keyAttributes.f32705q);
                        break;
                    case 15:
                        keyAttributes.f32706r = typedArray.getDimension(index, keyAttributes.f32706r);
                        break;
                    case 16:
                        keyAttributes.f32707s = typedArray.getDimension(index, keyAttributes.f32707s);
                        break;
                    case 17:
                        keyAttributes.f32708t = typedArray.getDimension(index, keyAttributes.f32708t);
                        break;
                    case 18:
                        keyAttributes.f32709u = typedArray.getFloat(index, keyAttributes.f32709u);
                        break;
                    case 19:
                        keyAttributes.f32701m = typedArray.getDimension(index, keyAttributes.f32701m);
                        break;
                    case 20:
                        keyAttributes.f32702n = typedArray.getDimension(index, keyAttributes.f32702n);
                        break;
                }
            }
        }
    }

    public KeyAttributes() {
        this.mType = 1;
        this.f32692d = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
            if (viewSpline != null) {
                if (str.startsWith("CUSTOM")) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f32692d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) viewSpline).setPoint(this.f32689a, constraintAttribute);
                    }
                } else {
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
                            if (!Float.isNaN(this.f32699k)) {
                                viewSpline.setPoint(this.f32689a, this.f32699k);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f32700l)) {
                                viewSpline.setPoint(this.f32689a, this.f32700l);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f32706r)) {
                                viewSpline.setPoint(this.f32689a, this.f32706r);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f32707s)) {
                                viewSpline.setPoint(this.f32689a, this.f32707s);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f32708t)) {
                                viewSpline.setPoint(this.f32689a, this.f32708t);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f32709u)) {
                                viewSpline.setPoint(this.f32689a, this.f32709u);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f32704p)) {
                                viewSpline.setPoint(this.f32689a, this.f32704p);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f32705q)) {
                                viewSpline.setPoint(this.f32689a, this.f32705q);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f32699k)) {
                                viewSpline.setPoint(this.f32689a, this.f32701m);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f32700l)) {
                                viewSpline.setPoint(this.f32689a, this.f32702n);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f32698j)) {
                                viewSpline.setPoint(this.f32689a, this.f32698j);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f32697i)) {
                                viewSpline.setPoint(this.f32689a, this.f32697i);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.f32703o)) {
                                viewSpline.setPoint(this.f32689a, this.f32703o);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f32696h)) {
                                viewSpline.setPoint(this.f32689a, this.f32696h);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.f32694f = keyAttributes.f32694f;
        this.f32695g = keyAttributes.f32695g;
        this.f32696h = keyAttributes.f32696h;
        this.f32697i = keyAttributes.f32697i;
        this.f32698j = keyAttributes.f32698j;
        this.f32699k = keyAttributes.f32699k;
        this.f32700l = keyAttributes.f32700l;
        this.f32701m = keyAttributes.f32701m;
        this.f32702n = keyAttributes.f32702n;
        this.f32703o = keyAttributes.f32703o;
        this.f32704p = keyAttributes.f32704p;
        this.f32705q = keyAttributes.f32705q;
        this.f32706r = keyAttributes.f32706r;
        this.f32707s = keyAttributes.f32707s;
        this.f32708t = keyAttributes.f32708t;
        this.f32709u = keyAttributes.f32709u;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32696h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32697i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32698j)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f32699k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32700l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32701m)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (!Float.isNaN(this.f32702n)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (!Float.isNaN(this.f32706r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32707s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32708t)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f32703o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f32704p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32705q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32709u)) {
            hashSet.add("progress");
        }
        if (this.f32692d.size() > 0) {
            Iterator it = this.f32692d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        C3744a.m58501a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (this.f32694f == -1) {
            return;
        }
        if (!Float.isNaN(this.f32696h)) {
            hashMap.put("alpha", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32697i)) {
            hashMap.put("elevation", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32698j)) {
            hashMap.put(Key.ROTATION, Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32699k)) {
            hashMap.put("rotationX", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32700l)) {
            hashMap.put("rotationY", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32701m)) {
            hashMap.put(Key.PIVOT_X, Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32702n)) {
            hashMap.put(Key.PIVOT_Y, Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32706r)) {
            hashMap.put("translationX", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32707s)) {
            hashMap.put("translationY", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32708t)) {
            hashMap.put("translationZ", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32703o)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32704p)) {
            hashMap.put("scaleX", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32705q)) {
            hashMap.put("scaleY", Integer.valueOf(this.f32694f));
        }
        if (!Float.isNaN(this.f32709u)) {
            hashMap.put("progress", Integer.valueOf(this.f32694f));
        }
        if (this.f32692d.size() > 0) {
            Iterator it = this.f32692d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f32694f));
            }
        }
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32709u = m58534c(obj);
                return;
            case 1:
                this.f32693e = obj.toString();
                return;
            case 2:
                this.f32699k = m58534c(obj);
                return;
            case 3:
                this.f32700l = m58534c(obj);
                return;
            case 4:
                this.f32706r = m58534c(obj);
                return;
            case 5:
                this.f32707s = m58534c(obj);
                return;
            case 6:
                this.f32708t = m58534c(obj);
                return;
            case 7:
                this.f32704p = m58534c(obj);
                return;
            case '\b':
                this.f32705q = m58534c(obj);
                return;
            case '\t':
                this.f32701m = m58534c(obj);
                return;
            case '\n':
                this.f32702n = m58534c(obj);
                return;
            case 11:
                this.f32698j = m58534c(obj);
                return;
            case '\f':
                this.f32697i = m58534c(obj);
                return;
            case '\r':
                this.f32703o = m58534c(obj);
                return;
            case 14:
                this.f32696h = m58534c(obj);
                return;
            case 15:
                this.f32694f = m58533d(obj);
                return;
            case 16:
                this.f32695g = m58535b(obj);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyAttributes().copy(this);
    }
}
