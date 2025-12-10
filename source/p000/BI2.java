package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: BI2 */
/* loaded from: classes3.dex */
public final class BI2 extends AbstractC22433uK2 {
    public BI2(zzz zzzVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzs(new RK2(this));
    }
}
