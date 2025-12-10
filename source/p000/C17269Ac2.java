package p000;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.internal.auth.zzar;

/* renamed from: Ac2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17269Ac2 extends AbstractC20925lc2 {

    /* renamed from: c */
    public final /* synthetic */ ProxyRequest f152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17269Ac2(zzar zzarVar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.f152c = proxyRequest;
    }

    @Override // p000.AbstractC20925lc2
    /* renamed from: d */
    public final void mo26452d(Context context, zzan zzanVar) {
        zzanVar.zza(new BinderC17653Gc2(this), this.f152c);
    }
}
