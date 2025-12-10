package p000;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: a92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18954a92 extends BasePendingResult {

    /* renamed from: a */
    public final Result f8250a;

    public C18954a92(Result result) {
        super(Looper.getMainLooper());
        this.f8250a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        if (status.getStatusCode() == this.f8250a.getStatus().getStatusCode()) {
            return this.f8250a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
