package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzae;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzak;
import com.google.android.gms.maps.model.MapCapabilities;

/* renamed from: com.google.android.gms.maps.y */
/* loaded from: classes3.dex */
public final class BinderC6690y extends zzak {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapCapabilitiesChangedListener f48050a;

    public BinderC6690y(GoogleMap googleMap, GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        this.f48050a = onMapCapabilitiesChangedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void zzb(zzae zzaeVar) {
        this.f48050a.onMapCapabilitiesChanged(new MapCapabilities(zzaeVar));
    }
}
