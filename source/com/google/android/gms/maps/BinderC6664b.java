package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.b */
/* loaded from: classes3.dex */
public final class BinderC6664b extends com.google.android.gms.maps.internal.zzaq {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapLongClickListener f47880a;

    public BinderC6664b(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.f47880a = onMapLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final void zzb(LatLng latLng) {
        this.f47880a.onMapLongClick(latLng);
    }
}
