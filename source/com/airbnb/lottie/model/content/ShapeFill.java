package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class ShapeFill implements ContentModel {

    /* renamed from: a */
    public final boolean f41385a;

    /* renamed from: b */
    public final Path.FillType f41386b;

    /* renamed from: c */
    public final String f41387c;

    /* renamed from: d */
    public final AnimatableColorValue f41388d;

    /* renamed from: e */
    public final AnimatableIntegerValue f41389e;

    /* renamed from: f */
    public final boolean f41390f;

    public ShapeFill(String str, boolean z, Path.FillType fillType, @Nullable AnimatableColorValue animatableColorValue, @Nullable AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.f41387c = str;
        this.f41385a = z;
        this.f41386b = fillType;
        this.f41388d = animatableColorValue;
        this.f41389e = animatableIntegerValue;
        this.f41390f = z2;
    }

    @Nullable
    public AnimatableColorValue getColor() {
        return this.f41388d;
    }

    public Path.FillType getFillType() {
        return this.f41386b;
    }

    public String getName() {
        return this.f41387c;
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
        return this.f41389e;
    }

    public boolean isHidden() {
        return this.f41390f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f41385a + '}';
    }
}
