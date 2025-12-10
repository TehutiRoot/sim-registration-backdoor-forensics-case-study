package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzag implements zzap {

    /* renamed from: a */
    public final zzap f46246a;

    /* renamed from: b */
    public final String f46247b;

    public zzag(String str) {
        this.f46246a = zzap.zzf;
        this.f46247b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        if (this.f46247b.equals(zzagVar.f46247b) && this.f46246a.equals(zzagVar.f46246a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46247b.hashCode() * 31) + this.f46246a.hashCode();
    }

    public final zzap zzb() {
        return this.f46246a;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.f46247b;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzag(this.f46247b, this.f46246a.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }

    public zzag(String str, zzap zzapVar) {
        this.f46246a = zzapVar;
        this.f46247b = str;
    }

    public zzag() {
        throw null;
    }
}