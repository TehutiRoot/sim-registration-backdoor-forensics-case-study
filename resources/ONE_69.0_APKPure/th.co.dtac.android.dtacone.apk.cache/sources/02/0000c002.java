package com.squareup.sqlbrite;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.sqlbrite.SqlBrite;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* loaded from: classes5.dex */
public final class BriteContentResolver {

    /* renamed from: a */
    public final Handler f59097a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final ContentResolver f59098b;

    /* renamed from: c */
    public final SqlBrite.Logger f59099c;

    /* renamed from: d */
    public final Scheduler f59100d;

    /* renamed from: e */
    public final Observable.Transformer f59101e;

    /* renamed from: f */
    public volatile boolean f59102f;

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$a */
    /* loaded from: classes5.dex */
    public class C9805a extends SqlBrite.Query {

        /* renamed from: a */
        public final /* synthetic */ Uri f59103a;

        /* renamed from: b */
        public final /* synthetic */ String[] f59104b;

        /* renamed from: c */
        public final /* synthetic */ String f59105c;

        /* renamed from: d */
        public final /* synthetic */ String[] f59106d;

        /* renamed from: e */
        public final /* synthetic */ String f59107e;

        /* renamed from: f */
        public final /* synthetic */ boolean f59108f;

        public C9805a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z) {
            this.f59103a = uri;
            this.f59104b = strArr;
            this.f59105c = str;
            this.f59106d = strArr2;
            this.f59107e = str2;
            this.f59108f = z;
        }

        @Override // com.squareup.sqlbrite.SqlBrite.Query
        public Cursor run() {
            long nanoTime = System.nanoTime();
            Cursor query = BriteContentResolver.this.f59098b.query(this.f59103a, this.f59104b, this.f59105c, this.f59106d, this.f59107e);
            if (BriteContentResolver.this.f59102f) {
                BriteContentResolver.this.m33196a("QUERY (%sms)\n  uri: %s\n  projection: %s\n  selection: %s\n  selectionArgs: %s\n  sortOrder: %s\n  notifyForDescendents: %s", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime)), this.f59103a, Arrays.toString(this.f59104b), this.f59105c, Arrays.toString(this.f59106d), this.f59107e, Boolean.valueOf(this.f59108f));
            }
            return query;
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b */
    /* loaded from: classes5.dex */
    public class C9806b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ SqlBrite.Query f59110a;

        /* renamed from: b */
        public final /* synthetic */ Uri f59111b;

        /* renamed from: c */
        public final /* synthetic */ boolean f59112c;

        /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b$a */
        /* loaded from: classes5.dex */
        public class C9807a extends ContentObserver {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f59114a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9807a(Handler handler, Subscriber subscriber) {
                super(handler);
                this.f59114a = subscriber;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                this.f59114a.onNext(C9806b.this.f59110a);
            }
        }

        /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b$b */
        /* loaded from: classes5.dex */
        public class C9808b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ ContentObserver f59116a;

            public C9808b(ContentObserver contentObserver) {
                this.f59116a = contentObserver;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                BriteContentResolver.this.f59098b.unregisterContentObserver(this.f59116a);
            }
        }

        public C9806b(SqlBrite.Query query, Uri uri, boolean z) {
            this.f59110a = query;
            this.f59111b = uri;
            this.f59112c = z;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            C9807a c9807a = new C9807a(BriteContentResolver.this.f59097a, subscriber);
            BriteContentResolver.this.f59098b.registerContentObserver(this.f59111b, this.f59112c, c9807a);
            subscriber.add(Subscriptions.create(new C9808b(c9807a)));
            subscriber.onNext(this.f59110a);
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$c */
    /* loaded from: classes5.dex */
    public class C9809c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f59118a;

        public C9809c(Observable observable) {
            this.f59118a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f59118a.unsafeSubscribe(subscriber);
        }
    }

    public BriteContentResolver(ContentResolver contentResolver, SqlBrite.Logger logger, Scheduler scheduler, Observable.Transformer transformer) {
        this.f59098b = contentResolver;
        this.f59099c = logger;
        this.f59100d = scheduler;
        this.f59101e = transformer;
    }

    /* renamed from: a */
    public void m33196a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f59099c.log(str);
    }

    @NonNull
    @CheckResult
    public QueryObservable createQuery(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, boolean z) {
        return new QueryObservable(new C9809c(Observable.create(new C9806b(new C9805a(uri, strArr, str, strArr2, str2, z), uri, z)).onBackpressureLatest().observeOn(this.f59100d).compose(this.f59101e).onBackpressureLatest()));
    }

    public void setLoggingEnabled(boolean z) {
        this.f59102f = z;
    }
}