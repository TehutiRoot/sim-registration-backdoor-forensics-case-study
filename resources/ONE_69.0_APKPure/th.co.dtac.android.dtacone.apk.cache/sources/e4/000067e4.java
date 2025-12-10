package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Carousel extends MotionHelper {
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;

    /* renamed from: e */
    public Adapter f32695e;

    /* renamed from: f */
    public final ArrayList f32696f;

    /* renamed from: g */
    public int f32697g;

    /* renamed from: h */
    public int f32698h;

    /* renamed from: i */
    public MotionLayout f32699i;

    /* renamed from: j */
    public int f32700j;

    /* renamed from: k */
    public boolean f32701k;

    /* renamed from: l */
    public int f32702l;

    /* renamed from: m */
    public int f32703m;

    /* renamed from: n */
    public int f32704n;

    /* renamed from: o */
    public int f32705o;

    /* renamed from: p */
    public float f32706p;

    /* renamed from: q */
    public int f32707q;

    /* renamed from: r */
    public int f32708r;

    /* renamed from: s */
    public int f32709s;

    /* renamed from: t */
    public float f32710t;

    /* renamed from: u */
    public int f32711u;

    /* renamed from: v */
    public int f32712v;

    /* renamed from: w */
    public int f32713w;

    /* renamed from: x */
    public Runnable f32714x;

    /* loaded from: classes2.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(View view, int i);
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    /* loaded from: classes2.dex */
    public class RunnableC3687a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC3688a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ float f32716a;

            public RunnableC3688a(float f) {
                RunnableC3687a.this = r1;
                this.f32716a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.f32699i.touchAnimateTo(5, 1.0f, this.f32716a);
            }
        }

        public RunnableC3687a() {
            Carousel.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f32699i.setProgress(0.0f);
            Carousel.this.m58503s();
            Carousel.this.f32695e.onNewItem(Carousel.this.f32698h);
            float velocity = Carousel.this.f32699i.getVelocity();
            if (Carousel.this.f32709s == 2 && velocity > Carousel.this.f32710t && Carousel.this.f32698h < Carousel.this.f32695e.count() - 1) {
                float f = velocity * Carousel.this.f32706p;
                if (Carousel.this.f32698h == 0 && Carousel.this.f32697g > Carousel.this.f32698h) {
                    return;
                }
                if (Carousel.this.f32698h == Carousel.this.f32695e.count() - 1 && Carousel.this.f32697g < Carousel.this.f32698h) {
                    return;
                }
                Carousel.this.f32699i.post(new RunnableC3688a(f));
            }
        }
    }

    public Carousel(Context context) {
        super(context);
        this.f32695e = null;
        this.f32696f = new ArrayList();
        this.f32697g = 0;
        this.f32698h = 0;
        this.f32700j = -1;
        this.f32701k = false;
        this.f32702l = -1;
        this.f32703m = -1;
        this.f32704n = -1;
        this.f32705o = -1;
        this.f32706p = 0.9f;
        this.f32707q = 0;
        this.f32708r = 4;
        this.f32709s = 1;
        this.f32710t = 2.0f;
        this.f32711u = -1;
        this.f32712v = 200;
        this.f32713w = -1;
        this.f32714x = new RunnableC3687a();
    }

    /* renamed from: g */
    public static /* synthetic */ void m58515g(Carousel carousel) {
        carousel.m58504r();
    }

    public int getCount() {
        Adapter adapter = this.f32695e;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f32698h;
    }

    public void jumpToIndex(int i) {
        this.f32698h = Math.max(0, Math.min(getCount() - 1, i));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f32700j == i2) {
                    this.f32707q = i;
                }
                this.f32696f.add(viewById);
            }
            this.f32699i = motionLayout;
            if (this.f32709s == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.f32703m);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.f32699i.getTransition(this.f32702l);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            m58503s();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        this.f32713w = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        int i2 = this.f32698h;
        this.f32697g = i2;
        if (i == this.f32705o) {
            this.f32698h = i2 + 1;
        } else if (i == this.f32704n) {
            this.f32698h = i2 - 1;
        }
        if (this.f32701k) {
            if (this.f32698h >= this.f32695e.count()) {
                this.f32698h = 0;
            }
            if (this.f32698h < 0) {
                this.f32698h = this.f32695e.count() - 1;
            }
        } else {
            if (this.f32698h >= this.f32695e.count()) {
                this.f32698h = this.f32695e.count() - 1;
            }
            if (this.f32698h < 0) {
                this.f32698h = 0;
            }
        }
        if (this.f32697g != this.f32698h) {
            this.f32699i.post(this.f32714x);
        }
    }

    /* renamed from: p */
    public final boolean m58506p(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i == -1 || (motionLayout = this.f32699i) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    /* renamed from: q */
    public final void m58505q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.f32700j = obtainStyledAttributes.getResourceId(index, this.f32700j);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.f32702l = obtainStyledAttributes.getResourceId(index, this.f32702l);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.f32703m = obtainStyledAttributes.getResourceId(index, this.f32703m);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.f32708r = obtainStyledAttributes.getInt(index, this.f32708r);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.f32704n = obtainStyledAttributes.getResourceId(index, this.f32704n);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.f32705o = obtainStyledAttributes.getResourceId(index, this.f32705o);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f32706p = obtainStyledAttributes.getFloat(index, this.f32706p);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.f32709s = obtainStyledAttributes.getInt(index, this.f32709s);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f32710t = obtainStyledAttributes.getFloat(index, this.f32710t);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.f32701k = obtainStyledAttributes.getBoolean(index, this.f32701k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public final /* synthetic */ void m58504r() {
        this.f32699i.setTransitionDuration(this.f32712v);
        if (this.f32711u < this.f32698h) {
            this.f32699i.transitionToState(this.f32704n, this.f32712v);
        } else {
            this.f32699i.transitionToState(this.f32705o, this.f32712v);
        }
    }

    public void refresh() {
        int size = this.f32696f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f32696f.get(i);
            if (this.f32695e.count() == 0) {
                m58501u(view, this.f32708r);
            } else {
                m58501u(view, 0);
            }
        }
        this.f32699i.rebuildScene();
        m58503s();
    }

    /* renamed from: s */
    public final void m58503s() {
        Adapter adapter = this.f32695e;
        if (adapter == null || this.f32699i == null || adapter.count() == 0) {
            return;
        }
        int size = this.f32696f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f32696f.get(i);
            int i2 = (this.f32698h + i) - this.f32707q;
            if (this.f32701k) {
                if (i2 < 0) {
                    int i3 = this.f32708r;
                    if (i3 != 4) {
                        m58501u(view, i3);
                    } else {
                        m58501u(view, 0);
                    }
                    if (i2 % this.f32695e.count() == 0) {
                        this.f32695e.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.f32695e;
                        adapter2.populate(view, adapter2.count() + (i2 % this.f32695e.count()));
                    }
                } else if (i2 >= this.f32695e.count()) {
                    if (i2 == this.f32695e.count()) {
                        i2 = 0;
                    } else if (i2 > this.f32695e.count()) {
                        i2 %= this.f32695e.count();
                    }
                    int i4 = this.f32708r;
                    if (i4 != 4) {
                        m58501u(view, i4);
                    } else {
                        m58501u(view, 0);
                    }
                    this.f32695e.populate(view, i2);
                } else {
                    m58501u(view, 0);
                    this.f32695e.populate(view, i2);
                }
            } else if (i2 < 0) {
                m58501u(view, this.f32708r);
            } else if (i2 >= this.f32695e.count()) {
                m58501u(view, this.f32708r);
            } else {
                m58501u(view, 0);
                this.f32695e.populate(view, i2);
            }
        }
        int i5 = this.f32711u;
        if (i5 != -1 && i5 != this.f32698h) {
            this.f32699i.post(new Runnable() { // from class: pm
                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.m58515g(Carousel.this);
                }
            });
        } else if (i5 == this.f32698h) {
            this.f32711u = -1;
        }
        if (this.f32702l != -1 && this.f32703m != -1) {
            if (this.f32701k) {
                return;
            }
            int count = this.f32695e.count();
            if (this.f32698h == 0) {
                m58506p(this.f32702l, false);
            } else {
                m58506p(this.f32702l, true);
                this.f32699i.setTransition(this.f32702l);
            }
            if (this.f32698h == count - 1) {
                m58506p(this.f32703m, false);
                return;
            }
            m58506p(this.f32703m, true);
            this.f32699i.setTransition(this.f32703m);
            return;
        }
        Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
    }

    public void setAdapter(Adapter adapter) {
        this.f32695e = adapter;
    }

    /* renamed from: t */
    public final boolean m58502t(int i, View view, int i2) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.f32699i.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    public void transitionToIndex(int i, int i2) {
        this.f32711u = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.f32712v = max;
        this.f32699i.setTransitionDuration(max);
        if (i < this.f32698h) {
            this.f32699i.transitionToState(this.f32704n, this.f32712v);
        } else {
            this.f32699i.transitionToState(this.f32705o, this.f32712v);
        }
    }

    /* renamed from: u */
    public final boolean m58501u(View view, int i) {
        MotionLayout motionLayout = this.f32699i;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= m58502t(i2, view, i);
        }
        return z;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32695e = null;
        this.f32696f = new ArrayList();
        this.f32697g = 0;
        this.f32698h = 0;
        this.f32700j = -1;
        this.f32701k = false;
        this.f32702l = -1;
        this.f32703m = -1;
        this.f32704n = -1;
        this.f32705o = -1;
        this.f32706p = 0.9f;
        this.f32707q = 0;
        this.f32708r = 4;
        this.f32709s = 1;
        this.f32710t = 2.0f;
        this.f32711u = -1;
        this.f32712v = 200;
        this.f32713w = -1;
        this.f32714x = new RunnableC3687a();
        m58505q(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32695e = null;
        this.f32696f = new ArrayList();
        this.f32697g = 0;
        this.f32698h = 0;
        this.f32700j = -1;
        this.f32701k = false;
        this.f32702l = -1;
        this.f32703m = -1;
        this.f32704n = -1;
        this.f32705o = -1;
        this.f32706p = 0.9f;
        this.f32707q = 0;
        this.f32708r = 4;
        this.f32709s = 1;
        this.f32710t = 2.0f;
        this.f32711u = -1;
        this.f32712v = 200;
        this.f32713w = -1;
        this.f32714x = new RunnableC3687a();
        m58505q(context, attributeSet);
    }
}