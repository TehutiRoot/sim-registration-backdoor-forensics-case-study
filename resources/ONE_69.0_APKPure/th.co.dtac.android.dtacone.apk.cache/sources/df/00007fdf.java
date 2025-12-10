package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes3.dex */
public class LottieInterpolatedFloatValue extends AbstractC23090xn0 {
    public LottieInterpolatedFloatValue(Float f, Float f2) {
        super(f, f2);
    }

    @Override // p000.AbstractC23090xn0
    /* renamed from: b */
    public Float mo480a(Float f, Float f2, float f3) {
        return Float.valueOf(MiscUtils.lerp(f.floatValue(), f2.floatValue(), f3));
    }

    @Override // p000.AbstractC23090xn0, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedFloatValue(Float f, Float f2, Interpolator interpolator) {
        super(f, f2, interpolator);
    }
}