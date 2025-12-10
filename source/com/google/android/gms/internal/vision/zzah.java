package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzag();

    /* renamed from: a */
    public final zzab f47531a;

    /* renamed from: b */
    public final zzab f47532b;

    /* renamed from: c */
    public final float f47533c;

    /* renamed from: d */
    public final int f47534d;
    @SafeParcelable.Field(m48389id = 2)
    public final zzao[] zza;
    @SafeParcelable.Field(m48389id = 3)
    public final zzab zzb;
    @SafeParcelable.Field(m48389id = 6)
    public final String zzc;
    @SafeParcelable.Field(m48389id = 8)
    public final String zzd;
    @SafeParcelable.Field(m48389id = 10)
    public final boolean zze;
    @SafeParcelable.Field(m48389id = 11)
    public final int zzf;
    @SafeParcelable.Field(m48389id = 12)
    public final int zzg;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(m48388id = 2) zzao[] zzaoVarArr, @SafeParcelable.Param(m48388id = 3) zzab zzabVar, @SafeParcelable.Param(m48388id = 4) zzab zzabVar2, @SafeParcelable.Param(m48388id = 5) zzab zzabVar3, @SafeParcelable.Param(m48388id = 6) String str, @SafeParcelable.Param(m48388id = 7) float f, @SafeParcelable.Param(m48388id = 8) String str2, @SafeParcelable.Param(m48388id = 9) int i, @SafeParcelable.Param(m48388id = 10) boolean z, @SafeParcelable.Param(m48388id = 11) int i2, @SafeParcelable.Param(m48388id = 12) int i3) {
        this.zza = zzaoVarArr;
        this.zzb = zzabVar;
        this.f47531a = zzabVar2;
        this.f47532b = zzabVar3;
        this.zzc = str;
        this.f47533c = f;
        this.zzd = str2;
        this.f47534d = i;
        this.zze = z;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f47531a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f47532b, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzc, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47533c);
        SafeParcelWriter.writeString(parcel, 8, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f47534d);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zze);
        SafeParcelWriter.writeInt(parcel, 11, this.zzf);
        SafeParcelWriter.writeInt(parcel, 12, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
