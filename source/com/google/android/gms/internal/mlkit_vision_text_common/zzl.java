package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field(m48389id = 2)
    public final zzr[] zza;
    @SafeParcelable.Field(m48389id = 3)
    public final zzf zzb;
    @SafeParcelable.Field(m48389id = 4)
    public final zzf zzc;
    @SafeParcelable.Field(m48389id = 5)
    public final zzf zzd;
    @SafeParcelable.Field(m48389id = 6)
    public final String zze;
    @SafeParcelable.Field(m48389id = 7)
    public final float zzf;
    @SafeParcelable.Field(m48389id = 8)
    public final String zzg;
    @SafeParcelable.Field(m48389id = 9)
    public final int zzh;
    @SafeParcelable.Field(m48389id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(m48389id = 11)
    public final int zzj;
    @SafeParcelable.Field(m48389id = 12)
    public final int zzk;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m48388id = 2) zzr[] zzrVarArr, @SafeParcelable.Param(m48388id = 3) zzf zzfVar, @SafeParcelable.Param(m48388id = 4) zzf zzfVar2, @SafeParcelable.Param(m48388id = 5) zzf zzfVar3, @SafeParcelable.Param(m48388id = 6) String str, @SafeParcelable.Param(m48388id = 7) float f, @SafeParcelable.Param(m48388id = 8) String str2, @SafeParcelable.Param(m48388id = 9) int i, @SafeParcelable.Param(m48388id = 10) boolean z, @SafeParcelable.Param(m48388id = 11) int i2, @SafeParcelable.Param(m48388id = 12) int i3) {
        this.zza = zzrVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = zzfVar3;
        this.zze = str;
        this.zzf = f;
        this.zzg = str2;
        this.zzh = i;
        this.zzi = z;
        this.zzj = i2;
        this.zzk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzr[] zzrVarArr = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zzrVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
