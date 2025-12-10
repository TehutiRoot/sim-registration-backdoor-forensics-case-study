package p000;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: FC2 */
/* loaded from: classes3.dex */
public final class FC2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzcf f1609a;

    /* renamed from: b */
    public final /* synthetic */ String f1610b;

    /* renamed from: c */
    public final /* synthetic */ String f1611c;

    /* renamed from: d */
    public final /* synthetic */ boolean f1612d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f1613e;

    public FC2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.f1613e = appMeasurementDynamiteService;
        this.f1609a = zzcfVar;
        this.f1610b = str;
        this.f1611c = str2;
        this.f1612d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1613e.f48071a.zzt().zzy(this.f1609a, this.f1610b, this.f1611c, this.f1612d);
    }
}