package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UrlBookmarkParcelCreator")
/* loaded from: classes3.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzbs();

    /* renamed from: a */
    public final String f46929a;

    /* renamed from: b */
    public final String f46930b;

    @SafeParcelable.Constructor
    public zzay(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2) {
        this.f46929a = str;
        this.f46930b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46929a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46930b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
