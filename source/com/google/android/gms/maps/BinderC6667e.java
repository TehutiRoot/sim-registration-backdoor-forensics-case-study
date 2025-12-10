package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* renamed from: com.google.android.gms.maps.e */
/* loaded from: classes3.dex */
public final class BinderC6667e extends zzbk {

    /* renamed from: a */
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener f47883a;

    public BinderC6667e(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.f47883a = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void zzb(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f47883a.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
