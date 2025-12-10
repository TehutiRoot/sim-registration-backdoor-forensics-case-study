package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: Sr2 */
/* loaded from: classes3.dex */
public final class Sr2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f5961a;

    /* renamed from: b */
    public final /* synthetic */ zzgq f5962b;

    public Sr2(zzgq zzgqVar, zzq zzqVar) {
        this.f5962b = zzgqVar;
        this.f5961a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f5962b.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f5962b.f48407a;
        zzq zzqVar = this.f5961a;
        zzkzVar2.zzaz().zzg();
        zzkzVar2.m46170b();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzkzVar2.m46179L(zzqVar);
    }
}