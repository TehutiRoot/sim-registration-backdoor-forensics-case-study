package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();

    /* renamed from: a */
    public ArrayList f48759a;

    /* renamed from: b */
    public String f48760b;

    /* renamed from: c */
    public String f48761c;

    /* renamed from: d */
    public ArrayList f48762d;

    /* renamed from: e */
    public boolean f48763e;

    /* renamed from: f */
    public String f48764f;

    @Deprecated
    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzp zzpVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48759a == null) {
                isReadyToPayRequest.f48759a = new ArrayList();
            }
            IsReadyToPayRequest.this.f48759a.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48759a == null) {
                isReadyToPayRequest.f48759a = new ArrayList();
            }
            IsReadyToPayRequest.this.f48759a.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48762d == null) {
                isReadyToPayRequest.f48762d = new ArrayList();
            }
            IsReadyToPayRequest.this.f48762d.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f48762d == null) {
                isReadyToPayRequest.f48762d = new ArrayList();
            }
            IsReadyToPayRequest.this.f48762d.addAll(collection);
            return this;
        }

        @NonNull
        public IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        @NonNull
        public Builder setExistingPaymentMethodRequired(boolean z) {
            IsReadyToPayRequest.this.f48763e = z;
            return this;
        }
    }

    public IsReadyToPayRequest() {
    }

    @NonNull
    public static IsReadyToPayRequest fromJson(@NonNull String str) {
        Builder newBuilder = newBuilder();
        IsReadyToPayRequest.this.f48764f = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return newBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.f48759a;
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.f48762d;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.f48763e;
    }

    @NonNull
    public String toJson() {
        return this.f48764f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.f48759a, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48760b, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48761c, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f48762d, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f48763e);
        SafeParcelWriter.writeString(parcel, 8, this.f48764f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.f48759a = arrayList;
        this.f48760b = str;
        this.f48761c = str2;
        this.f48762d = arrayList2;
        this.f48763e = z;
        this.f48764f = str3;
    }
}
