package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GeoPointParcelCreator")
/* loaded from: classes3.dex */
public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new zzvs();

    /* renamed from: a */
    public final double f46801a;

    /* renamed from: b */
    public final double f46802b;

    @SafeParcelable.Constructor
    public zzvd(@SafeParcelable.Param(m48388id = 1) double d, @SafeParcelable.Param(m48388id = 2) double d2) {
        this.f46801a = d;
        this.f46802b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f46801a);
        SafeParcelWriter.writeDouble(parcel, 2, this.f46802b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final double zza() {
        return this.f46801a;
    }

    public final double zzb() {
        return this.f46802b;
    }
}
