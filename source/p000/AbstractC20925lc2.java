package p000;

import android.content.Context;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzan;

/* renamed from: lc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20925lc2 extends BaseImplementation.ApiMethodImpl {
    public AbstractC20925lc2(GoogleApiClient googleApiClient) {
        super(AuthProxy.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return new C18805Yc2(status);
    }

    /* renamed from: d */
    public abstract void mo26452d(Context context, zzan zzanVar);

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzak zzakVar = (zzak) anyClient;
        mo26452d(zzakVar.getContext(), (zzan) zzakVar.getService());
    }
}
