package com.isseiaoki.simplecropview.animation;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ValueAnimatorV8 implements SimpleValueAnimator {

    /* renamed from: h */
    public static final int f58203h = Math.round(33.333332f);

    /* renamed from: a */
    public Interpolator f58204a;

    /* renamed from: b */
    public ScheduledExecutorService f58205b;

    /* renamed from: c */
    public long f58206c;

    /* renamed from: e */
    public long f58208e;

    /* renamed from: d */
    public boolean f58207d = false;

    /* renamed from: f */
    public SimpleValueAnimatorListener f58209f = new C9065a();

    /* renamed from: g */
    public final Runnable f58210g = new RunnableC9066b();

    /* renamed from: com.isseiaoki.simplecropview.animation.ValueAnimatorV8$a */
    /* loaded from: classes5.dex */
    public class C9065a implements SimpleValueAnimatorListener {
        public C9065a() {
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
    public class RunnableC9066b implements Runnable {
        public RunnableC9066b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            ValueAnimatorV8 valueAnimatorV8 = ValueAnimatorV8.this;
            long j = uptimeMillis - valueAnimatorV8.f58206c;
            if (j > valueAnimatorV8.f58208e) {
                valueAnimatorV8.f58207d = false;
                valueAnimatorV8.f58209f.onAnimationFinished();
                ValueAnimatorV8.this.f58205b.shutdown();
                return;
            }
            ValueAnimatorV8.this.f58209f.onAnimationUpdated(Math.min(valueAnimatorV8.f58204a.getInterpolation(((float) j) / ((float) ValueAnimatorV8.this.f58208e)), 1.0f));
        }
    }

    public ValueAnimatorV8(Interpolator interpolator) {
        this.f58204a = interpolator;
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void addAnimatorListener(SimpleValueAnimatorListener simpleValueAnimatorListener) {
        if (simpleValueAnimatorListener != null) {
            this.f58209f = simpleValueAnimatorListener;
        }
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void cancelAnimation() {
        this.f58207d = false;
        this.f58205b.shutdown();
        this.f58209f.onAnimationFinished();
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public boolean isAnimationStarted() {
        return this.f58207d;
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void startAnimation(long j) {
        if (j >= 0) {
            this.f58208e = j;
        } else {
            this.f58208e = 150L;
        }
        this.f58207d = true;
        this.f58209f.onAnimationStarted();
        this.f58206c = SystemClock.uptimeMillis();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f58205b = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(this.f58210g, 0L, f58203h, TimeUnit.MILLISECONDS);
    }
}
