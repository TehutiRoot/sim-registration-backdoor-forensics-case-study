package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: XF2 */
/* loaded from: classes3.dex */
public final class XF2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f7429a;

    /* renamed from: b */
    public final /* synthetic */ String f7430b;

    /* renamed from: c */
    public final /* synthetic */ String f7431c;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f7432d;

    public XF2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2) {
        this.f7432d = appMeasurementDynamiteService;
        this.f7429a = zzcfVar;
        this.f7430b = str;
        this.f7431c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7432d.f48059a.zzt().zzv(this.f7429a, this.f7430b, this.f7431c);
    }
}
