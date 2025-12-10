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

/* renamed from: JE2 */
/* loaded from: classes3.dex */
public final class JE2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final /* synthetic */ Account f2950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JE2(zzh zzhVar, Api api, GoogleApiClient googleApiClient, Account account) {
        super(api, googleApiClient);
        this.f2950c = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new GJ2(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzc) ((zzr) anyClient).getService()).zza(new QG2(this), this.f2950c);
    }
}