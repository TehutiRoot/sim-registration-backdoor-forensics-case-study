package p000;

import android.accounts.Account;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* renamed from: MD2 */
/* loaded from: classes3.dex */
public final class MD2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final /* synthetic */ Account f3708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MD2(zzh zzhVar, Api api, GoogleApiClient googleApiClient, Account account) {
        super(api, googleApiClient);
        this.f3708c = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new JI2(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzc) ((zzr) anyClient).getService()).zza(new TF2(this), this.f3708c);
    }
}
