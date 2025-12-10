package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionDetailsHarSharable;
import java.util.List;
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

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$4", m28800f = "TransactionActivity.kt", m28799i = {}, m28798l = {94}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$4 */
/* loaded from: classes3.dex */
public final class TransactionActivity$onOptionsItemSelected$4 extends SuspendLambda implements Function2<HttpTransaction, Continuation<? super Sharable>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$onOptionsItemSelected$4(TransactionActivity transactionActivity, Continuation<? super TransactionActivity$onOptionsItemSelected$4> continuation) {
        super(2, continuation);
        this.this$0 = transactionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TransactionActivity$onOptionsItemSelected$4 transactionActivity$onOptionsItemSelected$4 = new TransactionActivity$onOptionsItemSelected$4(this.this$0, continuation);
        transactionActivity$onOptionsItemSelected$4.L$0 = obj;
        return transactionActivity$onOptionsItemSelected$4;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull HttpTransaction httpTransaction, @Nullable Continuation<? super Sharable> continuation) {
        return ((TransactionActivity$onOptionsItemSelected$4) create(httpTransaction, continuation)).invokeSuspend(Unit.INSTANCE);
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
            HarUtils harUtils = HarUtils.INSTANCE;
            List<HttpTransaction> listOf = AbstractC10108ds.listOf((HttpTransaction) this.L$0);
            String string = this.this$0.getString(R.string.chucker_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_name)");
            String string2 = this.this$0.getString(R.string.chucker_version);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_version)");
            this.label = 1;
            obj = harUtils.harStringFromTransactions(listOf, string, string2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return new TransactionDetailsHarSharable((String) obj);
    }
}
