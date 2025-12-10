package com.google.android.gms.wallet.callback;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes4.dex */
public abstract class BasePaymentDataCallbacksService extends AbstractServiceC21347ni2 {
    @NonNull
    public abstract BasePaymentDataCallbacks createPaymentDataCallbacks();

    @Override // p000.AbstractServiceC21347ni2, android.app.Service
    @NonNull
    @CallSuper
    public IBinder onBind(@NonNull Intent intent) {
        return super.onBind(intent);
    }

    @Override // p000.AbstractServiceC21347ni2, android.app.Service
    @CallSuper
    public void onCreate() {
        super.onCreate();
    }

    @Override // p000.AbstractServiceC21347ni2
    public final void onRunTask(@NonNull String str, @NonNull CallbackInput callbackInput, @NonNull OnCompleteListener<CallbackOutput> onCompleteListener) {
        if (callbackInput.getCallbackType() != 0) {
            BasePaymentDataCallbacks createPaymentDataCallbacks = createPaymentDataCallbacks();
            if (callbackInput.getCallbackType() == 1) {
                createPaymentDataCallbacks.onPaymentAuthorized((PaymentData) callbackInput.deserializeRequest(PaymentData.CREATOR), new C21183ml2(onCompleteListener));
                return;
            } else if (callbackInput.getCallbackType() == 2) {
                createPaymentDataCallbacks.onPaymentDataChanged((IntermediatePaymentData) callbackInput.deserializeRequest(IntermediatePaymentData.CREATOR), new Nn2(onCompleteListener));
                return;
            } else {
                throw new IllegalStateException("Unknown Callback Types");
            }
        }
        throw new IllegalStateException("Callback Types must be set");
    }
}