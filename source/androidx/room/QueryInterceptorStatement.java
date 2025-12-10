package androidx.room;

import androidx.room.QueryInterceptorStatement;
import androidx.room.RoomDatabase;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m28850d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "", "sqlStatement", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "bindIndex", "", "value", "", OperatorName.ENDPATH, "(ILjava/lang/Object;)V", "close", "()V", "execute", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", FirebaseAnalytics.Param.INDEX, "bindNull", "(I)V", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/sqlite/db/SupportSQLiteStatement;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", OperatorName.CURVE_TO, "Ljava/util/concurrent/Executor;", "d", "Landroidx/room/RoomDatabase$QueryCallback;", "", "e", "Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* renamed from: a */
    public final SupportSQLiteStatement f37335a;

    /* renamed from: b */
    public final String f37336b;

    /* renamed from: c */
    public final Executor f37337c;

    /* renamed from: d */
    public final RoomDatabase.QueryCallback f37338d;

    /* renamed from: e */
    public final List f37339e;

    public QueryInterceptorStatement(@NotNull SupportSQLiteStatement delegate, @NotNull String sqlStatement, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f37335a = delegate;
        this.f37336b = sqlStatement;
        this.f37337c = queryCallbackExecutor;
        this.f37338d = queryCallback;
        this.f37339e = new ArrayList();
    }

    /* renamed from: b */
    public static /* synthetic */ void m52880b(QueryInterceptorStatement queryInterceptorStatement) {
        m52870p(queryInterceptorStatement);
    }

    /* renamed from: d */
    public static /* synthetic */ void m52879d(QueryInterceptorStatement queryInterceptorStatement) {
        m52871o(queryInterceptorStatement);
    }

    /* renamed from: g */
    public static /* synthetic */ void m52878g(QueryInterceptorStatement queryInterceptorStatement) {
        m52875k(queryInterceptorStatement);
    }

    /* renamed from: i */
    public static /* synthetic */ void m52877i(QueryInterceptorStatement queryInterceptorStatement) {
        m52874l(queryInterceptorStatement);
    }

    /* renamed from: j */
    public static /* synthetic */ void m52876j(QueryInterceptorStatement queryInterceptorStatement) {
        m52873m(queryInterceptorStatement);
    }

    /* renamed from: k */
    public static final void m52875k(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37338d.onQuery(this$0.f37336b, this$0.f37339e);
    }

    /* renamed from: l */
    public static final void m52874l(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37338d.onQuery(this$0.f37336b, this$0.f37339e);
    }

    /* renamed from: m */
    public static final void m52873m(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37338d.onQuery(this$0.f37336b, this$0.f37339e);
    }

    /* renamed from: n */
    private final void m52872n(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f37339e.size()) {
            int size = (i2 - this.f37339e.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.f37339e.add(null);
            }
        }
        this.f37339e.set(i2, obj);
    }

    /* renamed from: o */
    public static final void m52871o(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37338d.onQuery(this$0.f37336b, this$0.f37339e);
    }

    /* renamed from: p */
    public static final void m52870p(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f37338d.onQuery(this$0.f37336b, this$0.f37339e);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m52872n(i, value);
        this.f37335a.bindBlob(i, value);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        m52872n(i, Double.valueOf(d));
        this.f37335a.bindDouble(i, d);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        m52872n(i, Long.valueOf(j));
        this.f37335a.bindLong(i, j);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindNull(int i) {
        m52872n(i, null);
        this.f37335a.bindNull(i);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m52872n(i, value);
        this.f37335a.bindString(i, value);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void clearBindings() {
        this.f37339e.clear();
        this.f37335a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37335a.close();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public void execute() {
        this.f37337c.execute(new Runnable() { // from class: gr1
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.m52878g(QueryInterceptorStatement.this);
            }
        });
        this.f37335a.execute();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public long executeInsert() {
        this.f37337c.execute(new Runnable() { // from class: er1
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.m52877i(QueryInterceptorStatement.this);
            }
        });
        return this.f37335a.executeInsert();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.f37337c.execute(new Runnable() { // from class: hr1
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.m52876j(QueryInterceptorStatement.this);
            }
        });
        return this.f37335a.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.f37337c.execute(new Runnable() { // from class: dr1
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.m52879d(QueryInterceptorStatement.this);
            }
        });
        return this.f37335a.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        this.f37337c.execute(new Runnable() { // from class: fr1
            {
                QueryInterceptorStatement.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.m52880b(QueryInterceptorStatement.this);
            }
        });
        return this.f37335a.simpleQueryForString();
    }
}
