package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FeatureClickEvent {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzm f47917a;

    public FeatureClickEvent(com.google.android.gms.internal.maps.zzm zzmVar) {
        this.f47917a = (com.google.android.gms.internal.maps.zzm) Preconditions.checkNotNull(zzmVar);
    }

    @NonNull
    public List<Feature> getFeatures() {
        try {
            List<IBinder> zze = this.f47917a.zze();
            ArrayList arrayList = new ArrayList(zze.size());
            for (IBinder iBinder : zze) {
                Feature m46395a = Feature.m46395a(com.google.android.gms.internal.maps.zzo.zzb(iBinder));
                if (m46395a != null) {
                    arrayList.add(m46395a);
                }
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public LatLng getLatLng() {
        try {
            return this.f47917a.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
