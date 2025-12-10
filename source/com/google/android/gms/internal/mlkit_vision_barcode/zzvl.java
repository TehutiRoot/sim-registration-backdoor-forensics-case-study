package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeScannerOptionsParcelCreator")
/* loaded from: classes3.dex */
public final class zzvl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvl> CREATOR = new zzvm();

    /* renamed from: a */
    public final int f46834a;

    /* renamed from: b */
    public final boolean f46835b;

    @SafeParcelable.Constructor
    public zzvl(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) boolean z) {
        this.f46834a = i;
        this.f46835b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46834a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f46835b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
