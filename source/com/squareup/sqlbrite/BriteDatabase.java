package com.squareup.sqlbrite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.pattern.parser.Parser;
import com.squareup.sqlbrite.SqlBrite;
import io.reactivex.annotations.SchedulerSupport;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.subjects.PublishSubject;

/* loaded from: classes5.dex */
public final class BriteDatabase implements Closeable {

    /* renamed from: a */
    public final SQLiteOpenHelper f59108a;

    /* renamed from: b */
    public final SqlBrite.Logger f59109b;

    /* renamed from: c */
    public final Observable.Transformer f59110c;

    /* renamed from: h */
    public volatile SQLiteDatabase f59115h;

    /* renamed from: i */
    public volatile SQLiteDatabase f59116i;

    /* renamed from: k */
    public final Scheduler f59118k;

    /* renamed from: l */
    public volatile boolean f59119l;

    /* renamed from: d */
    public final ThreadLocal f59111d = new ThreadLocal();

    /* renamed from: e */
    public final PublishSubject f59112e = PublishSubject.create();

    /* renamed from: f */
    public final Transaction f59113f = new C9821a();

    /* renamed from: g */
    public final Action0 f59114g = new C9822b();

    /* renamed from: j */
    public final Object f59117j = new Object();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ConflictAlgorithm {
    }

    /* loaded from: classes5.dex */
    public static final class SqliteTransaction extends LinkedHashSet<String> implements SQLiteTransactionListener {
        boolean commit;
        final SqliteTransaction parent;

        public SqliteTransaction(SqliteTransaction sqliteTransaction) {
            this.parent = sqliteTransaction;
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            this.commit = true;
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String format = String.format("%08x", Integer.valueOf(System.identityHashCode(this)));
            if (this.parent != null) {
                return format + " [" + this.parent.toString() + AbstractJsonLexerKt.END_LIST;
            }
            return format;
        }
    }

    /* loaded from: classes5.dex */
    public interface Transaction extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void end();

        void markSuccessful();

        boolean yieldIfContendedSafely();

        boolean yieldIfContendedSafely(long j, TimeUnit timeUnit);
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$a */
    /* loaded from: classes5.dex */
    public class C9821a implements Transaction {
        public C9821a() {
        }

        @Override // com.squareup.sqlbrite.BriteDatabase.Transaction, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            end();
        }

