package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* loaded from: classes3.dex */
public class PathKeyframe extends Keyframe<PointF> {

    /* renamed from: h */
    public Path f41188h;

    /* renamed from: i */
    public final Keyframe f41189i;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe<PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.f41189i = keyframe;
        createPath();
    }

    /* renamed from: a */
    public Path m50863a() {
        return this.f41188h;
    }

    public void createPath() {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3 = this.endValue;
        if (obj3 != null && (obj2 = this.startValue) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) {
            z = true;
        } else {
            z = false;
        }
        Object obj4 = this.startValue;
        if (obj4 != null && (obj = this.endValue) != null && !z) {
            Keyframe keyframe = this.f41189i;
            this.f41188h = Utils.createPath((PointF) obj4, (PointF) obj, keyframe.pathCp1, keyframe.pathCp2);
        }
    }
}
