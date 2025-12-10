package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbi;
import com.google.android.gms.maps.model.Polyline;

/* renamed from: com.google.android.gms.maps.v */
/* loaded from: classes3.dex */
public final class BinderC6676v extends zzbi {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnPolylineClickListener f48059a;

    public BinderC6676v(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.f48059a = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void zzb(zzap zzapVar) {
        this.f48059a.onPolylineClick(new Polyline(zzapVar));
    }
}