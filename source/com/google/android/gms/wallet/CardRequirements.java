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
    public ArrayList f48723a;

    /* renamed from: b */
    public boolean f48724b;

    /* renamed from: c */
    public boolean f48725c;

    /* renamed from: d */
    public int f48726d;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzf zzfVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.f48723a == null) {
                cardRequirements.f48723a = new ArrayList();
            }
            CardRequirements.this.f48723a.add(Integer.valueOf(i));
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
            if (cardRequirements.f48723a == null) {
                cardRequirements.f48723a = new ArrayList();
            }
            CardRequirements.this.f48723a.addAll(collection);
            return this;
        }

        @NonNull
        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.f48723a, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        @NonNull
        public Builder setAllowPrepaidCards(boolean z) {
            CardRequirements.this.f48724b = z;
            return this;
        }

        @NonNull
        public Builder setBillingAddressFormat(int i) {
            CardRequirements.this.f48726d = i;
            return this;
        }

        @NonNull
        public Builder setBillingAddressRequired(boolean z) {
            CardRequirements.this.f48725c = z;
            return this;
        }
    }

    public CardRequirements() {
        this.f48724b = true;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.f48724b;
    }

    @Nullable
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.f48723a;
    }

    public int getBillingAddressFormat() {
        return this.f48726d;
    }

    public boolean isBillingAddressRequired() {
        return this.f48725c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.f48723a, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48724b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48725c);
        SafeParcelWriter.writeInt(parcel, 4, this.f48726d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.f48723a = arrayList;
        this.f48724b = z;
        this.f48725c = z2;
        this.f48726d = i;
    }
}
