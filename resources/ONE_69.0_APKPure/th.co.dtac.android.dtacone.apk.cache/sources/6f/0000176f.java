package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: Yb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18849Yb2 extends AbstractC21502oc2 {

    /* renamed from: c */
    public final /* synthetic */ GeofencingRequest f7895c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f7896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18849Yb2(zzaf zzafVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f7895c = geofencingRequest;
        this.f7896d = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzq(this.f7895c, this.f7896d, this);
    }
}