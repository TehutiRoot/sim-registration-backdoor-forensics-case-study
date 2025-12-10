package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;

/* renamed from: Fy2 */
/* loaded from: classes3.dex */
public final class Fy2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f1824a;

    /* renamed from: b */
    public final /* synthetic */ zzik f1825b;

    /* renamed from: c */
    public final /* synthetic */ zzik f1826c;

    /* renamed from: d */
    public final /* synthetic */ long f1827d;

    /* renamed from: e */
    public final /* synthetic */ zzis f1828e;

    public Fy2(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j) {
        this.f1828e = zzisVar;
        this.f1824a = bundle;
        this.f1825b = zzikVar;
        this.f1826c = zzikVar2;
        this.f1827d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis.m46225h(this.f1828e, this.f1824a, this.f1825b, this.f1826c, this.f1827d);
    }
}