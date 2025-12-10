package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();

    /* renamed from: a */
    public int f48845a;

    /* renamed from: b */
    public Bundle f48846b;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzae zzaeVar) {
        }

        @NonNull
        public Builder addParameter(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.f48846b.putString(str, str2);
            return this;
        }

        @NonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.f48845a = i;
            return this;
        }
    }

    public PaymentMethodTokenizationParameters() {
        this.f48846b = new Bundle();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public Bundle getParameters() {
        return new Bundle(this.f48846b);
    }

    public int getPaymentMethodTokenizationType() {
        return this.f48845a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48845a);
        SafeParcelWriter.writeBundle(parcel, 3, this.f48846b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.f48845a = i;
        this.f48846b = bundle;
    }
}