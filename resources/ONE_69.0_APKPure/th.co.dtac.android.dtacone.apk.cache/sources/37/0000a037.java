package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import org.checkerframework.dataflow.qual.Pure;

@SafeParcelable.Class(creator = "PaymentCardRecognitionCreator")
/* loaded from: classes4.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();

    /* renamed from: a */
    public String f48821a;

    /* renamed from: b */
    public CreditCardExpirationDate f48822b;

    public PaymentCardRecognitionResult(String str, CreditCardExpirationDate creditCardExpirationDate) {
        this.f48821a = str;
        this.f48822b = creditCardExpirationDate;
    }

    @Nullable
    public static PaymentCardRecognitionResult getFromIntent(@NonNull Intent intent) {
        return (PaymentCardRecognitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentCardRecognitionResult", CREATOR);
    }

    @Nullable
    @Pure
    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.f48822b;
    }

    @NonNull
    public String getPan() {
        return this.f48821a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48821a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48822b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}