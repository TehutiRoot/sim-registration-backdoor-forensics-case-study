package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbm;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzbr;

/* renamed from: ue2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22479ue2 extends zzbr {

    /* renamed from: c */
    public final /* synthetic */ LocationSettingsRequest f107417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22479ue2(zzbm zzbmVar, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        super(googleApiClient);
        this.f107417c = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new LocationSettingsResult(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzr(this.f107417c, this, null);
    }
}
