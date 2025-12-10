package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public class zzkr {

    /* renamed from: b */
    public static final zzjq f46333b = zzjq.f46326c;

    /* renamed from: a */
    public volatile zzjd f46334a;
    protected volatile zzll zza;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkr)) {
            return false;
        }
        zzkr zzkrVar = (zzkr) obj;
        zzll zzllVar = this.zza;
        zzll zzllVar2 = zzkrVar.zza;
        if (zzllVar == null && zzllVar2 == null) {
            return zzb().equals(zzkrVar.zzb());
        }
        if (zzllVar != null && zzllVar2 != null) {
            return zzllVar.equals(zzllVar2);
        }
        if (zzllVar != null) {
            zzkrVar.zzc(zzllVar.zzbO());
            return zzllVar.equals(zzkrVar.zza);
        }
        zzc(zzllVar2.zzbO());
        return this.zza.equals(zzllVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f46334a != null) {
            return ((zzja) this.f46334a).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbw();
        }
        return 0;
    }

    public final zzjd zzb() {
        if (this.f46334a != null) {
            return this.f46334a;
        }
        synchronized (this) {
            try {
                if (this.f46334a != null) {
                    return this.f46334a;
                }
                if (this.zza == null) {
                    this.f46334a = zzjd.zzb;
                } else {
                    this.f46334a = this.zza.zzbs();
                }
                return this.f46334a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzll zzllVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzllVar;
                    this.f46334a = zzjd.zzb;
                } catch (zzko unused) {
                    this.zza = zzllVar;
                    this.f46334a = zzjd.zzb;
                }
            }
        }
    }
}
