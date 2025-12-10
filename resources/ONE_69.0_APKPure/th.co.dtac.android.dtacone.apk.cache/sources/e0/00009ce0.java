package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* renamed from: com.google.android.gms.maps.d */
/* loaded from: classes3.dex */
public final class BinderC6655d extends zzbm {

    /* renamed from: a */
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener f47894a;

    public BinderC6655d(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.f47894a = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void zzb(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.f47894a.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}