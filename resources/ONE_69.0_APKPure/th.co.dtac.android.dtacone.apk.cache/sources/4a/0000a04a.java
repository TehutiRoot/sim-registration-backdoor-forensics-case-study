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
    public int f48850a;

    /* renamed from: b */
    public String f48851b;

    /* renamed from: c */
    public String f48852c;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzan zzanVar) {
        }

        @NonNull
        public TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.f48852c, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i = transactionInfo.f48850a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                    }
                } else {
                    Preconditions.checkNotEmpty(transactionInfo.f48851b, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                }
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.f48850a == 3) {
                Preconditions.checkNotEmpty(transactionInfo2.f48851b, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        @NonNull
        public Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.f48852c = str;
            return this;
        }

        @NonNull
        public Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.f48851b = str;
            return this;
        }

        @NonNull
        public Builder setTotalPriceStatus(int i) {
            TransactionInfo.this.f48850a = i;
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
        return this.f48852c;
    }

    @Nullable
    public String getTotalPrice() {
        return this.f48851b;
    }

    public int getTotalPriceStatus() {
        return this.f48850a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48850a);
        SafeParcelWriter.writeString(parcel, 2, this.f48851b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48852c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(m48385id = 1) int i, @NonNull @SafeParcelable.Param(m48385id = 2) String str, @NonNull @SafeParcelable.Param(m48385id = 3) String str2) {
        this.f48850a = i;
        this.f48851b = str;
        this.f48852c = str2;
    }
}