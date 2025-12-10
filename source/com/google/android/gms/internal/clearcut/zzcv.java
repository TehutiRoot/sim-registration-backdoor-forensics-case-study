package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public class zzcv {

    /* renamed from: d */
    public static final zzbt f45577d = zzbt.zzan();

    /* renamed from: a */
    public zzbb f45578a;

    /* renamed from: b */
    public volatile zzdo f45579b;

    /* renamed from: c */
    public volatile zzbb f45580c;

    /* renamed from: a */
    public final zzdo m48155a(zzdo zzdoVar) {
        if (this.f45579b == null) {
            synchronized (this) {
                if (this.f45579b == null) {
                    try {
                        this.f45579b = zzdoVar;
                        this.f45580c = zzbb.zzfi;
                    } catch (zzco unused) {
                        this.f45579b = zzdoVar;
                        this.f45580c = zzbb.zzfi;
                    }
                }
            }
        }
        return this.f45579b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcvVar = (zzcv) obj;
            zzdo zzdoVar = this.f45579b;
            zzdo zzdoVar2 = zzcvVar.f45579b;
            return (zzdoVar == null && zzdoVar2 == null) ? zzr().equals(zzcvVar.zzr()) : (zzdoVar == null || zzdoVar2 == null) ? zzdoVar != null ? zzdoVar.equals(zzcvVar.m48155a(zzdoVar.zzbe())) : m48155a(zzdoVar2.zzbe()).equals(zzdoVar2) : zzdoVar.equals(zzdoVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zzas() {
        if (this.f45580c != null) {
            return this.f45580c.size();
        }
        if (this.f45579b != null) {
            return this.f45579b.zzas();
        }
        return 0;
    }

    public final zzdo zzi(zzdo zzdoVar) {
        zzdo zzdoVar2 = this.f45579b;
        this.f45578a = null;
        this.f45580c = null;
        this.f45579b = zzdoVar;
        return zzdoVar2;
    }

    public final zzbb zzr() {
        if (this.f45580c != null) {
            return this.f45580c;
        }
        synchronized (this) {
            try {
                if (this.f45580c != null) {
                    return this.f45580c;
                }
                this.f45580c = this.f45579b == null ? zzbb.zzfi : this.f45579b.zzr();
                return this.f45580c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
