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

/* renamed from: D82 */
/* loaded from: classes3.dex */
public final class D82 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* renamed from: a */
    public final Api.Client f918a;

    /* renamed from: b */
    public final ApiKey f919b;

    /* renamed from: c */
    public IAccountAccessor f920c = null;

    /* renamed from: d */
    public Set f921d = null;

    /* renamed from: e */
    public boolean f922e = false;

    /* renamed from: f */
    public final /* synthetic */ GoogleApiManager f923f;

    public D82(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f923f = googleApiManager;
        this.f918a = client;
        this.f919b = apiKey;
    }

    /* renamed from: e */
    public final void m68681e() {
        IAccountAccessor iAccountAccessor;
        if (this.f922e && (iAccountAccessor = this.f920c) != null) {
            this.f918a.getRemoteService(iAccountAccessor, this.f921d);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f923f.f44766n;
        handler.post(new C82(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.f923f.f44762j;
        zabq zabqVar = (zabq) map.get(this.f919b);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zaf(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor != null && set != null) {
            this.f920c = iAccountAccessor;
            this.f921d = set;
            m68681e();
            return;
        }
        new Exception();
        zae(new ConnectionResult(4));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zag(int i) {
        Map map;
        boolean z;
        map = this.f923f.f44762j;
        zabq zabqVar = (zabq) map.get(this.f919b);
        if (zabqVar != null) {
            z = zabqVar.f44914i;
            if (z) {
                zabqVar.zas(new ConnectionResult(17));
            } else {
                zabqVar.onConnectionSuspended(i);
            }
        }
    }
}
