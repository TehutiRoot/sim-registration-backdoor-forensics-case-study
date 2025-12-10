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

/* renamed from: h92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20217h92 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final /* synthetic */ zaaw f62397a;

    public /* synthetic */ C20217h92(zaaw zaawVar, zaas zaasVar) {
        this.f62397a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings;
        zae zaeVar;
        clientSettings = this.f62397a.f44872r;
        ClientSettings clientSettings2 = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        zaeVar = this.f62397a.f44865k;
        ((zae) Preconditions.checkNotNull(zaeVar)).zad(new BinderC20044g92(this.f62397a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean m48534i;
        Lock lock3;
        lock = this.f62397a.f44856b;
        lock.lock();
        try {
            m48534i = this.f62397a.m48534i(connectionResult);
            if (m48534i) {
                this.f62397a.m48542a();
                this.f62397a.m48537f();
            } else {
                this.f62397a.m48539d(connectionResult);
            }
            lock3 = this.f62397a.f44856b;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f62397a.f44856b;
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}