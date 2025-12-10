package p000;

import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzhb;

/* renamed from: Fp2 */
/* loaded from: classes3.dex */
public final class Fp2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzhb f1705a;

    /* renamed from: b */
    public final /* synthetic */ zzfy f1706b;

    public Fp2(zzfy zzfyVar, zzhb zzhbVar) {
        this.f1706b = zzfyVar;
        this.f1705a = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy.m46278a(this.f1706b, this.f1705a);
        this.f1706b.zzH(this.f1705a.f48404g);
    }
}
