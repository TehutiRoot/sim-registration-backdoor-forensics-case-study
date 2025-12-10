package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzhb extends zzfu<zzhb> implements Cloneable {

    /* renamed from: c */
    public static volatile zzhb[] f45631c;

    /* renamed from: a */
    public String f45632a = "";

    /* renamed from: b */
    public String f45633b = "";

    public zzhb() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    public static zzhb[] zzge() {
        if (f45631c == null) {
            synchronized (zzfy.zzrr) {
                try {
                    if (f45631c == null) {
                        f45631c = new zzhb[0];
                    }
                } finally {
                }
            }
        }
        return f45631c;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: a */
    public final zzhb clone() {
        try {
            return (zzhb) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhb) {
            zzhb zzhbVar = (zzhb) obj;
            String str = this.f45632a;
            if (str == null) {
                if (zzhbVar.f45632a != null) {
                    return false;
                }
            } else if (!str.equals(zzhbVar.f45632a)) {
                return false;
            }
            String str2 = this.f45633b;
            if (str2 == null) {
                if (zzhbVar.f45633b != null) {
                    return false;
                }
            } else if (!str2.equals(zzhbVar.f45633b)) {
                return false;
            }
            zzfw zzfwVar = this.zzrj;
            if (zzfwVar == null || zzfwVar.isEmpty()) {
                zzfw zzfwVar2 = zzhbVar.zzrj;
                return zzfwVar2 == null || zzfwVar2.isEmpty();
            }
            return this.zzrj.equals(zzhbVar.zzrj);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (zzhb.class.getName().hashCode() + 527) * 31;
        String str = this.f45632a;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f45633b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            i = this.zzrj.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        String str = this.f45632a;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(1, this.f45632a);
        }
        String str2 = this.f45633b;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(2, this.f45633b);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int zzen = super.zzen();
        String str = this.f45632a;
        if (str != null && !str.equals("")) {
            zzen += zzfs.zzb(1, this.f45632a);
        }
        String str2 = this.f45633b;
        return (str2 == null || str2.equals("")) ? zzen : zzen + zzfs.zzb(2, this.f45633b);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzhb zzeo() throws CloneNotSupportedException {
        return (zzhb) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzhb) clone();
    }
}
