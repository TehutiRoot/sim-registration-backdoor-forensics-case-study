package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.support.ClearDatabaseService$onHandleWork$1", m28800f = "ClearDatabaseService.kt", m28799i = {}, m28798l = {16}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes3.dex */
public final class ClearDatabaseService$onHandleWork$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ClearDatabaseService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearDatabaseService$onHandleWork$1(ClearDatabaseService clearDatabaseService, Continuation<? super ClearDatabaseService$onHandleWork$1> continuation) {
        super(2, continuation);
        this.this$0 = clearDatabaseService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ClearDatabaseService$onHandleWork$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            HttpTransactionRepository transaction = RepositoryProvider.INSTANCE.transaction();
            this.label = 1;
            if (transaction.deleteAllTransactions(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        NotificationHelper.Companion.clearBuffer();
        Context applicationContext = this.this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        new NotificationHelper(applicationContext).dismissNotifications();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClearDatabaseService$onHandleWork$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
