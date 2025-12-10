package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PhoneParcelCreator")
/* loaded from: classes3.dex */
public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzvy();

    /* renamed from: a */
    public final int f46810a;

    /* renamed from: b */
    public final String f46811b;

    @SafeParcelable.Constructor
    public zzvf(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str) {
        this.f46810a = i;
        this.f46811b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46810a);
        SafeParcelWriter.writeString(parcel, 2, this.f46811b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f46810a;
    }

    @Nullable
    public final String zzb() {
        return this.f46811b;
    }
}
