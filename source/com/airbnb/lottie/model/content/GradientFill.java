package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class GradientFill implements ContentModel {

    /* renamed from: a */
    public final GradientType f41329a;

    /* renamed from: b */
    public final Path.FillType f41330b;

    /* renamed from: c */
    public final AnimatableGradientColorValue f41331c;

    /* renamed from: d */
    public final AnimatableIntegerValue f41332d;

    /* renamed from: e */
    public final AnimatablePointValue f41333e;

    /* renamed from: f */
    public final AnimatablePointValue f41334f;

    /* renamed from: g */
    public final String f41335g;

    /* renamed from: h */
    public final AnimatableFloatValue f41336h;

    /* renamed from: i */
    public final AnimatableFloatValue f41337i;

    /* renamed from: j */
    public final boolean f41338j;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f41329a = gradientType;
        this.f41330b = fillType;
        this.f41331c = animatableGradientColorValue;
        this.f41332d = animatableIntegerValue;
        this.f41333e = animatablePointValue;
        this.f41334f = animatablePointValue2;
        this.f41335g = str;
        this.f41336h = animatableFloatValue;
        this.f41337i = animatableFloatValue2;
        this.f41338j = z;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f41334f;
    }

    public Path.FillType getFillType() {
        return this.f41330b;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.f41331c;
    }

    public GradientType getGradientType() {
        return this.f41329a;
    }

    public String getName() {
        return this.f41335g;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f41332d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.f41333e;
    }

    public boolean isHidden() {
        return this.f41338j;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new GradientFillContent(lottieDrawable, lottieComposition, baseLayer, this);
    }
}
