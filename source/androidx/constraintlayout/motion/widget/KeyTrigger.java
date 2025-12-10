package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class KeyTrigger extends Key {
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
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

    /* renamed from: e */
    public int f32766e = -1;

    /* renamed from: f */
    public String f32767f = null;

    /* renamed from: g */
    public int f32768g;

    /* renamed from: h */
    public String f32769h;

    /* renamed from: i */
    public String f32770i;

    /* renamed from: j */
    public int f32771j;

    /* renamed from: k */
    public int f32772k;

    /* renamed from: l */
    public View f32773l;

    /* renamed from: m */
    public float f32774m;

    /* renamed from: n */
    public boolean f32775n;

    /* renamed from: o */
    public boolean f32776o;

    /* renamed from: p */
    public boolean f32777p;

    /* renamed from: q */
    public float f32778q;

    /* renamed from: r */
    public float f32779r;

    /* renamed from: s */
    public boolean f32780s;

    /* renamed from: t */
    public int f32781t;

    /* renamed from: u */
    public int f32782u;

    /* renamed from: v */
    public int f32783v;

    /* renamed from: w */
    public RectF f32784w;

    /* renamed from: x */
    public RectF f32785x;

    /* renamed from: y */
    public HashMap f32786y;

    /* renamed from: androidx.constraintlayout.motion.widget.KeyTrigger$a */
    /* loaded from: classes2.dex */
    public static class C3748a {

        /* renamed from: a */
        public static SparseIntArray f32787a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f32787a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            f32787a.append(R.styleable.KeyTrigger_onCross, 4);
            f32787a.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            f32787a.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            f32787a.append(R.styleable.KeyTrigger_motionTarget, 7);
            f32787a.append(R.styleable.KeyTrigger_triggerId, 6);
            f32787a.append(R.styleable.KeyTrigger_triggerSlack, 5);
            f32787a.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f32787a.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f32787a.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            f32787a.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            f32787a.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f32787a.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        /* renamed from: a */
        public static void m58401a(KeyTrigger keyTrigger, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f32787a.get(index)) {
                    case 1:
                        keyTrigger.f32769h = typedArray.getString(index);
                        break;
                    case 2:
                        keyTrigger.f32770i = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f32787a.get(index));
                        break;
                    case 4:
                        keyTrigger.f32767f = typedArray.getString(index);
                        break;
                    case 5:
                        keyTrigger.f32774m = typedArray.getFloat(index, keyTrigger.f32774m);
                        break;
                    case 6:
                        keyTrigger.f32771j = typedArray.getResourceId(index, keyTrigger.f32771j);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyTrigger.f32690b);
                            keyTrigger.f32690b = resourceId;
                            if (resourceId == -1) {
                                keyTrigger.f32691c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTrigger.f32691c = typedArray.getString(index);
                            break;
                        } else {
                            keyTrigger.f32690b = typedArray.getResourceId(index, keyTrigger.f32690b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, keyTrigger.f32689a);
                        keyTrigger.f32689a = integer;
                        keyTrigger.f32778q = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        keyTrigger.f32772k = typedArray.getResourceId(index, keyTrigger.f32772k);
                        break;
                    case 10:
                        keyTrigger.f32780s = typedArray.getBoolean(index, keyTrigger.f32780s);
                        break;
                    case 11:
                        keyTrigger.f32768g = typedArray.getResourceId(index, keyTrigger.f32768g);
                        break;
                    case 12:
                        keyTrigger.f32783v = typedArray.getResourceId(index, keyTrigger.f32783v);
                        break;
                    case 13:
                        keyTrigger.f32781t = typedArray.getResourceId(index, keyTrigger.f32781t);
                        break;
                    case 14:
                        keyTrigger.f32782u = typedArray.getResourceId(index, keyTrigger.f32782u);
                        break;
                }
            }
        }
    }

    public KeyTrigger() {
        int i = Key.UNSET;
        this.f32768g = i;
        this.f32769h = null;
        this.f32770i = null;
        this.f32771j = i;
        this.f32772k = i;
        this.f32773l = null;
        this.f32774m = 0.1f;
        this.f32775n = true;
        this.f32776o = true;
        this.f32777p = true;
        this.f32778q = Float.NaN;
        this.f32780s = false;
        this.f32781t = i;
        this.f32782u = i;
        this.f32783v = i;
        this.f32784w = new RectF();
        this.f32785x = new RectF();
        this.f32786y = new HashMap();
        this.mType = 5;
        this.f32692d = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.f32766e = keyTrigger.f32766e;
        this.f32767f = keyTrigger.f32767f;
        this.f32768g = keyTrigger.f32768g;
        this.f32769h = keyTrigger.f32769h;
        this.f32770i = keyTrigger.f32770i;
        this.f32771j = keyTrigger.f32771j;
        this.f32772k = keyTrigger.f32772k;
        this.f32773l = keyTrigger.f32773l;
        this.f32774m = keyTrigger.f32774m;
        this.f32775n = keyTrigger.f32775n;
        this.f32776o = keyTrigger.f32776o;
        this.f32777p = keyTrigger.f32777p;
        this.f32778q = keyTrigger.f32778q;
        this.f32779r = keyTrigger.f32779r;
        this.f32780s = keyTrigger.f32780s;
        this.f32784w = keyTrigger.f32784w;
        this.f32785x = keyTrigger.f32785x;
        this.f32786y = keyTrigger.f32786y;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        C3748a.m58401a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
    }

    /* renamed from: q */
    public final void m58404q(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            m58403r(str, view);
            return;
        }
        if (this.f32786y.containsKey(str)) {
            method = (Method) this.f32786y.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f32786y.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f32786y.put(str, null);
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find method \"");
                sb.append(str);
                sb.append("\"on class ");
                sb.append(view.getClass().getSimpleName());
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                sb.append(Debug.getName(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception in call \"");
            sb2.append(this.f32767f);
            sb2.append("\"on class ");
            sb2.append(view.getClass().getSimpleName());
            sb2.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb2.append(Debug.getName(view));
        }
    }

    /* renamed from: r */
    public final void m58403r(String str, View view) {
        boolean z;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f32692d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f32692d.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    /* renamed from: s */
    public final void m58402s(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c = 7;
                    break;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = '\b';
                    break;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\t';
                    break;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\n';
                    break;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f32770i = obj.toString();
                return;
            case 1:
                this.f32782u = m58533d(obj);
                return;
            case 2:
                this.f32772k = m58533d(obj);
                return;
            case 3:
                this.f32771j = m58533d(obj);
                return;
            case 4:
                this.f32769h = obj.toString();
                return;
            case 5:
                this.f32773l = (View) obj;
                return;
            case 6:
                this.f32781t = m58533d(obj);
                return;
            case 7:
                this.f32767f = obj.toString();
                return;
            case '\b':
                this.f32774m = m58534c(obj);
                return;
            case '\t':
                this.f32783v = m58533d(obj);
                return;
            case '\n':
                this.f32780s = m58535b(obj);
                return;
            case 11:
                this.f32768g = m58533d(obj);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyTrigger().copy(this);
    }
}
