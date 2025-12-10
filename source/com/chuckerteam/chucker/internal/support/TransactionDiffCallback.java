package com.chuckerteam.chucker.internal.support;

import androidx.recyclerview.widget.DiffUtil;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/TransactionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getChangePayload", "", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class TransactionDiffCallback extends DiffUtil.ItemCallback<HttpTransactionTuple> {
    @NotNull
    public static final TransactionDiffCallback INSTANCE = new TransactionDiffCallback();

    /* renamed from: getChangePayload  reason: avoid collision after fix types in other method */
    public void getChangePayload2(@NotNull HttpTransactionTuple oldItem, @NotNull HttpTransactionTuple newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull HttpTransactionTuple oldItem, @NotNull HttpTransactionTuple newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull HttpTransactionTuple oldItem, @NotNull HttpTransactionTuple newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public /* bridge */ /* synthetic */ Object getChangePayload(HttpTransactionTuple httpTransactionTuple, HttpTransactionTuple httpTransactionTuple2) {
        getChangePayload2(httpTransactionTuple, httpTransactionTuple2);
        return Unit.INSTANCE;
    }
}
