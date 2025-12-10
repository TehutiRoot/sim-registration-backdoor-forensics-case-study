package com.google.android.gms.wallet.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes4.dex */
public abstract class BasePaymentDataCallbacks {
    public void onPaymentAuthorized(@Nullable PaymentData paymentData, @NonNull OnCompleteListener<PaymentAuthorizationResult> onCompleteListener) {
    }

    public void onPaymentDataChanged(@Nullable IntermediatePaymentData intermediatePaymentData, @NonNull OnCompleteListener<PaymentDataRequestUpdate> onCompleteListener) {
    }
}