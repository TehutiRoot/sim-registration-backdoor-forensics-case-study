package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.service.zae;
import com.google.android.gms.common.internal.service.zah;
import com.google.android.gms.common.internal.service.zal;

/* renamed from: C92 */
/* loaded from: classes3.dex */
public final class C92 extends V92 {
    public C92(zae zaeVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((zal) ((zah) anyClient).getService()).zae(new O92(this));
    }
}