        @Override // com.squareup.sqlbrite.BriteDatabase.Transaction
        public void end() {
            SqliteTransaction sqliteTransaction = (SqliteTransaction) BriteDatabase.this.f59111d.get();
            if (sqliteTransaction != null) {
                BriteDatabase.this.f59111d.set(sqliteTransaction.parent);
                if (BriteDatabase.this.f59119l) {
                    BriteDatabase.this.m33196k("TXN END %s", sqliteTransaction);
                }
                BriteDatabase.this.m33198i().endTransaction();
                if (sqliteTransaction.commit) {
                    BriteDatabase.this.m33195l(sqliteTransaction);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not in transaction.");
        }

        @Override // com.squareup.sqlbrite.BriteDatabase.Transaction
        public void markSuccessful() {
            if (BriteDatabase.this.f59119l) {
                BriteDatabase briteDatabase = BriteDatabase.this;
                briteDatabase.m33196k("TXN SUCCESS %s", briteDatabase.f59111d.get());
            }
            BriteDatabase.this.m33198i().setTransactionSuccessful();
        }

        @Override // com.squareup.sqlbrite.BriteDatabase.Transaction
        public boolean yieldIfContendedSafely() {
            return BriteDatabase.this.m33198i().yieldIfContendedSafely();
        }

        @Override // com.squareup.sqlbrite.BriteDatabase.Transaction
        public boolean yieldIfContendedSafely(long j, TimeUnit timeUnit) {
            return BriteDatabase.this.m33198i().yieldIfContendedSafely(timeUnit.toMillis(j));
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$b */
    /* loaded from: classes5.dex */
    public class C9822b implements Action0 {
        public C9822b() {
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (BriteDatabase.this.f59111d.get() == null) {
                return;
            }
            throw new IllegalStateException("Cannot subscribe to observable query in a transaction.");
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$c */
    /* loaded from: classes5.dex */
    public class C9823c implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ String f59122a;

        public C9823c(String str) {
            this.f59122a = str;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Set set) {
            return Boolean.valueOf(set.contains(this.f59122a));
        }

        public String toString() {
            return this.f59122a;
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$d */
    /* loaded from: classes5.dex */
    public class C9824d implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Iterable f59124a;

        public C9824d(Iterable iterable) {
            this.f59124a = iterable;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Set set) {
            for (String str : this.f59124a) {
                if (set.contains(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }

        public String toString() {
            return this.f59124a.toString();
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$e */
    /* loaded from: classes5.dex */
    public class C9825e implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f59126a;

        public C9825e(Observable observable) {
            this.f59126a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f59126a.unsafeSubscribe(subscriber);
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteDatabase$f */
    /* loaded from: classes5.dex */
    public final class C9826f extends SqlBrite.Query implements Func1 {

        /* renamed from: a */
        public final Func1 f59128a;

        /* renamed from: b */
        public final String f59129b;

        /* renamed from: c */
        public final String[] f59130c;

        public C9826f(Func1 func1, String str, String... strArr) {
            this.f59128a = func1;
            this.f59129b = str;
            this.f59130c = strArr;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public SqlBrite.Query call(Set set) {
            return this;
        }

        @Override // com.squareup.sqlbrite.SqlBrite.Query
        public Cursor run() {
            if (BriteDatabase.this.f59111d.get() == null) {
                long nanoTime = System.nanoTime();
                Cursor rawQuery = BriteDatabase.this.m33199g().rawQuery(this.f59129b, this.f59130c);
                if (BriteDatabase.this.f59119l) {
                    BriteDatabase.this.m33196k("QUERY (%sms)\n  tables: %s\n  sql: %s\n  args: %s", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime)), this.f59128a, BriteDatabase.m33197j(this.f59129b), Arrays.toString(this.f59130c));
                }
                return rawQuery;
            }
            throw new IllegalStateException("Cannot execute observable query in a transaction.");
        }

        public String toString() {
            return this.f59129b;
        }
    }

    public BriteDatabase(SQLiteOpenHelper sQLiteOpenHelper, SqlBrite.Logger logger, Scheduler scheduler, Observable.Transformer transformer) {
        this.f59108a = sQLiteOpenHelper;
        this.f59109b = logger;
        this.f59118k = scheduler;
        this.f59110c = transformer;
    }

    /* renamed from: b */
    public static String m33201b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return "unknown (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                            }
                            return Parser.REPLACE_CONVERTER_WORD;
                        }
                        return "ignore";
                    }
                    return "fail";
                }
                return "abort";
            }
            return "rollback";
        }
        return SchedulerSupport.NONE;
    }

    /* renamed from: j */
    public static String m33197j(String str) {
        return str.replace("\n", "\n       ");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f59117j) {
            this.f59115h = null;
            this.f59116i = null;
            this.f59108a.close();
        }
    }

    @NonNull
    @CheckResult
    public QueryObservable createQuery(@NonNull String str, @NonNull String str2, @NonNull String... strArr) {
        return m33200d(new C9823c(str), str2, strArr);
    }

    /* renamed from: d */
    public final QueryObservable m33200d(Func1 func1, String str, String... strArr) {
        if (this.f59111d.get() == null) {
            C9826f c9826f = new C9826f(func1, str, strArr);
            return new QueryObservable(new C9825e(this.f59112e.filter(func1).map(c9826f).onBackpressureLatest().startWith((Observable) c9826f).observeOn(this.f59118k).compose(this.f59110c).onBackpressureLatest().doOnSubscribe(this.f59114g)));
        }
        throw new IllegalStateException("Cannot create observable query in transaction. Use query() for a query inside a transaction.");
    }

    public int delete(@NonNull String str, @Nullable String str2, @Nullable String... strArr) {
        String str3;
        SQLiteDatabase m33198i = m33198i();
        if (this.f59119l) {
            m33196k("DELETE\n  table: %s\n  whereClause: %s\n  whereArgs: %s", str, str2, Arrays.toString(strArr));
        }
        int delete = m33198i.delete(str, str2, strArr);
        if (this.f59119l) {
            Integer valueOf = Integer.valueOf(delete);
            if (delete != 1) {
                str3 = "rows";
            } else {
                str3 = "row";
            }
            m33196k("DELETE affected %s %s", valueOf, str3);
        }
        if (delete > 0) {
            m33195l(Collections.singleton(str));
        }
        return delete;
    }

    public void execute(String str) {
        if (this.f59119l) {
            m33196k("EXECUTE\n  sql: %s", str);
        }
        m33198i().execSQL(str);
    }

    public void executeAndTrigger(String str, String str2) {
        executeAndTrigger(Collections.singleton(str), str2);
    }

    public long executeInsert(String str, SQLiteStatement sQLiteStatement) {
        return executeInsert(Collections.singleton(str), sQLiteStatement);
    }

    @RequiresApi(11)
    public int executeUpdateDelete(String str, SQLiteStatement sQLiteStatement) {
        return executeUpdateDelete(Collections.singleton(str), sQLiteStatement);
    }

    /* renamed from: g */
    public SQLiteDatabase m33199g() {
        SQLiteDatabase sQLiteDatabase = this.f59115h;
        if (sQLiteDatabase == null) {
            synchronized (this.f59117j) {
                try {
                    sQLiteDatabase = this.f59115h;
                    if (sQLiteDatabase == null) {
                        if (this.f59119l) {
                            m33196k("Creating readable database", new Object[0]);
                        }
                        sQLiteDatabase = this.f59108a.getReadableDatabase();
                        this.f59115h = sQLiteDatabase;
                    }
                } finally {
                }
            }
        }
        return sQLiteDatabase;
    }

    /* renamed from: i */
    public SQLiteDatabase m33198i() {
        SQLiteDatabase sQLiteDatabase = this.f59116i;
        if (sQLiteDatabase == null) {
            synchronized (this.f59117j) {
                try {
                    sQLiteDatabase = this.f59116i;
                    if (sQLiteDatabase == null) {
                        if (this.f59119l) {
                            m33196k("Creating writeable database", new Object[0]);
                        }
                        sQLiteDatabase = this.f59108a.getWritableDatabase();
                        this.f59116i = sQLiteDatabase;
                    }
                } finally {
                }
            }
        }
        return sQLiteDatabase;
    }

    public long insert(@NonNull String str, @NonNull ContentValues contentValues) {
        return insert(str, contentValues, 0);
    }

    /* renamed from: k */
    public void m33196k(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f59109b.log(str);
    }

    /* renamed from: l */
    public void m33195l(Set set) {
        SqliteTransaction sqliteTransaction = (SqliteTransaction) this.f59111d.get();
        if (sqliteTransaction != null) {
            sqliteTransaction.addAll(set);
            return;
        }
        if (this.f59119l) {
            m33196k("TRIGGER %s", set);
        }
        this.f59112e.onNext(set);
    }

    @NonNull
    @CheckResult
    @RequiresApi(11)
    public Transaction newNonExclusiveTransaction() {
        SqliteTransaction sqliteTransaction = new SqliteTransaction((SqliteTransaction) this.f59111d.get());
        this.f59111d.set(sqliteTransaction);
        if (this.f59119l) {
            m33196k("TXN BEGIN %s", sqliteTransaction);
        }
        m33198i().beginTransactionWithListenerNonExclusive(sqliteTransaction);
        return this.f59113f;
    }

    @NonNull
    @CheckResult
    public Transaction newTransaction() {
        SqliteTransaction sqliteTransaction = new SqliteTransaction((SqliteTransaction) this.f59111d.get());
        this.f59111d.set(sqliteTransaction);
        if (this.f59119l) {
            m33196k("TXN BEGIN %s", sqliteTransaction);
        }
        m33198i().beginTransactionWithListener(sqliteTransaction);
        return this.f59113f;
    }

    @CheckResult
    public Cursor query(@NonNull String str, @NonNull String... strArr) {
        long nanoTime = System.nanoTime();
        Cursor rawQuery = m33199g().rawQuery(str, strArr);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        if (this.f59119l) {
            m33196k("QUERY (%sms)\n  sql: %s\n  args: %s", Long.valueOf(millis), m33197j(str), Arrays.toString(strArr));
        }
        return rawQuery;
    }

    public void setLoggingEnabled(boolean z) {
        this.f59119l = z;
    }

    public int update(@NonNull String str, @NonNull ContentValues contentValues, @Nullable String str2, @Nullable String... strArr) {
        return update(str, contentValues, 0, str2, strArr);
    }

    public void executeAndTrigger(Set<String> set, String str) {
        execute(str);
        m33195l(set);
    }

    public long executeInsert(Set<String> set, SQLiteStatement sQLiteStatement) {
        if (this.f59119l) {
            m33196k("EXECUTE\n %s", sQLiteStatement);
        }
        long executeInsert = sQLiteStatement.executeInsert();
        if (executeInsert != -1) {
            m33195l(set);
        }
        return executeInsert;
    }

    @RequiresApi(11)
    public int executeUpdateDelete(Set<String> set, SQLiteStatement sQLiteStatement) {
        if (this.f59119l) {
            m33196k("EXECUTE\n %s", sQLiteStatement);
        }
        int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (executeUpdateDelete > 0) {
            m33195l(set);
        }
        return executeUpdateDelete;
    }

    public long insert(@NonNull String str, @NonNull ContentValues contentValues, int i) {
        SQLiteDatabase m33198i = m33198i();
        if (this.f59119l) {
            m33196k("INSERT\n  table: %s\n  values: %s\n  conflictAlgorithm: %s", str, contentValues, m33201b(i));
        }
        long insertWithOnConflict = m33198i.insertWithOnConflict(str, null, contentValues, i);
        if (this.f59119l) {
            m33196k("INSERT id: %s", Long.valueOf(insertWithOnConflict));
        }
        if (insertWithOnConflict != -1) {
            m33195l(Collections.singleton(str));
        }
        return insertWithOnConflict;
    }

    public int update(@NonNull String str, @NonNull ContentValues contentValues, int i, @Nullable String str2, @Nullable String... strArr) {
        SQLiteDatabase m33198i = m33198i();
        if (this.f59119l) {
            m33196k("UPDATE\n  table: %s\n  values: %s\n  whereClause: %s\n  whereArgs: %s\n  conflictAlgorithm: %s", str, contentValues, str2, Arrays.toString(strArr), m33201b(i));
        }
        int updateWithOnConflict = m33198i.updateWithOnConflict(str, contentValues, str2, strArr, i);
        if (this.f59119l) {
            m33196k("UPDATE affected %s %s", Integer.valueOf(updateWithOnConflict), updateWithOnConflict != 1 ? "rows" : "row");
        }
        if (updateWithOnConflict > 0) {
            m33195l(Collections.singleton(str));
        }
        return updateWithOnConflict;
    }

    @NonNull
    @CheckResult
    public QueryObservable createQuery(@NonNull Iterable<String> iterable, @NonNull String str, @NonNull String... strArr) {
        return m33200d(new C9824d(iterable), str, strArr);
    }

    public void execute(String str, Object... objArr) {
        if (this.f59119l) {
            m33196k("EXECUTE\n  sql: %s\n  args: %s", str, Arrays.toString(objArr));
        }
        m33198i().execSQL(str, objArr);
    }

    public void executeAndTrigger(String str, String str2, Object... objArr) {
        executeAndTrigger(Collections.singleton(str), str2, objArr);
    }

    public void executeAndTrigger(Set<String> set, String str, Object... objArr) {
        execute(str, objArr);
        m33195l(set);
    }
}
