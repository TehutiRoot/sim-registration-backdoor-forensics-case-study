package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {

    /* renamed from: a */
    public final String f41156a;

    /* renamed from: b */
    public final boolean f41157b;

    /* renamed from: c */
    public final List f41158c = new ArrayList();

    /* renamed from: d */
    public final ShapeTrimPath.Type f41159d;

    /* renamed from: e */
    public final BaseKeyframeAnimation f41160e;

    /* renamed from: f */
    public final BaseKeyframeAnimation f41161f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41162g;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
        this.f41156a = shapeTrimPath.getName();
        this.f41157b = shapeTrimPath.isHidden();
        this.f41159d = shapeTrimPath.getType();
        BaseKeyframeAnimation<Float, Float> createAnimation = shapeTrimPath.getStart().createAnimation();
        this.f41160e = createAnimation;
        BaseKeyframeAnimation<Float, Float> createAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.f41161f = createAnimation2;
        BaseKeyframeAnimation<Float, Float> createAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.f41162g = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    /* renamed from: a */
    public void m50879a(BaseKeyframeAnimation.AnimationListener animationListener) {
        this.f41158c.add(animationListener);
    }

    /* renamed from: b */
    public ShapeTrimPath.Type m50878b() {
        return this.f41159d;
    }

    public BaseKeyframeAnimation<?, Float> getEnd() {
        return this.f41161f;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41156a;
    }

    public BaseKeyframeAnimation<?, Float> getOffset() {
        return this.f41162g;
    }

    public BaseKeyframeAnimation<?, Float> getStart() {
        return this.f41160e;
    }

    public boolean isHidden() {
        return this.f41157b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.f41158c.size(); i++) {
            ((BaseKeyframeAnimation.AnimationListener) this.f41158c.get(i)).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
