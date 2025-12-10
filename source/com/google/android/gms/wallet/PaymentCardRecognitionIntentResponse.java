package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentResponseCreator")
/* loaded from: classes4.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new zzz();

    /* renamed from: a */
    public PendingIntent f48808a;

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.f48808a = pendingIntent;
    }

    @NonNull
    public PendingIntent getPaymentCardRecognitionPendingIntent() {
        return this.f48808a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48808a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
