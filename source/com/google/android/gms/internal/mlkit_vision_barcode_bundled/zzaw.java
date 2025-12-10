package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PhoneParcelCreator")
/* loaded from: classes3.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzbq();

    /* renamed from: a */
    public final int f46925a;

    /* renamed from: b */
    public final String f46926b;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str) {
        this.f46925a = i;
        this.f46926b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46925a);
        SafeParcelWriter.writeString(parcel, 2, this.f46926b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
