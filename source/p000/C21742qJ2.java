package p000;

import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzbn;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* renamed from: qJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21742qJ2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f76949c;

    /* renamed from: d */
    public final /* synthetic */ LocationListener f76950d;

    /* renamed from: e */
    public final /* synthetic */ Looper f76951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21742qJ2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.f76949c = locationRequest;
        this.f76950d = locationListener;
        this.f76951e = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzC(zzbf.zzc(null, this.f76949c), ListenerHolders.createListenerHolder(this.f76950d, zzbn.zza(this.f76951e), LocationListener.class.getSimpleName()), new RK2(this));
    }
}
