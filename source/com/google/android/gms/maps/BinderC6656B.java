package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzu;

/* renamed from: com.google.android.gms.maps.B */
/* loaded from: classes3.dex */
public final class BinderC6656B extends zzu {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraMoveStartedListener f47825a;

    public BinderC6656B(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.f47825a = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i) {
        this.f47825a.onCameraMoveStarted(i);
    }
}
