package p000;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzz;

/* renamed from: kI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20707kI2 extends AbstractC22433uK2 {

    /* renamed from: c */
    public final /* synthetic */ Location f67877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20707kI2(zzz zzzVar, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f67877c = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zzbe) anyClient).zzE(this.f67877c, new BinderC19512dL2(this));
    }
}
