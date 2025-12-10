package com.isseiaoki.simplecropview.animation;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ValueAnimatorV8 implements SimpleValueAnimator {

    /* renamed from: h */
    public static final int f58215h = Math.round(33.333332f);

    /* renamed from: a */
    public Interpolator f58216a;

    /* renamed from: b */
    public ScheduledExecutorService f58217b;

    /* renamed from: c */
    public long f58218c;

    /* renamed from: e */
    public long f58220e;

    /* renamed from: d */
    public boolean f58219d = false;

    /* renamed from: f */
    public SimpleValueAnimatorListener f58221f = new C9054a();

    /* renamed from: g */
    public final Runnable f58222g = new RunnableC9055b();

    /* renamed from: com.isseiaoki.simplecropview.animation.ValueAnimatorV8$a */
    /* loaded from: classes5.dex */
    public class C9054a implements SimpleValueAnimatorListener {
        public C9054a() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
        }
    }

    /* renamed from: com.isseiaoki.simplecropview.animation.ValueAnimatorV8$b */
    /* loaded from: classes5.dex */
    public class RunnableC9055b implements Runnable {
        public RunnableC9055b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            ValueAnimatorV8 valueAnimatorV8 = ValueAnimatorV8.this;
            long j = uptimeMillis - valueAnimatorV8.f58218c;
            if (j > valueAnimatorV8.f58220e) {
                valueAnimatorV8.f58219d = false;
                valueAnimatorV8.f58221f.onAnimationFinished();
                ValueAnimatorV8.this.f58217b.shutdown();
                return;
            }
            ValueAnimatorV8.this.f58221f.onAnimationUpdated(Math.min(valueAnimatorV8.f58216a.getInterpolation(((float) j) / ((float) ValueAnimatorV8.this.f58220e)), 1.0f));
        }
    }

    public ValueAnimatorV8(Interpolator interpolator) {
        this.f58216a = interpolator;
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void addAnimatorListener(SimpleValueAnimatorListener simpleValueAnimatorListener) {
        if (simpleValueAnimatorListener != null) {
            this.f58221f = simpleValueAnimatorListener;
        }
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void cancelAnimation() {
        this.f58219d = false;
        this.f58217b.shutdown();
        this.f58221f.onAnimationFinished();
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public boolean isAnimationStarted() {
        return this.f58219d;
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void startAnimation(long j) {
        if (j >= 0) {
            this.f58220e = j;
        } else {
            this.f58220e = 150L;
        }
        this.f58219d = true;
        this.f58221f.onAnimationStarted();
        this.f58218c = SystemClock.uptimeMillis();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f58217b = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(this.f58222g, 0L, f58215h, TimeUnit.MILLISECONDS);
    }
}