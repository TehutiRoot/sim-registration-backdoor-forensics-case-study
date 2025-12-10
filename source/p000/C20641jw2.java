package p000;

import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* renamed from: jw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20641jw2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final /* synthetic */ boolean f67763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20641jw2(zzh zzhVar, Api api, GoogleApiClient googleApiClient, boolean z) {
        super(api, googleApiClient);
        this.f67763c = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new C23287zI2(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzc) ((zzr) anyClient).getService()).zzb(this.f67763c);
        setResult((C20641jw2) new C23287zI2(Status.RESULT_SUCCESS));
    }
}
