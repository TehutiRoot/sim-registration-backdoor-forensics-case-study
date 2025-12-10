package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.identity.zze;

/* renamed from: ze2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23411ze2 extends AbstractC17759Hg2 {

    /* renamed from: c */
    public final /* synthetic */ UserAddressRequest f109442c;

    /* renamed from: d */
    public final /* synthetic */ int f109443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23411ze2(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        super(googleApiClient);
        this.f109442c = userAddressRequest;
        this.f109443d = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zze) anyClient).zzp(this.f109442c, this.f109443d);
        setResult((C23411ze2) Status.RESULT_SUCCESS);
    }
}