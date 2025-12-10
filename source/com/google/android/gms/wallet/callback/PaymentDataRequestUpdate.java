package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentDataRequestUpdateCreator")
/* loaded from: classes4.dex */
public class PaymentDataRequestUpdate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentDataRequestUpdate> CREATOR = new zzn();

    /* renamed from: a */
    public String f48859a;

    /* renamed from: b */
    public Bundle f48860b;

    public PaymentDataRequestUpdate(String str, Bundle bundle) {
        this.f48859a = str;
        this.f48860b = bundle;
    }

    @NonNull
    public static PaymentDataRequestUpdate fromJson(@NonNull String str) {
        return new PaymentDataRequestUpdate((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    @Nullable
    public Bundle getUpdatedSavedState() {
        return this.f48860b;
    }

    @NonNull
    public String toJson() {
        return this.f48859a;
    }

    @NonNull
    public PaymentDataRequestUpdate withUpdatedSavedState(@Nullable Bundle bundle) {
        this.f48860b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48859a, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.f48860b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
