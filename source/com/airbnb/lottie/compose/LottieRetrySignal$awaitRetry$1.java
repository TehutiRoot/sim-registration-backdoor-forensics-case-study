package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.airbnb.lottie.compose.LottieRetrySignal", m28800f = "LottieRetrySignal.kt", m28799i = {0}, m28798l = {45}, m28797m = "awaitRetry", m28796n = {"this"}, m28795s = {"L$0"})
/* loaded from: classes3.dex */
public final class LottieRetrySignal$awaitRetry$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LottieRetrySignal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRetrySignal$awaitRetry$1(LottieRetrySignal lottieRetrySignal, Continuation<? super LottieRetrySignal$awaitRetry$1> continuation) {
        super(continuation);
        this.this$0 = lottieRetrySignal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitRetry(this);
    }
}
