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
    public Adapter f32607e;

    /* renamed from: f */
    public final ArrayList f32608f;

    /* renamed from: g */
    public int f32609g;

    /* renamed from: h */
    public int f32610h;

    /* renamed from: i */
    public MotionLayout f32611i;

    /* renamed from: j */
    public int f32612j;

    /* renamed from: k */
    public boolean f32613k;

    /* renamed from: l */
    public int f32614l;

    /* renamed from: m */
    public int f32615m;

    /* renamed from: n */
    public int f32616n;

    /* renamed from: o */
    public int f32617o;

    /* renamed from: p */
    public float f32618p;

    /* renamed from: q */
    public int f32619q;

    /* renamed from: r */
    public int f32620r;

    /* renamed from: s */
    public int f32621s;

    /* renamed from: t */
    public float f32622t;

    /* renamed from: u */
    public int f32623u;

    /* renamed from: v */
    public int f32624v;

    /* renamed from: w */
    public int f32625w;

    /* renamed from: x */
    public Runnable f32626x;

    /* loaded from: classes2.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(View view, int i);
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    /* loaded from: classes2.dex */
    public class RunnableC3705a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC3706a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ float f32628a;

            public RunnableC3706a(float f) {
                RunnableC3705a.this = r1;
                this.f32628a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.f32611i.touchAnimateTo(5, 1.0f, this.f32628a);
            }
        }

        public RunnableC3705a() {
            Carousel.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f32611i.setProgress(0.0f);
            Carousel.this.m58553s();
            Carousel.this.f32607e.onNewItem(Carousel.this.f32610h);
            float velocity = Carousel.this.f32611i.getVelocity();
            if (Carousel.this.f32621s == 2 && velocity > Carousel.this.f32622t && Carousel.this.f32610h < Carousel.this.f32607e.count() - 1) {
                float f = velocity * Carousel.this.f32618p;
                if (Carousel.this.f32610h == 0 && Carousel.this.f32609g > Carousel.this.f32610h) {
                    return;
                }
                if (Carousel.this.f32610h == Carousel.this.f32607e.count() - 1 && Carousel.this.f32609g < Carousel.this.f32610h) {
                    return;
                }
                Carousel.this.f32611i.post(new RunnableC3706a(f));
            }
        }
    }

    public Carousel(Context context) {
        super(context);
        this.f32607e = null;
        this.f32608f = new ArrayList();
        this.f32609g = 0;
        this.f32610h = 0;
        this.f32612j = -1;
        this.f32613k = false;
        this.f32614l = -1;
        this.f32615m = -1;
        this.f32616n = -1;
        this.f32617o = -1;
        this.f32618p = 0.9f;
        this.f32619q = 0;
        this.f32620r = 4;
        this.f32621s = 1;
        this.f32622t = 2.0f;
        this.f32623u = -1;
        this.f32624v = 200;
        this.f32625w = -1;
        this.f32626x = new RunnableC3705a();
    }

    /* renamed from: g */
    public static /* synthetic */ void m58565g(Carousel carousel) {
        carousel.m58554r();
    }

    public int getCount() {
        Adapter adapter = this.f32607e;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f32610h;
    }

    public void jumpToIndex(int i) {
        this.f32610h = Math.max(0, Math.min(getCount() - 1, i));
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
                if (this.f32612j == i2) {
                    this.f32619q = i;
                }
                this.f32608f.add(viewById);
            }
            this.f32611i = motionLayout;
            if (this.f32621s == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.f32615m);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.f32611i.getTransition(this.f32614l);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            m58553s();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        this.f32625w = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        int i2 = this.f32610h;
        this.f32609g = i2;
        if (i == this.f32617o) {
            this.f32610h = i2 + 1;
        } else if (i == this.f32616n) {
            this.f32610h = i2 - 1;
        }
        if (this.f32613k) {
            if (this.f32610h >= this.f32607e.count()) {
                this.f32610h = 0;
            }
            if (this.f32610h < 0) {
                this.f32610h = this.f32607e.count() - 1;
            }
        } else {
            if (this.f32610h >= this.f32607e.count()) {
                this.f32610h = this.f32607e.count() - 1;
            }
            if (this.f32610h < 0) {
                this.f32610h = 0;
            }
        }
        if (this.f32609g != this.f32610h) {
            this.f32611i.post(this.f32626x);
        }
    }

    /* renamed from: p */
    public final boolean m58556p(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i == -1 || (motionLayout = this.f32611i) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    /* renamed from: q */
    public final void m58555q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.f32612j = obtainStyledAttributes.getResourceId(index, this.f32612j);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.f32614l = obtainStyledAttributes.getResourceId(index, this.f32614l);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.f32615m = obtainStyledAttributes.getResourceId(index, this.f32615m);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.f32620r = obtainStyledAttributes.getInt(index, this.f32620r);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.f32616n = obtainStyledAttributes.getResourceId(index, this.f32616n);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.f32617o = obtainStyledAttributes.getResourceId(index, this.f32617o);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f32618p = obtainStyledAttributes.getFloat(index, this.f32618p);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.f32621s = obtainStyledAttributes.getInt(index, this.f32621s);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f32622t = obtainStyledAttributes.getFloat(index, this.f32622t);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.f32613k = obtainStyledAttributes.getBoolean(index, this.f32613k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    public final /* synthetic */ void m58554r() {
        this.f32611i.setTransitionDuration(this.f32624v);
        if (this.f32623u < this.f32610h) {
            this.f32611i.transitionToState(this.f32616n, this.f32624v);
        } else {
            this.f32611i.transitionToState(this.f32617o, this.f32624v);
        }
    }

    public void refresh() {
        int size = this.f32608f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f32608f.get(i);
            if (this.f32607e.count() == 0) {
                m58551u(view, this.f32620r);
            } else {
                m58551u(view, 0);
            }
        }
        this.f32611i.rebuildScene();
        m58553s();
    }

    /* renamed from: s */
    public final void m58553s() {
        Adapter adapter = this.f32607e;
        if (adapter == null || this.f32611i == null || adapter.count() == 0) {
            return;
        }
        int size = this.f32608f.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f32608f.get(i);
            int i2 = (this.f32610h + i) - this.f32619q;
            if (this.f32613k) {
                if (i2 < 0) {
                    int i3 = this.f32620r;
                    if (i3 != 4) {
                        m58551u(view, i3);
                    } else {
                        m58551u(view, 0);
                    }
                    if (i2 % this.f32607e.count() == 0) {
                        this.f32607e.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.f32607e;
                        adapter2.populate(view, adapter2.count() + (i2 % this.f32607e.count()));
                    }
                } else if (i2 >= this.f32607e.count()) {
                    if (i2 == this.f32607e.count()) {
                        i2 = 0;
                    } else if (i2 > this.f32607e.count()) {
                        i2 %= this.f32607e.count();
                    }
                    int i4 = this.f32620r;
                    if (i4 != 4) {
                        m58551u(view, i4);
                    } else {
                        m58551u(view, 0);
                    }
                    this.f32607e.populate(view, i2);
                } else {
                    m58551u(view, 0);
                    this.f32607e.populate(view, i2);
                }
            } else if (i2 < 0) {
                m58551u(view, this.f32620r);
            } else if (i2 >= this.f32607e.count()) {
                m58551u(view, this.f32620r);
            } else {
                m58551u(view, 0);
                this.f32607e.populate(view, i2);
            }
        }
        int i5 = this.f32623u;
        if (i5 != -1 && i5 != this.f32610h) {
            this.f32611i.post(new Runnable() { // from class: pm
                {
                    Carousel.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.m58565g(Carousel.this);
                }
            });
        } else if (i5 == this.f32610h) {
            this.f32623u = -1;
        }
        if (this.f32614l != -1 && this.f32615m != -1) {
            if (this.f32613k) {
                return;
            }
            int count = this.f32607e.count();
            if (this.f32610h == 0) {
                m58556p(this.f32614l, false);
            } else {
                m58556p(this.f32614l, true);
                this.f32611i.setTransition(this.f32614l);
            }
            if (this.f32610h == count - 1) {
                m58556p(this.f32615m, false);
                return;
            }
            m58556p(this.f32615m, true);
            this.f32611i.setTransition(this.f32615m);
            return;
        }
        Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
    }

    public void setAdapter(Adapter adapter) {
        this.f32607e = adapter;
    }

    /* renamed from: t */
    public final boolean m58552t(int i, View view, int i2) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.f32611i.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    public void transitionToIndex(int i, int i2) {
        this.f32623u = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.f32624v = max;
        this.f32611i.setTransitionDuration(max);
        if (i < this.f32610h) {
            this.f32611i.transitionToState(this.f32616n, this.f32624v);
        } else {
            this.f32611i.transitionToState(this.f32617o, this.f32624v);
        }
    }

    /* renamed from: u */
    public final boolean m58551u(View view, int i) {
        MotionLayout motionLayout = this.f32611i;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= m58552t(i2, view, i);
        }
        return z;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32607e = null;
        this.f32608f = new ArrayList();
        this.f32609g = 0;
        this.f32610h = 0;
        this.f32612j = -1;
        this.f32613k = false;
        this.f32614l = -1;
        this.f32615m = -1;
        this.f32616n = -1;
        this.f32617o = -1;
        this.f32618p = 0.9f;
        this.f32619q = 0;
        this.f32620r = 4;
        this.f32621s = 1;
        this.f32622t = 2.0f;
        this.f32623u = -1;
        this.f32624v = 200;
        this.f32625w = -1;
        this.f32626x = new RunnableC3705a();
        m58555q(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32607e = null;
        this.f32608f = new ArrayList();
        this.f32609g = 0;
        this.f32610h = 0;
        this.f32612j = -1;
        this.f32613k = false;
        this.f32614l = -1;
        this.f32615m = -1;
        this.f32616n = -1;
        this.f32617o = -1;
        this.f32618p = 0.9f;
        this.f32619q = 0;
        this.f32620r = 4;
        this.f32621s = 1;
        this.f32622t = 2.0f;
        this.f32623u = -1;
        this.f32624v = 200;
        this.f32625w = -1;
        this.f32626x = new RunnableC3705a();
        m58555q(context, attributeSet);
    }
}
