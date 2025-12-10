package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: classes3.dex */
public class GradientStroke implements ContentModel {

    /* renamed from: a */
    public final String f41339a;

    /* renamed from: b */
    public final GradientType f41340b;

    /* renamed from: c */
    public final AnimatableGradientColorValue f41341c;

    /* renamed from: d */
    public final AnimatableIntegerValue f41342d;

    /* renamed from: e */
    public final AnimatablePointValue f41343e;

    /* renamed from: f */
    public final AnimatablePointValue f41344f;

    /* renamed from: g */
    public final AnimatableFloatValue f41345g;

    /* renamed from: h */
    public final ShapeStroke.LineCapType f41346h;

    /* renamed from: i */
    public final ShapeStroke.LineJoinType f41347i;

    /* renamed from: j */
    public final float f41348j;

    /* renamed from: k */
    public final List f41349k;

    /* renamed from: l */
    public final AnimatableFloatValue f41350l;

    /* renamed from: m */
    public final boolean f41351m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<AnimatableFloatValue> list, @Nullable AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f41339a = str;
        this.f41340b = gradientType;
        this.f41341c = animatableGradientColorValue;
        this.f41342d = animatableIntegerValue;
        this.f41343e = animatablePointValue;
        this.f41344f = animatablePointValue2;
        this.f41345g = animatableFloatValue;
        this.f41346h = lineCapType;
        this.f41347i = lineJoinType;
        this.f41348j = f;
        this.f41349k = list;
        this.f41350l = animatableFloatValue2;
        this.f41351m = z;
    }

    public ShapeStroke.LineCapType getCapType() {
        return this.f41346h;
    }

    @Nullable
    public AnimatableFloatValue getDashOffset() {
        return this.f41350l;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f41344f;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.f41341c;
    }

    public GradientType getGradientType() {
        return this.f41340b;
    }

    public ShapeStroke.LineJoinType getJoinType() {
        return this.f41347i;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.f41349k;
    }

    public float getMiterLimit() {
        return this.f41348j;
    }

    public String getName() {
        return this.f41339a;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f41342d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.f41343e;
    }

    public AnimatableFloatValue getWidth() {
        return this.f41345g;
    }

    public boolean isHidden() {
        return this.f41351m;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}
