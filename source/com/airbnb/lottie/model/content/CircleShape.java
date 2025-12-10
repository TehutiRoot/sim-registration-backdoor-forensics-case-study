package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class CircleShape implements ContentModel {

    /* renamed from: a */
    public final String f41322a;

    /* renamed from: b */
    public final AnimatableValue f41323b;

    /* renamed from: c */
    public final AnimatablePointValue f41324c;

    /* renamed from: d */
    public final boolean f41325d;

    /* renamed from: e */
    public final boolean f41326e;

    public CircleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.f41322a = str;
        this.f41323b = animatableValue;
        this.f41324c = animatablePointValue;
        this.f41325d = z;
        this.f41326e = z2;
    }

    public String getName() {
        return this.f41322a;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f41323b;
    }

    public AnimatablePointValue getSize() {
        return this.f41324c;
    }

    public boolean isHidden() {
        return this.f41326e;
    }

    public boolean isReversed() {
        return this.f41325d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}
