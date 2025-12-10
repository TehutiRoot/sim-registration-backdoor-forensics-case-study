package p000;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: jq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20623jq2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzac f67743a;

    /* renamed from: b */
    public final /* synthetic */ zzq f67744b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f67745c;

    public RunnableC20623jq2(zzgq zzgqVar, zzac zzacVar, zzq zzqVar) {
        this.f67745c = zzgqVar;
        this.f67743a = zzacVar;
        this.f67744b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f67745c.f48395a;
        zzkzVar.m46186a();
        if (this.f67743a.zzc.zza() == null) {
            zzkzVar3 = this.f67745c.f48395a;
            zzkzVar3.m46172o(this.f67743a, this.f67744b);
            return;
        }
        zzkzVar2 = this.f67745c.f48395a;
        zzkzVar2.m46168s(this.f67743a, this.f67744b);
    }
}
