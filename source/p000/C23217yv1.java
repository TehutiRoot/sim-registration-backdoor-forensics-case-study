package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.StatusException;
import pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable;

/* renamed from: yv1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C23217yv1 extends RemoveGeofenceObservable {

    /* renamed from: c */
    public final PendingIntent f108937c;

    /* renamed from: yv1$a */
    /* loaded from: classes5.dex */
    public class C17160a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f108938a;

        public C17160a(Observer observer) {
            this.f108938a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (status.isSuccess()) {
                this.f108938a.onNext(status);
                this.f108938a.onCompleted();
                return;
            }
            this.f108938a.onError(new StatusException(status));
        }
    }

    public C23217yv1(Context context, PendingIntent pendingIntent) {
        super(context);
        this.f108937c = pendingIntent;
    }

    @Override // pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable
    public void removeGeofences(GoogleApiClient googleApiClient, Observer observer) {
        LocationServices.GeofencingApi.removeGeofences(googleApiClient, this.f108937c).setResultCallback(new C17160a(observer));
    }
}
