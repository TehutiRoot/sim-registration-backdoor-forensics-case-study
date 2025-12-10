package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: lx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21046lx2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f71866a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f71867b;

    public RunnableC21046lx2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.f71867b = appMeasurementDynamiteService;
        this.f71866a = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71867b.f48071a.zzt().zzt(this.f71866a);
    }
}