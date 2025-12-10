package com.chuckerteam.chucker.api;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.NotificationHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.api.ChuckerCollector$onResponseReceived$1", m29092f = "ChuckerCollector.kt", m29091i = {}, m29090l = {70}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes3.dex */
public final class ChuckerCollector$onResponseReceived$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpTransaction $transaction;
    int label;
    final /* synthetic */ ChuckerCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChuckerCollector$onResponseReceived$1(ChuckerCollector chuckerCollector, HttpTransaction httpTransaction, Continuation<? super ChuckerCollector$onResponseReceived$1> continuation) {
        super(2, continuation);
        this.this$0 = chuckerCollector;
        this.$transaction = httpTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChuckerCollector$onResponseReceived$1(this.this$0, this.$transaction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        NotificationHelper notificationHelper;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ChuckerCollector$onResponseReceived$1$updated$1 chuckerCollector$onResponseReceived$1$updated$1 = new ChuckerCollector$onResponseReceived$1$updated$1(this.$transaction, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, chuckerCollector$onResponseReceived$1$updated$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        int intValue = ((Number) obj).intValue();
        if (this.this$0.getShowNotification() && intValue > 0) {
            notificationHelper = this.this$0.f42767c;
            notificationHelper.show(this.$transaction);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChuckerCollector$onResponseReceived$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}