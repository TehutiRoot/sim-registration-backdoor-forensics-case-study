package p000;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.internal.auth.zzaj;

/* renamed from: Dd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC17490Dd2 extends zzaj {

    /* renamed from: a */
    public final /* synthetic */ C23062xd2 f1063a;

    public BinderC17490Dd2(C23062xd2 c23062xd2) {
        this.f1063a = c23062xd2;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zza(ProxyResponse proxyResponse) {
        this.f1063a.setResult((C23062xd2) new C18660Vd2(proxyResponse));
    }
}