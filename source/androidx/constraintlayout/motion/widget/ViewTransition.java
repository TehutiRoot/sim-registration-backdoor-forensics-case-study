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
    public int f33018a;

    /* renamed from: e */
    public int f33022e;

    /* renamed from: f */
    public KeyFrames f33023f;

    /* renamed from: g */
    public ConstraintSet.Constraint f33024g;

    /* renamed from: j */
    public int f33027j;

    /* renamed from: k */
    public String f33028k;

    /* renamed from: o */
    public Context f33032o;

    /* renamed from: b */
    public int f33019b = -1;

    /* renamed from: c */
    public boolean f33020c = false;

    /* renamed from: d */
    public int f33021d = 0;

    /* renamed from: h */
    public int f33025h = -1;

    /* renamed from: i */
    public int f33026i = -1;

    /* renamed from: l */
    public int f33029l = 0;

    /* renamed from: m */
    public String f33030m = null;

    /* renamed from: n */
    public int f33031n = -1;

    /* renamed from: p */
    public int f33033p = -1;

    /* renamed from: q */
    public int f33034q = -1;

    /* renamed from: r */
    public int f33035r = -1;

    /* renamed from: s */
    public int f33036s = -1;

    /* renamed from: t */
    public int f33037t = -1;

    /* renamed from: u */
    public int f33038u = -1;

    /* renamed from: v */
    public int f33039v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransition$a */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC3761a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f33040a;

        public animationInterpolatorC3761a(ViewTransition viewTransition, Easing easing) {
            this.f33040a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f33040a.get(f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransition$b */
    /* loaded from: classes2.dex */
    public static class C3762b {

        /* renamed from: a */
        public final int f33041a;

        /* renamed from: b */
        public final int f33042b;

        /* renamed from: c */
        public long f33043c;

        /* renamed from: d */
        public MotionController f33044d;

        /* renamed from: e */
        public int f33045e;

        /* renamed from: f */
        public int f33046f;

        /* renamed from: h */
        public ViewTransitionController f33048h;

        /* renamed from: i */
        public Interpolator f33049i;

        /* renamed from: k */
        public float f33051k;

        /* renamed from: l */
        public float f33052l;

        /* renamed from: m */
        public long f33053m;

        /* renamed from: o */
        public boolean f33055o;

        /* renamed from: g */
        public KeyCache f33047g = new KeyCache();

        /* renamed from: j */
        public boolean f33050j = false;

        /* renamed from: n */
        public Rect f33054n = new Rect();

        public C3762b(ViewTransitionController viewTransitionController, MotionController motionController, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f33055o = false;
            this.f33048h = viewTransitionController;
            this.f33044d = motionController;
            this.f33045e = i;
            this.f33046f = i2;
            long nanoTime = System.nanoTime();
            this.f33043c = nanoTime;
            this.f33053m = nanoTime;
            this.f33048h.m58216b(this);
            this.f33049i = interpolator;
            this.f33041a = i4;
            this.f33042b = i5;
            if (i3 == 3) {
                this.f33055o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.f33052l = f;
            m58222a();
        }

        /* renamed from: a */
        public void m58222a() {
            if (this.f33050j) {
                m58220c();
            } else {
                m58221b();
            }
        }

        /* renamed from: b */
        public void m58221b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f33053m = nanoTime;
            float f = this.f33051k + (((float) ((nanoTime - this.f33053m) * 1.0E-6d)) * this.f33052l);
            this.f33051k = f;
            if (f >= 1.0f) {
                this.f33051k = 1.0f;
            }
            Interpolator interpolator = this.f33049i;
            if (interpolator == null) {
                interpolation = this.f33051k;
            } else {
                interpolation = interpolator.getInterpolation(this.f33051k);
            }
            float f2 = interpolation;
            MotionController motionController = this.f33044d;
            boolean m58384q = motionController.m58384q(motionController.f32801b, f2, nanoTime, this.f33047g);
            if (this.f33051k >= 1.0f) {
                if (this.f33041a != -1) {
                    this.f33044d.getView().setTag(this.f33041a, Long.valueOf(System.nanoTime()));
                }
                if (this.f33042b != -1) {
                    this.f33044d.getView().setTag(this.f33042b, null);
                }
                if (!this.f33055o) {
                    this.f33048h.m58209i(this);
                }
            }
            if (this.f33051k < 1.0f || m58384q) {
                this.f33048h.m58212f();
            }
        }

        /* renamed from: c */
        public void m58220c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f33053m = nanoTime;
            float f = this.f33051k - (((float) ((nanoTime - this.f33053m) * 1.0E-6d)) * this.f33052l);
            this.f33051k = f;
            if (f < 0.0f) {
                this.f33051k = 0.0f;
            }
            Interpolator interpolator = this.f33049i;
            if (interpolator == null) {
                interpolation = this.f33051k;
            } else {
                interpolation = interpolator.getInterpolation(this.f33051k);
            }
            float f2 = interpolation;
            MotionController motionController = this.f33044d;
            boolean m58384q = motionController.m58384q(motionController.f32801b, f2, nanoTime, this.f33047g);
            if (this.f33051k <= 0.0f) {
                if (this.f33041a != -1) {
                    this.f33044d.getView().setTag(this.f33041a, Long.valueOf(System.nanoTime()));
                }
                if (this.f33042b != -1) {
                    this.f33044d.getView().setTag(this.f33042b, null);
                }
                this.f33048h.m58209i(this);
            }
            if (this.f33051k > 0.0f || m58384q) {
                this.f33048h.m58212f();
            }
        }

        /* renamed from: d */
        public void m58219d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f33044d.getView().getHitRect(this.f33054n);
                    if (!this.f33054n.contains((int) f, (int) f2) && !this.f33050j) {
                        m58218e(true);
                    }
                }
            } else if (!this.f33050j) {
                m58218e(true);
            }
        }

        /* renamed from: e */
        public void m58218e(boolean z) {
            int i;
            float f;
            this.f33050j = z;
            if (z && (i = this.f33046f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.f33052l = f;
            }
            this.f33048h.m58212f();
            this.f33053m = System.nanoTime();
        }
    }

    public ViewTransition(Context context, XmlPullParser xmlPullParser) {
        char c;
        this.f33032o = context;
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
                                    ConstraintAttribute.parse(context, xmlPullParser, this.f33024g.mCustomConstraints);
                                }
                            } else {
                                this.f33024g = ConstraintSet.buildDelta(context, xmlPullParser);
                            }
                        } else {
                            this.f33023f = new KeyFrames(context, xmlPullParser);
                        }
                    } else {
                        m58226j(context, xmlPullParser);
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
    public static /* synthetic */ void m58235a(ViewTransition viewTransition, View[] viewArr) {
        viewTransition.m58228h(viewArr);
    }

    /* renamed from: b */
    public void m58234b(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.m58380u(view);
        this.f33023f.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.f33025h, System.nanoTime());
        new C3762b(viewTransitionController, motionController, this.f33025h, this.f33026i, this.f33019b, m58230f(motionLayout.getContext()), this.f33033p, this.f33034q);
    }

    /* renamed from: c */
    public void m58233c(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i, ConstraintSet constraintSet, final View... viewArr) {
        int[] constraintSetIds;
        if (this.f33020c) {
            return;
        }
        int i2 = this.f33022e;
        if (i2 == 2) {
            m58234b(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i3);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.f33024g;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.f33024g.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.f33024g;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.f33024g.mCustomConstraints);
            }
        }
        motionLayout.updateState(i, constraintSet3);
        motionLayout.updateState(R.id.view_transition, constraintSet);
        motionLayout.setState(R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.f32902x, R.id.view_transition, i);
        for (View view3 : viewArr) {
            m58223m(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new Runnable() { // from class: m32
            {
                ViewTransition.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewTransition.m58235a(ViewTransition.this, viewArr);
            }
        });
    }

    /* renamed from: d */
    public boolean m58232d(View view) {
        boolean z;
        boolean z2;
        int i = this.f33035r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f33036s;
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
    public int m58231e() {
        return this.f33018a;
    }

    /* renamed from: f */
    public Interpolator m58230f(Context context) {
        int i = this.f33029l;
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
            return new animationInterpolatorC3761a(this, Easing.getInterpolator(this.f33030m));
        }
        return AnimationUtils.loadInterpolator(context, this.f33031n);
    }

    /* renamed from: g */
    public boolean m58229g() {
        return !this.f33020c;
    }

    public int getSharedValue() {
        return this.f33037t;
    }

    public int getSharedValueCurrent() {
        return this.f33039v;
    }

    public int getSharedValueID() {
        return this.f33038u;
    }

    public int getStateTransition() {
        return this.f33019b;
    }

    /* renamed from: h */
    public final /* synthetic */ void m58228h(View[] viewArr) {
        if (this.f33033p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f33033p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f33034q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f33034q, null);
            }
        }
    }

    /* renamed from: i */
    public boolean m58227i(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f33027j == -1 && this.f33028k == null) || !m58232d(view)) {
            return false;
        }
        if (view.getId() == this.f33027j) {
            return true;
        }
        if (this.f33028k == null || !(view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) || (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) == null || !str.matches(this.f33028k)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m58226j(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.ViewTransition_android_id) {
                this.f33018a = obtainStyledAttributes.getResourceId(index, this.f33018a);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f33027j);
                    this.f33027j = resourceId;
                    if (resourceId == -1) {
                        this.f33028k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f33028k = obtainStyledAttributes.getString(index);
                } else {
                    this.f33027j = obtainStyledAttributes.getResourceId(index, this.f33027j);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.f33019b = obtainStyledAttributes.getInt(index, this.f33019b);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.f33020c = obtainStyledAttributes.getBoolean(index, this.f33020c);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.f33021d = obtainStyledAttributes.getInt(index, this.f33021d);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.f33025h = obtainStyledAttributes.getInt(index, this.f33025h);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.f33026i = obtainStyledAttributes.getInt(index, this.f33026i);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.f33022e = obtainStyledAttributes.getInt(index, this.f33022e);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f33031n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f33029l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f33030m = string;
                    if (string != null && string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                        this.f33031n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f33029l = -2;
                    } else {
                        this.f33029l = -1;
                    }
                } else {
                    this.f33029l = obtainStyledAttributes.getInteger(index, this.f33029l);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.f33033p = obtainStyledAttributes.getResourceId(index, this.f33033p);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.f33034q = obtainStyledAttributes.getResourceId(index, this.f33034q);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.f33035r = obtainStyledAttributes.getResourceId(index, this.f33035r);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.f33036s = obtainStyledAttributes.getResourceId(index, this.f33036s);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.f33038u = obtainStyledAttributes.getResourceId(index, this.f33038u);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.f33037t = obtainStyledAttributes.getInteger(index, this.f33037t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    public void m58225k(boolean z) {
        this.f33020c = !z;
    }

    /* renamed from: l */
    public boolean m58224l(int i) {
        int i2 = this.f33019b;
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
    public final void m58223m(MotionScene.Transition transition, View view) {
        int i = this.f33025h;
        if (i != -1) {
            transition.setDuration(i);
        }
        transition.setPathMotionArc(this.f33021d);
        transition.setInterpolatorInfo(this.f33029l, this.f33030m, this.f33031n);
        int id2 = view.getId();
        KeyFrames keyFrames = this.f33023f;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().m73903clone().setViewId(id2));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    public void setSharedValue(int i) {
        this.f33037t = i;
    }

    public void setSharedValueCurrent(int i) {
        this.f33039v = i;
    }

    public void setSharedValueID(int i) {
        this.f33038u = i;
    }

    public void setStateTransition(int i) {
        this.f33019b = i;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.f33032o, this.f33018a) + ")";
    }
}
