package p000;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.OnCompleteListener;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import com.google.android.gms.wallet.callback.zzj;

/* renamed from: Qm2 */
/* loaded from: classes4.dex */
public final class Qm2 implements OnCompleteListener {

    /* renamed from: a */
    public final OnCompleteListener f5164a;

    public Qm2(OnCompleteListener onCompleteListener) {
        this.f5164a = onCompleteListener;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: a */
    public final synchronized void complete(PaymentDataRequestUpdate paymentDataRequestUpdate) {
        OnCompleteListener onCompleteListener = this.f5164a;
        zzj zza = CallbackOutput.zza();
        CallbackOutput callbackOutput = zza.f48861a;
        callbackOutput.f48851a = 2;
        callbackOutput.f48852b = 1;
        byte[] serializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentDataRequestUpdate);
        CallbackOutput callbackOutput2 = zza.f48861a;
        callbackOutput2.f48853c = serializeToBytes;
        onCompleteListener.complete(callbackOutput2);
    }
}
