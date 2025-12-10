package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: OD2 */
/* loaded from: classes3.dex */
public final class OD2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ PendingIntent f4330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OD2(zzz zzzVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f4330c = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzA(this.f4330c, new RK2(this));
    }
}
