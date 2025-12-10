package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
/* loaded from: classes4.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzac();

    /* renamed from: a */
    public boolean f48819a;

    /* renamed from: b */
    public boolean f48820b;

    /* renamed from: c */
    public CardRequirements f48821c;

    /* renamed from: d */
    public boolean f48822d;

    /* renamed from: e */
    public ShippingAddressRequirements f48823e;

    /* renamed from: f */
    public ArrayList f48824f;

    /* renamed from: g */
    public PaymentMethodTokenizationParameters f48825g;

    /* renamed from: h */
    public TransactionInfo f48826h;

    /* renamed from: i */
    public boolean f48827i;

    /* renamed from: j */
    public String f48828j;

    /* renamed from: k */
    public Bundle f48829k;

    @Deprecated
    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzab zzabVar) {
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48824f == null) {
                paymentDataRequest.f48824f = new ArrayList();
            }
            PaymentDataRequest.this.f48824f.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48824f == null) {
                paymentDataRequest.f48824f = new ArrayList();
            }
            PaymentDataRequest.this.f48824f.addAll(collection);
            return this;
        }

        @NonNull
        public PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48828j == null) {
                Preconditions.checkNotNull(paymentDataRequest.f48824f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.f48821c, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.f48825g != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.f48826h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        @NonNull
        public Builder setCardRequirements(@NonNull CardRequirements cardRequirements) {
            PaymentDataRequest.this.f48821c = cardRequirements;
            return this;
        }

        @NonNull
        public Builder setEmailRequired(boolean z) {
            PaymentDataRequest.this.f48819a = z;
            return this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationParameters(@NonNull PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.f48825g = paymentMethodTokenizationParameters;
            return this;
        }

        @NonNull
        public Builder setPhoneNumberRequired(boolean z) {
            PaymentDataRequest.this.f48820b = z;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequired(boolean z) {
            PaymentDataRequest.this.f48822d = z;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequirements(@NonNull ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.f48823e = shippingAddressRequirements;
            return this;
        }

        @NonNull
        public Builder setTransactionInfo(@NonNull TransactionInfo transactionInfo) {
            PaymentDataRequest.this.f48826h = transactionInfo;
            return this;
        }

        @NonNull
        public Builder setUiRequired(boolean z) {
            PaymentDataRequest.this.f48827i = z;
            return this;
        }
    }

    public PaymentDataRequest() {
        this.f48827i = true;
    }

    @NonNull
    public static PaymentDataRequest fromJson(@NonNull String str) {
        Builder newBuilder = newBuilder();
        PaymentDataRequest.this.f48828j = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return newBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.f48824f;
    }

    @Nullable
    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.f48821c;
    }

    @NonNull
    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.f48825g;
    }

    @Nullable
    public Bundle getSavedState() {
        return this.f48829k;
    }

    @Nullable
    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.f48823e;
    }

    @NonNull
    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.f48826h;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.f48819a;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.f48820b;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.f48822d;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.f48827i;
    }

    @NonNull
    public String toJson() {
        return this.f48828j;
    }

    @NonNull
    public PaymentDataRequest withSavedState(@Nullable Bundle bundle) {
        this.f48829k = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f48819a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48820b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48821c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48822d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48823e, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f48824f, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48825g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f48826h, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f48827i);
        SafeParcelWriter.writeString(parcel, 10, this.f48828j, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.f48829k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.f48819a = z;
        this.f48820b = z2;
        this.f48821c = cardRequirements;
        this.f48822d = z3;
        this.f48823e = shippingAddressRequirements;
        this.f48824f = arrayList;
        this.f48825g = paymentMethodTokenizationParameters;
        this.f48826h = transactionInfo;
        this.f48827i = z4;
        this.f48828j = str;
        this.f48829k = bundle;
    }
}
