package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RepeaterContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class Repeater implements ContentModel {

    /* renamed from: a */
    public final String f41375a;

    /* renamed from: b */
    public final AnimatableFloatValue f41376b;

    /* renamed from: c */
    public final AnimatableFloatValue f41377c;

    /* renamed from: d */
    public final AnimatableTransform f41378d;

    /* renamed from: e */
    public final boolean f41379e;

    public Repeater(String str, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableTransform animatableTransform, boolean z) {
        this.f41375a = str;
        this.f41376b = animatableFloatValue;
        this.f41377c = animatableFloatValue2;
        this.f41378d = animatableTransform;
        this.f41379e = z;
    }

    public AnimatableFloatValue getCopies() {
        return this.f41376b;
    }

    public String getName() {
        return this.f41375a;
    }

    public AnimatableFloatValue getOffset() {
        return this.f41377c;
    }

    public AnimatableTransform getTransform() {
        return this.f41378d;
    }

    public boolean isHidden() {
        return this.f41379e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RepeaterContent(lottieDrawable, baseLayer, this);
    }
}
