package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbc;

/* renamed from: com.google.android.gms.maps.o */
/* loaded from: classes3.dex */
public final class BinderC6680o extends zzbc {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMyLocationClickListener f48040a;

    public BinderC6680o(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.f48040a = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(Location location) {
        this.f48040a.onMyLocationClick(location);
    }
}
