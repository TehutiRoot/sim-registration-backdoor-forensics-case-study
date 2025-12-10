package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeScannerOptionsParcelCreator")
/* loaded from: classes3.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();

    /* renamed from: a */
    public final int f46949a;

    /* renamed from: b */
    public final boolean f46950b;

    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) boolean z) {
        this.f46949a = i;
        this.f46950b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46949a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f46950b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46949a;
    }

    public final boolean zzb() {
        return this.f46950b;
    }
}
