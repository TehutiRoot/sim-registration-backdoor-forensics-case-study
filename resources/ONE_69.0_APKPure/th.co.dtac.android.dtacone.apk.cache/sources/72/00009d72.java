package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class PlaceFeature extends Feature {

    /* renamed from: b */
    public final com.google.android.gms.internal.maps.zzp f47999b;

    public PlaceFeature(com.google.android.gms.internal.maps.zzp zzpVar) {
        super(zzpVar);
        this.f47999b = zzpVar;
    }

    @NonNull
    public String getPlaceId() {
        try {
            return this.f47999b.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}