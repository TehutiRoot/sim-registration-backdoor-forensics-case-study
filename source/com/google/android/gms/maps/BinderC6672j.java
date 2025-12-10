package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzag;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.j */
/* loaded from: classes3.dex */
public final class BinderC6672j extends zzag {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener f47891a;

    public BinderC6672j(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.f47891a = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zzb(zzah zzahVar) {
        this.f47891a.onInfoWindowLongClick(new Marker(zzahVar));
    }
}
