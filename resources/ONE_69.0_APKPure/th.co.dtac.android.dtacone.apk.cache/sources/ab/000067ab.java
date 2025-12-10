package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.client.config.CookieSpecs;

/* loaded from: classes2.dex */
public class Transition implements TypedValues {
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    public static final int START = 0;

    /* renamed from: a */
    public HashMap f32452a = new HashMap();

    /* renamed from: b */
    public HashMap f32453b = new HashMap();

    /* renamed from: c */
    public TypedBundle f32454c = new TypedBundle();

    /* renamed from: d */
    public int f32455d = 0;

    /* renamed from: e */
    public String f32456e = null;

    /* renamed from: f */
    public Easing f32457f = null;

    /* renamed from: g */
    public int f32458g = 0;

    /* renamed from: h */
    public int f32459h = 400;

    /* renamed from: i */
    public float f32460i = 0.0f;

    /* renamed from: androidx.constraintlayout.core.state.Transition$a */
    /* loaded from: classes2.dex */
    public static class C3672a {

        /* renamed from: a */
        public int f32461a;

        /* renamed from: b */
        public String f32462b;

        /* renamed from: c */
        public int f32463c;

        /* renamed from: d */
        public float f32464d;

        /* renamed from: e */
        public float f32465e;

        public C3672a(String str, int i, int i2, float f, float f2) {
            this.f32462b = str;
            this.f32461a = i;
            this.f32463c = i2;
            this.f32464d = f;
            this.f32465e = f2;
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.Transition$b */
    /* loaded from: classes2.dex */
    public static class C3673b {

        /* renamed from: d */
        public Motion f32469d;

        /* renamed from: h */
        public KeyCache f32473h = new KeyCache();

        /* renamed from: i */
        public int f32474i = -1;

        /* renamed from: j */
        public int f32475j = -1;

        /* renamed from: a */
        public WidgetFrame f32466a = new WidgetFrame();

        /* renamed from: b */
        public WidgetFrame f32467b = new WidgetFrame();

        /* renamed from: c */
        public WidgetFrame f32468c = new WidgetFrame();

        /* renamed from: e */
        public MotionWidget f32470e = new MotionWidget(this.f32466a);

        /* renamed from: f */
        public MotionWidget f32471f = new MotionWidget(this.f32467b);

        /* renamed from: g */
        public MotionWidget f32472g = new MotionWidget(this.f32468c);

        public C3673b() {
            Motion motion = new Motion(this.f32470e);
            this.f32469d = motion;
            motion.setStart(this.f32470e);
            this.f32469d.setEnd(this.f32471f);
        }

        /* renamed from: a */
        public WidgetFrame m58621a(int i) {
            if (i == 0) {
                return this.f32466a;
            }
            if (i == 1) {
                return this.f32467b;
            }
            return this.f32468c;
        }

        /* renamed from: b */
        public void m58620b(int i, int i2, float f, Transition transition) {
            this.f32474i = i2;
            this.f32475j = i;
            this.f32469d.setup(i, i2, 1.0f, System.nanoTime());
            WidgetFrame.interpolate(i, i2, this.f32468c, this.f32466a, this.f32467b, transition, f);
            this.f32468c.interpolatedPos = f;
            this.f32469d.interpolate(this.f32472g, f, System.nanoTime(), this.f32473h);
        }

        /* renamed from: c */
        public void m58619c(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.f32469d.addKey(motionKeyAttributes);
        }

        /* renamed from: d */
        public void m58618d(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.f32469d.addKey(motionKeyCycle);
        }

        /* renamed from: e */
        public void m58617e(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.f32469d.addKey(motionKeyPosition);
        }

        /* renamed from: f */
        public void m58616f(ConstraintWidget constraintWidget, int i) {
            if (i == 0) {
                this.f32466a.update(constraintWidget);
                this.f32469d.setStart(this.f32470e);
            } else if (i == 1) {
                this.f32467b.update(constraintWidget);
                this.f32469d.setEnd(this.f32471f);
            }
            this.f32475j = -1;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ float m58638a(float f) {
        return m58628k(f);
    }

    /* renamed from: b */
    public static /* synthetic */ float m58637b(float f) {
        return m58622q(f);
    }

    /* renamed from: c */
    public static /* synthetic */ float m58636c(float f) {
        return m58624o(f);
    }

    /* renamed from: d */
    public static /* synthetic */ float m58635d(String str, float f) {
        return m58629j(str, f);
    }

    /* renamed from: e */
    public static /* synthetic */ float m58634e(float f) {
        return m58625n(f);
    }

    /* renamed from: f */
    public static /* synthetic */ float m58633f(float f) {
        return m58626m(f);
    }

    /* renamed from: g */
    public static /* synthetic */ float m58632g(float f) {
        return m58623p(f);
    }

    public static Interpolator getInterpolator(int i, final String str) {
        switch (i) {
            case -1:
                return new Interpolator() { // from class: XV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58635d(str, f);
                    }
                };
            case 0:
                return new Interpolator() { // from class: YV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58638a(f);
                    }
                };
            case 1:
                return new Interpolator() { // from class: ZV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58631h(f);
                    }
                };
            case 2:
                return new Interpolator() { // from class: aW1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58633f(f);
                    }
                };
            case 3:
                return new Interpolator() { // from class: bW1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58634e(f);
                    }
                };
            case 4:
                return new Interpolator() { // from class: eW1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58637b(f);
                    }
                };
            case 5:
                return new Interpolator() { // from class: dW1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58632g(f);
                    }
                };
            case 6:
                return new Interpolator() { // from class: cW1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58636c(f);
                    }
                };
            default:
                return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ float m58631h(float f) {
        return m58627l(f);
    }

    /* renamed from: j */
    public static /* synthetic */ float m58629j(String str, float f) {
        return (float) Easing.getInterpolator(str).get(f);
    }

    /* renamed from: k */
    public static /* synthetic */ float m58628k(float f) {
        return (float) Easing.getInterpolator(CookieSpecs.STANDARD).get(f);
    }

    /* renamed from: l */
    public static /* synthetic */ float m58627l(float f) {
        return (float) Easing.getInterpolator("accelerate").get(f);
    }

    /* renamed from: m */
    public static /* synthetic */ float m58626m(float f) {
        return (float) Easing.getInterpolator("decelerate").get(f);
    }

    /* renamed from: n */
    public static /* synthetic */ float m58625n(float f) {
        return (float) Easing.getInterpolator("linear").get(f);
    }

    /* renamed from: o */
    public static /* synthetic */ float m58624o(float f) {
        return (float) Easing.getInterpolator("anticipate").get(f);
    }

    /* renamed from: p */
    public static /* synthetic */ float m58623p(float f) {
        return (float) Easing.getInterpolator("overshoot").get(f);
    }

    /* renamed from: q */
    public static /* synthetic */ float m58622q(float f) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public void addCustomColor(int i, String str, String str2, int i2) {
        m58630i(str, null, i).m58621a(i).addCustomColor(str2, i2);
    }

    public void addCustomFloat(int i, String str, String str2, float f) {
        m58630i(str, null, i).m58621a(i).addCustomFloat(str2, f);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        m58630i(str, null, 0).m58619c(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        m58630i(str, null, 0).m58618d(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        m58630i(str, null, 0).m58617e(typedBundle);
    }

    public void clear() {
        this.f32453b.clear();
    }

    public boolean contains(String str) {
        return this.f32453b.containsKey(str);
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        C3672a c3672a;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = (HashMap) this.f32452a.get(Integer.valueOf(i2));
            if (hashMap != null && (c3672a = (C3672a) hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i] = c3672a.f32464d;
                fArr2[i] = c3672a.f32465e;
                fArr3[i] = c3672a.f32461a;
                i++;
            }
        }
    }

    public C3672a findNextPosition(String str, int i) {
        C3672a c3672a;
        while (i <= 100) {
            HashMap hashMap = (HashMap) this.f32452a.get(Integer.valueOf(i));
            if (hashMap != null && (c3672a = (C3672a) hashMap.get(str)) != null) {
                return c3672a;
            }
            i++;
        }
        return null;
    }

    public C3672a findPreviousPosition(String str, int i) {
        C3672a c3672a;
        while (i >= 0) {
            HashMap hashMap = (HashMap) this.f32452a.get(Integer.valueOf(i));
            if (hashMap != null && (c3672a = (C3672a) hashMap.get(str)) != null) {
                return c3672a;
            }
            i--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.f32458g;
    }

    public WidgetFrame getEnd(String str) {
        C3673b c3673b = (C3673b) this.f32453b.get(str);
        if (c3673b == null) {
            return null;
        }
        return c3673b.f32467b;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        C3673b c3673b = (C3673b) this.f32453b.get(str);
        if (c3673b == null) {
            return null;
        }
        return c3673b.f32468c;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return ((C3673b) this.f32453b.get(str)).f32469d.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return m58630i(str, null, 0).f32469d;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = (HashMap) this.f32452a.get(Integer.valueOf(i2));
            if (hashMap != null && ((C3672a) hashMap.get(widgetFrame.widget.stringId)) != null) {
                i++;
            }
        }
        return i;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        ((C3673b) this.f32453b.get(str)).f32469d.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        C3673b c3673b = (C3673b) this.f32453b.get(str);
        if (c3673b == null) {
            return null;
        }
        return c3673b.f32466a;
    }

    public boolean hasPositionKeyframes() {
        if (this.f32452a.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final C3673b m58630i(String str, ConstraintWidget constraintWidget, int i) {
        C3673b c3673b = (C3673b) this.f32453b.get(str);
        if (c3673b == null) {
            c3673b = new C3673b();
            this.f32454c.applyDelta(c3673b.f32469d);
            this.f32453b.put(str, c3673b);
            if (constraintWidget != null) {
                c3673b.m58616f(constraintWidget, i);
            }
        }
        return c3673b;
    }

    public void interpolate(int i, int i2, float f) {
        Easing easing = this.f32457f;
        if (easing != null) {
            f = (float) easing.get(f);
        }
        for (String str : this.f32453b.keySet()) {
            ((C3673b) this.f32453b.get(str)).m58620b(i, i2, f, this);
        }
    }

    public boolean isEmpty() {
        return this.f32453b.isEmpty();
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.f32454c);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = children.get(i2);
            m58630i(constraintWidget.stringId, null, i).m58616f(constraintWidget, i);
        }
    }

    public void addKeyPosition(String str, int i, int i2, float f, float f2) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, f);
        typedBundle.add(507, f2);
        m58630i(str, null, 0).m58617e(typedBundle);
        C3672a c3672a = new C3672a(str, i, i2, f, f2);
        HashMap hashMap = (HashMap) this.f32452a.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f32452a.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, c3672a);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return m58630i(constraintWidget.stringId, null, 1).f32467b;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return m58630i(constraintWidget.stringId, null, 2).f32468c;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return m58630i(constraintWidget.stringId, null, 0).f32466a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 706) {
            this.f32460i = f;
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 705) {
            this.f32456e = str;
            this.f32457f = Easing.getInterpolator(str);
            return false;
        }
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.f32455d, this.f32456e);
    }
}