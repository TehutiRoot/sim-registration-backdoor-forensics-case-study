package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: b */
    public final Lock f44866b;

    /* renamed from: c */
    public final com.google.android.gms.common.internal.zak f44867c;

    /* renamed from: e */
    public final int f44869e;

    /* renamed from: f */
    public final Context f44870f;

    /* renamed from: g */
    public final Looper f44871g;

    /* renamed from: i */
    public volatile boolean f44873i;

    /* renamed from: j */
    public long f44874j;

    /* renamed from: k */
    public long f44875k;

    /* renamed from: l */
    public final HandlerC22225t82 f44876l;

    /* renamed from: m */
    public final GoogleApiAvailability f44877m;

    /* renamed from: n */
    public zabx f44878n;

    /* renamed from: o */
    public final Map f44879o;

    /* renamed from: p */
    public Set f44880p;

    /* renamed from: q */
    public final ClientSettings f44881q;

    /* renamed from: r */
    public final Map f44882r;

    /* renamed from: s */
    public final Api.AbstractClientBuilder f44883s;

    /* renamed from: t */
    public final ListenerHolders f44884t;

    /* renamed from: u */
    public final ArrayList f44885u;

    /* renamed from: v */
    public Integer f44886v;

    /* renamed from: w */
    public Set f44887w;

    /* renamed from: x */
    public final zadc f44888x;

    /* renamed from: y */
    public final zaj f44889y;

    /* renamed from: d */
    public zaca f44868d = null;

    /* renamed from: h */
    public final Queue f44872h = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.f44874j = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.f44875k = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        this.f44880p = new HashSet();
        this.f44884t = new ListenerHolders();
        this.f44886v = null;
        this.f44887w = null;
        C21021m82 c21021m82 = new C21021m82(this);
        this.f44889y = c21021m82;
        this.f44870f = context;
        this.f44866b = lock;
        this.f44867c = new com.google.android.gms.common.internal.zak(looper, c21021m82);
        this.f44871g = looper;
        this.f44876l = new HandlerC22225t82(this, looper);
        this.f44877m = googleApiAvailability;
        this.f44869e = i;
        if (i >= 0) {
            this.f44886v = Integer.valueOf(i2);
        }
        this.f44882r = map;
        this.f44879o = map2;
        this.f44885u = arrayList;
        this.f44888x = new zadc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f44867c.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f44867c.zag((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.f44881q = clientSettings;
        this.f44883s = abstractClientBuilder;
    }

    /* renamed from: d */
    public static String m48517d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m48515f(zabe zabeVar) {
        zabeVar.f44866b.lock();
        try {
            if (zabeVar.f44873i) {
                zabeVar.m48510k();
            }
        } finally {
            zabeVar.f44866b.unlock();
        }
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ void m48514g(zabe zabeVar) {
        zabeVar.f44866b.lock();
        try {
            if (zabeVar.m48513h()) {
                zabeVar.m48510k();
            }
        } finally {
            zabeVar.f44866b.unlock();
        }
    }

    public static int zad(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z2 |= client.requiresSignIn();
            z3 |= client.providesSignIn();
        }
        if (z2) {
            if (z3 && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f44866b.lock();
        try {
            if (this.f44869e >= 0) {
                if (this.f44886v == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f44886v;
                if (num == null) {
                    this.f44886v = Integer.valueOf(zad(this.f44879o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            m48512i(((Integer) Preconditions.checkNotNull(this.f44886v)).intValue());
            this.f44867c.zab();
            ConnectionResult zab = ((zaca) Preconditions.checkNotNull(this.f44868d)).zab();
            this.f44866b.unlock();
            return zab;
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    public final String m48518c() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.f44886v;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.f44879o.containsKey(Common.CLIENT_KEY)) {
            m48511j(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C21193n82 c21193n82 = new C21193n82(this, atomicReference, statusPendingResult);
            C21881r82 c21881r82 = new C21881r82(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f44870f);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(c21193n82);
            builder.addOnConnectionFailedListener(c21881r82);
            builder.setHandler(this.f44876l);
            GoogleApiClient build = builder.build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.f44866b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f44869e >= 0) {
                Preconditions.checkState(this.f44886v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f44886v;
                if (num == null) {
                    this.f44886v = Integer.valueOf(zad(this.f44879o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.checkNotNull(this.f44886v)).intValue();
            this.f44866b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
                m48512i(i);
                m48510k();
                this.f44866b.unlock();
                this.f44866b.unlock();
            }
            z = true;
            Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
            m48512i(i);
            m48510k();
            this.f44866b.unlock();
            this.f44866b.unlock();
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.f44866b.lock();
        try {
            this.f44888x.zab();
            zaca zacaVar = this.f44868d;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.f44884t.zab();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.f44872h) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.f44872h.clear();
            if (this.f44868d != null) {
                m48513h();
                this.f44867c.zaa();
            }
            this.f44866b.unlock();
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f44870f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f44873i);
        printWriter.append(" mWorkQueue.size()=").print(this.f44872h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f44888x.f44942a.size());
        zaca zacaVar = this.f44868d;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        String str;
        Api<?> api = t.getApi();
        boolean containsKey = this.f44879o.containsKey(t.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        Preconditions.checkArgument(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f44866b.lock();
        try {
            zaca zacaVar = this.f44868d;
            if (zacaVar == null) {
                this.f44872h.add(t);
            } else {
                t = (T) zacaVar.zae(t);
            }
            this.f44866b.unlock();
            return t;
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        String str;
        Map map = this.f44879o;
        Api<?> api = t.getApi();
        boolean containsKey = map.containsKey(t.getClientKey());
        if (api != null) {
            str = api.zad();
        } else {
            str = "the API";
        }
        Preconditions.checkArgument(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f44866b.lock();
        try {
            zaca zacaVar = this.f44868d;
            if (zacaVar != null) {
                if (this.f44873i) {
                    this.f44872h.add(t);
                    while (!this.f44872h.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f44872h.remove();
                        this.f44888x.m48461a(apiMethodImpl);
                        apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                    }
                } else {
                    t = (T) zacaVar.zaf(t);
                }
                this.f44866b.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.f44879o.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        this.f44866b.lock();
        try {
            if (!isConnected() && !this.f44873i) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (this.f44879o.containsKey(api.zab())) {
                ConnectionResult zad = ((zaca) Preconditions.checkNotNull(this.f44868d)).zad(api);
                if (zad == null) {
                    if (this.f44873i) {
                        connectionResult = ConnectionResult.RESULT_SUCCESS;
                    } else {
                        Log.w("GoogleApiClientImpl", m48518c());
                        String zad2 = api.zad();
                        StringBuilder sb = new StringBuilder();
                        sb.append(zad2);
                        sb.append(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                        new Exception();
                        connectionResult = new ConnectionResult(8, null);
                    }
                    this.f44866b.unlock();
                    return connectionResult;
                }
                this.f44866b.unlock();
                return zad;
            }
            String zad3 = api.zad();
            throw new IllegalArgumentException(zad3 + " was never registered with GoogleApiClient");
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.f44870f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.f44871g;
    }

    /* renamed from: h */
    public final boolean m48513h() {
        if (!this.f44873i) {
            return false;
        }
        this.f44873i = false;
        this.f44876l.removeMessages(2);
        this.f44876l.removeMessages(1);
        zabx zabxVar = this.f44878n;
        if (zabxVar != null) {
            zabxVar.zab();
            this.f44878n = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.f44879o.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        if (!isConnected() || (client = (Api.Client) this.f44879o.get(api.zab())) == null || !client.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void m48512i(int i) {
        Integer num = this.f44886v;
        if (num == null) {
            this.f44886v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String m48517d = m48517d(this.f44886v.intValue());
            throw new IllegalStateException("Cannot use sign-in mode: " + m48517d(i) + ". Mode was already set to " + m48517d);
        }
        if (this.f44868d != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Api.Client client : this.f44879o.values()) {
            z |= client.requiresSignIn();
            z2 |= client.providesSignIn();
        }
        int intValue = this.f44886v.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z) {
                this.f44868d = C6342a.m48570g(this.f44870f, this, this.f44866b, this.f44871g, this.f44877m, this.f44879o, this.f44881q, this.f44882r, this.f44883s, this.f44885u);
                return;
            }
        } else if (z) {
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f44868d = new zabi(this.f44870f, this, this.f44866b, this.f44871g, this.f44877m, this.f44879o, this.f44881q, this.f44882r, this.f44883s, this.f44885u, this);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.f44868d;
        if (zacaVar != null && zacaVar.zaw()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.f44868d;
        if (zacaVar != null && zacaVar.zax()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.f44867c.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f44867c.zak(onConnectionFailedListener);
    }

    /* renamed from: j */
    public final void m48511j(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new C22053s82(this, statusPendingResult, z, googleApiClient));
    }

    /* renamed from: k */
    public final void m48510k() {
        this.f44867c.zab();
        ((zaca) Preconditions.checkNotNull(this.f44868d)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.f44868d;
        if (zacaVar != null && zacaVar.zay(signInConnectionListener)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.f44868d;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f44867c.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f44867c.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.f44866b.lock();
        try {
            return this.f44884t.zaa(l, this.f44871g, "NO_TYPE");
        } finally {
            this.f44866b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.f44869e >= 0) {
            zak.zaa(lifecycleActivity).zae(this.f44869e);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f44867c.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f44867c.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.f44877m.isPlayServicesPossiblyUpdating(this.f44870f, connectionResult.getErrorCode())) {
            m48513h();
        }
        if (!this.f44873i) {
            this.f44867c.zac(connectionResult);
            this.f44867c.zaa();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zab(@Nullable Bundle bundle) {
        while (!this.f44872h.isEmpty()) {
            execute((BaseImplementation.ApiMethodImpl) this.f44872h.remove());
        }
        this.f44867c.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f44873i) {
                this.f44873i = true;
                if (this.f44878n == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.f44878n = this.f44877m.zac(this.f44870f.getApplicationContext(), new C22397u82(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC22225t82 handlerC22225t82 = this.f44876l;
                handlerC22225t82.sendMessageDelayed(handlerC22225t82.obtainMessage(1), this.f44874j);
                HandlerC22225t82 handlerC22225t822 = this.f44876l;
                handlerC22225t822.sendMessageDelayed(handlerC22225t822.obtainMessage(2), this.f44875k);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f44888x.f44942a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.f44867c.zae(i);
        this.f44867c.zaa();
        if (i == 2) {
            m48510k();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.f44866b.lock();
        try {
            if (this.f44887w == null) {
                this.f44887w = new HashSet();
            }
            this.f44887w.add(zadaVar);
            this.f44866b.unlock();
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r2 == false) goto L16;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zap(com.google.android.gms.common.api.internal.zada r2) {
        /*
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.f44866b
            r0.lock()
            java.util.Set r0 = r1.f44887w     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            goto L40
        Lf:
            r2 = move-exception
            goto L4d
        L11:
            boolean r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L1d
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            goto L40
        L1d:
            java.util.concurrent.locks.Lock r2 = r1.f44866b     // Catch: java.lang.Throwable -> Lf
            r2.lock()     // Catch: java.lang.Throwable -> Lf
            java.util.Set r2 = r1.f44887w     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L2c
            java.util.concurrent.locks.Lock r2 = r1.f44866b     // Catch: java.lang.Throwable -> Lf
            r2.unlock()     // Catch: java.lang.Throwable -> Lf
            goto L39
        L2c:
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L46
            r2 = r2 ^ 1
            java.util.concurrent.locks.Lock r0 = r1.f44866b     // Catch: java.lang.Throwable -> Lf
            r0.unlock()     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L40
        L39:
            com.google.android.gms.common.api.internal.zaca r2 = r1.f44868d     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L40
            r2.zat()     // Catch: java.lang.Throwable -> Lf
        L40:
            java.util.concurrent.locks.Lock r2 = r1.f44866b
            r2.unlock()
            return
        L46:
            r2 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.f44866b     // Catch: java.lang.Throwable -> Lf
            r0.unlock()     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L4d:
            java.util.concurrent.locks.Lock r0 = r1.f44866b
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.zap(com.google.android.gms.common.api.internal.zada):void");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.f44866b.lock();
        try {
            Integer num = this.f44886v;
            if (num == null) {
                this.f44886v = Integer.valueOf(zad(this.f44879o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m48512i(((Integer) Preconditions.checkNotNull(this.f44886v)).intValue());
            this.f44867c.zab();
            ConnectionResult zac = ((zaca) Preconditions.checkNotNull(this.f44868d)).zac(j, timeUnit);
            this.f44866b.unlock();
            return zac;
        } catch (Throwable th2) {
            this.f44866b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.f44866b.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            Preconditions.checkArgument(z, "Illegal sign-in mode: " + i);
            m48512i(i);
            m48510k();
        } finally {
            this.f44866b.unlock();
        }
    }
}
