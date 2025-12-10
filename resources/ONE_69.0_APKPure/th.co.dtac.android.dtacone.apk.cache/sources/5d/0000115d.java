package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationCallback;

/* renamed from: SG2 */
/* loaded from: classes3.dex */
public final class SG2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ LocationCallback f5785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SG2(zzz zzzVar, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f5785c = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzy(ListenerHolders.createListenerKey(this.f5785c, LocationCallback.class.getSimpleName()), new OL2(this));
    }
}