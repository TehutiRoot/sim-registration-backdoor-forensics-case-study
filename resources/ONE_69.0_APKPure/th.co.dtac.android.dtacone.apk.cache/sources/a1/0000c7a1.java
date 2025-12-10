package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationListener;

/* renamed from: gL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20080gL2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ LocationListener f62158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20080gL2(zzz zzzVar, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f62158c = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzz(ListenerHolders.createListenerKey(this.f62158c, LocationListener.class.getSimpleName()), new OL2(this));
    }
}