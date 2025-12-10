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

@SafeParcelable.Class(creator = "ShippingAddressRequirementsCreator")
/* loaded from: classes4.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzam();

    /* renamed from: a */
    public ArrayList f48836a;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzal zzalVar) {
        }

        @NonNull
        public Builder addAllowedCountryCode(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.f48836a == null) {
                shippingAddressRequirements.f48836a = new ArrayList();
            }
            ShippingAddressRequirements.this.f48836a.add(str);
            return this;
        }

        @NonNull
        public Builder addAllowedCountryCodes(@NonNull Collection<String> collection) {
            if (collection != null && !collection.isEmpty()) {
                ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
                if (shippingAddressRequirements.f48836a == null) {
                    shippingAddressRequirements.f48836a = new ArrayList();
                }
                ShippingAddressRequirements.this.f48836a.addAll(collection);
                return this;
            }
            throw new IllegalArgumentException("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
        }

        @NonNull
        public ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }
    }

    public ShippingAddressRequirements() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Nullable
    public ArrayList<String> getAllowedCountryCodes() {
        return this.f48836a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f48836a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.f48836a = arrayList;
    }
}
