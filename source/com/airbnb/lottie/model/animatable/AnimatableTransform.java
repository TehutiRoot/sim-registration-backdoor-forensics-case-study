package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    /* renamed from: a */
    public final AnimatablePathValue f41312a;

    /* renamed from: b */
    public final AnimatableValue f41313b;

    /* renamed from: c */
    public final AnimatableScaleValue f41314c;

    /* renamed from: d */
    public final AnimatableFloatValue f41315d;

    /* renamed from: e */
    public final AnimatableIntegerValue f41316e;

    /* renamed from: f */
    public final AnimatableFloatValue f41317f;

    /* renamed from: g */
    public final AnimatableFloatValue f41318g;

    /* renamed from: h */
    public final AnimatableFloatValue f41319h;

    /* renamed from: i */
    public final AnimatableFloatValue f41320i;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public TransformKeyframeAnimation createAnimation() {
        return new TransformKeyframeAnimation(this);
    }

    @Nullable
    public AnimatablePathValue getAnchorPoint() {
        return this.f41312a;
    }

    @Nullable
    public AnimatableFloatValue getEndOpacity() {
        return this.f41320i;
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
        return this.f41316e;
    }

    @Nullable
    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f41313b;
    }

    @Nullable
    public AnimatableFloatValue getRotation() {
        return this.f41315d;
    }

    @Nullable
    public AnimatableScaleValue getScale() {
        return this.f41314c;
    }

    @Nullable
    public AnimatableFloatValue getSkew() {
        return this.f41317f;
    }

    @Nullable
    public AnimatableFloatValue getSkewAngle() {
        return this.f41318g;
    }

    @Nullable
    public AnimatableFloatValue getStartOpacity() {
        return this.f41319h;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.f41312a = animatablePathValue;
        this.f41313b = animatableValue;
        this.f41314c = animatableScaleValue;
        this.f41315d = animatableFloatValue;
        this.f41316e = animatableIntegerValue;
        this.f41319h = animatableFloatValue2;
        this.f41320i = animatableFloatValue3;
        this.f41317f = animatableFloatValue4;
        this.f41318g = animatableFloatValue5;
    }
}
