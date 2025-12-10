package com.google.android.gms.wallet;

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

@SafeParcelable.Class(creator = "CardRequirementsCreator")
/* loaded from: classes4.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();

    /* renamed from: a */
    public ArrayList f48735a;

    /* renamed from: b */
    public boolean f48736b;

    /* renamed from: c */
    public boolean f48737c;

    /* renamed from: d */
    public int f48738d;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzf zzfVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.f48735a == null) {
                cardRequirements.f48735a = new ArrayList();
            }
            CardRequirements.this.f48735a.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.f48735a == null) {
                cardRequirements.f48735a = new ArrayList();
            }
            CardRequirements.this.f48735a.addAll(collection);
            return this;
        }

        @NonNull
        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.f48735a, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        @NonNull
        public Builder setAllowPrepaidCards(boolean z) {
            CardRequirements.this.f48736b = z;
            return this;
        }

        @NonNull
        public Builder setBillingAddressFormat(int i) {
            CardRequirements.this.f48738d = i;
            return this;
        }

        @NonNull
        public Builder setBillingAddressRequired(boolean z) {
            CardRequirements.this.f48737c = z;
            return this;
        }
    }

    public CardRequirements() {
        this.f48736b = true;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.f48736b;
    }

    @Nullable
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.f48735a;
    }

    public int getBillingAddressFormat() {
        return this.f48738d;
    }

    public boolean isBillingAddressRequired() {
        return this.f48737c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.f48735a, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48736b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48737c);
        SafeParcelWriter.writeInt(parcel, 4, this.f48738d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.f48735a = arrayList;
        this.f48736b = z;
        this.f48737c = z2;
        this.f48738d = i;
    }
}