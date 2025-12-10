package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", m28800f = "rememberLottieComposition.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {
    int label;

    public RememberLottieCompositionKt$rememberLottieComposition$1(Continuation<? super RememberLottieCompositionKt$rememberLottieComposition$1> continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(int i, @NotNull Throwable th2, @Nullable Continuation<? super Boolean> continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th2, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), th2, continuation);
    }
}
