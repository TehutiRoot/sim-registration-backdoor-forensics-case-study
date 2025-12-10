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
    public String f48923a;

    /* renamed from: b */
    public String f48924b;

    /* renamed from: c */
    public String f48925c;

    /* renamed from: d */
    public String f48926d;

    /* renamed from: e */
    public String f48927e;

    /* renamed from: f */
    public String f48928f;

    /* renamed from: g */
    public String f48929g;

    /* renamed from: h */
    public String f48930h;

    /* renamed from: i */
    public String f48931i;

    /* renamed from: j */
    public boolean f48932j;

    /* renamed from: k */
    public String f48933k;

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f48923a = str;
        this.f48924b = str2;
        this.f48925c = str3;
        this.f48926d = str4;
        this.f48927e = str5;
        this.f48928f = str6;
        this.f48929g = str7;
        this.f48930h = str8;
        this.f48931i = str9;
        this.f48932j = z;
        this.f48933k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48923a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48924b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48925c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48926d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48927e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48928f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48929g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48930h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48931i, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f48932j);
        SafeParcelWriter.writeString(parcel, 12, this.f48933k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}