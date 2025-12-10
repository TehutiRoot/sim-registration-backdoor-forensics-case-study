package p000;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzac;
import com.google.android.gms.internal.wallet.zzaf;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* renamed from: sb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22126sb2 extends zzas {

    /* renamed from: c */
    public final /* synthetic */ CreateWalletObjectsRequest f79836c;

    /* renamed from: d */
    public final /* synthetic */ int f79837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22126sb2(zzaf zzafVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(googleApiClient);
        this.f79836c = createWalletObjectsRequest;
        this.f79837d = i;
    }

    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: zza */
    public final void doExecute(zzac zzacVar) {
        zzacVar.zzp(this.f79836c, this.f79837d);
        setResult((C22126sb2) Status.RESULT_SUCCESS);
    }
}
