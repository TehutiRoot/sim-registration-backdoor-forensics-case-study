package com.google.firebase.p015ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnDeviceAutoMLImageLabelerOptionsParcelCreator")
/* renamed from: com.google.firebase.ml.vision.automl.internal.OnDeviceAutoMLImageLabelerOptionsParcel */
/* loaded from: classes4.dex */
public class OnDeviceAutoMLImageLabelerOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnDeviceAutoMLImageLabelerOptionsParcel> CREATOR = new zzm();
    @SafeParcelable.Field(m48389id = 1)
    public final float confidenceThreshold;
    @SafeParcelable.Field(m48389id = 2)
    public final String zzbsp;
    @SafeParcelable.Field(m48389id = 3)
    public final String zzbsq;
    @SafeParcelable.Field(m48389id = 4)
    public final String zzbsr;

    @SafeParcelable.Constructor
    public OnDeviceAutoMLImageLabelerOptionsParcel(@SafeParcelable.Param(m48388id = 1) float f, @SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) String str2, @SafeParcelable.Param(m48388id = 4) String str3) {
        this.confidenceThreshold = f;
        this.zzbsp = str;
        this.zzbsq = str2;
        this.zzbsr = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 1, this.confidenceThreshold);
        SafeParcelWriter.writeString(parcel, 2, this.zzbsp, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbsq, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbsr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
