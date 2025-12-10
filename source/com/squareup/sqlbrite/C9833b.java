package com.squareup.sqlbrite;

import android.database.Cursor;
import com.squareup.sqlbrite.SqlBrite;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;

/* renamed from: com.squareup.sqlbrite.b */
/* loaded from: classes5.dex */
public final class C9833b implements Observable.Operator {

    /* renamed from: a */
    public final Func1 f59143a;

    /* renamed from: b */
    public boolean f59144b;

    /* renamed from: c */
    public Object f59145c;

    /* renamed from: com.squareup.sqlbrite.b$a */
    /* loaded from: classes5.dex */
    public class C9834a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f59146a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9834a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f59146a = subscriber2;
        }

        @Override // p046rx.Observer
        /* renamed from: b */
        public void onNext(SqlBrite.Query query) {
            try {
                Cursor run = query.run();
                boolean z = false;
                Object obj = null;
                if (run != null) {
                    if (run.moveToNext()) {
                        obj = C9833b.this.f59143a.call(run);
                        if (!run.moveToNext()) {
                            z = true;
                        } else {
                            throw new IllegalStateException("Cursor returned more than 1 row");
                        }
                    }
                    run.close();
                }
                if (!this.f59146a.isUnsubscribed()) {
                    if (z) {
                        this.f59146a.onNext(obj);
                        return;
                    }
                    C9833b c9833b = C9833b.this;
                    if (c9833b.f59144b) {
                        this.f59146a.onNext(c9833b.f59145c);
                    } else {
                        request(1L);
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(OnErrorThrowable.addValueAsLastCause(th2, query.toString()));
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f59146a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f59146a.onError(th2);
        }
    }

    public C9833b(Func1 func1, boolean z, Object obj) {
        this.f59143a = func1;
        this.f59144b = z;
        this.f59145c = obj;
    }

    @Override // p046rx.functions.Func1
    /* renamed from: a */
    public Subscriber call(Subscriber subscriber) {
        return new C9834a(subscriber, subscriber);
    }
}
