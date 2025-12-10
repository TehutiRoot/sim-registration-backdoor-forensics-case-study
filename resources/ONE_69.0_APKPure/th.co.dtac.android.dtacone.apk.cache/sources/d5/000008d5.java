package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: JI2 */
/* loaded from: classes3.dex */
public final class JI2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ boolean f2973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JI2(zzz zzzVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f2973c = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzF(this.f2973c, new BinderC19040aM2(this));
    }
}