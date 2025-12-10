package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionDetailsSharable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$1 */
/* loaded from: classes3.dex */
public final class TransactionActivity$onOptionsItemSelected$1 extends Lambda implements Function1<HttpTransaction, Sharable> {
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$onOptionsItemSelected$1(TransactionActivity transactionActivity) {
        super(1);
        this.this$0 = transactionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Sharable invoke(@NotNull HttpTransaction transaction) {
        TransactionViewModel m49871y;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m49871y = this.this$0.m49871y();
        Boolean value = m49871y.getEncodeUrl().getValue();
        Intrinsics.checkNotNull(value);
        return new TransactionDetailsSharable(transaction, value.booleanValue());
    }
}
