package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: IB2 */
/* loaded from: classes3.dex */
public final class IB2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f2432a;

    /* renamed from: b */
    public final /* synthetic */ String f2433b;

    /* renamed from: c */
    public final /* synthetic */ String f2434c;

    /* renamed from: d */
    public final /* synthetic */ boolean f2435d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f2436e;

    public IB2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f2436e = appMeasurementDynamiteService;
        this.f2432a = zzcfVar;
        this.f2433b = str;
        this.f2434c = str2;
        this.f2435d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2436e.f48059a.zzt().zzy(this.f2432a, this.f2433b, this.f2434c, this.f2435d);
    }
}
