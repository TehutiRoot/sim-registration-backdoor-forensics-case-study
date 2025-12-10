package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class MotionKeyTrigger extends MotionKey {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

    /* renamed from: c */
    public int f32103c = -1;

    /* renamed from: d */
    public String f32104d = null;

    /* renamed from: e */
    public int f32105e;

    /* renamed from: f */
    public String f32106f;

    /* renamed from: g */
    public String f32107g;

    /* renamed from: h */
    public int f32108h;

    /* renamed from: i */
    public int f32109i;

    /* renamed from: j */
    public float f32110j;

    /* renamed from: k */
    public boolean f32111k;

    /* renamed from: l */
    public boolean f32112l;

    /* renamed from: m */
    public boolean f32113m;

    /* renamed from: n */
    public float f32114n;

    /* renamed from: o */
    public float f32115o;

    /* renamed from: p */
    public boolean f32116p;

    /* renamed from: q */
    public int f32117q;

    /* renamed from: r */
    public int f32118r;

    /* renamed from: s */
    public int f32119s;

    /* renamed from: t */
    public FloatRect f32120t;

    /* renamed from: u */
    public FloatRect f32121u;

    public MotionKeyTrigger() {
        int i = MotionKey.UNSET;
        this.f32105e = i;
        this.f32106f = null;
        this.f32107g = null;
        this.f32108h = i;
        this.f32109i = i;
        this.f32110j = 0.1f;
        this.f32111k = true;
        this.f32112l = true;
        this.f32113m = true;
        this.f32114n = Float.NaN;
        this.f32116p = false;
        this.f32117q = i;
        this.f32118r = i;
        this.f32119s = i;
        this.f32120t = new FloatRect();
        this.f32121u = new FloatRect();
        this.mType = 5;
        this.mCustom = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    public void conditionallyFire(float f, MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = '\n';
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 307) {
            this.f32109i = i2;
            return true;
        } else if (i == 308) {
            this.f32108h = m58748b(Integer.valueOf(i2));
            return true;
        } else if (i != 311) {
            switch (i) {
                case 301:
                    this.f32119s = i2;
                    return true;
                case 302:
                    this.f32118r = i2;
                    return true;
                case 303:
                    this.f32117q = i2;
                    return true;
                default:
                    return super.setValue(i, i2);
            }
        } else {
            this.f32105e = i2;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return new MotionKeyTrigger().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTrigger copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.f32103c = motionKeyTrigger.f32103c;
        this.f32104d = motionKeyTrigger.f32104d;
        this.f32105e = motionKeyTrigger.f32105e;
        this.f32106f = motionKeyTrigger.f32106f;
        this.f32107g = motionKeyTrigger.f32107g;
        this.f32108h = motionKeyTrigger.f32108h;
        this.f32109i = motionKeyTrigger.f32109i;
        this.f32110j = motionKeyTrigger.f32110j;
        this.f32111k = motionKeyTrigger.f32111k;
        this.f32112l = motionKeyTrigger.f32112l;
        this.f32113m = motionKeyTrigger.f32113m;
        this.f32114n = motionKeyTrigger.f32114n;
        this.f32115o = motionKeyTrigger.f32115o;
        this.f32116p = motionKeyTrigger.f32116p;
        this.f32120t = motionKeyTrigger.f32120t;
        this.f32121u = motionKeyTrigger.f32121u;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i != 305) {
            return super.setValue(i, f);
        }
        this.f32110j = f;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 309) {
            this.f32107g = str;
            return true;
        } else if (i == 310) {
            this.f32106f = str;
            return true;
        } else if (i != 312) {
            return super.setValue(i, str);
        } else {
            this.f32104d = str;
            return true;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        if (i != 304) {
            return super.setValue(i, z);
        }
        this.f32116p = z;
        return true;
    }
}
