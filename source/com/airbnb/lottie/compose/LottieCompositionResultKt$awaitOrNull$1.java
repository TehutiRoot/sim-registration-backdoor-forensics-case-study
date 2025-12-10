package com.airbnb.lottie.compose;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.airbnb.lottie.compose.LottieCompositionResultKt", m28800f = "LottieCompositionResult.kt", m28799i = {}, m28798l = {CustomerEnquiry700MhzFragment.hiddenSubProdHeight}, m28797m = "awaitOrNull", m28796n = {}, m28795s = {})
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt$awaitOrNull$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public LottieCompositionResultKt$awaitOrNull$1(Continuation<? super LottieCompositionResultKt$awaitOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LottieCompositionResultKt.awaitOrNull(null, this);
    }
}
