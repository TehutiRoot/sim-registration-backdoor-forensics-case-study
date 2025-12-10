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

/* renamed from: d82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19473d82 implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    public final WeakReference f61075a;

    /* renamed from: b */
    public final Api f61076b;

    /* renamed from: c */
    public final boolean f61077c;

    public C19473d82(zaaw zaawVar, Api api, boolean z) {
        this.f61075a = new WeakReference(zaawVar);
        this.f61076b = api;
        this.f61077c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        zabi zabiVar;
        boolean z;
        Lock lock;
        Lock lock2;
        boolean m48539g;
        boolean m48538h;
        zaaw zaawVar = (zaaw) this.f61075a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.f44843a;
        if (myLooper == zabiVar.f44903n.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.f44844b;
        lock.lock();
        try {
            m48539g = zaawVar.m48539g(0);
            if (m48539g) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.m48541e(connectionResult, this.f61076b, this.f61077c);
                }
                m48538h = zaawVar.m48538h();
                if (m48538h) {
                    zaawVar.m48540f();
                }
            }
        } finally {
            lock2 = zaawVar.f44844b;
            lock2.unlock();
        }
    }
}
