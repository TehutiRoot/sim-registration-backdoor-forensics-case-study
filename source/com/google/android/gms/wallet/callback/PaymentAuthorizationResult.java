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

@SafeParcelable.Class(creator = "PaymentAuthorizationResultCreator")
/* loaded from: classes4.dex */
public class PaymentAuthorizationResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentAuthorizationResult> CREATOR = new zzm();

    /* renamed from: a */
    public String f48857a;

    /* renamed from: b */
    public Bundle f48858b;

    public PaymentAuthorizationResult(String str, Bundle bundle) {
        this.f48857a = str;
        this.f48858b = bundle;
    }

    @NonNull
    public static PaymentAuthorizationResult fromJson(@NonNull String str) {
        return new PaymentAuthorizationResult((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    @Nullable
    public Bundle getUpdatedSavedState() {
        return this.f48858b;
    }

    @NonNull
    public String toJson() {
        return this.f48857a;
    }

    @NonNull
    public PaymentAuthorizationResult withUpdatedSavedState(@Nullable Bundle bundle) {
        this.f48858b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48857a, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.f48858b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
