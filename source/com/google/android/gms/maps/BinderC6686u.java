package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polygon;

/* renamed from: com.google.android.gms.maps.u */
/* loaded from: classes3.dex */
public final class BinderC6686u extends zzbg {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnPolygonClickListener f48046a;

    public BinderC6686u(GoogleMap googleMap, GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.f48046a = onPolygonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public final void zzb(zzam zzamVar) {
        this.f48046a.onPolygonClick(new Polygon(zzamVar));
    }
}
