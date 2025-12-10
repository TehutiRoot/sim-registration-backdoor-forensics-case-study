package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes3.dex */
public final class C6342a implements zaca {

    /* renamed from: a */
    public final Context f44813a;

    /* renamed from: b */
    public final zabe f44814b;

    /* renamed from: c */
    public final Looper f44815c;

    /* renamed from: d */
    public final zabi f44816d;

    /* renamed from: e */
    public final zabi f44817e;

    /* renamed from: f */
    public final Map f44818f;

    /* renamed from: h */
    public final Api.Client f44820h;

    /* renamed from: i */
    public Bundle f44821i;

    /* renamed from: m */
    public final Lock f44825m;

    /* renamed from: g */
    public final Set f44819g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j */
    public ConnectionResult f44822j = null;

    /* renamed from: k */
    public ConnectionResult f44823k = null;

    /* renamed from: l */
    public boolean f44824l = false;

    /* renamed from: n */
    public int f44826n = 0;

    public C6342a(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f44813a = context;
        this.f44814b = zabeVar;
        this.f44825m = lock;
        this.f44815c = looper;
        this.f44820h = client;
        this.f44816d = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new C92(this, null));
        this.f44817e = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new D92(this, null));
        ArrayMap arrayMap = new ArrayMap();
        for (Api.AnyClientKey anyClientKey : map2.keySet()) {
            arrayMap.put(anyClientKey, this.f44816d);
        }
        for (Api.AnyClientKey anyClientKey2 : map.keySet()) {
            arrayMap.put(anyClientKey2, this.f44817e);
        }
        this.f44818f = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: e */
    public static boolean m48572e(ConnectionResult connectionResult) {
        if (connectionResult != null && connectionResult.isSuccess()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static C6342a m48570g(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                arrayMap.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey zab = api.zab();
            if (arrayMap.containsKey(zab)) {
                arrayMap3.put(api, (Boolean) map2.get(api));
            } else if (arrayMap2.containsKey(zab)) {
                arrayMap4.put(api, (Boolean) map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zatVar = (zat) arrayList.get(i);
            if (arrayMap3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else if (arrayMap4.containsKey(zatVar.zaa)) {
                arrayList3.add(zatVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C6342a(context, zabeVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m48563n(C6342a c6342a, int i, boolean z) {
        c6342a.f44814b.zac(i, z);
        c6342a.f44823k = null;
        c6342a.f44822j = null;
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m48562o(C6342a c6342a, Bundle bundle) {
        Bundle bundle2 = c6342a.f44821i;
        if (bundle2 == null) {
            c6342a.f44821i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m48561p(C6342a c6342a) {
        ConnectionResult connectionResult;
        if (m48572e(c6342a.f44822j)) {
            if (!m48572e(c6342a.f44823k) && !c6342a.m48574c()) {
                ConnectionResult connectionResult2 = c6342a.f44823k;
                if (connectionResult2 != null) {
                    if (c6342a.f44826n == 1) {
                        c6342a.m48575b();
                        return;
                    }
                    c6342a.m48576a(connectionResult2);
                    c6342a.f44816d.zar();
                    return;
                }
                return;
            }
            int i = c6342a.f44826n;
            if (i != 1) {
                if (i != 2) {
                    new AssertionError();
                    c6342a.f44826n = 0;
                }
                ((zabe) Preconditions.checkNotNull(c6342a.f44814b)).zab(c6342a.f44821i);
            }
            c6342a.m48575b();
            c6342a.f44826n = 0;
        } else if (c6342a.f44822j != null && m48572e(c6342a.f44823k)) {
            c6342a.f44817e.zar();
            c6342a.m48576a((ConnectionResult) Preconditions.checkNotNull(c6342a.f44822j));
        } else {
            ConnectionResult connectionResult3 = c6342a.f44822j;
            if (connectionResult3 != null && (connectionResult = c6342a.f44823k) != null) {
                if (c6342a.f44817e.f44902m < c6342a.f44816d.f44902m) {
                    connectionResult3 = connectionResult;
                }
                c6342a.m48576a(connectionResult3);
            }
        }
    }

    /* renamed from: a */
    public final void m48576a(ConnectionResult connectionResult) {
        int i = this.f44826n;
        if (i != 1) {
            if (i != 2) {
                new Exception();
                this.f44826n = 0;
            }
            this.f44814b.zaa(connectionResult);
        }
        m48575b();
        this.f44826n = 0;
    }

    /* renamed from: b */
    public final void m48575b() {
        for (SignInConnectionListener signInConnectionListener : this.f44819g) {
            signInConnectionListener.onComplete();
        }
        this.f44819g.clear();
    }

    /* renamed from: c */
    public final boolean m48574c() {
        ConnectionResult connectionResult = this.f44823k;
        if (connectionResult != null && connectionResult.getErrorCode() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m48573d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.f44818f.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f44817e);
    }

    /* renamed from: r */
    public final PendingIntent m48559r() {
        Api.Client client = this.f44820h;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f44813a, System.identityHashCode(this.f44814b), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api) {
        if (Objects.equal(this.f44818f.get(api.zab()), this.f44817e)) {
            if (m48574c()) {
                return new ConnectionResult(4, m48559r());
            }
            return this.f44817e.zad(api);
        }
        return this.f44816d.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (m48573d(apiMethodImpl)) {
            if (m48574c()) {
                apiMethodImpl.setFailedResult(new Status(4, (String) null, m48559r()));
                return apiMethodImpl;
            }
            this.f44817e.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        this.f44816d.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (m48573d(apiMethodImpl)) {
            if (m48574c()) {
                apiMethodImpl.setFailedResult(new Status(4, (String) null, m48559r()));
                return apiMethodImpl;
            }
            return this.f44817e.zaf(apiMethodImpl);
        }
        return this.f44816d.zaf(apiMethodImpl);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.f44826n = 2;
        this.f44824l = false;
        this.f44823k = null;
        this.f44822j = null;
        this.f44816d.zaq();
        this.f44817e.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.f44823k = null;
        this.f44822j = null;
        this.f44826n = 0;
        this.f44816d.zar();
        this.f44817e.zar();
        m48575b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f44817e.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f44816d.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.f44816d.zat();
        this.f44817e.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.f44825m.lock();
        try {
            boolean zax = zax();
            this.f44817e.zar();
            this.f44823k = new ConnectionResult(4);
            if (zax) {
                new com.google.android.gms.internal.base.zau(this.f44815c).post(new RunnableC23260z92(this));
            } else {
                m48575b();
            }
            this.f44825m.unlock();
        } catch (Throwable th2) {
            this.f44825m.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.f44826n == 1) goto L12;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f44825m
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.f44816d     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabi r0 = r3.f44817e     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.m48574c()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.f44826n     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = 1
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.f44825m
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.f44825m
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C6342a.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        boolean z;
        this.f44825m.lock();
        try {
            if (this.f44826n == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f44825m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.f44825m.lock();
        try {
            boolean z = false;
            if (!zax()) {
                if (zaw()) {
                }
                this.f44825m.unlock();
                return z;
            }
            if (!this.f44817e.zaw()) {
                this.f44819g.add(signInConnectionListener);
                z = true;
                if (this.f44826n == 0) {
                    this.f44826n = 1;
                }
                this.f44823k = null;
                this.f44817e.zaq();
            }
            this.f44825m.unlock();
            return z;
        } catch (Throwable th2) {
            this.f44825m.unlock();
            throw th2;
        }
    }
}
