package com.chuckerteam.chucker.internal.data.repository;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/repository/RepositoryProvider;", "", "<init>", "()V", "Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionRepository;", "transaction", "()Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionRepository;", "Landroid/content/Context;", "applicationContext", "", "initialize", "(Landroid/content/Context;)V", "close", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/internal/data/repository/HttpTransactionRepository;", "transactionRepository", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RepositoryProvider {
    @NotNull
    public static final RepositoryProvider INSTANCE = new RepositoryProvider();

    /* renamed from: a */
    public static HttpTransactionRepository f42901a;

    @VisibleForTesting
    public final void close() {
        f42901a = null;
    }

    public final void initialize(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (f42901a == null) {
            f42901a = new HttpTransactionDatabaseRepository(ChuckerDatabase.Companion.create(applicationContext));
        }
    }

    @NotNull
    public final HttpTransactionRepository transaction() {
        HttpTransactionRepository httpTransactionRepository = f42901a;
        if (httpTransactionRepository != null) {
            return httpTransactionRepository;
        }
        throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
    }
}
