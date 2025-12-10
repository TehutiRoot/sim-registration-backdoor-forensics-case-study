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
    public final zaj f45146a;

    /* renamed from: h */
    public final Handler f45153h;

    /* renamed from: b */
    public final ArrayList f45147b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f45148c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f45149d = new ArrayList();

    /* renamed from: e */
    public volatile boolean f45150e = false;

    /* renamed from: f */
    public final AtomicInteger f45151f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f45152g = false;

    /* renamed from: i */
    public final Object f45154i = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.f45146a = zajVar;
        this.f45153h = new com.google.android.gms.internal.base.zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f45154i) {
                try {
                    if (this.f45150e && this.f45146a.isConnected() && this.f45147b.contains(connectionCallbacks)) {
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
        this.f45150e = false;
        this.f45151f.incrementAndGet();
    }

    public final void zab() {
        this.f45150e = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f45153h, "onConnectionFailure must only be called on the Handler thread");
        this.f45153h.removeMessages(1);
        synchronized (this.f45154i) {
            try {
                ArrayList arrayList = new ArrayList(this.f45149d);
                int i = this.f45151f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) it.next();
                    if (this.f45150e && this.f45151f.get() == i) {
                        if (this.f45149d.contains(onConnectionFailedListener)) {
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
        Preconditions.checkHandlerThread(this.f45153h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f45154i) {
            try {
                Preconditions.checkState(!this.f45152g);
                this.f45153h.removeMessages(1);
                this.f45152g = true;
                Preconditions.checkState(this.f45148c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f45147b);
                int i = this.f45151f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f45150e || !this.f45146a.isConnected() || this.f45151f.get() != i) {
                        break;
                    } else if (!this.f45148c.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                this.f45148c.clear();
                this.f45152g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.f45153h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f45153h.removeMessages(1);
        synchronized (this.f45154i) {
            try {
                this.f45152g = true;
                ArrayList arrayList = new ArrayList(this.f45147b);
                int i2 = this.f45151f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f45150e || this.f45151f.get() != i2) {
                        break;
                    } else if (this.f45147b.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                this.f45148c.clear();
                this.f45152g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f45154i) {
            try {
                if (this.f45147b.contains(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + valueOf + " is already registered");
                } else {
                    this.f45147b.add(connectionCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f45146a.isConnected()) {
            Handler handler = this.f45153h;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45154i) {
            try {
                if (this.f45149d.contains(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
                } else {
                    this.f45149d.add(onConnectionFailedListener);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f45154i) {
            try {
                if (!this.f45147b.remove(connectionCallbacks)) {
                    String valueOf = String.valueOf(connectionCallbacks);
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + valueOf + " not found");
                } else if (this.f45152g) {
                    this.f45148c.add(connectionCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45154i) {
            try {
                if (!this.f45149d.remove(onConnectionFailedListener)) {
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
        synchronized (this.f45154i) {
            contains = this.f45147b.contains(connectionCallbacks);
        }
        return contains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f45154i) {
            contains = this.f45149d.contains(onConnectionFailedListener);
        }
        return contains;
    }
}
