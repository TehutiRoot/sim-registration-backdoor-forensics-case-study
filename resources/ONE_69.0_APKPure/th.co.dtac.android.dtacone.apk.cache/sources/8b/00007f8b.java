package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RoundedCornersContent;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class RoundedCorners implements ContentModel {

    /* renamed from: a */
    public final String f41392a;

    /* renamed from: b */
    public final AnimatableValue f41393b;

    public RoundedCorners(String str, AnimatableValue<Float, Float> animatableValue) {
        this.f41392a = str;
        this.f41393b = animatableValue;
    }

    public AnimatableValue<Float, Float> getCornerRadius() {
        return this.f41393b;
    }

    public String getName() {
        return this.f41392a;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RoundedCornersContent(lottieDrawable, baseLayer, this);
    }
}