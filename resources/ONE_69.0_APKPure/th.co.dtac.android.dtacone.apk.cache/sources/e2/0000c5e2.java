package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.zzbx;

/* renamed from: ec2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19772ec2 extends AbstractC21502oc2 {

    /* renamed from: c */
    public final /* synthetic */ zzbx f61612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19772ec2(zzaf zzafVar, GoogleApiClient googleApiClient, zzbx zzbxVar) {
        super(googleApiClient);
        this.f61612c = zzbxVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        zzbx zzbxVar = this.f61612c;
        Preconditions.checkNotNull(zzbxVar, "removeGeofencingRequest can't be null.");
        Preconditions.checkNotNull(this, "ResultHolder not provided.");
        ((zzam) ((zzbe) anyClient).getService()).zzm(zzbxVar, new BinderC17948Ke2(this));
    }
}