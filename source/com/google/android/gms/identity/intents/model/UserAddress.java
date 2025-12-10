package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.AddressConstants;

@SafeParcelable.Class(creator = "UserAddressCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();

    /* renamed from: a */
    public String f45402a;

    /* renamed from: b */
    public String f45403b;

    /* renamed from: c */
    public String f45404c;

    /* renamed from: d */
    public String f45405d;

    /* renamed from: e */
    public String f45406e;

    /* renamed from: f */
    public String f45407f;

    /* renamed from: g */
    public String f45408g;

    /* renamed from: h */
    public String f45409h;

    /* renamed from: i */
    public String f45410i;

    /* renamed from: j */
    public String f45411j;

    /* renamed from: k */
    public String f45412k;

    /* renamed from: l */
    public String f45413l;

    /* renamed from: m */
    public boolean f45414m;

    /* renamed from: n */
    public String f45415n;

    /* renamed from: o */
    public String f45416o;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f45402a = str;
        this.f45403b = str2;
        this.f45404c = str3;
        this.f45405d = str4;
        this.f45406e = str5;
        this.f45407f = str6;
        this.f45408g = str7;
        this.f45409h = str8;
        this.f45410i = str9;
        this.f45411j = str10;
        this.f45412k = str11;
        this.f45413l = str12;
        this.f45414m = z;
        this.f45415n = str13;
        this.f45416o = str14;
    }

    @Nullable
    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent != null && intent.hasExtra(AddressConstants.Extras.EXTRA_ADDRESS)) {
            return (UserAddress) intent.getParcelableExtra(AddressConstants.Extras.EXTRA_ADDRESS);
        }
        return null;
    }

    @NonNull
    public String getAddress1() {
        return this.f45403b;
    }

    @NonNull
    public String getAddress2() {
        return this.f45404c;
    }

    @NonNull
    public String getAddress3() {
        return this.f45405d;
    }

    @NonNull
    public String getAddress4() {
        return this.f45406e;
    }

    @NonNull
    public String getAddress5() {
        return this.f45407f;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.f45408g;
    }

    @NonNull
    public String getCompanyName() {
        return this.f45415n;
    }

    @NonNull
    public String getCountryCode() {
        return this.f45410i;
    }

    @NonNull
    public String getEmailAddress() {
        return this.f45416o;
    }

    @NonNull
    public String getLocality() {
        return this.f45409h;
    }

    @NonNull
    public String getName() {
        return this.f45402a;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.f45413l;
    }

    @NonNull
    public String getPostalCode() {
        return this.f45411j;
    }

    @NonNull
    public String getSortingCode() {
        return this.f45412k;
    }

    public boolean isPostBox() {
        return this.f45414m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f45402a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45403b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45404c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f45405d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f45406e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f45407f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f45408g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f45409h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f45410i, false);
        SafeParcelWriter.writeString(parcel, 11, this.f45411j, false);
        SafeParcelWriter.writeString(parcel, 12, this.f45412k, false);
        SafeParcelWriter.writeString(parcel, 13, this.f45413l, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.f45414m);
        SafeParcelWriter.writeString(parcel, 15, this.f45415n, false);
        SafeParcelWriter.writeString(parcel, 16, this.f45416o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
