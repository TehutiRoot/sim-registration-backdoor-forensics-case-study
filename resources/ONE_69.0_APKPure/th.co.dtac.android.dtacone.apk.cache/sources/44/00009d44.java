package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzae;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.k */
/* loaded from: classes3.dex */
public final class BinderC6662k extends zzae {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnInfoWindowCloseListener f47904a;

    public BinderC6662k(GoogleMap googleMap, GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.f47904a = onInfoWindowCloseListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzb(zzah zzahVar) {
        this.f47904a.onInfoWindowClose(new Marker(zzahVar));
    }
}