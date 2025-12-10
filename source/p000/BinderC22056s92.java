package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: s92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22056s92 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f79602a;

    public BinderC22056s92(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f79602a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.f79602a);
    }
}
