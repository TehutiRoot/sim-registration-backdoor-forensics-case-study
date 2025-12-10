package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzar();

    /* renamed from: a */
    public final zzal[] f47537a;

    /* renamed from: b */
    public final zzab f47538b;

    /* renamed from: c */
    public final float f47539c;

    /* renamed from: d */
    public final boolean f47540d;
    @SafeParcelable.Field(m48389id = 3)
    public final zzab zza;
    @SafeParcelable.Field(m48389id = 5)
    public final String zzb;
    @SafeParcelable.Field(m48389id = 7)
    public final String zzc;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(m48388id = 2) zzal[] zzalVarArr, @SafeParcelable.Param(m48388id = 3) zzab zzabVar, @SafeParcelable.Param(m48388id = 4) zzab zzabVar2, @SafeParcelable.Param(m48388id = 5) String str, @SafeParcelable.Param(m48388id = 6) float f, @SafeParcelable.Param(m48388id = 7) String str2, @SafeParcelable.Param(m48388id = 8) boolean z) {
        this.f47537a = zzalVarArr;
        this.zza = zzabVar;
        this.f47538b = zzabVar2;
        this.zzb = str;
        this.f47539c = f;
        this.zzc = str2;
        this.f47540d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f47537a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f47538b, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzb, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47539c);
        SafeParcelWriter.writeString(parcel, 7, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f47540d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
