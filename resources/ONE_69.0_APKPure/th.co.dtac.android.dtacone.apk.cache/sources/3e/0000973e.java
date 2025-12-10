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
    public final String f46910a;

    /* renamed from: b */
    public final String f46911b;

    /* renamed from: c */
    public final String f46912c;

    /* renamed from: d */
    public final String f46913d;

    /* renamed from: e */
    public final String f46914e;

    /* renamed from: f */
    public final String f46915f;

    /* renamed from: g */
    public final String f46916g;

    /* renamed from: h */
    public final String f46917h;

    /* renamed from: i */
    public final String f46918i;

    /* renamed from: j */
    public final String f46919j;

    /* renamed from: k */
    public final String f46920k;

    /* renamed from: l */
    public final String f46921l;

    /* renamed from: m */
    public final String f46922m;

    /* renamed from: n */
    public final String f46923n;

    @SafeParcelable.Constructor
    public zzas(@Nullable @SafeParcelable.Param(m48385id = 1) String str, @Nullable @SafeParcelable.Param(m48385id = 2) String str2, @Nullable @SafeParcelable.Param(m48385id = 3) String str3, @Nullable @SafeParcelable.Param(m48385id = 4) String str4, @Nullable @SafeParcelable.Param(m48385id = 5) String str5, @Nullable @SafeParcelable.Param(m48385id = 6) String str6, @Nullable @SafeParcelable.Param(m48385id = 7) String str7, @Nullable @SafeParcelable.Param(m48385id = 8) String str8, @Nullable @SafeParcelable.Param(m48385id = 9) String str9, @Nullable @SafeParcelable.Param(m48385id = 10) String str10, @Nullable @SafeParcelable.Param(m48385id = 11) String str11, @Nullable @SafeParcelable.Param(m48385id = 12) String str12, @Nullable @SafeParcelable.Param(m48385id = 13) String str13, @Nullable @SafeParcelable.Param(m48385id = 14) String str14) {
        this.f46910a = str;
        this.f46911b = str2;
        this.f46912c = str3;
        this.f46913d = str4;
        this.f46914e = str5;
        this.f46915f = str6;
        this.f46916g = str7;
        this.f46917h = str8;
        this.f46918i = str9;
        this.f46919j = str10;
        this.f46920k = str11;
        this.f46921l = str12;
        this.f46922m = str13;
        this.f46923n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46910a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46911b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46912c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46913d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f46914e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46915f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f46916g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f46917h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f46918i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f46919j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f46920k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f46921l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f46922m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f46923n, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}