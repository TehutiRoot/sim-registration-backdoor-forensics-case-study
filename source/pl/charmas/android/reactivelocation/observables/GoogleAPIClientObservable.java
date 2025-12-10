package pl.charmas.android.reactivelocation.observables;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import p046rx.Observable;
import p046rx.Observer;

/* loaded from: classes5.dex */
public class GoogleAPIClientObservable extends BaseObservable<GoogleApiClient> {
    @SafeVarargs
    public GoogleAPIClientObservable(Context context, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        super(context, apiArr);
    }

    @SafeVarargs
    public static Observable<GoogleApiClient> create(Context context, Api<? extends Api.ApiOptions.NotRequiredOptions>... apiArr) {
        return Observable.create(new GoogleAPIClientObservable(context, apiArr));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super GoogleApiClient> observer) {
        observer.onNext(googleApiClient);
        observer.onCompleted();
    }
}
