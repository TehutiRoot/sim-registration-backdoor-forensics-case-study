package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzv;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.GroundOverlay;

/* renamed from: com.google.android.gms.maps.s */
/* loaded from: classes3.dex */
public final class BinderC6684s extends zzy {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnGroundOverlayClickListener f48044a;

    public BinderC6684s(GoogleMap googleMap, GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.f48044a = onGroundOverlayClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zzb(zzv zzvVar) {
        this.f48044a.onGroundOverlayClick(new GroundOverlay(zzvVar));
    }
}
