package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;

/* renamed from: mI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21051mI2 implements zzgy {

    /* renamed from: a */
    public final zzci f71873a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f71874b;

    public C21051mI2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f71874b = appMeasurementDynamiteService;
        this.f71873a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.f71873a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfy zzfyVar = this.f71874b.f48059a;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
