package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: qa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC21842qa2 extends zaa {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f77235a;

    public BinderC21842qa2(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.f77235a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.f77235a);
    }
}