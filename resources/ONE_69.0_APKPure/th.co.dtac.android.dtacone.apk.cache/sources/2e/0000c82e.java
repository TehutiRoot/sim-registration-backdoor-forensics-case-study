package p000;

import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* renamed from: gx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20181gx2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final /* synthetic */ boolean f62326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20181gx2(zzh zzhVar, Api api, GoogleApiClient googleApiClient, boolean z) {
        super(api, googleApiClient);
        this.f62326c = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new C22842wJ2(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzc) ((zzr) anyClient).getService()).zzb(this.f62326c);
        setResult((C20181gx2) new C22842wJ2(Status.RESULT_SUCCESS));
    }
}