package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaas;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

/* renamed from: k82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20677k82 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ zaaw f67810a;

    public /* synthetic */ C20677k82(zaaw zaawVar, zaas zaasVar) {
        this.f67810a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings;
        zae zaeVar;
        clientSettings = this.f67810a.f44860r;
        ClientSettings clientSettings2 = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        zaeVar = this.f67810a.f44853k;
        ((zae) Preconditions.checkNotNull(zaeVar)).zad(new BinderC20505j82(this.f67810a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean m48537i;
        Lock lock3;
        lock = this.f67810a.f44844b;
        lock.lock();
        try {
            m48537i = this.f67810a.m48537i(connectionResult);
            if (m48537i) {
                this.f67810a.m48545a();
                this.f67810a.m48540f();
            } else {
                this.f67810a.m48542d(connectionResult);
            }
            lock3 = this.f67810a.f44844b;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f67810a.f44844b;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
