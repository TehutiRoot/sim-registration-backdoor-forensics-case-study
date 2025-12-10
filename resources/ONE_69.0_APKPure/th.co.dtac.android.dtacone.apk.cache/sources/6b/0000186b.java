package p000;

import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;

/* renamed from: Ze2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18922Ze2 implements InterfaceC19781ef2 {

    /* renamed from: a */
    public final zzg f8227a;

    /* renamed from: b */
    public final String f8228b;

    public C18922Ze2(zzg zzgVar, String str) {
        this.f8227a = zzgVar;
        this.f8228b = str;
    }

    @Override // p000.InterfaceC19781ef2
    /* renamed from: a */
    public final zzg mo30946a(zzap zzapVar) {
        zzg zza = this.f8227a.zza();
        zza.zze(this.f8228b, zzapVar);
        return zza;
    }
}