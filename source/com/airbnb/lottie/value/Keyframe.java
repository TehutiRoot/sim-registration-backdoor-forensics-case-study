package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class Keyframe<T> {

    /* renamed from: a */
    public final LottieComposition f41618a;

    /* renamed from: b */
    public float f41619b;

    /* renamed from: c */
    public float f41620c;

    /* renamed from: d */
    public int f41621d;

    /* renamed from: e */
    public int f41622e;
    @Nullable
    public Float endFrame;
    @Nullable
    public T endValue;

    /* renamed from: f */
    public float f41623f;

    /* renamed from: g */
    public float f41624g;
    @Nullable
    public final Interpolator interpolator;
    public PointF pathCp1;
    public PointF pathCp2;
    public final float startFrame;
    @Nullable
    public final T startValue;
    @Nullable
    public final Interpolator xInterpolator;
    @Nullable
    public final Interpolator yInterpolator;

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f41619b = -3987645.8f;
        this.f41620c = -3987645.8f;
        this.f41621d = 784923401;
        this.f41622e = 784923401;
        this.f41623f = Float.MIN_VALUE;
        this.f41624g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f41618a = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public boolean containsProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        if (f >= getStartProgress() && f < getEndProgress()) {
            return true;
        }
        return false;
    }

    public Keyframe<T> copyWith(T t, T t2) {
        return new Keyframe<>(t, t2);
    }

    public float getEndProgress() {
        if (this.f41618a == null) {
            return 1.0f;
        }
        if (this.f41624g == Float.MIN_VALUE) {
            if (this.endFrame == null) {
                this.f41624g = 1.0f;
            } else {
                this.f41624g = getStartProgress() + ((this.endFrame.floatValue() - this.startFrame) / this.f41618a.getDurationFrames());
            }
        }
        return this.f41624g;
    }

    public float getEndValueFloat() {
        if (this.f41620c == -3987645.8f) {
            this.f41620c = ((Float) this.endValue).floatValue();
        }
        return this.f41620c;
    }

    public int getEndValueInt() {
        if (this.f41622e == 784923401) {
            this.f41622e = ((Integer) this.endValue).intValue();
        }
        return this.f41622e;
    }

    public float getStartProgress() {
        LottieComposition lottieComposition = this.f41618a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f41623f == Float.MIN_VALUE) {
            this.f41623f = (this.startFrame - lottieComposition.getStartFrame()) / this.f41618a.getDurationFrames();
        }
        return this.f41623f;
    }

    public float getStartValueFloat() {
        if (this.f41619b == -3987645.8f) {
            this.f41619b = ((Float) this.startValue).floatValue();
        }
        return this.f41619b;
    }

    public int getStartValueInt() {
        if (this.f41621d == 784923401) {
            this.f41621d = ((Integer) this.startValue).intValue();
        }
        return this.f41621d;
    }

    public boolean isStatic() {
        if (this.interpolator == null && this.xInterpolator == null && this.yInterpolator == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.startValue + ", endValue=" + this.endValue + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", interpolator=" + this.interpolator + '}';
    }

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f, @Nullable Float f2) {
        this.f41619b = -3987645.8f;
        this.f41620c = -3987645.8f;
        this.f41621d = 784923401;
        this.f41622e = 784923401;
        this.f41623f = Float.MIN_VALUE;
        this.f41624g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f41618a = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = null;
        this.xInterpolator = interpolator;
        this.yInterpolator = interpolator2;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f41619b = -3987645.8f;
        this.f41620c = -3987645.8f;
        this.f41621d = 784923401;
        this.f41622e = 784923401;
        this.f41623f = Float.MIN_VALUE;
        this.f41624g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f41618a = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator;
        this.xInterpolator = interpolator2;
        this.yInterpolator = interpolator3;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public Keyframe(T t) {
        this.f41619b = -3987645.8f;
        this.f41620c = -3987645.8f;
        this.f41621d = 784923401;
        this.f41622e = 784923401;
        this.f41623f = Float.MIN_VALUE;
        this.f41624g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f41618a = null;
        this.startValue = t;
        this.endValue = t;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Keyframe(Object obj, Object obj2) {
        this.f41619b = -3987645.8f;
        this.f41620c = -3987645.8f;
        this.f41621d = 784923401;
        this.f41622e = 784923401;
        this.f41623f = Float.MIN_VALUE;
        this.f41624g = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.f41618a = null;
        this.startValue = obj;
        this.endValue = obj2;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = Float.valueOf(Float.MAX_VALUE);
    }
}
