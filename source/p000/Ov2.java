package p000;

import com.google.android.gms.measurement.internal.zzid;

/* renamed from: Ov2 */
/* loaded from: classes3.dex */
public final class Ov2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Boolean f4588a;

    /* renamed from: b */
    public final /* synthetic */ zzid f4589b;

    public Ov2(zzid zzidVar, Boolean bool) {
        this.f4589b = zzidVar;
        this.f4588a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4589b.m46252j(this.f4588a, true);
    }
}
