package p000;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.OnCompleteListener;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import com.google.android.gms.wallet.callback.zzj;

/* renamed from: Nn2 */
/* loaded from: classes4.dex */
public final class Nn2 implements OnCompleteListener {

    /* renamed from: a */
    public final OnCompleteListener f4271a;

    public Nn2(OnCompleteListener onCompleteListener) {
        this.f4271a = onCompleteListener;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: a */
    public final synchronized void complete(PaymentDataRequestUpdate paymentDataRequestUpdate) {
        OnCompleteListener onCompleteListener = this.f4271a;
        zzj zza = CallbackOutput.zza();
        CallbackOutput callbackOutput = zza.f48873a;
        callbackOutput.f48863a = 2;
        callbackOutput.f48864b = 1;
        byte[] serializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentDataRequestUpdate);
        CallbackOutput callbackOutput2 = zza.f48873a;
        callbackOutput2.f48865c = serializeToBytes;
        onCompleteListener.complete(callbackOutput2);
    }
}