package com.chuckerteam.chucker.internal.p010ui.transaction;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$viewModel$2 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    public static final TransactionPayloadFragment$viewModel$2 INSTANCE = new TransactionPayloadFragment$viewModel$2();

    public TransactionPayloadFragment$viewModel$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        return new TransactionViewModelFactory(0L, 1, null);
    }
}
