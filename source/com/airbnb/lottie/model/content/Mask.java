package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* loaded from: classes3.dex */
public class Mask {

    /* renamed from: a */
    public final MaskMode f41352a;

    /* renamed from: b */
    public final AnimatableShapeValue f41353b;

    /* renamed from: c */
    public final AnimatableIntegerValue f41354c;

    /* renamed from: d */
    public final boolean f41355d;

    /* loaded from: classes3.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.f41352a = maskMode;
        this.f41353b = animatableShapeValue;
        this.f41354c = animatableIntegerValue;
        this.f41355d = z;
    }

    public MaskMode getMaskMode() {
        return this.f41352a;
    }

    public AnimatableShapeValue getMaskPath() {
        return this.f41353b;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f41354c;
    }

    public boolean isInverted() {
        return this.f41355d;
    }
}
