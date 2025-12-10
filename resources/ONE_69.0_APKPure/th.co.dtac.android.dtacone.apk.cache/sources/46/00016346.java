package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C6331a;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaw;
import java.util.concurrent.locks.Lock;

/* renamed from: za2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23399za2 implements zabz {

    /* renamed from: a */
    public final /* synthetic */ C6331a f109424a;

    public /* synthetic */ C23399za2(C6331a c6331a, zaw zawVar) {
        this.f109424a = c6331a;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f109424a.f44837m;
        lock.lock();
        try {
            this.f109424a.f44834j = connectionResult;
            C6331a.m48558p(this.f109424a);
        } finally {
            lock2 = this.f109424a.f44837m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f109424a.f44837m;
        lock.lock();
        try {
            C6331a.m48559o(this.f109424a, bundle);
            this.f109424a.f44834j = ConnectionResult.RESULT_SUCCESS;
            C6331a.m48558p(this.f109424a);
        } finally {
            lock2 = this.f109424a.f44837m;
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
        lock = this.f109424a.f44837m;
        lock.lock();
        try {
            C6331a c6331a = this.f109424a;
            z2 = c6331a.f44836l;
            if (!z2) {
                connectionResult = c6331a.f44835k;
                if (connectionResult != null) {
                    connectionResult2 = c6331a.f44835k;
                    if (connectionResult2.isSuccess()) {
                        this.f109424a.f44836l = true;
                        zabiVar = this.f109424a.f44829e;
                        zabiVar.onConnectionSuspended(i);
                        lock3 = this.f109424a.f44837m;
                        lock3.unlock();
                    }
                }
            }
            this.f109424a.f44836l = false;
            C6331a.m48560n(this.f109424a, i, z);
            lock3 = this.f109424a.f44837m;
            lock3.unlock();
        } catch (Throwable th2) {
            lock2 = this.f109424a.f44837m;
            lock2.unlock();
            throw th2;
        }
    }
}