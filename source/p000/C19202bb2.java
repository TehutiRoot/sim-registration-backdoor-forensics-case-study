package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: bb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19202bb2 extends AbstractC21954rb2 {

    /* renamed from: c */
    public final /* synthetic */ GeofencingRequest f39059c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f39060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19202bb2(zzaf zzafVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f39059c = geofencingRequest;
        this.f39060d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzq(this.f39059c, this.f39060d, this);
    }
}
