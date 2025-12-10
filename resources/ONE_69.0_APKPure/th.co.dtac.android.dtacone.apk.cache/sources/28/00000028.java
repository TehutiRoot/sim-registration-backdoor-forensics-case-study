package p000;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

/* renamed from: A92 */
/* loaded from: classes3.dex */
public final class A92 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a */
    public final Api.Client f31a;

    /* renamed from: b */
    public final ApiKey f32b;

    /* renamed from: c */
    public IAccountAccessor f33c = null;

    /* renamed from: d */
    public Set f34d = null;

    /* renamed from: e */
    public boolean f35e = false;

    /* renamed from: f */
    public final /* synthetic */ GoogleApiManager f36f;

    public A92(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f36f = googleApiManager;
        this.f31a = client;
        this.f32b = apiKey;
    }

    /* renamed from: e */
    public final void m69314e() {
        IAccountAccessor iAccountAccessor;
        if (this.f35e && (iAccountAccessor = this.f33c) != null) {
            this.f31a.getRemoteService(iAccountAccessor, this.f34d);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f36f.f44778n;
        handler.post(new RunnableC23331z92(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.f36f.f44774j;
        zabq zabqVar = (zabq) map.get(this.f32b);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zaf(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor != null && set != null) {
            this.f33c = iAccountAccessor;
            this.f34d = set;
            m69314e();
            return;
        }
        new Exception();
        zae(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zag(int i) {
        Map map;
        boolean z;
        map = this.f36f.f44774j;
        zabq zabqVar = (zabq) map.get(this.f32b);
        if (zabqVar != null) {
            z = zabqVar.f44926i;
            if (z) {
                zabqVar.zas(new ConnectionResult(17));
            } else {
                zabqVar.onConnectionSuspended(i);
            }
        }
    }
}