package com.squareup.sqlbrite;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Func1;

/* loaded from: classes5.dex */
public final class SqlBrite {

    /* renamed from: c */
    public static final Logger f59132c = new C9829a();

    /* renamed from: d */
    public static final Observable.Transformer f59133d = new C9830b();

    /* renamed from: a */
    public final Logger f59134a;

    /* renamed from: b */
    public final Observable.Transformer f59135b;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public Logger f59136a = SqlBrite.f59132c;

        /* renamed from: b */
        public Observable.Transformer f59137b = SqlBrite.f59133d;

        @CheckResult
        public SqlBrite build() {
            return new SqlBrite(this.f59136a, this.f59137b, null);
        }

        @CheckResult
        public Builder logger(@NonNull Logger logger) {
            if (logger != null) {
                this.f59136a = logger;
                return this;
            }
            throw new NullPointerException("logger == null");
        }

        @CheckResult
        public Builder queryTransformer(@NonNull Observable.Transformer<Query, Query> transformer) {
            if (transformer != null) {
                this.f59137b = transformer;
                return this;
            }
            throw new NullPointerException("queryTransformer == null");
        }
    }

    /* loaded from: classes5.dex */
    public interface Logger {
        void log(String str);
    }

    /* loaded from: classes5.dex */
    public static abstract class Query {

        /* renamed from: com.squareup.sqlbrite.SqlBrite$Query$a */
        /* loaded from: classes5.dex */
        public class C9828a implements Observable.OnSubscribe {

            /* renamed from: a */
            public final /* synthetic */ Func1 f59138a;

            public C9828a(Func1 func1) {
                this.f59138a = func1;
            }

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber subscriber) {
                Cursor run = Query.this.run();
                if (run != null) {
                    while (run.moveToNext() && !subscriber.isUnsubscribed()) {
                        try {
                            subscriber.onNext(this.f59138a.call(run));
                        } finally {
                            run.close();
                        }
                    }
                }
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
            }
        }

        @NonNull
        @CheckResult
        public static <T> Observable.Operator<List<T>, Query> mapToList(@NonNull Func1<Cursor, T> func1) {
            return new C9831a(func1);
        }

        @NonNull
        @CheckResult
        public static <T> Observable.Operator<T, Query> mapToOne(@NonNull Func1<Cursor, T> func1) {
            return new C9833b(func1, false, null);
        }

        @NonNull
        @CheckResult
        public static <T> Observable.Operator<T, Query> mapToOneOrDefault(@NonNull Func1<Cursor, T> func1, T t) {
            return new C9833b(func1, true, t);
        }

        @NonNull
        @CheckResult
        public final <T> Observable<T> asRows(Func1<Cursor, T> func1) {
            return Observable.create(new C9828a(func1));
        }

        @Nullable
        @CheckResult
        public abstract Cursor run();
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$a */
    /* loaded from: classes5.dex */
    public static class C9829a implements Logger {
        @Override // com.squareup.sqlbrite.SqlBrite.Logger
        public void log(String str) {
        }
    }

    /* renamed from: com.squareup.sqlbrite.SqlBrite$b */
    /* loaded from: classes5.dex */
    public static class C9830b implements Observable.Transformer {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return observable;
        }
    }

    public /* synthetic */ SqlBrite(Logger logger, Observable.Transformer transformer, C9829a c9829a) {
        this(logger, transformer);
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static SqlBrite create() {
        return new SqlBrite(f59132c, f59133d);
    }

    @NonNull
    @CheckResult
    public BriteContentResolver wrapContentProvider(@NonNull ContentResolver contentResolver, @NonNull Scheduler scheduler) {
        return new BriteContentResolver(contentResolver, this.f59134a, scheduler, this.f59135b);
    }

    @NonNull
    @CheckResult
    public BriteDatabase wrapDatabaseHelper(@NonNull SQLiteOpenHelper sQLiteOpenHelper, @NonNull Scheduler scheduler) {
        return new BriteDatabase(sQLiteOpenHelper, this.f59134a, scheduler, this.f59135b);
    }

    public SqlBrite(Logger logger, Observable.Transformer transformer) {
        this.f59134a = logger;
        this.f59135b = transformer;
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static SqlBrite create(@NonNull Logger logger) {
        if (logger != null) {
            return new SqlBrite(logger, f59133d);
        }
        throw new NullPointerException("logger == null");
    }
}
