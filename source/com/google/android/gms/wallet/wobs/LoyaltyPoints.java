package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
/* loaded from: classes4.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();

    /* renamed from: a */
    public String f48887a;

    /* renamed from: b */
    public LoyaltyPointsBalance f48888b;

    /* renamed from: c */
    public TimeInterval f48889c;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @NonNull
        public LoyaltyPoints build() {
            return LoyaltyPoints.this;
        }

        @NonNull
        public Builder setBalance(@NonNull LoyaltyPointsBalance loyaltyPointsBalance) {
            LoyaltyPoints.this.f48888b = loyaltyPointsBalance;
            return this;
        }

        @NonNull
        public Builder setLabel(@NonNull String str) {
            LoyaltyPoints.this.f48887a = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setType(@NonNull String str) {
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyPoints.this.f48889c = timeInterval;
            return this;
        }
    }

    public LoyaltyPoints() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public LoyaltyPointsBalance getBalance() {
        return this.f48888b;
    }

    @NonNull
    public String getLabel() {
        return this.f48887a;
    }

    @NonNull
    @Deprecated
    public String getType() {
        return "";
    }

    @NonNull
    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.f48889c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48887a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48888b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48889c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.f48887a = str;
        this.f48888b = loyaltyPointsBalance;
        this.f48889c = timeInterval;
    }
}
