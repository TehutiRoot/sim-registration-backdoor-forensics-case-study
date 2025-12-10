package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: qz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21854qz2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f77139a;

    /* renamed from: b */
    public final /* synthetic */ zzaw f77140b;

    /* renamed from: c */
    public final /* synthetic */ String f77141c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f77142d;

    public RunnableC21854qz2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzaw zzawVar, String str) {
        this.f77142d = appMeasurementDynamiteService;
        this.f77139a = zzcfVar;
        this.f77140b = zzawVar;
        this.f77141c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77142d.f48059a.zzt().zzB(this.f77139a, this.f77140b, this.f77141c);
    }
}
