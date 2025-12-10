package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: UG2 */
/* loaded from: classes3.dex */
public final class UG2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f6591a;

    /* renamed from: b */
    public final /* synthetic */ String f6592b;

    /* renamed from: c */
    public final /* synthetic */ String f6593c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f6594d;

    public UG2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f6594d = appMeasurementDynamiteService;
        this.f6591a = zzcfVar;
        this.f6592b = str;
        this.f6593c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6594d.f48071a.zzt().zzv(this.f6591a, this.f6592b, this.f6593c);
    }
}