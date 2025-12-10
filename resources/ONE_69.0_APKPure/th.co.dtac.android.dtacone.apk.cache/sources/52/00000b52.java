package p000;

import com.google.android.gms.measurement.internal.zzid;

/* renamed from: Lw2 */
/* loaded from: classes3.dex */
public final class Lw2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Boolean f3769a;

    /* renamed from: b */
    public final /* synthetic */ zzid f3770b;

    public Lw2(zzid zzidVar, Boolean bool) {
        this.f3770b = zzidVar;
        this.f3769a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3770b.m46237j(this.f3769a, true);
    }
}