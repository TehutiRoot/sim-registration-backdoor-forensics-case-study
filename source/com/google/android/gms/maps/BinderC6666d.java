package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* renamed from: com.google.android.gms.maps.d */
/* loaded from: classes3.dex */
public final class BinderC6666d extends zzbm {

    /* renamed from: a */
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener f47882a;

    public BinderC6666d(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.f47882a = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void zzb(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.f47882a.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
