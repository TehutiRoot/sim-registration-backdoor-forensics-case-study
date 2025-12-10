package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzag implements zzap {

    /* renamed from: a */
    public final zzap f46234a;

    /* renamed from: b */
    public final String f46235b;

    public zzag(String str) {
        this.f46234a = zzap.zzf;
        this.f46235b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        if (this.f46235b.equals(zzagVar.f46235b) && this.f46234a.equals(zzagVar.f46234a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46235b.hashCode() * 31) + this.f46234a.hashCode();
    }

    public final zzap zzb() {
        return this.f46234a;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        return this.f46235b;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzag(this.f46235b, this.f46234a.zzd());
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
        this.f46234a = zzapVar;
        this.f46235b = str;
    }

    public zzag() {
        throw null;
    }
}
