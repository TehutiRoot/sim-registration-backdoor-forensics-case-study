package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationListener;

/* renamed from: jK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20541jK2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationListener f67253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20541jK2(zzz zzzVar, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f67253c = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzz(ListenerHolders.createListenerKey(this.f67253c, LocationListener.class.getSimpleName()), new RK2(this));
    }
}
