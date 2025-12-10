package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class Feature {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzp f47916a;

    public Feature(com.google.android.gms.internal.maps.zzp zzpVar) {
        this.f47916a = zzpVar;
    }

    /* renamed from: a */
    public static Feature m46395a(com.google.android.gms.internal.maps.zzp zzpVar) {
        Preconditions.checkNotNull(zzpVar);
        try {
            int zzd = zzpVar.zzd();
            if (zzd == 1) {
                return new PlaceFeature(zzpVar);
            }
            if (zzd == 2) {
                return new DatasetFeature(zzpVar);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        try {
            return this.f47916a.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
