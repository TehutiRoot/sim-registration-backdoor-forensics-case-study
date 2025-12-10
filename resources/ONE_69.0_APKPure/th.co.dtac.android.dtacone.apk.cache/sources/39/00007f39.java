package com.airbnb.lottie.compose;

import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m29142d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, m29141k = 2, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitOrNull(@org.jetbrains.annotations.NotNull com.airbnb.lottie.compose.LottieCompositionResult r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> r5) {
        /*
            boolean r0 = r5 instanceof com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 r0 = (com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 r0 = new com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L40
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r5 = r4.await(r0)     // Catch: java.lang.Throwable -> L40
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.airbnb.lottie.LottieComposition r5 = (com.airbnb.lottie.LottieComposition) r5     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r5 = 0
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieCompositionResultKt.awaitOrNull(com.airbnb.lottie.compose.LottieCompositionResult, kotlin.coroutines.Continuation):java.lang.Object");
    }
}