package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzao;

/* renamed from: com.google.android.gms.maps.p */
/* loaded from: classes3.dex */
public final class BinderC6670p extends zzao {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMapLoadedCallback f48053a;

    public BinderC6670p(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f48053a = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zzb() {
        this.f48053a.onMapLoaded();
    }
}