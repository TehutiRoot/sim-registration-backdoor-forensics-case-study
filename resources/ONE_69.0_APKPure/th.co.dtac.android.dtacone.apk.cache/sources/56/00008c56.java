package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zak implements Handler.Callback {

    /* renamed from: a */
    public final zaj f45158a;

    /* renamed from: h */
    public final Handler f45165h;

    /* renamed from: b */
    public final ArrayList f45159b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f45160c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f45161d = new ArrayList();

    /* renamed from: e */
    public volatile boolean f45162e = false;

    /* renamed from: f */
    public final AtomicInteger f45163f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f45164g = false;

    /* renamed from: i */
    public final Object f45166i = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.f45158a = zajVar;
        this.f45165h = new com.google.android.gms.internal.base.zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f45166i) {
                try {
                    if (this.f45162e && this.f45158a.isConnected() && this.f45159b.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        new Exception();
        return false;
    }

    public final void zaa() {
        this.f45162e = false;
        this.f45163f.incrementAndGet();
    }

    public final void zab() {
        this.f45162e = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f45165h, "onConnectionFailure must only be called on the Handler thread");
        this.f45165h.removeMessages(1);
        synchronized (this.f45166i) {
            try {
                ArrayList arrayList = new ArrayList(this.f45161d);
                int i = this.f45163f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (this.f45162e && this.f45163f.get() == i) {
                        if (this.f45161d.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    @VisibleForTesting
    public final void zad(@Nullable Bundle bundle) {
        Preconditions.checkHandlerThread(this.f45165h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f45166i) {
            try {
                Preconditions.checkState(!this.f45164g);
                this.f45165h.removeMessages(1);
                this.f45164g = true;
                Preconditions.checkState(this.f45160c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f45159b);
                int i = this.f45163f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f45162e || !this.f45158a.isConnected() || this.f45163f.get() != i) {
                        break;
                    } else if (!this.f45160c.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                this.f45160c.clear();
                this.f45164g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.f45165h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f45165h.removeMessages(1);
        synchronized (this.f45166i) {
            try {
                this.f45164g = true;
                ArrayList arrayList = new ArrayList(this.f45159b);
                int i2 = this.f45163f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f45162e || this.f45163f.get() != i2) {
                        break;
                    } else if (this.f45159b.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                this.f45160c.clear();
                this.f45164g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f45166i) {
            try {
                if (this.f45159b.contains(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + valueOf + " is already registered");
                } else {
                    this.f45159b.add(connectionCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f45158a.isConnected()) {
            Handler handler = this.f45165h;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45166i) {
            try {
                if (this.f45161d.contains(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
                } else {
                    this.f45161d.add(onConnectionFailedListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f45166i) {
            try {
                if (!this.f45159b.remove(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + valueOf + " not found");
                } else if (this.f45164g) {
                    this.f45160c.add(connectionCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45166i) {
            try {
                if (!this.f45161d.remove(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + valueOf + " not found");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zaj(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f45166i) {
            contains = this.f45159b.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45166i) {
            contains = this.f45161d.contains(onConnectionFailedListener);
        }
        return contains;
    }
}