package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p007db.SupportSQLiteCompat;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import androidx.sqlite.p007db.SupportSQLiteOpenHelper;
import androidx.sqlite.p007db.SupportSQLiteQuery;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.google.android.gms.actions.SearchIntents;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\"#\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, m28850d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/AutoCloser;", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper f37256a;
    @JvmField
    @NotNull
    public final AutoCloser autoCloser;

    /* renamed from: b */
    public final AutoClosingSupportSQLiteDatabase f37257b;

    @Metadata(m28851d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010#J)\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020\t2\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b!\u0010'J\u0017\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020(H\u0016¢\u0006\u0004\b!\u0010)J!\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0017¢\u0006\u0004\b!\u0010,J'\u00102\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020.2\u0006\u0010-\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\t2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b6\u00107JE\u00108\u001a\u00020.2\u0006\u0010-\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\t2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J)\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b:\u0010<J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020.H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020.H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0017H\u0017¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010\u0019J\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\bJ\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0019R$\u0010P\u001a\u00020.2\u0006\u0010P\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010FR\u0014\u0010V\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR$\u0010Z\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010U\"\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0019R\u0014\u0010\\\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0019R\u0016\u0010_\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0019R(\u0010e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0b\u0018\u00010a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u0019¨\u0006g"}, m28850d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/room/AutoCloser;)V", "", "pokeOpen", "()V", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "(J)Z", "numBytes", "setMaximumSize", "(J)J", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/room/AutoCloser;", "isDbLockedByCurrentThread", ClientCookie.VERSION_ATTR, "getVersion", "()I", "setVersion", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        /* renamed from: a */
        public final AutoCloser f37258a;

        public AutoClosingSupportSQLiteDatabase(@NotNull AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f37258a = autoCloser;
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.f37258a.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.f37258a.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.f37258a.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
            Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.f37258a.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f37258a.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @NotNull
        public SupportSQLiteStatement compileStatement(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.f37258a);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public int delete(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            return ((Number) this.f37258a.executeRefCountingFunction(new C4984xa7295701(table, str, objArr))).intValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.f37258a.getDelegateDatabase$room_runtime_release() != null) {
                try {
                    SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.f37258a.getDelegateDatabase$room_runtime_release();
                    Intrinsics.checkNotNull(delegateDatabase$room_runtime_release);
                    delegateDatabase$room_runtime_release.endTransaction();
                    return;
                } finally {
                    this.f37258a.decrementCountAndScheduleClose();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
            AbstractC19520dP1.m31884a(this, str, objArr);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void execSQL(@NotNull String sql) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f37258a.executeRefCountingFunction(new C4985x106d7261(sql));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @Nullable
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.f37258a.executeRefCountingFunction(C4983x882a29d5.INSTANCE);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.f37258a.executeRefCountingFunction(C4993xb75cb4a5.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.f37258a.executeRefCountingFunction(C4995x65399d06.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @Nullable
        public String getPath() {
            return (String) this.f37258a.executeRefCountingFunction(C4997x4ec8cd3b.INSTANCE);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.f37258a.executeRefCountingFunction(C5004xff8530fc.INSTANCE)).intValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.f37258a.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.f37258a.executeRefCountingFunction(C4987x5693171d.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public long insert(@NotNull String table, int i, @NotNull ContentValues values) throws SQLException {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f37258a.executeRefCountingFunction(new C4988x9698888f(table, i, values))).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.f37258a.executeRefCountingFunction(C4989x7d1b80e8.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.f37258a.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.f37258a.executeRefCountingFunction(C4990xa0ea6de.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return AbstractC19520dP1.m31883b(this);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.f37258a.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.f37258a.executeRefCountingFunction(C4991x928ac242.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f37258a.executeRefCountingFunction(C4992x1aa74a04.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean needUpgrade(int i) {
            return ((Boolean) this.f37258a.executeRefCountingFunction(new C4994xfb73a9ca(i))).booleanValue();
        }

        public final void pokeOpen() {
            this.f37258a.executeRefCountingFunction(C4998x1a023a99.INSTANCE);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4982a(this.f37258a.incrementCountAndEnsureDbIsOpen().query(query), this.f37258a);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean z) {
            this.f37258a.executeRefCountingFunction(new C4999xeb7db11c(z));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void setLocale(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.f37258a.executeRefCountingFunction(new C5000xf1df5ec0(locale));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(int i) {
            this.f37258a.executeRefCountingFunction(new C5001x9778840d(i));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public long setMaximumSize(long j) {
            return ((Number) this.f37258a.executeRefCountingFunction(new C5002xd48b87d5(j))).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void setPageSize(long j) {
            this.f37258a.executeRefCountingFunction(new C4996x65399d07(j));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            Unit unit;
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.f37258a.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void setVersion(int i) {
            this.f37258a.executeRefCountingFunction(new C5005xff8530fd(i));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public int update(@NotNull String table, int i, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f37258a.executeRefCountingFunction(new C5003xc522ba9f(table, i, values, str, objArr))).intValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.f37258a.executeRefCountingFunction(C5006x2da6dfee.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f37258a.executeRefCountingFunction(new C4986x106d7262(sql, bindArgs));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j) {
            return ((Boolean) this.f37258a.executeRefCountingFunction(C5007x2da6dfef.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new C4982a(this.f37258a.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.f37258a);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4982a(this.f37258a.incrementCountAndEnsureDbIsOpen().query(query), this.f37258a);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
        @RequiresApi(api = 24)
        @NotNull
        public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new C4982a(this.f37258a.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.f37258a);
            } catch (Throwable th2) {
                this.f37258a.decrementCountAndScheduleClose();
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {

        /* renamed from: a */
        public final String f37259a;

        /* renamed from: b */
        public final AutoCloser f37260b;

        /* renamed from: c */
        public final ArrayList f37261c;

        public AutoClosingSupportSqliteStatement(String sql, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f37259a = sql;
            this.f37260b = autoCloser;
            this.f37261c = new ArrayList();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void bindBlob(int i, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m52921j(i, value);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void bindDouble(int i, double d) {
            m52921j(i, Double.valueOf(d));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void bindLong(int i, long j) {
            m52921j(i, Long.valueOf(j));
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void bindNull(int i) {
            m52921j(i, null);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void bindString(int i, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            m52921j(i, value);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteProgram
        public void clearBindings() {
            this.f37261c.clear();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteStatement
        public void execute() {
            m52922i(C5008xc356304d.INSTANCE);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) m52922i(C5009xe79bbce6.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) m52922i(C5011x7fb2e741.INSTANCE)).intValue();
        }

        /* renamed from: g */
        public final void m52923g(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator it = this.f37261c.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.f37261c.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        /* renamed from: i */
        public final Object m52922i(Function1 function1) {
            return this.f37260b.executeRefCountingFunction(new C5010xdd6c1cf2(this, function1));
        }

        /* renamed from: j */
        public final void m52921j(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f37261c.size() && (size = this.f37261c.size()) <= i2) {
                while (true) {
                    this.f37261c.add(null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.f37261c.set(i2, obj);
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) m52922i(C5012x6100e31.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.p007db.SupportSQLiteStatement
        public String simpleQueryForString() {
            return (String) m52922i(C5013xa8feac86.INSTANCE);
        }
    }

    /* renamed from: androidx.room.AutoClosingRoomOpenHelper$a */
    /* loaded from: classes2.dex */
    public static final class C4982a implements Cursor {

        /* renamed from: a */
        public final Cursor f37262a;

        /* renamed from: b */
        public final AutoCloser f37263b;

        public C4982a(Cursor delegate, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f37262a = delegate;
            this.f37263b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f37262a.close();
            this.f37263b.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f37262a.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f37262a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.f37262a.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f37262a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f37262a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f37262a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.f37262a.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f37262a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f37262a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.f37262a.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f37262a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.f37262a.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.f37262a.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.f37262a.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.f37262a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.f37262a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f37262a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.f37262a.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.f37262a.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.f37262a.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f37262a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f37262a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f37262a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f37262a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f37262a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f37262a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.f37262a.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.f37262a.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f37262a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f37262a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f37262a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.f37262a.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f37262a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f37262a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f37262a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f37262a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f37262a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            SupportSQLiteCompat.Api23Impl.setExtras(this.f37262a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f37262a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.f37262a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f37262a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f37262a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@NotNull SupportSQLiteOpenHelper delegate, @NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f37256a = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.f37257b = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37257b.close();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f37256a.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f37256a;
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        this.f37257b.pokeOpen();
        return this.f37257b;
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteOpenHelper
    @RequiresApi(api = 24)
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        this.f37257b.pokeOpen();
        return this.f37257b;
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f37256a.setWriteAheadLoggingEnabled(z);
    }
}
