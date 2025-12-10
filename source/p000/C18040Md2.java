package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Md2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18040Md2 implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    public final TaskCompletionSource f3827a;

    public C18040Md2(TaskCompletionSource taskCompletionSource) {
        this.f3827a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.f3827a.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.f3827a);
    }
}
