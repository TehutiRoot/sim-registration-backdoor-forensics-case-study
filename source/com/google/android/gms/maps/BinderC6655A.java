package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.A */
/* loaded from: classes3.dex */
public final class BinderC6655A extends zzm {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraChangeListener f47824a;

    public BinderC6655A(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.f47824a = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(CameraPosition cameraPosition) {
        this.f47824a.onCameraChange(cameraPosition);
    }
}
