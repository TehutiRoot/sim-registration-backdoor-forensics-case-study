package pl.charmas.android.reactivelocation.observables.geofence;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;
import pl.charmas.android.reactivelocation.observables.StatusException;

/* loaded from: classes5.dex */
public class AddGeofenceObservable extends BaseLocationObservable<Status> {

    /* renamed from: c */
    public final GeofencingRequest f76721c;

    /* renamed from: d */
    public final PendingIntent f76722d;

    /* renamed from: pl.charmas.android.reactivelocation.observables.geofence.AddGeofenceObservable$a */
    /* loaded from: classes5.dex */
    public class C13127a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f76723a;

        public C13127a(Observer observer) {
            this.f76723a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (!status.isSuccess()) {
                this.f76723a.onError(new StatusException(status));
                return;
            }
            this.f76723a.onNext(status);
            this.f76723a.onCompleted();
        }
    }

    public AddGeofenceObservable(Context context, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(context);
        this.f76721c = geofencingRequest;
        this.f76722d = pendingIntent;
    }

    public static Observable<Status> createObservable(Context context, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return Observable.create(new AddGeofenceObservable(context, geofencingRequest, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Status> observer) {
        LocationServices.GeofencingApi.addGeofences(googleApiClient, this.f76721c, this.f76722d).setResultCallback(new C13127a(observer));
    }
}
