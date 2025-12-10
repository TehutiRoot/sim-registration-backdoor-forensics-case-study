package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientColorKeyframeAnimation extends AbstractC18114Nh0 {

    /* renamed from: g */
    public final GradientColor f41184g;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        GradientColor gradientColor = list.get(0).startValue;
        int size = gradientColor != null ? gradientColor.getSize() : 0;
        this.f41184g = new GradientColor(new float[size], new int[size]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: e */
    public GradientColor getValue(Keyframe keyframe, float f) {
        this.f41184g.lerp((GradientColor) keyframe.startValue, (GradientColor) keyframe.endValue, f);
        return this.f41184g;
    }
}
