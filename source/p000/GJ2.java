package p000;

import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzbn;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

/* renamed from: GJ2 */
/* loaded from: classes3.dex */
public final class GJ2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f1886c;

    /* renamed from: d */
    public final /* synthetic */ LocationCallback f1887d;

    /* renamed from: e */
    public final /* synthetic */ Looper f1888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GJ2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        super(googleApiClient);
        this.f1886c = locationRequest;
        this.f1887d = locationCallback;
        this.f1888e = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzB(zzbf.zzc(null, this.f1886c), ListenerHolders.createListenerHolder(this.f1887d, zzbn.zza(this.f1888e), LocationCallback.class.getSimpleName()), new RK2(this));
    }
}
