package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: NI2 */
/* loaded from: classes3.dex */
public final class NI2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f4136a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f4137b;

    public NI2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f4137b = appMeasurementDynamiteService;
        this.f4136a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4137b.f48071a.zzv().zzP(this.f4136a, this.f4137b.f48071a.zzI());
    }
}