package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PointOfInterestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzs();
    @NonNull
    @SafeParcelable.Field(m48389id = 2)
    public final LatLng latLng;
    @NonNull
    @SafeParcelable.Field(m48389id = 4)
    public final String name;
    @NonNull
    @SafeParcelable.Field(m48389id = 3)
    public final String placeId;

    @SafeParcelable.Constructor
    public PointOfInterest(@NonNull @SafeParcelable.Param(m48388id = 2) LatLng latLng, @NonNull @SafeParcelable.Param(m48388id = 3) String str, @NonNull @SafeParcelable.Param(m48388id = 4) String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        LatLng latLng = this.latLng;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.placeId, false);
        SafeParcelWriter.writeString(parcel, 4, this.name, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
