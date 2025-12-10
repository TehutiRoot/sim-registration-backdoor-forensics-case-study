package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class MotionKeyCycle extends MotionKey {
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

    /* renamed from: c */
    public String f32064c = null;

    /* renamed from: d */
    public int f32065d = 0;

    /* renamed from: e */
    public int f32066e = -1;

    /* renamed from: f */
    public String f32067f = null;

    /* renamed from: g */
    public float f32068g = Float.NaN;

    /* renamed from: h */
    public float f32069h = 0.0f;

    /* renamed from: i */
    public float f32070i = 0.0f;

    /* renamed from: j */
    public float f32071j = Float.NaN;

    /* renamed from: k */
    public float f32072k = Float.NaN;

    /* renamed from: l */
    public float f32073l = Float.NaN;

    /* renamed from: m */
    public float f32074m = Float.NaN;

    /* renamed from: n */
    public float f32075n = Float.NaN;

    /* renamed from: o */
    public float f32076o = Float.NaN;

    /* renamed from: p */
    public float f32077p = Float.NaN;

    /* renamed from: q */
    public float f32078q = Float.NaN;

    /* renamed from: r */
    public float f32079r = Float.NaN;

    /* renamed from: s */
    public float f32080s = Float.NaN;

    /* renamed from: t */
    public float f32081t = Float.NaN;

    /* renamed from: u */
    public float f32082u = Float.NaN;

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = hashMap.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.f32066e, this.f32067f, -1, this.f32068g, this.f32069h, this.f32070i, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (keyCycleOscillator2 = hashMap.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.f32066e, this.f32067f, -1, this.f32068g, this.f32069h, this.f32070i, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return null;
    }

    public void dump() {
        PrintStream printStream = System.out;
        printStream.println("MotionKeyCycle{mWaveShape=" + this.f32066e + ", mWavePeriod=" + this.f32068g + ", mWaveOffset=" + this.f32069h + ", mWavePhase=" + this.f32070i + ", mRotation=" + this.f32074m + '}');
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32072k)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32073l)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32074m)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f32076o)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32077p)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32078q)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32079r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32075n)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f32080s)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32081t)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32082u)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1019779949:
                if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -991726143:
                if (str.equals(TypedValues.CycleType.S_WAVE_PERIOD)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = TokenParser.f74557CR;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 106629499:
                if (str.equals(TypedValues.CycleType.S_WAVE_PHASE)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 422;
            case 1:
                return 420;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return 424;
            case '\t':
                return 315;
            case '\n':
                return 423;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return TypedValues.CycleType.TYPE_WAVE_PHASE;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
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
            case -1019779949:
                if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    c = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
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
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals(TypedValues.CycleType.S_WAVE_PHASE)) {
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
                return this.f32076o;
            case 1:
                return this.f32077p;
            case 2:
                return this.f32074m;
            case 3:
                return this.f32080s;
            case 4:
                return this.f32081t;
            case 5:
                return this.f32082u;
            case 6:
                return this.f32069h;
            case 7:
                return this.f32071j;
            case '\b':
                return this.f32078q;
            case '\t':
                return this.f32079r;
            case '\n':
                return this.f32073l;
            case 11:
                return this.f32072k;
            case '\f':
                return this.f32070i;
            case '\r':
                return this.f32075n;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        Utils.log(" ------------- " + this.mFramePosition + " -------------");
        Utils.log("MotionKeyCycle{Shape=" + this.f32066e + ", Period=" + this.f32068g + ", Offset=" + this.f32069h + ", Phase=" + this.f32070i + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            AbstractC20566jW1.m29207a(strArr[i]);
            Utils.log(strArr[i] + ":" + getValue(strArr[i]));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 401) {
            this.f32065d = i2;
            return true;
        } else if (i != 421) {
            if (setValue(i, i2)) {
                return true;
            }
            return super.setValue(i, i2);
        } else {
            this.f32066e = i2;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 420) {
            this.f32064c = str;
            return true;
        } else if (i != 422) {
            return super.setValue(i, str);
        } else {
            this.f32067f = str;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.f32071j = f;
            return true;
        } else if (i == 403) {
            this.f32072k = f;
            return true;
        } else if (i != 416) {
            switch (i) {
                case 304:
                    this.f32080s = f;
                    return true;
                case 305:
                    this.f32081t = f;
                    return true;
                case 306:
                    this.f32082u = f;
                    return true;
                case 307:
                    this.f32073l = f;
                    return true;
                case 308:
                    this.f32076o = f;
                    return true;
                case 309:
                    this.f32077p = f;
                    return true;
                case 310:
                    this.f32074m = f;
                    return true;
                case 311:
                    this.f32078q = f;
                    return true;
                case 312:
                    this.f32079r = f;
                    return true;
                default:
                    switch (i) {
                        case 423:
                            this.f32068g = f;
                            return true;
                        case 424:
                            this.f32069h = f;
                            return true;
                        case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                            this.f32070i = f;
                            return true;
                        default:
                            return super.setValue(i, f);
                    }
            }
        } else {
            this.f32075n = f;
            return true;
        }
    }
}
