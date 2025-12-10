package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationRequest;

/* renamed from: WJ2 */
/* loaded from: classes3.dex */
public final class WJ2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f7194c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f7195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WJ2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f7194c = locationRequest;
        this.f7195d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzD(zzbf.zzc(null, this.f7194c), this.f7195d, new RK2(this));
    }
}
