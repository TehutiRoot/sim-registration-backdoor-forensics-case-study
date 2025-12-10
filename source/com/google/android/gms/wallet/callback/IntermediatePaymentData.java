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

@SafeParcelable.Class(creator = "IntermediatePaymentDataCreator")
/* loaded from: classes4.dex */
public class IntermediatePaymentData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<IntermediatePaymentData> CREATOR = new zzl();

    /* renamed from: a */
    public String f48855a;

    /* renamed from: b */
    public Bundle f48856b;

    public IntermediatePaymentData(String str, Bundle bundle) {
        this.f48855a = str;
        this.f48856b = bundle;
    }

    @NonNull
    public static IntermediatePaymentData fromJson(@NonNull String str) {
        return new IntermediatePaymentData((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    @Nullable
    public Bundle getLastSavedState() {
        return this.f48856b;
    }

    @NonNull
    public String toJson() {
        return this.f48855a;
    }

    @NonNull
    public IntermediatePaymentData withLastSavedState(@Nullable Bundle bundle) {
        this.f48856b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48855a, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.f48856b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
