package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$1$1", m28800f = "TransactionPayloadFragment.kt", m28799i = {}, m28798l = {60}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$1$1 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$saveToFile$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ HttpTransaction $transaction;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ TransactionPayloadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$saveToFile$1$1(TransactionPayloadFragment transactionPayloadFragment, Uri uri, HttpTransaction httpTransaction, Context context, Continuation<? super TransactionPayloadFragment$saveToFile$1$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionPayloadFragment;
        this.$uri = uri;
        this.$transaction = httpTransaction;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionPayloadFragment$saveToFile$1$1(this.this$0, this.$uri, this.$transaction, this.$applicationContext, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PayloadType m49839r;
        int i;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            TransactionPayloadFragment transactionPayloadFragment = this.this$0;
            m49839r = transactionPayloadFragment.m49839r();
            Uri uri = this.$uri;
            HttpTransaction httpTransaction = this.$transaction;
            this.label = 1;
            obj = transactionPayloadFragment.m49853D(m49839r, uri, httpTransaction, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            i = R.string.chucker_file_saved;
        } else {
            i = R.string.chucker_file_not_saved;
        }
        Toast.makeText(this.$applicationContext, i, 0).show();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TransactionPayloadFragment$saveToFile$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
