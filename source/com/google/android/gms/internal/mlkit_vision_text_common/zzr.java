package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(m48389id = 2)
    public final zzn[] zza;
    @SafeParcelable.Field(m48389id = 3)
    public final zzf zzb;
    @SafeParcelable.Field(m48389id = 4)
    public final zzf zzc;
    @SafeParcelable.Field(m48389id = 5)
    public final String zzd;
    @SafeParcelable.Field(m48389id = 6)
    public final float zze;
    @SafeParcelable.Field(m48389id = 7)
    public final String zzf;
    @SafeParcelable.Field(m48389id = 8)
    public final boolean zzg;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m48388id = 2) zzn[] zznVarArr, @SafeParcelable.Param(m48388id = 3) zzf zzfVar, @SafeParcelable.Param(m48388id = 4) zzf zzfVar2, @SafeParcelable.Param(m48388id = 5) String str, @SafeParcelable.Param(m48388id = 6) float f, @SafeParcelable.Param(m48388id = 7) String str2, @SafeParcelable.Param(m48388id = 8) boolean z) {
        this.zza = zznVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = str;
        this.zze = f;
        this.zzf = str2;
        this.zzg = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzn[] zznVarArr = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zznVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
