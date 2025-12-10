package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzae;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.MapCapabilities;

/* renamed from: com.google.android.gms.maps.y */
/* loaded from: classes3.dex */
public final class BinderC6679y extends zzak {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapCapabilitiesChangedListener f48062a;

    public BinderC6679y(GoogleMap googleMap, GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        this.f48062a = onMapCapabilitiesChangedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void zzb(zzae zzaeVar) {
        this.f48062a.onMapCapabilitiesChanged(new MapCapabilities(zzaeVar));
    }
}