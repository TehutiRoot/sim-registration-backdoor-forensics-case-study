package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: com.google.android.gms.maps.A */
/* loaded from: classes3.dex */
public final class BinderC6644A extends zzm {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraChangeListener f47836a;

    public BinderC6644A(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.f47836a = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(CameraPosition cameraPosition) {
        this.f47836a.onCameraChange(cameraPosition);
    }
}