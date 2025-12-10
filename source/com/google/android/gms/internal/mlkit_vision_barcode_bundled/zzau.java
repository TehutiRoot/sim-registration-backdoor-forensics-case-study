package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GeoPointParcelCreator")
/* loaded from: classes3.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzbj();

    /* renamed from: a */
    public final double f46916a;

    /* renamed from: b */
    public final double f46917b;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m48388id = 1) double d, @SafeParcelable.Param(m48388id = 2) double d2) {
        this.f46916a = d;
        this.f46917b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f46916a);
        SafeParcelWriter.writeDouble(parcel, 2, this.f46917b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
