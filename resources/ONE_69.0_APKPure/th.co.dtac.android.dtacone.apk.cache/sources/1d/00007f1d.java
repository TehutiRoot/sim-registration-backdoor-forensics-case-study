package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableImpl$doFrame$3 extends Lambda implements Function1<Long, Boolean> {
    final /* synthetic */ int $iterations;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$doFrame$3(LottieAnimatableImpl lottieAnimatableImpl, int i) {
        super(1);
        this.this$0 = lottieAnimatableImpl;
        this.$iterations = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
        return invoke(l.longValue());
    }

    @NotNull
    public final Boolean invoke(long j) {
        boolean m50831r;
        m50831r = this.this$0.m50831r(this.$iterations, j);
        return Boolean.valueOf(m50831r);
    }
}