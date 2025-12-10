package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;

/* renamed from: Ix2 */
/* loaded from: classes3.dex */
public final class Ix2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f2650a;

    /* renamed from: b */
    public final /* synthetic */ zzik f2651b;

    /* renamed from: c */
    public final /* synthetic */ zzik f2652c;

    /* renamed from: d */
    public final /* synthetic */ long f2653d;

    /* renamed from: e */
    public final /* synthetic */ zzis f2654e;

    public Ix2(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j) {
        this.f2654e = zzisVar;
        this.f2650a = bundle;
        this.f2651b = zzikVar;
        this.f2652c = zzikVar2;
        this.f2653d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis.m46240h(this.f2654e, this.f2650a, this.f2651b, this.f2652c, this.f2653d);
    }
}
