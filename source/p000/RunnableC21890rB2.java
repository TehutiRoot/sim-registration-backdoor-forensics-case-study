package p000;

import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: rB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21890rB2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzkz f77195a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f77196b;

    public RunnableC21890rB2(zzjz zzjzVar, zzkz zzkzVar, Runnable runnable) {
        this.f77195a = zzkzVar;
        this.f77196b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77195a.m46186a();
        this.f77195a.m46187S(this.f77196b);
        this.f77195a.m46165v();
    }
}
