package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class ShapePath implements ContentModel {

    /* renamed from: a */
    public final String f41394a;

    /* renamed from: b */
    public final int f41395b;

    /* renamed from: c */
    public final AnimatableShapeValue f41396c;

    /* renamed from: d */
    public final boolean f41397d;

    public ShapePath(String str, int i, AnimatableShapeValue animatableShapeValue, boolean z) {
        this.f41394a = str;
        this.f41395b = i;
        this.f41396c = animatableShapeValue;
        this.f41397d = z;
    }

    public String getName() {
        return this.f41394a;
    }

    public AnimatableShapeValue getShapePath() {
        return this.f41396c;
    }

    public boolean isHidden() {
        return this.f41397d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.f41394a + ", index=" + this.f41395b + '}';
    }
}
