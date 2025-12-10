package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: d92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19476d92 extends BasePendingResult {

    /* renamed from: a */
    public final Result f61087a;

    public C19476d92(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.f61087a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return this.f61087a;
    }
}
