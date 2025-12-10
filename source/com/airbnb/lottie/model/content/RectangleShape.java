package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RectangleContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class RectangleShape implements ContentModel {

    /* renamed from: a */
    public final String f41370a;

    /* renamed from: b */
    public final AnimatableValue f41371b;

    /* renamed from: c */
    public final AnimatableValue f41372c;

    /* renamed from: d */
    public final AnimatableFloatValue f41373d;

    /* renamed from: e */
    public final boolean f41374e;

    public RectangleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatableValue<PointF, PointF> animatableValue2, AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f41370a = str;
        this.f41371b = animatableValue;
        this.f41372c = animatableValue2;
        this.f41373d = animatableFloatValue;
        this.f41374e = z;
    }

    public AnimatableFloatValue getCornerRadius() {
        return this.f41373d;
    }

    public String getName() {
        return this.f41370a;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f41371b;
    }

    public AnimatableValue<PointF, PointF> getSize() {
        return this.f41372c;
    }

    public boolean isHidden() {
        return this.f41374e;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new RectangleContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.f41371b + ", size=" + this.f41372c + '}';
    }
}
