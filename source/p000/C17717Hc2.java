package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnTokenCanceledListener;

/* renamed from: Hc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17717Hc2 extends LocationCallback {

    /* renamed from: a */
    public final /* synthetic */ zzao f2271a;

    /* renamed from: b */
    public final /* synthetic */ OnTokenCanceledListener f2272b;

    public C17717Hc2(zzbe zzbeVar, zzao zzaoVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.f2271a = zzaoVar;
        this.f2272b = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        try {
            this.f2271a.zzb(Status.RESULT_SUCCESS, locationResult.getLastLocation());
            this.f2272b.onCanceled();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }
}
