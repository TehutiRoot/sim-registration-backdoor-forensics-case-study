package p000;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import java.util.List;
import p046rx.Observer;
import pl.charmas.android.reactivelocation.observables.StatusException;
import pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable;

/* renamed from: ww1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22945ww1 extends RemoveGeofenceObservable {

    /* renamed from: c */
    public final List f108608c;

    /* renamed from: ww1$a */
    /* loaded from: classes5.dex */
    public class C17017a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f108609a;

        public C17017a(Observer observer) {
            this.f108609a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (status.isSuccess()) {
                this.f108609a.onNext(status);
                this.f108609a.onCompleted();
                return;
            }
            this.f108609a.onError(new StatusException(status));
        }
    }

    public C22945ww1(Context context, List list) {
        super(context);
        this.f108608c = list;
    }

    @Override // pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable
    public void removeGeofences(GoogleApiClient googleApiClient, Observer observer) {
        LocationServices.GeofencingApi.removeGeofences(googleApiClient, this.f108608c).setResultCallback(new C17017a(observer));
    }
}