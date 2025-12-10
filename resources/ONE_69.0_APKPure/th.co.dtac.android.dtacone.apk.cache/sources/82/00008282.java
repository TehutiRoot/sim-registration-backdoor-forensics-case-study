package com.chuckerteam.chucker.internal.data.repository;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.chuckerteam.chucker.internal.data.room.HttpTransactionDao;
import com.chuckerteam.chucker.internal.support.LiveDataUtilsKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0017J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionDatabaseRepository;", "Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionRepository;", "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "database", "<init>", "(Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;)V", "", "code", ClientCookie.PATH_ATTR, "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "getFilteredTransactionTuples", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "", "transactionId", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "getTransaction", "(J)Landroidx/lifecycle/LiveData;", "getSortedTransactionTuples", "()Landroidx/lifecycle/LiveData;", "", "deleteAllTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "insertTransaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateTransaction", "threshold", "deleteOldTransactions", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTransactions", "minTimestamp", "getTransactionsInTimeRange", "(Ljava/lang/Long;)Ljava/util/List;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "Lcom/chuckerteam/chucker/internal/data/room/HttpTransactionDao;", "()Lcom/chuckerteam/chucker/internal/data/room/HttpTransactionDao;", "transactionDao", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class HttpTransactionDatabaseRepository implements HttpTransactionRepository {

    /* renamed from: a */
    public final ChuckerDatabase f42912a;

    public HttpTransactionDatabaseRepository(@NotNull ChuckerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f42912a = database;
    }

    /* renamed from: a */
    public final HttpTransactionDao m49960a() {
        return this.f42912a.transactionDao();
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @Nullable
    public Object deleteAllTransactions(@NotNull Continuation<? super Unit> continuation) {
        Object deleteAll = m49960a().deleteAll(continuation);
        if (deleteAll == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return deleteAll;
        }
        return Unit.INSTANCE;
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @Nullable
    public Object deleteOldTransactions(long j, @NotNull Continuation<? super Unit> continuation) {
        Object deleteBefore = m49960a().deleteBefore(j, continuation);
        if (deleteBefore == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return deleteBefore;
        }
        return Unit.INSTANCE;
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @Nullable
    public Object getAllTransactions(@NotNull Continuation<? super List<HttpTransaction>> continuation) {
        return m49960a().getAll(continuation);
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @NotNull
    public LiveData<List<HttpTransactionTuple>> getFilteredTransactionTuples(@NotNull String code, @NotNull String path) {
        String str;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(path, "path");
        if (path.length() <= 0) {
            str = "%";
        } else {
            str = "%" + path + "%";
        }
        return m49960a().getFilteredTuples(code + "%", str, str);
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @NotNull
    public LiveData<List<HttpTransactionTuple>> getSortedTransactionTuples() {
        return m49960a().getSortedTuples();
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @NotNull
    public LiveData<HttpTransaction> getTransaction(long j) {
        return LiveDataUtilsKt.distinctUntilChanged$default(m49960a().getById(j), null, HttpTransactionDatabaseRepository$getTransaction$1.INSTANCE, 1, null);
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @NotNull
    public List<HttpTransaction> getTransactionsInTimeRange(@Nullable Long l) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return m49960a().getTransactionsInTimeRange(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object insertTransaction(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository$insertTransaction$1
            if (r0 == 0) goto L13
            r0 = r6
            com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository$insertTransaction$1 r0 = (com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository$insertTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository$insertTransaction$1 r0 = new com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository$insertTransaction$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.chuckerteam.chucker.internal.data.entity.HttpTransaction r5 = (com.chuckerteam.chucker.internal.data.entity.HttpTransaction) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            com.chuckerteam.chucker.internal.data.room.HttpTransactionDao r6 = r4.m49960a()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.insert(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L50
            long r0 = r6.longValue()
            goto L52
        L50:
            r0 = 0
        L52:
            r5.setId(r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository.insertTransaction(com.chuckerteam.chucker.internal.data.entity.HttpTransaction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository
    @Nullable
    public Object updateTransaction(@NotNull HttpTransaction httpTransaction, @NotNull Continuation<? super Integer> continuation) {
        return m49960a().update(httpTransaction, continuation);
    }
}