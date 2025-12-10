package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: aa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19069aa2 extends BasePendingResult {

    /* renamed from: a */
    public final Result f8450a;

    public C19069aa2(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.f8450a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return this.f8450a;
    }
}