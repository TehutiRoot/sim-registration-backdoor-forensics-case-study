package p000;

import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;

/* renamed from: Ve2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18663Ve2 implements InterfaceC19781ef2 {

    /* renamed from: a */
    public final zzg f7035a;

    /* renamed from: b */
    public final String f7036b;

    public C18663Ve2(zzg zzgVar, String str) {
        this.f7035a = zzgVar;
        this.f7036b = str;
    }

    @Override // p000.InterfaceC19781ef2
    /* renamed from: a */
    public final zzg mo30946a(zzap zzapVar) {
        zzg zza = this.f7035a.zza();
        zza.zzf(this.f7036b, zzapVar);
        return zza;
    }
}