package com.google.firebase.p015ml.vision.objects.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ObjectDetectorOptionsParcelCreator")
/* renamed from: com.google.firebase.ml.vision.objects.internal.ObjectDetectorOptionsParcel */
/* loaded from: classes4.dex */
public class ObjectDetectorOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ObjectDetectorOptionsParcel> CREATOR = new zzf();
    @SafeParcelable.Field(m48386id = 1)
    public final int zzbwx;
    @SafeParcelable.Field(m48386id = 2)
    public final boolean zzbwy;
    @SafeParcelable.Field(m48386id = 3)
    public final boolean zzbwz;

    @SafeParcelable.Constructor
    public ObjectDetectorOptionsParcel(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) boolean z, @SafeParcelable.Param(m48385id = 3) boolean z2) {
        this.zzbwx = i;
        this.zzbwy = z;
        this.zzbwz = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzbwx);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbwy);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbwz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}