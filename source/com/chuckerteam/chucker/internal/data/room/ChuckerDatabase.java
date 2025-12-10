package com.chuckerteam.chucker.internal.data.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Database(entities = {HttpTransaction.class}, exportSchema = false, version = 9)
@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "Landroidx/room/RoomDatabase;", "()V", "transactionDao", "Lcom/chuckerteam/chucker/internal/data/room/HttpTransactionDao;", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public abstract class ChuckerDatabase extends RoomDatabase {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$Companion;", "", "()V", "DB_NAME", "", "create", "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "applicationContext", "Landroid/content/Context;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChuckerDatabase create(@NotNull Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return (ChuckerDatabase) Room.databaseBuilder(applicationContext, ChuckerDatabase.class, "chucker.db").fallbackToDestructiveMigration().build();
        }

        public Companion() {
        }
    }

    @NotNull
    public abstract HttpTransactionDao transactionDao();
}
