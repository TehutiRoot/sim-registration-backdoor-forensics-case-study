package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import es.dmoral.toasty.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1", m29092f = "TransactionActivity.kt", m29091i = {}, m29090l = {BuildConfig.VERSION_CODE, 131}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1 */
/* loaded from: classes3.dex */
public final class TransactionActivity$shareTransactionAsFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<HttpTransaction, Continuation<? super Sharable>, Object> $block;
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionActivity$shareTransactionAsFile$1(TransactionActivity transactionActivity, Function2<? super HttpTransaction, ? super Continuation<? super Sharable>, ? extends Object> function2, String str, Continuation<? super TransactionActivity$shareTransactionAsFile$1> continuation) {
        super(2, continuation);
        this.this$0 = transactionActivity;
        this.$block = function2;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionActivity$shareTransactionAsFile$1(this.this$0, this.$block, this.$fileName, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r5) goto L14
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6b
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L53
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r9 = r8.this$0
            com.chuckerteam.chucker.internal.ui.transaction.TransactionViewModel r9 = com.chuckerteam.chucker.internal.p010ui.transaction.TransactionActivity.access$getViewModel(r9)
            androidx.lifecycle.LiveData r9 = r9.getTransaction()
            java.lang.Object r9 = r9.getValue()
            com.chuckerteam.chucker.internal.data.entity.HttpTransaction r9 = (com.chuckerteam.chucker.internal.data.entity.HttpTransaction) r9
            if (r9 != 0) goto L48
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r9 = r8.this$0
            int r0 = com.chuckerteam.chucker.R.string.chucker_request_not_ready
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "getString(R.string.chucker_request_not_ready)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity.showToast$default(r9, r0, r3, r5, r2)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L48:
            kotlin.jvm.functions.Function2<com.chuckerteam.chucker.internal.data.entity.HttpTransaction, kotlin.coroutines.Continuation<? super com.chuckerteam.chucker.internal.support.Sharable>, java.lang.Object> r1 = r8.$block
            r8.label = r4
            java.lang.Object r9 = r1.invoke(r9, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            com.chuckerteam.chucker.internal.support.Sharable r9 = (com.chuckerteam.chucker.internal.support.Sharable) r9
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1 r4 = new com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r6 = r8.this$0
            java.lang.String r7 = r8.$fileName
            r4.<init>(r9, r6, r7, r2)
            r8.label = r5
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r8)
            if (r9 != r0) goto L6b
            return r0
        L6b:
            android.content.Intent r9 = (android.content.Intent) r9
            if (r9 == 0) goto L75
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r0 = r8.this$0
            r0.startActivity(r9)
            goto L84
        L75:
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r9 = r8.this$0
            android.content.Context r9 = r9.getApplicationContext()
            int r0 = com.chuckerteam.chucker.R.string.chucker_export_no_file
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r0, r3)
            r9.show()
        L84:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.p010ui.transaction.TransactionActivity$shareTransactionAsFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TransactionActivity$shareTransactionAsFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}