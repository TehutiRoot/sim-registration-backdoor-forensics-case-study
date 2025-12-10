package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.zabq;
import java.util.Map;

/* renamed from: C82 */
/* loaded from: classes3.dex */
public final class C82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConnectionResult f619a;

    /* renamed from: b */
    public final /* synthetic */ D82 f620b;

    public C82(D82 d82, ConnectionResult connectionResult) {
        this.f620b = d82;
        this.f619a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        D82 d82 = this.f620b;
        map = d82.f923f.f44762j;
        apiKey = d82.f919b;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (this.f619a.isSuccess()) {
            this.f620b.f922e = true;
            client = this.f620b.f918a;
            if (client.requiresSignIn()) {
                this.f620b.m68681e();
                return;
            }
            try {
                D82 d822 = this.f620b;
                client3 = d822.f918a;
                client4 = d822.f918a;
                client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException unused) {
                client2 = this.f620b.f918a;
                client2.disconnect("Failed to get service from broker.");
                zabqVar.zar(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.zar(this.f619a, null);
    }
}
