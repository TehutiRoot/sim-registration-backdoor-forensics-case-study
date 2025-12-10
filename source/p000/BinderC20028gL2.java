package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.wallet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: gL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20028gL2 extends zzx {

    /* renamed from: a */
    public final TaskCompletionSource f62146a;

    public BinderC20028gL2(TaskCompletionSource taskCompletionSource) {
        this.f62146a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzc(Status status, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f62146a);
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzg(int i, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i), Boolean.valueOf(z), this.f62146a);
    }
}
