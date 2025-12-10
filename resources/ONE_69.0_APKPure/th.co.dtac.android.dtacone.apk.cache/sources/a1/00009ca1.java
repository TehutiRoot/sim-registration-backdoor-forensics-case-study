package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzu;

/* renamed from: com.google.android.gms.maps.B */
/* loaded from: classes3.dex */
public final class BinderC6645B extends zzu {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraMoveStartedListener f47837a;

    public BinderC6645B(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.f47837a = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i) {
        this.f47837a.onCameraMoveStarted(i);
    }
}