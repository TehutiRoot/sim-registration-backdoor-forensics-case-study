package pl.charmas.android.reactivelocation.observables.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;
import pl.charmas.android.reactivelocation.observables.StatusException;

/* loaded from: classes5.dex */
public class MockLocationObservable extends BaseLocationObservable<Status> {

    /* renamed from: c */
    public Observable f76733c;

    /* renamed from: d */
    public Subscription f76734d;

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.MockLocationObservable$a */
    /* loaded from: classes5.dex */
    public class C13130a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f76735a;

        /* renamed from: b */
        public final /* synthetic */ GoogleApiClient f76736b;

        public C13130a(Observer observer, GoogleApiClient googleApiClient) {
            this.f76735a = observer;
            this.f76736b = googleApiClient;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (status.isSuccess()) {
                MockLocationObservable.this.m23602b(this.f76736b, this.f76735a);
            } else {
                this.f76735a.onError(new StatusException(status));
            }
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.MockLocationObservable$b */
    /* loaded from: classes5.dex */
    public class C13131b implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ GoogleApiClient f76738a;

        /* renamed from: b */
        public final /* synthetic */ Observer f76739b;

        /* renamed from: pl.charmas.android.reactivelocation.observables.location.MockLocationObservable$b$a */
        /* loaded from: classes5.dex */
        public class C13132a implements ResultCallback {
            public C13132a() {
            }

            @Override // com.google.android.gms.common.api.ResultCallback
            /* renamed from: a */
            public void onResult(Status status) {
                if (!status.isSuccess()) {
                    C13131b.this.f76739b.onError(new StatusException(status));
                } else {
                    C13131b.this.f76739b.onNext(status);
                }
            }
        }

        public C13131b(GoogleApiClient googleApiClient, Observer observer) {
            this.f76738a = googleApiClient;
            this.f76739b = observer;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Location location) {
            LocationServices.FusedLocationApi.setMockLocation(this.f76738a, location).setResultCallback(new C13132a());
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.MockLocationObservable$c */
    /* loaded from: classes5.dex */
    public class C13133c implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Observer f76742a;

        public C13133c(Observer observer) {
            this.f76742a = observer;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            this.f76742a.onError(th2);
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.MockLocationObservable$d */
    /* loaded from: classes5.dex */
    public class C13134d implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Observer f76744a;

        public C13134d(Observer observer) {
            this.f76744a = observer;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f76744a.onCompleted();
        }
    }

    public MockLocationObservable(Context context, Observable<Location> observable) {
        super(context);
        this.f76733c = observable;
    }

    public static Observable<Status> createObservable(Context context, Observable<Location> observable) {
        return Observable.create(new MockLocationObservable(context, observable));
    }

    /* renamed from: b */
    public final void m23602b(GoogleApiClient googleApiClient, Observer observer) {
        this.f76734d = this.f76733c.subscribe(new C13131b(googleApiClient, observer), new C13133c(observer), new C13134d(observer));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Status> observer) {
        LocationServices.FusedLocationApi.setMockMode(googleApiClient, true).setResultCallback(new C13130a(observer, googleApiClient));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onUnsubscribed(GoogleApiClient googleApiClient) {
        if (googleApiClient.isConnected()) {
            try {
                LocationServices.FusedLocationApi.setMockMode(googleApiClient, false);
            } catch (SecurityException unused) {
            }
        }
        Subscription subscription = this.f76734d;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.f76734d.unsubscribe();
        }
    }
}
