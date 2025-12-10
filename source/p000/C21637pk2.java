package p000;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.OnCompleteListener;
import com.google.android.gms.wallet.callback.PaymentAuthorizationResult;
import com.google.android.gms.wallet.callback.zzj;

/* renamed from: pk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21637pk2 implements OnCompleteListener {

    /* renamed from: a */
    public final OnCompleteListener f76680a;

    public C21637pk2(OnCompleteListener onCompleteListener) {
        this.f76680a = onCompleteListener;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: a */
    public final synchronized void complete(PaymentAuthorizationResult paymentAuthorizationResult) {
        OnCompleteListener onCompleteListener = this.f76680a;
        zzj zza = CallbackOutput.zza();
        CallbackOutput callbackOutput = zza.f48861a;
        callbackOutput.f48851a = 1;
        callbackOutput.f48852b = 1;
        byte[] serializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentAuthorizationResult);
        CallbackOutput callbackOutput2 = zza.f48861a;
        callbackOutput2.f48853c = serializeToBytes;
        onCompleteListener.complete(callbackOutput2);
    }
}
