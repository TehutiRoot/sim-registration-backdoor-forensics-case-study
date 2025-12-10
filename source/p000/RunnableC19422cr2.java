package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: cr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19422cr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f60985a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f60986b;

    public RunnableC19422cr2(zzgq zzgqVar, zzq zzqVar) {
        this.f60986b = zzgqVar;
        this.f60985a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f60986b.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f60986b.f48395a;
        zzq zzqVar = this.f60985a;
        zzkzVar2.zzaz().zzg();
        zzkzVar2.m46185b();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzb = zzai.zzb(zzqVar.zzv);
        zzai m46193M = zzkzVar2.m46193M(zzqVar.zza);
        zzkzVar2.zzay().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzb);
        zzkzVar2.m46167t(zzqVar.zza, zzb);
        if (zzb.zzk(m46193M)) {
            zzkzVar2.m46170q(zzqVar);
        }
    }
}
