package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "PaymentDataCreator")
/* loaded from: classes4.dex */
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {
    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();

    /* renamed from: a */
    public String f48811a;

    /* renamed from: b */
    public CardInfo f48812b;

    /* renamed from: c */
    public UserAddress f48813c;

    /* renamed from: d */
    public PaymentMethodToken f48814d;

    /* renamed from: e */
    public String f48815e;

    /* renamed from: f */
    public Bundle f48816f;

    /* renamed from: g */
    public String f48817g;

    /* renamed from: h */
    public Bundle f48818h;

    public PaymentData() {
    }

    @NonNull
    public static PaymentData fromJson(@NonNull String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.f48817g = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    @Nullable
    public static PaymentData getFromIntent(@NonNull Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @NonNull
    @Deprecated
    public CardInfo getCardInfo() {
        return this.f48812b;
    }

    @Nullable
    @Deprecated
    public String getEmail() {
        return this.f48811a;
    }

    @Nullable
    @Deprecated
    public Bundle getExtraData() {
        return this.f48816f;
    }

    @NonNull
    @Deprecated
    public String getGoogleTransactionId() {
        return this.f48815e;
    }

    @Nullable
    public Bundle getLastSavedState() {
        return this.f48818h;
    }

    @Nullable
    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.f48814d;
    }

    @Nullable
    @Deprecated
    public UserAddress getShippingAddress() {
        return this.f48813c;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public void putIntoIntent(@NonNull Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @NonNull
    public String toJson() {
        return this.f48817g;
    }

    @NonNull
    public PaymentData withLastSavedState(@Nullable Bundle bundle) {
        this.f48818h = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48811a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48812b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48813c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48814d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48815e, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.f48816f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48817g, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.f48818h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f48811a = str;
        this.f48812b = cardInfo;
        this.f48813c = userAddress;
        this.f48814d = paymentMethodToken;
        this.f48815e = str2;
        this.f48816f = bundle;
        this.f48817g = str3;
        this.f48818h = bundle2;
    }
}
