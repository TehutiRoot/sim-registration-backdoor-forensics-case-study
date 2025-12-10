package p000;

import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: oC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21437oC2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzkz f72702a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f72703b;

    public RunnableC21437oC2(zzjz zzjzVar, zzkz zzkzVar, Runnable runnable) {
        this.f72702a = zzkzVar;
        this.f72703b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f72702a.m46171a();
        this.f72702a.m46172S(this.f72703b);
        this.f72702a.m46150v();
    }
}