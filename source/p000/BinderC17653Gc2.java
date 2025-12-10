package p000;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.internal.auth.zzaj;

/* renamed from: Gc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17653Gc2 extends zzaj {

    /* renamed from: a */
    public final /* synthetic */ C17269Ac2 f1968a;

    public BinderC17653Gc2(C17269Ac2 c17269Ac2) {
        this.f1968a = c17269Ac2;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zza(ProxyResponse proxyResponse) {
        this.f1968a.setResult((C17269Ac2) new C18805Yc2(proxyResponse));
    }
}
