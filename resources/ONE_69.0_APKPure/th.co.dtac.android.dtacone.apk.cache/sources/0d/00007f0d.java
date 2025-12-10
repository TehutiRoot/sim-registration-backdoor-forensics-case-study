package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

/* loaded from: classes3.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* renamed from: g */
    public final PointF f41211g;

    /* renamed from: h */
    public final PointF f41212h;

    /* renamed from: i */
    public final BaseKeyframeAnimation f41213i;

    /* renamed from: j */
    public final BaseKeyframeAnimation f41214j;
    @Nullable
    protected LottieValueCallback<Float> xValueCallback;
    @Nullable
    protected LottieValueCallback<Float> yValueCallback;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f41211g = new PointF();
        this.f41212h = new PointF();
        this.f41213i = baseKeyframeAnimation;
        this.f41214j = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.f41213i.setProgress(f);
        this.f41214j.setProgress(f);
        this.f41211g.set(((Float) this.f41213i.getValue()).floatValue(), ((Float) this.f41214j.getValue()).floatValue());
        for (int i = 0; i < this.f41175a.size(); i++) {
            ((BaseKeyframeAnimation.AnimationListener) this.f41175a.get(i)).onValueChanged();
        }
    }

    public void setXValueCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.xValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.xValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public void setYValueCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.yValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue() {
        return getValue((Keyframe) null, 0.0f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe keyframe, float f) {
        Float f2;
        Keyframe currentKeyframe;
        Keyframe currentKeyframe2;
        Float f3 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = this.f41213i.getCurrentKeyframe()) == null) {
            f2 = null;
        } else {
            float interpolatedCurrentKeyframeProgress = this.f41213i.getInterpolatedCurrentKeyframeProgress();
            Float f4 = currentKeyframe2.endFrame;
            LottieValueCallback<Float> lottieValueCallback = this.xValueCallback;
            float f5 = currentKeyframe2.startFrame;
            f2 = lottieValueCallback.getValueInternal(f5, f4 == null ? f5 : f4.floatValue(), (Float) currentKeyframe2.startValue, (Float) currentKeyframe2.endValue, f, f, interpolatedCurrentKeyframeProgress);
        }
        if (this.yValueCallback != null && (currentKeyframe = this.f41214j.getCurrentKeyframe()) != null) {
            float interpolatedCurrentKeyframeProgress2 = this.f41214j.getInterpolatedCurrentKeyframeProgress();
            Float f6 = currentKeyframe.endFrame;
            LottieValueCallback<Float> lottieValueCallback2 = this.yValueCallback;
            float f7 = currentKeyframe.startFrame;
            f3 = lottieValueCallback2.getValueInternal(f7, f6 == null ? f7 : f6.floatValue(), (Float) currentKeyframe.startValue, (Float) currentKeyframe.endValue, f, f, interpolatedCurrentKeyframeProgress2);
        }
        if (f2 == null) {
            this.f41212h.set(this.f41211g.x, 0.0f);
        } else {
            this.f41212h.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f41212h;
            pointF.set(pointF.x, this.f41211g.y);
        } else {
            PointF pointF2 = this.f41212h;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f41212h;
    }
}