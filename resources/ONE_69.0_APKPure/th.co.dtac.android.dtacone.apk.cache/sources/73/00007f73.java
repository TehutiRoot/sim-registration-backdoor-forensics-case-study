package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes3.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    public final List f41321a;

    public AnimatablePathValue(List<Keyframe<PointF>> list) {
        this.f41321a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        if (((Keyframe) this.f41321a.get(0)).isStatic()) {
            return new PointKeyframeAnimation(this.f41321a);
        }
        return new PathKeyframeAnimation(this.f41321a);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<PointF>> getKeyframes() {
        return this.f41321a;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        if (this.f41321a.size() != 1 || !((Keyframe) this.f41321a.get(0)).isStatic()) {
            return false;
        }
        return true;
    }
}