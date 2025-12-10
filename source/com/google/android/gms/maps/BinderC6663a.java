package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzau;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.a */
/* loaded from: classes3.dex */
public final class BinderC6663a extends zzau {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMarkerClickListener f47879a;

    public BinderC6663a(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.f47879a = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean zzb(zzah zzahVar) {
        return this.f47879a.onMarkerClick(new Marker(zzahVar));
    }
}
