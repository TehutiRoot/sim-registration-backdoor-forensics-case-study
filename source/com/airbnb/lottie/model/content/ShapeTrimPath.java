package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class ShapeTrimPath implements ContentModel {

    /* renamed from: a */
    public final String f41410a;

    /* renamed from: b */
    public final Type f41411b;

    /* renamed from: c */
    public final AnimatableFloatValue f41412c;

    /* renamed from: d */
    public final AnimatableFloatValue f41413d;

    /* renamed from: e */
    public final AnimatableFloatValue f41414e;

    /* renamed from: f */
    public final boolean f41415f;

    /* loaded from: classes3.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.f41410a = str;
        this.f41411b = type;
        this.f41412c = animatableFloatValue;
        this.f41413d = animatableFloatValue2;
        this.f41414e = animatableFloatValue3;
        this.f41415f = z;
    }

    public AnimatableFloatValue getEnd() {
        return this.f41413d;
    }

    public String getName() {
        return this.f41410a;
    }

    public AnimatableFloatValue getOffset() {
        return this.f41414e;
    }

    public AnimatableFloatValue getStart() {
        return this.f41412c;
    }

    public Type getType() {
        return this.f41411b;
    }

    public boolean isHidden() {
        return this.f41415f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f41412c + ", end: " + this.f41413d + ", offset: " + this.f41414e + "}";
    }
}
