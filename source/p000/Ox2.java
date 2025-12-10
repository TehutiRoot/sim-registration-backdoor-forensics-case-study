package p000;

import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzis;

/* renamed from: Ox2 */
/* loaded from: classes3.dex */
public final class Ox2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f4594a;

    /* renamed from: b */
    public final /* synthetic */ zzik f4595b;

    /* renamed from: c */
    public final /* synthetic */ long f4596c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4597d;

    /* renamed from: e */
    public final /* synthetic */ zzis f4598e;

    public Ox2(zzis zzisVar, zzik zzikVar, zzik zzikVar2, long j, boolean z) {
        this.f4598e = zzisVar;
        this.f4594a = zzikVar;
        this.f4595b = zzikVar2;
        this.f4596c = j;
        this.f4597d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4598e.m46246b(this.f4594a, this.f4595b, this.f4596c, this.f4597d, null);
    }
}
