package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field(m48389id = 2)
    public final String zza;
    @SafeParcelable.Field(m48389id = 3)
    public final zzau zzb;
    @SafeParcelable.Field(m48389id = 4)
    public final String zzc;
    @SafeParcelable.Field(m48389id = 5)
    public final long zzd;

    public zzaw(zzaw zzawVar, long j) {
        Preconditions.checkNotNull(zzawVar);
        this.zza = zzawVar.zza;
        this.zzb = zzawVar.zzb;
        this.zzc = zzawVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzax.m46340a(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) zzau zzauVar, @SafeParcelable.Param(m48388id = 4) String str2, @SafeParcelable.Param(m48388id = 5) long j) {
        this.zza = str;
        this.zzb = zzauVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
