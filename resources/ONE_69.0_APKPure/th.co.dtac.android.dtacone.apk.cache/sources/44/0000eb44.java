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

/* renamed from: nK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21288nK2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f72324c;

    /* renamed from: d */
    public final /* synthetic */ LocationListener f72325d;

    /* renamed from: e */
    public final /* synthetic */ Looper f72326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21288nK2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.f72324c = locationRequest;
        this.f72325d = locationListener;
        this.f72326e = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzC(zzbf.zzc(null, this.f72324c), ListenerHolders.createListenerHolder(this.f72325d, zzbn.zza(this.f72326e), LocationListener.class.getSimpleName()), new OL2(this));
    }
}