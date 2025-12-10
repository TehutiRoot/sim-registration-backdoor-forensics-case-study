package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class zaaw implements zabf {

    /* renamed from: a */
    public final zabi f44843a;

    /* renamed from: b */
    public final Lock f44844b;

    /* renamed from: c */
    public final Context f44845c;

    /* renamed from: d */
    public final GoogleApiAvailabilityLight f44846d;

    /* renamed from: e */
    public ConnectionResult f44847e;

    /* renamed from: f */
    public int f44848f;

    /* renamed from: h */
    public int f44850h;

    /* renamed from: k */
    public com.google.android.gms.signin.zae f44853k;

    /* renamed from: l */
    public boolean f44854l;

    /* renamed from: m */
    public boolean f44855m;

    /* renamed from: n */
    public boolean f44856n;

    /* renamed from: o */
    public IAccountAccessor f44857o;

    /* renamed from: p */
    public boolean f44858p;

    /* renamed from: q */
    public boolean f44859q;

    /* renamed from: r */
    public final ClientSettings f44860r;

    /* renamed from: s */
    public final Map f44861s;

    /* renamed from: t */
    public final Api.AbstractClientBuilder f44862t;

    /* renamed from: g */
    public int f44849g = 0;

    /* renamed from: i */
    public final Bundle f44851i = new Bundle();

    /* renamed from: j */
    public final Set f44852j = new HashSet();

    /* renamed from: u */
    public final ArrayList f44863u = new ArrayList();

    public zaaw(zabi zabiVar, @Nullable ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.f44843a = zabiVar;
        this.f44860r = clientSettings;
        this.f44861s = map;
        this.f44846d = googleApiAvailabilityLight;
        this.f44862t = abstractClientBuilder;
        this.f44844b = lock;
        this.f44845c = context;
    }

    /* renamed from: j */
    public static final String m48536j(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ Set m48529q(zaaw zaawVar) {
        ClientSettings clientSettings = zaawVar.f44860r;
        if (clientSettings == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
        Map zad = zaawVar.f44860r.zad();
        for (Api api : zad.keySet()) {
            zabi zabiVar = zaawVar.f44843a;
            if (!zabiVar.f44896g.containsKey(api.zab())) {
                hashSet.addAll(((com.google.android.gms.common.internal.zab) zad.get(api)).zaa);
            }
        }
        return hashSet;
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m48526t(zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (!zaawVar.m48539g(0)) {
            return;
        }
        ConnectionResult zaa = zakVar.zaa();
        if (zaa.isSuccess()) {
            zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult zaa2 = zavVar.zaa();
            if (!zaa2.isSuccess()) {
                String valueOf = String.valueOf(zaa2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                zaawVar.m48542d(zaa2);
                return;
            }
            zaawVar.f44856n = true;
            zaawVar.f44857o = (IAccountAccessor) Preconditions.checkNotNull(zavVar.zab());
            zaawVar.f44858p = zavVar.zac();
            zaawVar.f44859q = zavVar.zad();
            zaawVar.m48540f();
        } else if (zaawVar.m48537i(zaa)) {
            zaawVar.m48545a();
            zaawVar.m48540f();
        } else {
            zaawVar.m48542d(zaa);
        }
    }

    /* renamed from: B */
    public final void m48546B() {
        ArrayList arrayList = this.f44863u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f44863u.clear();
    }

    /* renamed from: a */
    public final void m48545a() {
        this.f44855m = false;
        this.f44843a.f44903n.f44880p = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f44852j) {
            if (!this.f44843a.f44896g.containsKey(anyClientKey)) {
                zabi zabiVar = this.f44843a;
                zabiVar.f44896g.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: b */
    public final void m48544b(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.f44853k;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.f44860r);
            this.f44857o = null;
        }
    }

    /* renamed from: c */
    public final void m48543c() {
        Bundle bundle;
        this.f44843a.m48507c();
        zabj.zaa().execute(new RunnableC19301c82(this));
        com.google.android.gms.signin.zae zaeVar = this.f44853k;
        if (zaeVar != null) {
            if (this.f44858p) {
                zaeVar.zac((IAccountAccessor) Preconditions.checkNotNull(this.f44857o), this.f44859q);
            }
            m48544b(false);
        }
        for (Api.AnyClientKey anyClientKey : this.f44843a.f44896g.keySet()) {
            ((Api.Client) Preconditions.checkNotNull((Api.Client) this.f44843a.f44895f.get(anyClientKey))).disconnect();
        }
        if (this.f44851i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f44851i;
        }
        this.f44843a.f44904o.zab(bundle);
    }

    /* renamed from: d */
    public final void m48542d(ConnectionResult connectionResult) {
        m48546B();
        m48544b(!connectionResult.hasResolution());
        this.f44843a.m48505e(connectionResult);
        this.f44843a.f44904o.zaa(connectionResult);
    }

    /* renamed from: e */
    public final void m48541e(ConnectionResult connectionResult, Api api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.f44846d.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.f44847e == null || priority < this.f44848f)) {
            this.f44847e = connectionResult;
            this.f44848f = priority;
        }
        zabi zabiVar = this.f44843a;
        zabiVar.f44896g.put(api.zab(), connectionResult);
    }

    /* renamed from: f */
    public final void m48540f() {
        if (this.f44850h == 0) {
            if (!this.f44855m || this.f44856n) {
                ArrayList arrayList = new ArrayList();
                this.f44849g = 1;
                this.f44850h = this.f44843a.f44895f.size();
                for (Api.AnyClientKey anyClientKey : this.f44843a.f44895f.keySet()) {
                    if (this.f44843a.f44896g.containsKey(anyClientKey)) {
                        if (m48538h()) {
                            m48543c();
                        }
                    } else {
                        arrayList.add((Api.Client) this.f44843a.f44895f.get(anyClientKey));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f44863u.add(zabj.zaa().submit(new C20161h82(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m48539g(int i) {
        if (this.f44849g != i) {
            Log.w("GACConnecting", this.f44843a.f44903n.m48518c());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i2 = this.f44850h;
            Log.w("GACConnecting", "mRemainingConnections=" + i2);
            String m48536j = m48536j(this.f44849g);
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleApiClient connecting is in step ");
            sb.append(m48536j);
            sb.append(" but received callback for step ");
            sb.append(m48536j(i));
            new Exception();
            m48542d(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m48538h() {
        int i = this.f44850h - 1;
        this.f44850h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f44843a.f44903n.m48518c());
            new Exception();
            m48542d(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f44847e;
        if (connectionResult != null) {
            this.f44843a.f44902m = this.f44848f;
            m48542d(connectionResult);
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m48537i(ConnectionResult connectionResult) {
        if (this.f44854l && !connectionResult.hasResolution()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f44843a.f44903n.f44872h.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zad() {
        boolean z;
        this.f44843a.f44896g.clear();
        this.f44855m = false;
        this.f44847e = null;
        this.f44849g = 0;
        this.f44854l = true;
        this.f44856n = false;
        this.f44858p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (Api api : this.f44861s.keySet()) {
            zabi zabiVar = this.f44843a;
            Api.Client client = (Api.Client) Preconditions.checkNotNull((Api.Client) zabiVar.f44895f.get(api.zab()));
            if (api.zac().getPriority() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.f44861s.get(api)).booleanValue();
            if (client.requiresSignIn()) {
                this.f44855m = true;
                if (booleanValue) {
                    this.f44852j.add(api.zab());
                } else {
                    this.f44854l = false;
                }
            }
            hashMap.put(client, new C19473d82(this, api, booleanValue));
        }
        if (z2) {
            this.f44855m = false;
        }
        if (this.f44855m) {
            Preconditions.checkNotNull(this.f44860r);
            Preconditions.checkNotNull(this.f44862t);
            this.f44860r.zae(Integer.valueOf(System.identityHashCode(this.f44843a.f44903n)));
            C20677k82 c20677k82 = new C20677k82(this, null);
            Api.AbstractClientBuilder abstractClientBuilder = this.f44862t;
            Context context = this.f44845c;
            zabi zabiVar2 = this.f44843a;
            ClientSettings clientSettings = this.f44860r;
            this.f44853k = abstractClientBuilder.buildClient(context, zabiVar2.f44903n.getLooper(), clientSettings, (ClientSettings) clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) c20677k82, (GoogleApiClient.OnConnectionFailedListener) c20677k82);
        }
        this.f44850h = this.f44843a.f44895f.size();
        this.f44863u.add(zabj.zaa().submit(new C19989g82(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zag(@Nullable Bundle bundle) {
        if (m48539g(1)) {
            if (bundle != null) {
                this.f44851i.putAll(bundle);
            }
            if (m48538h()) {
                m48543c();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zah(ConnectionResult connectionResult, Api api, boolean z) {
        if (m48539g(1)) {
            m48541e(connectionResult, api, z);
            if (m48538h()) {
                m48543c();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zai(int i) {
        m48542d(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final boolean zaj() {
        m48546B();
        m48544b(true);
        this.f44843a.m48505e(null);
        return true;
    }
}
