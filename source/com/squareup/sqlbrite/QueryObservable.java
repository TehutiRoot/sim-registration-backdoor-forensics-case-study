package com.squareup.sqlbrite;

import android.database.Cursor;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.squareup.sqlbrite.SqlBrite;
import java.util.List;
import p046rx.Observable;
import p046rx.functions.Func1;

/* loaded from: classes5.dex */
public final class QueryObservable extends Observable<SqlBrite.Query> {
    public QueryObservable(Observable.OnSubscribe<SqlBrite.Query> onSubscribe) {
        super(onSubscribe);
    }

    @NonNull
    @CheckResult
    public final <T> Observable<List<T>> mapToList(@NonNull Func1<Cursor, T> func1) {
        return (Observable<List<T>>) lift(SqlBrite.Query.mapToList(func1));
    }

    @NonNull
    @CheckResult
    public final <T> Observable<T> mapToOne(@NonNull Func1<Cursor, T> func1) {
        return (Observable<T>) lift(SqlBrite.Query.mapToOne(func1));
    }

    @NonNull
    @CheckResult
    public final <T> Observable<T> mapToOneOrDefault(@NonNull Func1<Cursor, T> func1, T t) {
        return (Observable<T>) lift(SqlBrite.Query.mapToOneOrDefault(func1, t));
    }
}
