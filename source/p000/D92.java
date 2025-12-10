package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C6342a;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zay;
import java.util.concurrent.locks.Lock;

/* renamed from: D92 */
/* loaded from: classes3.dex */
public final class D92 implements zabz {

    /* renamed from: a */
    public final /* synthetic */ C6342a f926a;

    public /* synthetic */ D92(C6342a c6342a, zay zayVar) {
        this.f926a = c6342a;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f926a.f44825m;
        lock.lock();
        try {
            this.f926a.f44823k = connectionResult;
            C6342a.m48561p(this.f926a);
        } finally {
            lock2 = this.f926a.f44825m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f926a.f44825m;
        lock.lock();
        try {
            this.f926a.f44823k = ConnectionResult.RESULT_SUCCESS;
            C6342a.m48561p(this.f926a);
        } finally {
            lock2 = this.f926a.f44825m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        zabi zabiVar;
        Lock lock3;
        lock = this.f926a.f44825m;
        lock.lock();
        try {
            C6342a c6342a = this.f926a;
            z2 = c6342a.f44824l;
            if (z2) {
                c6342a.f44824l = false;
                C6342a.m48563n(this.f926a, i, z);
            } else {
                c6342a.f44824l = true;
                zabiVar = this.f926a.f44816d;
                zabiVar.onConnectionSuspended(i);
            }
            lock3 = this.f926a.f44825m;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f926a.f44825m;
            lock2.unlock();
            throw th2;
        }
    }
}
