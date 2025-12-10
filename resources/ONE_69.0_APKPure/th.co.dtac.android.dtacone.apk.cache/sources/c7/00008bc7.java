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
    public final boolean f44966a;

    /* renamed from: b */
    public zau f44967b;
    public final Api zaa;

    public zat(Api api, boolean z) {
        this.zaa = api;
        this.f44966a = z;
    }

    /* renamed from: a */
    public final zau m48450a() {
        Preconditions.checkNotNull(this.f44967b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f44967b;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        m48450a().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        m48450a().zaa(connectionResult, this.zaa, this.f44966a);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        m48450a().onConnectionSuspended(i);
    }

    public final void zaa(zau zauVar) {
        this.f44967b = zauVar;
    }
}