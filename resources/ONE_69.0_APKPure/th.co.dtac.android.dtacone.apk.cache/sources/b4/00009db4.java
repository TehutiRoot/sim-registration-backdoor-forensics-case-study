package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzay;

/* renamed from: com.google.android.gms.maps.n */
/* loaded from: classes3.dex */
public final class BinderC6668n extends zzay {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener f48051a;

    public BinderC6668n(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.f48051a = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final boolean zzb() {
        return this.f48051a.onMyLocationButtonClick();
    }
}