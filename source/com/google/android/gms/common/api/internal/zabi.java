package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class zabi implements zaca, zau {

    /* renamed from: a */
    public final Lock f44890a;

    /* renamed from: b */
    public final Condition f44891b;

    /* renamed from: c */
    public final Context f44892c;

    /* renamed from: d */
    public final GoogleApiAvailabilityLight f44893d;

    /* renamed from: e */
    public final HandlerC22741w82 f44894e;

    /* renamed from: f */
    public final Map f44895f;

    /* renamed from: h */
    public final ClientSettings f44897h;

    /* renamed from: i */
    public final Map f44898i;

    /* renamed from: j */
    public final Api.AbstractClientBuilder f44899j;

    /* renamed from: k */
    public volatile zabf f44900k;

    /* renamed from: m */
    public int f44902m;

    /* renamed from: n */
    public final zabe f44903n;

    /* renamed from: o */
    public final zabz f44904o;

    /* renamed from: g */
    public final Map f44896g = new HashMap();

    /* renamed from: l */
    public ConnectionResult f44901l = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, @Nullable ClientSettings clientSettings, Map map2, @Nullable Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabz zabzVar) {
        this.f44892c = context;
        this.f44890a = lock;
        this.f44893d = googleApiAvailabilityLight;
        this.f44895f = map;
        this.f44897h = clientSettings;
        this.f44898i = map2;
        this.f44899j = abstractClientBuilder;
        this.f44903n = zabeVar;
        this.f44904o = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zat) arrayList.get(i)).zaa(this);
        }
        this.f44894e = new HandlerC22741w82(this, looper);
        this.f44891b = lock.newCondition();
        this.f44900k = new zaax(this);
    }

    /* renamed from: c */
    public final void m48507c() {
        this.f44890a.lock();
        try {
            this.f44903n.m48513h();
            this.f44900k = new zaaj(this);
            this.f44900k.zad();
            this.f44891b.signalAll();
        } finally {
            this.f44890a.unlock();
        }
    }

    /* renamed from: d */
    public final void m48506d() {
        this.f44890a.lock();
        try {
            this.f44900k = new zaaw(this, this.f44897h, this.f44898i, this.f44893d, this.f44899j, this.f44890a, this.f44892c);
            this.f44900k.zad();
            this.f44891b.signalAll();
        } finally {
            this.f44890a.unlock();
        }
    }

    /* renamed from: e */
    public final void m48505e(ConnectionResult connectionResult) {
        this.f44890a.lock();
        try {
            this.f44901l = connectionResult;
            this.f44900k = new zaax(this);
            this.f44900k.zad();
            this.f44891b.signalAll();
        } finally {
            this.f44890a.unlock();
        }
    }

    /* renamed from: f */
    public final void m48504f(AbstractC22569v82 abstractC22569v82) {
        HandlerC22741w82 handlerC22741w82 = this.f44894e;
        handlerC22741w82.sendMessage(handlerC22741w82.obtainMessage(1, abstractC22569v82));
    }

    /* renamed from: g */
    public final void m48503g(RuntimeException runtimeException) {
        HandlerC22741w82 handlerC22741w82 = this.f44894e;
        handlerC22741w82.sendMessage(handlerC22741w82.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.f44890a.lock();
        try {
            this.f44900k.zag(bundle);
        } finally {
            this.f44890a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f44890a.lock();
        try {
            this.f44900k.zai(i);
        } finally {
            this.f44890a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api api, boolean z) {
        this.f44890a.lock();
        try {
            this.f44900k.zah(connectionResult, api, z);
        } finally {
            this.f44890a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ConnectionResult zab() {
        zaq();
        while (this.f44900k instanceof zaaw) {
            try {
                this.f44891b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f44900k instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f44901l;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j);
        while (this.f44900k instanceof zaaw) {
            if (nanos <= 0) {
                zar();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f44891b.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.f44900k instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f44901l;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    @GuardedBy("lock")
    public final ConnectionResult zad(@NonNull Api api) {
        Map map = this.f44895f;
        Api.AnyClientKey zab = api.zab();
        if (map.containsKey(zab)) {
            if (((Api.Client) this.f44895f.get(zab)).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            if (this.f44896g.containsKey(zab)) {
                return (ConnectionResult) this.f44896g.get(zab);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final BaseImplementation.ApiMethodImpl zae(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.f44900k.zaa(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final BaseImplementation.ApiMethodImpl zaf(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        return this.f44900k.zab(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zaq() {
        this.f44900k.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zar() {
        if (this.f44900k.zaj()) {
            this.f44896g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f44900k);
        for (Api api : this.f44898i.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.f44895f.get(api.zab()))).dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zat() {
        if (this.f44900k instanceof zaaj) {
            ((zaaj) this.f44900k).m48548b();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.f44900k instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.f44900k instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
