package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzap;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbi;
import com.google.android.gms.maps.model.Polyline;

/* renamed from: com.google.android.gms.maps.v */
/* loaded from: classes3.dex */
public final class BinderC6687v extends zzbi {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnPolylineClickListener f48047a;

    public BinderC6687v(GoogleMap googleMap, GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.f48047a = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void zzb(zzap zzapVar) {
        this.f48047a.onPolylineClick(new Polyline(zzapVar));
    }
}
