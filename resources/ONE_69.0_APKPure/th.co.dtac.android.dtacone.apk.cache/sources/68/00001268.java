package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.LocationRequest;

/* renamed from: TK2 */
/* loaded from: classes3.dex */
public final class TK2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ LocationRequest f6319c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f6320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TK2(zzz zzzVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f6319c = locationRequest;
        this.f6320d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzD(zzbf.zzc(null, this.f6319c), this.f6320d, new OL2(this));
    }
}