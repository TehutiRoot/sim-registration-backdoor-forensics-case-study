package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.identity.intents.Address;

/* renamed from: Kf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17918Kf2 extends BaseImplementation.ApiMethodImpl {
    public AbstractC17918Kf2(GoogleApiClient googleApiClient) {
        super(Address.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((AbstractC17918Kf2) ((Result) obj));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
