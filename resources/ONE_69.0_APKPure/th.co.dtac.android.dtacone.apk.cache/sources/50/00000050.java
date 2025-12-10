package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgz;

/* renamed from: AJ2 */
/* loaded from: classes3.dex */
public final class AJ2 implements zzgz {

    /* renamed from: a */
    public final zzci f68a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f69b;

    public AJ2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f69b = appMeasurementDynamiteService;
        this.f68a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f68a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfy zzfyVar = this.f69b.f48071a;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}