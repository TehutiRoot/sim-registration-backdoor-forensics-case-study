package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzba;

/* renamed from: com.google.android.gms.maps.m */
/* loaded from: classes3.dex */
public final class BinderC6664m extends zzba {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMyLocationChangeListener f47906a;

    public BinderC6664m(GoogleMap googleMap, GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.f47906a = onMyLocationChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zzb(IObjectWrapper iObjectWrapper) {
        this.f47906a.onMyLocationChange((Location) ObjectWrapper.unwrap(iObjectWrapper));
    }
}