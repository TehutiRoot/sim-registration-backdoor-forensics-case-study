package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class MotionKeyAttributes extends MotionKey {
    public static final int KEY_TYPE = 1;

    /* renamed from: c */
    public String f32047c;

    /* renamed from: d */
    public int f32048d = -1;

    /* renamed from: e */
    public int f32049e = 0;

    /* renamed from: f */
    public float f32050f = Float.NaN;

    /* renamed from: g */
    public float f32051g = Float.NaN;

    /* renamed from: h */
    public float f32052h = Float.NaN;

    /* renamed from: i */
    public float f32053i = Float.NaN;

    /* renamed from: j */
    public float f32054j = Float.NaN;

    /* renamed from: k */
    public float f32055k = Float.NaN;

    /* renamed from: l */
    public float f32056l = Float.NaN;

    /* renamed from: m */
    public float f32057m = Float.NaN;

    /* renamed from: n */
    public float f32058n = Float.NaN;

    /* renamed from: o */
    public float f32059o = Float.NaN;

    /* renamed from: p */
    public float f32060p = Float.NaN;

    /* renamed from: q */
    public float f32061q = Float.NaN;

    /* renamed from: r */
    public float f32062r = Float.NaN;

    /* renamed from: s */
    public float f32063s = Float.NaN;

    public MotionKeyAttributes() {
        this.mType = 1;
        this.mCustom = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            if (splineSet != null) {
                if (str.startsWith("CUSTOM")) {
                    CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((SplineSet.CustomSpline) splineSet).setPoint(this.mFramePosition, customVariable);
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
                        case -4379043:
                            if (str.equals("elevation")) {
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
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                c = TokenParser.f74557CR;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.f32053i)) {
                                splineSet.setPoint(this.mFramePosition, this.f32053i);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f32054j)) {
                                splineSet.setPoint(this.mFramePosition, this.f32054j);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f32052h)) {
                                splineSet.setPoint(this.mFramePosition, this.f32052h);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f32060p)) {
                                splineSet.setPoint(this.mFramePosition, this.f32060p);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f32061q)) {
                                splineSet.setPoint(this.mFramePosition, this.f32061q);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f32062r)) {
                                splineSet.setPoint(this.mFramePosition, this.f32062r);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f32063s)) {
                                splineSet.setPoint(this.mFramePosition, this.f32063s);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f32053i)) {
                                splineSet.setPoint(this.mFramePosition, this.f32055k);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f32054j)) {
                                splineSet.setPoint(this.mFramePosition, this.f32056l);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f32058n)) {
                                splineSet.setPoint(this.mFramePosition, this.f32058n);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f32059o)) {
                                splineSet.setPoint(this.mFramePosition, this.f32059o);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f32051g)) {
                                splineSet.setPoint(this.mFramePosition, this.f32051g);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.f32050f)) {
                                splineSet.setPoint(this.mFramePosition, this.f32050f);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f32057m)) {
                                splineSet.setPoint(this.mFramePosition, this.f32057m);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            PrintStream printStream = System.err;
                            printStream.println("not supported by KeyAttributes " + str);
                            continue;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final float m58747c(int i) {
        if (i != 100) {
            switch (i) {
                case 303:
                    return this.f32050f;
                case 304:
                    return this.f32060p;
                case 305:
                    return this.f32061q;
                case 306:
                    return this.f32062r;
                case 307:
                    return this.f32051g;
                case 308:
                    return this.f32053i;
                case 309:
                    return this.f32054j;
                case 310:
                    return this.f32052h;
                case 311:
                    return this.f32058n;
                case 312:
                    return this.f32059o;
                case 313:
                    return this.f32055k;
                case 314:
                    return this.f32056l;
                case 315:
                    return this.f32063s;
                case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    return this.f32057m;
                default:
                    return Float.NaN;
            }
        }
        return this.mFramePosition;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32050f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32051g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32052h)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f32053i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32054j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32055k)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f32056l)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f32060p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32061q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32062r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f32057m)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f32058n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32059o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32063s)) {
            hashSet.add("progress");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public int getCurveFit() {
        return this.f32048d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return AbstractC20566jW1.m29207a(str);
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        PrintStream printStream = System.out;
        printStream.println(" ------------- " + this.mFramePosition + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int m29207a = AbstractC20566jW1.m29207a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + ":" + m58747c(m29207a));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.f32050f)) {
            hashMap.put("alpha", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32051g)) {
            hashMap.put("elevation", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32052h)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32053i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32054j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32055k)) {
            hashMap.put("pivotX", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32056l)) {
            hashMap.put("pivotY", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32060p)) {
            hashMap.put("translationX", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32061q)) {
            hashMap.put("translationY", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32062r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32057m)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32058n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32059o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f32048d));
        }
        if (!Float.isNaN(this.f32063s)) {
            hashMap.put("progress", Integer.valueOf(this.f32048d));
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f32048d));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        } else if (i == 301) {
            this.f32048d = i2;
            return true;
        } else if (i != 302) {
            if (setValue(i, i2)) {
                return true;
            }
            return super.setValue(i, i2);
        } else {
            this.f32049e = i2;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.f32050f = f;
                    return true;
                case 304:
                    this.f32060p = f;
                    return true;
                case 305:
                    this.f32061q = f;
                    return true;
                case 306:
                    this.f32062r = f;
                    return true;
                case 307:
                    this.f32051g = f;
                    return true;
                case 308:
                    this.f32053i = f;
                    return true;
                case 309:
                    this.f32054j = f;
                    return true;
                case 310:
                    this.f32052h = f;
                    return true;
                case 311:
                    this.f32058n = f;
                    return true;
                case 312:
                    this.f32059o = f;
                    return true;
                case 313:
                    this.f32055k = f;
                    return true;
                case 314:
                    this.f32056l = f;
                    return true;
                case 315:
                    this.f32063s = f;
                    return true;
                case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                    this.f32057m = f;
                    return true;
                default:
                    return super.setValue(i, f);
            }
        }
        this.f32057m = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 101) {
            this.f32046b = str;
            return true;
        } else if (i != 317) {
            return super.setValue(i, str);
        } else {
            this.f32047c = str;
            return true;
        }
    }
}
