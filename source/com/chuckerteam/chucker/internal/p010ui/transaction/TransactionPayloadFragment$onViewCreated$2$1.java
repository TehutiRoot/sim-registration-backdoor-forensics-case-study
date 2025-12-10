package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.databinding.ChuckerFragmentTransactionPayloadBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
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
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onViewCreated$2$1", m28800f = "TransactionPayloadFragment.kt", m28799i = {}, m28798l = {121}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onViewCreated$2$1 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$onViewCreated$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $formatRequestBody;
    final /* synthetic */ HttpTransaction $transaction;
    int label;
    final /* synthetic */ TransactionPayloadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$onViewCreated$2$1(TransactionPayloadFragment transactionPayloadFragment, HttpTransaction httpTransaction, boolean z, Continuation<? super TransactionPayloadFragment$onViewCreated$2$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionPayloadFragment;
        this.$transaction = httpTransaction;
        this.$formatRequestBody = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionPayloadFragment$onViewCreated$2$1(this.this$0, this.$transaction, this.$formatRequestBody, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding;
        PayloadType m49839r;
        TransactionBodyAdapter transactionBodyAdapter;
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding2;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ChuckerFragmentTransactionPayloadBinding chuckerFragmentTransactionPayloadBinding3 = null;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            chuckerFragmentTransactionPayloadBinding = this.this$0.f43024d;
            if (chuckerFragmentTransactionPayloadBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
                chuckerFragmentTransactionPayloadBinding = null;
            }
            chuckerFragmentTransactionPayloadBinding.loadingProgress.setVisibility(0);
            TransactionPayloadFragment transactionPayloadFragment = this.this$0;
            m49839r = transactionPayloadFragment.m49839r();
            HttpTransaction httpTransaction = this.$transaction;
            boolean z = this.$formatRequestBody;
            this.label = 1;
            obj = transactionPayloadFragment.m49854C(m49839r, httpTransaction, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List<? extends TransactionPayloadItem> list = (List) obj;
        if (list.isEmpty()) {
            this.this$0.m49848I();
        } else {
            transactionBodyAdapter = this.this$0.f43025e;
            transactionBodyAdapter.setItems(list);
            this.this$0.m49847J();
        }
        this.this$0.requireActivity().invalidateOptionsMenu();
        chuckerFragmentTransactionPayloadBinding2 = this.this$0.f43024d;
        if (chuckerFragmentTransactionPayloadBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
        } else {
            chuckerFragmentTransactionPayloadBinding3 = chuckerFragmentTransactionPayloadBinding2;
        }
        chuckerFragmentTransactionPayloadBinding3.loadingProgress.setVisibility(8);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TransactionPayloadFragment$onViewCreated$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
