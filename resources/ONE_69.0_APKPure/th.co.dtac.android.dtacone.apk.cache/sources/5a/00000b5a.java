package p000;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;

/* renamed from: Ly2 */
/* loaded from: classes3.dex */
public final class Ly2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f3775a;

    /* renamed from: b */
    public final /* synthetic */ zzik f3776b;

    /* renamed from: c */
    public final /* synthetic */ long f3777c;

    /* renamed from: d */
    public final /* synthetic */ boolean f3778d;

    /* renamed from: e */
    public final /* synthetic */ zzis f3779e;

    public Ly2(zzis zzisVar, zzik zzikVar, zzik zzikVar2, long j, boolean z) {
        this.f3779e = zzisVar;
        this.f3775a = zzikVar;
        this.f3776b = zzikVar2;
        this.f3777c = j;
        this.f3778d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3779e.m46231b(this.f3775a, this.f3776b, this.f3777c, this.f3778d, null);
    }
}