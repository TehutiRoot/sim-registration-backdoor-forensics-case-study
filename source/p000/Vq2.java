package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: Vq2 */
/* loaded from: classes3.dex */
public final class Vq2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f6831a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f6832b;

    public Vq2(zzgq zzgqVar, zzq zzqVar) {
        this.f6832b = zzgqVar;
        this.f6831a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f6832b.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f6832b.f48395a;
        zzq zzqVar = this.f6831a;
        zzkzVar2.zzaz().zzg();
        zzkzVar2.m46185b();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkzVar2.m46194L(zzqVar);
    }
}
