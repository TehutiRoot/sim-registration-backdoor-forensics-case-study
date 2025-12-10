package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes4.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* renamed from: a */
    public String f48911a;

    /* renamed from: b */
    public String f48912b;

    /* renamed from: c */
    public String f48913c;

    /* renamed from: d */
    public String f48914d;

    /* renamed from: e */
    public String f48915e;

    /* renamed from: f */
    public String f48916f;

    /* renamed from: g */
    public String f48917g;

    /* renamed from: h */
    public String f48918h;

    /* renamed from: i */
    public String f48919i;

    /* renamed from: j */
    public boolean f48920j;

    /* renamed from: k */
    public String f48921k;

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f48911a = str;
        this.f48912b = str2;
        this.f48913c = str3;
        this.f48914d = str4;
        this.f48915e = str5;
        this.f48916f = str6;
        this.f48917g = str7;
        this.f48918h = str8;
        this.f48919i = str9;
        this.f48920j = z;
        this.f48921k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48911a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48912b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48913c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48914d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48915e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48916f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48917g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48918h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48919i, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f48920j);
        SafeParcelWriter.writeString(parcel, 12, this.f48921k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
