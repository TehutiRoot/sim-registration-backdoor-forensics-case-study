package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzi();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;

    /* renamed from: a */
    public LoyaltyWalletObject f48728a;

    /* renamed from: b */
    public OfferWalletObject f48729b;

    /* renamed from: c */
    public GiftCardWalletObject f48730c;

    /* renamed from: d */
    public int f48731d;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public CreateWalletObjectsRequest build() {
            int i;
            int i2;
            int i3;
            CreateWalletObjectsRequest createWalletObjectsRequest = CreateWalletObjectsRequest.this;
            boolean z = false;
            if (createWalletObjectsRequest.f48730c == null) {
                i = 0;
            } else {
                i = 1;
            }
            if (createWalletObjectsRequest.f48728a == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = i + i2;
            if (createWalletObjectsRequest.f48729b == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i4 + i3 == 1) {
                z = true;
            }
            Preconditions.checkState(z, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return CreateWalletObjectsRequest.this;
        }

        @NonNull
        public Builder setCreateMode(int i) {
            CreateWalletObjectsRequest.this.f48731d = i;
            return this;
        }

        @NonNull
        public Builder setGiftCardWalletObject(@NonNull GiftCardWalletObject giftCardWalletObject) {
            CreateWalletObjectsRequest.this.f48730c = giftCardWalletObject;
            return this;
        }

        @NonNull
        public Builder setLoyaltyWalletObject(@NonNull LoyaltyWalletObject loyaltyWalletObject) {
            CreateWalletObjectsRequest.this.f48728a = loyaltyWalletObject;
            return this;
        }

        @NonNull
        public Builder setOfferWalletObject(@NonNull OfferWalletObject offerWalletObject) {
            CreateWalletObjectsRequest.this.f48729b = offerWalletObject;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CreateMode {
    }

    public CreateWalletObjectsRequest() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public int getCreateMode() {
        return this.f48731d;
    }

    @NonNull
    public GiftCardWalletObject getGiftCardWalletObject() {
        return this.f48730c;
    }

    @NonNull
    public LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.f48728a;
    }

    @NonNull
    public OfferWalletObject getOfferWalletObject() {
        return this.f48729b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48728a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48729b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48730c, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f48731d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull GiftCardWalletObject giftCardWalletObject) {
        this.f48730c = giftCardWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull LoyaltyWalletObject loyaltyWalletObject) {
        this.f48728a = loyaltyWalletObject;
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.f48728a = loyaltyWalletObject;
        this.f48729b = offerWalletObject;
        this.f48730c = giftCardWalletObject;
        this.f48731d = i;
    }

    @Deprecated
    public CreateWalletObjectsRequest(@NonNull OfferWalletObject offerWalletObject) {
        this.f48729b = offerWalletObject;
    }
}
