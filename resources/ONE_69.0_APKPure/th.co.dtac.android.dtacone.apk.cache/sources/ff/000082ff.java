package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionCurlCommandSharable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$2 */
/* loaded from: classes3.dex */
public final class TransactionActivity$onOptionsItemSelected$2 extends Lambda implements Function1<HttpTransaction, Sharable> {
    public static final TransactionActivity$onOptionsItemSelected$2 INSTANCE = new TransactionActivity$onOptionsItemSelected$2();

    public TransactionActivity$onOptionsItemSelected$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Sharable invoke(@NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new TransactionCurlCommandSharable(transaction);
    }
}