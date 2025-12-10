package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.content.Intent;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.SharableKt;
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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "Landroid/content/Intent;", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1", m28800f = "TransactionActivity.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1 */
/* loaded from: classes3.dex */
public final class TransactionActivity$shareTransactionAsFile$1$shareIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Intent>, Object> {
    final /* synthetic */ String $fileName;
    final /* synthetic */ Sharable $sharable;
    int label;
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$shareTransactionAsFile$1$shareIntent$1(Sharable sharable, TransactionActivity transactionActivity, String str, Continuation<? super TransactionActivity$shareTransactionAsFile$1$shareIntent$1> continuation) {
        super(2, continuation);
        this.$sharable = sharable;
        this.this$0 = transactionActivity;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionActivity$shareTransactionAsFile$1$shareIntent$1(this.$sharable, this.this$0, this.$fileName, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Sharable sharable = this.$sharable;
            TransactionActivity transactionActivity = this.this$0;
            String str = this.$fileName;
            String string = transactionActivity.getString(R.string.chucker_share_transaction_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chuck…_share_transaction_title)");
            String string2 = this.this$0.getString(R.string.chucker_share_transaction_subject);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…hare_transaction_subject)");
            return SharableKt.shareAsFile(sharable, transactionActivity, str, string, string2, "transaction");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Intent> continuation) {
        return ((TransactionActivity$shareTransactionAsFile$1$shareIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
