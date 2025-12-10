package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.i */
/* loaded from: classes3.dex */
public final class BinderC6671i extends com.google.android.gms.maps.internal.zzac {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnInfoWindowClickListener f47887a;

    public BinderC6671i(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.f47887a = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzb(zzah zzahVar) {
        this.f47887a.onInfoWindowClick(new Marker(zzahVar));
    }
}
