package p000;

import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;

/* renamed from: ce2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19383ce2 implements InterfaceC20243he2 {

    /* renamed from: a */
    public final zzg f39474a;

    /* renamed from: b */
    public final String f39475b;

    public C19383ce2(zzg zzgVar, String str) {
        this.f39474a = zzgVar;
        this.f39475b = str;
    }

    @Override // p000.InterfaceC20243he2
    /* renamed from: a */
    public final zzg mo26451a(zzap zzapVar) {
        zzg zza = this.f39474a.zza();
        zza.zze(this.f39475b, zzapVar);
        return zza;
    }
}
