package com.chuckerteam.chucker.internal.p010ui.transaction;

import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$viewModel$2 */
/* loaded from: classes3.dex */
public final class TransactionActivity$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$viewModel$2(TransactionActivity transactionActivity) {
        super(0);
        this.this$0 = transactionActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        return new TransactionViewModelFactory(this.this$0.getIntent().getLongExtra(FirebaseAnalytics.Param.TRANSACTION_ID, 0L));
    }
}