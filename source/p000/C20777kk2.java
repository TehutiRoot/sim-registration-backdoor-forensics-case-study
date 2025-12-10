package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzg;

/* renamed from: kk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20777kk2 extends Ym2 {

    /* renamed from: c */
    public final /* synthetic */ PendingIntent f68004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20777kk2(zzg zzgVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f68004c = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzv(this.f68004c);
        setResult((C20777kk2) Status.RESULT_SUCCESS);
    }
}
