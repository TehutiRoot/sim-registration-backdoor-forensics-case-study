package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.zzbr;

/* renamed from: uK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22433uK2 extends zzbr {
    public AbstractC22433uK2(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
