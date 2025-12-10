package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressParcelCreator")
/* loaded from: classes3.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();

    /* renamed from: a */
    public final int f46874a;

    /* renamed from: b */
    public final String[] f46875b;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) String[] strArr) {
        this.f46874a = i;
        this.f46875b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46874a);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f46875b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
