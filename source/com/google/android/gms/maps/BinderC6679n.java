package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzay;

/* renamed from: com.google.android.gms.maps.n */
/* loaded from: classes3.dex */
public final class BinderC6679n extends zzay {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener f48039a;

    public BinderC6679n(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.f48039a = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final boolean zzb() {
        return this.f48039a.onMyLocationButtonClick();
    }
}
