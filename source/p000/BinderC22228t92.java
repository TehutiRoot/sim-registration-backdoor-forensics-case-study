package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: t92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC22228t92 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f80022a;

    public BinderC22228t92(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f80022a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.f80022a);
    }
}
