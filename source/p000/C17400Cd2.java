package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.identity.zze;

/* renamed from: Cd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17400Cd2 extends AbstractC17918Kf2 {

    /* renamed from: c */
    public final /* synthetic */ UserAddressRequest f787c;

    /* renamed from: d */
    public final /* synthetic */ int f788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17400Cd2(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        super(googleApiClient);
        this.f787c = userAddressRequest;
        this.f788d = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zze) anyClient).zzp(this.f787c, this.f788d);
        setResult((C17400Cd2) Status.RESULT_SUCCESS);
    }
}
