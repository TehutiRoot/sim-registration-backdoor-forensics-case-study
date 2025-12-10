package com.airbnb.lottie.utils;

/* loaded from: classes3.dex */
public class MeanCalculator {

    /* renamed from: a */
    public float f41610a;

    /* renamed from: b */
    public int f41611b;

    public void add(float f) {
        float f2 = this.f41610a + f;
        this.f41610a = f2;
        int i = this.f41611b + 1;
        this.f41611b = i;
        if (i == Integer.MAX_VALUE) {
            this.f41610a = f2 / 2.0f;
            this.f41611b = i / 2;
        }
    }

    public float getMean() {
        int i = this.f41611b;
        if (i == 0) {
            return 0.0f;
        }
        return this.f41610a / i;
    }
}
