package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: a */
    public final boolean f44954a;

    /* renamed from: b */
    public zau f44955b;
    public final Api zaa;

    public zat(Api api, boolean z) {
        this.zaa = api;
        this.f44954a = z;
    }

    /* renamed from: a */
    public final zau m48453a() {
        Preconditions.checkNotNull(this.f44955b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f44955b;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        m48453a().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        m48453a().zaa(connectionResult, this.zaa, this.f44954a);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        m48453a().onConnectionSuspended(i);
    }

    public final void zaa(zau zauVar) {
        this.f44955b = zauVar;
    }
}
