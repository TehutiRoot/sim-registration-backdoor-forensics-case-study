package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C6342a;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaw;
import java.util.concurrent.locks.Lock;

/* renamed from: C92 */
/* loaded from: classes3.dex */
public final class C92 implements zabz {

    /* renamed from: a */
    public final /* synthetic */ C6342a f623a;

    public /* synthetic */ C92(C6342a c6342a, zaw zawVar) {
        this.f623a = c6342a;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f623a.f44825m;
        lock.lock();
        try {
            this.f623a.f44822j = connectionResult;
            C6342a.m48561p(this.f623a);
        } finally {
            lock2 = this.f623a.f44825m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f623a.f44825m;
        lock.lock();
        try {
            C6342a.m48562o(this.f623a, bundle);
            this.f623a.f44822j = ConnectionResult.RESULT_SUCCESS;
            C6342a.m48561p(this.f623a);
        } finally {
            lock2 = this.f623a.f44825m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabi zabiVar;
        lock = this.f623a.f44825m;
        lock.lock();
        try {
            C6342a c6342a = this.f623a;
            z2 = c6342a.f44824l;
            if (!z2) {
                connectionResult = c6342a.f44823k;
                if (connectionResult != null) {
                    connectionResult2 = c6342a.f44823k;
                    if (connectionResult2.isSuccess()) {
                        this.f623a.f44824l = true;
                        zabiVar = this.f623a.f44817e;
                        zabiVar.onConnectionSuspended(i);
                        lock3 = this.f623a.f44825m;
                        lock3.unlock();
                    }
                }
            }
            this.f623a.f44824l = false;
            C6342a.m48563n(this.f623a, i, z);
            lock3 = this.f623a.f44825m;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f623a.f44825m;
            lock2.unlock();
            throw th2;
        }
    }
}
