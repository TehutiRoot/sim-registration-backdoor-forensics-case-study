package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbo;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* renamed from: com.google.android.gms.maps.f */
/* loaded from: classes3.dex */
public final class BinderC6657f extends zzbo {

    /* renamed from: a */
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaClickListener f47896a;

    public BinderC6657f(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.f47896a = onStreetViewPanoramaClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zzb(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.f47896a.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }
}