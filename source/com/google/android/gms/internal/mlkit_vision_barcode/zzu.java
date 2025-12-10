package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    @SafeParcelable.Field(m48389id = 2)
    public int zza;
    @SafeParcelable.Field(m48389id = 3)
    public String zzb;
    @SafeParcelable.Field(m48389id = 4)
    public String zzc;
    @SafeParcelable.Field(m48389id = 5)
    public int zzd;
    @SafeParcelable.Field(m48389id = 6)
    public Point[] zze;
    @SafeParcelable.Field(m48389id = 7)
    public zzn zzf;
    @SafeParcelable.Field(m48389id = 8)
    public zzq zzg;
    @SafeParcelable.Field(m48389id = 9)
    public zzr zzh;
    @SafeParcelable.Field(m48389id = 10)
    public zzt zzi;
    @SafeParcelable.Field(m48389id = 11)
    public zzs zzj;
    @SafeParcelable.Field(m48389id = 12)
    public zzo zzk;
    @SafeParcelable.Field(m48389id = 13)
    public zzk zzl;
    @SafeParcelable.Field(m48389id = 14)
    public zzl zzm;
    @SafeParcelable.Field(m48389id = 15)
    public zzm zzn;
    @SafeParcelable.Field(m48389id = 16)
    public byte[] zzo;
    @SafeParcelable.Field(m48389id = 17)
    public boolean zzp;
    @SafeParcelable.Field(m48389id = 18)
    public double zzq;

    public zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(m48388id = 2) int i, @SafeParcelable.Param(m48388id = 3) String str, @SafeParcelable.Param(m48388id = 4) String str2, @SafeParcelable.Param(m48388id = 5) int i2, @SafeParcelable.Param(m48388id = 6) Point[] pointArr, @SafeParcelable.Param(m48388id = 7) zzn zznVar, @SafeParcelable.Param(m48388id = 8) zzq zzqVar, @SafeParcelable.Param(m48388id = 9) zzr zzrVar, @SafeParcelable.Param(m48388id = 10) zzt zztVar, @SafeParcelable.Param(m48388id = 11) zzs zzsVar, @SafeParcelable.Param(m48388id = 12) zzo zzoVar, @SafeParcelable.Param(m48388id = 13) zzk zzkVar, @SafeParcelable.Param(m48388id = 14) zzl zzlVar, @SafeParcelable.Param(m48388id = 15) zzm zzmVar, @SafeParcelable.Param(m48388id = 16) byte[] bArr, @SafeParcelable.Param(m48388id = 17) boolean z, @SafeParcelable.Param(m48388id = 18) double d) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }
}
