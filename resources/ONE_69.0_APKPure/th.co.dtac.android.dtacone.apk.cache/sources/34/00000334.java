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

/* renamed from: DK2 */
/* loaded from: classes3.dex */
public final class DK2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f991c;

    /* renamed from: d */
    public final /* synthetic */ LocationCallback f992d;

    /* renamed from: e */
    public final /* synthetic */ Looper f993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DK2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        super(googleApiClient);
        this.f991c = locationRequest;
        this.f992d = locationCallback;
        this.f993e = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzB(zzbf.zzc(null, this.f991c), ListenerHolders.createListenerHolder(this.f992d, zzbn.zza(this.f993e), LocationCallback.class.getSimpleName()), new OL2(this));
    }
}