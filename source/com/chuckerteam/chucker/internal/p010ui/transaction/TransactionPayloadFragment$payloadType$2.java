package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/ui/transaction/PayloadType;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$payloadType$2 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$payloadType$2 extends Lambda implements Function0<PayloadType> {
    final /* synthetic */ TransactionPayloadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$payloadType$2(TransactionPayloadFragment transactionPayloadFragment) {
        super(0);
        this.this$0 = transactionPayloadFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final PayloadType invoke() {
        Bundle arguments = this.this$0.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("type") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.chuckerteam.chucker.internal.ui.transaction.PayloadType");
        return (PayloadType) serializable;
    }
}
