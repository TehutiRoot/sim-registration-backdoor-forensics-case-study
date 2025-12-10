package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionDetailsSharable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$3", m29092f = "TransactionActivity.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$3 */
/* loaded from: classes3.dex */
public final class TransactionActivity$onOptionsItemSelected$3 extends SuspendLambda implements Function2<HttpTransaction, Continuation<? super Sharable>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$onOptionsItemSelected$3(TransactionActivity transactionActivity, Continuation<? super TransactionActivity$onOptionsItemSelected$3> continuation) {
        super(2, continuation);
        this.this$0 = transactionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TransactionActivity$onOptionsItemSelected$3 transactionActivity$onOptionsItemSelected$3 = new TransactionActivity$onOptionsItemSelected$3(this.this$0, continuation);
        transactionActivity$onOptionsItemSelected$3.L$0 = obj;
        return transactionActivity$onOptionsItemSelected$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull HttpTransaction httpTransaction, @Nullable Continuation<? super Sharable> continuation) {
        return ((TransactionActivity$onOptionsItemSelected$3) create(httpTransaction, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TransactionViewModel m49868y;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            m49868y = this.this$0.m49868y();
            Boolean value = m49868y.getEncodeUrl().getValue();
            Intrinsics.checkNotNull(value);
            return new TransactionDetailsSharable((HttpTransaction) this.L$0, value.booleanValue());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}