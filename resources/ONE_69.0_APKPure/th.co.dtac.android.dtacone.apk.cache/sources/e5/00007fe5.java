package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* loaded from: classes3.dex */
public class LottieValueCallback<T> {

    /* renamed from: a */
    public final LottieFrameInfo f41646a;

    /* renamed from: b */
    public BaseKeyframeAnimation f41647b;
    @Nullable
    protected T value;

    public LottieValueCallback() {
        this.f41646a = new LottieFrameInfo();
        this.value = null;
    }

    @Nullable
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.f41646a.set(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.f41647b = baseKeyframeAnimation;
    }

    public final void setValue(@Nullable T t) {
        this.value = t;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41647b;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public LottieValueCallback(@Nullable T t) {
        this.f41646a = new LottieFrameInfo();
        this.value = t;
    }
}