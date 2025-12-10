package com.google.android.gms.maps;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzh;
import com.google.android.gms.maps.model.Marker;

/* renamed from: com.google.android.gms.maps.l */
/* loaded from: classes3.dex */
public final class BinderC6663l extends zzh {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.InfoWindowAdapter f47905a;

    public BinderC6663l(GoogleMap googleMap, GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        this.f47905a = infoWindowAdapter;
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final IObjectWrapper zzb(zzah zzahVar) {
        return ObjectWrapper.wrap(this.f47905a.getInfoContents(new Marker(zzahVar)));
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final IObjectWrapper zzc(zzah zzahVar) {
        return ObjectWrapper.wrap(this.f47905a.getInfoWindow(new Marker(zzahVar)));
    }
}