package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* loaded from: classes3.dex */
public class DropShadowEffect {

    /* renamed from: a */
    public final AnimatableColorValue f41530a;

    /* renamed from: b */
    public final AnimatableFloatValue f41531b;

    /* renamed from: c */
    public final AnimatableFloatValue f41532c;

    /* renamed from: d */
    public final AnimatableFloatValue f41533d;

    /* renamed from: e */
    public final AnimatableFloatValue f41534e;

    public DropShadowEffect(AnimatableColorValue animatableColorValue, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4) {
        this.f41530a = animatableColorValue;
        this.f41531b = animatableFloatValue;
        this.f41532c = animatableFloatValue2;
        this.f41533d = animatableFloatValue3;
        this.f41534e = animatableFloatValue4;
    }

    public AnimatableColorValue getColor() {
        return this.f41530a;
    }

    public AnimatableFloatValue getDirection() {
        return this.f41532c;
    }

    public AnimatableFloatValue getDistance() {
        return this.f41533d;
    }

    public AnimatableFloatValue getOpacity() {
        return this.f41531b;
    }

    public AnimatableFloatValue getRadius() {
        return this.f41534e;
    }
}
