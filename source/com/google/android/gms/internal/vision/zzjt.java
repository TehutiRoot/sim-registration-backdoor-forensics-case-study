package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public class zzjt {

    /* renamed from: d */
    public static final zzio f47651d = zzio.zzb();

    /* renamed from: a */
    public zzht f47652a;

    /* renamed from: b */
    public volatile zzkk f47653b;

    /* renamed from: c */
    public volatile zzht f47654c;

    /* renamed from: a */
    public final zzkk m46416a(zzkk zzkkVar) {
        if (this.f47653b == null) {
            synchronized (this) {
                if (this.f47653b == null) {
                    try {
                        this.f47653b = zzkkVar;
                        this.f47654c = zzht.zza;
                    } catch (zzjk unused) {
                        this.f47653b = zzkkVar;
                        this.f47654c = zzht.zza;
                    }
                }
            }
        }
        return this.f47653b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjt)) {
            return false;
        }
        zzjt zzjtVar = (zzjt) obj;
        zzkk zzkkVar = this.f47653b;
        zzkk zzkkVar2 = zzjtVar.f47653b;
        if (zzkkVar == null && zzkkVar2 == null) {
            return zzc().equals(zzjtVar.zzc());
        }
        if (zzkkVar != null && zzkkVar2 != null) {
            return zzkkVar.equals(zzkkVar2);
        }
        if (zzkkVar != null) {
            return zzkkVar.equals(zzjtVar.m46416a(zzkkVar.zzr()));
        }
        return m46416a(zzkkVar2.zzr()).equals(zzkkVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkk zza(zzkk zzkkVar) {
        zzkk zzkkVar2 = this.f47653b;
        this.f47652a = null;
        this.f47654c = null;
        this.f47653b = zzkkVar;
        return zzkkVar2;
    }

    public final int zzb() {
        if (this.f47654c != null) {
            return this.f47654c.zza();
        }
        if (this.f47653b != null) {
            return this.f47653b.zzm();
        }
        return 0;
    }

    public final zzht zzc() {
        if (this.f47654c != null) {
            return this.f47654c;
        }
        synchronized (this) {
            try {
                if (this.f47654c != null) {
                    return this.f47654c;
                }
                if (this.f47653b == null) {
                    this.f47654c = zzht.zza;
                } else {
                    this.f47654c = this.f47653b.zzg();
                }
                return this.f47654c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
