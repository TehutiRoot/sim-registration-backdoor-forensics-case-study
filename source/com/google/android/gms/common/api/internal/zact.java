package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.zad;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: h */
    public static final Api.AbstractClientBuilder f44925h = zad.zac;

    /* renamed from: a */
    public final Context f44926a;

    /* renamed from: b */
    public final Handler f44927b;

    /* renamed from: c */
    public final Api.AbstractClientBuilder f44928c;

    /* renamed from: d */
    public final Set f44929d;

    /* renamed from: e */
    public final ClientSettings f44930e;

    /* renamed from: f */
    public com.google.android.gms.signin.zae f44931f;

    /* renamed from: g */
    public zacs f44932g;

    @WorkerThread
    public zact(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = f44925h;
        this.f44926a = context;
        this.f44927b = handler;
        this.f44930e = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.f44929d = clientSettings.getRequiredScopes();
        this.f44928c = abstractClientBuilder;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m48475b(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        ConnectionResult zaa = zakVar.zaa();
        if (zaa.isSuccess()) {
            zav zavVar = (zav) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult zaa2 = zavVar.zaa();
            if (!zaa2.isSuccess()) {
                String valueOf = String.valueOf(zaa2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                zactVar.f44932g.zae(zaa2);
                zactVar.f44931f.disconnect();
                return;
            }
            zactVar.f44932g.zaf(zavVar.zab(), zactVar.f44929d);
        } else {
            zactVar.f44932g.zae(zaa);
        }
        zactVar.f44931f.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.f44931f.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f44932g.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.f44932g.zag(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.f44927b.post(new L82(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @WorkerThread
    public final void zae(zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.f44931f;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.f44930e.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.f44928c;
        Context context = this.f44926a;
        Handler handler = this.f44927b;
        ClientSettings clientSettings = this.f44930e;
        this.f44931f = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, (ClientSettings) clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.f44932g = zacsVar;
        Set set = this.f44929d;
        if (set != null && !set.isEmpty()) {
            this.f44931f.zab();
        } else {
            this.f44927b.post(new K82(this));
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.f44931f;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
