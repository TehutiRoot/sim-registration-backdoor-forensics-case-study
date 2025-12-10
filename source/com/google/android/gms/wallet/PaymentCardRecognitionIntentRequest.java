package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentRequestCreator")
/* loaded from: classes4.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new zzy();

    /* renamed from: a */
    public int f48806a;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzx zzxVar) {
        }

        @NonNull
        public PaymentCardRecognitionIntentRequest build() {
            boolean z;
            if (PaymentCardRecognitionIntentRequest.this.f48806a != 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "The paymentCardRecognitionType is required when creating a PaymentCardRecognitionIntentRequest.");
            return PaymentCardRecognitionIntentRequest.this;
        }
    }

    public PaymentCardRecognitionIntentRequest() {
    }

    @NonNull
    public static Builder builder() {
        return new Builder(null);
    }

    @NonNull
    public static PaymentCardRecognitionIntentRequest getDefaultInstance() {
        Builder builder = new Builder(null);
        PaymentCardRecognitionIntentRequest.this.f48806a = 1;
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48806a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PaymentCardRecognitionIntentRequest(int i) {
        this.f48806a = i;
    }
}
