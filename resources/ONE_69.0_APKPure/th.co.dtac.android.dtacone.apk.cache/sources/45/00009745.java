package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WiFiParcelCreator")
/* loaded from: classes3.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzbt();

    /* renamed from: a */
    public final String f46943a;

    /* renamed from: b */
    public final String f46944b;

    /* renamed from: c */
    public final int f46945c;

    @SafeParcelable.Constructor
    public zzaz(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2, @SafeParcelable.Param(m48385id = 3) int i) {
        this.f46943a = str;
        this.f46944b = str2;
        this.f46945c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46943a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46944b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f46945c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}