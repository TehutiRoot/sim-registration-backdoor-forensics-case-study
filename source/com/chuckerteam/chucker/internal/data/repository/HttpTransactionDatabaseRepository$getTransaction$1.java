package com.chuckerteam.chucker.internal.data.repository;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "old", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "new", "invoke", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class HttpTransactionDatabaseRepository$getTransaction$1 extends Lambda implements Function2<HttpTransaction, HttpTransaction, Boolean> {
    public static final HttpTransactionDatabaseRepository$getTransaction$1 INSTANCE = new HttpTransactionDatabaseRepository$getTransaction$1();

    public HttpTransactionDatabaseRepository$getTransaction$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@Nullable HttpTransaction httpTransaction, @Nullable HttpTransaction httpTransaction2) {
        boolean z = false;
        if (httpTransaction != null && !httpTransaction.hasTheSameContent(httpTransaction2)) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }
}
