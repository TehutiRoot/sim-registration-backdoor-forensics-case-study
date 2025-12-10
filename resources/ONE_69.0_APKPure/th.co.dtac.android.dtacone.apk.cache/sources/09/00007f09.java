package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PathKeyframeAnimation extends AbstractC18540Th0 {

    /* renamed from: g */
    public final PointF f41202g;

    /* renamed from: h */
    public final float[] f41203h;

    /* renamed from: i */
    public final PathMeasure f41204i;

    /* renamed from: j */
    public PathKeyframe f41205j;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f41202g = new PointF();
        this.f41203h = new float[2];
        this.f41204i = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<PointF>) keyframe, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f) {
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path m50860a = pathKeyframe.m50860a();
        if (m50860a == null) {
            return keyframe.startValue;
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback == 0 || (pointF = (PointF) lottieValueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), (PointF) pathKeyframe.startValue, (PointF) pathKeyframe.endValue, m50874b(), f, getProgress())) == null) {
            if (this.f41205j != pathKeyframe) {
                this.f41204i.setPath(m50860a, false);
                this.f41205j = pathKeyframe;
            }
            PathMeasure pathMeasure = this.f41204i;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f41203h, null);
            PointF pointF2 = this.f41202g;
            float[] fArr = this.f41203h;
            pointF2.set(fArr[0], fArr[1]);
            return this.f41202g;
        }
        return pointF;
    }
}