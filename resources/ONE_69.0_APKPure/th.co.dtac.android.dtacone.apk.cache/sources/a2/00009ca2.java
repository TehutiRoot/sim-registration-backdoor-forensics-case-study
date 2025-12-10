package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzs;

/* renamed from: com.google.android.gms.maps.C */
/* loaded from: classes3.dex */
public final class BinderC6646C extends zzs {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraMoveListener f47838a;

    public BinderC6646C(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.f47838a = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void zzb() {
        this.f47838a.onCameraMove();
    }
}