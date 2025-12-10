package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: Ar2 */
/* loaded from: classes3.dex */
public final class Ar2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzlc f220a;

    /* renamed from: b */
    public final /* synthetic */ zzq f221b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f222c;

    public Ar2(zzgq zzgqVar, zzlc zzlcVar, zzq zzqVar) {
        this.f222c = zzgqVar;
        this.f220a = zzlcVar;
        this.f221b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f222c.f48395a;
        zzkzVar.m46186a();
        if (this.f220a.zza() == null) {
            zzkzVar3 = this.f222c.f48395a;
            zzkzVar3.m46171p(this.f220a, this.f221b);
            return;
        }
        zzkzVar2 = this.f222c.f48395a;
        zzkzVar2.m46166u(this.f220a, this.f221b);
    }
}
