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
    public HashMap f32364a = new HashMap();

    /* renamed from: b */
    public HashMap f32365b = new HashMap();

    /* renamed from: c */
    public TypedBundle f32366c = new TypedBundle();

    /* renamed from: d */
    public int f32367d = 0;

    /* renamed from: e */
    public String f32368e = null;

    /* renamed from: f */
    public Easing f32369f = null;

    /* renamed from: g */
    public int f32370g = 0;

    /* renamed from: h */
    public int f32371h = 400;

    /* renamed from: i */
    public float f32372i = 0.0f;

    /* renamed from: androidx.constraintlayout.core.state.Transition$a */
    /* loaded from: classes2.dex */
    public static class C3690a {

        /* renamed from: a */
        public int f32373a;

        /* renamed from: b */
        public String f32374b;

        /* renamed from: c */
        public int f32375c;

        /* renamed from: d */
        public float f32376d;

        /* renamed from: e */
        public float f32377e;

        public C3690a(String str, int i, int i2, float f, float f2) {
            this.f32374b = str;
            this.f32373a = i;
            this.f32375c = i2;
            this.f32376d = f;
            this.f32377e = f2;
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.Transition$b */
    /* loaded from: classes2.dex */
    public static class C3691b {

        /* renamed from: d */
        public Motion f32381d;

        /* renamed from: h */
        public KeyCache f32385h = new KeyCache();

        /* renamed from: i */
        public int f32386i = -1;

        /* renamed from: j */
        public int f32387j = -1;

        /* renamed from: a */
        public WidgetFrame f32378a = new WidgetFrame();

        /* renamed from: b */
        public WidgetFrame f32379b = new WidgetFrame();

        /* renamed from: c */
        public WidgetFrame f32380c = new WidgetFrame();

        /* renamed from: e */
        public MotionWidget f32382e = new MotionWidget(this.f32378a);

        /* renamed from: f */
        public MotionWidget f32383f = new MotionWidget(this.f32379b);

        /* renamed from: g */
        public MotionWidget f32384g = new MotionWidget(this.f32380c);

        public C3691b() {
            Motion motion = new Motion(this.f32382e);
            this.f32381d = motion;
            motion.setStart(this.f32382e);
            this.f32381d.setEnd(this.f32383f);
        }

        /* renamed from: a */
        public WidgetFrame m58671a(int i) {
            if (i == 0) {
                return this.f32378a;
            }
            if (i == 1) {
                return this.f32379b;
            }
            return this.f32380c;
        }

        /* renamed from: b */
        public void m58670b(int i, int i2, float f, Transition transition) {
            this.f32386i = i2;
            this.f32387j = i;
            this.f32381d.setup(i, i2, 1.0f, System.nanoTime());
            WidgetFrame.interpolate(i, i2, this.f32380c, this.f32378a, this.f32379b, transition, f);
            this.f32380c.interpolatedPos = f;
            this.f32381d.interpolate(this.f32384g, f, System.nanoTime(), this.f32385h);
        }

        /* renamed from: c */
        public void m58669c(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.f32381d.addKey(motionKeyAttributes);
        }

        /* renamed from: d */
        public void m58668d(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.f32381d.addKey(motionKeyCycle);
        }

        /* renamed from: e */
        public void m58667e(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.f32381d.addKey(motionKeyPosition);
        }

        /* renamed from: f */
        public void m58666f(ConstraintWidget constraintWidget, int i) {
            if (i == 0) {
                this.f32378a.update(constraintWidget);
                this.f32381d.setStart(this.f32382e);
            } else if (i == 1) {
                this.f32379b.update(constraintWidget);
                this.f32381d.setEnd(this.f32383f);
            }
            this.f32387j = -1;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ float m58688a(float f) {
        return m58678k(f);
    }

    /* renamed from: b */
    public static /* synthetic */ float m58687b(float f) {
        return m58672q(f);
    }

    /* renamed from: c */
    public static /* synthetic */ float m58686c(float f) {
        return m58674o(f);
    }

    /* renamed from: d */
    public static /* synthetic */ float m58685d(String str, float f) {
        return m58679j(str, f);
    }

    /* renamed from: e */
    public static /* synthetic */ float m58684e(float f) {
        return m58675n(f);
    }

    /* renamed from: f */
    public static /* synthetic */ float m58683f(float f) {
        return m58676m(f);
    }

    /* renamed from: g */
    public static /* synthetic */ float m58682g(float f) {
        return m58673p(f);
    }

    public static Interpolator getInterpolator(int i, final String str) {
        switch (i) {
            case -1:
                return new Interpolator() { // from class: aV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58685d(str, f);
                    }
                };
            case 0:
                return new Interpolator() { // from class: bV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58688a(f);
                    }
                };
            case 1:
                return new Interpolator() { // from class: cV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58681h(f);
                    }
                };
            case 2:
                return new Interpolator() { // from class: dV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58683f(f);
                    }
                };
            case 3:
                return new Interpolator() { // from class: eV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58684e(f);
                    }
                };
            case 4:
                return new Interpolator() { // from class: hV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58687b(f);
                    }
                };
            case 5:
                return new Interpolator() { // from class: gV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58682g(f);
                    }
                };
            case 6:
                return new Interpolator() { // from class: fV1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f) {
                        return Transition.m58686c(f);
                    }
                };
            default:
                return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ float m58681h(float f) {
        return m58677l(f);
    }

    /* renamed from: j */
    public static /* synthetic */ float m58679j(String str, float f) {
        return (float) Easing.getInterpolator(str).get(f);
    }

    /* renamed from: k */
    public static /* synthetic */ float m58678k(float f) {
        return (float) Easing.getInterpolator(CookieSpecs.STANDARD).get(f);
    }

    /* renamed from: l */
    public static /* synthetic */ float m58677l(float f) {
        return (float) Easing.getInterpolator("accelerate").get(f);
    }

    /* renamed from: m */
    public static /* synthetic */ float m58676m(float f) {
        return (float) Easing.getInterpolator("decelerate").get(f);
    }

    /* renamed from: n */
    public static /* synthetic */ float m58675n(float f) {
        return (float) Easing.getInterpolator("linear").get(f);
    }

    /* renamed from: o */
    public static /* synthetic */ float m58674o(float f) {
        return (float) Easing.getInterpolator("anticipate").get(f);
    }

    /* renamed from: p */
    public static /* synthetic */ float m58673p(float f) {
        return (float) Easing.getInterpolator("overshoot").get(f);
    }

    /* renamed from: q */
    public static /* synthetic */ float m58672q(float f) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f);
    }

    public void addCustomColor(int i, String str, String str2, int i2) {
        m58680i(str, null, i).m58671a(i).addCustomColor(str2, i2);
    }

    public void addCustomFloat(int i, String str, String str2, float f) {
        m58680i(str, null, i).m58671a(i).addCustomFloat(str2, f);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        m58680i(str, null, 0).m58669c(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        m58680i(str, null, 0).m58668d(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        m58680i(str, null, 0).m58667e(typedBundle);
    }

    public void clear() {
        this.f32365b.clear();
    }

    public boolean contains(String str) {
        return this.f32365b.containsKey(str);
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        C3690a c3690a;
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = (HashMap) this.f32364a.get(Integer.valueOf(i2));
            if (hashMap != null && (c3690a = (C3690a) hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i] = c3690a.f32376d;
                fArr2[i] = c3690a.f32377e;
                fArr3[i] = c3690a.f32373a;
                i++;
            }
        }
    }

    public C3690a findNextPosition(String str, int i) {
        C3690a c3690a;
        while (i <= 100) {
            HashMap hashMap = (HashMap) this.f32364a.get(Integer.valueOf(i));
            if (hashMap != null && (c3690a = (C3690a) hashMap.get(str)) != null) {
                return c3690a;
            }
            i++;
        }
        return null;
    }

    public C3690a findPreviousPosition(String str, int i) {
        C3690a c3690a;
        while (i >= 0) {
            HashMap hashMap = (HashMap) this.f32364a.get(Integer.valueOf(i));
            if (hashMap != null && (c3690a = (C3690a) hashMap.get(str)) != null) {
                return c3690a;
            }
            i--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.f32370g;
    }

    public WidgetFrame getEnd(String str) {
        C3691b c3691b = (C3691b) this.f32365b.get(str);
        if (c3691b == null) {
            return null;
        }
        return c3691b.f32379b;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        C3691b c3691b = (C3691b) this.f32365b.get(str);
        if (c3691b == null) {
            return null;
        }
        return c3691b.f32380c;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return ((C3691b) this.f32365b.get(str)).f32381d.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return m58680i(str, null, 0).f32381d;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            HashMap hashMap = (HashMap) this.f32364a.get(Integer.valueOf(i2));
            if (hashMap != null && ((C3690a) hashMap.get(widgetFrame.widget.stringId)) != null) {
                i++;
            }
        }
        return i;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        ((C3691b) this.f32365b.get(str)).f32381d.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        C3691b c3691b = (C3691b) this.f32365b.get(str);
        if (c3691b == null) {
            return null;
        }
        return c3691b.f32378a;
    }

    public boolean hasPositionKeyframes() {
        if (this.f32364a.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final C3691b m58680i(String str, ConstraintWidget constraintWidget, int i) {
        C3691b c3691b = (C3691b) this.f32365b.get(str);
        if (c3691b == null) {
            c3691b = new C3691b();
            this.f32366c.applyDelta(c3691b.f32381d);
            this.f32365b.put(str, c3691b);
            if (constraintWidget != null) {
                c3691b.m58666f(constraintWidget, i);
            }
        }
        return c3691b;
    }

    public void interpolate(int i, int i2, float f) {
        Easing easing = this.f32369f;
        if (easing != null) {
            f = (float) easing.get(f);
        }
        for (String str : this.f32365b.keySet()) {
            ((C3691b) this.f32365b.get(str)).m58670b(i, i2, f, this);
        }
    }

    public boolean isEmpty() {
        return this.f32365b.isEmpty();
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.f32366c);
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
            m58680i(constraintWidget.stringId, null, i).m58666f(constraintWidget, i);
        }
    }

    public void addKeyPosition(String str, int i, int i2, float f, float f2) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, f);
        typedBundle.add(507, f2);
        m58680i(str, null, 0).m58667e(typedBundle);
        C3690a c3690a = new C3690a(str, i, i2, f, f2);
        HashMap hashMap = (HashMap) this.f32364a.get(Integer.valueOf(i));
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f32364a.put(Integer.valueOf(i), hashMap);
        }
        hashMap.put(str, c3690a);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return m58680i(constraintWidget.stringId, null, 1).f32379b;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return m58680i(constraintWidget.stringId, null, 2).f32380c;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return m58680i(constraintWidget.stringId, null, 0).f32378a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 706) {
            this.f32372i = f;
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 705) {
            this.f32368e = str;
            this.f32369f = Easing.getInterpolator(str);
            return false;
        }
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.f32367d, this.f32368e);
    }
}
