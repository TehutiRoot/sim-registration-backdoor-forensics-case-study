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
    public int f60916a;

    /* renamed from: b */
    public int f60917b;

    /* renamed from: c */
    public int f60918c;

    /* renamed from: d */
    public int f60919d;

    /* renamed from: e */
    public float f60920e;

    /* renamed from: f */
    public float f60921f;

    /* renamed from: g */
    public float f60922g;

    /* renamed from: h */
    public float f60923h;

    /* renamed from: i */
    public long f60924i;

    /* renamed from: j */
    public boolean f60925j;

    /* renamed from: k */
    public boolean f60926k;

    /* renamed from: l */
    public ArrayList f60927l;

    /* renamed from: m */
    public final List f60928m;

    /* renamed from: n */
    public final Runnable f60929n;

    /* renamed from: o */
    public final Runnable f60930o;

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$a */
    /* loaded from: classes5.dex */
    public class RunnableC10008a implements Runnable {
        public RunnableC10008a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DilatingDotsProgressBar.this.f60924i = -1L;
            DilatingDotsProgressBar.this.setVisibility(8);
            DilatingDotsProgressBar.this.stopAnimations();
        }
    }

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$b */
    /* loaded from: classes5.dex */
    public class RunnableC10009b implements Runnable {
        public RunnableC10009b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!DilatingDotsProgressBar.this.f60926k) {
                DilatingDotsProgressBar.this.f60924i = System.currentTimeMillis();
                DilatingDotsProgressBar.this.setVisibility(0);
                DilatingDotsProgressBar.this.startAnimations();
            }
        }
    }

    /* renamed from: com.zl.reik.dilatingdotsprogressbar.DilatingDotsProgressBar$c */
    /* loaded from: classes5.dex */
    public class C10010c extends AnimatorListenerAdapter {
        public C10010c() {
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
    public final void m32001c() {
        this.f60922g = this.f60920e * this.f60921f;
    }

    /* renamed from: d */
    public final void m32000d() {
        this.f60918c = ((int) (this.f60920e * 2.0f)) + ((int) this.f60923h);
    }

    /* renamed from: e */
    public final float m31999e() {
        return this.f60922g * 2.0f;
    }

    /* renamed from: f */
    public final float m31998f() {
        return m31997g() + ((this.f60922g - this.f60920e) * 2.0f);
    }

    /* renamed from: g */
    public final float m31997g() {
        return (((this.f60920e * 2.0f) + this.f60923h) * this.f60927l.size()) - this.f60923h;
    }

    public int getDotGrowthSpeed() {
        return this.f60917b;
    }

    public float getDotRadius() {
        return this.f60920e;
    }

    public float getDotScaleMultiplier() {
        return this.f60921f;
    }

    public float getHorizontalSpacing() {
        return this.f60923h;
    }

    public int getNumberOfDots() {
        return this.f60919d;
    }

    /* renamed from: h */
    public final void m31996h(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.DilatingDotsProgressBar);
        this.f60919d = obtainStyledAttributes.getInt(R.styleable.DilatingDotsProgressBar_dd_numDots, 3);
        this.f60920e = obtainStyledAttributes.getDimension(R.styleable.DilatingDotsProgressBar_android_radius, 8.0f);
        this.f60916a = obtainStyledAttributes.getColor(R.styleable.DilatingDotsProgressBar_android_color, -6543440);
        this.f60921f = obtainStyledAttributes.getFloat(R.styleable.DilatingDotsProgressBar_dd_scaleMultiplier, 1.75f);
        this.f60917b = obtainStyledAttributes.getInt(R.styleable.DilatingDotsProgressBar_dd_animationDuration, 300);
        this.f60923h = obtainStyledAttributes.getDimension(R.styleable.DilatingDotsProgressBar_dd_horizontalSpacing, 12.0f);
        obtainStyledAttributes.recycle();
        this.f60925j = false;
        m32001c();
        m32000d();
        m31995i();
        m31992l();
    }

    public void hide() {
        hide(500);
    }

    public void hideNow() {
        hide(0);
    }

    /* renamed from: i */
    public final void m31995i() {
        this.f60927l.clear();
        this.f60928m.clear();
        for (int i = 1; i <= this.f60919d; i++) {
            DilatingDotDrawable dilatingDotDrawable = new DilatingDotDrawable(this.f60916a, this.f60920e, this.f60922g);
            dilatingDotDrawable.setCallback(this);
            this.f60927l.add(dilatingDotDrawable);
            float f = this.f60920e;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dilatingDotDrawable, "radius", f, this.f60922g, f);
            ofFloat.setDuration(this.f60917b);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            if (i == this.f60919d) {
                ofFloat.addListener(new C10010c());
            }
            ofFloat.setStartDelay((i - 1) * ((int) (this.f60917b * 0.35d)));
            this.f60928m.add(ofFloat);
        }
    }

    /* renamed from: j */
    public final void m31994j() {
        removeCallbacks(this.f60929n);
        removeCallbacks(this.f60930o);
    }

    /* renamed from: k */
    public final void m31993k() {
        m31995i();
        m31992l();
        showNow();
    }

    /* renamed from: l */
    public final void m31992l() {
        if (this.f60920e <= 0.0f) {
            this.f60920e = (getHeight() / 2) / this.f60921f;
        }
        float f = this.f60922g;
        float f2 = this.f60920e;
        int i = (int) (f - f2);
        int i2 = ((int) (i + (f2 * 2.0f))) + 2;
        int i3 = ((int) (f * 2.0f)) + 2;
        for (int i4 = 0; i4 < this.f60927l.size(); i4++) {
            DilatingDotDrawable dilatingDotDrawable = (DilatingDotDrawable) this.f60927l.get(i4);
            dilatingDotDrawable.setRadius(this.f60920e);
            dilatingDotDrawable.setBounds(i, 0, i2, i3);
            float f3 = this.f60920e;
            ((ValueAnimator) this.f60928m.get(i4)).setFloatValues(f3, this.f60921f * f3, f3);
            int i5 = this.f60918c;
            i += i5;
            i2 += i5;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m31994j();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (shouldAnimate()) {
            Iterator it = this.f60927l.iterator();
            while (it.hasNext()) {
                ((DilatingDotDrawable) it.next()).draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) m31998f(), (int) m31999e());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (m31999e() != i2 || i != m31998f()) {
            m31992l();
        }
    }

    public void reset() {
        hideNow();
    }

    public void setDotColor(int i) {
        this.f60916a = i;
        Iterator it = this.f60927l.iterator();
        while (it.hasNext()) {
            ((DilatingDotDrawable) it.next()).setColor(this.f60916a);
        }
    }

    public void setDotRadius(float f) {
        reset();
        this.f60920e = f;
        m32001c();
        m32000d();
        m31993k();
    }

    public void setDotScaleMultpiplier(float f) {
        reset();
        this.f60921f = f;
        m32001c();
        m31993k();
    }

    public void setDotSpacing(float f) {
        reset();
        this.f60923h = f;
        m32000d();
        m31993k();
    }

    public void setGrowthSpeed(int i) {
        reset();
        this.f60917b = i;
        m31993k();
    }

    public void setNumberOfDots(int i) {
        reset();
        this.f60919d = i;
        m31993k();
    }

    public boolean shouldAnimate() {
        return this.f60925j;
    }

    public void show() {
        show(500);
    }

    public void showNow() {
        show(0);
    }

    public void startAnimations() {
        this.f60925j = true;
        for (Animator animator : this.f60928m) {
            animator.start();
        }
    }

    public void stopAnimations() {
        this.f60925j = false;
        m31994j();
        for (Animator animator : this.f60928m) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (shouldAnimate()) {
            return this.f60927l.contains(drawable);
        }
        return super.verifyDrawable(drawable);
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void hide(int i) {
        this.f60926k = true;
        removeCallbacks(this.f60930o);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f60924i;
        long j2 = currentTimeMillis - j;
        long j3 = i;
        if (j2 >= j3 || j == -1) {
            this.f60929n.run();
            return;
        }
        long j4 = j3 - j2;
        if (j4 <= 0) {
            this.f60929n.run();
        } else {
            postDelayed(this.f60929n, j4);
        }
    }

    public void show(int i) {
        this.f60924i = -1L;
        this.f60926k = false;
        removeCallbacks(this.f60929n);
        if (i == 0) {
            this.f60930o.run();
        } else {
            postDelayed(this.f60930o, i);
        }
    }

    public DilatingDotsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60924i = -1L;
        this.f60926k = false;
        this.f60927l = new ArrayList();
        this.f60928m = new ArrayList();
        this.f60929n = new RunnableC10008a();
        this.f60930o = new RunnableC10009b();
        m31996h(attributeSet);
    }
}
