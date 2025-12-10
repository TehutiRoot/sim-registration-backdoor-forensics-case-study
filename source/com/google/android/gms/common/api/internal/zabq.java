package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: b */
    public final Api.Client f44907b;

    /* renamed from: c */
    public final ApiKey f44908c;

    /* renamed from: d */
    public final zaad f44909d;

    /* renamed from: g */
    public final int f44912g;

    /* renamed from: h */
    public final zact f44913h;

    /* renamed from: i */
    public boolean f44914i;

    /* renamed from: m */
    public final /* synthetic */ GoogleApiManager f44918m;

    /* renamed from: a */
    public final Queue f44906a = new LinkedList();

    /* renamed from: e */
    public final Set f44910e = new HashSet();

    /* renamed from: f */
    public final Map f44911f = new HashMap();

    /* renamed from: j */
    public final List f44915j = new ArrayList();

    /* renamed from: k */
    public ConnectionResult f44916k = null;

    /* renamed from: l */
    public int f44917l = 0;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f44918m = googleApiManager;
        handler = googleApiManager.f44766n;
        Api.Client zab = googleApi.zab(handler.getLooper(), this);
        this.f44907b = zab;
        this.f44908c = googleApi.getApiKey();
        this.f44909d = new zaad();
        this.f44912g = googleApi.zaa();
        if (zab.requiresSignIn()) {
            context = googleApiManager.f44757e;
            handler2 = googleApiManager.f44766n;
            this.f44913h = googleApi.zac(context, handler2);
            return;
        }
        this.f44913h = null;
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ ApiKey m48487p(zabq zabqVar) {
        return zabqVar.f44908c;
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m48486q(zabq zabqVar, Status status) {
        zabqVar.m48500c(status);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m48483t(zabq zabqVar, B82 b82) {
        if (zabqVar.f44915j.contains(b82) && !zabqVar.f44914i) {
            if (!zabqVar.f44907b.isConnected()) {
                zabqVar.zao();
            } else {
                zabqVar.m48498e();
            }
        }
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m48482u(zabq zabqVar, B82 b82) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] zab;
        if (zabqVar.f44915j.remove(b82)) {
            handler = zabqVar.f44918m.f44766n;
            handler.removeMessages(15, b82);
            handler2 = zabqVar.f44918m.f44766n;
            handler2.removeMessages(16, b82);
            feature = b82.f310b;
            ArrayList arrayList = new ArrayList(zabqVar.f44906a.size());
            for (zai zaiVar : zabqVar.f44906a) {
                if ((zaiVar instanceof zac) && (zab = ((zac) zaiVar).zab(zabqVar)) != null && ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zai zaiVar2 = (zai) arrayList.get(i);
                zabqVar.f44906a.remove(zaiVar2);
                zaiVar2.zae(new UnsupportedApiCallException(feature));
            }
        }
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m48479x(zabq zabqVar, boolean z) {
        return zabqVar.m48490m(false);
    }

    /* renamed from: a */
    public final Feature m48502a(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f44907b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) arrayMap.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m48501b(ConnectionResult connectionResult) {
        String str;
        for (zal zalVar : this.f44910e) {
            if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                str = this.f44907b.getEndpointPackageName();
            } else {
                str = null;
            }
            zalVar.zac(this.f44908c, connectionResult, str);
        }
        this.f44910e.clear();
    }

    /* renamed from: c */
    public final void m48500c(Status status) {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        m48499d(status, null, false);
    }

    /* renamed from: d */
    public final void m48499d(Status status, Exception exc, boolean z) {
        Handler handler;
        boolean z2;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.f44906a.iterator();
            while (it.hasNext()) {
                zai zaiVar = (zai) it.next();
                if (!z || zaiVar.zac == 2) {
                    if (status != null) {
                        zaiVar.zad(status);
                    } else {
                        zaiVar.zae(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: e */
    public final void m48498e() {
        ArrayList arrayList = new ArrayList(this.f44906a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (this.f44907b.isConnected()) {
                if (m48492k(zaiVar)) {
                    this.f44906a.remove(zaiVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void m48497f() {
        zan();
        m48501b(ConnectionResult.RESULT_SUCCESS);
        m48493j();
        Iterator it = this.f44911f.values().iterator();
        while (it.hasNext()) {
            zaci zaciVar = (zaci) it.next();
            if (m48502a(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.f44907b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f44907b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m48498e();
        m48495h();
    }

    /* renamed from: g */
    public final void m48496g(int i) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        com.google.android.gms.common.internal.zal zalVar;
        zan();
        this.f44914i = true;
        this.f44909d.m48554e(i, this.f44907b.getLastDisconnectMessage());
        ApiKey apiKey = this.f44908c;
        GoogleApiManager googleApiManager = this.f44918m;
        handler = googleApiManager.f44766n;
        handler2 = googleApiManager.f44766n;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, apiKey), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        ApiKey apiKey2 = this.f44908c;
        GoogleApiManager googleApiManager2 = this.f44918m;
        handler3 = googleApiManager2.f44766n;
        handler4 = googleApiManager2.f44766n;
        handler3.sendMessageDelayed(Message.obtain(handler4, 11, apiKey2), 120000L);
        zalVar = this.f44918m.f44759g;
        zalVar.zac();
        for (zaci zaciVar : this.f44911f.values()) {
            zaciVar.zac.run();
        }
    }

    /* renamed from: h */
    public final void m48495h() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        ApiKey apiKey = this.f44908c;
        handler = this.f44918m.f44766n;
        handler.removeMessages(12, apiKey);
        ApiKey apiKey2 = this.f44908c;
        GoogleApiManager googleApiManager = this.f44918m;
        handler2 = googleApiManager.f44766n;
        handler3 = googleApiManager.f44766n;
        Message obtainMessage = handler3.obtainMessage(12, apiKey2);
        j = this.f44918m.f44753a;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: i */
    public final void m48494i(zai zaiVar) {
        zaiVar.zag(this.f44909d, zaA());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f44907b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: j */
    public final void m48493j() {
        Handler handler;
        Handler handler2;
        if (this.f44914i) {
            GoogleApiManager googleApiManager = this.f44918m;
            ApiKey apiKey = this.f44908c;
            handler = googleApiManager.f44766n;
            handler.removeMessages(11, apiKey);
            GoogleApiManager googleApiManager2 = this.f44918m;
            ApiKey apiKey2 = this.f44908c;
            handler2 = googleApiManager2.f44766n;
            handler2.removeMessages(9, apiKey2);
            this.f44914i = false;
        }
    }

    /* renamed from: k */
    public final boolean m48492k(zai zaiVar) {
        boolean z;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        if (!(zaiVar instanceof zac)) {
            m48494i(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature m48502a = m48502a(zacVar.zab(this));
        if (m48502a == null) {
            m48494i(zaiVar);
            return true;
        }
        String name = this.f44907b.getClass().getName();
        String name2 = m48502a.getName();
        long version = m48502a.getVersion();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + name2 + ", " + version + ").");
        z = this.f44918m.f44767o;
        if (z && zacVar.zaa(this)) {
            B82 b82 = new B82(this.f44908c, m48502a, null);
            int indexOf = this.f44915j.indexOf(b82);
            if (indexOf >= 0) {
                B82 b822 = (B82) this.f44915j.get(indexOf);
                handler5 = this.f44918m.f44766n;
                handler5.removeMessages(15, b822);
                GoogleApiManager googleApiManager = this.f44918m;
                handler6 = googleApiManager.f44766n;
                handler7 = googleApiManager.f44766n;
                handler6.sendMessageDelayed(Message.obtain(handler7, 15, b822), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                return false;
            }
            this.f44915j.add(b82);
            GoogleApiManager googleApiManager2 = this.f44918m;
            handler = googleApiManager2.f44766n;
            handler2 = googleApiManager2.f44766n;
            handler.sendMessageDelayed(Message.obtain(handler2, 15, b82), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
            GoogleApiManager googleApiManager3 = this.f44918m;
            handler3 = googleApiManager3.f44766n;
            handler4 = googleApiManager3.f44766n;
            handler3.sendMessageDelayed(Message.obtain(handler4, 16, b82), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!m48491l(connectionResult)) {
                this.f44918m.m48604d(connectionResult, this.f44912g);
                return false;
            }
            return false;
        }
        zacVar.zae(new UnsupportedApiCallException(m48502a));
        return true;
    }

    /* renamed from: l */
    public final boolean m48491l(ConnectionResult connectionResult) {
        Object obj;
        zaae zaaeVar;
        Set set;
        zaae zaaeVar2;
        obj = GoogleApiManager.f44751q;
        synchronized (obj) {
            try {
                GoogleApiManager googleApiManager = this.f44918m;
                zaaeVar = googleApiManager.f44763k;
                if (zaaeVar != null) {
                    set = googleApiManager.f44764l;
                    if (set.contains(this.f44908c)) {
                        zaaeVar2 = this.f44918m.f44763k;
                        zaaeVar2.zah(connectionResult, this.f44912g);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final boolean m48490m(boolean z) {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        if (this.f44907b.isConnected() && this.f44911f.isEmpty()) {
            if (this.f44909d.m48553f()) {
                if (z) {
                    m48495h();
                    return false;
                }
                return false;
            }
            this.f44907b.disconnect("Timing out service connection.");
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final int m48489n() {
        return this.f44917l;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.f44918m;
        Looper myLooper = Looper.myLooper();
        handler = googleApiManager.f44766n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f44918m.f44766n;
            handler2.post(new RunnableC22913x82(this));
            return;
        }
        m48497f();
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Handler handler;
        Handler handler2;
        GoogleApiManager googleApiManager = this.f44918m;
        Looper myLooper = Looper.myLooper();
        handler = googleApiManager.f44766n;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f44918m.f44766n;
            handler2.post(new RunnableC23085y82(this, i));
            return;
        }
        m48496g(i);
    }

    /* renamed from: v */
    public final void m48481v() {
        this.f44917l++;
    }

    /* renamed from: y */
    public final boolean m48478y() {
        return this.f44907b.isConnected();
    }

    public final boolean zaA() {
        return this.f44907b.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    @WorkerThread
    public final boolean zaB() {
        return m48490m(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.f44912g;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        return this.f44916k;
    }

    public final Api.Client zaf() {
        return this.f44907b;
    }

    public final Map zah() {
        return this.f44911f;
    }

    @WorkerThread
    public final void zan() {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        this.f44916k = null;
    }

    @WorkerThread
    public final void zao() {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        Context context;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        if (!this.f44907b.isConnected() && !this.f44907b.isConnecting()) {
            try {
                GoogleApiManager googleApiManager = this.f44918m;
                zalVar = googleApiManager.f44759g;
                context = googleApiManager.f44757e;
                int zab = zalVar.zab(context, this.f44907b);
                if (zab != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(zab, null);
                    String name = this.f44907b.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    zar(connectionResult, null);
                    return;
                }
                GoogleApiManager googleApiManager2 = this.f44918m;
                Api.Client client = this.f44907b;
                D82 d82 = new D82(googleApiManager2, client, this.f44908c);
                if (client.requiresSignIn()) {
                    ((zact) Preconditions.checkNotNull(this.f44913h)).zae(d82);
                }
                try {
                    this.f44907b.connect(d82);
                } catch (SecurityException e) {
                    zar(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                zar(new ConnectionResult(10), e2);
            }
        }
    }

    @WorkerThread
    public final void zap(zai zaiVar) {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        if (this.f44907b.isConnected()) {
            if (m48492k(zaiVar)) {
                m48495h();
                return;
            } else {
                this.f44906a.add(zaiVar);
                return;
            }
        }
        this.f44906a.add(zaiVar);
        ConnectionResult connectionResult = this.f44916k;
        if (connectionResult != null && connectionResult.hasResolution()) {
            zar(this.f44916k, null);
        } else {
            zao();
        }
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Handler handler;
        com.google.android.gms.common.internal.zal zalVar;
        boolean z;
        Status m48603e;
        Status m48603e2;
        Status m48603e3;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        zact zactVar = this.f44913h;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        zalVar = this.f44918m.f44759g;
        zalVar.zac();
        m48501b(connectionResult);
        if ((this.f44907b instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.f44918m.f44754b = true;
            GoogleApiManager googleApiManager = this.f44918m;
            handler5 = googleApiManager.f44766n;
            handler6 = googleApiManager.f44766n;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (connectionResult.getErrorCode() == 4) {
            status = GoogleApiManager.f44750p;
            m48500c(status);
        } else if (this.f44906a.isEmpty()) {
            this.f44916k = connectionResult;
        } else if (exc != null) {
            handler4 = this.f44918m.f44766n;
            Preconditions.checkHandlerThread(handler4);
            m48499d(null, exc, false);
        } else {
            z = this.f44918m.f44767o;
            if (z) {
                m48603e2 = GoogleApiManager.m48603e(this.f44908c, connectionResult);
                m48499d(m48603e2, null, true);
                if (!this.f44906a.isEmpty() && !m48491l(connectionResult) && !this.f44918m.m48604d(connectionResult, this.f44912g)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.f44914i = true;
                    }
                    if (!this.f44914i) {
                        m48603e3 = GoogleApiManager.m48603e(this.f44908c, connectionResult);
                        m48500c(m48603e3);
                        return;
                    }
                    GoogleApiManager googleApiManager2 = this.f44918m;
                    ApiKey apiKey = this.f44908c;
                    handler2 = googleApiManager2.f44766n;
                    handler3 = googleApiManager2.f44766n;
                    handler2.sendMessageDelayed(Message.obtain(handler3, 9, apiKey), CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    return;
                }
                return;
            }
            m48603e = GoogleApiManager.m48603e(this.f44908c, connectionResult);
            m48500c(m48603e);
        }
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        Api.Client client = this.f44907b;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        client.disconnect("onSignInFailed for " + name + " with " + valueOf);
        zar(connectionResult, null);
    }

    @WorkerThread
    public final void zat(zal zalVar) {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        this.f44910e.add(zalVar);
    }

    @WorkerThread
    public final void zau() {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        if (this.f44914i) {
            zao();
        }
    }

    @WorkerThread
    public final void zav() {
        Handler handler;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        m48500c(GoogleApiManager.zaa);
        this.f44909d.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f44911f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        m48501b(new ConnectionResult(4));
        if (this.f44907b.isConnected()) {
            this.f44907b.onUserSignOut(new A82(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        Handler handler;
        GoogleApiAvailability googleApiAvailability;
        Context context;
        Status status;
        handler = this.f44918m.f44766n;
        Preconditions.checkHandlerThread(handler);
        if (this.f44914i) {
            m48493j();
            GoogleApiManager googleApiManager = this.f44918m;
            googleApiAvailability = googleApiManager.f44758f;
            context = googleApiManager.f44757e;
            if (googleApiAvailability.isGooglePlayServicesAvailable(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m48500c(status);
            this.f44907b.disconnect("Timing out connection while resuming.");
        }
    }
}
