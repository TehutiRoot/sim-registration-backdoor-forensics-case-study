package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes3.dex */
public class zzeu {

    /* renamed from: b */
    public static final zzdo f46972b = zzdo.f46962b;

    /* renamed from: a */
    public volatile zzdb f46973a;
    protected volatile zzfo zza;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeu)) {
            return false;
        }
        zzeu zzeuVar = (zzeu) obj;
        zzfo zzfoVar = this.zza;
        zzfo zzfoVar2 = zzeuVar.zza;
        if (zzfoVar == null && zzfoVar2 == null) {
            return zzb().equals(zzeuVar.zzb());
        }
        if (zzfoVar != null && zzfoVar2 != null) {
            return zzfoVar.equals(zzfoVar2);
        }
        if (zzfoVar != null) {
            zzeuVar.zzd(zzfoVar.zzab());
            return zzfoVar.equals(zzeuVar.zza);
        }
        zzd(zzfoVar2.zzab());
        return this.zza.equals(zzfoVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f46973a != null) {
            return ((zzcy) this.f46973a).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzE();
        }
        return 0;
    }

    public final zzdb zzb() {
        if (this.f46973a != null) {
            return this.f46973a;
        }
        synchronized (this) {
            try {
                if (this.f46973a != null) {
                    return this.f46973a;
                }
                if (this.zza == null) {
                    this.f46973a = zzdb.zzb;
                } else {
                    this.f46973a = this.zza.zzC();
                }
                return this.f46973a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzfo zzc(zzfo zzfoVar) {
        zzfo zzfoVar2 = this.zza;
        this.f46973a = null;
        this.zza = zzfoVar;
        return zzfoVar2;
    }

    public final void zzd(zzfo zzfoVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzfoVar;
                    this.f46973a = zzdb.zzb;
                } catch (zzeo unused) {
                    this.zza = zzfoVar;
                    this.f46973a = zzdb.zzb;
                }
            }
        }
    }
}
