package p000;

import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;

/* renamed from: Yd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18808Yd2 implements InterfaceC20243he2 {

    /* renamed from: a */
    public final zzg f7805a;

    /* renamed from: b */
    public final String f7806b;

    public C18808Yd2(zzg zzgVar, String str) {
        this.f7805a = zzgVar;
        this.f7806b = str;
    }

    @Override // p000.InterfaceC20243he2
    /* renamed from: a */
    public final zzg mo26451a(zzap zzapVar) {
        zzg zza = this.f7805a.zza();
        zza.zzf(this.f7806b, zzapVar);
        return zza;
    }
}
