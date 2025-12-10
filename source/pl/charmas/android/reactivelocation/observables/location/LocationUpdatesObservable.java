package pl.charmas.android.reactivelocation.observables.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;

/* loaded from: classes5.dex */
public class LocationUpdatesObservable extends BaseLocationObservable<Location> {

    /* renamed from: c */
    public final LocationRequest f76729c;

    /* renamed from: d */
    public LocationListener f76730d;

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.LocationUpdatesObservable$a */
    /* loaded from: classes5.dex */
    public class C13129a implements LocationListener {

        /* renamed from: a */
        public final /* synthetic */ Observer f76731a;

        public C13129a(Observer observer) {
            this.f76731a = observer;
        }

        @Override // com.google.android.gms.location.LocationListener
        public void onLocationChanged(Location location) {
            this.f76731a.onNext(location);
        }
    }

    public LocationUpdatesObservable(Context context, LocationRequest locationRequest) {
        super(context);
        this.f76729c = locationRequest;
    }

    public static Observable<Location> createObservable(Context context, LocationRequest locationRequest) {
        return Observable.create(new LocationUpdatesObservable(context, locationRequest));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Location> observer) {
        C13129a c13129a = new C13129a(observer);
        this.f76730d = c13129a;
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, this.f76729c, c13129a);
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onUnsubscribed(GoogleApiClient googleApiClient) {
        if (googleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this.f76730d);
        }
    }
}
