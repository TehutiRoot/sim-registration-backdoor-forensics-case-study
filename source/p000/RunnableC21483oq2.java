package p000;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: oq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21483oq2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzac f72944a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f72945b;

    public RunnableC21483oq2(zzgq zzgqVar, zzac zzacVar) {
        this.f72945b = zzgqVar;
        this.f72944a = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f72945b.f48395a;
        zzkzVar.m46186a();
        if (this.f72944a.zzc.zza() == null) {
            zzkzVar3 = this.f72945b.f48395a;
            zzkzVar3.m46173n(this.f72944a);
            return;
        }
        zzkzVar2 = this.f72945b.f48395a;
        zzkzVar2.m46169r(this.f72944a);
    }
}
