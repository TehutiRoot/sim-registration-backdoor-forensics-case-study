package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: QH2 */
/* loaded from: classes3.dex */
public final class QH2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f5025a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f5026b;

    public QH2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f5026b = appMeasurementDynamiteService;
        this.f5025a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5026b.f48059a.zzv().zzP(this.f5025a, this.f5026b.f48059a.zzI());
    }
}
