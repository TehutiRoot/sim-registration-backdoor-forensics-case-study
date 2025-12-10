package com.chuckerteam.chucker.internal.data.repository;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\rH&J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\u0014\u001a\u00020\u0007H&J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionRepository;", "", "deleteAllTransactions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOldTransactions", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "getFilteredTransactionTuples", "Landroidx/lifecycle/LiveData;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "code", "", ClientCookie.PATH_ATTR, "getSortedTransactionTuples", "getTransaction", "transactionId", "getTransactionsInTimeRange", "minTimestamp", "(Ljava/lang/Long;)Ljava/util/List;", "insertTransaction", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTransaction", "", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface HttpTransactionRepository {
    @Nullable
    Object deleteAllTransactions(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteOldTransactions(long j, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getAllTransactions(@NotNull Continuation<? super List<HttpTransaction>> continuation);

    @NotNull
    LiveData<List<HttpTransactionTuple>> getFilteredTransactionTuples(@NotNull String str, @NotNull String str2);

    @NotNull
    LiveData<List<HttpTransactionTuple>> getSortedTransactionTuples();

    @NotNull
    LiveData<HttpTransaction> getTransaction(long j);

    @NotNull
    List<HttpTransaction> getTransactionsInTimeRange(@Nullable Long l);

    @Nullable
    Object insertTransaction(@NotNull HttpTransaction httpTransaction, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateTransaction(@NotNull HttpTransaction httpTransaction, @NotNull Continuation<? super Integer> continuation);
}
