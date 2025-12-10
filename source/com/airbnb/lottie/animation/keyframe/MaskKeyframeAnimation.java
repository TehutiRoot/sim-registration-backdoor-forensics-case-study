package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MaskKeyframeAnimation {

    /* renamed from: a */
    public final List f41185a;

    /* renamed from: b */
    public final List f41186b;

    /* renamed from: c */
    public final List f41187c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f41187c = list;
        this.f41185a = new ArrayList(list.size());
        this.f41186b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f41185a.add(list.get(i).getMaskPath().createAnimation());
            this.f41186b.add(list.get(i).getOpacity().createAnimation());
        }
    }

    public List<BaseKeyframeAnimation<ShapeData, Path>> getMaskAnimations() {
        return this.f41185a;
    }

    public List<Mask> getMasks() {
        return this.f41187c;
    }

    public List<BaseKeyframeAnimation<Integer, Integer>> getOpacityAnimations() {
        return this.f41186b;
    }
}
