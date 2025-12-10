package pl.charmas.android.reactivelocation.observables.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;

/* loaded from: classes5.dex */
public class LastKnownLocationObservable extends BaseLocationObservable<Location> {
    public LastKnownLocationObservable(Context context) {
        super(context);
    }

    public static Observable<Location> createObservable(Context context) {
        return Observable.create(new LastKnownLocationObservable(context));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Location> observer) {
        Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        if (lastLocation != null) {
            observer.onNext(lastLocation);
        }
        observer.onCompleted();
    }
}
