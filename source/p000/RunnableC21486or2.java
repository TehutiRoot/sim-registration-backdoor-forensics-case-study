package p000;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;

/* renamed from: or2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21486or2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f72952a;

    /* renamed from: b */
    public final /* synthetic */ String f72953b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f72954c;

    public RunnableC21486or2(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f72954c = zzgqVar;
        this.f72952a = zzawVar;
        this.f72953b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        zzkzVar = this.f72954c.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f72954c.f48395a;
        zzkzVar2.m46181f(this.f72952a, this.f72953b);
    }
}
