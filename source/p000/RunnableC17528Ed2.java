package p000;

import com.google.android.gms.measurement.internal.zzd;

/* renamed from: Ed2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17528Ed2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f1342a;

    /* renamed from: b */
    public final /* synthetic */ long f1343b;

    /* renamed from: c */
    public final /* synthetic */ zzd f1344c;

    public RunnableC17528Ed2(zzd zzdVar, String str, long j) {
        this.f1344c = zzdVar;
        this.f1342a = str;
        this.f1343b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.m46338b(this.f1344c, this.f1342a, this.f1343b);
    }
}
