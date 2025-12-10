package com.squareup.sqlbrite;

import android.database.Cursor;
import com.squareup.sqlbrite.SqlBrite;
import java.util.ArrayList;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;

/* renamed from: com.squareup.sqlbrite.a */
/* loaded from: classes5.dex */
public final class C9831a implements Observable.Operator {

    /* renamed from: a */
    public final Func1 f59140a;

    /* renamed from: com.squareup.sqlbrite.a$a */
    /* loaded from: classes5.dex */
    public class C9832a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f59141a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9832a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f59141a = subscriber2;
        }

        @Override // p046rx.Observer
        /* renamed from: b */
        public void onNext(SqlBrite.Query query) {
            try {
                Cursor run = query.run();
                if (run != null && !this.f59141a.isUnsubscribed()) {
                    ArrayList arrayList = new ArrayList(run.getCount());
                    while (run.moveToNext()) {
                        arrayList.add(C9831a.this.f59140a.call(run));
                    }
                    run.close();
                    if (!this.f59141a.isUnsubscribed()) {
                        this.f59141a.onNext(arrayList);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(OnErrorThrowable.addValueAsLastCause(th2, query.toString()));
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f59141a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f59141a.onError(th2);
        }
    }

    public C9831a(Func1 func1) {
        this.f59140a = func1;
    }

    @Override // p046rx.functions.Func1
    /* renamed from: a */
    public Subscriber call(Subscriber subscriber) {
        return new C9832a(subscriber, subscriber);
    }
}
