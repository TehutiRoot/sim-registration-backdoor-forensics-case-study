package p000;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: xs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC23107xs2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzlc f108878a;

    /* renamed from: b */
    public final /* synthetic */ zzq f108879b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f108880c;

    public RunnableC23107xs2(zzgq zzgqVar, zzlc zzlcVar, zzq zzqVar) {
        this.f108880c = zzgqVar;
        this.f108878a = zzlcVar;
        this.f108879b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkz zzkzVar3;
        zzkzVar = this.f108880c.f48407a;
        zzkzVar.m46171a();
        if (this.f108878a.zza() == null) {
            zzkzVar3 = this.f108880c.f48407a;
            zzkzVar3.m46156p(this.f108878a, this.f108879b);
            return;
        }
        zzkzVar2 = this.f108880c.f48407a;
        zzkzVar2.m46151u(this.f108878a, this.f108879b);
    }
}