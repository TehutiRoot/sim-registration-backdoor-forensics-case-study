package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "encodeUrl", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionViewModel$transactionTitle$1 */
/* loaded from: classes3.dex */
public final class TransactionViewModel$transactionTitle$1 extends Lambda implements Function2<HttpTransaction, Boolean, String> {
    public static final TransactionViewModel$transactionTitle$1 INSTANCE = new TransactionViewModel$transactionTitle$1();

    public TransactionViewModel$transactionTitle$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(HttpTransaction httpTransaction, Boolean bool) {
        return invoke(httpTransaction, bool.booleanValue());
    }

    @NotNull
    public final String invoke(@Nullable HttpTransaction httpTransaction, boolean z) {
        if (httpTransaction != null) {
            String method = httpTransaction.getMethod();
            String formattedPath = httpTransaction.getFormattedPath(z);
            return method + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + formattedPath;
        }
        return "";
    }
}
