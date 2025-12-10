package com.chuckerteam.chucker.internal.p010ui.transaction;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\r\u0010\u0003\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Lkotlin/jvm/JvmSuppressWildcards;", "transaction", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "invoke", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionViewModel$doesRequestBodyRequireEncoding$1 */
/* loaded from: classes3.dex */
public final class TransactionViewModel$doesRequestBodyRequireEncoding$1 extends Lambda implements Function1<HttpTransaction, Boolean> {
    public static final TransactionViewModel$doesRequestBodyRequireEncoding$1 INSTANCE = new TransactionViewModel$doesRequestBodyRequireEncoding$1();

    public TransactionViewModel$doesRequestBodyRequireEncoding$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@Nullable HttpTransaction httpTransaction) {
        String requestContentType;
        return Boolean.valueOf((httpTransaction == null || (requestContentType = httpTransaction.getRequestContentType()) == null) ? false : StringsKt__StringsKt.contains((CharSequence) requestContentType, (CharSequence) "x-www-form-urlencoded", true));
    }
}