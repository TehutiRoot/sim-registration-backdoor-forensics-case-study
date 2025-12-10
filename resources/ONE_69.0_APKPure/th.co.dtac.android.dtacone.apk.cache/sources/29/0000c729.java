package p000;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: fs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19993fs2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f61975a;

    /* renamed from: b */
    public final /* synthetic */ zzq f61976b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f61977c;

    public RunnableC19993fs2(zzgq zzgqVar, zzaw zzawVar, zzq zzqVar) {
        this.f61977c = zzgqVar;
        this.f61975a = zzawVar;
        this.f61976b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61977c.m46250d(this.f61977c.m46252b(this.f61975a, this.f61976b), this.f61976b);
    }
}