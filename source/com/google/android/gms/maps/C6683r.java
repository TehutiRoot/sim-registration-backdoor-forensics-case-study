package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.internal.zzaj;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.r */
/* loaded from: classes3.dex */
public final class C6683r implements LocationSource.OnLocationChangedListener {

    /* renamed from: a */
    public final /* synthetic */ zzaj f48043a;

    public C6683r(BinderC6691z binderC6691z, zzaj zzajVar) {
        this.f48043a = zzajVar;
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.f48043a.zzd(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
