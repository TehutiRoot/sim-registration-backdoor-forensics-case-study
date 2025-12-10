package p000;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: lr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21028lr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzac f71823a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f71824b;

    public RunnableC21028lr2(zzgq zzgqVar, zzac zzacVar) {
        this.f71824b = zzgqVar;
        this.f71823a = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f71824b.f48407a;
        zzkzVar.m46171a();
        if (this.f71823a.zzc.zza() == null) {
            zzkzVar3 = this.f71824b.f48407a;
            zzkzVar3.m46158n(this.f71823a);
            return;
        }
        zzkzVar2 = this.f71824b.f48407a;
        zzkzVar2.m46154r(this.f71823a);
    }
}