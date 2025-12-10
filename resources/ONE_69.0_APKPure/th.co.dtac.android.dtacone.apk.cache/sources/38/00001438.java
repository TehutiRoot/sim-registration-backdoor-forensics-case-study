package p000;

import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzla;

/* renamed from: VD2 */
/* loaded from: classes3.dex */
public final class VD2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzla f6853a;

    /* renamed from: b */
    public final /* synthetic */ zzkz f6854b;

    public VD2(zzkz zzkzVar, zzla zzlaVar) {
        this.f6854b = zzkzVar;
        this.f6853a = zzlaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz.m46173R(this.f6854b, this.f6853a);
        this.f6854b.zzS();
    }
}