package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: ta2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22361ta2 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f80236a;

    public BinderC22361ta2(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f80236a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.f80236a);
    }
}