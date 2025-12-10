package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnTokenCanceledListener;

/* renamed from: Ed2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17555Ed2 extends LocationCallback {

    /* renamed from: a */
    public final /* synthetic */ zzao f1407a;

    /* renamed from: b */
    public final /* synthetic */ OnTokenCanceledListener f1408b;

    public C17555Ed2(zzbe zzbeVar, zzao zzaoVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.f1407a = zzaoVar;
        this.f1408b = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        try {
            this.f1407a.zzb(Status.RESULT_SUCCESS, locationResult.getLastLocation());
            this.f1408b.onCanceled();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
    }
}