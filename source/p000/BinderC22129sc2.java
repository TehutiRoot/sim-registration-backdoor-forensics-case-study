package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: sc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22129sc2 extends zzah {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f79842a;

    public BinderC22129sc2(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.f79842a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        Status status = zzaaVar.getStatus();
        if (status == null) {
            this.f79842a.trySetException(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.f79842a.setResult(Boolean.TRUE);
        } else {
            this.f79842a.trySetException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
