package p000;

import com.google.android.gms.measurement.internal.zzd;

/* renamed from: H92 */
/* loaded from: classes3.dex */
public final class H92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f2120a;

    /* renamed from: b */
    public final /* synthetic */ long f2121b;

    /* renamed from: c */
    public final /* synthetic */ zzd f2122c;

    public H92(zzd zzdVar, String str, long j) {
        this.f2122c = zzdVar;
        this.f2120a = str;
        this.f2121b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.m46339a(this.f2122c, this.f2120a, this.f2121b);
    }
}
