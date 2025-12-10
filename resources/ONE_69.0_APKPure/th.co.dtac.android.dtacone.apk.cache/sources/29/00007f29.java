package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationKt$LottieAnimation$6$1 extends Lambda implements Function0<Float> {
    final /* synthetic */ LottieAnimationState $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationKt$LottieAnimation$6$1(LottieAnimationState lottieAnimationState) {
        super(0);
        this.$progress$delegate = lottieAnimationState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        float m50819c;
        m50819c = LottieAnimationKt.m50819c(this.$progress$delegate);
        return Float.valueOf(m50819c);
    }
}