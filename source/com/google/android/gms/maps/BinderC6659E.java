package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzo;

/* renamed from: com.google.android.gms.maps.E */
/* loaded from: classes3.dex */
public final class BinderC6659E extends zzo {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraIdleListener f47830a;

    public BinderC6659E(GoogleMap googleMap, GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        this.f47830a = onCameraIdleListener;
    }

    @Override // com.google.android.gms.maps.internal.zzp
    public final void zzb() {
        this.f47830a.onCameraIdle();
    }
}
