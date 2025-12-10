package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";

    /* renamed from: e */
    public String f32747e;

    /* renamed from: f */
    public int f32748f = -1;

    /* renamed from: g */
    public float f32749g = Float.NaN;

    /* renamed from: h */
    public float f32750h = Float.NaN;

    /* renamed from: i */
    public float f32751i = Float.NaN;

    /* renamed from: j */
    public float f32752j = Float.NaN;

    /* renamed from: k */
    public float f32753k = Float.NaN;

    /* renamed from: l */
    public float f32754l = Float.NaN;

    /* renamed from: m */
    public float f32755m = Float.NaN;

    /* renamed from: n */
    public float f32756n = Float.NaN;

    /* renamed from: o */
    public float f32757o = Float.NaN;

    /* renamed from: p */
    public float f32758p = Float.NaN;

    /* renamed from: q */
    public float f32759q = Float.NaN;

    /* renamed from: r */
    public float f32760r = Float.NaN;

    /* renamed from: s */
    public int f32761s = 0;

    /* renamed from: t */
    public String f32762t = null;

    /* renamed from: u */
    public float f32763u = Float.NaN;

    /* renamed from: v */
    public float f32764v = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyTimeCycle$a */
    /* loaded from: classes2.dex */
    public static class C3747a {

        /* renamed from: a */
        public static SparseIntArray f32765a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32765a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            f32765a.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            f32765a.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            f32765a.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            f32765a.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            f32765a.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            f32765a.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f32765a.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            f32765a.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            f32765a.append(R.styleable.KeyTimeCycle_framePosition, 12);
            f32765a.append(R.styleable.KeyTimeCycle_curveFit, 13);
            f32765a.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            f32765a.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            f32765a.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            f32765a.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            f32765a.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            f32765a.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            f32765a.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            f32765a.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m58417a(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32765a.get(index)) {
                    case 1:
                        keyTimeCycle.f32749g = typedArray.getFloat(index, keyTimeCycle.f32749g);
                        break;
                    case 2:
                        keyTimeCycle.f32750h = typedArray.getDimension(index, keyTimeCycle.f32750h);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32765a.get(index));
                        break;
                    case 4:
                        keyTimeCycle.f32751i = typedArray.getFloat(index, keyTimeCycle.f32751i);
                        break;
                    case 5:
                        keyTimeCycle.f32752j = typedArray.getFloat(index, keyTimeCycle.f32752j);
                        break;
                    case 6:
                        keyTimeCycle.f32753k = typedArray.getFloat(index, keyTimeCycle.f32753k);
                        break;
                    case 7:
                        keyTimeCycle.f32755m = typedArray.getFloat(index, keyTimeCycle.f32755m);
                        break;
                    case 8:
                        keyTimeCycle.f32754l = typedArray.getFloat(index, keyTimeCycle.f32754l);
                        break;
                    case 9:
                        keyTimeCycle.f32747e = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyTimeCycle.f32690b);
                            keyTimeCycle.f32690b = resourceId;
                            if (resourceId == -1) {
                                keyTimeCycle.f32691c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.f32691c = typedArray.getString(index);
                            break;
                        } else {
                            keyTimeCycle.f32690b = typedArray.getResourceId(index, keyTimeCycle.f32690b);
                            break;
                        }
                    case 12:
                        keyTimeCycle.f32689a = typedArray.getInt(index, keyTimeCycle.f32689a);
                        break;
                    case 13:
                        keyTimeCycle.f32748f = typedArray.getInteger(index, keyTimeCycle.f32748f);
                        break;
                    case 14:
                        keyTimeCycle.f32756n = typedArray.getFloat(index, keyTimeCycle.f32756n);
                        break;
                    case 15:
                        keyTimeCycle.f32757o = typedArray.getDimension(index, keyTimeCycle.f32757o);
                        break;
                    case 16:
                        keyTimeCycle.f32758p = typedArray.getDimension(index, keyTimeCycle.f32758p);
                        break;
                    case 17:
                        keyTimeCycle.f32759q = typedArray.getDimension(index, keyTimeCycle.f32759q);
                        break;
                    case 18:
                        keyTimeCycle.f32760r = typedArray.getFloat(index, keyTimeCycle.f32760r);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.f32762t = typedArray.getString(index);
                            keyTimeCycle.f32761s = 7;
                            break;
                        } else {
                            keyTimeCycle.f32761s = typedArray.getInt(index, keyTimeCycle.f32761s);
                            break;
                        }
                    case 20:
                        keyTimeCycle.f32763u = typedArray.getFloat(index, keyTimeCycle.f32763u);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            keyTimeCycle.f32764v = typedArray.getDimension(index, keyTimeCycle.f32764v);
                            break;
                        } else {
                            keyTimeCycle.f32764v = typedArray.getFloat(index, keyTimeCycle.f32764v);
                            break;
                        }
                }
            }
        }
    }

    public KeyTimeCycle() {
        this.mType = 3;
        this.f32692d = new HashMap();
    }

    public void addTimeValues(HashMap<String, ViewTimeCycle> hashMap) {
        for (String str : hashMap.keySet()) {
            ViewTimeCycle viewTimeCycle = hashMap.get(str);
            if (viewTimeCycle != null) {
                if (str.startsWith("CUSTOM")) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f32692d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.f32689a, constraintAttribute, this.f32763u, this.f32761s, this.f32764v);
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
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.f32752j)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32752j, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f32753k)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32753k, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f32757o)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32757o, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f32758p)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32758p, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f32759q)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32759q, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f32760r)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32760r, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f32755m)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32755m, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f32756n)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32756n, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f32751i)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32751i, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f32750h)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32750h, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f32754l)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32754l, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f32749g)) {
                                viewTimeCycle.setPoint(this.f32689a, this.f32749g, this.f32763u, this.f32761s, this.f32764v);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("UNKNOWN addValues \"");
                            sb.append(str);
                            sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            continue;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) key;
        this.f32747e = keyTimeCycle.f32747e;
        this.f32748f = keyTimeCycle.f32748f;
        this.f32761s = keyTimeCycle.f32761s;
        this.f32763u = keyTimeCycle.f32763u;
        this.f32764v = keyTimeCycle.f32764v;
        this.f32760r = keyTimeCycle.f32760r;
        this.f32749g = keyTimeCycle.f32749g;
        this.f32750h = keyTimeCycle.f32750h;
        this.f32751i = keyTimeCycle.f32751i;
        this.f32754l = keyTimeCycle.f32754l;
        this.f32752j = keyTimeCycle.f32752j;
        this.f32753k = keyTimeCycle.f32753k;
        this.f32755m = keyTimeCycle.f32755m;
        this.f32756n = keyTimeCycle.f32756n;
        this.f32757o = keyTimeCycle.f32757o;
        this.f32758p = keyTimeCycle.f32758p;
        this.f32759q = keyTimeCycle.f32759q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32749g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32750h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32751i)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.f32752j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32753k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32757o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32758p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32759q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f32754l)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f32755m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32756n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32760r)) {
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
        C3747a.m58417a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (this.f32748f == -1) {
            return;
        }
        if (!Float.isNaN(this.f32749g)) {
            hashMap.put("alpha", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32750h)) {
            hashMap.put("elevation", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32751i)) {
            hashMap.put(Key.ROTATION, Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32752j)) {
            hashMap.put("rotationX", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32753k)) {
            hashMap.put("rotationY", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32757o)) {
            hashMap.put("translationX", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32758p)) {
            hashMap.put("translationY", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32759q)) {
            hashMap.put("translationZ", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32754l)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32755m)) {
            hashMap.put("scaleX", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32755m)) {
            hashMap.put("scaleY", Integer.valueOf(this.f32748f));
        }
        if (!Float.isNaN(this.f32760r)) {
            hashMap.put("progress", Integer.valueOf(this.f32748f));
        }
        if (this.f32692d.size() > 0) {
            Iterator it = this.f32692d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f32748f));
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
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32760r = m58534c(obj);
                return;
            case 1:
                this.f32747e = obj.toString();
                return;
            case 2:
                this.f32752j = m58534c(obj);
                return;
            case 3:
                this.f32753k = m58534c(obj);
                return;
            case 4:
                this.f32757o = m58534c(obj);
                return;
            case 5:
                this.f32758p = m58534c(obj);
                return;
            case 6:
                this.f32759q = m58534c(obj);
                return;
            case 7:
                this.f32755m = m58534c(obj);
                return;
            case '\b':
                this.f32756n = m58534c(obj);
                return;
            case '\t':
                this.f32751i = m58534c(obj);
                return;
            case '\n':
                this.f32750h = m58534c(obj);
                return;
            case 11:
                this.f32754l = m58534c(obj);
                return;
            case '\f':
                this.f32749g = m58534c(obj);
                return;
            case '\r':
                this.f32764v = m58534c(obj);
                return;
            case 14:
                this.f32763u = m58534c(obj);
                return;
            case 15:
                this.f32748f = m58533d(obj);
                return;
            case 16:
                if (obj instanceof Integer) {
                    this.f32761s = m58533d(obj);
                    return;
                }
                this.f32761s = 7;
                this.f32762t = obj.toString();
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyTimeCycle().copy(this);
    }
}
