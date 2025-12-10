package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.RoomDatabase;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import androidx.sqlite.p007db.SupportSQLiteQuery;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.google.android.gms.actions.SearchIntents;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0018J(\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b2\u00103JF\u00104\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b6\u0010\u0018J\u0018\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b6\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u000bJ\u000f\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010\u000bJ\u0017\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010\u000bJ\u000f\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010\u000bJ\u0017\u0010E\u001a\u00020F2\u0006\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010GJ)\u0010E\u001a\u00020F2\u0006\u0010E\u001a\u00020\f2\u0010\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\bE\u0010HJ\u0017\u0010E\u001a\u00020F2\u0006\u0010E\u001a\u00020IH\u0016¢\u0006\u0004\bE\u0010JJ!\u0010E\u001a\u00020F2\u0006\u0010E\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bE\u0010MJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\bN\u0010OJ)\u0010N\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0010\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\bN\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010Z\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0W\u0018\u00010V8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\u0018R\u0014\u0010\\\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010\u0018R\u0014\u0010]\u001a\u00020\u00168VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010\u0018R\u0014\u0010^\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010\u0018R\u0014\u0010_\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010\u0018R\u0014\u0010`\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010\u0018R\u0014\u0010c\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001c\u0010g\u001a\u00020!8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bd\u0010b\"\u0004\be\u0010fR\u0016\u0010j\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001c\u0010n\u001a\u00020\u00128\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u00100¨\u0006o"}, m28850d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "", "table", "whereClause", "", "", "whereArgs", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "()Z", "sql", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "inTransaction", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "newVersion", "needUpgrade", "(I)Z", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "numBytes", "setMaximumSize", "(J)J", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "(J)Z", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "execSQL", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/sqlite/db/SupportSQLiteDatabase;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/concurrent/Executor;", OperatorName.CURVE_TO, "Landroidx/room/RoomDatabase$QueryCallback;", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "getVersion", "()I", "setVersion", ClientCookie.VERSION_ATTR, "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
/* loaded from: classes2.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    /* renamed from: a */
    public final SupportSQLiteDatabase f37325a;

    /* renamed from: b */
    public final Executor f37326b;

    /* renamed from: c */
    public final RoomDatabase.QueryCallback f37327c;

    public QueryInterceptorDatabase(@NotNull SupportSQLiteDatabase delegate, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f37325a = delegate;
        this.f37326b = queryCallbackExecutor;
        this.f37327c = queryCallback;
    }

    /* renamed from: A */
    public static final void m52905A(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.f37327c.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* renamed from: B */
    public static final void m52904B(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.f37327c.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* renamed from: C */
    public static final void m52903C(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: b */
    public static /* synthetic */ void m52902b(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        m52885w(queryInterceptorDatabase, str);
    }

    /* renamed from: d */
    public static /* synthetic */ void m52901d(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52886v(queryInterceptorDatabase);
    }

    /* renamed from: g */
    public static /* synthetic */ void m52900g(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52903C(queryInterceptorDatabase);
    }

    /* renamed from: i */
    public static /* synthetic */ void m52899i(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        m52884x(queryInterceptorDatabase, str, list);
    }

    /* renamed from: j */
    public static /* synthetic */ void m52898j(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52890r(queryInterceptorDatabase);
    }

    /* renamed from: k */
    public static /* synthetic */ void m52897k(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52889s(queryInterceptorDatabase);
    }

    /* renamed from: l */
    public static /* synthetic */ void m52896l(QueryInterceptorDatabase queryInterceptorDatabase, String str, Object[] objArr) {
        m52882z(queryInterceptorDatabase, str, objArr);
    }

    /* renamed from: m */
    public static /* synthetic */ void m52895m(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52888t(queryInterceptorDatabase);
    }

    /* renamed from: n */
    public static /* synthetic */ void m52894n(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        m52883y(queryInterceptorDatabase, str);
    }

    /* renamed from: o */
    public static /* synthetic */ void m52893o(QueryInterceptorDatabase queryInterceptorDatabase) {
        m52887u(queryInterceptorDatabase);
    }

    /* renamed from: p */
    public static /* synthetic */ void m52892p(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        m52905A(queryInterceptorDatabase, supportSQLiteQuery, queryInterceptorProgram);
    }

    /* renamed from: q */
    public static /* synthetic */ void m52891q(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        m52904B(queryInterceptorDatabase, supportSQLiteQuery, queryInterceptorProgram);
    }

    /* renamed from: r */
    public static final void m52890r(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: s */
    public static final void m52889s(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: t */
    public static final void m52888t(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: u */
    public static final void m52887u(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: v */
    public static final void m52886v(QueryInterceptorDatabase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37327c.onQuery("END TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: w */
    public static final void m52885w(QueryInterceptorDatabase this$0, String sql) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        this$0.f37327c.onQuery(sql, CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: x */
    public static final void m52884x(QueryInterceptorDatabase this$0, String sql, List inputArguments) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sql, "$sql");
        Intrinsics.checkNotNullParameter(inputArguments, "$inputArguments");
        this$0.f37327c.onQuery(sql, inputArguments);
    }

    /* renamed from: y */
    public static final void m52883y(QueryInterceptorDatabase this$0, String query) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        this$0.f37327c.onQuery(query, CollectionsKt__CollectionsKt.emptyList());
    }

    /* renamed from: z */
    public static final void m52882z(QueryInterceptorDatabase this$0, String query, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNullParameter(bindArgs, "$bindArgs");
        this$0.f37327c.onQuery(query, ArraysKt___ArraysKt.toList(bindArgs));
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.f37326b.execute(new Runnable() { // from class: Wq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52898j(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.beginTransaction();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.f37326b.execute(new Runnable() { // from class: Yq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52897k(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f37326b.execute(new Runnable() { // from class: br1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52895m(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f37326b.execute(new Runnable() { // from class: Sq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52893o(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37325a.close();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new QueryInterceptorStatement(this.f37325a.compileStatement(sql), sql, this.f37326b, this.f37327c);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public int delete(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.f37325a.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.f37325a.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.f37325a.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void endTransaction() {
        this.f37326b.execute(new Runnable() { // from class: Rq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52901d(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.endTransaction();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String sql, @SuppressLint({"ArrayReturn"}) @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f37325a.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void execSQL(@NotNull final String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f37326b.execute(new Runnable() { // from class: Vq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52902b(QueryInterceptorDatabase.this, sql);
            }
        });
        this.f37325a.execSQL(sql);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @Nullable
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f37325a.getAttachedDbs();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.f37325a.getMaximumSize();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.f37325a.getPageSize();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @Nullable
    public String getPath() {
        return this.f37325a.getPath();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public int getVersion() {
        return this.f37325a.getVersion();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.f37325a.inTransaction();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public long insert(@NotNull String table, int i, @NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f37325a.insert(table, i, values);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.f37325a.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.f37325a.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.f37325a.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f37325a.isOpen();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.f37325a.isReadOnly();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.f37325a.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean needUpgrade(int i) {
        return this.f37325a.needUpgrade(i);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f37326b.execute(new Runnable() { // from class: Tq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52894n(QueryInterceptorDatabase.this, query);
            }
        });
        return this.f37325a.query(query);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.f37325a.setForeignKeyConstraintsEnabled(z);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f37325a.setLocale(locale);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i) {
        this.f37325a.setMaxSqlCacheSize(i);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public long setMaximumSize(long j) {
        return this.f37325a.setMaximumSize(j);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.f37325a.setPageSize(j);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.f37326b.execute(new Runnable() { // from class: Xq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52900g(QueryInterceptorDatabase.this);
            }
        });
        this.f37325a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.f37325a.setVersion(i);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public int update(@NotNull String table, int i, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f37325a.update(table, i, values, str, objArr);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.f37325a.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j) {
        return this.f37325a.yieldIfContendedSafely(j);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    public void execSQL(@NotNull final String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        List createListBuilder = AbstractC10108ds.createListBuilder();
        AbstractC10410hs.addAll(createListBuilder, bindArgs);
        final List build = AbstractC10108ds.build(createListBuilder);
        this.f37326b.execute(new Runnable() { // from class: Zq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52899i(QueryInterceptorDatabase.this, sql, build);
            }
        });
        this.f37325a.execSQL(sql, build.toArray(new Object[0]));
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull final String query, @NotNull final Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f37326b.execute(new Runnable() { // from class: Uq1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52896l(QueryInterceptorDatabase.this, query, bindArgs);
            }
        });
        return this.f37325a.query(query, bindArgs);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull final SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.f37326b.execute(new Runnable() { // from class: ar1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52892p(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.f37325a.query(query);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull final SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.f37326b.execute(new Runnable() { // from class: cr1
            {
                QueryInterceptorDatabase.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.m52891q(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.f37325a.query(query);
    }
}
