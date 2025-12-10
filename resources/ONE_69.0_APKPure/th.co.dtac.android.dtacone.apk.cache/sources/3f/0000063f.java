package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* renamed from: Gb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17679Gb2 extends zzx {

    /* renamed from: a */
    public final TaskCompletionSource f2017a;

    public BinderC17679Gb2(TaskCompletionSource taskCompletionSource) {
        this.f2017a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzf(Status status, PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentData, this.f2017a);
    }
}