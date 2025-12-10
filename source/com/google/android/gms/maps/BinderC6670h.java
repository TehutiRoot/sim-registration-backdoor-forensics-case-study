package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzaw;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.h */
/* loaded from: classes3.dex */
public final class BinderC6670h extends zzaw {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMarkerDragListener f47886a;

    public BinderC6670h(GoogleMap googleMap, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.f47886a = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzb(zzah zzahVar) {
        this.f47886a.onMarkerDrag(new Marker(zzahVar));
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzc(zzah zzahVar) {
        this.f47886a.onMarkerDragEnd(new Marker(zzahVar));
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzd(zzah zzahVar) {
        this.f47886a.onMarkerDragStart(new Marker(zzahVar));
    }
}
