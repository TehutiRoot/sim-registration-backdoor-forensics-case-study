package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzad();

    /* renamed from: a */
    public int f48843a;

    /* renamed from: b */
    public String f48844b;

    public PaymentMethodToken(int i, String str) {
        this.f48843a = i;
        this.f48844b = str;
    }

    public int getPaymentMethodTokenizationType() {
        return this.f48843a;
    }

    @NonNull
    public String getToken() {
        return this.f48844b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48843a);
        SafeParcelWriter.writeString(parcel, 3, this.f48844b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}