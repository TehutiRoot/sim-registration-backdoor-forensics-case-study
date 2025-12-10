package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: a92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19001a92 implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    public final WeakReference f8364a;

    /* renamed from: b */
    public final Api f8365b;

    /* renamed from: c */
    public final boolean f8366c;

    public C19001a92(zaaw zaawVar, Api api, boolean z) {
        this.f8364a = new WeakReference(zaawVar);
        this.f8365b = api;
        this.f8366c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        zabi zabiVar;
        boolean z;
        Lock lock;
        Lock lock2;
        boolean m48536g;
        boolean m48535h;
        zaaw zaawVar = (zaaw) this.f8364a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.f44855a;
        if (myLooper == zabiVar.f44915n.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.f44856b;
        lock.lock();
        try {
            m48536g = zaawVar.m48536g(0);
            if (m48536g) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.m48538e(connectionResult, this.f8365b, this.f8366c);
                }
                m48535h = zaawVar.m48535h();
                if (m48535h) {
                    zaawVar.m48537f();
                }
            }
        } finally {
            lock2 = zaawVar.f44856b;
            lock2.unlock();
        }
    }
}