package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: xa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC23053xa2 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f108791a;

    public BinderC23053xa2(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f108791a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallIntentResponse, this.f108791a);
    }
}