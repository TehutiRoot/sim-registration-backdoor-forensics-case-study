package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzbn;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* renamed from: eJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19678eJ2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f61467c;

    /* renamed from: d */
    public final /* synthetic */ LocationListener f61468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19678eJ2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.f61467c = locationRequest;
        this.f61468d = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzC(zzbf.zzc(null, this.f61467c), ListenerHolders.createListenerHolder(this.f61468d, zzbn.zzb(), LocationListener.class.getSimpleName()), new RK2(this));
    }
}
