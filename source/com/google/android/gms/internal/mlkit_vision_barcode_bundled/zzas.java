package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
/* loaded from: classes3.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzbh();

    /* renamed from: a */
    public final String f46898a;

    /* renamed from: b */
    public final String f46899b;

    /* renamed from: c */
    public final String f46900c;

    /* renamed from: d */
    public final String f46901d;

    /* renamed from: e */
    public final String f46902e;

    /* renamed from: f */
    public final String f46903f;

    /* renamed from: g */
    public final String f46904g;

    /* renamed from: h */
    public final String f46905h;

    /* renamed from: i */
    public final String f46906i;

    /* renamed from: j */
    public final String f46907j;

    /* renamed from: k */
    public final String f46908k;

    /* renamed from: l */
    public final String f46909l;

    /* renamed from: m */
    public final String f46910m;

    /* renamed from: n */
    public final String f46911n;

    @SafeParcelable.Constructor
    public zzas(@Nullable @SafeParcelable.Param(m48388id = 1) String str, @Nullable @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @Nullable @SafeParcelable.Param(m48388id = 4) String str4, @Nullable @SafeParcelable.Param(m48388id = 5) String str5, @Nullable @SafeParcelable.Param(m48388id = 6) String str6, @Nullable @SafeParcelable.Param(m48388id = 7) String str7, @Nullable @SafeParcelable.Param(m48388id = 8) String str8, @Nullable @SafeParcelable.Param(m48388id = 9) String str9, @Nullable @SafeParcelable.Param(m48388id = 10) String str10, @Nullable @SafeParcelable.Param(m48388id = 11) String str11, @Nullable @SafeParcelable.Param(m48388id = 12) String str12, @Nullable @SafeParcelable.Param(m48388id = 13) String str13, @Nullable @SafeParcelable.Param(m48388id = 14) String str14) {
        this.f46898a = str;
        this.f46899b = str2;
        this.f46900c = str3;
        this.f46901d = str4;
        this.f46902e = str5;
        this.f46903f = str6;
        this.f46904g = str7;
        this.f46905h = str8;
        this.f46906i = str9;
        this.f46907j = str10;
        this.f46908k = str11;
        this.f46909l = str12;
        this.f46910m = str13;
        this.f46911n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46898a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46899b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46900c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46901d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46902e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46903f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46904g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f46905h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f46906i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f46907j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f46908k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f46909l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f46910m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f46911n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
