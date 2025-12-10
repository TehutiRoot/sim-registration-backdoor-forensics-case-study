package pl.charmas.android.reactivelocation.observables.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;
import pl.charmas.android.reactivelocation.observables.StatusException;

/* loaded from: classes5.dex */
public class RemoveLocationIntentUpdatesObservable extends BaseLocationObservable<Status> {

    /* renamed from: c */
    public final PendingIntent f76746c;

    /* renamed from: pl.charmas.android.reactivelocation.observables.location.RemoveLocationIntentUpdatesObservable$a */
    /* loaded from: classes5.dex */
    public class C13135a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f76747a;

        public C13135a(Observer observer) {
            this.f76747a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (!status.isSuccess()) {
                this.f76747a.onError(new StatusException(status));
                return;
            }
            this.f76747a.onNext(status);
            this.f76747a.onCompleted();
        }
    }

    public RemoveLocationIntentUpdatesObservable(Context context, PendingIntent pendingIntent) {
        super(context);
        this.f76746c = pendingIntent;
    }

    public static Observable<Status> createObservable(Context context, PendingIntent pendingIntent) {
        return Observable.create(new RemoveLocationIntentUpdatesObservable(context, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super Status> observer) {
        LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this.f76746c).setResultCallback(new C13135a(observer));
    }
}
