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

/* renamed from: vw1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22772vw1 extends RemoveGeofenceObservable {

    /* renamed from: c */
    public final PendingIntent f108274c;

    /* renamed from: vw1$a */
    /* loaded from: classes5.dex */
    public class C16944a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f108275a;

        public C16944a(Observer observer) {
            this.f108275a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (status.isSuccess()) {
                this.f108275a.onNext(status);
                this.f108275a.onCompleted();
                return;
            }
            this.f108275a.onError(new StatusException(status));
        }
    }

    public C22772vw1(Context context, PendingIntent pendingIntent) {
        super(context);
        this.f108274c = pendingIntent;
    }

    @Override // pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable
    public void removeGeofences(GoogleApiClient googleApiClient, Observer observer) {
        LocationServices.GeofencingApi.removeGeofences(googleApiClient, this.f108274c).setResultCallback(new C16944a(observer));
    }
}