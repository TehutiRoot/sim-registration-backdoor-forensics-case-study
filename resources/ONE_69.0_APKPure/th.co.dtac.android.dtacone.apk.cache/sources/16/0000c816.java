package p000;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: gr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20163gr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzac f62302a;

    /* renamed from: b */
    public final /* synthetic */ zzq f62303b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f62304c;

    public RunnableC20163gr2(zzgq zzgqVar, zzac zzacVar, zzq zzqVar) {
        this.f62304c = zzgqVar;
        this.f62302a = zzacVar;
        this.f62303b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f62304c.f48407a;
        zzkzVar.m46171a();
        if (this.f62302a.zzc.zza() == null) {
            zzkzVar3 = this.f62304c.f48407a;
            zzkzVar3.m46157o(this.f62302a, this.f62303b);
            return;
        }
        zzkzVar2 = this.f62304c.f48407a;
        zzkzVar2.m46153s(this.f62302a, this.f62303b);
    }
}