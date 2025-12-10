package kotlinx.coroutines.future;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28850d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "value", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class FutureKt$asDeferred$2 extends Lambda implements Function2<T, Throwable, Object> {
    final /* synthetic */ CompletableDeferred<T> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asDeferred$2(CompletableDeferred<T> completableDeferred) {
        super(2);
        this.$result = completableDeferred;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2) {
        return invoke2((FutureKt$asDeferred$2) obj, th2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = r0.getCause();
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke2(T r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            if (r3 != 0) goto Lb
            kotlinx.coroutines.CompletableDeferred<T> r3 = r1.$result     // Catch: java.lang.Throwable -> L9
            boolean r2 = r3.complete(r2)     // Catch: java.lang.Throwable -> L9
            goto L27
        L9:
            r2 = move-exception
            goto L2c
        Lb:
            kotlinx.coroutines.CompletableDeferred<T> r2 = r1.$result     // Catch: java.lang.Throwable -> L9
            boolean r0 = p000.AbstractC12185ky.m26580a(r3)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L18
            java.util.concurrent.CompletionException r0 = p000.AbstractC12254ly.m26393a(r3)     // Catch: java.lang.Throwable -> L9
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L23
            java.lang.Throwable r0 = p000.AbstractC12326my.m26173a(r0)     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L22
            goto L23
        L22:
            r3 = r0
        L23:
            boolean r2 = r2.completeExceptionally(r3)     // Catch: java.lang.Throwable -> L9
        L27:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L9
            goto L33
        L2c:
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.future.FutureKt$asDeferred$2.invoke2(java.lang.Object, java.lang.Throwable):java.lang.Object");
    }
}
