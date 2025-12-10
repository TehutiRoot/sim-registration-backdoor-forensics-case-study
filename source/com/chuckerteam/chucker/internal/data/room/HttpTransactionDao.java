package com.chuckerteam.chucker.internal.data.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\ba\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\u000e\u001a\u00020\u0007H'J.\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\rH'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0017\u001a\u00020\u0007H'J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/room/HttpTransactionDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBefore", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "getById", "Landroidx/lifecycle/LiveData;", "id", "getFilteredTuples", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "codeQuery", "", "pathQuery", "graphQlQuery", "getSortedTuples", "getTransactionsInTimeRange", "timestamp", "insert", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface HttpTransactionDao {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData getFilteredTuples$default(HttpTransactionDao httpTransactionDao, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "";
                }
                return httpTransactionDao.getFilteredTuples(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFilteredTuples");
        }
    }

    @Query("DELETE FROM transactions")
    @Nullable
    Object deleteAll(@NotNull Continuation<? super Integer> continuation);

    @Query("DELETE FROM transactions WHERE requestDate <= :threshold")
    @Nullable
    Object deleteBefore(long j, @NotNull Continuation<? super Integer> continuation);

    @Query("SELECT * FROM transactions")
    @Nullable
    Object getAll(@NotNull Continuation<? super List<HttpTransaction>> continuation);

    @Query("SELECT * FROM transactions WHERE id = :id")
    @NotNull
    LiveData<HttpTransaction> getById(long j);

    @Query("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE :codeQuery AND (path LIKE :pathQuery OR graphQlOperationName LIKE :graphQlQuery) ORDER BY requestDate DESC")
    @NotNull
    LiveData<List<HttpTransactionTuple>> getFilteredTuples(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @Query("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC")
    @NotNull
    LiveData<List<HttpTransactionTuple>> getSortedTuples();

    @Query("SELECT * FROM transactions WHERE requestDate >= :timestamp")
    @NotNull
    List<HttpTransaction> getTransactionsInTimeRange(long j);

    @Insert
    @Nullable
    Object insert(@NotNull HttpTransaction httpTransaction, @NotNull Continuation<? super Long> continuation);

    @Update(onConflict = 1)
    @Nullable
    Object update(@NotNull HttpTransaction httpTransaction, @NotNull Continuation<? super Integer> continuation);
}
