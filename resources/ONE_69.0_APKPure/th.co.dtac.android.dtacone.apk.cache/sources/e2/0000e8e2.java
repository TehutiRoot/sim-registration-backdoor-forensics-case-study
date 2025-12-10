package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: kx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20873kx2 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f71551a;

    public BinderC20873kx2(ActivityRecognitionClient activityRecognitionClient, TaskCompletionSource taskCompletionSource) {
        this.f71551a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f71551a);
    }
}