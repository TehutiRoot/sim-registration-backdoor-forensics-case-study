package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TransactionInfoCreator")
/* loaded from: classes4.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzao();

    /* renamed from: a */
    public int f48838a;

    /* renamed from: b */
    public String f48839b;

    /* renamed from: c */
    public String f48840c;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzan zzanVar) {
        }

        @NonNull
        public TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.f48840c, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i = transactionInfo.f48838a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                    }
                } else {
                    Preconditions.checkNotEmpty(transactionInfo.f48839b, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                }
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.f48838a == 3) {
                Preconditions.checkNotEmpty(transactionInfo2.f48839b, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        @NonNull
        public Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.f48840c = str;
            return this;
        }

        @NonNull
        public Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.f48839b = str;
            return this;
        }

        @NonNull
        public Builder setTotalPriceStatus(int i) {
            TransactionInfo.this.f48838a = i;
            return this;
        }
    }

    public TransactionInfo() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.f48840c;
    }

    @Nullable
    public String getTotalPrice() {
        return this.f48839b;
    }

    public int getTotalPriceStatus() {
        return this.f48838a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48838a);
        SafeParcelWriter.writeString(parcel, 2, this.f48839b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48840c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(m48388id = 1) int i, @NonNull @SafeParcelable.Param(m48388id = 2) String str, @NonNull @SafeParcelable.Param(m48388id = 3) String str2) {
        this.f48838a = i;
        this.f48839b = str;
        this.f48840c = str2;
    }
}
