package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "CardInfoCreator")
/* loaded from: classes4.dex */
public final class CardInfo extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();

    /* renamed from: a */
    public String f48730a;

    /* renamed from: b */
    public String f48731b;

    /* renamed from: c */
    public String f48732c;

    /* renamed from: d */
    public int f48733d;

    /* renamed from: e */
    public UserAddress f48734e;

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.f48730a = str;
        this.f48731b = str2;
        this.f48732c = str3;
        this.f48733d = i;
        this.f48734e = userAddress;
    }

    @Nullable
    public UserAddress getBillingAddress() {
        return this.f48734e;
    }

    public int getCardClass() {
        int i = this.f48733d;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getCardDescription() {
        return this.f48730a;
    }

    @NonNull
    public String getCardDetails() {
        return this.f48732c;
    }

    @NonNull
    public String getCardNetwork() {
        return this.f48731b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48730a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48731b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48732c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f48733d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48734e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}