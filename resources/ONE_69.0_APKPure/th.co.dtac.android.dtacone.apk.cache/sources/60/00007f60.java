package com.airbnb.lottie.compose;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", m29092f = "rememberLottieComposition.kt", m29091i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, m29090l = {125, WebSocketProtocol.PAYLOAD_SHORT, 127}, m29089m = "lottieComposition", m29088n = {CoreConstants.CONTEXT_SCOPE_VALUE, "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", CoreConstants.CONTEXT_SCOPE_VALUE, "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, m29087s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
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
        Object m50807f;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m50807f = RememberLottieCompositionKt.m50807f(null, null, null, null, null, null, this);
        return m50807f;
    }
}