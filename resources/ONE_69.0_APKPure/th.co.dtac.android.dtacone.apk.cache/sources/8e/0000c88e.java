package p000;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: hJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20247hJ2 extends AbstractC21983rL2 {

    /* renamed from: c */
    public final /* synthetic */ Location f62455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20247hJ2(zzz zzzVar, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f62455c = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzE(this.f62455c, new BinderC19040aM2(this));
    }
}