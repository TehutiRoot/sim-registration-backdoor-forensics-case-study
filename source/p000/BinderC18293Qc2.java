package p000;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Qc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class BinderC18293Qc2 extends zzah {

    /* renamed from: a */
    public final TaskCompletionSource f5102a;

    public BinderC18293Qc2(TaskCompletionSource taskCompletionSource) {
        this.f5102a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        TaskUtil.setResultOrApiException(zzaaVar.getStatus(), this.f5102a);
    }

    public void zzc() {
    }
}
