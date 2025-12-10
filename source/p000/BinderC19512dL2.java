package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: dL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC19512dL2 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder f61145a;

    public BinderC19512dL2(BaseImplementation.ResultHolder resultHolder) {
        this.f61145a = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        this.f61145a.setResult(status);
    }
}
