package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelsKt;

@Stable
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "<init>", "()V", "", "retry", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/channels/Channel;", "channel", "", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "isAwaitingRetry", "()Z", "(Z)V", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieRetrySignal {

    /* renamed from: a */
    public final Channel f41285a = ChannelKt.Channel$default(1, BufferOverflow.DROP_OLDEST, null, 4, null);

    /* renamed from: b */
    public final MutableState f41286b;

    public LottieRetrySignal() {
        MutableState m65148g;
        m65148g = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
        this.f41286b = m65148g;
    }

    /* renamed from: a */
    public final void m50813a(boolean z) {
        this.f41286b.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object awaitRetry(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1
            if (r0 == 0) goto L13
            r0 = r6
            com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 r0 = (com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1 r0 = new com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            com.airbnb.lottie.compose.LottieRetrySignal r0 = (com.airbnb.lottie.compose.LottieRetrySignal) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L2e:
            r6 = move-exception
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            r5.m50813a(r4)     // Catch: java.lang.Throwable -> L52
            kotlinx.coroutines.channels.Channel r6 = r5.f41285a     // Catch: java.lang.Throwable -> L52
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L52
            r0.label = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.receive(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            r0.m50813a(r3)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L52:
            r6 = move-exception
            r0 = r5
        L54:
            r0.m50813a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieRetrySignal.awaitRetry(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean isAwaitingRetry() {
        return ((Boolean) this.f41286b.getValue()).booleanValue();
    }

    public final void retry() {
        ChannelsKt.trySendBlocking(this.f41285a, Unit.INSTANCE);
    }
}