package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzao;

/* renamed from: com.google.android.gms.maps.p */
/* loaded from: classes3.dex */
public final class BinderC6681p extends zzao {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapLoadedCallback f48041a;

    public BinderC6681p(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f48041a = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zzb() {
        this.f48041a.onMapLoaded();
    }
}
