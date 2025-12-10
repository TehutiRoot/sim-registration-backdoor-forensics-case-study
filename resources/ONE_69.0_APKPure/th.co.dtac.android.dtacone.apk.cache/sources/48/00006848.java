package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ViewTransition {
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";

    /* renamed from: a */
    public int f33106a;

    /* renamed from: e */
    public int f33110e;

    /* renamed from: f */
    public KeyFrames f33111f;

    /* renamed from: g */
    public ConstraintSet.Constraint f33112g;

    /* renamed from: j */
    public int f33115j;

    /* renamed from: k */
    public String f33116k;

    /* renamed from: o */
    public Context f33120o;

    /* renamed from: b */
    public int f33107b = -1;

    /* renamed from: c */
    public boolean f33108c = false;

    /* renamed from: d */
    public int f33109d = 0;

    /* renamed from: h */
    public int f33113h = -1;

    /* renamed from: i */
    public int f33114i = -1;

    /* renamed from: l */
    public int f33117l = 0;

    /* renamed from: m */
    public String f33118m = null;

    /* renamed from: n */
    public int f33119n = -1;

    /* renamed from: p */
    public int f33121p = -1;

    /* renamed from: q */
    public int f33122q = -1;

    /* renamed from: r */
    public int f33123r = -1;

    /* renamed from: s */
    public int f33124s = -1;

    /* renamed from: t */
    public int f33125t = -1;

    /* renamed from: u */
    public int f33126u = -1;

    /* renamed from: v */
    public int f33127v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransition$a */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC3743a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f33128a;

        public animationInterpolatorC3743a(ViewTransition viewTransition, Easing easing) {
            this.f33128a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f33128a.get(f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransition$b */
    /* loaded from: classes2.dex */
    public static class C3744b {

        /* renamed from: a */
        public final int f33129a;

        /* renamed from: b */
        public final int f33130b;

        /* renamed from: c */
        public long f33131c;

        /* renamed from: d */
        public MotionController f33132d;

        /* renamed from: e */
        public int f33133e;

        /* renamed from: f */
        public int f33134f;

        /* renamed from: h */
        public ViewTransitionController f33136h;

        /* renamed from: i */
        public Interpolator f33137i;

        /* renamed from: k */
        public float f33139k;

        /* renamed from: l */
        public float f33140l;

        /* renamed from: m */
        public long f33141m;

        /* renamed from: o */
        public boolean f33143o;

        /* renamed from: g */
        public KeyCache f33135g = new KeyCache();

        /* renamed from: j */
        public boolean f33138j = false;

        /* renamed from: n */
        public Rect f33142n = new Rect();

        public C3744b(ViewTransitionController viewTransitionController, MotionController motionController, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f33143o = false;
            this.f33136h = viewTransitionController;
            this.f33132d = motionController;
            this.f33133e = i;
            this.f33134f = i2;
            long nanoTime = System.nanoTime();
            this.f33131c = nanoTime;
            this.f33141m = nanoTime;
            this.f33136h.m58166b(this);
            this.f33137i = interpolator;
            this.f33129a = i4;
            this.f33130b = i5;
            if (i3 == 3) {
                this.f33143o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.f33140l = f;
            m58172a();
        }

        /* renamed from: a */
        public void m58172a() {
            if (this.f33138j) {
                m58170c();
            } else {
                m58171b();
            }
        }

        /* renamed from: b */
        public void m58171b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f33141m = nanoTime;
            float f = this.f33139k + (((float) ((nanoTime - this.f33141m) * 1.0E-6d)) * this.f33140l);
            this.f33139k = f;
            if (f >= 1.0f) {
                this.f33139k = 1.0f;
            }
            Interpolator interpolator = this.f33137i;
            if (interpolator == null) {
                interpolation = this.f33139k;
            } else {
                interpolation = interpolator.getInterpolation(this.f33139k);
            }
            float f2 = interpolation;
            MotionController motionController = this.f33132d;
            boolean m58334q = motionController.m58334q(motionController.f32889b, f2, nanoTime, this.f33135g);
            if (this.f33139k >= 1.0f) {
                if (this.f33129a != -1) {
                    this.f33132d.getView().setTag(this.f33129a, Long.valueOf(System.nanoTime()));
                }
                if (this.f33130b != -1) {
                    this.f33132d.getView().setTag(this.f33130b, null);
                }
                if (!this.f33143o) {
                    this.f33136h.m58159i(this);
                }
            }
            if (this.f33139k < 1.0f || m58334q) {
                this.f33136h.m58162f();
            }
        }

        /* renamed from: c */
        public void m58170c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f33141m = nanoTime;
            float f = this.f33139k - (((float) ((nanoTime - this.f33141m) * 1.0E-6d)) * this.f33140l);
            this.f33139k = f;
            if (f < 0.0f) {
                this.f33139k = 0.0f;
            }
            Interpolator interpolator = this.f33137i;
            if (interpolator == null) {
                interpolation = this.f33139k;
            } else {
                interpolation = interpolator.getInterpolation(this.f33139k);
            }
            float f2 = interpolation;
            MotionController motionController = this.f33132d;
            boolean m58334q = motionController.m58334q(motionController.f32889b, f2, nanoTime, this.f33135g);
            if (this.f33139k <= 0.0f) {
                if (this.f33129a != -1) {
                    this.f33132d.getView().setTag(this.f33129a, Long.valueOf(System.nanoTime()));
                }
                if (this.f33130b != -1) {
                    this.f33132d.getView().setTag(this.f33130b, null);
                }
                this.f33136h.m58159i(this);
            }
            if (this.f33139k > 0.0f || m58334q) {
                this.f33136h.m58162f();
            }
        }

        /* renamed from: d */
        public void m58169d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f33132d.getView().getHitRect(this.f33142n);
                    if (!this.f33142n.contains((int) f, (int) f2) && !this.f33138j) {
                        m58168e(true);
                    }
                }
            } else if (!this.f33138j) {
                m58168e(true);
            }
        }

        /* renamed from: e */
        public void m58168e(boolean z) {
            int i;
            float f;
            this.f33138j = z;
            if (z && (i = this.f33134f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.f33140l = f;
            }
            this.f33136h.m58162f();
            this.f33141m = System.nanoTime();
        }
    }

    public ViewTransition(Context context, XmlPullParser xmlPullParser) {
        char c;
        this.f33120o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if (VIEW_TRANSITION_TAG.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(CONSTRAINT_OVERRIDE)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals(KEY_FRAME_SET_TAG)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals(VIEW_TRANSITION_TAG)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 366511058:
                            if (name.equals(CUSTOM_METHOD)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1791837707:
                            if (name.equals(CUSTOM_ATTRIBUTE)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3 && c != 4) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(Debug.getLoc());
                                    sb.append(" unknown tag ");
                                    sb.append(name);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(".xml:");
                                    sb2.append(xmlPullParser.getLineNumber());
                                } else {
                                    ConstraintAttribute.parse(context, xmlPullParser, this.f33112g.mCustomConstraints);
                                }
                            } else {
                                this.f33112g = ConstraintSet.buildDelta(context, xmlPullParser);
                            }
                        } else {
                            this.f33111f = new KeyFrames(context, xmlPullParser);
                        }
                    } else {
                        m58176j(context, xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m58185a(ViewTransition viewTransition, View[] viewArr) {
        viewTransition.m58178h(viewArr);
    }

    /* renamed from: b */
    public void m58184b(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.m58330u(view);
        this.f33111f.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.f33113h, System.nanoTime());
        new C3744b(viewTransitionController, motionController, this.f33113h, this.f33114i, this.f33107b, m58180f(motionLayout.getContext()), this.f33121p, this.f33122q);
    }

    /* renamed from: c */
    public void m58183c(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i, ConstraintSet constraintSet, final View... viewArr) {
        int[] constraintSetIds;
        if (this.f33108c) {
            return;
        }
        int i2 = this.f33110e;
        if (i2 == 2) {
            m58184b(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i3);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.f33112g;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.f33112g.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.f33112g;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.f33112g.mCustomConstraints);
            }
        }
        motionLayout.updateState(i, constraintSet3);
        motionLayout.updateState(R.id.view_transition, constraintSet);
        motionLayout.setState(R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.f32990x, R.id.view_transition, i);
        for (View view3 : viewArr) {
            m58173m(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new Runnable() { // from class: j42
            @Override // java.lang.Runnable
            public final void run() {
                ViewTransition.m58185a(ViewTransition.this, viewArr);
            }
        });
    }

    /* renamed from: d */
    public boolean m58182d(View view) {
        boolean z;
        boolean z2;
        int i = this.f33123r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f33124s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int m58181e() {
        return this.f33106a;
    }

    /* renamed from: f */
    public Interpolator m58180f(Context context) {
        int i = this.f33117l;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC3743a(this, Easing.getInterpolator(this.f33118m));
        }
        return AnimationUtils.loadInterpolator(context, this.f33119n);
    }

    /* renamed from: g */
    public boolean m58179g() {
        return !this.f33108c;
    }

    public int getSharedValue() {
        return this.f33125t;
    }

    public int getSharedValueCurrent() {
        return this.f33127v;
    }

    public int getSharedValueID() {
        return this.f33126u;
    }

    public int getStateTransition() {
        return this.f33107b;
    }

    /* renamed from: h */
    public final /* synthetic */ void m58178h(View[] viewArr) {
        if (this.f33121p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f33121p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f33122q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f33122q, null);
            }
        }
    }

    /* renamed from: i */
    public boolean m58177i(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f33115j == -1 && this.f33116k == null) || !m58182d(view)) {
            return false;
        }
        if (view.getId() == this.f33115j) {
            return true;
        }
        if (this.f33116k == null || !(view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) || (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) == null || !str.matches(this.f33116k)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m58176j(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.ViewTransition_android_id) {
                this.f33106a = obtainStyledAttributes.getResourceId(index, this.f33106a);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f33115j);
                    this.f33115j = resourceId;
                    if (resourceId == -1) {
                        this.f33116k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f33116k = obtainStyledAttributes.getString(index);
                } else {
                    this.f33115j = obtainStyledAttributes.getResourceId(index, this.f33115j);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.f33107b = obtainStyledAttributes.getInt(index, this.f33107b);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.f33108c = obtainStyledAttributes.getBoolean(index, this.f33108c);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.f33109d = obtainStyledAttributes.getInt(index, this.f33109d);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.f33113h = obtainStyledAttributes.getInt(index, this.f33113h);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.f33114i = obtainStyledAttributes.getInt(index, this.f33114i);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.f33110e = obtainStyledAttributes.getInt(index, this.f33110e);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f33119n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f33117l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f33118m = string;
                    if (string != null && string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                        this.f33119n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f33117l = -2;
                    } else {
                        this.f33117l = -1;
                    }
                } else {
                    this.f33117l = obtainStyledAttributes.getInteger(index, this.f33117l);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.f33121p = obtainStyledAttributes.getResourceId(index, this.f33121p);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.f33122q = obtainStyledAttributes.getResourceId(index, this.f33122q);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.f33123r = obtainStyledAttributes.getResourceId(index, this.f33123r);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.f33124s = obtainStyledAttributes.getResourceId(index, this.f33124s);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.f33126u = obtainStyledAttributes.getResourceId(index, this.f33126u);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.f33125t = obtainStyledAttributes.getInteger(index, this.f33125t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    public void m58175k(boolean z) {
        this.f33108c = !z;
    }

    /* renamed from: l */
    public boolean m58174l(int i) {
        int i2 = this.f33107b;
        if (i2 == 1) {
            if (i != 0) {
                return false;
            }
            return true;
        } else if (i2 == 2) {
            if (i != 1) {
                return false;
            }
            return true;
        } else if (i2 != 3 || i != 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public final void m58173m(MotionScene.Transition transition, View view) {
        int i = this.f33113h;
        if (i != -1) {
            transition.setDuration(i);
        }
        transition.setPathMotionArc(this.f33109d);
        transition.setInterpolatorInfo(this.f33117l, this.f33118m, this.f33119n);
        int id2 = view.getId();
        KeyFrames keyFrames = this.f33111f;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().m74087clone().setViewId(id2));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    public void setSharedValue(int i) {
        this.f33125t = i;
    }

    public void setSharedValueCurrent(int i) {
        this.f33127v = i;
    }

    public void setSharedValueID(int i) {
        this.f33126u = i;
    }

    public void setStateTransition(int i) {
        this.f33107b = i;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.f33120o, this.f33106a) + ")";
    }
}