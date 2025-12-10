package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: nA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21258nA2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f72274a;

    /* renamed from: b */
    public final /* synthetic */ zzaw f72275b;

    /* renamed from: c */
    public final /* synthetic */ String f72276c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f72277d;

    public RunnableC21258nA2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzaw zzawVar, String str) {
        this.f72277d = appMeasurementDynamiteService;
        this.f72274a = zzcfVar;
        this.f72275b = zzawVar;
        this.f72276c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72277d.f48071a.zzt().zzB(this.f72274a, this.f72275b, this.f72276c);
    }
}