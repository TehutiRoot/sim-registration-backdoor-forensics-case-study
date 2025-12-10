package pl.charmas.android.reactivelocation.observables;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
import java.util.List;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* loaded from: classes5.dex */
public abstract class BaseObservable<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Context f76696a;

    /* renamed from: b */
    public final List f76697b;

    /* renamed from: pl.charmas.android.reactivelocation.observables.BaseObservable$a */
    /* loaded from: classes5.dex */
    public class C13122a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ GoogleApiClient f76698a;

        public C13122a(GoogleApiClient googleApiClient) {
            this.f76698a = googleApiClient;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f76698a.isConnected() || this.f76698a.isConnecting()) {
                BaseObservable.this.onUnsubscribed(this.f76698a);
                this.f76698a.disconnect();
            }
        }
    }

    /* renamed from: pl.charmas.android.reactivelocation.observables.BaseObservable$b */
    /* loaded from: classes5.dex */
    public class C13123b implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: a */
        public final Observer f76700a;

        /* renamed from: b */
        public GoogleApiClient f76701b;

        public /* synthetic */ C13123b(BaseObservable baseObservable, Observer observer, C13122a c13122a) {
            this(observer);
        }

        /* renamed from: a */
        public void m23610a(GoogleApiClient googleApiClient) {
            this.f76701b = googleApiClient;
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            try {
                BaseObservable.this.onGoogleApiClientReady(this.f76701b, this.f76700a);
            } catch (Throwable th2) {
                this.f76700a.onError(th2);
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.f76700a.onError(new GoogleAPIConnectionException("Error connecting to GoogleApiClient.", connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            this.f76700a.onError(new GoogleAPIConnectionSuspendedException(i));
        }

        public C13123b(Observer observer) {
            this.f76700a = observer;
        }
    }

    @SafeVarargs
    public BaseObservable(Context context, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        this.f76696a = context;
        this.f76697b = Arrays.asList(apiArr);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public GoogleApiClient createApiClient(Subscriber<? super T> subscriber) {
        C13123b c13123b = new C13123b(this, subscriber, null);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f76696a);
        for (Api<? extends Api.ApiOptions.NotRequiredOptions> api : this.f76697b) {
            builder.addApi(api);
        }
        builder.addConnectionCallbacks(c13123b);
        builder.addOnConnectionFailedListener(c13123b);
        GoogleApiClient build = builder.build();
        c13123b.m23610a(build);
        return build;
    }

    public abstract void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super T> observer);

    public void onUnsubscribed(GoogleApiClient googleApiClient) {
    }

    public void call(Subscriber<? super T> subscriber) {
        GoogleApiClient createApiClient = createApiClient(subscriber);
        try {
            createApiClient.connect();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
        subscriber.add(Subscriptions.create(new C13122a(createApiClient)));
    }
}
