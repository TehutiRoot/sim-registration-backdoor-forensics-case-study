package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PathKeyframeAnimation extends AbstractC18114Nh0 {

    /* renamed from: g */
    public final PointF f41190g;

    /* renamed from: h */
    public final float[] f41191h;

    /* renamed from: i */
    public final PathMeasure f41192i;

    /* renamed from: j */
    public PathKeyframe f41193j;

    public PathKeyframeAnimation(List<? extends Keyframe<PointF>> list) {
        super(list);
        this.f41190g = new PointF();
        this.f41191h = new float[2];
        this.f41192i = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<PointF>) keyframe, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public PointF getValue(Keyframe<PointF> keyframe, float f) {
        PointF pointF;
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path m50863a = pathKeyframe.m50863a();
        if (m50863a == null) {
            return keyframe.startValue;
        }
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback == 0 || (pointF = (PointF) lottieValueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), (PointF) pathKeyframe.startValue, (PointF) pathKeyframe.endValue, m50877b(), f, getProgress())) == null) {
            if (this.f41193j != pathKeyframe) {
                this.f41192i.setPath(m50863a, false);
                this.f41193j = pathKeyframe;
            }
            PathMeasure pathMeasure = this.f41192i;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f41191h, null);
            PointF pointF2 = this.f41190g;
            float[] fArr = this.f41191h;
            pointF2.set(fArr[0], fArr[1]);
            return this.f41190g;
        }
        return pointF;
    }
}
