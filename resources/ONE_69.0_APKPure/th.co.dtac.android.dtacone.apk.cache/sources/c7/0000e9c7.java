package p000;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: ls2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21031ls2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f71831a;

    /* renamed from: b */
    public final /* synthetic */ String f71832b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f71833c;

    public RunnableC21031ls2(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f71833c = zzgqVar;
        this.f71831a = zzawVar;
        this.f71832b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f71833c.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f71833c.f48407a;
        zzkzVar2.m46166f(this.f71831a, this.f71832b);
    }
}