package p000;

import android.content.Context;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.internal.auth.zzax;

/* renamed from: qc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21785qc2 extends BaseImplementation.ApiMethodImpl {
    public AbstractC21785qc2(GoogleApiClient googleApiClient) {
        super(AuthProxy.API, googleApiClient);
    }

    /* renamed from: e */
    public static ProxyApi.SpatulaHeaderResult m23466e(Status status) {
        return new zzax(status);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return m23466e(status);
    }

    /* renamed from: d */
    public abstract void mo23467d(Context context, zzan zzanVar);

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzak zzakVar = (zzak) anyClient;
        mo23467d(zzakVar.getContext(), (zzan) zzakVar.getService());
    }
}
