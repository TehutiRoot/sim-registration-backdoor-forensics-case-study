package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DriverLicenseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzz();
    @SafeParcelable.Field(m48389id = 2)
    public String zza;
    @SafeParcelable.Field(m48389id = 3)
    public String zzb;
    @SafeParcelable.Field(m48389id = 4)
    public String zzc;
    @SafeParcelable.Field(m48389id = 5)
    public String zzd;
    @SafeParcelable.Field(m48389id = 6)
    public String zze;
    @SafeParcelable.Field(m48389id = 7)
    public String zzf;
    @SafeParcelable.Field(m48389id = 8)
    public String zzg;
    @SafeParcelable.Field(m48389id = 9)
    public String zzh;
    @SafeParcelable.Field(m48389id = 10)
    public String zzi;
    @SafeParcelable.Field(m48389id = 11)
    public String zzj;
    @SafeParcelable.Field(m48389id = 12)
    public String zzk;
    @SafeParcelable.Field(m48389id = 13)
    public String zzl;
    @SafeParcelable.Field(m48389id = 14)
    public String zzm;
    @SafeParcelable.Field(m48389id = 15)
    public String zzn;

    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) String str2, @SafeParcelable.Param(m48388id = 4) String str3, @SafeParcelable.Param(m48388id = 5) String str4, @SafeParcelable.Param(m48388id = 6) String str5, @SafeParcelable.Param(m48388id = 7) String str6, @SafeParcelable.Param(m48388id = 8) String str7, @SafeParcelable.Param(m48388id = 9) String str8, @SafeParcelable.Param(m48388id = 10) String str9, @SafeParcelable.Param(m48388id = 11) String str10, @SafeParcelable.Param(m48388id = 12) String str11, @SafeParcelable.Param(m48388id = 13) String str12, @SafeParcelable.Param(m48388id = 14) String str13, @SafeParcelable.Param(m48388id = 15) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }
}
