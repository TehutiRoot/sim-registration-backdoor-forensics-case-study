package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressParcelCreator")
/* loaded from: classes3.dex */
public final class zzux extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzux> CREATOR = new zzuw();

    /* renamed from: a */
    public final int f46759a;

    /* renamed from: b */
    public final String[] f46760b;

    @SafeParcelable.Constructor
    public zzux(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) String[] strArr) {
        this.f46759a = i;
        this.f46760b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46759a);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f46760b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46759a;
    }

    public final String[] zzb() {
        return this.f46760b;
    }
}
