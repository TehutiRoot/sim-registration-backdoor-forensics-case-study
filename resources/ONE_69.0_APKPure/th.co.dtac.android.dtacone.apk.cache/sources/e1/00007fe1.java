package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes3.dex */
public class LottieInterpolatedPointValue extends AbstractC23090xn0 {

    /* renamed from: f */
    public final PointF f41644f;

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f41644f = new PointF();
    }

    @Override // p000.AbstractC23090xn0
    /* renamed from: b */
    public PointF mo480a(PointF pointF, PointF pointF2, float f) {
        this.f41644f.set(MiscUtils.lerp(pointF.x, pointF2.x, f), MiscUtils.lerp(pointF.y, pointF2.y, f));
        return this.f41644f;
    }

    @Override // p000.AbstractC23090xn0, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedPointValue(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f41644f = new PointF();
    }
}