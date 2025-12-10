package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public class LottieFrameInfo<T> {

    /* renamed from: a */
    public float f41637a;

    /* renamed from: b */
    public float f41638b;

    /* renamed from: c */
    public Object f41639c;

    /* renamed from: d */
    public Object f41640d;

    /* renamed from: e */
    public float f41641e;

    /* renamed from: f */
    public float f41642f;

    /* renamed from: g */
    public float f41643g;

    public float getEndFrame() {
        return this.f41638b;
    }

    public T getEndValue() {
        return (T) this.f41640d;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.f41642f;
    }

    public float getLinearKeyframeProgress() {
        return this.f41641e;
    }

    public float getOverallProgress() {
        return this.f41643g;
    }

    public float getStartFrame() {
        return this.f41637a;
    }

    public T getStartValue() {
        return (T) this.f41639c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieFrameInfo<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.f41637a = f;
        this.f41638b = f2;
        this.f41639c = t;
        this.f41640d = t2;
        this.f41641e = f3;
        this.f41642f = f4;
        this.f41643g = f5;
        return this;
    }
}