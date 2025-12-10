package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.zabq;
import java.util.Map;

/* renamed from: z92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC23331z92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConnectionResult f109270a;

    /* renamed from: b */
    public final /* synthetic */ A92 f109271b;

    public RunnableC23331z92(A92 a92, ConnectionResult connectionResult) {
        this.f109271b = a92;
        this.f109270a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        A92 a92 = this.f109271b;
        map = a92.f36f.f44774j;
        apiKey = a92.f32b;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (this.f109270a.isSuccess()) {
            this.f109271b.f35e = true;
            client = this.f109271b.f31a;
            if (client.requiresSignIn()) {
                this.f109271b.m69314e();
                return;
            }
            try {
                A92 a922 = this.f109271b;
                client3 = a922.f31a;
                client4 = a922.f31a;
                client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException unused) {
                client2 = this.f109271b.f31a;
                client2.disconnect("Failed to get service from broker.");
                zabqVar.zar(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.zar(this.f109270a, null);
    }
}