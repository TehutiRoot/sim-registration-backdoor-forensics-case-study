package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: OE2 */
/* loaded from: classes3.dex */
public final class OE2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C20593jJ2 f4398a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f4399b;

    public OE2(AppMeasurementDynamiteService appMeasurementDynamiteService, C20593jJ2 c20593jJ2) {
        this.f4399b = appMeasurementDynamiteService;
        this.f4398a = c20593jJ2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4399b.f48071a.zzq().zzT(this.f4398a);
    }
}