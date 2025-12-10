package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzq;

/* renamed from: com.google.android.gms.maps.D */
/* loaded from: classes3.dex */
public final class BinderC6647D extends zzq {

    /* renamed from: a */
    public final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener f47841a;

    public BinderC6647D(GoogleMap googleMap, GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.f47841a = onCameraMoveCanceledListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void zzb() {
        this.f47841a.onCameraMoveCanceled();
    }
}