package com.airbnb.lottie.utils;

/* loaded from: classes3.dex */
public class MeanCalculator {

    /* renamed from: a */
    public float f41622a;

    /* renamed from: b */
    public int f41623b;

    public void add(float f) {
        float f2 = this.f41622a + f;
        this.f41622a = f2;
        int i = this.f41623b + 1;
        this.f41623b = i;
        if (i == Integer.MAX_VALUE) {
            this.f41622a = f2 / 2.0f;
            this.f41623b = i / 2;
        }
    }

    public float getMean() {
        int i = this.f41623b;
        if (i == 0) {
            return 0.0f;
        }
        return this.f41622a / i;
    }
}