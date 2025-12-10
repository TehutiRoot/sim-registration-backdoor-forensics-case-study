package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "EmailParcelCreator")
/* loaded from: classes3.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new zzbi();

    /* renamed from: a */
    public final int f46912a;

    /* renamed from: b */
    public final String f46913b;

    /* renamed from: c */
    public final String f46914c;

    /* renamed from: d */
    public final String f46915d;

    @SafeParcelable.Constructor
    public zzat(@SafeParcelable.Param(m48388id = 1) int i, @Nullable @SafeParcelable.Param(m48388id = 2) String str, @Nullable @SafeParcelable.Param(m48388id = 3) String str2, @Nullable @SafeParcelable.Param(m48388id = 4) String str3) {
        this.f46912a = i;
        this.f46913b = str;
        this.f46914c = str2;
        this.f46915d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46912a);
        SafeParcelWriter.writeString(parcel, 2, this.f46913b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46914c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46915d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
