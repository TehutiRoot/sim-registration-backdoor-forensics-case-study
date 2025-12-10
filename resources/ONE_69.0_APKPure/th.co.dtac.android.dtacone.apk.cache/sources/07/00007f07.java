package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MaskKeyframeAnimation {

    /* renamed from: a */
    public final List f41197a;

    /* renamed from: b */
    public final List f41198b;

    /* renamed from: c */
    public final List f41199c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f41199c = list;
        this.f41197a = new ArrayList(list.size());
        this.f41198b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f41197a.add(list.get(i).getMaskPath().createAnimation());
            this.f41198b.add(list.get(i).getOpacity().createAnimation());
        }
    }

    public List<BaseKeyframeAnimation<ShapeData, Path>> getMaskAnimations() {
        return this.f41197a;
    }

    public List<Mask> getMasks() {
        return this.f41199c;
    }

    public List<BaseKeyframeAnimation<Integer, Integer>> getOpacityAnimations() {
        return this.f41198b;
    }
}