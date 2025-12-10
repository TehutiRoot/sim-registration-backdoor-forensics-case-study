package p000;

import com.google.android.gms.measurement.internal.zzd;

/* renamed from: Ea2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17546Ea2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f1394a;

    /* renamed from: b */
    public final /* synthetic */ long f1395b;

    /* renamed from: c */
    public final /* synthetic */ zzd f1396c;

    public RunnableC17546Ea2(zzd zzdVar, String str, long j) {
        this.f1396c = zzdVar;
        this.f1394a = str;
        this.f1395b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.m46324a(this.f1396c, this.f1394a, this.f1395b);
    }
}