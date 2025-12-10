package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: pa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC21669pa2 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f76842a;

    public BinderC21669pa2(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f76842a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.f76842a);
    }
}