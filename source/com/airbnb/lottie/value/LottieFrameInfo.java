package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public class LottieFrameInfo<T> {

    /* renamed from: a */
    public float f41625a;

    /* renamed from: b */
    public float f41626b;

    /* renamed from: c */
    public Object f41627c;

    /* renamed from: d */
    public Object f41628d;

    /* renamed from: e */
    public float f41629e;

    /* renamed from: f */
    public float f41630f;

    /* renamed from: g */
    public float f41631g;

    public float getEndFrame() {
        return this.f41626b;
    }

    public T getEndValue() {
        return (T) this.f41628d;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.f41630f;
    }

    public float getLinearKeyframeProgress() {
        return this.f41629e;
    }

    public float getOverallProgress() {
        return this.f41631g;
    }

    public float getStartFrame() {
        return this.f41625a;
    }

    public T getStartValue() {
        return (T) this.f41627c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieFrameInfo<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.f41625a = f;
        this.f41626b = f2;
        this.f41627c = t;
        this.f41628d = t2;
        this.f41629e = f3;
        this.f41630f = f4;
        this.f41631g = f5;
        return this;
    }
}
