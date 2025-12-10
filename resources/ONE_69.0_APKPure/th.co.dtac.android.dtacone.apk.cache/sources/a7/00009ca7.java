package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzam;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.F */
/* loaded from: classes3.dex */
public final class BinderC6649F extends zzam {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapClickListener f47843a;

    public BinderC6649F(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
        this.f47843a = onMapClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb(LatLng latLng) {
        this.f47843a.onMapClick(latLng);
    }
}