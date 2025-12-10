package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
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
        float m50822c;
        m50822c = LottieAnimationKt.m50822c(this.$progress$delegate);
        return Float.valueOf(m50822c);
    }
}
