package p000;

import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzhb;

/* renamed from: Cq2 */
/* loaded from: classes3.dex */
public final class Cq2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzhb f853a;

    /* renamed from: b */
    public final /* synthetic */ zzfy f854b;

    public Cq2(zzfy zzfyVar, zzhb zzhbVar) {
        this.f854b = zzfyVar;
        this.f853a = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy.m46263a(this.f854b, this.f853a);
        this.f854b.zzH(this.f853a.f48416g);
    }
}