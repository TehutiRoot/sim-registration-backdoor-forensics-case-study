package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LabelOptionsCreator")
@SafeParcelable.Reserved({1})
@ShowFirstParty
@KeepForSdk
/* loaded from: classes4.dex */
public class LabelOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelOptions> CREATOR = new zzh();
    @SafeParcelable.Field(m48389id = 2)
    @Deprecated
    public final int zzee;

    @SafeParcelable.Constructor
    public LabelOptions(@SafeParcelable.Param(m48388id = 2) int i) {
        this.zzee = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzee);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
