package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

/* renamed from: ta2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22295ta2 extends zzx {

    /* renamed from: a */
    public final TaskCompletionSource f80144a;

    public BinderC22295ta2(TaskCompletionSource taskCompletionSource) {
        this.f80144a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zze(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentCardRecognitionIntentResponse, this.f80144a);
    }
}
