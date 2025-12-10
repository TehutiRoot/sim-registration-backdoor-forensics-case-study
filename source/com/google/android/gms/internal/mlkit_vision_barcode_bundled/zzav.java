package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PersonNameParcelCreator")
/* loaded from: classes3.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzbp();

    /* renamed from: a */
    public final String f46918a;

    /* renamed from: b */
    public final String f46919b;

    /* renamed from: c */
    public final String f46920c;

    /* renamed from: d */
    public final String f46921d;

    /* renamed from: e */
    public final String f46922e;

    /* renamed from: f */
    public final String f46923f;

    /* renamed from: g */
    public final String f46924g;

    @SafeParcelable.Constructor
    public zzav(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) String str6, @Nullable @SafeParcelable.Param(m48388id = 7) String str7) {
        this.f46918a = str;
        this.f46919b = str2;
        this.f46920c = str3;
        this.f46921d = str4;
        this.f46922e = str5;
        this.f46923f = str6;
        this.f46924g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46918a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46919b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46920c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46921d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46922e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46923f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46924g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
