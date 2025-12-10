package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: MH2 */
/* loaded from: classes3.dex */
public final class MH2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ boolean f3736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MH2(zzz zzzVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f3736c = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzF(this.f3736c, new BinderC19512dL2(this));
    }
}
