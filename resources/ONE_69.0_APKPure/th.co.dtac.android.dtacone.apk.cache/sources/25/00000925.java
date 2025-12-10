package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Je2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17883Je2 implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    public final TaskCompletionSource f3064a;

    public C17883Je2(TaskCompletionSource taskCompletionSource) {
        this.f3064a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.f3064a.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.f3064a);
    }
}