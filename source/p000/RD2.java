package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: RD2 */
/* loaded from: classes3.dex */
public final class RD2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21051mI2 f5294a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f5295b;

    public RD2(AppMeasurementDynamiteService appMeasurementDynamiteService, C21051mI2 c21051mI2) {
        this.f5295b = appMeasurementDynamiteService;
        this.f5294a = c21051mI2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5295b.f48059a.zzq().zzT(this.f5294a);
    }
}
