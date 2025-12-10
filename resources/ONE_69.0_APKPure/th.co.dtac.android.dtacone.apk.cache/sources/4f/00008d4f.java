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
    public String f45414a;

    /* renamed from: b */
    public String f45415b;

    /* renamed from: c */
    public String f45416c;

    /* renamed from: d */
    public String f45417d;

    /* renamed from: e */
    public String f45418e;

    /* renamed from: f */
    public String f45419f;

    /* renamed from: g */
    public String f45420g;

    /* renamed from: h */
    public String f45421h;

    /* renamed from: i */
    public String f45422i;

    /* renamed from: j */
    public String f45423j;

    /* renamed from: k */
    public String f45424k;

    /* renamed from: l */
    public String f45425l;

    /* renamed from: m */
    public boolean f45426m;

    /* renamed from: n */
    public String f45427n;

    /* renamed from: o */
    public String f45428o;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f45414a = str;
        this.f45415b = str2;
        this.f45416c = str3;
        this.f45417d = str4;
        this.f45418e = str5;
        this.f45419f = str6;
        this.f45420g = str7;
        this.f45421h = str8;
        this.f45422i = str9;
        this.f45423j = str10;
        this.f45424k = str11;
        this.f45425l = str12;
        this.f45426m = z;
        this.f45427n = str13;
        this.f45428o = str14;
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
        return this.f45415b;
    }

    @NonNull
    public String getAddress2() {
        return this.f45416c;
    }

    @NonNull
    public String getAddress3() {
        return this.f45417d;
    }

    @NonNull
    public String getAddress4() {
        return this.f45418e;
    }

    @NonNull
    public String getAddress5() {
        return this.f45419f;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.f45420g;
    }

    @NonNull
    public String getCompanyName() {
        return this.f45427n;
    }

    @NonNull
    public String getCountryCode() {
        return this.f45422i;
    }

    @NonNull
    public String getEmailAddress() {
        return this.f45428o;
    }

    @NonNull
    public String getLocality() {
        return this.f45421h;
    }

    @NonNull
    public String getName() {
        return this.f45414a;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.f45425l;
    }

    @NonNull
    public String getPostalCode() {
        return this.f45423j;
    }

    @NonNull
    public String getSortingCode() {
        return this.f45424k;
    }

    public boolean isPostBox() {
        return this.f45426m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f45414a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45415b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45416c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f45417d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f45418e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f45419f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f45420g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f45421h, false);
        SafeParcelWriter.writeString(parcel, 10, this.f45422i, false);
        SafeParcelWriter.writeString(parcel, 11, this.f45423j, false);
        SafeParcelWriter.writeString(parcel, 12, this.f45424k, false);
        SafeParcelWriter.writeString(parcel, 13, this.f45425l, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.f45426m);
        SafeParcelWriter.writeString(parcel, 15, this.f45427n, false);
        SafeParcelWriter.writeString(parcel, 16, this.f45428o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}