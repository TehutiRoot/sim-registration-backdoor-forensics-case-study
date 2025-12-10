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

/* renamed from: zv1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C23389zv1 extends RemoveGeofenceObservable {

    /* renamed from: c */
    public final List f109226c;

    /* renamed from: zv1$a */
    /* loaded from: classes5.dex */
    public class C17228a implements ResultCallback {

        /* renamed from: a */
        public final /* synthetic */ Observer f109227a;

        public C17228a(Observer observer) {
            this.f109227a = observer;
        }

        @Override // com.google.android.gms.common.api.ResultCallback
        /* renamed from: a */
        public void onResult(Status status) {
            if (status.isSuccess()) {
                this.f109227a.onNext(status);
                this.f109227a.onCompleted();
                return;
            }
            this.f109227a.onError(new StatusException(status));
        }
    }

    public C23389zv1(Context context, List list) {
        super(context);
        this.f109226c = list;
    }

    @Override // pl.charmas.android.reactivelocation.observables.geofence.RemoveGeofenceObservable
    public void removeGeofences(GoogleApiClient googleApiClient, Observer observer) {
        LocationServices.GeofencingApi.removeGeofences(googleApiClient, this.f109226c).setResultCallback(new C17228a(observer));
    }
}
