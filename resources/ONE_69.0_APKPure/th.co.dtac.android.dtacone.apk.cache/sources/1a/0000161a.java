package p000;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X92 */
/* loaded from: classes3.dex */
public final class X92 extends BasePendingResult {

    /* renamed from: a */
    public final Result f7484a;

    public X92(Result result) {
        super(Looper.getMainLooper());
        this.f7484a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        if (status.getStatusCode() == this.f7484a.getStatus().getStatusCode()) {
            return this.f7484a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}