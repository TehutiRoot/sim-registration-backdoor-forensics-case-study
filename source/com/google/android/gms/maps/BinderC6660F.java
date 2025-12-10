package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzam;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.F */
/* loaded from: classes3.dex */
public final class BinderC6660F extends zzam {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapClickListener f47831a;

    public BinderC6660F(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.f47831a = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb(LatLng latLng) {
        this.f47831a.onMapClick(latLng);
    }
}
