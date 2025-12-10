package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class MapCapabilities {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzae f47953a;

    public MapCapabilities(com.google.android.gms.internal.maps.zzae zzaeVar) {
        this.f47953a = (com.google.android.gms.internal.maps.zzae) Preconditions.checkNotNull(zzaeVar);
    }

    public boolean isAdvancedMarkersAvailable() {
        try {
            return this.f47953a.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isDataDrivenStylingAvailable() {
        try {
            return this.f47953a.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
