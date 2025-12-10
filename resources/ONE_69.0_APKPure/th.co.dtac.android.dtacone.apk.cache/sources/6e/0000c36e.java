package com.p020zl.reik.dilatingdotsprogressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar */
/* loaded from: classes5.dex */
public class DilatingDotsProgressBar extends View {
    public static final double START_DELAY_FACTOR = 0.35d;
    public static final String TAG = "DilatingDotsProgressBar";

    /* renamed from: a */
    public int f60928a;

    /* renamed from: b */
    public int f60929b;

    /* renamed from: c */
    public int f60930c;

    /* renamed from: d */
    public int f60931d;

    /* renamed from: e */
    public float f60932e;

    /* renamed from: f */
    public float f60933f;

    /* renamed from: g */
    public float f60934g;

    /* renamed from: h */
    public float f60935h;

    /* renamed from: i */
    public long f60936i;

    /* renamed from: j */
    public boolean f60937j;

    /* renamed from: k */
    public boolean f60938k;

    /* renamed from: l */
    public ArrayList f60939l;

    /* renamed from: m */
    public final List f60940m;

    /* renamed from: n */
    public final Runnable f60941n;

    /* renamed from: o */
    public final Runnable f60942o;

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$a */
    /* loaded from: classes5.dex */
    public class RunnableC9997a implements Runnable {
        public RunnableC9997a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DilatingDotsProgressBar.this.f60936i = -1L;
            DilatingDotsProgressBar.this.setVisibility(8);
            DilatingDotsProgressBar.this.stopAnimations();
        }
    }

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$b */
    /* loaded from: classes5.dex */
    public class RunnableC9998b implements Runnable {
        public RunnableC9998b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!DilatingDotsProgressBar.this.f60938k) {
                DilatingDotsProgressBar.this.f60936i = System.currentTimeMillis();
                DilatingDotsProgressBar.this.setVisibility(0);
                DilatingDotsProgressBar.this.startAnimations();
            }
        }
    }

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$c */
    /* loaded from: classes5.dex */
    public class C9999c extends AnimatorListenerAdapter {
        public C9999c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (DilatingDotsProgressBar.this.shouldAnimate()) {
                DilatingDotsProgressBar.this.startAnimations();
            }
        }
    }

    public DilatingDotsProgressBar(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void m31993c() {
        this.f60934g = this.f60932e * this.f60933f;
    }

    /* renamed from: d */
    public final void m31992d() {
        this.f60930c = ((int) (this.f60932e * 2.0f)) + ((int) this.f60935h);
    }

    /* renamed from: e */
    public final float m31991e() {
        return this.f60934g * 2.0f;
    }

    /* renamed from: f */
    public final float m31990f() {
        return m31989g() + ((this.f60934g - this.f60932e) * 2.0f);
    }

    /* renamed from: g */
    public final float m31989g() {
        return (((this.f60932e * 2.0f) + this.f60935h) * this.f60939l.size()) - this.f60935h;
    }

    public int getDotGrowthSpeed() {
        return this.f60929b;
    }

    public float getDotRadius() {
        return this.f60932e;
    }

    public float getDotScaleMultiplier() {
        return this.f60933f;
    }

    public float getHorizontalSpacing() {
        return this.f60935h;
    }

    public int getNumberOfDots() {
        return this.f60931d;
    }

    /* renamed from: h */
    public final void m31988h(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DilatingDotsProgressBar);
        this.f60931d = obtainStyledAttributes.getInt(R.styleable.DilatingDotsProgressBar_dd_numDots, 3);
        this.f60932e = obtainStyledAttributes.getDimension(R.styleable.DilatingDotsProgressBar_android_radius, 8.0f);
        this.f60928a = obtainStyledAttributes.getColor(R.styleable.DilatingDotsProgressBar_android_color, -6543440);
        this.f60933f = obtainStyledAttributes.getFloat(R.styleable.DilatingDotsProgressBar_dd_scaleMultiplier, 1.75f);
        this.f60929b = obtainStyledAttributes.getInt(R.styleable.DilatingDotsProgressBar_dd_animationDuration, 300);
        this.f60935h = obtainStyledAttributes.getDimension(R.styleable.DilatingDotsProgressBar_dd_horizontalSpacing, 12.0f);
        obtainStyledAttributes.recycle();
        this.f60937j = false;
        m31993c();
        m31992d();
        m31987i();
        m31984l();
    }

    public void hide() {
        hide(500);
    }

    public void hideNow() {
        hide(0);
    }

    /* renamed from: i */
    public final void m31987i() {
        this.f60939l.clear();
        this.f60940m.clear();
        for (int i = 1; i <= this.f60931d; i++) {
            DilatingDotDrawable dilatingDotDrawable = new DilatingDotDrawable(this.f60928a, this.f60932e, this.f60934g);
            dilatingDotDrawable.setCallback(this);
            this.f60939l.add(dilatingDotDrawable);
            float f = this.f60932e;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dilatingDotDrawable, "radius", f, this.f60934g, f);
            ofFloat.setDuration(this.f60929b);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            if (i == this.f60931d) {
                ofFloat.addListener(new C9999c());
            }
            ofFloat.setStartDelay((i - 1) * ((int) (this.f60929b * 0.35d)));
            this.f60940m.add(ofFloat);
        }
    }

    /* renamed from: j */
    public final void m31986j() {
        removeCallbacks(this.f60941n);
        removeCallbacks(this.f60942o);
    }

    /* renamed from: k */
    public final void m31985k() {
        m31987i();
        m31984l();
        showNow();
    }

    /* renamed from: l */
    public final void m31984l() {
        if (this.f60932e <= 0.0f) {
            this.f60932e = (getHeight() / 2) / this.f60933f;
        }
        float f = this.f60934g;
        float f2 = this.f60932e;
        int i = (int) (f - f2);
        int i2 = ((int) (i + (f2 * 2.0f))) + 2;
        int i3 = ((int) (f * 2.0f)) + 2;
        for (int i4 = 0; i4 < this.f60939l.size(); i4++) {
            DilatingDotDrawable dilatingDotDrawable = (DilatingDotDrawable) this.f60939l.get(i4);
            dilatingDotDrawable.setRadius(this.f60932e);
            dilatingDotDrawable.setBounds(i, 0, i2, i3);
            float f3 = this.f60932e;
            ((ValueAnimator) this.f60940m.get(i4)).setFloatValues(f3, this.f60933f * f3, f3);
            int i5 = this.f60930c;
            i += i5;
            i2 += i5;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m31986j();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (shouldAnimate()) {
            Iterator it = this.f60939l.iterator();
            while (it.hasNext()) {
                ((DilatingDotDrawable) it.next()).draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) m31990f(), (int) m31991e());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (m31991e() != i2 || i != m31990f()) {
            m31984l();
        }
    }

    public void reset() {
        hideNow();
    }

    public void setDotColor(int i) {
        this.f60928a = i;
        Iterator it = this.f60939l.iterator();
        while (it.hasNext()) {
            ((DilatingDotDrawable) it.next()).setColor(this.f60928a);
        }
    }

    public void setDotRadius(float f) {
        reset();
        this.f60932e = f;
        m31993c();
        m31992d();
        m31985k();
    }

    public void setDotScaleMultpiplier(float f) {
        reset();
        this.f60933f = f;
        m31993c();
        m31985k();
    }

    public void setDotSpacing(float f) {
        reset();
        this.f60935h = f;
        m31992d();
        m31985k();
    }

    public void setGrowthSpeed(int i) {
        reset();
        this.f60929b = i;
        m31985k();
    }

    public void setNumberOfDots(int i) {
        reset();
        this.f60931d = i;
        m31985k();
    }

    public boolean shouldAnimate() {
        return this.f60937j;
    }

    public void show() {
        show(500);
    }

    public void showNow() {
        show(0);
    }

    public void startAnimations() {
        this.f60937j = true;
        for (Animator animator : this.f60940m) {
            animator.start();
        }
    }

    public void stopAnimations() {
        this.f60937j = false;
        m31986j();
        for (Animator animator : this.f60940m) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (shouldAnimate()) {
            return this.f60939l.contains(drawable);
        }
        return super.verifyDrawable(drawable);
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void hide(int i) {
        this.f60938k = true;
        removeCallbacks(this.f60942o);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f60936i;
        long j2 = currentTimeMillis - j;
        long j3 = i;
        if (j2 >= j3 || j == -1) {
            this.f60941n.run();
            return;
        }
        long j4 = j3 - j2;
        if (j4 <= 0) {
            this.f60941n.run();
        } else {
            postDelayed(this.f60941n, j4);
        }
    }

    public void show(int i) {
        this.f60936i = -1L;
        this.f60938k = false;
        removeCallbacks(this.f60941n);
        if (i == 0) {
            this.f60942o.run();
        } else {
            postDelayed(this.f60942o, i);
        }
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60936i = -1L;
        this.f60938k = false;
        this.f60939l = new ArrayList();
        this.f60940m = new ArrayList();
        this.f60941n = new RunnableC9997a();
        this.f60942o = new RunnableC9998b();
        m31988h(attributeSet);
    }
}