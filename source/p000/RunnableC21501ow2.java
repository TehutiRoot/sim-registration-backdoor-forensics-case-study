package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: ow2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21501ow2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f76432a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f76433b;

    public RunnableC21501ow2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f76433b = appMeasurementDynamiteService;
        this.f76432a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76433b.f48059a.zzt().zzt(this.f76432a);
    }
}
