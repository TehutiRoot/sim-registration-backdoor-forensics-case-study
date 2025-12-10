package p000;

import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* renamed from: mz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21166mz2 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: c */
    public final /* synthetic */ String f72106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21166mz2(zzh zzhVar, Api api, GoogleApiClient googleApiClient, String str) {
        super(api, googleApiClient);
        this.f72106c = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new C21567pI2(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzc) ((zzr) anyClient).getService()).zza(new FB2(this), this.f72106c);
    }
}
