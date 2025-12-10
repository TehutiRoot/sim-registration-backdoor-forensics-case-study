package com.google.firebase.p015ml.vision.barcode.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeDetectorOptionsParcelCreator")
/* renamed from: com.google.firebase.ml.vision.barcode.internal.BarcodeDetectorOptionsParcel */
/* loaded from: classes4.dex */
public class BarcodeDetectorOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BarcodeDetectorOptionsParcel> CREATOR = new zza();
    @SafeParcelable.Field(m48386id = 1)
    public final int zzbth;

    @SafeParcelable.Constructor
    public BarcodeDetectorOptionsParcel(@SafeParcelable.Param(m48385id = 1) int i) {
        this.zzbth = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzbth);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}