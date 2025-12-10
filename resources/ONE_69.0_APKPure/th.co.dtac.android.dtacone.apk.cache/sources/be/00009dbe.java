package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbe;
import com.google.android.gms.maps.model.PointOfInterest;

/* renamed from: com.google.android.gms.maps.x */
/* loaded from: classes3.dex */
public final class BinderC6678x extends zzbe {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnPoiClickListener f48061a;

    public BinderC6678x(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.f48061a = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zzb(PointOfInterest pointOfInterest) {
        this.f48061a.onPoiClick(pointOfInterest);
    }
}