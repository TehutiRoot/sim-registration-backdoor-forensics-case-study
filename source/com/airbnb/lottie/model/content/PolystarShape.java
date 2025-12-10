package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes3.dex */
public class PolystarShape implements ContentModel {

    /* renamed from: a */
    public final String f41359a;

    /* renamed from: b */
    public final Type f41360b;

    /* renamed from: c */
    public final AnimatableFloatValue f41361c;

    /* renamed from: d */
    public final AnimatableValue f41362d;

    /* renamed from: e */
    public final AnimatableFloatValue f41363e;

    /* renamed from: f */
    public final AnimatableFloatValue f41364f;

    /* renamed from: g */
    public final AnimatableFloatValue f41365g;

    /* renamed from: h */
    public final AnimatableFloatValue f41366h;

    /* renamed from: i */
    public final AnimatableFloatValue f41367i;

    /* renamed from: j */
    public final boolean f41368j;

    /* renamed from: k */
    public final boolean f41369k;

    /* loaded from: classes3.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z, boolean z2) {
        this.f41359a = str;
        this.f41360b = type;
        this.f41361c = animatableFloatValue;
        this.f41362d = animatableValue;
        this.f41363e = animatableFloatValue2;
        this.f41364f = animatableFloatValue3;
        this.f41365g = animatableFloatValue4;
        this.f41366h = animatableFloatValue5;
        this.f41367i = animatableFloatValue6;
        this.f41368j = z;
        this.f41369k = z2;
    }

    public AnimatableFloatValue getInnerRadius() {
        return this.f41364f;
    }

    public AnimatableFloatValue getInnerRoundedness() {
        return this.f41366h;
    }

    public String getName() {
        return this.f41359a;
    }

    public AnimatableFloatValue getOuterRadius() {
        return this.f41365g;
    }

    public AnimatableFloatValue getOuterRoundedness() {
        return this.f41367i;
    }

    public AnimatableFloatValue getPoints() {
        return this.f41361c;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.f41362d;
    }

    public AnimatableFloatValue getRotation() {
        return this.f41363e;
    }

    public Type getType() {
        return this.f41360b;
    }

    public boolean isHidden() {
        return this.f41368j;
    }

    public boolean isReversed() {
        return this.f41369k;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
