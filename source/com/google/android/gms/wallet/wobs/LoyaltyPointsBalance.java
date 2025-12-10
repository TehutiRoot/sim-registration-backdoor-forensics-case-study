package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    /* renamed from: a */
    public int f48891a;

    /* renamed from: b */
    public String f48892b;

    /* renamed from: c */
    public double f48893c;

    /* renamed from: d */
    public String f48894d;

    /* renamed from: e */
    public long f48895e;

    /* renamed from: f */
    public int f48896f;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        @NonNull
        public Builder setDouble(double d) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48893c = d;
            loyaltyPointsBalance.f48896f = 2;
            return this;
        }

        @NonNull
        public Builder setInt(int i) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48891a = i;
            loyaltyPointsBalance.f48896f = 0;
            return this;
        }

        @NonNull
        public Builder setMoney(@NonNull String str, long j) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48894d = str;
            loyaltyPointsBalance.f48895e = j;
            loyaltyPointsBalance.f48896f = 3;
            return this;
        }

        @NonNull
        public Builder setString(@NonNull String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48892b = str;
            loyaltyPointsBalance.f48896f = 1;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    public LoyaltyPointsBalance() {
        this.f48896f = -1;
        this.f48891a = -1;
        this.f48893c = -1.0d;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.f48894d;
    }

    public long getCurrencyMicros() {
        return this.f48895e;
    }

    public double getDouble() {
        return this.f48893c;
    }

    public int getInt() {
        return this.f48891a;
    }

    @NonNull
    public String getString() {
        return this.f48892b;
    }

    public int getType() {
        return this.f48896f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48891a);
        SafeParcelWriter.writeString(parcel, 3, this.f48892b, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.f48893c);
        SafeParcelWriter.writeString(parcel, 5, this.f48894d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f48895e);
        SafeParcelWriter.writeInt(parcel, 7, this.f48896f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.f48891a = i;
        this.f48892b = str;
        this.f48893c = d;
        this.f48894d = str2;
        this.f48895e = j;
        this.f48896f = i2;
    }
}
