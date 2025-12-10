package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbc;

/* renamed from: com.google.android.gms.maps.o */
/* loaded from: classes3.dex */
public final class BinderC6669o extends zzbc {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMyLocationClickListener f48052a;

    public BinderC6669o(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.f48052a = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(Location location) {
        this.f48052a.onMyLocationClick(location);
    }
}