package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationCallback;

/* renamed from: VF2 */
/* loaded from: classes3.dex */
public final class VF2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationCallback f6601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VF2(zzz zzzVar, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f6601c = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzy(ListenerHolders.createListenerKey(this.f6601c, LocationCallback.class.getSimpleName()), new RK2(this));
    }
}
