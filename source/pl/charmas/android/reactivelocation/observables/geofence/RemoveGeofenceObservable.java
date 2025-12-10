package pl.charmas.android.reactivelocation.observables.geofence;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p046rx.Observable;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.BaseLocationObservable;

/* loaded from: classes5.dex */
public abstract class RemoveGeofenceObservable<T> extends BaseLocationObservable<T> {
    public RemoveGeofenceObservable(Context context) {
        super(context);
    }

    public static Observable<Status> createObservable(Context context, PendingIntent pendingIntent) {
        return Observable.create(new C23217yv1(context, pendingIntent));
    }

    @Override // pl.charmas.android.reactivelocation.observables.BaseObservable
    public void onGoogleApiClientReady(GoogleApiClient googleApiClient, Observer<? super T> observer) {
        removeGeofences(googleApiClient, observer);
    }

    public abstract void removeGeofences(GoogleApiClient googleApiClient, Observer<? super T> observer);

    public static Observable<Status> createObservable(Context context, List<String> list) {
        return Observable.create(new C23389zv1(context, list));
    }
}
