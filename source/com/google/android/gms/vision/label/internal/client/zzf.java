package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageLabelParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zze();
    @SafeParcelable.Field(m48389id = 2)
    public final String label;
    @SafeParcelable.Field(m48389id = 4)
    public final String zzdv;
    @SafeParcelable.Field(m48389id = 3)
    public final float zzdw;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(m48388id = 4) String str, @SafeParcelable.Param(m48388id = 2) String str2, @SafeParcelable.Param(m48388id = 3) float f) {
        this.label = str2;
        this.zzdw = f;
        this.zzdv = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.label, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzdw);
        SafeParcelWriter.writeString(parcel, 4, this.zzdv, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
