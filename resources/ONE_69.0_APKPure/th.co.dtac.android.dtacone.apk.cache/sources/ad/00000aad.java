package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: LE2 */
/* loaded from: classes3.dex */
public final class LE2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ PendingIntent f3544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LE2(zzz zzzVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f3544c = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzA(this.f3544c, new OL2(this));
    }
}