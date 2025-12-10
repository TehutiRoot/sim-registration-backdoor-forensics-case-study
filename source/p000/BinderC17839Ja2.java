package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* renamed from: Ja2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17839Ja2 extends zzx {

    /* renamed from: a */
    public final TaskCompletionSource f2834a;

    public BinderC17839Ja2(TaskCompletionSource taskCompletionSource) {
        this.f2834a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzf(Status status, PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentData, this.f2834a);
    }
}
