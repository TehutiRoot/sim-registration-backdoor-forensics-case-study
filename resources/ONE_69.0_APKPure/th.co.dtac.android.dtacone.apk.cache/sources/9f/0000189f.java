package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: Zr2 */
/* loaded from: classes3.dex */
public final class Zr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f8287a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f8288b;

    public Zr2(zzgq zzgqVar, zzq zzqVar) {
        this.f8288b = zzgqVar;
        this.f8287a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f8288b.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f8288b.f48407a;
        zzq zzqVar = this.f8287a;
        zzkzVar2.zzaz().zzg();
        zzkzVar2.m46170b();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzb = zzai.zzb(zzqVar.zzv);
        zzai m46178M = zzkzVar2.m46178M(zzqVar.zza);
        zzkzVar2.zzay().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzb);
        zzkzVar2.m46152t(zzqVar.zza, zzb);
        if (zzb.zzk(m46178M)) {
            zzkzVar2.m46155q(zzqVar);
        }
    }
}