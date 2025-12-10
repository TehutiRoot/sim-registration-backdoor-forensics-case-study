package com.google.android.gms.internal.wallet;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* loaded from: classes3.dex */
public final class zzaf implements WalletObjects {
    @Override // com.google.android.gms.wallet.wobs.WalletObjects
    @SuppressLint({"MissingRemoteException"})
    public final void createWalletObjects(GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        googleApiClient.enqueue(new C22126sb2(this, googleApiClient, createWalletObjectsRequest, i));
    }
}
