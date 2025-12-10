package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionKeyTimeCycle extends MotionKey {
    public static final int KEY_TYPE = 3;

    /* renamed from: c */
    public String f32085c;

    /* renamed from: d */
    public int f32086d = -1;

    /* renamed from: e */
    public float f32087e = Float.NaN;

    /* renamed from: f */
    public float f32088f = Float.NaN;

    /* renamed from: g */
    public float f32089g = Float.NaN;

    /* renamed from: h */
    public float f32090h = Float.NaN;

    /* renamed from: i */
    public float f32091i = Float.NaN;

    /* renamed from: j */
    public float f32092j = Float.NaN;

    /* renamed from: k */
    public float f32093k = Float.NaN;

    /* renamed from: l */
    public float f32094l = Float.NaN;

    /* renamed from: m */
    public float f32095m = Float.NaN;

    /* renamed from: n */
    public float f32096n = Float.NaN;

    /* renamed from: o */
    public float f32097o = Float.NaN;

    /* renamed from: p */
    public float f32098p = Float.NaN;

    /* renamed from: q */
    public int f32099q = 0;

    /* renamed from: r */
    public String f32100r = null;

    /* renamed from: s */
    public float f32101s = Float.NaN;

    /* renamed from: t */
    public float f32102t = 0.0f;

    public MotionKeyTimeCycle() {
        this.mType = 3;
        this.mCustom = new HashMap<>();
    }

    public void addTimeValues(HashMap<String, TimeCycleSplineSet> hashMap) {
        for (String str : hashMap.keySet()) {
            TimeCycleSplineSet timeCycleSplineSet = hashMap.get(str);
            if (timeCycleSplineSet != null) {
                if (str.startsWith("CUSTOM")) {
                    CustomVariable customVariable = this.mCustom.get(str.substring(7));
                    if (customVariable != null) {
                        ((TimeCycleSplineSet.CustomVarSet) timeCycleSplineSet).setPoint(this.mFramePosition, customVariable, this.f32101s, this.f32099q, this.f32102t);
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
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                c = 11;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.f32090h)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32090h, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.f32091i)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32091i, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.f32089g)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32089g, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.f32095m)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32095m, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.f32096n)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32096n, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.f32097o)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32097o, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.f32098p)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32098p, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.f32093k)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32093k, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.f32094l)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32094l, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.f32097o)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32097o, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.f32087e)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32087e, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.f32092j)) {
                                timeCycleSplineSet.setPoint(this.mFramePosition, this.f32092j, this.f32101s, this.f32099q, this.f32102t);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            Utils.loge("KeyTimeCycles", "UNKNOWN addValues \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            continue;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f32087e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f32088f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f32089g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f32090h)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f32091i)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f32093k)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f32094l)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f32092j)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f32095m)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f32096n)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f32097o)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return AbstractC20910lW1.m26466a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        } else if (i != 421) {
            return super.setValue(i, i2);
        } else {
            this.f32099q = i2;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return new MotionKeyTimeCycle().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTimeCycle copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTimeCycle motionKeyTimeCycle = (MotionKeyTimeCycle) motionKey;
        this.f32085c = motionKeyTimeCycle.f32085c;
        this.f32086d = motionKeyTimeCycle.f32086d;
        this.f32099q = motionKeyTimeCycle.f32099q;
        this.f32101s = motionKeyTimeCycle.f32101s;
        this.f32102t = motionKeyTimeCycle.f32102t;
        this.f32098p = motionKeyTimeCycle.f32098p;
        this.f32087e = motionKeyTimeCycle.f32087e;
        this.f32088f = motionKeyTimeCycle.f32088f;
        this.f32089g = motionKeyTimeCycle.f32089g;
        this.f32092j = motionKeyTimeCycle.f32092j;
        this.f32090h = motionKeyTimeCycle.f32090h;
        this.f32091i = motionKeyTimeCycle.f32091i;
        this.f32093k = motionKeyTimeCycle.f32093k;
        this.f32094l = motionKeyTimeCycle.f32094l;
        this.f32095m = motionKeyTimeCycle.f32095m;
        this.f32096n = motionKeyTimeCycle.f32096n;
        this.f32097o = motionKeyTimeCycle.f32097o;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 315) {
            this.f32098p = m58749a(Float.valueOf(f));
            return true;
        } else if (i == 401) {
            this.f32086d = m58748b(Float.valueOf(f));
            return true;
        } else if (i == 403) {
            this.f32087e = f;
            return true;
        } else if (i == 416) {
            this.f32092j = m58749a(Float.valueOf(f));
            return true;
        } else if (i == 423) {
            this.f32101s = m58749a(Float.valueOf(f));
            return true;
        } else if (i != 424) {
            switch (i) {
                case 304:
                    this.f32095m = m58749a(Float.valueOf(f));
                    return true;
                case 305:
                    this.f32096n = m58749a(Float.valueOf(f));
                    return true;
                case 306:
                    this.f32097o = m58749a(Float.valueOf(f));
                    return true;
                case 307:
                    this.f32088f = m58749a(Float.valueOf(f));
                    return true;
                case 308:
                    this.f32090h = m58749a(Float.valueOf(f));
                    return true;
                case 309:
                    this.f32091i = m58749a(Float.valueOf(f));
                    return true;
                case 310:
                    this.f32089g = m58749a(Float.valueOf(f));
                    return true;
                case 311:
                    this.f32093k = m58749a(Float.valueOf(f));
                    return true;
                case 312:
                    this.f32094l = m58749a(Float.valueOf(f));
                    return true;
                default:
                    return super.setValue(i, f);
            }
        } else {
            this.f32102t = m58749a(Float.valueOf(f));
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 420) {
            this.f32085c = str;
            return true;
        } else if (i != 421) {
            return super.setValue(i, str);
        } else {
            this.f32099q = 7;
            this.f32100r = str;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return super.setValue(i, z);
    }
}
