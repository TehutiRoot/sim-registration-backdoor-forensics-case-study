package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class MotionTiming {

    /* renamed from: a */
    public long f48953a;

    /* renamed from: b */
    public long f48954b;

    /* renamed from: c */
    public TimeInterpolator f48955c;

    /* renamed from: d */
    public int f48956d;

    /* renamed from: e */
    public int f48957e;

    public MotionTiming(long j, long j2) {
        this.f48955c = null;
        this.f48956d = 0;
        this.f48957e = 1;
        this.f48953a = j;
        this.f48954b = j2;
    }

    /* renamed from: a */
    public static MotionTiming m45958a(ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m45957b(valueAnimator));
        motionTiming.f48956d = valueAnimator.getRepeatCount();
        motionTiming.f48957e = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    /* renamed from: b */
    public static TimeInterpolator m45957b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            return interpolator;
        }
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() != motionTiming.getDelay() || getDuration() != motionTiming.getDuration() || getRepeatCount() != motionTiming.getRepeatCount() || getRepeatMode() != motionTiming.getRepeatMode()) {
            return false;
        }
        return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
    }

    public long getDelay() {
        return this.f48953a;
    }

    public long getDuration() {
        return this.f48954b;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f48955c;
        if (timeInterpolator == null) {
            return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        return timeInterpolator;
    }

    public int getRepeatCount() {
        return this.f48956d;
    }

    public int getRepeatMode() {
        return this.f48957e;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public MotionTiming(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f48956d = 0;
        this.f48957e = 1;
        this.f48953a = j;
        this.f48954b = j2;
        this.f48955c = timeInterpolator;
    }
}