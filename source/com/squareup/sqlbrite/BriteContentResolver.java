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
    public final Handler f59085a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final ContentResolver f59086b;

    /* renamed from: c */
    public final SqlBrite.Logger f59087c;

    /* renamed from: d */
    public final Scheduler f59088d;

    /* renamed from: e */
    public final Observable.Transformer f59089e;

    /* renamed from: f */
    public volatile boolean f59090f;

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$a */
    /* loaded from: classes5.dex */
    public class C9816a extends SqlBrite.Query {

        /* renamed from: a */
        public final /* synthetic */ Uri f59091a;

        /* renamed from: b */
        public final /* synthetic */ String[] f59092b;

        /* renamed from: c */
        public final /* synthetic */ String f59093c;

        /* renamed from: d */
        public final /* synthetic */ String[] f59094d;

        /* renamed from: e */
        public final /* synthetic */ String f59095e;

        /* renamed from: f */
        public final /* synthetic */ boolean f59096f;

        public C9816a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z) {
            this.f59091a = uri;
            this.f59092b = strArr;
            this.f59093c = str;
            this.f59094d = strArr2;
            this.f59095e = str2;
            this.f59096f = z;
        }

        @Override // com.squareup.sqlbrite.SqlBrite.Query
        public Cursor run() {
            long nanoTime = System.nanoTime();
            Cursor query = BriteContentResolver.this.f59086b.query(this.f59091a, this.f59092b, this.f59093c, this.f59094d, this.f59095e);
            if (BriteContentResolver.this.f59090f) {
                BriteContentResolver.this.m33204a("QUERY (%sms)\n  uri: %s\n  projection: %s\n  selection: %s\n  selectionArgs: %s\n  sortOrder: %s\n  notifyForDescendents: %s", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime)), this.f59091a, Arrays.toString(this.f59092b), this.f59093c, Arrays.toString(this.f59094d), this.f59095e, Boolean.valueOf(this.f59096f));
            }
            return query;
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b */
    /* loaded from: classes5.dex */
    public class C9817b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ SqlBrite.Query f59098a;

        /* renamed from: b */
        public final /* synthetic */ Uri f59099b;

        /* renamed from: c */
        public final /* synthetic */ boolean f59100c;

        /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b$a */
        /* loaded from: classes5.dex */
        public class C9818a extends ContentObserver {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f59102a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9818a(Handler handler, Subscriber subscriber) {
                super(handler);
                this.f59102a = subscriber;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                this.f59102a.onNext(C9817b.this.f59098a);
            }
        }

        /* renamed from: com.squareup.sqlbrite.BriteContentResolver$b$b */
        /* loaded from: classes5.dex */
        public class C9819b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ ContentObserver f59104a;

            public C9819b(ContentObserver contentObserver) {
                this.f59104a = contentObserver;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                BriteContentResolver.this.f59086b.unregisterContentObserver(this.f59104a);
            }
        }

        public C9817b(SqlBrite.Query query, Uri uri, boolean z) {
            this.f59098a = query;
            this.f59099b = uri;
            this.f59100c = z;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            C9818a c9818a = new C9818a(BriteContentResolver.this.f59085a, subscriber);
            BriteContentResolver.this.f59086b.registerContentObserver(this.f59099b, this.f59100c, c9818a);
            subscriber.add(Subscriptions.create(new C9819b(c9818a)));
            subscriber.onNext(this.f59098a);
        }
    }

    /* renamed from: com.squareup.sqlbrite.BriteContentResolver$c */
    /* loaded from: classes5.dex */
    public class C9820c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f59106a;

        public C9820c(Observable observable) {
            this.f59106a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f59106a.unsafeSubscribe(subscriber);
        }
    }

    public BriteContentResolver(ContentResolver contentResolver, SqlBrite.Logger logger, Scheduler scheduler, Observable.Transformer transformer) {
        this.f59086b = contentResolver;
        this.f59087c = logger;
        this.f59088d = scheduler;
        this.f59089e = transformer;
    }

    /* renamed from: a */
    public void m33204a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f59087c.log(str);
    }

    @NonNull
    @CheckResult
    public QueryObservable createQuery(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, boolean z) {
        return new QueryObservable(new C9820c(Observable.create(new C9817b(new C9816a(uri, strArr, str, strArr2, str2, z), uri, z)).onBackpressureLatest().observeOn(this.f59088d).compose(this.f59089e).onBackpressureLatest()));
    }

    public void setLoggingEnabled(boolean z) {
        this.f59090f = z;
    }
}
