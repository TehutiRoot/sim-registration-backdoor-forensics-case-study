package p000;

import com.google.android.gms.measurement.internal.zzid;

/* renamed from: qu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21839qu2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f77117a;

    /* renamed from: b */
    public final /* synthetic */ String f77118b;

    /* renamed from: c */
    public final /* synthetic */ Object f77119c;

    /* renamed from: d */
    public final /* synthetic */ long f77120d;

    /* renamed from: e */
    public final /* synthetic */ zzid f77121e;

    public RunnableC21839qu2(zzid zzidVar, String str, String str2, Object obj, long j) {
        this.f77121e = zzidVar;
        this.f77117a = str;
        this.f77118b = str2;
        this.f77119c = obj;
        this.f77120d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77121e.m46253i(this.f77117a, this.f77118b, this.f77119c, this.f77120d);
    }
}
