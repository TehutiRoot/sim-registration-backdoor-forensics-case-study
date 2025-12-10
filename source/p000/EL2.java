package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.AutoResolveHelper;

/* renamed from: EL2 */
/* loaded from: classes3.dex */
public final class EL2 extends zzx {

    /* renamed from: a */
    public final TaskCompletionSource f1278a;

    public EL2(TaskCompletionSource taskCompletionSource) {
        this.f1278a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzx, com.google.android.gms.internal.wallet.zzu
    public final void zzh(int i, Bundle bundle) {
        Status status;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        if (pendingIntent != null && i == 6) {
            status = new Status(6, "Need to resolve PendingIntent", pendingIntent);
        } else {
            status = new Status(i);
        }
        AutoResolveHelper.zzd(status, new AutoResolvableVoidResult(), this.f1278a);
    }
}
