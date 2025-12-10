package com.airbnb.lottie.compose;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", m28800f = "rememberLottieComposition.kt", m28799i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, m28798l = {125, WebSocketProtocol.PAYLOAD_SHORT, 127}, m28797m = "lottieComposition", m28796n = {CoreConstants.CONTEXT_SCOPE_VALUE, "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", CoreConstants.CONTEXT_SCOPE_VALUE, "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, m28795s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$lottieComposition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public RememberLottieCompositionKt$lottieComposition$1(Continuation<? super RememberLottieCompositionKt$lottieComposition$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m50810f;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m50810f = RememberLottieCompositionKt.m50810f(null, null, null, null, null, null, this);
        return m50810f;
    }
}
