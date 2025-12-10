package pl.charmas.android.reactivelocation.observables.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;
import pl.charmas.android.reactivelocation.observables.StatusException;

/* loaded from: classes5.dex */
public class AddLocationIntentUpdatesObservable extends BaseLocationObservable<Status> {

    /* renamed from: c */
    public final LocationRequest f76725c;

    /* renamed from: d */
    public final PendingIntent f76726d;

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.AddLocationIntentUpdatesObservable$a */
    /* loaded from: classes5.dex */
    public class C13128a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f76727a;

        public C13128a(Observer observer) {
            this.f76727a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (!status.isSuccess()) {
                this.f76727a.onError(new StatusException(status));
                return;
            }
            this.f76727a.onNext(status);
            this.f76727a.onCompleted();
        }
    }

    public AddLocationIntentUpdatesObservable(Context context, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(context);
        this.f76725c = locationRequest;
        this.f76726d = pendingIntent;
    }

    public static Observable<Status> createObservable(Context context, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return Observable.create(new AddLocationIntentUpdatesObservable(context, locationRequest, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Status> observer) {
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, this.f76725c, this.f76726d).setResultCallback(new C13128a(observer));
    }
}
