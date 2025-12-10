package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.b */
/* loaded from: classes3.dex */
public final class BinderC6653b extends com.google.android.gms.maps.internal.zzaq {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapLongClickListener f47892a;

    public BinderC6653b(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.f47892a = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final void zzb(LatLng latLng) {
        this.f47892a.onMapLongClick(latLng);
    }
}